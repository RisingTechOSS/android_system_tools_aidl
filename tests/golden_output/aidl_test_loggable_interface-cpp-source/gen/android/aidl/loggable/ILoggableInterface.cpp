#include <android/aidl/loggable/ILoggableInterface.h>
#include <android/aidl/loggable/BpLoggableInterface.h>

namespace android {

namespace aidl {

namespace loggable {

DO_NOT_DIRECTLY_USE_ME_IMPLEMENT_META_INTERFACE(LoggableInterface, "android.aidl.loggable.ILoggableInterface")

}  // namespace loggable

}  // namespace aidl

}  // namespace android
#include <android/aidl/loggable/BpLoggableInterface.h>
#include <android/aidl/loggable/BnLoggableInterface.h>
#include <binder/Parcel.h>
#include <android-base/macros.h>
#include <chrono>
#include <functional>

namespace android {

namespace aidl {

namespace loggable {

BpLoggableInterface::BpLoggableInterface(const ::android::sp<::android::IBinder>& _aidl_impl)
    : BpInterface<ILoggableInterface>(_aidl_impl){
}

std::function<void(const BpLoggableInterface::TransactionLog&)> BpLoggableInterface::logFunc;

::android::binder::Status BpLoggableInterface::LogThis(bool boolValue, ::std::vector<bool>* boolArray, int8_t byteValue, ::std::vector<uint8_t>* byteArray, char16_t charValue, ::std::vector<char16_t>* charArray, int32_t intValue, ::std::vector<int32_t>* intArray, int64_t longValue, ::std::vector<int64_t>* longArray, float floatValue, ::std::vector<float>* floatArray, double doubleValue, ::std::vector<double>* doubleArray, const ::android::String16& stringValue, ::std::vector<::android::String16>* stringArray, ::std::vector<::android::String16>* listValue, const ::android::aidl::loggable::Data& dataValue, const ::android::sp<::android::IBinder>& binderValue, ::std::optional<::android::os::ParcelFileDescriptor>* pfdValue, ::std::vector<::android::os::ParcelFileDescriptor>* pfdArray, ::std::vector<::android::String16>* _aidl_return) {
  ::android::Parcel _aidl_data;
  ::android::Parcel _aidl_reply;
  ::android::status_t _aidl_ret_status = ::android::OK;
  ::android::binder::Status _aidl_status;
  ::android::ScopedTrace _aidl_trace(ATRACE_TAG_AIDL, "AIDL::cpp::ILoggableInterface::LogThis::cppClient");
  BpLoggableInterface::TransactionLog _transaction_log;
  if (BpLoggableInterface::logFunc != nullptr) {
    _transaction_log.input_args.emplace_back("boolValue", (boolValue?"true":"false"));
    _transaction_log.input_args.emplace_back("boolArray", [&](){ std::ostringstream o; o << "["; bool first = true; for (const auto& v: *boolArray) { (void)v; if (first) first = false; else o << ", "; o << (v?"true":"false"); }; o << "]"; return o.str(); }());
    _transaction_log.input_args.emplace_back("byteValue", std::to_string(byteValue));
    _transaction_log.input_args.emplace_back("byteArray", [&](){ std::ostringstream o; o << "["; bool first = true; for (const auto& v: *byteArray) { (void)v; if (first) first = false; else o << ", "; o << std::to_string(v); }; o << "]"; return o.str(); }());
    _transaction_log.input_args.emplace_back("charValue", std::wstring_convert<std::codecvt_utf8_utf16<char16_t>, char16_t>().to_bytes(charValue));
    _transaction_log.input_args.emplace_back("charArray", [&](){ std::ostringstream o; o << "["; bool first = true; for (const auto& v: *charArray) { (void)v; if (first) first = false; else o << ", "; o << std::wstring_convert<std::codecvt_utf8_utf16<char16_t>, char16_t>().to_bytes(v); }; o << "]"; return o.str(); }());
    _transaction_log.input_args.emplace_back("intValue", std::to_string(intValue));
    _transaction_log.input_args.emplace_back("intArray", [&](){ std::ostringstream o; o << "["; bool first = true; for (const auto& v: *intArray) { (void)v; if (first) first = false; else o << ", "; o << std::to_string(v); }; o << "]"; return o.str(); }());
    _transaction_log.input_args.emplace_back("longValue", std::to_string(longValue));
    _transaction_log.input_args.emplace_back("longArray", [&](){ std::ostringstream o; o << "["; bool first = true; for (const auto& v: *longArray) { (void)v; if (first) first = false; else o << ", "; o << std::to_string(v); }; o << "]"; return o.str(); }());
    _transaction_log.input_args.emplace_back("floatValue", std::to_string(floatValue));
    _transaction_log.input_args.emplace_back("floatArray", [&](){ std::ostringstream o; o << "["; bool first = true; for (const auto& v: *floatArray) { (void)v; if (first) first = false; else o << ", "; o << std::to_string(v); }; o << "]"; return o.str(); }());
    _transaction_log.input_args.emplace_back("doubleValue", std::to_string(doubleValue));
    _transaction_log.input_args.emplace_back("doubleArray", [&](){ std::ostringstream o; o << "["; bool first = true; for (const auto& v: *doubleArray) { (void)v; if (first) first = false; else o << ", "; o << std::to_string(v); }; o << "]"; return o.str(); }());
    _transaction_log.input_args.emplace_back("stringValue", (std::ostringstream() << stringValue).str());
    _transaction_log.input_args.emplace_back("stringArray", [&](){ std::ostringstream o; o << "["; bool first = true; for (const auto& v: *stringArray) { (void)v; if (first) first = false; else o << ", "; o << (std::ostringstream() << v).str(); }; o << "]"; return o.str(); }());
    _transaction_log.input_args.emplace_back("listValue", [&](){ std::ostringstream o; o << "["; bool first = true; for (const auto& v: *listValue) { (void)v; if (first) first = false; else o << ", "; o << (std::ostringstream() << v).str(); }; o << "]"; return o.str(); }());
    _transaction_log.input_args.emplace_back("dataValue", _call_toString(dataValue));
    _transaction_log.input_args.emplace_back("binderValue", "");
    _transaction_log.input_args.emplace_back("pfdValue", "");
    _transaction_log.input_args.emplace_back("pfdArray", "");
  }
  auto _log_start = std::chrono::steady_clock::now();
  _aidl_ret_status = _aidl_data.writeInterfaceToken(getInterfaceDescriptor());
  if (((_aidl_ret_status) != (::android::OK))) {
    goto _aidl_error;
  }
  _aidl_ret_status = _aidl_data.writeBool(boolValue);
  if (((_aidl_ret_status) != (::android::OK))) {
    goto _aidl_error;
  }
  _aidl_ret_status = _aidl_data.writeBoolVector(*boolArray);
  if (((_aidl_ret_status) != (::android::OK))) {
    goto _aidl_error;
  }
  _aidl_ret_status = _aidl_data.writeByte(byteValue);
  if (((_aidl_ret_status) != (::android::OK))) {
    goto _aidl_error;
  }
  _aidl_ret_status = _aidl_data.writeByteVector(*byteArray);
  if (((_aidl_ret_status) != (::android::OK))) {
    goto _aidl_error;
  }
  _aidl_ret_status = _aidl_data.writeChar(charValue);
  if (((_aidl_ret_status) != (::android::OK))) {
    goto _aidl_error;
  }
  _aidl_ret_status = _aidl_data.writeCharVector(*charArray);
  if (((_aidl_ret_status) != (::android::OK))) {
    goto _aidl_error;
  }
  _aidl_ret_status = _aidl_data.writeInt32(intValue);
  if (((_aidl_ret_status) != (::android::OK))) {
    goto _aidl_error;
  }
  _aidl_ret_status = _aidl_data.writeInt32Vector(*intArray);
  if (((_aidl_ret_status) != (::android::OK))) {
    goto _aidl_error;
  }
  _aidl_ret_status = _aidl_data.writeInt64(longValue);
  if (((_aidl_ret_status) != (::android::OK))) {
    goto _aidl_error;
  }
  _aidl_ret_status = _aidl_data.writeInt64Vector(*longArray);
  if (((_aidl_ret_status) != (::android::OK))) {
    goto _aidl_error;
  }
  _aidl_ret_status = _aidl_data.writeFloat(floatValue);
  if (((_aidl_ret_status) != (::android::OK))) {
    goto _aidl_error;
  }
  _aidl_ret_status = _aidl_data.writeFloatVector(*floatArray);
  if (((_aidl_ret_status) != (::android::OK))) {
    goto _aidl_error;
  }
  _aidl_ret_status = _aidl_data.writeDouble(doubleValue);
  if (((_aidl_ret_status) != (::android::OK))) {
    goto _aidl_error;
  }
  _aidl_ret_status = _aidl_data.writeDoubleVector(*doubleArray);
  if (((_aidl_ret_status) != (::android::OK))) {
    goto _aidl_error;
  }
  _aidl_ret_status = _aidl_data.writeString16(stringValue);
  if (((_aidl_ret_status) != (::android::OK))) {
    goto _aidl_error;
  }
  _aidl_ret_status = _aidl_data.writeString16Vector(*stringArray);
  if (((_aidl_ret_status) != (::android::OK))) {
    goto _aidl_error;
  }
  _aidl_ret_status = _aidl_data.writeString16Vector(*listValue);
  if (((_aidl_ret_status) != (::android::OK))) {
    goto _aidl_error;
  }
  _aidl_ret_status = _aidl_data.writeParcelable(dataValue);
  if (((_aidl_ret_status) != (::android::OK))) {
    goto _aidl_error;
  }
  _aidl_ret_status = _aidl_data.writeStrongBinder(binderValue);
  if (((_aidl_ret_status) != (::android::OK))) {
    goto _aidl_error;
  }
  _aidl_ret_status = _aidl_data.writeNullableParcelable(*pfdValue);
  if (((_aidl_ret_status) != (::android::OK))) {
    goto _aidl_error;
  }
  _aidl_ret_status = _aidl_data.writeParcelableVector(*pfdArray);
  if (((_aidl_ret_status) != (::android::OK))) {
    goto _aidl_error;
  }
  _aidl_ret_status = remote()->transact(BnLoggableInterface::TRANSACTION_LogThis, _aidl_data, &_aidl_reply, 0);
  if (UNLIKELY(_aidl_ret_status == ::android::UNKNOWN_TRANSACTION && ILoggableInterface::getDefaultImpl())) {
     return ILoggableInterface::getDefaultImpl()->LogThis(boolValue, boolArray, byteValue, byteArray, charValue, charArray, intValue, intArray, longValue, longArray, floatValue, floatArray, doubleValue, doubleArray, stringValue, stringArray, listValue, dataValue, binderValue, pfdValue, pfdArray, _aidl_return);
  }
  if (((_aidl_ret_status) != (::android::OK))) {
    goto _aidl_error;
  }
  _aidl_ret_status = _aidl_status.readFromParcel(_aidl_reply);
  if (((_aidl_ret_status) != (::android::OK))) {
    goto _aidl_error;
  }
  if (!_aidl_status.isOk()) {
    return _aidl_status;
  }
  _aidl_ret_status = _aidl_reply.readString16Vector(_aidl_return);
  if (((_aidl_ret_status) != (::android::OK))) {
    goto _aidl_error;
  }
  _aidl_ret_status = _aidl_reply.readBoolVector(boolArray);
  if (((_aidl_ret_status) != (::android::OK))) {
    goto _aidl_error;
  }
  _aidl_ret_status = _aidl_reply.readByteVector(byteArray);
  if (((_aidl_ret_status) != (::android::OK))) {
    goto _aidl_error;
  }
  _aidl_ret_status = _aidl_reply.readCharVector(charArray);
  if (((_aidl_ret_status) != (::android::OK))) {
    goto _aidl_error;
  }
  _aidl_ret_status = _aidl_reply.readInt32Vector(intArray);
  if (((_aidl_ret_status) != (::android::OK))) {
    goto _aidl_error;
  }
  _aidl_ret_status = _aidl_reply.readInt64Vector(longArray);
  if (((_aidl_ret_status) != (::android::OK))) {
    goto _aidl_error;
  }
  _aidl_ret_status = _aidl_reply.readFloatVector(floatArray);
  if (((_aidl_ret_status) != (::android::OK))) {
    goto _aidl_error;
  }
  _aidl_ret_status = _aidl_reply.readDoubleVector(doubleArray);
  if (((_aidl_ret_status) != (::android::OK))) {
    goto _aidl_error;
  }
  _aidl_ret_status = _aidl_reply.readString16Vector(stringArray);
  if (((_aidl_ret_status) != (::android::OK))) {
    goto _aidl_error;
  }
  _aidl_ret_status = _aidl_reply.readString16Vector(listValue);
  if (((_aidl_ret_status) != (::android::OK))) {
    goto _aidl_error;
  }
  _aidl_ret_status = _aidl_reply.readParcelable(pfdValue);
  if (((_aidl_ret_status) != (::android::OK))) {
    goto _aidl_error;
  }
  _aidl_ret_status = _aidl_reply.readParcelableVector(pfdArray);
  if (((_aidl_ret_status) != (::android::OK))) {
    goto _aidl_error;
  }
  _aidl_error:
  _aidl_status.setFromStatusT(_aidl_ret_status);
  if (BpLoggableInterface::logFunc != nullptr) {
    auto _log_end = std::chrono::steady_clock::now();
    _transaction_log.duration_ms = std::chrono::duration<double, std::milli>(_log_end - _log_start).count();
    _transaction_log.interface_name = "android.aidl.loggable.ILoggableInterface";
    _transaction_log.method_name = "LogThis";
    _transaction_log.stub_address = nullptr;
    _transaction_log.proxy_address = static_cast<const void*>(this);
    _transaction_log.exception_code = _aidl_status.exceptionCode();
    _transaction_log.exception_message = _aidl_status.exceptionMessage();
    _transaction_log.transaction_error = _aidl_status.transactionError();
    _transaction_log.service_specific_error_code = _aidl_status.serviceSpecificErrorCode();
    _transaction_log.output_args.emplace_back("boolArray", [&](){ std::ostringstream o; o << "["; bool first = true; for (const auto& v: *boolArray) { (void)v; if (first) first = false; else o << ", "; o << (v?"true":"false"); }; o << "]"; return o.str(); }());
    _transaction_log.output_args.emplace_back("byteArray", [&](){ std::ostringstream o; o << "["; bool first = true; for (const auto& v: *byteArray) { (void)v; if (first) first = false; else o << ", "; o << std::to_string(v); }; o << "]"; return o.str(); }());
    _transaction_log.output_args.emplace_back("charArray", [&](){ std::ostringstream o; o << "["; bool first = true; for (const auto& v: *charArray) { (void)v; if (first) first = false; else o << ", "; o << std::wstring_convert<std::codecvt_utf8_utf16<char16_t>, char16_t>().to_bytes(v); }; o << "]"; return o.str(); }());
    _transaction_log.output_args.emplace_back("intArray", [&](){ std::ostringstream o; o << "["; bool first = true; for (const auto& v: *intArray) { (void)v; if (first) first = false; else o << ", "; o << std::to_string(v); }; o << "]"; return o.str(); }());
    _transaction_log.output_args.emplace_back("longArray", [&](){ std::ostringstream o; o << "["; bool first = true; for (const auto& v: *longArray) { (void)v; if (first) first = false; else o << ", "; o << std::to_string(v); }; o << "]"; return o.str(); }());
    _transaction_log.output_args.emplace_back("floatArray", [&](){ std::ostringstream o; o << "["; bool first = true; for (const auto& v: *floatArray) { (void)v; if (first) first = false; else o << ", "; o << std::to_string(v); }; o << "]"; return o.str(); }());
    _transaction_log.output_args.emplace_back("doubleArray", [&](){ std::ostringstream o; o << "["; bool first = true; for (const auto& v: *doubleArray) { (void)v; if (first) first = false; else o << ", "; o << std::to_string(v); }; o << "]"; return o.str(); }());
    _transaction_log.output_args.emplace_back("stringArray", [&](){ std::ostringstream o; o << "["; bool first = true; for (const auto& v: *stringArray) { (void)v; if (first) first = false; else o << ", "; o << (std::ostringstream() << v).str(); }; o << "]"; return o.str(); }());
    _transaction_log.output_args.emplace_back("listValue", [&](){ std::ostringstream o; o << "["; bool first = true; for (const auto& v: *listValue) { (void)v; if (first) first = false; else o << ", "; o << (std::ostringstream() << v).str(); }; o << "]"; return o.str(); }());
    _transaction_log.output_args.emplace_back("pfdValue", "");
    _transaction_log.output_args.emplace_back("pfdArray", "");
    _transaction_log.result = [&](){ std::ostringstream o; o << "["; bool first = true; for (const auto& v: *_aidl_return) { (void)v; if (first) first = false; else o << ", "; o << (std::ostringstream() << v).str(); }; o << "]"; return o.str(); }();
    BpLoggableInterface::logFunc(_transaction_log);
  }
  return _aidl_status;
}

}  // namespace loggable

}  // namespace aidl

}  // namespace android
#include <android/aidl/loggable/BnLoggableInterface.h>
#include <binder/Parcel.h>
#include <binder/Stability.h>
#include <chrono>
#include <functional>

namespace android {

namespace aidl {

namespace loggable {

BnLoggableInterface::BnLoggableInterface()
{
  ::android::internal::Stability::markCompilationUnit(this);
}

::android::status_t BnLoggableInterface::onTransact(uint32_t _aidl_code, const ::android::Parcel& _aidl_data, ::android::Parcel* _aidl_reply, uint32_t _aidl_flags) {
  ::android::status_t _aidl_ret_status = ::android::OK;
  switch (_aidl_code) {
  case BnLoggableInterface::TRANSACTION_LogThis:
  {
    bool in_boolValue;
    ::std::vector<bool> in_boolArray;
    int8_t in_byteValue;
    ::std::vector<uint8_t> in_byteArray;
    char16_t in_charValue;
    ::std::vector<char16_t> in_charArray;
    int32_t in_intValue;
    ::std::vector<int32_t> in_intArray;
    int64_t in_longValue;
    ::std::vector<int64_t> in_longArray;
    float in_floatValue;
    ::std::vector<float> in_floatArray;
    double in_doubleValue;
    ::std::vector<double> in_doubleArray;
    ::android::String16 in_stringValue;
    ::std::vector<::android::String16> in_stringArray;
    ::std::vector<::android::String16> in_listValue;
    ::android::aidl::loggable::Data in_dataValue;
    ::android::sp<::android::IBinder> in_binderValue;
    ::std::optional<::android::os::ParcelFileDescriptor> in_pfdValue;
    ::std::vector<::android::os::ParcelFileDescriptor> in_pfdArray;
    ::std::vector<::android::String16> _aidl_return;
    if (!(_aidl_data.checkInterface(this))) {
      _aidl_ret_status = ::android::BAD_TYPE;
      break;
    }
    ::android::ScopedTrace _aidl_trace(ATRACE_TAG_AIDL, "AIDL::cpp::ILoggableInterface::LogThis::cppServer");
    _aidl_ret_status = _aidl_data.readBool(&in_boolValue);
    if (((_aidl_ret_status) != (::android::OK))) {
      break;
    }
    _aidl_ret_status = _aidl_data.readBoolVector(&in_boolArray);
    if (((_aidl_ret_status) != (::android::OK))) {
      break;
    }
    _aidl_ret_status = _aidl_data.readByte(&in_byteValue);
    if (((_aidl_ret_status) != (::android::OK))) {
      break;
    }
    _aidl_ret_status = _aidl_data.readByteVector(&in_byteArray);
    if (((_aidl_ret_status) != (::android::OK))) {
      break;
    }
    _aidl_ret_status = _aidl_data.readChar(&in_charValue);
    if (((_aidl_ret_status) != (::android::OK))) {
      break;
    }
    _aidl_ret_status = _aidl_data.readCharVector(&in_charArray);
    if (((_aidl_ret_status) != (::android::OK))) {
      break;
    }
    _aidl_ret_status = _aidl_data.readInt32(&in_intValue);
    if (((_aidl_ret_status) != (::android::OK))) {
      break;
    }
    _aidl_ret_status = _aidl_data.readInt32Vector(&in_intArray);
    if (((_aidl_ret_status) != (::android::OK))) {
      break;
    }
    _aidl_ret_status = _aidl_data.readInt64(&in_longValue);
    if (((_aidl_ret_status) != (::android::OK))) {
      break;
    }
    _aidl_ret_status = _aidl_data.readInt64Vector(&in_longArray);
    if (((_aidl_ret_status) != (::android::OK))) {
      break;
    }
    _aidl_ret_status = _aidl_data.readFloat(&in_floatValue);
    if (((_aidl_ret_status) != (::android::OK))) {
      break;
    }
    _aidl_ret_status = _aidl_data.readFloatVector(&in_floatArray);
    if (((_aidl_ret_status) != (::android::OK))) {
      break;
    }
    _aidl_ret_status = _aidl_data.readDouble(&in_doubleValue);
    if (((_aidl_ret_status) != (::android::OK))) {
      break;
    }
    _aidl_ret_status = _aidl_data.readDoubleVector(&in_doubleArray);
    if (((_aidl_ret_status) != (::android::OK))) {
      break;
    }
    _aidl_ret_status = _aidl_data.readString16(&in_stringValue);
    if (((_aidl_ret_status) != (::android::OK))) {
      break;
    }
    _aidl_ret_status = _aidl_data.readString16Vector(&in_stringArray);
    if (((_aidl_ret_status) != (::android::OK))) {
      break;
    }
    _aidl_ret_status = _aidl_data.readString16Vector(&in_listValue);
    if (((_aidl_ret_status) != (::android::OK))) {
      break;
    }
    _aidl_ret_status = _aidl_data.readParcelable(&in_dataValue);
    if (((_aidl_ret_status) != (::android::OK))) {
      break;
    }
    _aidl_ret_status = _aidl_data.readNullableStrongBinder(&in_binderValue);
    if (((_aidl_ret_status) != (::android::OK))) {
      break;
    }
    _aidl_ret_status = _aidl_data.readParcelable(&in_pfdValue);
    if (((_aidl_ret_status) != (::android::OK))) {
      break;
    }
    _aidl_ret_status = _aidl_data.readParcelableVector(&in_pfdArray);
    if (((_aidl_ret_status) != (::android::OK))) {
      break;
    }
    BnLoggableInterface::TransactionLog _transaction_log;
    if (BnLoggableInterface::logFunc != nullptr) {
      _transaction_log.input_args.emplace_back("in_boolValue", (in_boolValue?"true":"false"));
      _transaction_log.input_args.emplace_back("in_boolArray", [&](){ std::ostringstream o; o << "["; bool first = true; for (const auto& v: in_boolArray) { (void)v; if (first) first = false; else o << ", "; o << (v?"true":"false"); }; o << "]"; return o.str(); }());
      _transaction_log.input_args.emplace_back("in_byteValue", std::to_string(in_byteValue));
      _transaction_log.input_args.emplace_back("in_byteArray", [&](){ std::ostringstream o; o << "["; bool first = true; for (const auto& v: in_byteArray) { (void)v; if (first) first = false; else o << ", "; o << std::to_string(v); }; o << "]"; return o.str(); }());
      _transaction_log.input_args.emplace_back("in_charValue", std::wstring_convert<std::codecvt_utf8_utf16<char16_t>, char16_t>().to_bytes(in_charValue));
      _transaction_log.input_args.emplace_back("in_charArray", [&](){ std::ostringstream o; o << "["; bool first = true; for (const auto& v: in_charArray) { (void)v; if (first) first = false; else o << ", "; o << std::wstring_convert<std::codecvt_utf8_utf16<char16_t>, char16_t>().to_bytes(v); }; o << "]"; return o.str(); }());
      _transaction_log.input_args.emplace_back("in_intValue", std::to_string(in_intValue));
      _transaction_log.input_args.emplace_back("in_intArray", [&](){ std::ostringstream o; o << "["; bool first = true; for (const auto& v: in_intArray) { (void)v; if (first) first = false; else o << ", "; o << std::to_string(v); }; o << "]"; return o.str(); }());
      _transaction_log.input_args.emplace_back("in_longValue", std::to_string(in_longValue));
      _transaction_log.input_args.emplace_back("in_longArray", [&](){ std::ostringstream o; o << "["; bool first = true; for (const auto& v: in_longArray) { (void)v; if (first) first = false; else o << ", "; o << std::to_string(v); }; o << "]"; return o.str(); }());
      _transaction_log.input_args.emplace_back("in_floatValue", std::to_string(in_floatValue));
      _transaction_log.input_args.emplace_back("in_floatArray", [&](){ std::ostringstream o; o << "["; bool first = true; for (const auto& v: in_floatArray) { (void)v; if (first) first = false; else o << ", "; o << std::to_string(v); }; o << "]"; return o.str(); }());
      _transaction_log.input_args.emplace_back("in_doubleValue", std::to_string(in_doubleValue));
      _transaction_log.input_args.emplace_back("in_doubleArray", [&](){ std::ostringstream o; o << "["; bool first = true; for (const auto& v: in_doubleArray) { (void)v; if (first) first = false; else o << ", "; o << std::to_string(v); }; o << "]"; return o.str(); }());
      _transaction_log.input_args.emplace_back("in_stringValue", (std::ostringstream() << in_stringValue).str());
      _transaction_log.input_args.emplace_back("in_stringArray", [&](){ std::ostringstream o; o << "["; bool first = true; for (const auto& v: in_stringArray) { (void)v; if (first) first = false; else o << ", "; o << (std::ostringstream() << v).str(); }; o << "]"; return o.str(); }());
      _transaction_log.input_args.emplace_back("in_listValue", [&](){ std::ostringstream o; o << "["; bool first = true; for (const auto& v: in_listValue) { (void)v; if (first) first = false; else o << ", "; o << (std::ostringstream() << v).str(); }; o << "]"; return o.str(); }());
      _transaction_log.input_args.emplace_back("in_dataValue", _call_toString(in_dataValue));
      _transaction_log.input_args.emplace_back("in_binderValue", "");
      _transaction_log.input_args.emplace_back("in_pfdValue", "");
      _transaction_log.input_args.emplace_back("in_pfdArray", "");
    }
    auto _log_start = std::chrono::steady_clock::now();
    ::android::binder::Status _aidl_status(LogThis(in_boolValue, &in_boolArray, in_byteValue, &in_byteArray, in_charValue, &in_charArray, in_intValue, &in_intArray, in_longValue, &in_longArray, in_floatValue, &in_floatArray, in_doubleValue, &in_doubleArray, in_stringValue, &in_stringArray, &in_listValue, in_dataValue, in_binderValue, &in_pfdValue, &in_pfdArray, &_aidl_return));
    if (BnLoggableInterface::logFunc != nullptr) {
      auto _log_end = std::chrono::steady_clock::now();
      _transaction_log.duration_ms = std::chrono::duration<double, std::milli>(_log_end - _log_start).count();
      _transaction_log.interface_name = "android.aidl.loggable.ILoggableInterface";
      _transaction_log.method_name = "LogThis";
      _transaction_log.stub_address = static_cast<const void*>(this);
      _transaction_log.proxy_address = nullptr;
      _transaction_log.exception_code = _aidl_status.exceptionCode();
      _transaction_log.exception_message = _aidl_status.exceptionMessage();
      _transaction_log.transaction_error = _aidl_status.transactionError();
      _transaction_log.service_specific_error_code = _aidl_status.serviceSpecificErrorCode();
      _transaction_log.output_args.emplace_back("in_boolArray", [&](){ std::ostringstream o; o << "["; bool first = true; for (const auto& v: in_boolArray) { (void)v; if (first) first = false; else o << ", "; o << (v?"true":"false"); }; o << "]"; return o.str(); }());
      _transaction_log.output_args.emplace_back("in_byteArray", [&](){ std::ostringstream o; o << "["; bool first = true; for (const auto& v: in_byteArray) { (void)v; if (first) first = false; else o << ", "; o << std::to_string(v); }; o << "]"; return o.str(); }());
      _transaction_log.output_args.emplace_back("in_charArray", [&](){ std::ostringstream o; o << "["; bool first = true; for (const auto& v: in_charArray) { (void)v; if (first) first = false; else o << ", "; o << std::wstring_convert<std::codecvt_utf8_utf16<char16_t>, char16_t>().to_bytes(v); }; o << "]"; return o.str(); }());
      _transaction_log.output_args.emplace_back("in_intArray", [&](){ std::ostringstream o; o << "["; bool first = true; for (const auto& v: in_intArray) { (void)v; if (first) first = false; else o << ", "; o << std::to_string(v); }; o << "]"; return o.str(); }());
      _transaction_log.output_args.emplace_back("in_longArray", [&](){ std::ostringstream o; o << "["; bool first = true; for (const auto& v: in_longArray) { (void)v; if (first) first = false; else o << ", "; o << std::to_string(v); }; o << "]"; return o.str(); }());
      _transaction_log.output_args.emplace_back("in_floatArray", [&](){ std::ostringstream o; o << "["; bool first = true; for (const auto& v: in_floatArray) { (void)v; if (first) first = false; else o << ", "; o << std::to_string(v); }; o << "]"; return o.str(); }());
      _transaction_log.output_args.emplace_back("in_doubleArray", [&](){ std::ostringstream o; o << "["; bool first = true; for (const auto& v: in_doubleArray) { (void)v; if (first) first = false; else o << ", "; o << std::to_string(v); }; o << "]"; return o.str(); }());
      _transaction_log.output_args.emplace_back("in_stringArray", [&](){ std::ostringstream o; o << "["; bool first = true; for (const auto& v: in_stringArray) { (void)v; if (first) first = false; else o << ", "; o << (std::ostringstream() << v).str(); }; o << "]"; return o.str(); }());
      _transaction_log.output_args.emplace_back("in_listValue", [&](){ std::ostringstream o; o << "["; bool first = true; for (const auto& v: in_listValue) { (void)v; if (first) first = false; else o << ", "; o << (std::ostringstream() << v).str(); }; o << "]"; return o.str(); }());
      _transaction_log.output_args.emplace_back("in_pfdValue", "");
      _transaction_log.output_args.emplace_back("in_pfdArray", "");
      _transaction_log.result = [&](){ std::ostringstream o; o << "["; bool first = true; for (const auto& v: _aidl_return) { (void)v; if (first) first = false; else o << ", "; o << (std::ostringstream() << v).str(); }; o << "]"; return o.str(); }();
      BnLoggableInterface::logFunc(_transaction_log);
    }
    _aidl_ret_status = _aidl_status.writeToParcel(_aidl_reply);
    if (((_aidl_ret_status) != (::android::OK))) {
      break;
    }
    if (!_aidl_status.isOk()) {
      break;
    }
    _aidl_ret_status = _aidl_reply->writeString16Vector(_aidl_return);
    if (((_aidl_ret_status) != (::android::OK))) {
      break;
    }
    _aidl_ret_status = _aidl_reply->writeBoolVector(in_boolArray);
    if (((_aidl_ret_status) != (::android::OK))) {
      break;
    }
    _aidl_ret_status = _aidl_reply->writeByteVector(in_byteArray);
    if (((_aidl_ret_status) != (::android::OK))) {
      break;
    }
    _aidl_ret_status = _aidl_reply->writeCharVector(in_charArray);
    if (((_aidl_ret_status) != (::android::OK))) {
      break;
    }
    _aidl_ret_status = _aidl_reply->writeInt32Vector(in_intArray);
    if (((_aidl_ret_status) != (::android::OK))) {
      break;
    }
    _aidl_ret_status = _aidl_reply->writeInt64Vector(in_longArray);
    if (((_aidl_ret_status) != (::android::OK))) {
      break;
    }
    _aidl_ret_status = _aidl_reply->writeFloatVector(in_floatArray);
    if (((_aidl_ret_status) != (::android::OK))) {
      break;
    }
    _aidl_ret_status = _aidl_reply->writeDoubleVector(in_doubleArray);
    if (((_aidl_ret_status) != (::android::OK))) {
      break;
    }
    _aidl_ret_status = _aidl_reply->writeString16Vector(in_stringArray);
    if (((_aidl_ret_status) != (::android::OK))) {
      break;
    }
    _aidl_ret_status = _aidl_reply->writeString16Vector(in_listValue);
    if (((_aidl_ret_status) != (::android::OK))) {
      break;
    }
    _aidl_ret_status = _aidl_reply->writeNullableParcelable(in_pfdValue);
    if (((_aidl_ret_status) != (::android::OK))) {
      break;
    }
    _aidl_ret_status = _aidl_reply->writeParcelableVector(in_pfdArray);
    if (((_aidl_ret_status) != (::android::OK))) {
      break;
    }
  }
  break;
  default:
  {
    _aidl_ret_status = ::android::BBinder::onTransact(_aidl_code, _aidl_data, _aidl_reply, _aidl_flags);
  }
  break;
  }
  if (_aidl_ret_status == ::android::UNEXPECTED_NULL) {
    _aidl_ret_status = ::android::binder::Status::fromExceptionCode(::android::binder::Status::EX_NULL_POINTER).writeToParcel(_aidl_reply);
  }
  return _aidl_ret_status;
}

std::function<void(const BnLoggableInterface::TransactionLog&)> BnLoggableInterface::logFunc;

}  // namespace loggable

}  // namespace aidl

}  // namespace android
