package com.tencent.open.applist;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.jsp.AppShareJavaScript;
import com.tencent.open.adapter.CommonDataAdapter;
import com.tencent.open.appcommon.AppViewBaseActivity;
import com.tencent.open.appcommon.Common;
import com.tencent.open.appcommon.TaskThread;
import com.tencent.open.appcommon.js.AppInterface;
import com.tencent.open.appcommon.js.BaseJsCallBack;
import com.tencent.open.appcommon.js.DownloadInterface;
import com.tencent.open.appcommon.js.HttpInterface;
import com.tencent.open.appcommon.js.InterfaceRegisterUtils;
import com.tencent.open.appcommon.js.OpenJsBridge;
import com.tencent.open.base.APNUtil;
import com.tencent.open.base.LogUtility;
import com.tencent.open.base.http.HttpCacheService;
import com.tencent.smtt.sdk.WebSettings;
import com.tencent.smtt.sdk.WebSettings.PluginState;
import com.tencent.smtt.sdk.WebView;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import wtn;
import wto;

public class QZoneAppListActivity
  extends AppViewBaseActivity
{
  protected static final String c = "QZoneAppListActivity";
  protected static String d = "file:///android_asset/Page/system/qapp_center_index.htm";
  private long a;
  protected FrameLayout a;
  protected BaseJsCallBack a;
  public WebView a;
  protected List a;
  protected boolean a;
  protected View c;
  private long h;
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public QZoneAppListActivity()
  {
    this.jdField_a_of_type_Boolean = true;
    this.jdField_a_of_type_JavaUtilList = new ArrayList();
  }
  
  protected void a(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    this.jdField_b_of_type_AndroidOsHandler.sendEmptyMessageDelayed(4, 500L);
  }
  
  protected void a(WebView paramWebView, String paramString)
  {
    InterfaceRegisterUtils.a(paramWebView, paramString);
    d();
  }
  
  public void a(String paramString)
  {
    super.a(paramString);
    try
    {
      this.jdField_a_of_type_ComTencentOpenAppcommonJsOpenJsBridge.a(this.jdField_a_of_type_ComTencentSmttSdkWebView, paramString);
      return;
    }
    catch (Exception paramString) {}
  }
  
  protected boolean a(WebView paramWebView, String paramString)
  {
    paramWebView.loadUrl(paramString);
    return true;
  }
  
  public String b()
  {
    return "";
  }
  
  public void b(Bundle paramBundle)
  {
    super.b(paramBundle);
    this.jdField_b_of_type_AndroidViewView.setOnClickListener(new wtn(this));
  }
  
  protected void b(WebView paramWebView, String paramString)
  {
    this.jdField_b_of_type_AndroidOsHandler.sendEmptyMessageDelayed(4, 500L);
    if (this.jdField_h_of_type_Boolean)
    {
      this.jdField_h_of_type_Boolean = false;
      TaskThread.a().a(14);
    }
    if (this.jdField_a_of_type_ComTencentOpenAppcommonJsBaseJsCallBack != null) {
      this.jdField_a_of_type_ComTencentOpenAppcommonJsBaseJsCallBack.timePointParams = c();
    }
  }
  
  public String c()
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(super.c());
    if (this.jdField_a_of_type_Long != 0L) {
      ((StringBuilder)localObject).append("&initWebViewTime=" + this.jdField_a_of_type_Long);
    }
    if (this.jdField_h_of_type_Long != 0L) {
      ((StringBuilder)localObject).append("&webViewLoadUrlTime=" + this.jdField_h_of_type_Long);
    }
    try
    {
      localObject = URLEncoder.encode(((StringBuilder)localObject).toString(), "UTF-8");
      return (String)localObject;
    }
    catch (Exception localException)
    {
      LogUtility.c("QZoneAppListActivity", "getTimeParams Exception:", localException);
    }
    return "";
  }
  
  protected boolean doOnCreate(Bundle paramBundle)
  {
    LogUtility.b("TIMESTAMP", "PagePerformance: appstore indexpage oncreate()!");
    Common.a();
    super.doOnCreate(paramBundle);
    this.l = getClass().getSimpleName();
    h();
    if (!this.jdField_h_of_type_Boolean) {
      this.jdField_b_of_type_AndroidOsHandler.sendEmptyMessage(1);
    }
    for (;;)
    {
      f();
      return true;
      LogUtility.b("QZoneAppListActivity", "..first login,we will check md5 after loadUrl ");
    }
  }
  
  public void doOnDestroy()
  {
    HttpCacheService.a().b();
    TaskThread.a().b();
    if (this.jdField_a_of_type_ComTencentSmttSdkWebView != null)
    {
      InterfaceRegisterUtils.a(this.jdField_a_of_type_ComTencentSmttSdkWebView);
      this.jdField_a_of_type_AndroidWidgetFrameLayout.removeAllViews();
      this.jdField_a_of_type_ComTencentSmttSdkWebView.destroy();
      this.jdField_a_of_type_ComTencentSmttSdkWebView = null;
      if (this.jdField_a_of_type_JavaUtilList != null) {
        this.jdField_a_of_type_JavaUtilList.clear();
      }
    }
    super.doOnDestroy();
  }
  
  protected void doOnPause()
  {
    super.doOnPause();
    this.jdField_a_of_type_ComTencentSmttSdkWebView.loadUrl("javascript:if (typeof(QzoneApp) === 'object' && typeof(QzoneApp.fire) === 'function') { QzoneApp.fire('resume');}void(0);");
  }
  
  protected void doOnResume()
  {
    super.doOnResume();
    if (!this.jdField_a_of_type_Boolean) {
      this.jdField_a_of_type_ComTencentSmttSdkWebView.loadUrl("javascript:if (typeof(QzoneApp) === 'object' && typeof(QzoneApp.fire) === 'function') { QzoneApp.fire('resume');}void(0);");
    }
    for (;;)
    {
      LogUtility.b("TIMESTAMP", "PagePerformance: appstore indexpage onresume finish!");
      return;
      this.jdField_a_of_type_Boolean = false;
    }
  }
  
  protected void f()
  {
    i();
    if (this.jdField_h_of_type_Boolean)
    {
      a(Common.i(), d, null);
      return;
    }
    a(Common.i(), "file:///" + Common.h(), "");
  }
  
  protected void g()
  {
    String str = this.jdField_a_of_type_ComTencentSmttSdkWebView.getUrl();
    LogUtility.c("IphoneTitleBarActivity", "reloadView;currentUrl=" + str + "; isReloadView()=" + a());
    if (a()) {
      a(false);
    }
    a(Common.i(), str, null);
  }
  
  protected void h()
  {
    setContentView(2130903503);
    removeWebViewLayerType();
    b();
    this.centerView.setVisibility(8);
    this.jdField_c_of_type_AndroidWidgetTextView.setVisibility(0);
    this.jdField_c_of_type_AndroidWidgetTextView.setText("应用宝");
    this.jdField_b_of_type_AndroidViewView.setVisibility(4);
    this.jdField_c_of_type_AndroidViewView = findViewById(2131298846);
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    this.jdField_h_of_type_Long = System.currentTimeMillis();
    switch (paramMessage.what)
    {
    }
    for (;;)
    {
      return super.handleMessage(paramMessage);
      if (this.jdField_c_of_type_AndroidViewView != null)
      {
        this.jdField_c_of_type_AndroidViewView.setVisibility(0);
        continue;
        if (this.jdField_c_of_type_AndroidViewView != null)
        {
          this.jdField_c_of_type_AndroidViewView.setVisibility(8);
          continue;
          LogUtility.b("opensdk", ">>verify load url=" + d);
          if (this.jdField_a_of_type_ComTencentSmttSdkWebView != null)
          {
            if (this.jdField_h_of_type_Boolean) {
              this.jdField_a_of_type_ComTencentSmttSdkWebView.loadUrl(a(d, b() + "&uin=" + this.jdField_a_of_type_ComTencentOpenAppcommonJsBaseJsCallBack.getUin() + "&mobileInfo=" + this.jdField_a_of_type_ComTencentOpenAppcommonJsBaseJsCallBack.getMobileInfo() + "&pageTime=" + c() + "&isFirstEnter=1"));
            }
            for (;;)
            {
              n();
              break;
              this.jdField_a_of_type_ComTencentSmttSdkWebView.loadUrl(a(d, b() + "&uin=" + this.jdField_a_of_type_ComTencentOpenAppcommonJsBaseJsCallBack.getUin() + "&mobileInfo=" + this.jdField_a_of_type_ComTencentOpenAppcommonJsBaseJsCallBack.getMobileInfo() + "&pageTime=" + c() + "&isFirstEnter=0"));
            }
            if (this.jdField_a_of_type_ComTencentSmttSdkWebView != null) {
              if (this.jdField_h_of_type_Boolean)
              {
                this.jdField_a_of_type_ComTencentSmttSdkWebView.loadUrl(a(d, b() + "&uin=" + this.jdField_a_of_type_ComTencentOpenAppcommonJsBaseJsCallBack.getUin() + "&sid=sid" + "&mobileInfo=" + this.jdField_a_of_type_ComTencentOpenAppcommonJsBaseJsCallBack.getMobileInfo() + "&pageTime=" + c() + "&isFirstEnter=1"));
                LogUtility.c("QZoneAppListActivity", "first enter load webview from asset " + d);
              }
              else
              {
                File localFile = new File(Common.h());
                LogUtility.c("QZoneAppListActivity", "load check>>" + localFile.getAbsolutePath());
                if ((Common.a()) && (localFile.exists()))
                {
                  LogUtility.c("QZoneAppListActivity", "load webview from sd " + localFile.getAbsolutePath());
                  this.jdField_a_of_type_ComTencentSmttSdkWebView.loadUrl(a("file:///" + Common.h(), b() + "&uin=" + this.jdField_a_of_type_ComTencentOpenAppcommonJsBaseJsCallBack.getUin() + "&mobileInfo=" + this.jdField_a_of_type_ComTencentOpenAppcommonJsBaseJsCallBack.getMobileInfo() + "&pageTime=" + c() + "&isFirstEnter=0"));
                }
                else
                {
                  LogUtility.c("QZoneAppListActivity", "load webview from asset " + d);
                  this.jdField_a_of_type_ComTencentSmttSdkWebView.loadUrl(a(d, b() + "&uin=" + this.jdField_a_of_type_ComTencentOpenAppcommonJsBaseJsCallBack.getUin() + "&mobileInfo=" + this.jdField_a_of_type_ComTencentOpenAppcommonJsBaseJsCallBack.getMobileInfo() + "&pageTime=" + c() + "&isFirstEnter=0"));
                  continue;
                  if (this.jdField_a_of_type_ComTencentSmttSdkWebView != null) {
                    if (this.jdField_h_of_type_Boolean) {
                      this.jdField_a_of_type_ComTencentSmttSdkWebView.loadUrl(a(d, b() + "&uin=" + this.jdField_a_of_type_ComTencentOpenAppcommonJsBaseJsCallBack.getUin() + "&mobileInfo=" + this.jdField_a_of_type_ComTencentOpenAppcommonJsBaseJsCallBack.getMobileInfo() + "&pageTime=" + c() + "&isFirstEnter=1"));
                    } else {
                      this.jdField_a_of_type_ComTencentSmttSdkWebView.loadUrl(a(d, b() + "&uin=" + this.jdField_a_of_type_ComTencentOpenAppcommonJsBaseJsCallBack.getUin() + "&mobileInfo=" + this.jdField_a_of_type_ComTencentOpenAppcommonJsBaseJsCallBack.getMobileInfo() + "&pageTime=" + c() + "&isFirstEnter=0"));
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  protected void i()
  {
    this.jdField_a_of_type_Long = System.currentTimeMillis();
    this.jdField_a_of_type_ComTencentSmttSdkWebView = new WebView(getApplicationContext());
    this.jdField_a_of_type_ComTencentSmttSdkWebView.setScrollBarStyle(0);
    this.jdField_a_of_type_ComTencentSmttSdkWebView.requestFocus();
    this.jdField_a_of_type_ComTencentSmttSdkWebView.requestFocusFromTouch();
    this.jdField_a_of_type_ComTencentSmttSdkWebView.setFocusableInTouchMode(true);
    this.jdField_a_of_type_ComTencentSmttSdkWebView.setHorizontalScrollBarEnabled(false);
    this.jdField_a_of_type_ComTencentSmttSdkWebView.setVerticalScrollBarEnabled(false);
    this.jdField_a_of_type_ComTencentSmttSdkWebView.setWebViewClient(this.jdField_a_of_type_Wsp);
    this.jdField_a_of_type_ComTencentSmttSdkWebView.setWebChromeClient(this.jdField_a_of_type_Wso);
    this.jdField_a_of_type_ComTencentSmttSdkWebView.setOnCreateContextMenuListener(null);
    this.jdField_a_of_type_ComTencentSmttSdkWebView.getView().setOnLongClickListener(new wto(this));
    Object localObject = this.jdField_a_of_type_ComTencentSmttSdkWebView.getSettings();
    ((WebSettings)localObject).setAllowFileAccess(true);
    ((WebSettings)localObject).setJavaScriptCanOpenWindowsAutomatically(true);
    ((WebSettings)localObject).setLoadsImagesAutomatically(true);
    ((WebSettings)localObject).setJavaScriptEnabled(true);
    ((WebSettings)localObject).setPluginsEnabled(true);
    if (APNUtil.b(CommonDataAdapter.a().a()))
    {
      ((WebSettings)localObject).setCacheMode(-1);
      ((WebSettings)localObject).setBuiltInZoomControls(false);
      ((WebSettings)localObject).setUserAgent(((WebSettings)localObject).getUserAgentString() + " ApiLevel/" + Build.VERSION.SDK_INT + " QQ/" + CommonDataAdapter.a().b() + " Agent/" + CommonDataAdapter.a().d());
      if (Build.VERSION.SDK_INT > 7)
      {
        ((WebSettings)localObject).setPluginState(WebSettings.PluginState.ON);
        ((WebSettings)localObject).setDatabaseEnabled(true);
        ((WebSettings)localObject).setDatabasePath(getApplicationContext().getDir("storage", 2).getPath());
        ((WebSettings)localObject).setDomStorageEnabled(true);
        ((WebSettings)localObject).setAppCacheEnabled(true);
        ((WebSettings)localObject).setAppCachePath(getApplicationContext().getDir("cache", 2).getPath());
      }
      this.jdField_a_of_type_JavaUtilList = new ArrayList();
      this.jdField_a_of_type_ComTencentOpenAppcommonJsBaseJsCallBack = new BaseJsCallBack(this);
      localObject = new DownloadInterface(this, this.jdField_a_of_type_ComTencentSmttSdkWebView);
      HttpInterface localHttpInterface = new HttpInterface(this, this.jdField_a_of_type_ComTencentSmttSdkWebView);
      AppInterface localAppInterface = new AppInterface(this, this.jdField_a_of_type_ComTencentSmttSdkWebView);
      this.jdField_a_of_type_JavaUtilList.add(this.jdField_a_of_type_ComTencentOpenAppcommonJsBaseJsCallBack);
      this.jdField_a_of_type_JavaUtilList.add(localObject);
      this.jdField_a_of_type_JavaUtilList.add(localHttpInterface);
      this.jdField_a_of_type_JavaUtilList.add(localAppInterface);
      if (!new File(Common.h()).exists()) {
        break label561;
      }
      InterfaceRegisterUtils.a(this.jdField_a_of_type_JavaUtilList, this.jdField_a_of_type_ComTencentSmttSdkWebView, "file:///" + Common.h(), this.jdField_a_of_type_ComTencentOpenAppcommonJsOpenJsBridge);
    }
    for (;;)
    {
      o();
      this.jdField_a_of_type_ComTencentOpenAppcommonJsOpenJsBridge.a(new AppShareJavaScript(this), "QQApi");
      if (Build.VERSION.SDK_INT >= 11) {
        this.jdField_a_of_type_ComTencentSmttSdkWebView.removeJavascriptInterface("searchBoxJavaBridge_");
      }
      this.jdField_a_of_type_AndroidWidgetFrameLayout = ((FrameLayout)findViewById(2131298844));
      this.jdField_a_of_type_AndroidWidgetFrameLayout.addView(this.jdField_a_of_type_ComTencentSmttSdkWebView);
      if ((this.jdField_h_of_type_Boolean) && (this.jdField_a_of_type_ComTencentOpenAppcommonJsBaseJsCallBack != null)) {
        this.jdField_a_of_type_ComTencentOpenAppcommonJsBaseJsCallBack.setParams("&isFirstEnter=1");
      }
      return;
      ((WebSettings)localObject).setCacheMode(1);
      break;
      label561:
      InterfaceRegisterUtils.a(this.jdField_a_of_type_JavaUtilList, this.jdField_a_of_type_ComTencentSmttSdkWebView, d, this.jdField_a_of_type_ComTencentOpenAppcommonJsOpenJsBridge);
    }
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\open\applist\QZoneAppListActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */