import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mobileqq.activity.NotificationActivity;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public class lwp
  implements DialogInterface.OnClickListener
{
  public lwp(NotificationActivity paramNotificationActivity)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.finish();
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\lwp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */