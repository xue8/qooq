package tencent.im.oidb.cmd0x59f;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class oidb_0x59f$RspBody
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 122, 138 }, new String[] { "uint32_is_first_login", "msg_contact_bind_info", "str_reg_mobile" }, new Object[] { Integer.valueOf(0), null, "" }, RspBody.class);
  public oidb_0x59f.ContactBindInfo msg_contact_bind_info = new oidb_0x59f.ContactBindInfo();
  public final PBStringField str_reg_mobile = PBField.initString("");
  public final PBUInt32Field uint32_is_first_login = PBField.initUInt32(0);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\oidb\cmd0x59f\oidb_0x59f$RspBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */