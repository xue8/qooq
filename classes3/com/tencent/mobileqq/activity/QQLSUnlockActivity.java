package com.tencent.mobileqq.activity;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.provider.Settings.System;
import android.view.Window;
import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.statistics.StatisticCollector;
import com.tencent.mqq.shared_file_accessor.SharedPreferencesProxyManager;
import com.tencent.qphone.base.util.QLog;
import com.tencent.widget.immersive.ImmersiveUtils;

public class QQLSUnlockActivity
  extends Activity
  implements Handler.Callback
{
  static final int jdField_a_of_type_Int = 0;
  public static final String a = "QQLSActivity";
  Handler jdField_a_of_type_AndroidOsHandler;
  
  public QQLSUnlockActivity()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  private int a()
  {
    int j = 10000;
    try
    {
      i = Settings.System.getInt(getContentResolver(), "screen_off_timeout");
      if (QLog.isDevelopLevel()) {
        QLog.d("QQLSActivity", 4, "getScreenOffTime " + i);
      }
      return i;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        int i = j;
        if (QLog.isDevelopLevel())
        {
          QLog.d("QQLSActivity", 4, "getScreenOffTime e=" + localException.getMessage());
          i = j;
        }
      }
    }
  }
  
  public SharedPreferences getSharedPreferences(String paramString, int paramInt)
  {
    return SharedPreferencesProxyManager.getInstance().getProxy(paramString, paramInt);
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    }
    for (;;)
    {
      return false;
      if (QLog.isColorLevel()) {
        QLog.d("LSUnlockActivity", 2, "QQLSUnlockActivity finish");
      }
      finish();
    }
  }
  
  public void onBackPressed()
  {
    if (QLog.isColorLevel()) {
      QLog.d("LSUnlockActivity", 2, "onBackPressed ");
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    BaseApplicationImpl.a().addOtherTypeActivity(this);
    super.onCreate(paramBundle);
    if (Build.VERSION.SDK_INT >= 21) {
      getWindow().addFlags(4194304);
    }
    for (;;)
    {
      if (ImmersiveUtils.isSupporImmersive() == 1) {
        getWindow().addFlags(67108864);
      }
      this.a = new Handler(this);
      if (QLog.isColorLevel()) {
        QLog.d("QQLSActivity", 2, "enter QQLSUnlockActivity");
      }
      if (Build.MANUFACTURER.equalsIgnoreCase("xiaomi")) {
        ((PowerManager)getSystemService("power")).newWakeLock(268435462, "test").acquire(a());
      }
      this.a.sendEmptyMessageDelayed(0, 1500L);
      return;
      getWindow().addFlags(4718592);
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    BaseApplicationImpl.a().removeOtherTypeActivity(this);
  }
  
  protected void onPause()
  {
    super.onPause();
    StatisticCollector.a(this).c(this);
  }
  
  protected void onResume()
  {
    super.onResume();
    StatisticCollector.a(this).b(this);
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    if (QLog.isColorLevel()) {
      QLog.d("LSUnlockActivity", 2, "onSaveInstanceState ");
    }
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\tencent\mobileqq\activity\QQLSUnlockActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */