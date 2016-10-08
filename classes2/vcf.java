import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.highway.HwEngine;
import com.tencent.mobileqq.highway.transaction.Transaction;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.transfile.BaseTransFileController;
import com.tencent.mobileqq.transfile.ShortVideoUploadProcessor;
import com.tencent.qphone.base.util.QLog;
import java.util.Iterator;
import java.util.List;

public class vcf
  implements Runnable
{
  public vcf(ShortVideoUploadProcessor paramShortVideoUploadProcessor, boolean paramBoolean, int paramInt)
  {
    paramBoolean = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void run()
  {
    synchronized (this.jdField_a_of_type_ComTencentMobileqqTransfileShortVideoUploadProcessor)
    {
      if (QLog.isColorLevel()) {
        QLog.d("ShortVideoUploadProcessor", 2, "<PreUploadVideo><BDH_LOG> cancelCurrentSlices isNeedWait:" + this.jdField_a_of_type_Boolean + " cancelReason:" + this.jdField_a_of_type_Int);
      }
      if (ShortVideoUploadProcessor.a(this.jdField_a_of_type_ComTencentMobileqqTransfileShortVideoUploadProcessor) != 3)
      {
        if (QLog.isColorLevel()) {
          QLog.d("ShortVideoUploadProcessor", 2, "<BDH_LOG> cancelCurrentSlices mSwitch != SWITCH_PRE_UPLOAD  mSwitch : " + ShortVideoUploadProcessor.a(this.jdField_a_of_type_ComTencentMobileqqTransfileShortVideoUploadProcessor));
        }
        return;
      }
      ShortVideoUploadProcessor.b(this.jdField_a_of_type_ComTencentMobileqqTransfileShortVideoUploadProcessor, 3);
      ShortVideoUploadProcessor.c(this.jdField_a_of_type_ComTencentMobileqqTransfileShortVideoUploadProcessor, 1);
      this.jdField_a_of_type_ComTencentMobileqqTransfileShortVideoUploadProcessor.bH = this.jdField_a_of_type_Int;
      Iterator localIterator = this.jdField_a_of_type_ComTencentMobileqqTransfileShortVideoUploadProcessor.c.iterator();
      if (localIterator.hasNext()) {
        ((Transaction)localIterator.next()).cancelTransaction();
      }
    }
    this.jdField_a_of_type_ComTencentMobileqqTransfileShortVideoUploadProcessor.c.clear();
    if (this.jdField_a_of_type_ComTencentMobileqqTransfileShortVideoUploadProcessor.jdField_a_of_type_ComTencentMobileqqHighwaySegmentRequestAck != null)
    {
      this.jdField_a_of_type_ComTencentMobileqqTransfileShortVideoUploadProcessor.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().cancelAckRequest(this.jdField_a_of_type_ComTencentMobileqqTransfileShortVideoUploadProcessor.jdField_a_of_type_ComTencentMobileqqHighwaySegmentRequestAck);
      this.jdField_a_of_type_ComTencentMobileqqTransfileShortVideoUploadProcessor.jdField_a_of_type_ComTencentMobileqqHighwaySegmentRequestAck = null;
    }
    if (!this.jdField_a_of_type_Boolean)
    {
      this.jdField_a_of_type_ComTencentMobileqqTransfileShortVideoUploadProcessor.u();
      this.jdField_a_of_type_ComTencentMobileqqTransfileShortVideoUploadProcessor.jdField_a_of_type_ComTencentMobileqqTransfileBaseTransFileController.a(this.jdField_a_of_type_ComTencentMobileqqTransfileShortVideoUploadProcessor.a());
    }
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\vcf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */