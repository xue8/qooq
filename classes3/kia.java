import android.widget.TextView;
import com.tencent.mobileqq.activity.AddFriendActivity;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public class kia
  implements Runnable
{
  public kia(AddFriendActivity paramAddFriendActivity, String paramString)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void run()
  {
    AddFriendActivity.a(this.jdField_a_of_type_ComTencentMobileqqActivityAddFriendActivity).setText(this.jdField_a_of_type_JavaLangString);
    AddFriendActivity.a(this.jdField_a_of_type_ComTencentMobileqqActivityAddFriendActivity).setVisibility(0);
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\kia.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */