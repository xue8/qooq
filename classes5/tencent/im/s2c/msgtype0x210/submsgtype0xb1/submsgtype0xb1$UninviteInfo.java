package tencent.im.s2c.msgtype0x210.submsgtype0xb1;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class submsgtype0xb1$UninviteInfo
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 26 }, new String[] { "uint64_uin", "uint64_group_code", "str_id" }, new Object[] { Long.valueOf(0L), Long.valueOf(0L), "" }, UninviteInfo.class);
  public final PBStringField str_id = PBField.initString("");
  public final PBUInt64Field uint64_group_code = PBField.initUInt64(0L);
  public final PBUInt64Field uint64_uin = PBField.initUInt64(0L);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\s2c\msgtype0x210\submsgtype0xb1\submsgtype0xb1$UninviteInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */