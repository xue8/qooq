import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.nearby.ipc.BasicTypeDataParcel;
import com.tencent.mobileqq.nearby.ipc.MainProcessInterface;

public class tkd
  implements MainProcessInterface
{
  private IBinder a;
  
  public tkd(IBinder paramIBinder)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.a = paramIBinder;
  }
  
  public Message a(Message paramMessage)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.tencent.mobileqq.nearby.ipc.MainProcessInterface");
        if (paramMessage != null)
        {
          localParcel1.writeInt(1);
          paramMessage.writeToParcel(localParcel1, 0);
          this.a.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
          if (localParcel2.readInt() != 0)
          {
            paramMessage = (Message)Message.CREATOR.createFromParcel(localParcel2);
            return paramMessage;
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        paramMessage = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public BasicTypeDataParcel a(BasicTypeDataParcel paramBasicTypeDataParcel)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.tencent.mobileqq.nearby.ipc.MainProcessInterface");
        if (paramBasicTypeDataParcel != null)
        {
          localParcel1.writeInt(1);
          paramBasicTypeDataParcel.writeToParcel(localParcel1, 0);
          this.a.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          if (localParcel2.readInt() != 0)
          {
            paramBasicTypeDataParcel = (BasicTypeDataParcel)BasicTypeDataParcel.CREATOR.createFromParcel(localParcel2);
            return paramBasicTypeDataParcel;
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        paramBasicTypeDataParcel = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public String a()
  {
    return "com.tencent.mobileqq.nearby.ipc.MainProcessInterface";
  }
  
  /* Error */
  public void a(com.tencent.mobileqq.nearby.ipc.NearbyProcessInterface paramNearbyProcessInterface)
  {
    // Byte code:
    //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: aload_2
    //   9: ldc 31
    //   11: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_1
    //   15: ifnull +42 -> 57
    //   18: aload_1
    //   19: invokeinterface 84 1 0
    //   24: astore_1
    //   25: aload_2
    //   26: aload_1
    //   27: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   30: aload_0
    //   31: getfield 21	tkd:a	Landroid/os/IBinder;
    //   34: iconst_3
    //   35: aload_2
    //   36: aload_3
    //   37: iconst_0
    //   38: invokeinterface 51 5 0
    //   43: pop
    //   44: aload_3
    //   45: invokevirtual 54	android/os/Parcel:readException	()V
    //   48: aload_3
    //   49: invokevirtual 71	android/os/Parcel:recycle	()V
    //   52: aload_2
    //   53: invokevirtual 71	android/os/Parcel:recycle	()V
    //   56: return
    //   57: aconst_null
    //   58: astore_1
    //   59: goto -34 -> 25
    //   62: astore_1
    //   63: aload_3
    //   64: invokevirtual 71	android/os/Parcel:recycle	()V
    //   67: aload_2
    //   68: invokevirtual 71	android/os/Parcel:recycle	()V
    //   71: aload_1
    //   72: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	73	0	this	tkd
    //   0	73	1	paramNearbyProcessInterface	com.tencent.mobileqq.nearby.ipc.NearbyProcessInterface
    //   3	65	2	localParcel1	Parcel
    //   7	57	3	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   8	14	62	finally
    //   18	25	62	finally
    //   25	48	62	finally
  }
  
  public IBinder asBinder()
  {
    return this.a;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tkd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */