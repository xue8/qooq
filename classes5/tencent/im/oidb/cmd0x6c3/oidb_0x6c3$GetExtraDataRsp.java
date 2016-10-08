package tencent.im.oidb.cmd0x6c3;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBInt32Field;

public final class oidb_0x6c3$GetExtraDataRsp
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_shop_config = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBInt32Field int32_version_seq = PBField.initInt32(0);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 16 }, new String[] { "bytes_shop_config", "int32_version_seq" }, new Object[] { localByteStringMicro, Integer.valueOf(0) }, GetExtraDataRsp.class);
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\oidb\cmd0x6c3\oidb_0x6c3$GetExtraDataRsp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */