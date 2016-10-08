package tencent.im.oidb.cmd0x7a1;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class oidb_0x7a1$ReqBody
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 24, 32 }, new String[] { "uint64_bind_uin", "str_imei", "uint32_clt_appid", "uint32_flag" }, new Object[] { Long.valueOf(0L), "", Integer.valueOf(0), Integer.valueOf(0) }, ReqBody.class);
  public final PBStringField str_imei = PBField.initString("");
  public final PBUInt32Field uint32_clt_appid = PBField.initUInt32(0);
  public final PBUInt32Field uint32_flag = PBField.initUInt32(0);
  public final PBUInt64Field uint64_bind_uin = PBField.initUInt64(0L);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\oidb\cmd0x7a1\oidb_0x7a1$ReqBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */