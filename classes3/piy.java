import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public final class piy
  implements DialogInterface.OnClickListener
{
  public piy(Context paramContext)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    ((Activity)this.a).finish();
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\piy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */