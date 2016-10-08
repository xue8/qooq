package cooperation.secmsg.ipc;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.ResultReceiver;
import android.util.SparseArray;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public abstract class BaseReq
  extends BaseIpc
{
  public ResultReceiver a;
  
  public BaseReq()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public static BaseReq a(Bundle paramBundle)
  {
    if (paramBundle == null) {
      return null;
    }
    int i = paramBundle.getInt("_secmsg_ipc_code", -1);
    Object localObject = (Class)jdField_a_of_type_AndroidUtilSparseArray.get(i);
    if (localObject != null) {
      try
      {
        localObject = (BaseReq)((Class)localObject).newInstance();
        ((BaseReq)localObject).b(paramBundle);
        return (BaseReq)localObject;
      }
      catch (Exception paramBundle)
      {
        return null;
      }
    }
    return null;
  }
  
  public void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (this.jdField_a_of_type_AndroidOsResultReceiver != null)
    {
      Parcel localParcel = Parcel.obtain();
      this.jdField_a_of_type_AndroidOsResultReceiver.writeToParcel(localParcel, 0);
      localParcel.setDataPosition(0);
      ResultReceiver localResultReceiver = (ResultReceiver)ResultReceiver.CREATOR.createFromParcel(localParcel);
      localParcel.recycle();
      paramBundle.putParcelable("_secmsg_ipc_req_fromreceiver", localResultReceiver);
    }
  }
  
  public abstract void a(QQAppInterface paramQQAppInterface);
  
  public final boolean a(Bundle paramBundle)
  {
    if ((paramBundle == null) || (this.jdField_a_of_type_AndroidOsResultReceiver == null)) {
      return false;
    }
    this.jdField_a_of_type_AndroidOsResultReceiver.send(0, paramBundle);
    return true;
  }
  
  public void b(Bundle paramBundle)
  {
    super.b(paramBundle);
    this.jdField_a_of_type_AndroidOsResultReceiver = ((ResultReceiver)paramBundle.getParcelable("_secmsg_ipc_req_fromreceiver"));
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\cooperation\secmsg\ipc\BaseReq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */