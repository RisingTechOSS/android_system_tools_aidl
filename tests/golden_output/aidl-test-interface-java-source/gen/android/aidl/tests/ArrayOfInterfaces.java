/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package android.aidl.tests;
public class ArrayOfInterfaces implements android.os.Parcelable
{
  public static final android.os.Parcelable.Creator<ArrayOfInterfaces> CREATOR = new android.os.Parcelable.Creator<ArrayOfInterfaces>() {
    @Override
    public ArrayOfInterfaces createFromParcel(android.os.Parcel _aidl_source) {
      ArrayOfInterfaces _aidl_out = new ArrayOfInterfaces();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public ArrayOfInterfaces[] newArray(int _aidl_size) {
      return new ArrayOfInterfaces[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    int _aidl_end_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.setDataPosition(_aidl_start_pos);
    _aidl_parcel.writeInt(_aidl_end_pos - _aidl_start_pos);
    _aidl_parcel.setDataPosition(_aidl_end_pos);
  }
  public final void readFromParcel(android.os.Parcel _aidl_parcel)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    int _aidl_parcelable_size = _aidl_parcel.readInt();
    try {
      if (_aidl_parcelable_size < 0) return;
    } finally {
      if (_aidl_start_pos > (Integer.MAX_VALUE - _aidl_parcelable_size)) {
        throw new android.os.BadParcelableException("Overflow in the size of parcelable");
      }
      _aidl_parcel.setDataPosition(_aidl_start_pos + _aidl_parcelable_size);
    }
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    return _mask;
  }
  public interface IEmptyInterface extends android.os.IInterface
  {
    /** Default implementation for IEmptyInterface. */
    public static class Default implements android.aidl.tests.ArrayOfInterfaces.IEmptyInterface
    {
      @Override
      public android.os.IBinder asBinder() {
        return null;
      }
    }
    /** Local-side IPC implementation stub class. */
    public static abstract class Stub extends android.os.Binder implements android.aidl.tests.ArrayOfInterfaces.IEmptyInterface
    {
      /** Construct the stub at attach it to the interface. */
      public Stub()
      {
        this.attachInterface(this, DESCRIPTOR);
      }
      /**
       * Cast an IBinder object into an android.aidl.tests.ArrayOfInterfaces.IEmptyInterface interface,
       * generating a proxy if needed.
       */
      public static android.aidl.tests.ArrayOfInterfaces.IEmptyInterface asInterface(android.os.IBinder obj)
      {
        if ((obj==null)) {
          return null;
        }
        android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
        if (((iin!=null)&&(iin instanceof android.aidl.tests.ArrayOfInterfaces.IEmptyInterface))) {
          return ((android.aidl.tests.ArrayOfInterfaces.IEmptyInterface)iin);
        }
        return new android.aidl.tests.ArrayOfInterfaces.IEmptyInterface.Stub.Proxy(obj);
      }
      @Override public android.os.IBinder asBinder()
      {
        return this;
      }
      @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
      {
        java.lang.String descriptor = DESCRIPTOR;
        switch (code)
        {
          case INTERFACE_TRANSACTION:
          {
            reply.writeString(descriptor);
            return true;
          }
        }
        switch (code)
        {
          default:
          {
            return super.onTransact(code, data, reply, flags);
          }
        }
      }
      private static class Proxy implements android.aidl.tests.ArrayOfInterfaces.IEmptyInterface
      {
        private android.os.IBinder mRemote;
        Proxy(android.os.IBinder remote)
        {
          mRemote = remote;
        }
        @Override public android.os.IBinder asBinder()
        {
          return mRemote;
        }
        public java.lang.String getInterfaceDescriptor()
        {
          return DESCRIPTOR;
        }
        public static android.aidl.tests.ArrayOfInterfaces.IEmptyInterface sDefaultImpl;
      }
      public static boolean setDefaultImpl(android.aidl.tests.ArrayOfInterfaces.IEmptyInterface impl) {
        // Only one user of this interface can use this function
        // at a time. This is a heuristic to detect if two different
        // users in the same process use this function.
        if (Stub.Proxy.sDefaultImpl != null) {
          throw new IllegalStateException("setDefaultImpl() called twice");
        }
        if (impl != null) {
          Stub.Proxy.sDefaultImpl = impl;
          return true;
        }
        return false;
      }
      public static android.aidl.tests.ArrayOfInterfaces.IEmptyInterface getDefaultImpl() {
        return Stub.Proxy.sDefaultImpl;
      }
    }
    public static final java.lang.String DESCRIPTOR = "android$aidl$tests$ArrayOfInterfaces$IEmptyInterface".replace('$', '.');
  }
  public interface IMyInterface extends android.os.IInterface
  {
    /** Default implementation for IMyInterface. */
    public static class Default implements android.aidl.tests.ArrayOfInterfaces.IMyInterface
    {
      @Override public android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[] methodWithInterfaces(android.aidl.tests.ArrayOfInterfaces.IEmptyInterface iface, android.aidl.tests.ArrayOfInterfaces.IEmptyInterface nullable_iface, android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[] iface_array_in, android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[] iface_array_out, android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[] iface_array_inout, android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[] nullable_iface_array_in, android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[] nullable_iface_array_out, android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[] nullable_iface_array_inout) throws android.os.RemoteException
      {
        return null;
      }
      @Override
      public android.os.IBinder asBinder() {
        return null;
      }
    }
    /** Local-side IPC implementation stub class. */
    public static abstract class Stub extends android.os.Binder implements android.aidl.tests.ArrayOfInterfaces.IMyInterface
    {
      /** Construct the stub at attach it to the interface. */
      public Stub()
      {
        this.attachInterface(this, DESCRIPTOR);
      }
      /**
       * Cast an IBinder object into an android.aidl.tests.ArrayOfInterfaces.IMyInterface interface,
       * generating a proxy if needed.
       */
      public static android.aidl.tests.ArrayOfInterfaces.IMyInterface asInterface(android.os.IBinder obj)
      {
        if ((obj==null)) {
          return null;
        }
        android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
        if (((iin!=null)&&(iin instanceof android.aidl.tests.ArrayOfInterfaces.IMyInterface))) {
          return ((android.aidl.tests.ArrayOfInterfaces.IMyInterface)iin);
        }
        return new android.aidl.tests.ArrayOfInterfaces.IMyInterface.Stub.Proxy(obj);
      }
      @Override public android.os.IBinder asBinder()
      {
        return this;
      }
      @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
      {
        java.lang.String descriptor = DESCRIPTOR;
        if (code >= android.os.IBinder.FIRST_CALL_TRANSACTION && code <= android.os.IBinder.LAST_CALL_TRANSACTION) {
          data.enforceInterface(descriptor);
        }
        switch (code)
        {
          case INTERFACE_TRANSACTION:
          {
            reply.writeString(descriptor);
            return true;
          }
        }
        switch (code)
        {
          case TRANSACTION_methodWithInterfaces:
          {
            android.aidl.tests.ArrayOfInterfaces.IEmptyInterface _arg0;
            _arg0 = android.aidl.tests.ArrayOfInterfaces.IEmptyInterface.Stub.asInterface(data.readStrongBinder());
            android.aidl.tests.ArrayOfInterfaces.IEmptyInterface _arg1;
            _arg1 = android.aidl.tests.ArrayOfInterfaces.IEmptyInterface.Stub.asInterface(data.readStrongBinder());
            android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[] _arg2;
            {
              android.os.IBinder[] _binder_arr = data.createBinderArray();
              if (_binder_arr != null) {
                _arg2 = new android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[_binder_arr.length];
                for (int i = 0; i < _binder_arr.length; i++) {
                  _arg2[i] = android.aidl.tests.ArrayOfInterfaces.IEmptyInterface.Stub.asInterface(_binder_arr[i]);
                }
              } else {
                _arg2 = null;
              }
            }
            android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[] _arg3;
            int _arg3_length = data.readInt();
            if ((_arg3_length<0)) {
              _arg3 = null;
            }
            else {
              _arg3 = new android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[_arg3_length];
            }
            android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[] _arg4;
            {
              android.os.IBinder[] _binder_arr = data.createBinderArray();
              if (_binder_arr != null) {
                _arg4 = new android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[_binder_arr.length];
                for (int i = 0; i < _binder_arr.length; i++) {
                  _arg4[i] = android.aidl.tests.ArrayOfInterfaces.IEmptyInterface.Stub.asInterface(_binder_arr[i]);
                }
              } else {
                _arg4 = null;
              }
            }
            android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[] _arg5;
            {
              android.os.IBinder[] _binder_arr = data.createBinderArray();
              if (_binder_arr != null) {
                _arg5 = new android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[_binder_arr.length];
                for (int i = 0; i < _binder_arr.length; i++) {
                  _arg5[i] = android.aidl.tests.ArrayOfInterfaces.IEmptyInterface.Stub.asInterface(_binder_arr[i]);
                }
              } else {
                _arg5 = null;
              }
            }
            android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[] _arg6;
            int _arg6_length = data.readInt();
            if ((_arg6_length<0)) {
              _arg6 = null;
            }
            else {
              _arg6 = new android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[_arg6_length];
            }
            android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[] _arg7;
            {
              android.os.IBinder[] _binder_arr = data.createBinderArray();
              if (_binder_arr != null) {
                _arg7 = new android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[_binder_arr.length];
                for (int i = 0; i < _binder_arr.length; i++) {
                  _arg7[i] = android.aidl.tests.ArrayOfInterfaces.IEmptyInterface.Stub.asInterface(_binder_arr[i]);
                }
              } else {
                _arg7 = null;
              }
            }
            android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[] _result = this.methodWithInterfaces(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7);
            reply.writeNoException();
            {
              android.os.IBinder[] _binder_arr = null;
              if (_result != null) {
                _binder_arr = new android.os.IBinder[_result.length];
                for (int i = 0; i < _result.length; i++) {
                  _binder_arr[i] = (_result[i] != null) ? _result[i].asBinder() : null;
                }
              }
              reply.writeBinderArray(_binder_arr);
            }
            {
              android.os.IBinder[] _binder_arr = null;
              if (_arg3 != null) {
                _binder_arr = new android.os.IBinder[_arg3.length];
                for (int i = 0; i < _arg3.length; i++) {
                  _binder_arr[i] = (_arg3[i] != null) ? _arg3[i].asBinder() : null;
                }
              }
              reply.writeBinderArray(_binder_arr);
            }
            {
              android.os.IBinder[] _binder_arr = null;
              if (_arg4 != null) {
                _binder_arr = new android.os.IBinder[_arg4.length];
                for (int i = 0; i < _arg4.length; i++) {
                  _binder_arr[i] = (_arg4[i] != null) ? _arg4[i].asBinder() : null;
                }
              }
              reply.writeBinderArray(_binder_arr);
            }
            {
              android.os.IBinder[] _binder_arr = null;
              if (_arg6 != null) {
                _binder_arr = new android.os.IBinder[_arg6.length];
                for (int i = 0; i < _arg6.length; i++) {
                  _binder_arr[i] = (_arg6[i] != null) ? _arg6[i].asBinder() : null;
                }
              }
              reply.writeBinderArray(_binder_arr);
            }
            {
              android.os.IBinder[] _binder_arr = null;
              if (_arg7 != null) {
                _binder_arr = new android.os.IBinder[_arg7.length];
                for (int i = 0; i < _arg7.length; i++) {
                  _binder_arr[i] = (_arg7[i] != null) ? _arg7[i].asBinder() : null;
                }
              }
              reply.writeBinderArray(_binder_arr);
            }
            break;
          }
          default:
          {
            return super.onTransact(code, data, reply, flags);
          }
        }
        return true;
      }
      private static class Proxy implements android.aidl.tests.ArrayOfInterfaces.IMyInterface
      {
        private android.os.IBinder mRemote;
        Proxy(android.os.IBinder remote)
        {
          mRemote = remote;
        }
        @Override public android.os.IBinder asBinder()
        {
          return mRemote;
        }
        public java.lang.String getInterfaceDescriptor()
        {
          return DESCRIPTOR;
        }
        @Override public android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[] methodWithInterfaces(android.aidl.tests.ArrayOfInterfaces.IEmptyInterface iface, android.aidl.tests.ArrayOfInterfaces.IEmptyInterface nullable_iface, android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[] iface_array_in, android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[] iface_array_out, android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[] iface_array_inout, android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[] nullable_iface_array_in, android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[] nullable_iface_array_out, android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[] nullable_iface_array_inout) throws android.os.RemoteException
        {
          android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
          android.os.Parcel _reply = android.os.Parcel.obtain();
          android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[] _result;
          try {
            _data.writeInterfaceToken(DESCRIPTOR);
            _data.writeStrongBinder((((iface!=null))?(iface.asBinder()):(null)));
            _data.writeStrongBinder((((nullable_iface!=null))?(nullable_iface.asBinder()):(null)));
            {
              android.os.IBinder[] _binder_arr = null;
              if (iface_array_in != null) {
                _binder_arr = new android.os.IBinder[iface_array_in.length];
                for (int i = 0; i < iface_array_in.length; i++) {
                  _binder_arr[i] = (iface_array_in[i] != null) ? iface_array_in[i].asBinder() : null;
                }
              }
              _data.writeBinderArray(_binder_arr);
            }
            if ((iface_array_out==null)) {
              _data.writeInt(-1);
            }
            else {
              _data.writeInt(iface_array_out.length);
            }
            {
              android.os.IBinder[] _binder_arr = null;
              if (iface_array_inout != null) {
                _binder_arr = new android.os.IBinder[iface_array_inout.length];
                for (int i = 0; i < iface_array_inout.length; i++) {
                  _binder_arr[i] = (iface_array_inout[i] != null) ? iface_array_inout[i].asBinder() : null;
                }
              }
              _data.writeBinderArray(_binder_arr);
            }
            {
              android.os.IBinder[] _binder_arr = null;
              if (nullable_iface_array_in != null) {
                _binder_arr = new android.os.IBinder[nullable_iface_array_in.length];
                for (int i = 0; i < nullable_iface_array_in.length; i++) {
                  _binder_arr[i] = (nullable_iface_array_in[i] != null) ? nullable_iface_array_in[i].asBinder() : null;
                }
              }
              _data.writeBinderArray(_binder_arr);
            }
            if ((nullable_iface_array_out==null)) {
              _data.writeInt(-1);
            }
            else {
              _data.writeInt(nullable_iface_array_out.length);
            }
            {
              android.os.IBinder[] _binder_arr = null;
              if (nullable_iface_array_inout != null) {
                _binder_arr = new android.os.IBinder[nullable_iface_array_inout.length];
                for (int i = 0; i < nullable_iface_array_inout.length; i++) {
                  _binder_arr[i] = (nullable_iface_array_inout[i] != null) ? nullable_iface_array_inout[i].asBinder() : null;
                }
              }
              _data.writeBinderArray(_binder_arr);
            }
            boolean _status = mRemote.transact(Stub.TRANSACTION_methodWithInterfaces, _data, _reply, 0);
            if (!_status) {
              if (getDefaultImpl() != null) {
                return getDefaultImpl().methodWithInterfaces(iface, nullable_iface, iface_array_in, iface_array_out, iface_array_inout, nullable_iface_array_in, nullable_iface_array_out, nullable_iface_array_inout);
              }
            }
            _reply.readException();
            {
              android.os.IBinder[] _binder_arr = _reply.createBinderArray();
              if (_binder_arr != null) {
                _result = new android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[_binder_arr.length];
                for (int i = 0; i < _binder_arr.length; i++) {
                  _result[i] = android.aidl.tests.ArrayOfInterfaces.IEmptyInterface.Stub.asInterface(_binder_arr[i]);
                }
              } else {
                _result = null;
              }
            }
            {
              android.os.IBinder[] _binder_arr = new android.os.IBinder[iface_array_out.length];
              _reply.readBinderArray(_binder_arr);
              for (int i = 0; i < _binder_arr.length; i++) {
                iface_array_out[i] = android.aidl.tests.ArrayOfInterfaces.IEmptyInterface.Stub.asInterface(_binder_arr[i]);
              }
            }
            {
              android.os.IBinder[] _binder_arr = new android.os.IBinder[iface_array_inout.length];
              _reply.readBinderArray(_binder_arr);
              for (int i = 0; i < _binder_arr.length; i++) {
                iface_array_inout[i] = android.aidl.tests.ArrayOfInterfaces.IEmptyInterface.Stub.asInterface(_binder_arr[i]);
              }
            }
            {
              android.os.IBinder[] _binder_arr = new android.os.IBinder[nullable_iface_array_out.length];
              _reply.readBinderArray(_binder_arr);
              for (int i = 0; i < _binder_arr.length; i++) {
                nullable_iface_array_out[i] = android.aidl.tests.ArrayOfInterfaces.IEmptyInterface.Stub.asInterface(_binder_arr[i]);
              }
            }
            {
              android.os.IBinder[] _binder_arr = new android.os.IBinder[nullable_iface_array_inout.length];
              _reply.readBinderArray(_binder_arr);
              for (int i = 0; i < _binder_arr.length; i++) {
                nullable_iface_array_inout[i] = android.aidl.tests.ArrayOfInterfaces.IEmptyInterface.Stub.asInterface(_binder_arr[i]);
              }
            }
          }
          finally {
            _reply.recycle();
            _data.recycle();
          }
          return _result;
        }
        public static android.aidl.tests.ArrayOfInterfaces.IMyInterface sDefaultImpl;
      }
      static final int TRANSACTION_methodWithInterfaces = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
      public static boolean setDefaultImpl(android.aidl.tests.ArrayOfInterfaces.IMyInterface impl) {
        // Only one user of this interface can use this function
        // at a time. This is a heuristic to detect if two different
        // users in the same process use this function.
        if (Stub.Proxy.sDefaultImpl != null) {
          throw new IllegalStateException("setDefaultImpl() called twice");
        }
        if (impl != null) {
          Stub.Proxy.sDefaultImpl = impl;
          return true;
        }
        return false;
      }
      public static android.aidl.tests.ArrayOfInterfaces.IMyInterface getDefaultImpl() {
        return Stub.Proxy.sDefaultImpl;
      }
    }
    public static final java.lang.String DESCRIPTOR = "android$aidl$tests$ArrayOfInterfaces$IMyInterface".replace('$', '.');
    public android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[] methodWithInterfaces(android.aidl.tests.ArrayOfInterfaces.IEmptyInterface iface, android.aidl.tests.ArrayOfInterfaces.IEmptyInterface nullable_iface, android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[] iface_array_in, android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[] iface_array_out, android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[] iface_array_inout, android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[] nullable_iface_array_in, android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[] nullable_iface_array_out, android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[] nullable_iface_array_inout) throws android.os.RemoteException;
  }
  public static class MyParcelable implements android.os.Parcelable
  {
    public android.aidl.tests.ArrayOfInterfaces.IEmptyInterface iface;
    public android.aidl.tests.ArrayOfInterfaces.IEmptyInterface nullable_iface;
    public android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[] iface_array;
    public android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[] nullable_iface_array;
    public static final android.os.Parcelable.Creator<MyParcelable> CREATOR = new android.os.Parcelable.Creator<MyParcelable>() {
      @Override
      public MyParcelable createFromParcel(android.os.Parcel _aidl_source) {
        MyParcelable _aidl_out = new MyParcelable();
        _aidl_out.readFromParcel(_aidl_source);
        return _aidl_out;
      }
      @Override
      public MyParcelable[] newArray(int _aidl_size) {
        return new MyParcelable[_aidl_size];
      }
    };
    @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
    {
      int _aidl_start_pos = _aidl_parcel.dataPosition();
      _aidl_parcel.writeInt(0);
      _aidl_parcel.writeStrongBinder((((iface!=null))?(iface.asBinder()):(null)));
      _aidl_parcel.writeStrongBinder((((nullable_iface!=null))?(nullable_iface.asBinder()):(null)));
      {
        android.os.IBinder[] _binder_arr = null;
        if (iface_array != null) {
          _binder_arr = new android.os.IBinder[iface_array.length];
          for (int i = 0; i < iface_array.length; i++) {
            _binder_arr[i] = (iface_array[i] != null) ? iface_array[i].asBinder() : null;
          }
        }
        _aidl_parcel.writeBinderArray(_binder_arr);
      }
      {
        android.os.IBinder[] _binder_arr = null;
        if (nullable_iface_array != null) {
          _binder_arr = new android.os.IBinder[nullable_iface_array.length];
          for (int i = 0; i < nullable_iface_array.length; i++) {
            _binder_arr[i] = (nullable_iface_array[i] != null) ? nullable_iface_array[i].asBinder() : null;
          }
        }
        _aidl_parcel.writeBinderArray(_binder_arr);
      }
      int _aidl_end_pos = _aidl_parcel.dataPosition();
      _aidl_parcel.setDataPosition(_aidl_start_pos);
      _aidl_parcel.writeInt(_aidl_end_pos - _aidl_start_pos);
      _aidl_parcel.setDataPosition(_aidl_end_pos);
    }
    public final void readFromParcel(android.os.Parcel _aidl_parcel)
    {
      int _aidl_start_pos = _aidl_parcel.dataPosition();
      int _aidl_parcelable_size = _aidl_parcel.readInt();
      try {
        if (_aidl_parcelable_size < 0) return;
        if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
        iface = android.aidl.tests.ArrayOfInterfaces.IEmptyInterface.Stub.asInterface(_aidl_parcel.readStrongBinder());
        if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
        nullable_iface = android.aidl.tests.ArrayOfInterfaces.IEmptyInterface.Stub.asInterface(_aidl_parcel.readStrongBinder());
        if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
        {
          android.os.IBinder[] _binder_arr = _aidl_parcel.createBinderArray();
          if (_binder_arr != null) {
            iface_array = new android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[_binder_arr.length];
            for (int i = 0; i < _binder_arr.length; i++) {
              iface_array[i] = android.aidl.tests.ArrayOfInterfaces.IEmptyInterface.Stub.asInterface(_binder_arr[i]);
            }
          } else {
            iface_array = null;
          }
        }
        if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
        {
          android.os.IBinder[] _binder_arr = _aidl_parcel.createBinderArray();
          if (_binder_arr != null) {
            nullable_iface_array = new android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[_binder_arr.length];
            for (int i = 0; i < _binder_arr.length; i++) {
              nullable_iface_array[i] = android.aidl.tests.ArrayOfInterfaces.IEmptyInterface.Stub.asInterface(_binder_arr[i]);
            }
          } else {
            nullable_iface_array = null;
          }
        }
      } finally {
        if (_aidl_start_pos > (Integer.MAX_VALUE - _aidl_parcelable_size)) {
          throw new android.os.BadParcelableException("Overflow in the size of parcelable");
        }
        _aidl_parcel.setDataPosition(_aidl_start_pos + _aidl_parcelable_size);
      }
    }
    @Override
    public String toString() {
      java.util.StringJoiner _aidl_sj = new java.util.StringJoiner(", ", "{", "}");
      _aidl_sj.add("iface: " + (java.util.Objects.toString(iface)));
      _aidl_sj.add("nullable_iface: " + (java.util.Objects.toString(nullable_iface)));
      _aidl_sj.add("iface_array: " + (java.util.Arrays.toString(iface_array)));
      _aidl_sj.add("nullable_iface_array: " + (java.util.Arrays.toString(nullable_iface_array)));
      return "android.aidl.tests.ArrayOfInterfaces.MyParcelable" + _aidl_sj.toString()  ;
    }
    @Override
    public boolean equals(Object other) {
      if (this == other) return true;
      if (other == null) return false;
      if (!(other instanceof MyParcelable)) return false;
      MyParcelable that = (MyParcelable)other;
      if (!java.util.Objects.deepEquals(iface, that.iface)) return false;
      if (!java.util.Objects.deepEquals(nullable_iface, that.nullable_iface)) return false;
      if (!java.util.Objects.deepEquals(iface_array, that.iface_array)) return false;
      if (!java.util.Objects.deepEquals(nullable_iface_array, that.nullable_iface_array)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      return java.util.Arrays.deepHashCode(java.util.Arrays.asList(iface, nullable_iface, iface_array, nullable_iface_array).toArray());
    }
    @Override
    public int describeContents() {
      int _mask = 0;
      return _mask;
    }
  }
  public static final class MyUnion implements android.os.Parcelable {
    // tags for union fields
    public final static int iface = 0;  // android.aidl.tests.ArrayOfInterfaces.IEmptyInterface iface;
    public final static int nullable_iface = 1;  // android.aidl.tests.ArrayOfInterfaces.IEmptyInterface nullable_iface;
    public final static int iface_array = 2;  // android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[] iface_array;
    public final static int nullable_iface_array = 3;  // android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[] nullable_iface_array;

    private int _tag;
    private Object _value;

    public MyUnion() {
      android.aidl.tests.ArrayOfInterfaces.IEmptyInterface _value = null;
      this._tag = iface;
      this._value = _value;
    }

    private MyUnion(android.os.Parcel _aidl_parcel) {
      readFromParcel(_aidl_parcel);
    }

    private MyUnion(int _tag, Object _value) {
      this._tag = _tag;
      this._value = _value;
    }

    public int getTag() {
      return _tag;
    }

    // android.aidl.tests.ArrayOfInterfaces.IEmptyInterface iface;

    public static MyUnion iface(android.aidl.tests.ArrayOfInterfaces.IEmptyInterface _value) {
      return new MyUnion(iface, _value);
    }

    public android.aidl.tests.ArrayOfInterfaces.IEmptyInterface getIface() {
      _assertTag(iface);
      return (android.aidl.tests.ArrayOfInterfaces.IEmptyInterface) _value;
    }

    public void setIface(android.aidl.tests.ArrayOfInterfaces.IEmptyInterface _value) {
      _set(iface, _value);
    }

    // android.aidl.tests.ArrayOfInterfaces.IEmptyInterface nullable_iface;

    public static MyUnion nullable_iface(android.aidl.tests.ArrayOfInterfaces.IEmptyInterface _value) {
      return new MyUnion(nullable_iface, _value);
    }

    public android.aidl.tests.ArrayOfInterfaces.IEmptyInterface getNullable_iface() {
      _assertTag(nullable_iface);
      return (android.aidl.tests.ArrayOfInterfaces.IEmptyInterface) _value;
    }

    public void setNullable_iface(android.aidl.tests.ArrayOfInterfaces.IEmptyInterface _value) {
      _set(nullable_iface, _value);
    }

    // android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[] iface_array;

    public static MyUnion iface_array(android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[] _value) {
      return new MyUnion(iface_array, _value);
    }

    public android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[] getIface_array() {
      _assertTag(iface_array);
      return (android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[]) _value;
    }

    public void setIface_array(android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[] _value) {
      _set(iface_array, _value);
    }

    // android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[] nullable_iface_array;

    public static MyUnion nullable_iface_array(android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[] _value) {
      return new MyUnion(nullable_iface_array, _value);
    }

    public android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[] getNullable_iface_array() {
      _assertTag(nullable_iface_array);
      return (android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[]) _value;
    }

    public void setNullable_iface_array(android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[] _value) {
      _set(nullable_iface_array, _value);
    }

    public static final android.os.Parcelable.Creator<MyUnion> CREATOR = new android.os.Parcelable.Creator<MyUnion>() {
      @Override
      public MyUnion createFromParcel(android.os.Parcel _aidl_source) {
        return new MyUnion(_aidl_source);
      }
      @Override
      public MyUnion[] newArray(int _aidl_size) {
        return new MyUnion[_aidl_size];
      }
    };

    @Override
    public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag) {
      _aidl_parcel.writeInt(_tag);
      switch (_tag) {
      case iface:
        _aidl_parcel.writeStrongBinder((((getIface()!=null))?(getIface().asBinder()):(null)));
        break;
      case nullable_iface:
        _aidl_parcel.writeStrongBinder((((getNullable_iface()!=null))?(getNullable_iface().asBinder()):(null)));
        break;
      case iface_array:
        {
          android.os.IBinder[] _binder_arr = null;
          if (getIface_array() != null) {
            _binder_arr = new android.os.IBinder[getIface_array().length];
            for (int i = 0; i < getIface_array().length; i++) {
              _binder_arr[i] = (getIface_array()[i] != null) ? getIface_array()[i].asBinder() : null;
            }
          }
          _aidl_parcel.writeBinderArray(_binder_arr);
        }
        break;
      case nullable_iface_array:
        {
          android.os.IBinder[] _binder_arr = null;
          if (getNullable_iface_array() != null) {
            _binder_arr = new android.os.IBinder[getNullable_iface_array().length];
            for (int i = 0; i < getNullable_iface_array().length; i++) {
              _binder_arr[i] = (getNullable_iface_array()[i] != null) ? getNullable_iface_array()[i].asBinder() : null;
            }
          }
          _aidl_parcel.writeBinderArray(_binder_arr);
        }
        break;
      }
    }

    public void readFromParcel(android.os.Parcel _aidl_parcel) {
      int _aidl_tag;
      _aidl_tag = _aidl_parcel.readInt();
      switch (_aidl_tag) {
      case iface: {
        android.aidl.tests.ArrayOfInterfaces.IEmptyInterface _aidl_value;
        _aidl_value = android.aidl.tests.ArrayOfInterfaces.IEmptyInterface.Stub.asInterface(_aidl_parcel.readStrongBinder());
        _set(_aidl_tag, _aidl_value);
        return; }
      case nullable_iface: {
        android.aidl.tests.ArrayOfInterfaces.IEmptyInterface _aidl_value;
        _aidl_value = android.aidl.tests.ArrayOfInterfaces.IEmptyInterface.Stub.asInterface(_aidl_parcel.readStrongBinder());
        _set(_aidl_tag, _aidl_value);
        return; }
      case iface_array: {
        android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[] _aidl_value;
        {
          android.os.IBinder[] _binder_arr = _aidl_parcel.createBinderArray();
          if (_binder_arr != null) {
            _aidl_value = new android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[_binder_arr.length];
            for (int i = 0; i < _binder_arr.length; i++) {
              _aidl_value[i] = android.aidl.tests.ArrayOfInterfaces.IEmptyInterface.Stub.asInterface(_binder_arr[i]);
            }
          } else {
            _aidl_value = null;
          }
        }
        _set(_aidl_tag, _aidl_value);
        return; }
      case nullable_iface_array: {
        android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[] _aidl_value;
        {
          android.os.IBinder[] _binder_arr = _aidl_parcel.createBinderArray();
          if (_binder_arr != null) {
            _aidl_value = new android.aidl.tests.ArrayOfInterfaces.IEmptyInterface[_binder_arr.length];
            for (int i = 0; i < _binder_arr.length; i++) {
              _aidl_value[i] = android.aidl.tests.ArrayOfInterfaces.IEmptyInterface.Stub.asInterface(_binder_arr[i]);
            }
          } else {
            _aidl_value = null;
          }
        }
        _set(_aidl_tag, _aidl_value);
        return; }
      }
      throw new IllegalArgumentException("union: unknown tag: " + _aidl_tag);
    }

    @Override
    public int describeContents() {
      int _mask = 0;
      switch (getTag()) {
      }
      return _mask;
    }

    @Override
    public String toString() {
      switch (_tag) {
      case iface: return "android.aidl.tests.ArrayOfInterfaces.MyUnion.iface(" + (java.util.Objects.toString(getIface())) + ")";
      case nullable_iface: return "android.aidl.tests.ArrayOfInterfaces.MyUnion.nullable_iface(" + (java.util.Objects.toString(getNullable_iface())) + ")";
      case iface_array: return "android.aidl.tests.ArrayOfInterfaces.MyUnion.iface_array(" + (java.util.Arrays.toString(getIface_array())) + ")";
      case nullable_iface_array: return "android.aidl.tests.ArrayOfInterfaces.MyUnion.nullable_iface_array(" + (java.util.Arrays.toString(getNullable_iface_array())) + ")";
      }
      throw new IllegalStateException("unknown field: " + _tag);
    }
    @Override
    public boolean equals(Object other) {
      if (this == other) return true;
      if (other == null) return false;
      if (!(other instanceof MyUnion)) return false;
      MyUnion that = (MyUnion)other;
      if (_tag != that._tag) return false;
      if (!java.util.Objects.deepEquals(_value, that._value)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      return java.util.Arrays.deepHashCode(java.util.Arrays.asList(_tag, _value).toArray());
    }

    private void _assertTag(int tag) {
      if (getTag() != tag) {
        throw new IllegalStateException("bad access: " + _tagString(tag) + ", " + _tagString(getTag()) + " is available.");
      }
    }

    private String _tagString(int _tag) {
      switch (_tag) {
      case iface: return "iface";
      case nullable_iface: return "nullable_iface";
      case iface_array: return "iface_array";
      case nullable_iface_array: return "nullable_iface_array";
      }
      throw new IllegalStateException("unknown field: " + _tag);
    }

    private void _set(int _tag, Object _value) {
      this._tag = _tag;
      this._value = _value;
    }
  }
}
