import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

class nsk
  implements DialogInterface.OnClickListener
{
  nsk(nsj paramnsj)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface.dismiss();
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\nsk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */