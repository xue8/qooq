import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.qphone.base.util.BaseApplication;
import com.tencent.qphone.base.util.QLog;
import cooperation.qzone.QZoneHelper;
import cooperation.qzone.QZoneHelper.StartActivity;
import java.util.Iterator;
import java.util.List;

public final class ykp
  implements Runnable
{
  public ykp(QZoneHelper.StartActivity paramStartActivity)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void run()
  {
    Object localObject = ((ActivityManager)BaseApplicationImpl.getContext().getSystemService("activity")).getRunningAppProcesses();
    if ((localObject == null) || (((List)localObject).size() <= 0))
    {
      this.a.a(true, false);
      return;
    }
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      if ("com.tencent.mobileqq:qzone".equals(((ActivityManager.RunningAppProcessInfo)((Iterator)localObject).next()).processName))
      {
        if (QLog.isColorLevel()) {
          QLog.d(QZoneHelper.a, 2, "QzoneProcess is exist");
        }
        this.a.a(true, true);
        return;
      }
    }
    this.a.a(true, false);
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\ykp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */