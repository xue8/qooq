import com.tencent.mobileqq.activity.SubAccountSettingActivity;
import com.tencent.mobileqq.app.MessageObserver;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.data.SubAccountInfo;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.subaccount.SubAccountControll;
import com.tencent.mobileqq.subaccount.logic.SubAccountBackProtocData;
import com.tencent.qphone.base.util.QLog;
import com.tencent.util.Pair;
import java.util.ArrayList;

public class mnq
  extends MessageObserver
{
  public mnq(SubAccountSettingActivity paramSubAccountSettingActivity)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void a(boolean paramBoolean, String paramString, SubAccountBackProtocData paramSubAccountBackProtocData)
  {
    if (QLog.isColorLevel())
    {
      QLog.i(SubAccountSettingActivity.a(this.a), 2, "onPushSubAccountMsg() isSuccess=" + paramBoolean + "  subAccount=" + paramString);
      if (paramSubAccountBackProtocData != null) {
        QLog.i(SubAccountSettingActivity.a(this.a), 2, "onPushSubAccountMsg() data.errorType=" + paramSubAccountBackProtocData.p + "  errorMsg=" + paramSubAccountBackProtocData.a + " mainAccount=" + paramSubAccountBackProtocData.jdField_b_of_type_JavaLangString + "  subAccount=" + paramSubAccountBackProtocData.c + " isNeedStartGetMsg=" + paramSubAccountBackProtocData.jdField_b_of_type_Boolean);
      }
    }
    if ((paramSubAccountBackProtocData == null) || (paramString == null) || (paramString.length() < 5)) {}
    SubAccountControll localSubAccountControll;
    label303:
    do
    {
      for (;;)
      {
        return;
        if (!this.a.isFinishing())
        {
          localSubAccountControll = (SubAccountControll)this.a.app.getManager(61);
          if (paramSubAccountBackProtocData.p != 1) {
            break label303;
          }
          if ((SubAccountSettingActivity.a(this.a) == null) || (!paramString.equals(SubAccountSettingActivity.a(this.a).subuin)) || (!this.a.isResume()) || (!SubAccountControll.a(this.a.app, paramString))) {
            break;
          }
          paramString = localSubAccountControll.a(paramString);
          int j = paramString.size();
          int i = 0;
          while (i < j)
          {
            paramSubAccountBackProtocData = (Pair)paramString.get(i);
            localSubAccountControll.a(this.a.app, this.a, paramSubAccountBackProtocData, new mnr(this, localSubAccountControll, paramSubAccountBackProtocData));
            i += 1;
          }
        }
      }
    } while ((SubAccountSettingActivity.a(this.a) == null) || (!paramString.equals(SubAccountSettingActivity.a(this.a).subuin)));
    localSubAccountControll.a(SubAccountSettingActivity.a(this.a).subuin, 1, true);
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\mnq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */