import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import com.tencent.av.VideoController;
import com.tencent.av.app.VideoAppInterface;
import com.tencent.av.ui.VideoInviteActivity;
import com.tencent.mobileqq.gesturelock.GesturePWDUtils;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.statistics.ReportController;
import com.tencent.mobileqq.utils.QQUtils;
import com.tencent.widget.ActionSheet;
import com.tencent.widget.ActionSheet.OnButtonClickListener;

public class gze
  implements ActionSheet.OnButtonClickListener
{
  public gze(VideoInviteActivity paramVideoInviteActivity, ActionSheet paramActionSheet, boolean paramBoolean)
  {
    paramBoolean = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void OnClick(View paramView, int paramInt)
  {
    this.jdField_a_of_type_ComTencentWidgetActionSheet.dismiss();
    if ((this.jdField_a_of_type_ComTencentAvUiVideoInviteActivity.jdField_a_of_type_AndroidWidgetImageButton != null) && (this.jdField_a_of_type_ComTencentAvUiVideoInviteActivity.jdField_b_of_type_AndroidWidgetImageButton != null))
    {
      this.jdField_a_of_type_ComTencentAvUiVideoInviteActivity.jdField_a_of_type_AndroidWidgetImageButton.setEnabled(true);
      this.jdField_a_of_type_ComTencentAvUiVideoInviteActivity.jdField_b_of_type_AndroidWidgetImageButton.setEnabled(true);
    }
    gzf localgzf;
    switch (paramInt)
    {
    default: 
      paramView = null;
      this.jdField_a_of_type_ComTencentAvUiVideoInviteActivity.a(true);
      if (this.jdField_a_of_type_ComTencentAvUiVideoInviteActivity.jdField_a_of_type_ComTencentAvVideoController != null)
      {
        this.jdField_a_of_type_ComTencentAvUiVideoInviteActivity.jdField_a_of_type_ComTencentAvVideoController.a(this.jdField_a_of_type_ComTencentAvUiVideoInviteActivity.jdField_e_of_type_Int, this.jdField_a_of_type_ComTencentAvUiVideoInviteActivity.jdField_d_of_type_JavaLangString, this.jdField_a_of_type_ComTencentAvUiVideoInviteActivity.jdField_e_of_type_JavaLangString, this.jdField_a_of_type_ComTencentAvUiVideoInviteActivity.f, paramView, this.jdField_a_of_type_ComTencentAvUiVideoInviteActivity.jdField_i_of_type_Boolean);
        if ((this.jdField_a_of_type_ComTencentAvUiVideoInviteActivity.jdField_i_of_type_Boolean) && (QQUtils.a(VideoInviteActivity.d(this.jdField_a_of_type_ComTencentAvUiVideoInviteActivity))))
        {
          paramView = this.jdField_a_of_type_ComTencentAvUiVideoInviteActivity.jdField_a_of_type_ComTencentAvAppVideoAppInterface.a();
          localgzf = new gzf(this);
          if (!GesturePWDUtils.getJumpLock(this.jdField_a_of_type_ComTencentAvUiVideoInviteActivity, this.jdField_a_of_type_ComTencentAvUiVideoInviteActivity.jdField_a_of_type_ComTencentAvAppVideoAppInterface.a())) {
            break label636;
          }
        }
      }
      break;
    }
    label636:
    for (long l = 500L;; l = 0L)
    {
      paramView.postDelayed(localgzf, l);
      return;
      if (this.jdField_a_of_type_Boolean)
      {
        if (this.jdField_a_of_type_ComTencentAvUiVideoInviteActivity.jdField_b_of_type_Boolean) {}
        for (paramView = "0X80043A0";; paramView = "0X80043B2")
        {
          ReportController.b(null, "CliOper", "", "", paramView, paramView, 0, 0, Integer.toString(this.jdField_a_of_type_ComTencentAvUiVideoInviteActivity.jdField_d_of_type_Int), Integer.toString(this.jdField_a_of_type_ComTencentAvUiVideoInviteActivity.jdField_i_of_type_Int), Integer.toString(this.jdField_a_of_type_ComTencentAvUiVideoInviteActivity.j), "");
          paramView = VideoInviteActivity.a(this.jdField_a_of_type_ComTencentAvUiVideoInviteActivity).getString(2131363634);
          break;
        }
      }
      if (this.jdField_a_of_type_ComTencentAvUiVideoInviteActivity.jdField_b_of_type_Boolean) {}
      for (paramView = "0X80043A6";; paramView = "0X80043AC") {
        break;
      }
      if (this.jdField_a_of_type_Boolean)
      {
        if (this.jdField_a_of_type_ComTencentAvUiVideoInviteActivity.jdField_b_of_type_Boolean) {}
        for (paramView = "0X80043A1";; paramView = "0X80043B3")
        {
          ReportController.b(null, "CliOper", "", "", paramView, paramView, 0, 0, Integer.toString(this.jdField_a_of_type_ComTencentAvUiVideoInviteActivity.jdField_d_of_type_Int), Integer.toString(this.jdField_a_of_type_ComTencentAvUiVideoInviteActivity.jdField_i_of_type_Int), "", "");
          paramView = VideoInviteActivity.b(this.jdField_a_of_type_ComTencentAvUiVideoInviteActivity).getString(2131363635);
          break;
        }
      }
      if (this.jdField_a_of_type_ComTencentAvUiVideoInviteActivity.jdField_b_of_type_Boolean) {}
      for (paramView = "0X80043A7";; paramView = "0X80043AD") {
        break;
      }
      if (this.jdField_a_of_type_Boolean)
      {
        if (this.jdField_a_of_type_ComTencentAvUiVideoInviteActivity.jdField_b_of_type_Boolean) {}
        for (paramView = "0X80043A2";; paramView = "0X80043B4")
        {
          ReportController.b(null, "CliOper", "", "", paramView, paramView, 0, 0, Integer.toString(this.jdField_a_of_type_ComTencentAvUiVideoInviteActivity.jdField_d_of_type_Int), Integer.toString(this.jdField_a_of_type_ComTencentAvUiVideoInviteActivity.jdField_i_of_type_Int), "", "");
          paramView = VideoInviteActivity.c(this.jdField_a_of_type_ComTencentAvUiVideoInviteActivity).getString(2131363636);
          break;
        }
      }
      if (this.jdField_a_of_type_ComTencentAvUiVideoInviteActivity.jdField_b_of_type_Boolean) {}
      for (paramView = "0X80043A8";; paramView = "0X80043AE") {
        break;
      }
      this.jdField_a_of_type_ComTencentAvUiVideoInviteActivity.jdField_i_of_type_Boolean = true;
      if (this.jdField_a_of_type_Boolean)
      {
        if (this.jdField_a_of_type_ComTencentAvUiVideoInviteActivity.jdField_b_of_type_Boolean) {}
        for (paramView = "0X80043A3";; paramView = "0X80043B5")
        {
          ReportController.b(null, "CliOper", "", "", paramView, paramView, 0, 0, Integer.toString(this.jdField_a_of_type_ComTencentAvUiVideoInviteActivity.jdField_d_of_type_Int), Integer.toString(this.jdField_a_of_type_ComTencentAvUiVideoInviteActivity.jdField_i_of_type_Int), "", "");
          paramView = null;
          break;
        }
      }
      if (this.jdField_a_of_type_ComTencentAvUiVideoInviteActivity.jdField_b_of_type_Boolean) {}
      for (paramView = "0X80043A9";; paramView = "0X80043AF") {
        break;
      }
    }
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\gze.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */