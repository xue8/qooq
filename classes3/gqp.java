import android.content.IntentFilter;
import com.tencent.av.ui.CallbackWaitingActivityExt;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.qphone.base.util.QLog;

public class gqp
  implements Runnable
{
  public gqp(CallbackWaitingActivityExt paramCallbackWaitingActivityExt)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void run()
  {
    try
    {
      this.a.a = new grc(this.a);
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("android.intent.action.CLOSE_SYSTEM_DIALOGS");
      this.a.registerReceiver(this.a.a, localIntentFilter);
      return;
    }
    catch (Exception localException)
    {
      while (!QLog.isColorLevel()) {}
      QLog.d(CallbackWaitingActivityExt.a(), 2, "Exception", localException);
    }
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\gqp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */