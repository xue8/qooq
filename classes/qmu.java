import android.os.Bundle;
import com.tencent.mobileqq.app.MessageHandler;
import com.tencent.mobileqq.app.message.BaseMessageProcessor.RequestBuilder;
import com.tencent.mobileqq.app.message.UncommonMessageProcessor;
import com.tencent.mobileqq.data.MessageRecord;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.service.message.MessageUtils;
import com.tencent.qphone.base.remote.ToServiceMsg;
import com.tencent.qphone.base.util.QLog;
import msf.msgsvc.msg_svc.PbSendMsgReq;

public class qmu
  implements BaseMessageProcessor.RequestBuilder
{
  public qmu(UncommonMessageProcessor paramUncommonMessageProcessor, MessageRecord paramMessageRecord, msg_svc.PbSendMsgReq paramPbSendMsgReq)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public ToServiceMsg a()
  {
    long l = System.currentTimeMillis();
    ToServiceMsg localToServiceMsg = this.jdField_a_of_type_ComTencentMobileqqAppMessageUncommonMessageProcessor.a.a("MessageSvc.PbMultiMsgSend");
    localToServiceMsg.extraData.putLong("uniseq", this.jdField_a_of_type_ComTencentMobileqqDataMessageRecord.uniseq);
    localToServiceMsg.extraData.putInt("msgtype", this.jdField_a_of_type_ComTencentMobileqqDataMessageRecord.msgtype);
    localToServiceMsg.extraData.putLong("key_msg_info_time_start", l);
    localToServiceMsg.putWupBuffer(this.jdField_a_of_type_MsfMsgsvcMsg_svc$PbSendMsgReq.toByteArray());
    localToServiceMsg.setTimeout(15000L);
    localToServiceMsg.setEnableFastResend(true);
    if (QLog.isColorLevel())
    {
      int i = MessageUtils.a(this.jdField_a_of_type_ComTencentMobileqqDataMessageRecord.msgUid);
      QLog.d("Q.msg.UncommonMessageProcessor", 2, "sendBlessMsg,  mr_uniseq:" + this.jdField_a_of_type_ComTencentMobileqqDataMessageRecord.uniseq + " msgSeq:" + this.jdField_a_of_type_ComTencentMobileqqDataMessageRecord.msgseq + " mr_shMsgseq:" + this.jdField_a_of_type_ComTencentMobileqqDataMessageRecord.shmsgseq + " mr_msgUid:" + this.jdField_a_of_type_ComTencentMobileqqDataMessageRecord.msgUid + " random:" + i);
    }
    return localToServiceMsg;
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\qmu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */