import com.tencent.mobileqq.filemanager.core.WeiYunLogicCenter;
import com.tencent.mobileqq.filemanager.data.FileManagerEntity;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.troop.data.TroopFileStatusInfo;
import com.tencent.mobileqq.troop.utils.TroopFileTransferManager;
import com.tencent.qphone.base.util.QLog;
import com.weiyun.sdk.IWyFileSystem.CommonFtnFile;
import com.weiyun.sdk.IWyFileSystem.IWyCallback;
import com.weiyun.sdk.IWyFileSystem.WyErrorStatus;

public class saq
  implements IWyFileSystem.IWyCallback
{
  public saq(WeiYunLogicCenter paramWeiYunLogicCenter, FileManagerEntity paramFileManagerEntity, TroopFileTransferManager paramTroopFileTransferManager, TroopFileStatusInfo paramTroopFileStatusInfo)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void a(IWyFileSystem.CommonFtnFile paramCommonFtnFile)
  {
    paramCommonFtnFile = paramCommonFtnFile.guid;
    if ((paramCommonFtnFile == null) || (paramCommonFtnFile.length() < 1))
    {
      if (QLog.isColorLevel()) {
        QLog.e("WeiYunLogicCenter<FileAssistant>", 2, "sendWyFile2QqOffline onSucceed,But uuid is null!!!");
      }
      if (this.jdField_a_of_type_ComTencentMobileqqTroopUtilsTroopFileTransferManager != null) {
        this.jdField_a_of_type_ComTencentMobileqqTroopUtilsTroopFileTransferManager.a(this.jdField_a_of_type_ComTencentMobileqqTroopDataTroopFileStatusInfo.a, -1, null, "转存失败,请稍后重试");
      }
    }
    do
    {
      return;
      if (QLog.isColorLevel()) {
        QLog.d("WeiYunLogicCenter<FileAssistant>", 2, "sendWyFile2QqOffline onSucceed, Uuid[" + paramCommonFtnFile + "]");
      }
    } while (this.jdField_a_of_type_ComTencentMobileqqTroopUtilsTroopFileTransferManager == null);
    this.jdField_a_of_type_ComTencentMobileqqTroopUtilsTroopFileTransferManager.a(this.jdField_a_of_type_ComTencentMobileqqTroopDataTroopFileStatusInfo.a, 0, paramCommonFtnFile, null);
  }
  
  public void onFailed(IWyFileSystem.WyErrorStatus paramWyErrorStatus)
  {
    if (QLog.isColorLevel()) {
      QLog.i("WeiYunLogicCenter<FileAssistant>", 2, "sendWeiYun2Troop onFailed: errcode[" + paramWyErrorStatus.errorCode + "], errmsg[" + paramWyErrorStatus.errorMsg + "]");
    }
    this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.status = 0;
    this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.isReaded = false;
    this.jdField_a_of_type_ComTencentMobileqqTroopUtilsTroopFileTransferManager.a(this.jdField_a_of_type_ComTencentMobileqqTroopDataTroopFileStatusInfo.a, paramWyErrorStatus.errorCode, null, paramWyErrorStatus.errorMsg);
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\saq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */