package msf.msgsvc;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class msg_svc$AddressListTmp
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBUInt32Field from_contact_size = PBField.initUInt32(0);
  public final PBStringField from_phone = PBField.initString("");
  public final PBBytesField sig = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBStringField to_phone = PBField.initString("");
  public final PBUInt64Field to_uin = PBField.initUInt64(0L);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18, 24, 34, 40 }, new String[] { "from_phone", "to_phone", "to_uin", "sig", "from_contact_size" }, new Object[] { "", "", Long.valueOf(0L), localByteStringMicro, Integer.valueOf(0) }, AddressListTmp.class);
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\msf\msgsvc\msg_svc$AddressListTmp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */