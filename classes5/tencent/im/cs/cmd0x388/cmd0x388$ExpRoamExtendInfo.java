package tencent.im.cs.cmd0x388;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;

public final class cmd0x388$ExpRoamExtendInfo
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_resid = PBField.initBytes(ByteStringMicro.EMPTY);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10 }, new String[] { "bytes_resid" }, new Object[] { localByteStringMicro }, ExpRoamExtendInfo.class);
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\cs\cmd0x388\cmd0x388$ExpRoamExtendInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */