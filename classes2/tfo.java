import com.tencent.mobileqq.app.MessageHandler;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.message.QQMessageFacade;
import com.tencent.mobileqq.app.message.QQMessageFacade.Message;
import com.tencent.mobileqq.data.MessageForStructing;
import com.tencent.mobileqq.data.MessageRecord;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.multimsg.MultiMsgManager;
import com.tencent.mobileqq.pic.UpCallBack;
import com.tencent.mobileqq.pic.UpCallBack.SendResult;
import com.tencent.mobileqq.service.message.MessageCache;
import com.tencent.mobileqq.structmsg.AbsStructMsg;
import com.tencent.qphone.base.util.QLog;
import tencent.im.msg.im_msg_body.RichText;

public class tfo
  implements UpCallBack
{
  public tfo(MultiMsgManager paramMultiMsgManager, MessageRecord paramMessageRecord, QQAppInterface paramQQAppInterface, String paramString, int paramInt)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public MessageRecord a(im_msg_body.RichText paramRichText)
  {
    return null;
  }
  
  public void a(UpCallBack.SendResult paramSendResult) {}
  
  public void b(UpCallBack.SendResult paramSendResult)
  {
    if (paramSendResult.jdField_a_of_type_Int == 0)
    {
      MessageForStructing localMessageForStructing = (MessageForStructing)this.jdField_a_of_type_ComTencentMobileqqDataMessageRecord;
      localMessageForStructing.structingMsg.mResid = paramSendResult.c;
      localMessageForStructing.structingMsg.mFileName = String.valueOf(localMessageForStructing.uniseq);
      this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().a(this.jdField_a_of_type_JavaLangString, this.jdField_a_of_type_Int, localMessageForStructing.uniseq, localMessageForStructing.structingMsg.getBytes());
      this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().b(this.jdField_a_of_type_ComTencentMobileqqDataMessageRecord, null);
      if (QLog.isColorLevel()) {
        QLog.d("MultiMsg", 2, "send real struct msg done, cost : " + (System.currentTimeMillis() - MultiMsgManager.a(this.jdField_a_of_type_ComTencentMobileqqMultimsgMultiMsgManager)));
      }
      return;
    }
    if (QLog.isColorLevel()) {
      QLog.d("MultiMsg", 2, "upload multi msg pack failed, result.errStr=" + paramSendResult.b + ",result.errStr=" + paramSendResult.jdField_a_of_type_JavaLangString);
    }
    this.jdField_a_of_type_ComTencentMobileqqDataMessageRecord.extraflag = 32768;
    this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().a(this.jdField_a_of_type_JavaLangString, this.jdField_a_of_type_Int, this.jdField_a_of_type_ComTencentMobileqqDataMessageRecord.uniseq);
    paramSendResult = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().a(this.jdField_a_of_type_JavaLangString, this.jdField_a_of_type_Int);
    if ((paramSendResult != null) && (paramSendResult.uniseq == this.jdField_a_of_type_ComTencentMobileqqDataMessageRecord.uniseq)) {
      paramSendResult.extraflag = 32768;
    }
    paramSendResult = this.jdField_a_of_type_JavaLangString;
    int i = this.jdField_a_of_type_Int;
    long l = this.jdField_a_of_type_ComTencentMobileqqDataMessageRecord.uniseq;
    ((MessageHandler)this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a(0)).a(MessageHandler.c(this.jdField_a_of_type_Int), false, new Object[] { paramSendResult, Integer.valueOf(i), Integer.valueOf(-1), null, Long.valueOf(0L), Long.valueOf(l) });
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\tfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */