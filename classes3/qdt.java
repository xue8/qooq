import android.content.Intent;
import com.tencent.mobileqq.app.PushBroadcastReceiver;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.qphone.base.util.BaseApplication;
import com.tencent.qphone.base.util.QLog;

public class qdt
  implements Runnable
{
  public qdt(PushBroadcastReceiver paramPushBroadcastReceiver, Intent paramIntent, QQAppInterface paramQQAppInterface)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void run()
  {
    String str = this.jdField_a_of_type_AndroidContentIntent.getStringExtra("classname");
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (str != null) {}
    try
    {
      localObject1 = Class.forName(str);
      this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a(BaseApplication.getContext(), (Class)localObject1);
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      for (;;)
      {
        localObject1 = localObject2;
        if (QLog.isColorLevel())
        {
          QLog.d("processIntent", 2, localClassNotFoundException.getMessage());
          localObject1 = localObject2;
        }
      }
    }
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\qdt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */