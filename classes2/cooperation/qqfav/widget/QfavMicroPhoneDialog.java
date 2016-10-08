package cooperation.qqfav.widget;

import android.app.Dialog;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.mobileqq.filemanager.util.FileUtil;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.text.QQTextBuilder;
import com.tencent.mobileqq.utils.VoicePlayer;
import com.tencent.mobileqq.utils.VoicePlayer.VoicePlayerListener;
import com.tencent.mobileqq.widget.OvalProgress;
import mqq.app.AppRuntime;
import ygz;

public class QfavMicroPhoneDialog
  extends Dialog
  implements View.OnClickListener, VoicePlayer.VoicePlayerListener
{
  public static final int a = 7;
  public static final int b = 9;
  public static final int c = 11;
  public static final int d = 12;
  public Context a;
  protected Handler a;
  protected Button a;
  protected EditText a;
  public ImageView a;
  protected RelativeLayout a;
  public TextView a;
  protected VoicePlayer a;
  public OvalProgress a;
  protected QfavMicroPhoneDialog.Listener a;
  protected String a;
  protected int e;
  public int f;
  
  public QfavMicroPhoneDialog(Context paramContext, AppRuntime paramAppRuntime, int paramInt, QfavMicroPhoneDialog.Listener paramListener)
  {
    super(paramContext, 2131558973);
    this.jdField_a_of_type_AndroidOsHandler = new ygz(this);
    this.jdField_a_of_type_CooperationQqfavWidgetQfavMicroPhoneDialog$Listener = paramListener;
    this.jdField_a_of_type_AndroidContentContext = paramContext;
    this.e = paramInt;
    super.setContentView(2130903945);
    this.jdField_a_of_type_AndroidWidgetRelativeLayout = ((RelativeLayout)super.findViewById(2131300776));
    this.jdField_a_of_type_AndroidWidgetRelativeLayout.findViewById(2131300784).setOnClickListener(this);
    this.jdField_a_of_type_ComTencentMobileqqWidgetOvalProgress = ((OvalProgress)super.findViewById(2131300777));
    this.jdField_a_of_type_ComTencentMobileqqWidgetOvalProgress.setOnClickListener(this);
    this.jdField_a_of_type_ComTencentMobileqqWidgetOvalProgress.setBackgroundColor(0);
    this.jdField_a_of_type_AndroidWidgetImageView = ((ImageView)super.findViewById(2131300778));
    this.jdField_a_of_type_AndroidWidgetTextView = ((TextView)this.jdField_a_of_type_AndroidWidgetRelativeLayout.findViewById(2131300779));
    this.jdField_a_of_type_AndroidWidgetButton = ((Button)super.findViewById(2131300783));
    this.jdField_a_of_type_AndroidWidgetButton.setOnClickListener(this);
    this.jdField_a_of_type_AndroidWidgetEditText = ((EditText)super.findViewById(2131300781));
    this.jdField_a_of_type_AndroidWidgetEditText.setEditableFactory(QQTextBuilder.a);
  }
  
  public QfavMicroPhoneDialog(Context paramContext, AppRuntime paramAppRuntime, QfavMicroPhoneDialog.Listener paramListener)
  {
    this(paramContext, paramAppRuntime, 0, paramListener);
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  private void a()
  {
    String str = this.jdField_a_of_type_JavaLangString;
    if ((TextUtils.isEmpty(str)) || (!FileUtil.a(str))) {
      return;
    }
    if (this.jdField_a_of_type_ComTencentMobileqqUtilsVoicePlayer == null)
    {
      this.jdField_a_of_type_ComTencentMobileqqUtilsVoicePlayer = new VoicePlayer(str, this.jdField_a_of_type_AndroidOsHandler, this.e);
      this.jdField_a_of_type_ComTencentMobileqqUtilsVoicePlayer.a(super.getContext());
      this.jdField_a_of_type_ComTencentMobileqqUtilsVoicePlayer.a();
      this.jdField_a_of_type_ComTencentMobileqqUtilsVoicePlayer.a(this);
      this.jdField_a_of_type_ComTencentMobileqqUtilsVoicePlayer.c();
      this.jdField_a_of_type_AndroidWidgetImageView.setImageResource(2130841077);
      return;
    }
    switch (this.jdField_a_of_type_ComTencentMobileqqUtilsVoicePlayer.a())
    {
    default: 
      return;
    case 2: 
      this.jdField_a_of_type_ComTencentMobileqqUtilsVoicePlayer.e();
      this.jdField_a_of_type_AndroidWidgetImageView.setImageResource(2130841076);
      return;
    }
    this.jdField_a_of_type_ComTencentMobileqqUtilsVoicePlayer.c();
    this.jdField_a_of_type_AndroidWidgetImageView.setImageResource(2130841077);
  }
  
  public void a(int paramInt1, String paramString, int paramInt2)
  {
    if (paramInt1 == 8) {
      this.jdField_a_of_type_AndroidOsHandler.sendEmptyMessage(12);
    }
    this.jdField_a_of_type_AndroidOsHandler.sendEmptyMessage(7);
    if (this.jdField_a_of_type_ComTencentMobileqqUtilsVoicePlayer != null) {
      this.jdField_a_of_type_ComTencentMobileqqUtilsVoicePlayer.f();
    }
    this.jdField_a_of_type_ComTencentMobileqqUtilsVoicePlayer = null;
  }
  
  public void a(String paramString, int paramInt1, int paramInt2)
  {
    this.jdField_a_of_type_ComTencentMobileqqWidgetOvalProgress.setProgressParams(paramInt1, paramInt2);
  }
  
  public boolean a(String paramString, int paramInt)
  {
    this.f = paramInt;
    if ((!TextUtils.isEmpty(paramString)) && (FileUtil.a(paramString)) && (this.f > 0))
    {
      this.jdField_a_of_type_JavaLangString = paramString;
      this.f = paramInt;
      this.jdField_a_of_type_AndroidWidgetTextView.setText(Integer.toString(paramInt) + "\"");
      return true;
    }
    return false;
  }
  
  public void b(String paramString, int paramInt1, int paramInt2)
  {
    this.jdField_a_of_type_AndroidOsHandler.sendEmptyMessage(9);
  }
  
  public void onClick(View paramView)
  {
    int j = 1;
    if (paramView == null) {
      return;
    }
    int i = j;
    switch (paramView.getId())
    {
    default: 
      i = 0;
    }
    while (i != 0)
    {
      if (this.jdField_a_of_type_ComTencentMobileqqUtilsVoicePlayer != null) {
        this.jdField_a_of_type_ComTencentMobileqqUtilsVoicePlayer.f();
      }
      cancel();
      return;
      a();
      i = 0;
      continue;
      i = j;
      if (this.jdField_a_of_type_CooperationQqfavWidgetQfavMicroPhoneDialog$Listener != null)
      {
        this.jdField_a_of_type_CooperationQqfavWidgetQfavMicroPhoneDialog$Listener.a(this.jdField_a_of_type_JavaLangString, this.f, this.jdField_a_of_type_AndroidWidgetEditText.getText().toString());
        i = j;
      }
    }
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\cooperation\qqfav\widget\QfavMicroPhoneDialog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */