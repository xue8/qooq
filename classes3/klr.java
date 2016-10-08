import android.text.TextUtils;
import com.tencent.common.app.AppInterface;
import com.tencent.mobileqq.activity.AuthDevVerifyCodeActivity;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.equipmentlock.EquipmentLockImpl;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.qphone.base.util.QLog;
import mqq.manager.AccountManager;
import mqq.observer.WtloginObserver;
import oicq.wlogin_sdk.devicelock.DevlockInfo;
import oicq.wlogin_sdk.request.WUserSigInfo;
import oicq.wlogin_sdk.tools.ErrMsg;

public class klr
  extends WtloginObserver
{
  public klr(AuthDevVerifyCodeActivity paramAuthDevVerifyCodeActivity)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void OnAskDevLockSms(WUserSigInfo paramWUserSigInfo, DevlockInfo paramDevlockInfo, int paramInt, ErrMsg paramErrMsg)
  {
    if (this.a.isFinishing()) {
      return;
    }
    this.a.d();
    if ((paramInt == 0) && (paramDevlockInfo != null))
    {
      if (QLog.isColorLevel()) {
        QLog.d("Q.devlock.AuthDevVerifyCodeActivity", 2, "OnAskDevLockSms DevlockInfo.TimeLimit:" + paramDevlockInfo.TimeLimit + " AvailableMsgCount:" + paramDevlockInfo.AvailableMsgCount);
      }
      if (paramDevlockInfo.TimeLimit <= 0) {
        paramDevlockInfo.TimeLimit = 60;
      }
      AuthDevVerifyCodeActivity.a(this.a, paramDevlockInfo.TimeLimit);
      return;
    }
    if (QLog.isColorLevel())
    {
      QLog.d("Q.devlock.AuthDevVerifyCodeActivity", 2, "OnAskDevLockSms ret = " + paramInt);
      if (paramErrMsg != null) {
        QLog.d("Q.devlock.AuthDevVerifyCodeActivity", 2, "OnAskDevLockSms  errMsg:" + paramErrMsg.getMessage());
      }
    }
    if ((paramErrMsg != null) && (!TextUtils.isEmpty(paramErrMsg.getMessage())))
    {
      this.a.a(paramErrMsg.getMessage(), 1);
      return;
    }
    paramWUserSigInfo = this.a.getString(2131368479);
    this.a.a(paramWUserSigInfo, 1);
  }
  
  public void OnCheckDevLockSms(WUserSigInfo paramWUserSigInfo, int paramInt, ErrMsg paramErrMsg)
  {
    if (QLog.isColorLevel())
    {
      QLog.d("Q.devlock.AuthDevVerifyCodeActivity", 2, "OnCheckDevLockSms ret = " + paramInt);
      if (paramErrMsg != null) {
        QLog.d("Q.devlock.AuthDevVerifyCodeActivity", 2, "OnCheckDevLockSms  errMsg:" + paramErrMsg.getMessage());
      }
    }
    if (this.a.isFinishing()) {
      return;
    }
    AuthDevVerifyCodeActivity.a(this.a);
    if (paramInt == 0)
    {
      paramWUserSigInfo = (AccountManager)this.a.app.getManager(0);
      if (paramWUserSigInfo != null) {
        paramWUserSigInfo.refreshDA2(this.a.app.a(), null);
      }
      EquipmentLockImpl.a().a(null, this.a.app.a(), 9);
      this.a.setResult(-1);
      this.a.finish();
      EquipmentLockImpl.a().a(AuthDevVerifyCodeActivity.a(this.a), this.a, AuthDevVerifyCodeActivity.a(this.a).getAccount(), true);
      return;
    }
    if ((paramErrMsg != null) && (!TextUtils.isEmpty(paramErrMsg.getMessage())))
    {
      this.a.a(paramErrMsg.getMessage(), 1);
      return;
    }
    this.a.a(2131368512, 1);
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\klr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */