import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

class wqb
  implements DialogInterface.OnClickListener
{
  wqb(wqa paramwqa)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface.dismiss();
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\wqb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */