package tencent.im.oidb.cmd0xa8a;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class oidb_0xa8a$MsgBodyInfo
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_msg_body = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBUInt64Field uint64_msg_seq = PBField.initUInt64(0L);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 16 }, new String[] { "bytes_msg_body", "uint64_msg_seq" }, new Object[] { localByteStringMicro, Long.valueOf(0L) }, MsgBodyInfo.class);
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\oidb\cmd0xa8a\oidb_0xa8a$MsgBodyInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */