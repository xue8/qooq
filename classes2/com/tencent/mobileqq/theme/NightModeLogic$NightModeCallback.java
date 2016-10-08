package com.tencent.mobileqq.theme;

import android.os.Bundle;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.qphone.base.util.QLog;

public abstract class NightModeLogic$NightModeCallback
  implements ThemeSwitchManager.ThemeSwitchCallback
{
  public NightModeLogic$NightModeCallback()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public abstract void a(Bundle paramBundle);
  
  public abstract void b(Bundle paramBundle);
  
  public final void c(Bundle paramBundle)
  {
    int i = paramBundle.getInt("result", -1);
    if (i == 2) {
      paramBundle.putInt("start_status", 2);
    }
    for (;;)
    {
      if (QLog.isColorLevel()) {
        QLog.i("ThemeSwitch", 2, "NightModeCallback start_status: " + paramBundle.getInt("start_status", -1));
      }
      b(paramBundle);
      return;
      if (i == 1)
      {
        paramBundle.putInt("start_status", 4);
      }
      else if (i == 3)
      {
        long l1 = paramBundle.getLong("transferedSize", 0L);
        long l2 = paramBundle.getLong("filesize", 0L);
        int j = 100;
        i = j;
        if (l2 != 0L)
        {
          i = j;
          if (l1 < l2) {
            i = (int)(Math.round(l1 * 1.0D / l2 * 100.0D) / 100.0D * 100.0D);
          }
        }
        if (QLog.isColorLevel()) {
          QLog.i("ThemeSwitch", 2, "NightModeCallback transferedSize: " + l1 + ",filesize=" + l2 + ",percent=" + i);
        }
        paramBundle.putInt("percent", i);
        paramBundle.putInt("start_status", 3);
      }
    }
  }
  
  public final void d(Bundle paramBundle)
  {
    a(paramBundle);
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\mobileqq\theme\NightModeLogic$NightModeCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */