import com.tencent.mobileqq.activity.DevlockQuickLoginActivity;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.widget.QQToast;
import com.tencent.qphone.base.util.QLog;
import java.util.ArrayList;
import mqq.observer.WtloginObserver;
import oicq.wlogin_sdk.request.WUserSigInfo;
import oicq.wlogin_sdk.tools.ErrMsg;

public class lfh
  extends WtloginObserver
{
  public lfh(DevlockQuickLoginActivity paramDevlockQuickLoginActivity)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void OnCloseCode(String paramString, byte[] paramArrayOfByte1, long paramLong, WUserSigInfo paramWUserSigInfo, byte[] paramArrayOfByte2, int paramInt, ErrMsg paramErrMsg)
  {
    if (QLog.isColorLevel())
    {
      QLog.d("DevlockQuickLoginActivity", 2, "OnCloseCode userAccount=" + paramString + " ret=" + paramInt + " time=" + paramLong);
      if (paramArrayOfByte2 == null) {}
    }
    try
    {
      paramString = new String(paramArrayOfByte2, "utf-8");
      QLog.d("DevlockQuickLoginActivity", 2, "OnCloseCode errMsg=" + paramString);
      DevlockQuickLoginActivity.a(this.a);
      if (DevlockQuickLoginActivity.a(this.a)) {
        return;
      }
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        paramString.printStackTrace();
      }
      if (paramInt == 0)
      {
        QQToast.a(this.a.getApplicationContext(), 2, 2131370742, 0).b(DevlockQuickLoginActivity.a(this.a));
        DevlockQuickLoginActivity.b(this.a);
        DevlockQuickLoginActivity.a(this.a, 0, 2130968593);
        return;
      }
      if (paramInt == 21)
      {
        paramString = this.a.getString(2131370747);
        paramArrayOfByte1 = this.a.getString(2131370504);
        this.a.a(null, paramString, paramArrayOfByte1, new lfi(this));
        return;
      }
      paramString = DevlockQuickLoginActivity.a(this.a, 2131370743);
      QQToast.a(this.a.getApplicationContext(), 1, paramString, 0).b(DevlockQuickLoginActivity.b(this.a));
    }
  }
  
  public void OnException(String paramString, int paramInt)
  {
    if (QLog.isColorLevel()) {
      QLog.d("DevlockQuickLoginActivity", 2, "OnException e=" + paramString);
    }
    DevlockQuickLoginActivity.a(this.a);
    QQToast.a(DevlockQuickLoginActivity.b(this.a), 1, this.a.getString(2131370746), 0).b(DevlockQuickLoginActivity.d(this.a));
  }
  
  public void OnVerifyCode(String paramString, byte[] paramArrayOfByte1, long paramLong, ArrayList paramArrayList, byte[] paramArrayOfByte2, int paramInt, ErrMsg paramErrMsg)
  {
    if (QLog.isColorLevel()) {
      QLog.d("DevlockQuickLoginActivity", 2, "OnVerifyCode userAccount=" + paramString + " ret=" + paramInt);
    }
    if (DevlockQuickLoginActivity.b(this.a))
    {
      DevlockQuickLoginActivity.a(this.a);
      return;
    }
    if (paramInt == 0)
    {
      this.a.b();
      return;
    }
    DevlockQuickLoginActivity.a(this.a);
    if (paramInt == 21)
    {
      paramString = this.a.getString(2131370747);
      paramArrayOfByte1 = this.a.getString(2131370504);
      this.a.a(null, paramString, paramArrayOfByte1, new lfj(this));
      return;
    }
    paramString = this.a.getString(2131370743);
    QQToast.a(DevlockQuickLoginActivity.a(this.a), 1, paramString, 0).b(DevlockQuickLoginActivity.c(this.a));
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\lfh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */