package tencent.im.s2c.msgtype0x210.submsgtype0x26;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class submsgtype0x26$AppID
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8 }, new String[] { "uint64_app_id" }, new Object[] { Long.valueOf(0L) }, AppID.class);
  public final PBUInt64Field uint64_app_id = PBField.initUInt64(0L);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\s2c\msgtype0x210\submsgtype0x26\submsgtype0x26$AppID.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */