import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.tencent.av.service.IAVServiceForQQ.Stub;
import com.tencent.av.service.QavWrapper;
import com.tencent.av.service.QavWrapper.OnReadyListener;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.qphone.base.util.QLog;

public class gns
  implements ServiceConnection
{
  public gns(QavWrapper paramQavWrapper)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    if (QLog.isColorLevel()) {
      QLog.d("QavWrapper", 2, "Qav Service connected!");
    }
    this.a.jdField_a_of_type_ComTencentAvServiceIAVServiceForQQ = IAVServiceForQQ.Stub.a(paramIBinder);
    if ((this.a.jdField_a_of_type_ComTencentAvServiceIAVServiceForQQ != null) && (this.a.jdField_a_of_type_ComTencentAvServiceQavWrapper$OnReadyListener != null)) {
      this.a.jdField_a_of_type_ComTencentAvServiceQavWrapper$OnReadyListener.a(this.a);
    }
    while (!QLog.isColorLevel()) {
      return;
    }
    QLog.d("QavWrapper", 2, "mQavProxy == null or mOnReadyListener == null");
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    if (QLog.isColorLevel()) {
      QLog.d("QavWrapper", 2, "Qav Service disconnected!");
    }
    this.a.jdField_a_of_type_ComTencentAvServiceIAVServiceForQQ = null;
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\gns.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */