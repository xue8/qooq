package tencent.im.cs.cmd0x345;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class cmd0x345$ReqBody$SubCmd0xaReqBody
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 26, 34 }, new String[] { "uint64_uin", "uint64_disscus_uin", "str_file_id", "str_session_info" }, new Object[] { Long.valueOf(0L), Long.valueOf(0L), "", "" }, SubCmd0xaReqBody.class);
  public final PBStringField str_file_id = PBField.initString("");
  public final PBStringField str_session_info = PBField.initString("");
  public final PBUInt64Field uint64_disscus_uin = PBField.initUInt64(0L);
  public final PBUInt64Field uint64_uin = PBField.initUInt64(0L);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\cs\cmd0x345\cmd0x345$ReqBody$SubCmd0xaReqBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */