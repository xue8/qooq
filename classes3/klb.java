import android.view.View;
import com.tencent.mobileqq.activity.AuthDevActivity;
import com.tencent.mobileqq.equipmentlock.EquipmentLockImpl;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.statistics.ReportController;
import com.tencent.mobileqq.utils.NetworkUtil;
import com.tencent.mobileqq.widget.QQToast;
import com.tencent.qphone.base.util.QLog;
import com.tencent.widget.ActionSheet;
import com.tencent.widget.ActionSheet.OnButtonClickListener;
import java.util.ArrayList;

public class klb
  implements ActionSheet.OnButtonClickListener
{
  public klb(AuthDevActivity paramAuthDevActivity, String paramString, ArrayList paramArrayList, int paramInt, boolean paramBoolean, long paramLong)
  {
    paramBoolean = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void OnClick(View paramView, int paramInt)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      if ((AuthDevActivity.b(this.jdField_a_of_type_ComTencentMobileqqActivityAuthDevActivity) != null) && (AuthDevActivity.b(this.jdField_a_of_type_ComTencentMobileqqActivityAuthDevActivity).isShowing()) && (!this.jdField_a_of_type_ComTencentMobileqqActivityAuthDevActivity.isFinishing()))
      {
        AuthDevActivity.b(this.jdField_a_of_type_ComTencentMobileqqActivityAuthDevActivity).dismiss();
        AuthDevActivity.b(this.jdField_a_of_type_ComTencentMobileqqActivityAuthDevActivity).cancel();
        AuthDevActivity.b(this.jdField_a_of_type_ComTencentMobileqqActivityAuthDevActivity, null);
      }
      return;
      if (!NetworkUtil.e(this.jdField_a_of_type_ComTencentMobileqqActivityAuthDevActivity))
      {
        QQToast.a(this.jdField_a_of_type_ComTencentMobileqqActivityAuthDevActivity, this.jdField_a_of_type_ComTencentMobileqqActivityAuthDevActivity.getString(2131367256), 0).b(this.jdField_a_of_type_ComTencentMobileqqActivityAuthDevActivity.getTitleBarHeight());
      }
      else
      {
        if (QLog.isColorLevel()) {
          QLog.d("Q.devlock.AuthDevActivity", 2, "OnClick.begin to delAuthDev");
        }
        ReportController.b(this.jdField_a_of_type_ComTencentMobileqqActivityAuthDevActivity.app, "CliOper", "", "", "My_eq_lock", "My_eq_lock_delete", 0, 0, "", "", "", "");
        if (EquipmentLockImpl.a().a(this.jdField_a_of_type_ComTencentMobileqqActivityAuthDevActivity.app, this.jdField_a_of_type_JavaLangString, this.jdField_a_of_type_JavaUtilArrayList, this.jdField_a_of_type_Int, this.jdField_a_of_type_Boolean, this.jdField_a_of_type_Long)) {
          AuthDevActivity.b(this.jdField_a_of_type_ComTencentMobileqqActivityAuthDevActivity);
        } else if (QLog.isColorLevel()) {
          QLog.d("Q.devlock.AuthDevActivity", 2, "OnClick.delAuthDev fail");
        }
      }
    }
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\klb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */