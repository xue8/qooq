import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ListAdapter;
import com.tencent.mobileqq.dating.widget.InputBar;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.widget.AbsListView.LayoutParams;
import com.tencent.widget.ListView;

public class rgo
  implements Runnable
{
  public rgo(InputBar paramInputBar, int paramInt)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void run()
  {
    if (InputBar.a(this.jdField_a_of_type_ComTencentMobileqqDatingWidgetInputBar) <= this.jdField_a_of_type_Int - InputBar.b(this.jdField_a_of_type_ComTencentMobileqqDatingWidgetInputBar))
    {
      InputBar.a(this.jdField_a_of_type_ComTencentMobileqqDatingWidgetInputBar).setSelectionFromTop(InputBar.d(this.jdField_a_of_type_ComTencentMobileqqDatingWidgetInputBar) + InputBar.c(this.jdField_a_of_type_ComTencentMobileqqDatingWidgetInputBar), this.jdField_a_of_type_Int - InputBar.e(this.jdField_a_of_type_ComTencentMobileqqDatingWidgetInputBar) - InputBar.b(this.jdField_a_of_type_ComTencentMobileqqDatingWidgetInputBar));
      return;
    }
    if (InputBar.a(this.jdField_a_of_type_ComTencentMobileqqDatingWidgetInputBar).a() == null) {}
    for (int i = 0;; i = InputBar.a(this.jdField_a_of_type_ComTencentMobileqqDatingWidgetInputBar).a().getCount())
    {
      int j = InputBar.c(this.jdField_a_of_type_ComTencentMobileqqDatingWidgetInputBar);
      int k = InputBar.a(this.jdField_a_of_type_ComTencentMobileqqDatingWidgetInputBar).n();
      float f = this.jdField_a_of_type_ComTencentMobileqqDatingWidgetInputBar.getResources().getDisplayMetrics().density;
      int m = (int)(61.0F * f);
      j = InputBar.b(this.jdField_a_of_type_ComTencentMobileqqDatingWidgetInputBar) - this.jdField_a_of_type_Int + InputBar.a(this.jdField_a_of_type_ComTencentMobileqqDatingWidgetInputBar).getBottom() - (i - j - k - InputBar.d(this.jdField_a_of_type_ComTencentMobileqqDatingWidgetInputBar) - 1) * m;
      i = j;
      if (InputBar.a(this.jdField_a_of_type_ComTencentMobileqqDatingWidgetInputBar).n() > 0) {
        i = (int)(j - f * 60.0F);
      }
      if (i <= 0) {
        break;
      }
      if (InputBar.a(this.jdField_a_of_type_ComTencentMobileqqDatingWidgetInputBar) != null) {
        InputBar.a(this.jdField_a_of_type_ComTencentMobileqqDatingWidgetInputBar).b(InputBar.a(this.jdField_a_of_type_ComTencentMobileqqDatingWidgetInputBar));
      }
      InputBar.a(this.jdField_a_of_type_ComTencentMobileqqDatingWidgetInputBar, new View(this.jdField_a_of_type_ComTencentMobileqqDatingWidgetInputBar.getContext()));
      InputBar.a(this.jdField_a_of_type_ComTencentMobileqqDatingWidgetInputBar).setLayoutParams(new AbsListView.LayoutParams(-1, i));
      InputBar.a(this.jdField_a_of_type_ComTencentMobileqqDatingWidgetInputBar).b(InputBar.a(this.jdField_a_of_type_ComTencentMobileqqDatingWidgetInputBar));
      break;
    }
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\rgo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */