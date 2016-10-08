package com.tencent.mobileqq.nearby.ipc;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import tkd;

public abstract class MainProcessInterface$Stub
  extends Binder
  implements MainProcessInterface
{
  static final int jdField_a_of_type_Int = 1;
  private static final String jdField_a_of_type_JavaLangString = "com.tencent.mobileqq.nearby.ipc.MainProcessInterface";
  static final int b = 2;
  static final int c = 3;
  
  public MainProcessInterface$Stub()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    attachInterface(this, "com.tencent.mobileqq.nearby.ipc.MainProcessInterface");
  }
  
  public static MainProcessInterface a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mobileqq.nearby.ipc.MainProcessInterface");
    if ((localIInterface != null) && ((localIInterface instanceof MainProcessInterface))) {
      return (MainProcessInterface)localIInterface;
    }
    return new tkd(paramIBinder);
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject2 = null;
    Object localObject1 = null;
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.tencent.mobileqq.nearby.ipc.MainProcessInterface");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.tencent.mobileqq.nearby.ipc.MainProcessInterface");
      if (paramParcel1.readInt() != 0) {
        localObject1 = (BasicTypeDataParcel)BasicTypeDataParcel.CREATOR.createFromParcel(paramParcel1);
      }
      paramParcel1 = a((BasicTypeDataParcel)localObject1);
      paramParcel2.writeNoException();
      if (paramParcel1 != null)
      {
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
      }
      for (;;)
      {
        return true;
        paramParcel2.writeInt(0);
      }
    case 2: 
      paramParcel1.enforceInterface("com.tencent.mobileqq.nearby.ipc.MainProcessInterface");
      localObject1 = localObject2;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (Message)Message.CREATOR.createFromParcel(paramParcel1);
      }
      paramParcel1 = a((Message)localObject1);
      paramParcel2.writeNoException();
      if (paramParcel1 != null)
      {
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
      }
      for (;;)
      {
        return true;
        paramParcel2.writeInt(0);
      }
    }
    paramParcel1.enforceInterface("com.tencent.mobileqq.nearby.ipc.MainProcessInterface");
    a(NearbyProcessInterface.Stub.a(paramParcel1.readStrongBinder()));
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\com\tencent\mobileqq\nearby\ipc\MainProcessInterface$Stub.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */