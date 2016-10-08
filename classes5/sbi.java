import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.filemanager.app.FileTransferHandler;
import com.tencent.mobileqq.filemanager.core.FileManagerDataCenter;
import com.tencent.mobileqq.filemanager.core.FileManagerNotifyCenter;
import com.tencent.mobileqq.filemanager.data.FileManagerEntity;
import com.tencent.mobileqq.filemanager.discoperation.DiscFileOperator;
import com.tencent.mobileqq.filemanager.discoperation.FileHttpUtils;
import com.tencent.mobileqq.filemanager.discoperation.FileReportData;
import com.tencent.mobileqq.filemanager.util.FileManagerUtil;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.utils.NetworkUtil;
import com.tencent.qphone.base.util.BaseApplication;
import com.tencent.qphone.base.util.QLog;

public class sbi
  implements Runnable
{
  public sbi(DiscFileOperator paramDiscFileOperator)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void run()
  {
    if (!NetworkUtil.e(BaseApplication.getContext()))
    {
      this.a.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.status = 0;
      this.a.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().a(this.a.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.uniseq, this.a.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.nSessionId, this.a.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.peerUin, this.a.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.peerType, 1, null, 2, null);
      this.a.jdField_a_of_type_ComTencentMobileqqFilemanagerDiscoperationFileReportData.a = 9004L;
      this.a.jdField_a_of_type_ComTencentMobileqqFilemanagerDiscoperationFileReportData.c = "NoNetWork";
      this.a.jdField_a_of_type_ComTencentMobileqqFilemanagerDiscoperationFileReportData.b();
      this.a.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().c(this.a.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity);
    }
    do
    {
      return;
      if (this.a.jdField_a_of_type_Boolean)
      {
        QLog.w("DiscFileOperator<FileAssistant>", 1, "nID[" + this.a.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.nSessionId + "] user canceled!");
        return;
      }
      String str1 = null;
      if ((this.a.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.strFileMd5 == null) || (this.a.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.strFileMd5.length() != 32))
      {
        str1 = FileHttpUtils.a(FileManagerUtil.c(this.a.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.getFilePath()));
        this.a.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.strFileMd5 = str1;
      }
      String str2 = null;
      if ((this.a.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.strFileMd5 == null) || (this.a.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.strFileMd5.length() != 40))
      {
        str2 = FileHttpUtils.a(FileManagerUtil.a(this.a.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.getFilePath()));
        this.a.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.strFileSHA = str2;
      }
      this.a.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.status = 0;
      this.a.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().c(this.a.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity);
      this.a.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.status = 2;
      this.a.jdField_a_of_type_ComTencentMobileqqFilemanagerDiscoperationFileReportData.e = str1;
      this.a.jdField_a_of_type_ComTencentMobileqqFilemanagerDiscoperationFileReportData.f = str2;
      this.a.jdField_a_of_type_ComTencentMobileqqFilemanagerDiscoperationFileReportData.d = System.currentTimeMillis();
      this.a.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().a(this.a.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.strFileMd5, this.a.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.strFileSHA, this.a.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.fileName, this.a.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.fileSize, this.a.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.peerUin, this.a.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a(), this.a);
    } while (!QLog.isColorLevel());
    QLog.i("DiscFileOperator<FileAssistant>", 1, "nID[" + this.a.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.nSessionId + "]Send CS Request!");
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\sbi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */