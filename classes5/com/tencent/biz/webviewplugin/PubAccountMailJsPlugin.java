package com.tencent.biz.webviewplugin;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.statistics.ReportController;
import com.tencent.mobileqq.utils.DialogUtil;
import com.tencent.mobileqq.utils.QQCustomContextMenuDialog;
import com.tencent.mobileqq.utils.dialogutils.QQCustomMenu;
import com.tencent.mobileqq.webview.swift.JsBridgeListener;
import com.tencent.mobileqq.webview.swift.WebViewPlugin;
import com.tencent.mobileqq.webview.swift.WebViewPlugin.PluginRuntime;
import com.tencent.qphone.base.util.QLog;
import com.tencent.widget.ActionSheet;
import jht;
import jhu;

public class PubAccountMailJsPlugin
  extends WebViewPlugin
{
  public static final int a = 1;
  public static final String a;
  public static final int b = 2;
  public static final String b = "mail";
  public static final String c = "showMenu";
  private android.content.ClipboardManager jdField_a_of_type_AndroidContentClipboardManager;
  private android.text.ClipboardManager jdField_a_of_type_AndroidTextClipboardManager;
  private QQCustomContextMenuDialog jdField_a_of_type_ComTencentMobileqqUtilsQQCustomContextMenuDialog;
  public ActionSheet a;
  public String d = null;
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    jdField_a_of_type_JavaLangString = PubAccountMailJsPlugin.class.getSimpleName();
  }
  
  public PubAccountMailJsPlugin()
  {
    this.jdField_a_of_type_ComTencentWidgetActionSheet = null;
    this.mPluginNameSpace = "mail";
  }
  
  private void a(String paramString1, String paramString2)
  {
    paramString1 = new Intent(paramString1);
    paramString1.setType(paramString2);
    paramString1.putExtra("phone", this.d);
    this.mRuntime.a().startActivity(paramString1);
  }
  
  private void b()
  {
    ReportController.b(null, "CliOper", "", "", "0X8004B43", "0X8004B43", 0, 0, "", "", "", "");
    this.mRuntime.a().startActivity(new Intent("android.intent.action.DIAL", Uri.parse(String.format("tel:%s", new Object[] { this.d }))));
    if (QLog.isColorLevel()) {
      QLog.d(jdField_a_of_type_JavaLangString, 2, String.format("Dial %s success", new Object[] { this.d }));
    }
  }
  
  private void c()
  {
    ReportController.b(null, "CliOper", "", "", "0X8004B44", "0X8004B44", 0, 0, "", "", "", "");
    Intent localIntent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + this.d));
    this.mRuntime.a().startActivity(localIntent);
    if (QLog.isColorLevel()) {
      QLog.d(jdField_a_of_type_JavaLangString, 2, String.format("Send SMS to %s success", new Object[] { this.d }));
    }
  }
  
  private void d()
  {
    Activity localActivity = this.mRuntime.a();
    if (this.jdField_a_of_type_ComTencentMobileqqUtilsQQCustomContextMenuDialog == null)
    {
      QQCustomMenu localQQCustomMenu = new QQCustomMenu();
      localQQCustomMenu.a(1, localActivity.getString(2131371645));
      localQQCustomMenu.a(2, localActivity.getString(2131371646));
      localQQCustomMenu.a(String.format(localActivity.getString(2131371644), new Object[] { this.d }));
      this.jdField_a_of_type_ComTencentMobileqqUtilsQQCustomContextMenuDialog = DialogUtil.a(localActivity, localQQCustomMenu, new jhu(this));
      if (this.jdField_a_of_type_ComTencentMobileqqUtilsQQCustomContextMenuDialog != null) {}
    }
    else
    {
      this.jdField_a_of_type_ComTencentMobileqqUtilsQQCustomContextMenuDialog.setTitle(String.format(localActivity.getString(2131371644), new Object[] { this.d }));
    }
    this.jdField_a_of_type_ComTencentMobileqqUtilsQQCustomContextMenuDialog.show();
  }
  
  private void e()
  {
    if (Build.VERSION.SDK_INT < 11)
    {
      if (this.jdField_a_of_type_AndroidTextClipboardManager == null) {
        this.jdField_a_of_type_AndroidTextClipboardManager = ((android.text.ClipboardManager)this.mRuntime.a().getSystemService("clipboard"));
      }
      this.jdField_a_of_type_AndroidTextClipboardManager.setText(this.d);
    }
    for (;;)
    {
      if (QLog.isColorLevel()) {
        QLog.d(jdField_a_of_type_JavaLangString, 2, String.format("Copy %s success", new Object[] { this.d }));
      }
      return;
      if (this.jdField_a_of_type_AndroidContentClipboardManager == null) {
        this.jdField_a_of_type_AndroidContentClipboardManager = ((android.content.ClipboardManager)this.mRuntime.a().getSystemService("clipboard"));
      }
      ClipData localClipData = ClipData.newPlainText("qqMailTel", this.d);
      this.jdField_a_of_type_AndroidContentClipboardManager.setPrimaryClip(localClipData);
    }
  }
  
  private void f()
  {
    ReportController.b(null, "CliOper", "", "", "0X8004B45", "0X8004B45", 0, 0, "", "", "", "");
    a("android.intent.action.INSERT", "vnd.android.cursor.dir/contact");
  }
  
  private void g()
  {
    ReportController.b(null, "CliOper", "", "", "0X8004B46", "0X8004B46", 0, 0, "", "", "", "");
    a("android.intent.action.INSERT_OR_EDIT", "vnd.android.cursor.item/person");
  }
  
  public void a()
  {
    if (this.jdField_a_of_type_ComTencentWidgetActionSheet == null)
    {
      this.jdField_a_of_type_ComTencentWidgetActionSheet = ActionSheet.a(this.mRuntime.a());
      this.jdField_a_of_type_ComTencentWidgetActionSheet.c(String.format("%s%s", new Object[] { this.mRuntime.a().getString(2131369290), this.d }));
      this.jdField_a_of_type_ComTencentWidgetActionSheet.c(2131371643);
      this.jdField_a_of_type_ComTencentWidgetActionSheet.c(2131371644);
      this.jdField_a_of_type_ComTencentWidgetActionSheet.c(2131369291);
      this.jdField_a_of_type_ComTencentWidgetActionSheet.d(2131367262);
      this.jdField_a_of_type_ComTencentWidgetActionSheet.a(new jht(this));
    }
    for (;;)
    {
      this.jdField_a_of_type_ComTencentWidgetActionSheet.show();
      return;
      this.jdField_a_of_type_ComTencentWidgetActionSheet.a(0, String.format("%s%s", new Object[] { this.mRuntime.a().getString(2131369290), this.d }));
    }
  }
  
  protected boolean handleJsRequest(JsBridgeListener paramJsBridgeListener, String paramString1, String paramString2, String paramString3, String... paramVarArgs)
  {
    boolean bool = true;
    if (QLog.isColorLevel()) {
      QLog.e(jdField_a_of_type_JavaLangString, 2, "handleJsRequest url: " + paramString1 + "pkgName:" + paramString2 + "method:" + paramString3);
    }
    if ((TextUtils.isEmpty(paramString2)) || (!paramString2.startsWith("mail"))) {
      if (QLog.isColorLevel()) {
        QLog.e(jdField_a_of_type_JavaLangString, 2, "pkgName is null");
      }
    }
    do
    {
      do
      {
        return false;
        if (!TextUtils.isEmpty(paramString3)) {
          break;
        }
      } while (!QLog.isColorLevel());
      QLog.e(jdField_a_of_type_JavaLangString, 2, "method is null");
      return false;
      if ((paramVarArgs != null) && (paramVarArgs.length >= 1)) {
        break;
      }
    } while (!QLog.isColorLevel());
    QLog.e(jdField_a_of_type_JavaLangString, 2, "args is empty");
    return false;
    paramJsBridgeListener = paramVarArgs[0];
    if (QLog.isColorLevel()) {
      QLog.d(jdField_a_of_type_JavaLangString, 2, String.format("Params phone is %s", new Object[] { paramJsBridgeListener }));
    }
    if (!TextUtils.isEmpty(paramJsBridgeListener))
    {
      if (!paramString3.equals("showMenu")) {
        break label280;
      }
      if (((this.jdField_a_of_type_ComTencentWidgetActionSheet == null) || (!this.jdField_a_of_type_ComTencentWidgetActionSheet.isShowing())) && ((this.jdField_a_of_type_ComTencentMobileqqUtilsQQCustomContextMenuDialog == null) || (!this.jdField_a_of_type_ComTencentMobileqqUtilsQQCustomContextMenuDialog.isShowing())))
      {
        this.d = paramJsBridgeListener;
        a();
      }
    }
    for (;;)
    {
      return bool;
      if (QLog.isColorLevel())
      {
        QLog.d(jdField_a_of_type_JavaLangString, 2, "mSheet or mDialog is showing, so ignore request");
        bool = false;
        continue;
        if (QLog.isColorLevel()) {
          QLog.e(jdField_a_of_type_JavaLangString, 2, "Phone is empty");
        }
      }
      label280:
      bool = false;
    }
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\com\tencent\biz\webviewplugin\PubAccountMailJsPlugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */