import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mobileqq.activity.RegisterActivity;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public class mhs
  implements DialogInterface.OnClickListener
{
  public mhs(RegisterActivity paramRegisterActivity)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.a = 0;
    this.a.finish();
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\mhs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */