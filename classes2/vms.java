import android.view.View;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.statistics.ReportController;
import com.tencent.mobileqq.troop.data.TroopFileInfo;
import com.tencent.mobileqq.troop.data.TroopFileItemOperation;
import com.tencent.mobileqq.troop.utils.TroopFileManager;
import com.tencent.mobileqq.troop.utils.TroopFileTransferManager;
import com.tencent.widget.ActionSheet;
import com.tencent.widget.ActionSheet.OnButtonClickListener;

public class vms
  implements ActionSheet.OnButtonClickListener
{
  public vms(TroopFileItemOperation paramTroopFileItemOperation, boolean paramBoolean, TroopFileInfo paramTroopFileInfo, ActionSheet paramActionSheet)
  {
    paramBoolean = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void OnClick(View paramView, int paramInt)
  {
    int i = paramInt;
    if (!this.jdField_a_of_type_Boolean) {
      i = paramInt + 1;
    }
    switch (i)
    {
    }
    for (;;)
    {
      this.jdField_a_of_type_ComTencentWidgetActionSheet.dismiss();
      return;
      TroopFileTransferManager.a(this.jdField_a_of_type_ComTencentMobileqqTroopDataTroopFileItemOperation.a, this.jdField_a_of_type_ComTencentMobileqqTroopDataTroopFileItemOperation.b).a(this.jdField_a_of_type_ComTencentMobileqqTroopDataTroopFileInfo.a);
      ReportController.b(this.jdField_a_of_type_ComTencentMobileqqTroopDataTroopFileItemOperation.a, "CliOper", "", "", "Grp", "Clk_delete_local", 0, 0, "", this.jdField_a_of_type_ComTencentMobileqqTroopDataTroopFileItemOperation.b + "", "", "");
      continue;
      if (TroopFileItemOperation.a(this.jdField_a_of_type_ComTencentMobileqqTroopDataTroopFileItemOperation) != 0)
      {
        TroopFileManager.a(this.jdField_a_of_type_ComTencentMobileqqTroopDataTroopFileItemOperation.a, this.jdField_a_of_type_ComTencentMobileqqTroopDataTroopFileItemOperation.b).b(this.jdField_a_of_type_ComTencentMobileqqTroopDataTroopFileInfo);
        ReportController.b(this.jdField_a_of_type_ComTencentMobileqqTroopDataTroopFileItemOperation.a, "CliOper", "", "", "Grp", "Clk_delete_share", 0, 0, "", this.jdField_a_of_type_ComTencentMobileqqTroopDataTroopFileItemOperation.b + "", "", "");
      }
    }
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\vms.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */