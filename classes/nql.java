import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.tencent.mobileqq.activity.ChatActivityUtils;
import com.tencent.mobileqq.activity.aio.item.TextItemBuilder;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.widget.AnimationTextView.OnDoubleClick;

public class nql
  implements AnimationTextView.OnDoubleClick
{
  public nql(TextItemBuilder paramTextItemBuilder)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void a(View paramView)
  {
    com.tencent.mobileqq.activity.aio.AIOUtils.l = true;
    if (TextItemBuilder.b(this.a)) {
      return;
    }
    ChatActivityUtils.a(this.a.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, paramView, (FragmentActivity)this.a.jdField_a_of_type_AndroidContentContext);
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\nql.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */