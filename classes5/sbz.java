import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

class sbz
  implements DialogInterface.OnClickListener
{
  sbz(sbx paramsbx)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface.dismiss();
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\sbz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */