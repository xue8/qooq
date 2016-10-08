import android.content.Intent;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.mobileqq.activity.AuthDevOpenUgActivity;
import com.tencent.mobileqq.activity.LoginInfoActivity;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.equipmentlock.EquipmentLockImpl;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.widget.QQToast;
import mqq.manager.AccountManager;
import mqq.observer.WtloginObserver;
import mqq.os.MqqHandler;
import oicq.wlogin_sdk.devicelock.DevlockInfo;
import oicq.wlogin_sdk.request.WUserSigInfo;
import oicq.wlogin_sdk.tools.ErrMsg;

public class klh
  extends WtloginObserver
{
  public klh(AuthDevOpenUgActivity paramAuthDevOpenUgActivity)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void OnCheckDevLockSms(WUserSigInfo paramWUserSigInfo, int paramInt, ErrMsg paramErrMsg)
  {
    if (paramInt == 0)
    {
      paramWUserSigInfo = (AccountManager)this.a.app.getManager(0);
      if (paramWUserSigInfo != null) {
        paramWUserSigInfo.refreshDA2(this.a.app.a(), null);
      }
      EquipmentLockImpl.a().a(this.a.app, this.a, this.a.app.a(), true);
      QQToast.a(this.a.getApplicationContext(), 2, this.a.getString(2131370706), 0).b(this.a.getTitleBarHeight());
      paramWUserSigInfo = this.a.app.a(LoginInfoActivity.class);
      if (paramWUserSigInfo != null) {
        paramWUserSigInfo.obtainMessage(20140331, 1, 0).sendToTarget();
      }
      AuthDevOpenUgActivity.a(this.a, true, 0);
      paramErrMsg = new Intent();
      paramErrMsg.putExtra("auth_dev_open", true);
      if (AuthDevOpenUgActivity.a(this.a) != null) {}
      for (paramWUserSigInfo = AuthDevOpenUgActivity.a(this.a).Mobile;; paramWUserSigInfo = "")
      {
        paramErrMsg.putExtra("phone_num", paramWUserSigInfo);
        this.a.a(-1, paramErrMsg);
        return;
      }
    }
    if ((paramErrMsg != null) && (!TextUtils.isEmpty(paramErrMsg.getMessage())))
    {
      QQToast.a(this.a.getApplicationContext(), 1, paramErrMsg.getMessage(), 0).b(this.a.getTitleBarHeight());
      return;
    }
    QQToast.a(this.a.getApplicationContext(), 1, this.a.getString(2131370737), 0).b(this.a.getTitleBarHeight());
  }
  
  public void OnCheckDevLockStatus(WUserSigInfo paramWUserSigInfo, DevlockInfo paramDevlockInfo, int paramInt, ErrMsg paramErrMsg)
  {
    if ((paramInt != 0) || (paramDevlockInfo == null))
    {
      QQToast.a(this.a, this.a.getString(2131370739), 0).b(this.a.getTitleBarHeight());
      return;
    }
    AuthDevOpenUgActivity.a(this.a, paramDevlockInfo);
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\klh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */