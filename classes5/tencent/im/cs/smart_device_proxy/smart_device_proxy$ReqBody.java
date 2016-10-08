package tencent.im.cs.smart_device_proxy;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBInt32Field;

public final class smart_device_proxy$ReqBody
  extends MessageMicro
{
  public static final int BYTES_BODY_FIELD_NUMBER = 3;
  public static final int INT32_CMD_FIELD_NUMBER = 1;
  public static final int MSG_HEADER_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_body = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBInt32Field int32_cmd = PBField.initInt32(0);
  public smart_device_proxy.CommonHead msg_header = new smart_device_proxy.CommonHead();
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 26 }, new String[] { "int32_cmd", "msg_header", "bytes_body" }, new Object[] { Integer.valueOf(0), null, localByteStringMicro }, ReqBody.class);
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\cs\smart_device_proxy\smart_device_proxy$ReqBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */