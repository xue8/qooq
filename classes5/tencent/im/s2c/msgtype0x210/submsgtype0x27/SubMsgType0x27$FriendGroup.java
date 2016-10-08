package tencent.im.s2c.msgtype0x210.submsgtype0x27;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class SubMsgType0x27$FriendGroup
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 24 }, new String[] { "uint64_fuin", "rpt_uint32_old_group_id", "rpt_uint32_new_group_id" }, new Object[] { Long.valueOf(0L), Integer.valueOf(0), Integer.valueOf(0) }, FriendGroup.class);
  public final PBRepeatField rpt_uint32_new_group_id = PBField.initRepeat(PBUInt32Field.__repeatHelper__);
  public final PBRepeatField rpt_uint32_old_group_id = PBField.initRepeat(PBUInt32Field.__repeatHelper__);
  public final PBUInt64Field uint64_fuin = PBField.initUInt64(0L);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\s2c\msgtype0x210\submsgtype0x27\SubMsgType0x27$FriendGroup.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */