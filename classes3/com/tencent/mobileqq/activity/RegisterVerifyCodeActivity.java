package com.tencent.mobileqq.activity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.utils.SMSBodyObserver;
import com.tencent.mobileqq.app.utils.SmsContent;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.phonelogin.PhoneNumLoginImpl;
import com.tencent.mobileqq.statistics.ReportController;
import com.tencent.mobileqq.utils.NetworkUtil;
import com.tencent.qphone.base.util.BaseApplication;
import com.tencent.qphone.base.util.QLog;
import com.tencent.widget.ActionSheet;
import com.tencent.widget.ActionSheetHelper;
import mjj;
import mjk;
import mjl;
import mjm;
import mjn;
import mqq.manager.AccountManager;
import mqq.observer.AccountObserver;
import mqq.os.MqqHandler;

public class RegisterVerifyCodeActivity
  extends RegisterBaseActivity
  implements TextWatcher, View.OnClickListener, CompoundButton.OnCheckedChangeListener, SMSBodyObserver
{
  public static final int a = 60;
  private static final String jdField_a_of_type_JavaLangString = "RegisterVerifyCodeActivity";
  public static final int b = 1000;
  private static final String jdField_b_of_type_JavaLangString = "visibility";
  private static final String jdField_c_of_type_JavaLangString = "enableVersion";
  private static final String g = "checked";
  private static final String h = "openDevLockText";
  private static final String i = "openDevLockHelpText";
  private static final String j = "openDevLockHelpURL";
  private Button jdField_a_of_type_AndroidWidgetButton;
  private CheckBox jdField_a_of_type_AndroidWidgetCheckBox;
  private EditText jdField_a_of_type_AndroidWidgetEditText;
  private LinearLayout jdField_a_of_type_AndroidWidgetLinearLayout;
  private TextView jdField_a_of_type_AndroidWidgetTextView;
  private SmsContent jdField_a_of_type_ComTencentMobileqqAppUtilsSmsContent;
  private Runnable jdField_a_of_type_JavaLangRunnable;
  private AccountObserver jdField_a_of_type_MqqObserverAccountObserver;
  private boolean jdField_a_of_type_Boolean;
  private CheckBox jdField_b_of_type_AndroidWidgetCheckBox;
  private LinearLayout jdField_b_of_type_AndroidWidgetLinearLayout;
  private TextView jdField_b_of_type_AndroidWidgetTextView;
  private boolean jdField_b_of_type_Boolean;
  private int jdField_c_of_type_Int;
  private boolean jdField_c_of_type_Boolean;
  private int jdField_d_of_type_Int;
  private boolean jdField_d_of_type_Boolean;
  private boolean e;
  private boolean f;
  private String k;
  private String l;
  
  public RegisterVerifyCodeActivity()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_Boolean = true;
    this.jdField_c_of_type_Boolean = true;
    this.jdField_c_of_type_Int = 60;
    this.jdField_e_of_type_Boolean = true;
    this.jdField_d_of_type_Int = 60;
    this.jdField_a_of_type_JavaLangRunnable = new mjj(this);
    this.jdField_a_of_type_MqqObserverAccountObserver = new mjl(this);
  }
  
  private int a(String paramString1, String paramString2)
  {
    if (QLog.isColorLevel()) {
      QLog.d("RegisterVerifyCodeActivity", 2, "v1:" + paramString1 + " v2:" + paramString2);
    }
    String[] arrayOfString = paramString1.split("\\.");
    paramString2 = paramString2.split("\\.");
    int n;
    int i1;
    if (arrayOfString.length > paramString2.length)
    {
      n = arrayOfString.length;
      i1 = 0;
    }
    for (;;)
    {
      if (i1 >= n) {
        break label141;
      }
      int m;
      int i2;
      for (;;)
      {
        try
        {
          m = Integer.parseInt(arrayOfString[i1]);
        }
        catch (Exception paramString1)
        {
          m = 0;
        }
        try
        {
          i2 = Integer.parseInt(paramString2[i1]);
          if (m <= i2) {
            break label123;
          }
          return 1;
        }
        catch (Exception paramString1)
        {
          for (;;) {}
        }
        n = paramString2.length;
        break;
        paramString1.printStackTrace();
        i2 = 0;
      }
      label123:
      if (m < i2) {
        return -1;
      }
      i1 += 1;
    }
    label141:
    return 0;
  }
  
  public static void a(QQAppInterface paramQQAppInterface, Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    Intent localIntent = new Intent(paramContext, RegisterPersonalInfoActivity.class);
    localIntent.putExtra("phonenum", paramString1);
    localIntent.putExtra("key", paramString2);
    localIntent.putExtra("key_register_now_account", paramString3);
    localIntent.putExtra("key_register_smscode", paramString4);
    paramContext.startActivity(localIntent);
    paramQQAppInterface = paramQQAppInterface.a(RegisterPhoneNumActivity.class);
    if (paramQQAppInterface != null) {
      paramQQAppInterface.sendEmptyMessage(103);
    }
  }
  
  private void b()
  {
    TextView localTextView = (TextView)this.jdField_a_of_type_AndroidViewViewGroup.findViewById(2131301589);
    String str1 = "+" + this.jdField_e_of_type_JavaLangString + "-" + this.jdField_d_of_type_JavaLangString;
    String str2 = getString(2131368539, new Object[] { str1 });
    SpannableString localSpannableString = new SpannableString(str2);
    ForegroundColorSpan localForegroundColorSpan = new ForegroundColorSpan(-881592);
    int m = str2.indexOf(str1);
    int n = str2.indexOf(str1);
    localSpannableString.setSpan(localForegroundColorSpan, m, str1.length() + n, 33);
    localTextView.setText(localSpannableString);
    this.jdField_a_of_type_AndroidWidgetTextView = ((TextView)this.jdField_a_of_type_AndroidViewViewGroup.findViewById(2131301591));
    this.jdField_a_of_type_AndroidWidgetTextView.setOnClickListener(this);
    this.jdField_a_of_type_AndroidWidgetTextView.setText(getString(2131368540) + "(" + this.jdField_c_of_type_Int + ")");
    this.jdField_b_of_type_AndroidOsHandler.postDelayed(this.jdField_a_of_type_JavaLangRunnable, 1000L);
    this.jdField_a_of_type_AndroidWidgetButton = ((Button)this.jdField_a_of_type_AndroidViewViewGroup.findViewById(2131301832));
    this.jdField_a_of_type_AndroidWidgetButton.setOnClickListener(this);
    this.jdField_a_of_type_AndroidWidgetEditText = ((EditText)this.jdField_a_of_type_AndroidViewViewGroup.findViewById(2131298567));
    this.jdField_a_of_type_AndroidWidgetEditText.addTextChangedListener(this);
    this.jdField_a_of_type_AndroidWidgetCheckBox = ((CheckBox)this.jdField_a_of_type_AndroidViewViewGroup.findViewById(2131298437));
    this.jdField_a_of_type_AndroidWidgetCheckBox.setOnCheckedChangeListener(this);
    this.jdField_a_of_type_AndroidWidgetLinearLayout = ((LinearLayout)this.jdField_a_of_type_AndroidViewViewGroup.findViewById(2131298436));
    if (!this.jdField_b_of_type_Boolean)
    {
      this.jdField_b_of_type_AndroidWidgetTextView = ((TextView)this.jdField_a_of_type_AndroidViewViewGroup.findViewById(2131303033));
      this.jdField_b_of_type_AndroidWidgetCheckBox = ((CheckBox)this.jdField_a_of_type_AndroidViewViewGroup.findViewById(2131303032));
      this.jdField_b_of_type_AndroidWidgetCheckBox.setOnCheckedChangeListener(this);
      this.jdField_b_of_type_AndroidWidgetLinearLayout = ((LinearLayout)this.jdField_a_of_type_AndroidViewViewGroup.findViewById(2131303031));
      if (getResources().getDisplayMetrics().heightPixels >= 480) {
        new RegisterVerifyCodeActivity.RegDevLockCfgDownloadTask(this).execute(new Void[0]);
      }
    }
    while (this.jdField_c_of_type_Boolean) {
      return;
    }
    this.jdField_a_of_type_AndroidWidgetLinearLayout.setVisibility(8);
  }
  
  private void b(int paramInt)
  {
    this.jdField_a_of_type_AndroidWidgetTextView.setEnabled(false);
    this.jdField_a_of_type_AndroidWidgetTextView.setClickable(false);
    this.jdField_c_of_type_Int = paramInt;
    this.jdField_a_of_type_AndroidWidgetTextView.setText(getString(2131368540) + "(" + this.jdField_c_of_type_Int + ")");
    this.jdField_b_of_type_AndroidOsHandler.postDelayed(this.jdField_a_of_type_JavaLangRunnable, 1000L);
  }
  
  private void b(QQAppInterface paramQQAppInterface, Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    paramContext = new Intent(this, RegisterByNicknameAndPwdActivity.class);
    paramContext.putExtra("phonenum", paramString1);
    paramContext.putExtra("key", paramString2);
    paramContext.putExtra("key_register_now_account", paramString3);
    paramContext.putExtra("key_register_smscode", paramString4);
    startActivity(paramContext);
    paramQQAppInterface = paramQQAppInterface.a(RegisterPhoneNumActivity.class);
    if (paramQQAppInterface != null) {
      paramQQAppInterface.sendEmptyMessage(103);
    }
  }
  
  private void c()
  {
    ActionSheet localActionSheet = (ActionSheet)ActionSheetHelper.a(this, null);
    localActionSheet.a(getResources().getString(2131368561, new Object[] { this.k }));
    localActionSheet.c(2131368562);
    localActionSheet.c(getResources().getString(2131368563, new Object[] { this.k }));
    localActionSheet.d(2131367262);
    localActionSheet.a(new mjk(this, localActionSheet));
    localActionSheet.show();
    ReportController.a(this.app, "CliOper", "", "", "0X80066E1", "0X80066E1", 0, 0, "", "", "", "");
  }
  
  private void f()
  {
    try
    {
      ((AccountManager)this.app.getManager(0)).sendRegistByResendSms(this.jdField_a_of_type_MqqObserverAccountObserver);
      a(2131368493);
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  private void g()
  {
    Object localObject1 = "";
    Object localObject2 = this.jdField_a_of_type_AndroidWidgetEditText.getText();
    if (localObject2 != null)
    {
      localObject2 = localObject2.toString();
      localObject1 = localObject2;
      if (localObject2 != null) {
        localObject1 = ((String)localObject2).trim();
      }
    }
    for (;;)
    {
      if ((localObject1 != null) && (((String)localObject1).length() > 0)) {
        try
        {
          ((AccountManager)this.app.getManager(0)).sendRegisterByCommitSmsVerifycode((String)localObject1, this.jdField_a_of_type_MqqObserverAccountObserver);
          a(2131368497);
          localObject2 = this.app;
          if (this.jdField_a_of_type_Boolean) {}
          for (localObject1 = "1";; localObject1 = "0")
          {
            ReportController.a((QQAppInterface)localObject2, "CliOper", "", "", "0X80066E0", "0X80066E0", 0, 0, (String)localObject1, "", "", "");
            return;
          }
          a(2131368538, 0);
        }
        catch (Exception localException)
        {
          localException.printStackTrace();
          return;
        }
      }
      return;
    }
  }
  
  public void a()
  {
    PhoneNumLoginImpl.a().a(this.app, this.jdField_f_of_type_Boolean);
    Object localObject1 = "";
    Object localObject2 = this.jdField_a_of_type_AndroidWidgetEditText.getText();
    if (localObject2 != null)
    {
      localObject2 = localObject2.toString();
      localObject1 = localObject2;
      if (localObject2 != null) {
        localObject1 = ((String)localObject2).trim();
      }
    }
    if (this.jdField_b_of_type_Boolean) {
      if (this.jdField_c_of_type_Boolean)
      {
        if (this.jdField_a_of_type_Boolean)
        {
          c();
          return;
        }
        b(this.app, this, this.jdField_d_of_type_JavaLangString, this.jdField_e_of_type_JavaLangString, this.jdField_f_of_type_JavaLangString, (String)localObject1);
      }
    }
    for (;;)
    {
      finish();
      return;
      b(this.app, this, this.jdField_d_of_type_JavaLangString, this.jdField_e_of_type_JavaLangString, this.jdField_f_of_type_JavaLangString, (String)localObject1);
      continue;
      if (this.jdField_a_of_type_Boolean) {
        a(this.app, this, this.jdField_d_of_type_JavaLangString, this.jdField_e_of_type_JavaLangString, this.jdField_f_of_type_JavaLangString, (String)localObject1);
      } else {
        b(this.app, this, this.jdField_d_of_type_JavaLangString, this.jdField_e_of_type_JavaLangString, this.jdField_f_of_type_JavaLangString, (String)localObject1);
      }
    }
  }
  
  public void a(Bundle paramBundle)
  {
    this.app.runOnUiThread(new mjn(this, paramBundle));
  }
  
  public void afterTextChanged(Editable paramEditable)
  {
    if (paramEditable.toString().length() >= 4)
    {
      this.jdField_a_of_type_AndroidWidgetButton.setEnabled(true);
      return;
    }
    this.jdField_a_of_type_AndroidWidgetButton.setEnabled(false);
  }
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void handleMessage(String paramString1, String paramString2)
  {
    runOnUiThread(new mjm(this, paramString1, paramString2));
  }
  
  protected boolean isWrapContent()
  {
    return false;
  }
  
  protected boolean onBackEvent()
  {
    if (this.jdField_c_of_type_Int > 0)
    {
      if (QLog.isColorLevel()) {
        QLog.d("RegisterVerifyCodeActivity", 2, "onBackEvent second=" + this.jdField_c_of_type_Int + ", curTime=" + System.currentTimeMillis());
      }
      getIntent().putExtra("key_register_left_time", this.jdField_c_of_type_Int);
      getIntent().putExtra("key_register_exit_time", System.currentTimeMillis());
      setResult(-1, getIntent());
    }
    finish();
    return false;
  }
  
  public void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    if (paramCompoundButton.getId() == 2131303032) {
      this.jdField_f_of_type_Boolean = paramBoolean;
    }
    do
    {
      do
      {
        return;
        if (!paramBoolean) {
          break;
        }
        ReportController.b(this.app, "CliOper", "", "", "0X8006657", "0X8006657", 0, 0, "", "", "", "");
        this.jdField_a_of_type_Boolean = true;
      } while (this.jdField_b_of_type_AndroidWidgetCheckBox == null);
      this.jdField_b_of_type_AndroidWidgetCheckBox.setEnabled(true);
      return;
      this.jdField_a_of_type_Boolean = false;
    } while (this.jdField_b_of_type_AndroidWidgetCheckBox == null);
    this.jdField_b_of_type_AndroidWidgetCheckBox.setOnCheckedChangeListener(null);
    this.jdField_f_of_type_Boolean = false;
    this.jdField_b_of_type_AndroidWidgetCheckBox.setChecked(false);
    this.jdField_b_of_type_AndroidWidgetCheckBox.setEnabled(false);
    this.jdField_b_of_type_AndroidWidgetCheckBox.setOnCheckedChangeListener(this);
  }
  
  public void onClick(View paramView)
  {
    if (!NetworkUtil.e(BaseApplication.getContext()))
    {
      a(2131367256, 0);
      return;
    }
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131301591: 
      f();
      return;
    }
    g();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.jdField_a_of_type_AndroidViewViewGroup = ((ViewGroup)setContentViewB(2130904521));
    setTitle(2131368537);
    this.jdField_d_of_type_JavaLangString = getIntent().getStringExtra("phonenum");
    this.jdField_e_of_type_JavaLangString = getIntent().getStringExtra("key");
    int m = getIntent().getIntExtra("key_register_left_time", 0);
    long l1 = getIntent().getLongExtra("key_register_exit_time", 0L);
    if (QLog.isColorLevel()) {
      QLog.d("RegisterVerifyCodeActivity", 2, "onCreate countryCode=" + this.jdField_e_of_type_JavaLangString + ", phoneNum=" + this.jdField_d_of_type_JavaLangString + ", leftTime=" + m + ", exitTime=" + l1);
    }
    if ((m > 0) && (m < 60) && (l1 > 0L))
    {
      l1 = System.currentTimeMillis() - l1;
      if ((l1 > 0L) && (l1 < m * 1000L)) {
        this.jdField_c_of_type_Int = (m - (int)(l1 / 1000L));
      }
      if (QLog.isColorLevel()) {
        QLog.d("RegisterVerifyCodeActivity", 2, "onCreate interval=" + l1 + ", second=" + this.jdField_c_of_type_Int);
      }
    }
    this.jdField_f_of_type_JavaLangString = getIntent().getStringExtra("key_register_now_account");
    this.jdField_b_of_type_Boolean = getIntent().getBooleanExtra("key_register_is_phone_num_registered", false);
    this.jdField_c_of_type_Boolean = getIntent().getBooleanExtra("key_register_has_pwd", true);
    this.k = getIntent().getStringExtra("key_register_binded_qq");
    b();
    this.jdField_a_of_type_ComTencentMobileqqAppUtilsSmsContent = new SmsContent(null);
    this.jdField_a_of_type_ComTencentMobileqqAppUtilsSmsContent.a(this, this);
    ReportController.b(this.app, "CliOper", "", "", "0X8006656", "0X8006656", 0, 0, "", "", "", "");
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    d();
    if (this.jdField_a_of_type_ComTencentMobileqqAppUtilsSmsContent != null) {
      this.jdField_a_of_type_ComTencentMobileqqAppUtilsSmsContent.a();
    }
    this.jdField_a_of_type_ComTencentMobileqqAppUtilsSmsContent = null;
    this.jdField_b_of_type_AndroidOsHandler.removeCallbacks(this.jdField_a_of_type_JavaLangRunnable);
  }
  
  protected void onPause()
  {
    super.onPause();
    try
    {
      if ((this.jdField_a_of_type_AndroidAppDialog != null) && (this.jdField_a_of_type_AndroidAppDialog.isShowing())) {
        this.jdField_a_of_type_AndroidAppDialog.dismiss();
      }
      this.jdField_a_of_type_AndroidAppDialog = null;
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\tencent\mobileqq\activity\RegisterVerifyCodeActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */