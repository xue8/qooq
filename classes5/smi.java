import android.app.Activity;
import com.tencent.mobileqq.app.BaseActivity;
import com.tencent.mobileqq.app.TroopObserver;
import com.tencent.mobileqq.forward.ForwardShareCardOption;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.troopshare.TroopShareResp;
import com.tencent.mobileqq.widget.QQToast;
import com.tencent.qphone.base.util.QLog;

public class smi
  extends TroopObserver
{
  public smi(ForwardShareCardOption paramForwardShareCardOption)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void a(boolean paramBoolean, TroopShareResp paramTroopShareResp)
  {
    if (QLog.isColorLevel()) {
      QLog.d("ForwardOption.ForwardShareCardOption", 2, "onTroopShareLink start");
    }
    this.a.r();
    if (ForwardShareCardOption.a(this.a) != -1)
    {
      if ((!paramBoolean) || (paramTroopShareResp.jdField_a_of_type_Int != 0)) {
        break label189;
      }
      if (paramTroopShareResp.jdField_a_of_type_Boolean)
      {
        ForwardShareCardOption.a(this.a, paramTroopShareResp.b);
        if (ForwardShareCardOption.a(this.a) == 0) {}
      }
      else
      {
        do
        {
          return;
          ForwardShareCardOption.b(this.a, paramTroopShareResp.b);
        } while (ForwardShareCardOption.a(this.a) != 1);
      }
      if (QLog.isColorLevel()) {
        QLog.d("ForwardOption.ForwardShareCardOption", 2, "mTroopVerifyLink=" + ForwardShareCardOption.a(this.a) + " mTroopNotNeedVefifyLink=" + ForwardShareCardOption.b(this.a));
      }
      if ((paramTroopShareResp.jdField_a_of_type_JavaLangString != null) && (paramTroopShareResp.jdField_a_of_type_JavaLangString.equals(ForwardShareCardOption.c(this.a)))) {
        ForwardShareCardOption.a(this.a);
      }
    }
    for (;;)
    {
      ForwardShareCardOption.a(this.a, -1);
      return;
      label189:
      if (((paramTroopShareResp.jdField_a_of_type_Boolean) && (ForwardShareCardOption.a(this.a) != 0)) || ((!paramTroopShareResp.jdField_a_of_type_Boolean) && (ForwardShareCardOption.a(this.a) != 1))) {
        break;
      }
      QQToast.a(this.a.a, 1, this.a.a.getString(2131369538), 0).b(((BaseActivity)this.a.a).getTitleBarHeight());
    }
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\smi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */