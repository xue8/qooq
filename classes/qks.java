import com.tencent.mobileqq.app.MessageHandler;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.message.BaseMessageManager;
import com.tencent.mobileqq.app.message.UncommonMessageProcessor;
import com.tencent.mobileqq.data.MessageRecord;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.service.message.MessageCache;

public class qks
  implements Runnable
{
  public qks(BaseMessageManager paramBaseMessageManager, MessageRecord paramMessageRecord, long paramLong)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void run()
  {
    this.jdField_a_of_type_ComTencentMobileqqAppMessageBaseMessageManager.a.a().f(this.jdField_a_of_type_ComTencentMobileqqDataMessageRecord);
    this.jdField_a_of_type_ComTencentMobileqqAppMessageBaseMessageManager.a();
    long l1 = System.currentTimeMillis();
    long l2 = this.jdField_a_of_type_Long;
    if (!this.jdField_a_of_type_ComTencentMobileqqAppMessageBaseMessageManager.a.a().b(this.jdField_a_of_type_ComTencentMobileqqDataMessageRecord.frienduin, this.jdField_a_of_type_ComTencentMobileqqDataMessageRecord.istroop, this.jdField_a_of_type_ComTencentMobileqqDataMessageRecord.uniseq)) {
      this.jdField_a_of_type_ComTencentMobileqqAppMessageBaseMessageManager.a.a().a(this.jdField_a_of_type_ComTencentMobileqqDataMessageRecord, 15000L - (l1 - l2));
    }
    for (;;)
    {
      this.jdField_a_of_type_ComTencentMobileqqAppMessageBaseMessageManager.a.a().f(null);
      return;
      this.jdField_a_of_type_ComTencentMobileqqAppMessageBaseMessageManager.a.a().a().a(this.jdField_a_of_type_ComTencentMobileqqDataMessageRecord.frienduin, this.jdField_a_of_type_ComTencentMobileqqDataMessageRecord.istroop, UncommonMessageProcessor.h, UncommonMessageProcessor.p);
    }
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\qks.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */