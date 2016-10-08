package com.tencent.mobileqq.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler.Callback;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.apkupdate.logic.data.ApkUpdateDetail;
import com.tencent.mobileqq.app.IphoneTitleBarActivity;
import com.tencent.mobileqq.app.upgrade.UpgradeController;
import com.tencent.mobileqq.app.upgrade.UpgradeController.OnStateChangedListener;
import com.tencent.mobileqq.app.upgrade.UpgradeDetailWrapper;
import com.tencent.mobileqq.app.upgrade.UpgradeDetailWrapper.NewApkInfo;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.jsbridge.JsBridge;
import com.tencent.open.downloadnew.MyAppApi;
import com.tencent.qphone.base.util.QLog;
import com.tencent.smtt.sdk.WebSettings;
import com.tencent.smtt.sdk.WebView;
import com.tencent.util.MqqWeakReferenceHandler;
import com.tencent.widget.ProtectedWebView;
import cooperation.qzone.QZoneHelper;
import nab;
import nac;
import protocol.KQQConfig.UpgradeInfo;

public class UpgradeDetailActivity
  extends IphoneTitleBarActivity
  implements Handler.Callback, UpgradeController.OnStateChangedListener
{
  private static final int jdField_a_of_type_Int = 100;
  static final String jdField_a_of_type_JavaLangString = "UpgradeDetailActivity";
  private static final int jdField_b_of_type_Int = 101;
  private static final String jdField_b_of_type_JavaLangString = "need_left_back";
  private static final String c = "detail_wrapper";
  private static final String d = "is_anim";
  private static final String e = "download_right_now";
  private long jdField_a_of_type_Long;
  private View jdField_a_of_type_AndroidViewView;
  public ProgressBar a;
  private UpgradeDetailWrapper jdField_a_of_type_ComTencentMobileqqAppUpgradeUpgradeDetailWrapper;
  private JsBridge jdField_a_of_type_ComTencentMobileqqJsbridgeJsBridge;
  public WebView a;
  MqqWeakReferenceHandler jdField_a_of_type_ComTencentUtilMqqWeakReferenceHandler;
  boolean jdField_a_of_type_Boolean;
  private boolean jdField_b_of_type_Boolean;
  private String f;
  private String g;
  
  public UpgradeDetailActivity()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  private String a()
  {
    return "";
  }
  
  private void a()
  {
    this.jdField_a_of_type_AndroidViewView = findViewById(2131305241);
    this.jdField_a_of_type_AndroidViewView.setVisibility(8);
    this.jdField_a_of_type_ComTencentSmttSdkWebView = ((ProtectedWebView)findViewById(2131305240));
    WebSettings localWebSettings = this.jdField_a_of_type_ComTencentSmttSdkWebView.getSettings();
    localWebSettings.setUserAgentString(localWebSettings.getUserAgentString() + " " + QZoneHelper.a());
    localWebSettings.setJavaScriptEnabled(true);
    localWebSettings.setGeolocationEnabled(true);
    localWebSettings.setCacheMode(2);
    this.jdField_a_of_type_ComTencentSmttSdkWebView.setWebViewClient(new nac(this, null));
    this.jdField_a_of_type_ComTencentSmttSdkWebView.setWebChromeClient(new nab(this, null));
    this.jdField_a_of_type_ComTencentMobileqqJsbridgeJsBridge = new JsBridge();
    this.jdField_a_of_type_ComTencentMobileqqJsbridgeJsBridge.a(new UpgradeDetailActivity.JsCover(this), "qqupgrade");
    this.jdField_a_of_type_AndroidWidgetProgressBar = ((ProgressBar)findViewById(2131305243));
  }
  
  public static void a(Activity paramActivity, UpgradeDetailWrapper paramUpgradeDetailWrapper, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    Intent localIntent = new Intent();
    localIntent.setClass(paramActivity, UpgradeDetailActivity.class);
    localIntent.putExtra("detail_wrapper", paramUpgradeDetailWrapper);
    localIntent.putExtra("is_anim", paramBoolean1);
    localIntent.putExtra("download_right_now", paramBoolean2);
    localIntent.putExtra("need_left_back", paramBoolean3);
    paramActivity.startActivity(localIntent);
    if (paramBoolean1) {
      paramActivity.overridePendingTransition(2130968585, 2130968586);
    }
  }
  
  private boolean a()
  {
    boolean bool = false;
    if (this.jdField_a_of_type_ComTencentSmttSdkWebView.canGoBack()) {
      if (this.jdField_a_of_type_AndroidViewView.getVisibility() == 0) {
        this.jdField_a_of_type_AndroidViewView.setVisibility(8);
      }
    }
    try
    {
      this.jdField_a_of_type_ComTencentSmttSdkWebView.stopLoading();
      this.jdField_a_of_type_ComTencentSmttSdkWebView.goBack();
      bool = true;
      return bool;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  private void b(String paramString)
  {
    if ((!getIntent().getBooleanExtra("need_left_back", true)) && (this.leftView != null)) {
      this.leftView.setVisibility(4);
    }
    setTitle(paramString);
    removeWebViewLayerType();
  }
  
  void a(int paramInt)
  {
    if (this.jdField_a_of_type_ComTencentSmttSdkWebView == null) {
      return;
    }
    this.jdField_a_of_type_ComTencentSmttSdkWebView.loadUrl("javascript:onDownloadStateChanged(" + paramInt + ")");
  }
  
  public void a(int paramInt, UpgradeController paramUpgradeController)
  {
    if (this.jdField_a_of_type_Boolean) {
      this.jdField_a_of_type_ComTencentUtilMqqWeakReferenceHandler.obtainMessage(100, paramInt, 0).sendToTarget();
    }
  }
  
  public void a(String paramString)
  {
    try
    {
      this.jdField_a_of_type_ComTencentSmttSdkWebView.stopLoading();
      this.jdField_a_of_type_ComTencentSmttSdkWebView.loadUrl(paramString);
      if (QLog.isColorLevel()) {
        QLog.d("UpgradeDetailActivity", 2, "loadUrl: " + paramString);
      }
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.jdField_a_of_type_ComTencentSmttSdkWebView.clearView();
    }
    this.jdField_a_of_type_AndroidWidgetProgressBar.setVisibility(8);
    this.jdField_a_of_type_AndroidViewView.setVisibility(0);
  }
  
  public boolean a(String paramString)
  {
    return false;
  }
  
  public void finish()
  {
    if (QLog.isColorLevel()) {
      QLog.d("UpgradeController", 2, "UpgradeDetailActivity.finish start");
    }
    super.finish();
    if (this.jdField_a_of_type_Boolean)
    {
      this.jdField_a_of_type_Boolean = false;
      if (this.jdField_a_of_type_ComTencentUtilMqqWeakReferenceHandler != null)
      {
        this.jdField_a_of_type_ComTencentUtilMqqWeakReferenceHandler.removeMessages(100);
        this.jdField_a_of_type_ComTencentUtilMqqWeakReferenceHandler.removeMessages(101);
      }
      if (this.jdField_a_of_type_ComTencentSmttSdkWebView == null) {}
    }
    try
    {
      this.jdField_a_of_type_ComTencentSmttSdkWebView.loadUrl("javascript:onDestroy()");
      if (this.b) {
        overridePendingTransition(2130968583, 2130968584);
      }
      if (QLog.isColorLevel()) {
        QLog.d("UpgradeController", 2, "UpgradeDetailActivity.finish stop");
      }
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 100) {
      a(paramMessage.arg1);
    }
    for (;;)
    {
      return true;
      if (paramMessage.what == 101) {
        UpgradeController.a().b(false);
      }
    }
  }
  
  protected boolean isWrapContent()
  {
    return false;
  }
  
  public boolean onBackEvent()
  {
    if (a()) {
      return true;
    }
    return super.onBackEvent();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = UpgradeController.a().a();
    if ((paramBundle == null) || (paramBundle.jdField_a_of_type_ProtocolKQQConfigUpgradeInfo == null) || (paramBundle.jdField_a_of_type_ProtocolKQQConfigUpgradeInfo.iUpgradeType <= 0))
    {
      finish();
      return;
    }
    super.setContentView(2130905084);
    removeWebViewLayerType();
    Intent localIntent = getIntent();
    this.jdField_a_of_type_ComTencentMobileqqAppUpgradeUpgradeDetailWrapper = ((UpgradeDetailWrapper)localIntent.getParcelableExtra("detail_wrapper"));
    this.b = localIntent.getBooleanExtra("is_anim", true);
    UpgradeController.a().a(this);
    if (this.jdField_a_of_type_ComTencentMobileqqAppUpgradeUpgradeDetailWrapper.jdField_a_of_type_ComTencentMobileqqAppUpgradeUpgradeDetailWrapper$NewApkInfo != null)
    {
      this.f = this.jdField_a_of_type_ComTencentMobileqqAppUpgradeUpgradeDetailWrapper.jdField_a_of_type_ComTencentMobileqqAppUpgradeUpgradeDetailWrapper$NewApkInfo.b;
      this.g = this.jdField_a_of_type_ComTencentMobileqqAppUpgradeUpgradeDetailWrapper.jdField_a_of_type_ComTencentMobileqqAppUpgradeUpgradeDetailWrapper$NewApkInfo.jdField_a_of_type_JavaLangString;
      this.jdField_a_of_type_Long = this.jdField_a_of_type_ComTencentMobileqqAppUpgradeUpgradeDetailWrapper.jdField_a_of_type_ComTencentMobileqqAppUpgradeUpgradeDetailWrapper$NewApkInfo.jdField_a_of_type_Long;
    }
    if ((this.jdField_a_of_type_ComTencentMobileqqAppUpgradeUpgradeDetailWrapper.jdField_a_of_type_ComTencentApkupdateLogicDataApkUpdateDetail != null) && (this.jdField_a_of_type_ComTencentMobileqqAppUpgradeUpgradeDetailWrapper.jdField_a_of_type_ComTencentApkupdateLogicDataApkUpdateDetail.updatemethod == 4)) {
      this.jdField_a_of_type_Long = Math.min(this.jdField_a_of_type_Long, this.jdField_a_of_type_ComTencentMobileqqAppUpgradeUpgradeDetailWrapper.jdField_a_of_type_ComTencentApkupdateLogicDataApkUpdateDetail.patchsize);
    }
    paramBundle = null;
    if (this.jdField_a_of_type_ComTencentMobileqqAppUpgradeUpgradeDetailWrapper.jdField_a_of_type_ProtocolKQQConfigUpgradeInfo != null) {
      paramBundle = this.jdField_a_of_type_ComTencentMobileqqAppUpgradeUpgradeDetailWrapper.jdField_a_of_type_ProtocolKQQConfigUpgradeInfo.strNewUpgradeDescURL;
    }
    this.jdField_a_of_type_ComTencentUtilMqqWeakReferenceHandler = new MqqWeakReferenceHandler(this);
    if (localIntent.getBooleanExtra("download_right_now", false)) {
      this.jdField_a_of_type_ComTencentUtilMqqWeakReferenceHandler.sendEmptyMessageAtTime(101, 1500L);
    }
    b("版本升级");
    a();
    a(paramBundle);
    this.jdField_a_of_type_AndroidWidgetProgressBar.setVisibility(0);
  }
  
  public void onDestroy()
  {
    if (this.jdField_a_of_type_Boolean)
    {
      this.jdField_a_of_type_Boolean = false;
      if (this.jdField_a_of_type_ComTencentUtilMqqWeakReferenceHandler != null)
      {
        this.jdField_a_of_type_ComTencentUtilMqqWeakReferenceHandler.removeMessages(100);
        this.jdField_a_of_type_ComTencentUtilMqqWeakReferenceHandler.removeMessages(101);
      }
      if (this.jdField_a_of_type_ComTencentSmttSdkWebView == null) {}
    }
    try
    {
      this.jdField_a_of_type_ComTencentSmttSdkWebView.loadUrl("javascript:onDestroy()");
      UpgradeController.a().b(this);
      super.onDestroy();
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.jdField_a_of_type_ComTencentMobileqqJsbridgeJsBridge.a("qqupgrade");
    try
    {
      this.jdField_a_of_type_ComTencentSmttSdkWebView.stopLoading();
      this.jdField_a_of_type_ComTencentSmttSdkWebView.clearView();
      try
      {
        this.jdField_a_of_type_ComTencentSmttSdkWebView.destroy();
        return;
      }
      catch (Exception localException1) {}
    }
    catch (Exception localException2)
    {
      for (;;) {}
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((4 == paramInt) && (a())) {
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void onResume()
  {
    super.onResume();
    MyAppApi.a().a(this);
    try
    {
      if (this.jdField_a_of_type_Boolean) {
        a(UpgradeController.a().a());
      }
      return;
    }
    catch (Exception localException) {}
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\tencent\mobileqq\activity\UpgradeDetailActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */