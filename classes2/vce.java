import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.transfile.ShortVideoUploadProcessor;
import com.tencent.mobileqq.transfile.TransferRequest;
import com.tencent.mobileqq.utils.LogTag;
import com.tencent.qphone.base.util.QLog;

public class vce
  implements Runnable
{
  public vce(ShortVideoUploadProcessor paramShortVideoUploadProcessor, String paramString, int paramInt)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void run()
  {
    if (QLog.isColorLevel()) {
      QLog.d("ShortVideoUploadProcessor", 2, "<BDH_LOG> submitEntireVideo");
    }
    LogTag.a(String.valueOf(this.jdField_a_of_type_ComTencentMobileqqTransfileShortVideoUploadProcessor.a.a), "submitEntireVideo", "videoPath = " + this.jdField_a_of_type_JavaLangString);
    synchronized (this.jdField_a_of_type_ComTencentMobileqqTransfileShortVideoUploadProcessor)
    {
      if (ShortVideoUploadProcessor.a(this.jdField_a_of_type_ComTencentMobileqqTransfileShortVideoUploadProcessor) != 3)
      {
        if (QLog.isColorLevel()) {
          QLog.d("ShortVideoUploadProcessor", 2, "<BDH_LOG> submitEntireVideo mSwitch != SWITCH_PRE_UPLOAD  mSwitch : " + ShortVideoUploadProcessor.a(this.jdField_a_of_type_ComTencentMobileqqTransfileShortVideoUploadProcessor));
        }
        return;
      }
      this.jdField_a_of_type_ComTencentMobileqqTransfileShortVideoUploadProcessor.a.i = (this.jdField_a_of_type_JavaLangString + "QQ_&_MoblieQQ_&_QQ" + this.jdField_a_of_type_ComTencentMobileqqTransfileShortVideoUploadProcessor.a.j + "QQ_&_MoblieQQ_&_QQ" + this.jdField_a_of_type_Int + "QQ_&_MoblieQQ_&_QQ" + this.jdField_a_of_type_ComTencentMobileqqTransfileShortVideoUploadProcessor.a.k);
      ShortVideoUploadProcessor.b(this.jdField_a_of_type_ComTencentMobileqqTransfileShortVideoUploadProcessor, 2);
      LogTag.a(String.valueOf(this.jdField_a_of_type_ComTencentMobileqqTransfileShortVideoUploadProcessor.a.a), "submitEntireVideo", "mUiRequest.mLocalPath = " + this.jdField_a_of_type_ComTencentMobileqqTransfileShortVideoUploadProcessor.a.i + ",mVideoPreUpStatus = " + ShortVideoUploadProcessor.b(this.jdField_a_of_type_ComTencentMobileqqTransfileShortVideoUploadProcessor) + ", mVideoRecordStatus = " + ShortVideoUploadProcessor.c(this.jdField_a_of_type_ComTencentMobileqqTransfileShortVideoUploadProcessor));
      if ((ShortVideoUploadProcessor.b(this.jdField_a_of_type_ComTencentMobileqqTransfileShortVideoUploadProcessor) == 1) || (ShortVideoUploadProcessor.b(this.jdField_a_of_type_ComTencentMobileqqTransfileShortVideoUploadProcessor) == 2) || (ShortVideoUploadProcessor.c(this.jdField_a_of_type_ComTencentMobileqqTransfileShortVideoUploadProcessor) == 3))
      {
        if (QLog.isColorLevel()) {
          QLog.d("ShortVideoUploadProcessor", 2, "<BDH_LOG> submitEntireVideo mVideoPreUpStatus = " + ShortVideoUploadProcessor.b(this.jdField_a_of_type_ComTencentMobileqqTransfileShortVideoUploadProcessor) + " mVideoRecordStatus = " + ShortVideoUploadProcessor.c(this.jdField_a_of_type_ComTencentMobileqqTransfileShortVideoUploadProcessor));
        }
        ShortVideoUploadProcessor.a(this.jdField_a_of_type_ComTencentMobileqqTransfileShortVideoUploadProcessor);
      }
      return;
    }
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\vce.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */