package tencent.mobileim.structmsg;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class structmsg$MsgInviteExt
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 24 }, new String[] { "uint32_src_type", "uint64_src_code", "uint32_wait_state" }, new Object[] { Integer.valueOf(0), Long.valueOf(0L), Integer.valueOf(0) }, MsgInviteExt.class);
  public final PBUInt32Field uint32_src_type = PBField.initUInt32(0);
  public final PBUInt32Field uint32_wait_state = PBField.initUInt32(0);
  public final PBUInt64Field uint64_src_code = PBField.initUInt64(0L);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\tencent\mobileim\structmsg\structmsg$MsgInviteExt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */