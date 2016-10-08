package com.tencent.open.appcommon;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mobileqq.app.ThreadManager;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.open.adapter.AppBaseActivity;
import com.tencent.open.adapter.CommonDataAdapter;
import com.tencent.open.appcommon.js.OpenJsBridge;
import com.tencent.open.base.LogUtility;
import com.tencent.open.base.http.HttpBaseUtil;
import com.tencent.open.downloadnew.MyAppApi;
import com.tencent.smtt.sdk.CookieManager;
import com.tencent.smtt.sdk.CookieSyncManager;
import com.tencent.smtt.sdk.WebView;
import java.io.File;
import wsn;
import wso;
import wsp;

public abstract class AppViewBaseActivity
  extends AppBaseActivity
  implements Handler.Callback
{
  protected static boolean d = false;
  public static final int e = 1;
  protected static boolean e = false;
  public static final int f = 2;
  protected static boolean f = false;
  public static final int g = 16777216;
  public static final int h = 3;
  public static final int i = 4;
  public static final int j = 5;
  public static final int k = 6;
  public static final String k = "AppViewBaseActivity";
  public static final int l = 7;
  public static final int m = 8;
  protected static final String m = "file:///android_asset/Page/system/";
  public static final int n = 9;
  protected static final String n = "http://sng.qq.com/open/mobile/appstore_qq/";
  public static final int o = 13;
  protected static final String o = "http://sng.qq.com/call?callbatch=";
  public static final int p = 14;
  protected static final String p = "qq.com";
  public static final int q = 102;
  protected static final String q = "应用宝";
  public static final int r = 103;
  protected static final String r = "Meizu_M040";
  public static final int s = 104;
  public OpenJsBridge a;
  protected wso a;
  protected wsp a;
  public long b;
  public Handler b;
  public long c;
  protected Handler c;
  public long d;
  protected long e;
  public long f;
  public long g;
  protected boolean g;
  public boolean h;
  public String l;
  protected String s;
  protected String t;
  protected String u;
  
  public AppViewBaseActivity()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.s = "";
    this.t = "";
    this.jdField_c_of_type_AndroidOsHandler = new AppViewBaseActivity.ExtendHandler(this);
    this.jdField_a_of_type_Wsp = new wsp(this, this);
    this.jdField_a_of_type_Wso = new wso(this, this);
  }
  
  public static void a(boolean paramBoolean)
  {
    jdField_d_of_type_Boolean = paramBoolean;
    if (jdField_d_of_type_Boolean)
    {
      Common.b(true);
      return;
    }
    Common.b(false);
  }
  
  public static boolean a()
  {
    return jdField_d_of_type_Boolean;
  }
  
  public static boolean b()
  {
    return jdField_e_of_type_Boolean;
  }
  
  public Handler a()
  {
    return this.jdField_b_of_type_AndroidOsHandler;
  }
  
  public String a(String paramString1, String paramString2)
  {
    if (Build.VERSION.SDK_INT >= 11) {
      try
      {
        if ((paramString1.startsWith("file:///")) || (paramString1.startsWith("sd://")))
        {
          String str2 = "";
          int i1 = paramString1.lastIndexOf('/');
          int i2 = paramString1.lastIndexOf('?');
          String str1 = str2;
          if (i1 > 0)
          {
            str1 = str2;
            if (i1 < paramString1.length() - 1)
            {
              if (i2 <= 0) {
                break label127;
              }
              str1 = paramString1.substring(i1 + 1, i2);
            }
          }
          while (str1.length() > 0) {
            if (!TextUtils.isEmpty(paramString2))
            {
              return "http://sng.qq.com/open/mobile/appstore_qq/" + str1 + '?' + paramString2;
              label127:
              str1 = paramString1.substring(i1 + 1);
            }
            else
            {
              paramString2 = "http://sng.qq.com/open/mobile/appstore_qq/" + str1;
              return paramString2;
            }
          }
        }
      }
      catch (Exception paramString2)
      {
        LogUtility.e("AppViewBaseActivity", "error happend:" + paramString2.getMessage());
      }
    }
    return paramString1;
  }
  
  public void a(WebView paramWebView, int paramInt, String paramString1, String paramString2) {}
  
  public void a(WebView paramWebView, String paramString) {}
  
  public void a(String paramString) {}
  
  public void a(String paramString1, String paramString2, Object paramObject)
  {
    LogUtility.b("opensdk", ">>start verify html>>");
    if (this.jdField_a_of_type_AndroidWidgetProgressBar != null) {
      this.jdField_a_of_type_AndroidWidgetProgressBar.setVisibility(0);
    }
    ThreadManager.b(new wsn(this, paramObject, paramString2, paramString1));
  }
  
  public boolean a(WebView paramWebView, String paramString)
  {
    return false;
  }
  
  public String b()
  {
    return "";
  }
  
  public void b(Bundle paramBundle)
  {
    int i1 = 0;
    removeWebViewLayerType();
    if (paramBundle == null) {}
    do
    {
      return;
      this.jdField_c_of_type_AndroidWidgetTextView.setVisibility(0);
      this.jdField_a_of_type_AndroidViewView = findViewById(2131296716);
      this.jdField_b_of_type_AndroidViewView = findViewById(2131296715);
    } while (this.jdField_b_of_type_AndroidViewView == null);
    this.jdField_b_of_type_AndroidViewView.setVisibility(4);
    String str1 = paramBundle.getString("visible");
    String str2 = paramBundle.getString("iconType");
    String str3 = paramBundle.getString("rightText");
    if (str1.equals("1")) {
      if (str2.equals("2"))
      {
        this.jdField_b_of_type_AndroidViewView.setVisibility(8);
        this.rightViewText.setVisibility(0);
        this.rightViewText.setText(str3);
        this.rightViewText.setEnabled(true);
        this.jdField_a_of_type_AndroidViewView.setBackgroundResource(i1);
      }
    }
    for (;;)
    {
      this.t = paramBundle.getString("callBackKey");
      return;
      if (str2.equals("0"))
      {
        this.jdField_b_of_type_AndroidViewView.setVisibility(0);
        i1 = 2130838959;
        break;
      }
      this.jdField_b_of_type_AndroidViewView.setVisibility(0);
      i1 = 2130838960;
      break;
      this.jdField_b_of_type_AndroidViewView.setVisibility(4);
    }
  }
  
  public void b(WebView paramWebView, String paramString) {}
  
  public void b(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      d();
      this.jdField_a_of_type_AndroidWidgetProgressBar.setVisibility(0);
      return;
    }
    e();
    this.jdField_a_of_type_AndroidWidgetProgressBar.setVisibility(8);
  }
  
  public String c()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (this.jdField_e_of_type_Long != 0L) {
      localStringBuilder.append("&firstEnter=" + this.jdField_e_of_type_Long);
    }
    if (this.jdField_b_of_type_Long != 0L) {
      localStringBuilder.append("&onCreate=" + this.jdField_b_of_type_Long);
    }
    if (this.jdField_c_of_type_Long != 0L) {
      localStringBuilder.append("&onPageStart=" + this.jdField_c_of_type_Long);
    }
    if (this.jdField_d_of_type_Long != 0L) {
      localStringBuilder.append("&onPageFinish=" + this.jdField_d_of_type_Long);
    }
    if ((this.jdField_f_of_type_Long != 0L) && (this.g != 0L)) {
      localStringBuilder.append("&startVerify=" + this.jdField_f_of_type_Long + "&endVerify=" + this.g);
    }
    if (localStringBuilder.length() > 0) {
      localStringBuilder.deleteCharAt(0);
    }
    return localStringBuilder.toString();
  }
  
  public boolean doOnCreate(Bundle paramBundle)
  {
    super.doOnCreate(paramBundle);
    LogUtility.b("TIMESTAMP", "PagePerformance: AppViewBaseActivity oncreate() started!");
    paramBundle = Build.MANUFACTURER + "_" + Build.MODEL;
    try
    {
      if ((Build.VERSION.SDK_INT >= 11) && (!"Meizu_M040".equals(paramBundle))) {
        getWindow().addFlags(16777216);
      }
      this.l = getClass().getSimpleName();
      this.jdField_b_of_type_Long = System.currentTimeMillis();
      LogUtility.b("LaunchTime", "APP_" + this.l + "_onCreate：" + this.jdField_b_of_type_Long);
      this.jdField_b_of_type_AndroidOsHandler = new Handler(this);
      m();
      if (!jdField_f_of_type_Boolean) {
        i2 = Common.a();
      }
    }
    catch (Exception paramBundle)
    {
      try
      {
        int i2;
        i1 = CommonDataAdapter.a().a().getPackageManager().getPackageInfo(CommonDataAdapter.a().a().getPackageName(), 0).versionCode;
        paramBundle = Common.s();
        String str = CommonDataAdapter.a().d();
        LogUtility.c("AppViewBaseActivity", "checkIsFirstEnter appTabVersionInSD=" + i2 + " qzoneVersion=" + i1 + " agentVersionRecord=" + paramBundle + " agentVersion=" + str);
        if ((i2 != i1) || (!paramBundle.equals(str)))
        {
          this.jdField_e_of_type_Long = System.currentTimeMillis();
          Common.a(i1);
          Common.c(str);
          this.h = true;
          jdField_f_of_type_Boolean = true;
          this.jdField_a_of_type_ComTencentOpenAppcommonJsOpenJsBridge = new OpenJsBridge();
          return true;
          paramBundle = paramBundle;
          LogUtility.c("AppViewBaseActivity", "FLAG_HARDWARE_ACCELERATED>>>", paramBundle);
        }
      }
      catch (PackageManager.NameNotFoundException paramBundle)
      {
        for (;;)
        {
          paramBundle.printStackTrace();
          int i1 = 0;
          continue;
          if (Common.b())
          {
            LogUtility.c("AppViewBaseActivity", "checkIsFirstEnter clearcache");
            jdField_d_of_type_Boolean = true;
            Common.b(false);
          }
        }
      }
    }
  }
  
  public void doOnDestroy()
  {
    if (this.jdField_c_of_type_AndroidOsHandler != null)
    {
      this.jdField_c_of_type_AndroidOsHandler.removeCallbacksAndMessages(null);
      this.jdField_c_of_type_AndroidOsHandler = null;
    }
    if (this.jdField_b_of_type_AndroidOsHandler != null)
    {
      this.jdField_b_of_type_AndroidOsHandler.removeCallbacksAndMessages(null);
      this.jdField_b_of_type_AndroidOsHandler = null;
    }
    if (this.jdField_a_of_type_ComTencentOpenAppcommonJsOpenJsBridge != null)
    {
      this.jdField_a_of_type_ComTencentOpenAppcommonJsOpenJsBridge.a(null);
      this.jdField_a_of_type_ComTencentOpenAppcommonJsOpenJsBridge = null;
    }
    super.doOnDestroy();
    this.jdField_a_of_type_Wsp.a();
    this.jdField_a_of_type_Wso.a();
  }
  
  public void doOnPause()
  {
    jdField_e_of_type_Boolean = false;
    super.doOnPause();
  }
  
  public void doOnResume()
  {
    super.doOnResume();
    MyAppApi.a().a(this);
    CallBackEvent.a().a(true);
    TaskThread.a().a(this.jdField_c_of_type_AndroidOsHandler);
    if (a())
    {
      LogUtility.c("AppViewBaseActivity", "do reload view");
      g();
      a(false);
    }
    jdField_e_of_type_Boolean = true;
    LogUtility.b("TIMESTAMP", "PagePerformance: AppViewBaseActivity onresume() finished!");
  }
  
  protected abstract void g();
  
  public boolean handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    case 5: 
    default: 
      return false;
    case 1: 
      LogUtility.c("AppViewBaseActivity", "receive md5");
      TaskThread.a().a(1);
      return true;
    case 2: 
      TaskThread.a().a(2);
      TaskThread.a().a(1);
      return true;
    case 6: 
      TaskThread.a().a(6);
      return true;
    case 3: 
      g();
      return true;
    case 4: 
      e();
      return true;
    }
    LogUtility.c("AppViewBaseActivity", "receive UPDATED_SYSTEM_FILE msg");
    a(true);
    return true;
  }
  
  protected void m()
  {
    TaskThread.a().a(this.jdField_c_of_type_AndroidOsHandler);
  }
  
  public void n()
  {
    if (!new File(Common.i()).exists())
    {
      this.jdField_b_of_type_AndroidOsHandler.sendEmptyMessageDelayed(2, 2000L);
      return;
    }
    this.jdField_b_of_type_AndroidOsHandler.sendEmptyMessageDelayed(1, 2000L);
  }
  
  public void o()
  {
    CookieSyncManager.createInstance(getApplicationContext());
    CookieManager localCookieManager = CookieManager.getInstance();
    localCookieManager.setAcceptCookie(true);
    localCookieManager.setCookie("qq.com" + '/', "uin=" + HttpBaseUtil.b(String.valueOf(CommonDataAdapter.a().a())) + "; path=/; domain=." + "qq.com" + ";");
    localCookieManager.setCookie("qq.com" + '/', "skey=" + CommonDataAdapter.a().a() + "; path=/; domain=." + "qq.com" + ";");
    localCookieManager.setCookie("qq.com" + '/', "qua=" + CommonDataAdapter.a().e() + "; path=/; domain=." + "qq.com" + ";");
    CookieSyncManager.getInstance().sync();
  }
  
  public boolean showPreview()
  {
    setContentViewNoTitle(2130903156);
    ((TextView)findViewById(2131297390)).setText(2131364471);
    return true;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\open\appcommon\AppViewBaseActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */