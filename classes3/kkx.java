import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.tencent.mobileqq.activity.AuthDevActivity;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.SecSvcHandler;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.utils.NetworkUtil;
import com.tencent.mobileqq.widget.FormSwitchItem;
import com.tencent.mobileqq.widget.QQToast;

public class kkx
  implements CompoundButton.OnCheckedChangeListener
{
  public kkx(AuthDevActivity paramAuthDevActivity)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    boolean bool = true;
    paramBoolean = false;
    if (paramCompoundButton == AuthDevActivity.a(this.a).a())
    {
      AuthDevActivity.a(this.a).setOnCheckedChangeListener(null);
      paramCompoundButton = AuthDevActivity.a(this.a);
      if (AuthDevActivity.a(this.a).a())
      {
        paramBoolean = false;
        paramCompoundButton.setChecked(paramBoolean);
        AuthDevActivity.a(this.a).setOnCheckedChangeListener(AuthDevActivity.a(this.a));
        if (NetworkUtil.e(this.a)) {
          break label118;
        }
        QQToast.a(this.a, this.a.getString(2131367256), 0).b(this.a.getTitleBarHeight());
      }
    }
    label118:
    while (paramCompoundButton != AuthDevActivity.b(this.a).a())
    {
      do
      {
        for (;;)
        {
          return;
          paramBoolean = true;
        }
        paramCompoundButton = (SecSvcHandler)this.a.app.a(34);
      } while (paramCompoundButton == null);
      if (!AuthDevActivity.a(this.a).a()) {}
      for (paramBoolean = bool;; paramBoolean = false)
      {
        paramCompoundButton.a(paramBoolean);
        return;
      }
    }
    AuthDevActivity.b(this.a).setOnCheckedChangeListener(null);
    paramCompoundButton = AuthDevActivity.b(this.a);
    if (AuthDevActivity.b(this.a).a()) {}
    for (;;)
    {
      paramCompoundButton.setChecked(paramBoolean);
      AuthDevActivity.b(this.a).setOnCheckedChangeListener(AuthDevActivity.a(this.a));
      AuthDevActivity.a(this.a);
      return;
      paramBoolean = true;
    }
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\kkx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */