import android.os.Handler;
import android.os.Message;
import com.tencent.mobileqq.activity.specialcare.QQSpecialCareSettingActivity;
import com.tencent.mobileqq.app.FriendListObserver;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.widget.FormSwitchItem;
import com.tencent.qphone.base.util.QLog;
import java.util.List;

public class plj
  extends FriendListObserver
{
  public plj(QQSpecialCareSettingActivity paramQQSpecialCareSettingActivity)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  protected void a(boolean paramBoolean, Object paramObject)
  {
    if (QLog.isColorLevel()) {
      QLog.d("QQSpecialCareSettingActivity", 2, "onUpdateDelFriend isSuccess: " + paramBoolean + ", uin: " + paramObject);
    }
    QQSpecialCareSettingActivity.b(this.a);
  }
  
  protected void a(boolean paramBoolean1, boolean paramBoolean2, List paramList)
  {
    if (QLog.isColorLevel()) {
      QLog.d("QQSpecialCareSettingActivity", 2, "onUpdateSpecialCareList isSuccess: " + paramBoolean1 + ", isComplete: " + paramBoolean2);
    }
    QQSpecialCareSettingActivity.b(this.a);
  }
  
  protected void a(boolean paramBoolean, Object[] paramArrayOfObject)
  {
    int i = 1;
    if (QLog.isColorLevel()) {
      QLog.d("QQSpecialCareSettingActivity", 2, "onSetSpecialCareSwith_global isSuccess: " + paramBoolean);
    }
    Object localObject;
    boolean bool;
    if (!paramBoolean)
    {
      localObject = QQSpecialCareSettingActivity.a(this.a);
      if (!QQSpecialCareSettingActivity.a(this.a).a())
      {
        bool = true;
        ((FormSwitchItem)localObject).setChecked(bool);
      }
    }
    else
    {
      this.a.a.sendEmptyMessage(8194);
      localObject = this.a.a.obtainMessage(8195);
      if (paramBoolean) {
        i = 2;
      }
      ((Message)localObject).arg1 = i;
      if (!paramBoolean) {
        break label176;
      }
      if (!Boolean.valueOf(((boolean[])(boolean[])paramArrayOfObject[2])[0]).booleanValue()) {
        break label169;
      }
      i = 2131371052;
    }
    for (;;)
    {
      ((Message)localObject).arg2 = i;
      this.a.a.sendMessage((Message)localObject);
      QQSpecialCareSettingActivity.b(this.a);
      return;
      bool = false;
      break;
      label169:
      i = 2131371055;
      continue;
      label176:
      if (((boolean[])(boolean[])paramArrayOfObject[2])[0] != 0) {
        i = 2131371057;
      } else {
        i = 2131371058;
      }
    }
  }
  
  protected void c(boolean paramBoolean, Object[] paramArrayOfObject)
  {
    if (QLog.isColorLevel()) {
      QLog.d("QQSpecialCareSettingActivity", 2, "onSetSpecialCareSwith_specialRing isSuccess: " + paramBoolean);
    }
    QQSpecialCareSettingActivity.b(this.a);
  }
  
  protected void d(boolean paramBoolean, Object[] paramArrayOfObject)
  {
    if (QLog.isColorLevel()) {
      QLog.d("QQSpecialCareSettingActivity", 2, "onSetSpecialCareSwith_qzone isSuccess: " + paramBoolean);
    }
    if (!paramBoolean)
    {
      paramArrayOfObject = QQSpecialCareSettingActivity.b(this.a);
      if (QQSpecialCareSettingActivity.b(this.a).a()) {
        break label64;
      }
    }
    label64:
    for (paramBoolean = true;; paramBoolean = false)
    {
      paramArrayOfObject.setChecked(paramBoolean);
      return;
    }
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\plj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */