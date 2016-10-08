package tencent.im.oidb.cmd0x625;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class Oidb_0x625$TinyIDInfoRsp
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_openid = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBUInt32Field uint32_acounttype = PBField.initUInt32(0);
  public final PBUInt32Field uint32_appid = PBField.initUInt32(0);
  public final PBUInt64Field uint64_tinyid = PBField.initUInt64(0L);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 24, 32 }, new String[] { "uint32_appid", "bytes_openid", "uint64_tinyid", "uint32_acounttype" }, new Object[] { Integer.valueOf(0), localByteStringMicro, Long.valueOf(0L), Integer.valueOf(0) }, TinyIDInfoRsp.class);
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\oidb\cmd0x625\Oidb_0x625$TinyIDInfoRsp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */