import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.mobileqq.activity.UpgradeActivity;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public class mzr
  implements DialogInterface.OnDismissListener
{
  public mzr(UpgradeActivity paramUpgradeActivity)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onDismiss(DialogInterface paramDialogInterface)
  {
    this.a.finish();
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\mzr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */