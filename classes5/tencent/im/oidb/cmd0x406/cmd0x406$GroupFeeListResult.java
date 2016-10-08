package tencent.im.oidb.cmd0x406;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class cmd0x406$GroupFeeListResult
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18 }, new String[] { "uint32_group_fee_type", "msg_group_fee_list" }, new Object[] { Integer.valueOf(0), null }, GroupFeeListResult.class);
  public final PBRepeatMessageField msg_group_fee_list = PBField.initRepeatMessage(cmd0x406.GroupFee.class);
  public final PBUInt32Field uint32_group_fee_type = PBField.initUInt32(0);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\oidb\cmd0x406\cmd0x406$GroupFeeListResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */