import android.app.Dialog;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mobileqq.dating.DatingDestinationActivity;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public class rdp
  implements View.OnClickListener
{
  public rdp(DatingDestinationActivity paramDatingDestinationActivity, Dialog paramDialog)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onClick(View paramView)
  {
    this.jdField_a_of_type_ComTencentMobileqqDatingDatingDestinationActivity.a = null;
    this.jdField_a_of_type_ComTencentMobileqqDatingDatingDestinationActivity.d();
    this.jdField_a_of_type_AndroidAppDialog.dismiss();
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\rdp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */