import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import com.tencent.mobileqq.activity.QQBrowserActivity;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.statistics.ReportController;
import com.tencent.mobileqq.webview.swift.utils.SwiftBrowserIdleTaskHelper.IdleTask;
import com.tencent.qphone.base.util.QLog;
import java.lang.reflect.Field;

public class mcj
  extends SwiftBrowserIdleTaskHelper.IdleTask
{
  public mcj(QQBrowserActivity paramQQBrowserActivity, int paramInt)
  {
    super(paramInt);
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public int a()
  {
    if (QLog.isColorLevel()) {
      QLog.i("QQBrowser", 2, "TASK_ID_BROWSER_ACTIVITY_RUN_ONCE.");
    }
    long l;
    boolean bool7;
    boolean bool8;
    boolean bool9;
    boolean bool10;
    boolean bool6;
    if (Build.VERSION.SDK_INT < 19)
    {
      l = System.currentTimeMillis();
      bool7 = false;
      bool8 = false;
      bool9 = false;
      bool10 = false;
      bool6 = false;
      bool2 = bool6;
      bool3 = bool7;
      bool4 = bool8;
      bool5 = bool9;
    }
    for (;;)
    {
      try
      {
        Object localObject = Class.forName("android.webkit.WebViewCore");
        bool2 = bool6;
        bool3 = bool7;
        bool4 = bool8;
        bool5 = bool9;
        Field localField = ((Class)localObject).getDeclaredField("sWebCoreHandler");
        bool2 = bool6;
        bool3 = bool7;
        bool4 = bool8;
        bool5 = bool9;
        localField.setAccessible(true);
        bool2 = bool6;
        bool3 = bool7;
        bool4 = bool8;
        bool5 = bool9;
        localObject = (Handler)localField.get(localObject);
        bool1 = bool10;
        if (localObject == null) {
          continue;
        }
        bool2 = bool6;
        bool3 = bool7;
        bool4 = bool8;
        bool5 = bool9;
        localObject = ((Handler)localObject).getLooper();
        bool1 = bool10;
        if (localObject == null) {
          continue;
        }
        bool2 = bool6;
        bool3 = bool7;
        bool4 = bool8;
        bool5 = bool9;
        bool1 = bool10;
        if (((Looper)localObject).getThread().getState() != Thread.State.WAITING) {
          continue;
        }
        bool1 = true;
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        bool1 = bool2;
        localClassNotFoundException.printStackTrace();
        continue;
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        bool1 = bool3;
        localNoSuchFieldException.printStackTrace();
        continue;
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        bool1 = bool4;
        localIllegalAccessException.printStackTrace();
        continue;
      }
      catch (ClassCastException localClassCastException)
      {
        boolean bool1 = bool5;
        localClassCastException.printStackTrace();
        continue;
        if (!bool1) {
          continue;
        }
        int i = 0;
        continue;
      }
      bool2 = bool1;
      bool3 = bool1;
      bool4 = bool1;
      bool5 = bool1;
      ReportController.b(null, "P_CliOper", "BizTechReport", "", "web", "webcore_wait", 0, 1, i, "", "", "", "");
      if (QLog.isColorLevel()) {
        QLog.d("QQBrowser", 2, "check if WebViewCordThread is waiting: " + bool1 + ", cost: " + (System.currentTimeMillis() - l));
      }
      return 1;
      i = 1;
    }
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\mcj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */