/*
 * Copyright (C) 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

#include <aidl/android/aidl/versioned/tests/BnFooInterface.h>
#include <aidl/android/aidl/versioned/tests/IFooInterface.h>
#include <android/binder_auto_utils.h>
#include <android/binder_manager.h>
#include <gmock/gmock.h>
#include <gtest/gtest.h>

using aidl::android::aidl::versioned::tests::BazUnion;
using aidl::android::aidl::versioned::tests::Foo;
using aidl::android::aidl::versioned::tests::IFooInterface;
using aidl::android::aidl::versioned::tests::IFooInterfaceDelegator;
using std::optional;
using std::pair;
using std::shared_ptr;
using std::string;
using std::vector;
using testing::Eq;

struct VersionedInterfaceTest : ::testing::Test {
  void SetUp() override {
    ndk::SpAIBinder binder = ndk::SpAIBinder(AServiceManager_getService(IFooInterface::descriptor));
    versioned = IFooInterface::fromBinder(binder);
    ASSERT_NE(nullptr, versioned);
  }
  shared_ptr<IFooInterface> versioned;
};

TEST_F(VersionedInterfaceTest, getInterfaceVersion) {
  int32_t version;
  auto status = versioned->getInterfaceVersion(&version);
  EXPECT_TRUE(status.isOk()) << status.getDescription();
  EXPECT_EQ(1, version);
}

TEST_F(VersionedInterfaceTest, getInterfaceHash) {
  string hash;
  auto status = versioned->getInterfaceHash(&hash);
  EXPECT_TRUE(status.isOk()) << status.getDescription();
  EXPECT_EQ("9e7be1859820c59d9d55dd133e71a3687b5d2e5b", hash);
}

TEST_F(VersionedInterfaceTest, arrayOfParcelableWithNewField) {
  vector<Foo> foos(42);
  int32_t length;
  auto status = versioned->returnsLengthOfFooArray(foos, &length);
  EXPECT_TRUE(status.isOk()) << status.getDescription();
  EXPECT_EQ(42, length);
}

TEST_F(VersionedInterfaceTest, readDataCorrectlyAfterParcelableWithNewField) {
  Foo inFoo, inoutFoo, outFoo;
  inoutFoo.intDefault42 = 0;
  outFoo.intDefault42 = 0;
  int32_t ret;
  auto status = versioned->ignoreParcelablesAndRepeatInt(inFoo, &inoutFoo, &outFoo, 43, &ret);
  EXPECT_TRUE(status.isOk()) << status.getDescription();
  EXPECT_EQ(43, ret);
  EXPECT_EQ(0, inoutFoo.intDefault42);
  EXPECT_EQ(0, outFoo.intDefault42);
}

TEST_F(VersionedInterfaceTest, newerDelegatorReturnsImplVersion) {
  auto delegator = ndk::SharedRefBase::make<IFooInterfaceDelegator>(versioned);
  int32_t version = 0;
  EXPECT_TRUE(delegator->getInterfaceVersion(&version).isOk());
  EXPECT_EQ(1, version);
}

TEST_F(VersionedInterfaceTest, newerDelegatorReturnsImplHash) {
  auto delegator = ndk::SharedRefBase::make<IFooInterfaceDelegator>(versioned);
  std::string hash;
  EXPECT_TRUE(delegator->getInterfaceHash(&hash).isOk());
  EXPECT_EQ("9e7be1859820c59d9d55dd133e71a3687b5d2e5b", hash);
}
