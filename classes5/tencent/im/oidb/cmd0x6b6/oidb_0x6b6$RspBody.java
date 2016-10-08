package tencent.im.oidb.cmd0x6b6;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBInt32Field;

public final class oidb_0x6b6$RspBody
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_msg = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBInt32Field int32_ret = PBField.initInt32(0);
  public oidb_0x6b6.SendFlowerRsp msg_send_flower = new oidb_0x6b6.SendFlowerRsp();
  public oidb_0x6b6.ThrowFlowerRsp msg_throw_flower = new oidb_0x6b6.ThrowFlowerRsp();
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 34, 42 }, new String[] { "int32_ret", "bytes_msg", "msg_send_flower", "msg_throw_flower" }, new Object[] { Integer.valueOf(0), localByteStringMicro, null, null }, RspBody.class);
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\oidb\cmd0x6b6\oidb_0x6b6$RspBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */