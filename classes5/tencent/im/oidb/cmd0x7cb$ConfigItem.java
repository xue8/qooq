package tencent.im.oidb;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class cmd0x7cb$ConfigItem
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18 }, new String[] { "uint32_id", "str_config" }, new Object[] { Integer.valueOf(0), "" }, ConfigItem.class);
  public final PBStringField str_config = PBField.initString("");
  public final PBUInt32Field uint32_id = PBField.initUInt32(0);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\oidb\cmd0x7cb$ConfigItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */