import android.os.Bundle;
import com.tencent.mobileqq.data.PrecoverResource;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.precover.ipc.PrecoverIPCClient;
import com.tencent.mobileqq.precover.ipc.PrecoverIPCConstans;
import com.tencent.mobileqq.precover.ipc.PrecoverIPCListener;
import com.tencent.qphone.base.util.QLog;
import eipc.EIPCResult;
import eipc.EIPCResultCallback;
import java.util.List;

public class tur
  implements EIPCResultCallback
{
  public tur(PrecoverIPCClient paramPrecoverIPCClient)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onCallback(EIPCResult paramEIPCResult)
  {
    if (QLog.isColorLevel()) {
      QLog.d("", 2, "onCallback, result=" + paramEIPCResult);
    }
    if (paramEIPCResult == null) {}
    for (;;)
    {
      return;
      if (QLog.isColorLevel()) {
        QLog.d("", 2, "onCallback, result.isSuccess=" + paramEIPCResult.isSuccess());
      }
      Object localObject = paramEIPCResult.data;
      if (localObject == null)
      {
        if (QLog.isColorLevel()) {
          QLog.d("", 2, "onCallback, data is null");
        }
      }
      else
      {
        paramEIPCResult = ((Bundle)localObject).getString("key_action");
        if (QLog.isColorLevel()) {
          QLog.d("", 2, "onCallback, action=" + paramEIPCResult);
        }
        if (PrecoverIPCConstans.b.equals(paramEIPCResult))
        {
          int j = ((Bundle)localObject).getInt("errCode", -1);
          paramEIPCResult = ((Bundle)localObject).getString("errDesc");
          localObject = (PrecoverResource)((Bundle)localObject).getParcelable("resource");
          if (QLog.isColorLevel()) {
            QLog.d("", 2, "onCallback, errCode=" + j + ", errDesc=" + paramEIPCResult + ", res=" + localObject);
          }
          int i = 0;
          while (i < PrecoverIPCClient.a(this.a).size())
          {
            PrecoverIPCListener localPrecoverIPCListener = (PrecoverIPCListener)PrecoverIPCClient.a(this.a).get(i);
            if (localPrecoverIPCListener != null) {
              localPrecoverIPCListener.a(j, paramEIPCResult, (PrecoverResource)localObject);
            }
            i += 1;
          }
        }
      }
    }
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\tur.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */