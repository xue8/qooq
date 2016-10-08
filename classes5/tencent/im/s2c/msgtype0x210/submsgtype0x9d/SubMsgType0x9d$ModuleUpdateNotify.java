package tencent.im.s2c.msgtype0x210.submsgtype0x9d;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class SubMsgType0x9d$ModuleUpdateNotify
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 24 }, new String[] { "module_id", "module_version", "module_state" }, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) }, ModuleUpdateNotify.class);
  public final PBUInt32Field module_id = PBField.initUInt32(0);
  public final PBUInt32Field module_state = PBField.initUInt32(0);
  public final PBUInt32Field module_version = PBField.initUInt32(0);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\s2c\msgtype0x210\submsgtype0x9d\SubMsgType0x9d$ModuleUpdateNotify.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */