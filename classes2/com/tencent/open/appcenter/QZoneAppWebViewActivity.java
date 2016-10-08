package com.tencent.open.appcenter;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mobileqq.activity.SplashActivity;
import com.tencent.mobileqq.activity.aio.AIOUtils;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.message.QQMessageFacade;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.jsp.AppShareJavaScript;
import com.tencent.mobileqq.utils.ContactUtils;
import com.tencent.open.adapter.CommonDataAdapter;
import com.tencent.open.appcommon.AppViewBaseActivity;
import com.tencent.open.appcommon.Common;
import com.tencent.open.appcommon.js.AppInterface;
import com.tencent.open.appcommon.js.BaseJsCallBack;
import com.tencent.open.appcommon.js.DownloadInterface;
import com.tencent.open.appcommon.js.HttpInterface;
import com.tencent.open.appcommon.js.InterfaceRegisterUtils;
import com.tencent.open.appcommon.js.OpenJsBridge;
import com.tencent.open.base.APNUtil;
import com.tencent.open.base.LogUtility;
import com.tencent.open.base.StringAddition;
import com.tencent.open.business.base.AppUtil;
import com.tencent.open.business.base.StaticAnalyz;
import com.tencent.open.downloadnew.DownloadManager;
import com.tencent.smtt.sdk.WebSettings;
import com.tencent.smtt.sdk.WebSettings.PluginState;
import com.tencent.smtt.sdk.WebView;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import wsi;
import wsj;

public class QZoneAppWebViewActivity
  extends AppViewBaseActivity
  implements View.OnClickListener
{
  protected static Map a;
  protected static final int b = 100;
  protected final long a;
  protected FrameLayout a;
  protected BaseJsCallBack a;
  public WebView a;
  protected ArrayList a;
  protected boolean a;
  protected ArrayList b;
  protected boolean b;
  protected int c;
  protected View c;
  public String c;
  protected boolean c;
  protected int d;
  protected String d;
  protected String e;
  protected String f;
  protected String g;
  protected String h = "loadurl";
  protected String i = "reload";
  protected String j = "onNewIntent";
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    jdField_a_of_type_JavaUtilMap = new HashMap();
    jdField_a_of_type_JavaUtilMap.put("Q-UA", CommonDataAdapter.a().e());
  }
  
  public QZoneAppWebViewActivity()
  {
    this.jdField_c_of_type_JavaLangString = QZoneAppWebViewActivity.class.getSimpleName();
    this.jdField_a_of_type_Long = 1000L;
    this.jdField_a_of_type_Boolean = true;
    this.jdField_b_of_type_Boolean = true;
  }
  
  protected String a()
  {
    Object localObject3 = null;
    Object localObject2 = "";
    String str = "";
    int k = this.jdField_d_of_type_JavaLangString.lastIndexOf(File.separator);
    Object localObject1 = str;
    if (k != -1)
    {
      localObject2 = this.jdField_d_of_type_JavaLangString.substring(k + 1);
      k = ((String)localObject2).indexOf("?");
      if (k == -1) {
        break label169;
      }
      localObject1 = ((String)localObject2).substring(0, k);
      str = ((String)localObject2).substring(k);
    }
    for (;;)
    {
      this.jdField_d_of_type_JavaLangString = (Common.p() + File.separator + (String)localObject1);
      localObject3 = localObject2;
      localObject2 = localObject1;
      localObject1 = str;
      LogUtility.c(this.jdField_c_of_type_JavaLangString, "url urlNoParam params " + (String)localObject3 + " " + (String)localObject2 + " " + (String)localObject1 + " url=" + this.jdField_d_of_type_JavaLangString);
      return this.jdField_d_of_type_JavaLangString;
      label169:
      localObject1 = localObject2;
    }
  }
  
  protected String a(String paramString)
  {
    Object localObject = Common.a(paramString);
    try
    {
      URLDecoder.decode((String)((HashMap)localObject).get("downloadUrl"), "utf-8");
      String str1 = (String)((HashMap)localObject).get("packageName");
      String str2 = (String)((HashMap)localObject).get("id");
      String str3 = (String)((HashMap)localObject).get("channelId");
      LogUtility.b("Jie", "channelId=" + str3);
      if ("2458".equals(str3)) {
        StaticAnalyz.a("200", "ANDROIDQQ.PCPUSH.MSGPUSH", str2);
      }
      int k = AppUtil.a(str1);
      int m = AppUtil.b(DownloadManager.a().a(str2));
      ((HashMap)localObject).put("installedVersion", String.valueOf(k));
      ((HashMap)localObject).put("localVersion", String.valueOf(m));
      ((HashMap)localObject).remove("downloadUrl");
      ((HashMap)localObject).remove("packageName");
      localObject = "&" + Common.a((Map)localObject);
      return (String)localObject;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      localUnsupportedEncodingException.printStackTrace();
      return paramString;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return paramString;
  }
  
  public void a(Bundle paramBundle)
  {
    if ((paramBundle != null) && (paramBundle.containsKey("adapter_action")) && ("action_push_app_detail".equals(paramBundle.getString("adapter_action"))) && (paramBundle.containsKey("friendUin")))
    {
      String str = paramBundle.getString("friendUin");
      int k = paramBundle.getInt("isTroop");
      if (((getAppRuntime() instanceof QQAppInterface)) && (!TextUtils.isEmpty(str)))
      {
        QQAppInterface localQQAppInterface = (QQAppInterface)getAppRuntime();
        localQQAppInterface.a().c(str, k);
        paramBundle.putString("friend_nickname", ContactUtils.b(localQQAppInterface, str, k));
      }
    }
  }
  
  protected void a(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    this.jdField_b_of_type_AndroidOsHandler.sendEmptyMessage(4);
  }
  
  protected void a(WebView paramWebView, String paramString)
  {
    InterfaceRegisterUtils.a(paramWebView, paramString);
    d();
    this.jdField_a_of_type_AndroidWidgetProgressBar.setVisibility(0);
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
  
  protected void a(String paramString, boolean paramBoolean)
  {
    String str;
    if (!paramBoolean) {
      if (paramString.contains("?"))
      {
        str = paramString + "&qua=" + CommonDataAdapter.a().e();
        if (paramString.startsWith("file:///"))
        {
          if ((!paramBoolean) || (this.jdField_a_of_type_JavaUtilArrayList.size() <= 1)) {
            break label270;
          }
          this.jdField_a_of_type_ComTencentOpenAppcommonJsBaseJsCallBack.setParams(this.e + "&current=" + this.jdField_c_of_type_Int + "&platform=" + CommonDataAdapter.a().g());
        }
      }
    }
    for (;;)
    {
      LogUtility.c(this.jdField_c_of_type_JavaLangString, "enter loadurl = " + str + " | " + this.jdField_a_of_type_ComTencentOpenAppcommonJsBaseJsCallBack.getParams());
      if (Build.VERSION.SDK_INT <= 7) {
        break label316;
      }
      paramString = a(str, b() + "&uin=" + this.jdField_a_of_type_ComTencentOpenAppcommonJsBaseJsCallBack.getUin() + "&mobileInfo=" + this.jdField_a_of_type_ComTencentOpenAppcommonJsBaseJsCallBack.getMobileInfo());
      this.jdField_a_of_type_ComTencentSmttSdkWebView.loadUrl(paramString, jdField_a_of_type_JavaUtilMap);
      return;
      str = paramString + "?qua=" + CommonDataAdapter.a().e();
      break;
      str = paramString;
      break;
      label270:
      if (!paramBoolean) {
        this.jdField_a_of_type_ComTencentOpenAppcommonJsBaseJsCallBack.setParams(this.e + "&platform=" + CommonDataAdapter.a().g());
      }
    }
    label316:
    paramString = a(str, b() + "&uin=" + this.jdField_a_of_type_ComTencentOpenAppcommonJsBaseJsCallBack.getUin() + "&mobileInfo=" + this.jdField_a_of_type_ComTencentOpenAppcommonJsBaseJsCallBack.getMobileInfo());
    this.jdField_a_of_type_ComTencentSmttSdkWebView.loadUrl(paramString);
  }
  
  protected boolean a(Bundle paramBundle)
  {
    a(paramBundle);
    String str2;
    if (paramBundle != null)
    {
      if ((paramBundle.containsKey("APP_URL_NOTICE")) && (paramBundle.containsKey("APP_PARAMS_NOTICE")))
      {
        this.jdField_c_of_type_Boolean = true;
        this.jdField_d_of_type_JavaLangString = paramBundle.getString("APP_URL_NOTICE");
        this.e = paramBundle.getString("APP_PARAMS_NOTICE");
        LogUtility.b("Jie", "mparams=" + this.e);
        this.e = a(this.e);
        LogUtility.b("Jie", "new_mparams=" + this.e);
        this.f = paramBundle.getString("friendUin");
        this.jdField_d_of_type_Int = paramBundle.getInt("isTroop");
        this.g = paramBundle.getString("friend_nickname");
        return true;
      }
      String str1 = paramBundle.getString("APP_URL");
      str2 = paramBundle.getString("APP_PARAMS");
      paramBundle = str1;
      if (TextUtils.isEmpty(str1)) {
        paramBundle = this.jdField_d_of_type_JavaLangString;
      }
      this.jdField_d_of_type_JavaLangString = paramBundle;
      if (!TextUtils.isEmpty(str2)) {
        break label211;
      }
    }
    label211:
    for (paramBundle = this.e;; paramBundle = str2)
    {
      this.e = paramBundle;
      return false;
    }
  }
  
  protected boolean a(WebView paramWebView, String paramString)
  {
    try
    {
      if (paramString.startsWith("qapp://"))
      {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(paramString)));
        return true;
      }
      a(paramString, true);
      return true;
    }
    catch (Exception paramWebView)
    {
      LogUtility.e(this.jdField_c_of_type_JavaLangString, "error happend:" + paramWebView.getMessage());
    }
    return false;
  }
  
  public String b()
  {
    if ((this.jdField_a_of_type_ComTencentOpenAppcommonJsBaseJsCallBack != null) && (!TextUtils.isEmpty(this.jdField_a_of_type_ComTencentOpenAppcommonJsBaseJsCallBack.getParams()))) {
      this.e = this.jdField_a_of_type_ComTencentOpenAppcommonJsBaseJsCallBack.getParams();
    }
    return this.e + "&current=" + this.jdField_c_of_type_Int + "&platform=" + CommonDataAdapter.a().g();
  }
  
  public void b(Bundle paramBundle)
  {
    super.b(paramBundle);
    if (paramBundle.getString("iconType").equals("2")) {
      this.rightViewText.setOnClickListener(new wsj(this));
    }
  }
  
  protected void b(WebView paramWebView, String paramString)
  {
    this.jdField_b_of_type_AndroidOsHandler.sendEmptyMessageDelayed(4, 500L);
    this.jdField_a_of_type_AndroidWidgetProgressBar.setVisibility(8);
    if (this.jdField_a_of_type_ComTencentOpenAppcommonJsBaseJsCallBack != null) {
      this.jdField_a_of_type_ComTencentOpenAppcommonJsBaseJsCallBack.timePointParams = c();
    }
  }
  
  protected boolean doOnCreate(Bundle paramBundle)
  {
    setTheme(2131559163);
    super.doOnCreate(paramBundle);
    this.l = getClass().getSimpleName();
    LogUtility.c(this.jdField_c_of_type_JavaLangString, "onCreate()");
    paramBundle = getIntent();
    if (paramBundle != null)
    {
      paramBundle = paramBundle.getExtras();
      paramBundle.putBoolean("IsBack", true);
      a(paramBundle);
      this.jdField_a_of_type_Boolean = paramBundle.getBoolean("showTitle", true);
      this.jdField_a_of_type_JavaUtilArrayList = paramBundle.getStringArrayList("titleName");
      this.jdField_c_of_type_Int = paramBundle.getInt("current", 0);
      if (this.jdField_a_of_type_JavaUtilArrayList == null) {
        this.jdField_a_of_type_JavaUtilArrayList = new ArrayList();
      }
      if (this.jdField_a_of_type_JavaUtilArrayList.size() > 1) {
        this.jdField_b_of_type_JavaUtilArrayList = paramBundle.getStringArrayList("titleTip");
      }
      if (this.jdField_b_of_type_JavaUtilArrayList == null)
      {
        LogUtility.e(this.jdField_c_of_type_JavaLangString, "dont got the tips");
        this.jdField_b_of_type_JavaUtilArrayList = new ArrayList(this.jdField_a_of_type_JavaUtilArrayList.size());
      }
      LogUtility.c(this.jdField_c_of_type_JavaLangString, "mTitleNames =  " + this.jdField_a_of_type_JavaUtilArrayList.toString() + " | " + this.jdField_a_of_type_JavaUtilArrayList.size() + " " + this.jdField_a_of_type_Boolean + " tips = " + this.jdField_b_of_type_JavaUtilArrayList.toString());
      if ((this.jdField_a_of_type_Boolean == true) && (this.jdField_a_of_type_JavaUtilArrayList.size() == 0)) {
        this.jdField_a_of_type_JavaUtilArrayList.add("应用宝");
      }
      CommonDataAdapter.a().b(paramBundle.getLong("uinRestore", 0L));
      j();
      i();
      h();
      this.jdField_b_of_type_AndroidOsHandler.sendEmptyMessage(1);
      return true;
    }
    finish();
    return true;
  }
  
  public void doOnDestroy()
  {
    if (this.jdField_a_of_type_ComTencentSmttSdkWebView != null)
    {
      InterfaceRegisterUtils.a(this.jdField_a_of_type_ComTencentSmttSdkWebView);
      this.jdField_a_of_type_AndroidWidgetFrameLayout.removeAllViews();
      this.jdField_a_of_type_ComTencentSmttSdkWebView.destroy();
      this.jdField_a_of_type_ComTencentSmttSdkWebView = null;
    }
    super.doOnDestroy();
  }
  
  public boolean doOnKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4) {
      l();
    }
    return super.doOnKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void doOnResume()
  {
    super.doOnResume();
    if (!this.jdField_b_of_type_Boolean)
    {
      this.jdField_a_of_type_ComTencentSmttSdkWebView.loadUrl("javascript:if (typeof(QzoneApp) === 'object' && typeof(QzoneApp.fire) === 'function') { QzoneApp.fire('resume');}void(0);");
      return;
    }
    this.jdField_b_of_type_Boolean = false;
  }
  
  protected void doOnStop()
  {
    if (Build.VERSION.SDK_INT < 16) {
      WebView.disablePlatformNotifications();
    }
    super.doOnStop();
  }
  
  protected void f()
  {
    String str1 = "";
    int k = this.jdField_d_of_type_JavaLangString.lastIndexOf(File.separator);
    String str3;
    String str2;
    if (k != -1)
    {
      str3 = this.jdField_d_of_type_JavaLangString.substring(k + 1);
      k = str3.indexOf("?");
      if (k == -1) {
        break label143;
      }
      str2 = str3.substring(0, k);
      str1 = str3.substring(k);
    }
    for (;;)
    {
      LogUtility.c(this.jdField_c_of_type_JavaLangString, "url urlNoParam params " + str3 + " " + str2 + " " + str1);
      if (Common.a()) {
        break;
      }
      this.jdField_d_of_type_JavaLangString = (Common.p() + File.separator + str2);
      return;
      label143:
      str2 = str3;
    }
    if (new File(Common.i() + File.separator + str2).exists())
    {
      this.jdField_d_of_type_JavaLangString = ("file:///" + Common.i() + File.separator + str2);
      return;
    }
    this.jdField_d_of_type_JavaLangString = (Common.p() + File.separator + str2);
  }
  
  protected void g()
  {
    LogUtility.c(this.jdField_c_of_type_JavaLangString, "reloadView " + this.jdField_d_of_type_JavaLangString);
    a(Common.i(), this.jdField_d_of_type_JavaLangString, this.i);
  }
  
  protected void h()
  {
    LogUtility.c(this.jdField_c_of_type_JavaLangString, "enter loadurl = " + this.jdField_d_of_type_JavaLangString);
    a(Common.i(), this.jdField_d_of_type_JavaLangString, this.h);
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    }
    for (;;)
    {
      return super.handleMessage(paramMessage);
      if (this.jdField_c_of_type_AndroidViewView == null) {
        continue;
      }
      this.jdField_c_of_type_AndroidViewView.setVisibility(0);
      continue;
      if (this.jdField_c_of_type_AndroidViewView == null) {
        continue;
      }
      this.jdField_c_of_type_AndroidViewView.setVisibility(8);
      continue;
      if (this.jdField_a_of_type_ComTencentSmttSdkWebView == null) {
        continue;
      }
      String str = a(a(), b() + "&uin=" + this.jdField_a_of_type_ComTencentOpenAppcommonJsBaseJsCallBack.getUin() + "&mobileInfo=" + this.jdField_a_of_type_ComTencentOpenAppcommonJsBaseJsCallBack.getMobileInfo());
      this.jdField_a_of_type_ComTencentOpenAppcommonJsBaseJsCallBack.setParams(this.e + "&platform=" + CommonDataAdapter.a().g());
      LogUtility.c(this.jdField_c_of_type_JavaLangString, "enter loadurl = " + str + " | " + this.jdField_a_of_type_ComTencentOpenAppcommonJsBaseJsCallBack.getParams());
      if (Build.VERSION.SDK_INT > 7) {
        this.jdField_a_of_type_ComTencentSmttSdkWebView.loadUrl(str, jdField_a_of_type_JavaUtilMap);
      }
      for (;;)
      {
        n();
        break;
        this.jdField_a_of_type_ComTencentSmttSdkWebView.loadUrl(str);
      }
      if (this.jdField_a_of_type_ComTencentSmttSdkWebView == null) {
        continue;
      }
      str = (String)paramMessage.obj;
      if (this.h.equals(str))
      {
        if (this.jdField_d_of_type_JavaLangString.startsWith("file:///"))
        {
          f();
          a(this.jdField_d_of_type_JavaLangString, false);
        }
      }
      else {
        label343:
        if (!this.i.equals(str)) {}
      }
      try
      {
        if (this.jdField_d_of_type_JavaLangString.startsWith("file:///"))
        {
          f();
          a(this.jdField_d_of_type_JavaLangString, true);
        }
        while (this.j.equals(str))
        {
          a(this.jdField_d_of_type_JavaLangString, false);
          break;
          a(this.jdField_d_of_type_JavaLangString, false);
          break label343;
          this.jdField_a_of_type_ComTencentSmttSdkWebView.reload();
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          localException.printStackTrace();
        }
      }
    }
  }
  
  protected void i()
  {
    if (Build.VERSION.SDK_INT < 16) {
      WebView.enablePlatformNotifications();
    }
    this.jdField_a_of_type_ComTencentSmttSdkWebView = new WebView(this);
    this.jdField_a_of_type_ComTencentSmttSdkWebView.requestFocus();
    this.jdField_a_of_type_ComTencentSmttSdkWebView.requestFocusFromTouch();
    this.jdField_a_of_type_ComTencentSmttSdkWebView.setWebViewClient(this.jdField_a_of_type_Wsp);
    this.jdField_a_of_type_ComTencentSmttSdkWebView.setScrollBarStyle(0);
    this.jdField_a_of_type_ComTencentSmttSdkWebView.setHorizontalScrollBarEnabled(false);
    this.jdField_a_of_type_ComTencentSmttSdkWebView.setVerticalScrollBarEnabled(false);
    this.jdField_a_of_type_ComTencentSmttSdkWebView.setFocusableInTouchMode(true);
    this.jdField_a_of_type_ComTencentSmttSdkWebView.setWebChromeClient(this.jdField_a_of_type_Wso);
    this.jdField_a_of_type_ComTencentSmttSdkWebView.setOnCreateContextMenuListener(null);
    this.jdField_a_of_type_ComTencentSmttSdkWebView.getView().setOnLongClickListener(new wsi(this));
    Object localObject = this.jdField_a_of_type_ComTencentSmttSdkWebView.getSettings();
    ((WebSettings)localObject).setJavaScriptEnabled(true);
    ((WebSettings)localObject).setAllowFileAccess(true);
    if (APNUtil.b(CommonDataAdapter.a().a())) {
      ((WebSettings)localObject).setCacheMode(-1);
    }
    for (;;)
    {
      ((WebSettings)localObject).setLoadsImagesAutomatically(true);
      ((WebSettings)localObject).setSupportZoom(true);
      ((WebSettings)localObject).setUserAgent(((WebSettings)localObject).getUserAgentString() + " ApiLevel/" + Build.VERSION.SDK_INT + " QQ/" + CommonDataAdapter.a().b() + " Agent/" + CommonDataAdapter.a().d());
      ((WebSettings)localObject).setPluginsEnabled(true);
      if (Build.VERSION.SDK_INT > 7)
      {
        ((WebSettings)localObject).setPluginState(WebSettings.PluginState.ON);
        ((WebSettings)localObject).setDatabaseEnabled(true);
        ((WebSettings)localObject).setDatabasePath(getApplicationContext().getDir("storage", 2).getPath());
        ((WebSettings)localObject).setDomStorageEnabled(true);
        ((WebSettings)localObject).setAppCacheEnabled(true);
        ((WebSettings)localObject).setAppCachePath(getApplicationContext().getDir("cache", 2).getPath());
      }
      localObject = new ArrayList();
      this.jdField_a_of_type_ComTencentOpenAppcommonJsBaseJsCallBack = new BaseJsCallBack(this);
      DownloadInterface localDownloadInterface = new DownloadInterface(this, this.jdField_a_of_type_ComTencentSmttSdkWebView);
      HttpInterface localHttpInterface = new HttpInterface(this, this.jdField_a_of_type_ComTencentSmttSdkWebView);
      AppInterface localAppInterface = new AppInterface(this, this.jdField_a_of_type_ComTencentSmttSdkWebView);
      ((List)localObject).add(this.jdField_a_of_type_ComTencentOpenAppcommonJsBaseJsCallBack);
      ((List)localObject).add(localDownloadInterface);
      ((List)localObject).add(localHttpInterface);
      ((List)localObject).add(localAppInterface);
      InterfaceRegisterUtils.a((List)localObject, this.jdField_a_of_type_ComTencentSmttSdkWebView, this.jdField_d_of_type_JavaLangString, this.jdField_a_of_type_ComTencentOpenAppcommonJsOpenJsBridge);
      this.jdField_a_of_type_ComTencentOpenAppcommonJsOpenJsBridge.a(new AppShareJavaScript(this), "QQApi");
      if (Build.VERSION.SDK_INT >= 11) {
        this.jdField_a_of_type_ComTencentSmttSdkWebView.removeJavascriptInterface("searchBoxJavaBridge_");
      }
      this.jdField_a_of_type_AndroidWidgetFrameLayout = ((FrameLayout)findViewById(2131298844));
      this.jdField_a_of_type_AndroidWidgetFrameLayout.addView(this.jdField_a_of_type_ComTencentSmttSdkWebView);
      o();
      return;
      ((WebSettings)localObject).setCacheMode(1);
    }
  }
  
  protected void j()
  {
    if (!this.jdField_a_of_type_Boolean)
    {
      requestWindowFeature(1);
      getWindow().setContentView(2130903503);
      return;
    }
    setContentView(2130903503);
    removeWebViewLayerType();
    b();
    this.jdField_a_of_type_AndroidWidgetTextView.setText(2131366637);
    this.jdField_a_of_type_AndroidViewView = findViewById(2131296716);
    this.jdField_b_of_type_AndroidViewView = findViewById(2131296715);
    this.jdField_b_of_type_AndroidViewView.setVisibility(4);
    this.jdField_c_of_type_AndroidViewView = findViewById(2131298846);
    k();
    this.jdField_a_of_type_AndroidWidgetTextView.setOnClickListener(this);
    this.jdField_b_of_type_AndroidViewView.setOnClickListener(this);
  }
  
  protected void k()
  {
    this.centerView.setVisibility(8);
    this.jdField_c_of_type_AndroidWidgetTextView.setVisibility(0);
    this.jdField_c_of_type_AndroidWidgetTextView.setText((CharSequence)this.jdField_a_of_type_JavaUtilArrayList.get(0));
    this.jdField_c_of_type_AndroidWidgetTextView.setText(StringAddition.a((String)this.jdField_a_of_type_JavaUtilArrayList.get(0), 16, true, false));
  }
  
  protected void l()
  {
    if ((this.jdField_c_of_type_Boolean) && (!TextUtils.isEmpty(this.f)))
    {
      Intent localIntent = AIOUtils.a(new Intent(this, SplashActivity.class), new int[] { 2 });
      localIntent.putExtra("uin", this.f);
      localIntent.putExtra("uintype", this.jdField_d_of_type_Int);
      localIntent.putExtra("uinname", this.g);
      localIntent.addFlags(536870912);
      startActivity(localIntent);
    }
    finish();
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131297083: 
      l();
      return;
    }
    LogUtility.b(this.jdField_c_of_type_JavaLangString, "button onClick!!!");
    if (TextUtils.isEmpty(this.t))
    {
      d();
      a();
      this.jdField_b_of_type_AndroidOsHandler.sendEmptyMessage(3);
      return;
    }
    this.jdField_a_of_type_ComTencentSmttSdkWebView.loadUrl("javascript:JsBridge.callback(\"" + this.t + "\");void(0);");
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
  }
  
  public void onNewIntent(Intent paramIntent)
  {
    LogUtility.c(this.jdField_c_of_type_JavaLangString, "onNewIntent()");
    paramIntent = paramIntent.getExtras();
    if (a(paramIntent))
    {
      if ((this.jdField_a_of_type_Boolean == true) && (this.jdField_a_of_type_JavaUtilArrayList != null) && (this.jdField_a_of_type_JavaUtilArrayList.size() == 1) && (((String)this.jdField_a_of_type_JavaUtilArrayList.get(0)).equals(getString(2131363041))))
      {
        LogUtility.c(this.jdField_c_of_type_JavaLangString, "reloadDetailPage");
        if ((this.vg != null) && (this.vg.getVisibility() == 8)) {
          this.vg.setVisibility(0);
        }
        a(Common.i(), this.jdField_d_of_type_JavaLangString, this.j);
      }
    }
    else {
      return;
    }
    LogUtility.c(this.jdField_c_of_type_JavaLangString, "start new detail page");
    Intent localIntent = new Intent(getApplicationContext(), QZoneAppWebViewActivity.class);
    localIntent.putExtras(paramIntent);
    startActivity(localIntent);
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\open\appcenter\QZoneAppWebViewActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */