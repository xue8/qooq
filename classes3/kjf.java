import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.tencent.mobileqq.activity.AddFriendVerifyActivity;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.widget.QQToast;
import java.util.ArrayList;
import java.util.regex.Matcher;

public class kjf
  implements View.OnClickListener
{
  public kjf(AddFriendVerifyActivity paramAddFriendVerifyActivity, StringBuffer paramStringBuffer)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onClick(View paramView)
  {
    paramView = this.jdField_a_of_type_JavaLangStringBuffer.toString();
    int i = 0;
    String str;
    if (i < AddFriendVerifyActivity.a(this.jdField_a_of_type_ComTencentMobileqqActivityAddFriendVerifyActivity).size())
    {
      str = ((EditText)AddFriendVerifyActivity.a(this.jdField_a_of_type_ComTencentMobileqqActivityAddFriendVerifyActivity).get(i)).getText().toString().trim();
      if (!"".equals(str)) {}
    }
    for (i = 1;; i = 0)
    {
      if (i != 0)
      {
        QQToast.a(this.jdField_a_of_type_ComTencentMobileqqActivityAddFriendVerifyActivity, 1, this.jdField_a_of_type_ComTencentMobileqqActivityAddFriendVerifyActivity.getString(2131368666), 0).b(this.jdField_a_of_type_ComTencentMobileqqActivityAddFriendVerifyActivity.getTitleBarHeight());
        return;
        paramView = paramView.replaceFirst("\\$\\{answer\\}", Matcher.quoteReplacement(str));
        i += 1;
        break;
      }
      this.jdField_a_of_type_ComTencentMobileqqActivityAddFriendVerifyActivity.a(paramView, null);
      return;
    }
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\kjf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */