import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.view.KeyEvent;
import com.tencent.mobileqq.activity.OverloadTipsActivity;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public class lys
  implements DialogInterface.OnKeyListener
{
  public lys(OverloadTipsActivity paramOverloadTipsActivity)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public boolean onKey(DialogInterface paramDialogInterface, int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4) {
      this.a.finish();
    }
    return false;
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\lys.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */