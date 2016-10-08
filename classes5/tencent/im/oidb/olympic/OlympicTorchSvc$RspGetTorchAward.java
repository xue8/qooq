package tencent.im.oidb.olympic;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class OlympicTorchSvc$RspGetTorchAward
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_sig = PBField.initBytes(ByteStringMicro.EMPTY);
  public OlympicTorchSvc.RspHead msg_rsp_head = new OlympicTorchSvc.RspHead();
  public torch_transfer.TorchbearerInfo msg_torchbearer_info = new torch_transfer.TorchbearerInfo();
  public final PBUInt32Field uint32_delay_time = PBField.initUInt32(0);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18, 24, 82 }, new String[] { "msg_rsp_head", "msg_torchbearer_info", "uint32_delay_time", "bytes_sig" }, new Object[] { null, null, Integer.valueOf(0), localByteStringMicro }, RspGetTorchAward.class);
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\oidb\olympic\OlympicTorchSvc$RspGetTorchAward.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */