import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.nearby.profilecard.NearbyProfileEditPanel;
import com.tencent.mobileqq.utils.QQCustomDialog;

public class tnn
  implements DialogInterface.OnClickListener
{
  public tnn(NearbyProfileEditPanel paramNearbyProfileEditPanel, QQCustomDialog paramQQCustomDialog)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.jdField_a_of_type_ComTencentMobileqqUtilsQQCustomDialog.dismiss();
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tnn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */