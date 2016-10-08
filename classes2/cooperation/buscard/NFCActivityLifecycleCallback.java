package cooperation.buscard;

import android.app.Activity;
import android.content.Intent;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pluginsdk.ActivityLifecycle.ActivityLifecycleCallback;
import com.tencent.qphone.base.util.QLog;
import mqq.app.MobileQQ;

public class NFCActivityLifecycleCallback
  implements ActivityLifecycle.ActivityLifecycleCallback
{
  public NFCActivityLifecycleCallback()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onNewIntent(Activity paramActivity, Intent paramIntent)
  {
    if ((paramIntent != null) && ("android.nfc.action.TECH_DISCOVERED".equals(paramIntent.getAction()))) {
      BuscardHelper.a("", paramActivity, paramIntent);
    }
    if (QLog.isColorLevel()) {
      QLog.d("", 2, "NFCActivityLifecycleCallback onNewIntent " + MobileQQ.processName);
    }
  }
  
  public void onPause(Activity paramActivity)
  {
    try
    {
      BuscardHelper.a(paramActivity, true, "", "");
      if (QLog.isColorLevel()) {
        QLog.d("", 2, "NFCActivityLifecycleCallback onPause " + MobileQQ.processName);
      }
      return;
    }
    catch (Throwable paramActivity)
    {
      for (;;)
      {
        paramActivity.printStackTrace();
      }
    }
  }
  
  public void onResume(Activity paramActivity)
  {
    if (QLog.isColorLevel()) {
      QLog.d("", 2, "NFCActivityLifecycleCallback onResume " + MobileQQ.processName);
    }
    try
    {
      BuscardHelper.a(paramActivity, true, "", "", null);
      return;
    }
    catch (Throwable paramActivity)
    {
      paramActivity.printStackTrace();
    }
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\cooperation\buscard\NFCActivityLifecycleCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */