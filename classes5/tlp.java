import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.utils.QQCustomDialog;

class tlp
  implements DialogInterface.OnClickListener
{
  tlp(tlm paramtlm, QQCustomDialog paramQQCustomDialog)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.jdField_a_of_type_ComTencentMobileqqUtilsQQCustomDialog.dismiss();
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tlp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */