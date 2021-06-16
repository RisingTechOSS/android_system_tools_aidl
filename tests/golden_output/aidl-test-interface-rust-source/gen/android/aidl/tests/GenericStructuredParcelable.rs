#[derive(Debug)]
pub struct GenericStructuredParcelable {
  pub a: i32,
  pub b: i32,
}
pub(crate) mod mangled { pub use super::GenericStructuredParcelable as _7_android_4_aidl_5_tests_27_GenericStructuredParcelable; }
impl Default for GenericStructuredParcelable {
  fn default() -> Self {
    Self {
      a: 0,
      b: 0,
    }
  }
}
impl binder::parcel::Serialize for GenericStructuredParcelable {
  fn serialize(&self, parcel: &mut binder::parcel::Parcel) -> binder::Result<()> {
    <Self as binder::parcel::SerializeOption>::serialize_option(Some(self), parcel)
  }
}
impl binder::parcel::SerializeArray for GenericStructuredParcelable {}
impl binder::parcel::SerializeOption for GenericStructuredParcelable {
  fn serialize_option(this: Option<&Self>, parcel: &mut binder::parcel::Parcel) -> binder::Result<()> {
    let this = if let Some(this) = this {
      parcel.write(&1i32)?;
      this
    } else {
      return parcel.write(&0i32);
    };
    parcel.sized_write(|subparcel| {
      subparcel.write(&this.a)?;
      subparcel.write(&this.b)?;
      Ok(())
    })
  }
}
binder::impl_deserialize_for_parcelable!(GenericStructuredParcelable);
impl GenericStructuredParcelable {
  fn deserialize_parcelable(&mut self, parcel: &binder::parcel::Parcel) -> binder::Result<()> {
    let start_pos = parcel.get_data_position();
    let parcelable_size: i32 = parcel.read()?;
    if parcelable_size < 0 { return Err(binder::StatusCode::BAD_VALUE); }
    if start_pos.checked_add(parcelable_size).is_none() {
      return Err(binder::StatusCode::BAD_VALUE);
    }
    if (parcel.get_data_position() - start_pos) == parcelable_size {
      return Ok(());
    }
    self.a = parcel.read()?;
    if (parcel.get_data_position() - start_pos) == parcelable_size {
      return Ok(());
    }
    self.b = parcel.read()?;
    unsafe {
      parcel.set_data_position(start_pos + parcelable_size)?;
    }
    Ok(())
  }
}
