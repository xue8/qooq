package tencent.im.msg;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBInt32Field;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class im_msg_body$ApolloActMsg
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_action_name = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField bytes_action_text = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField diytext_content = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBUInt32Field diytext_id = PBField.initUInt32(0);
  public final PBBytesField input_text = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBInt32Field int32_peer_status = PBField.initInt32(0);
  public final PBInt32Field int32_sender_status = PBField.initInt32(0);
  public final PBUInt32Field uint32_action_id = PBField.initUInt32(0);
  public final PBUInt32Field uint32_flag = PBField.initUInt32(0);
  public final PBUInt32Field uint32_peer_ts = PBField.initUInt32(0);
  public final PBUInt32Field uint32_peer_uin = PBField.initUInt32(0);
  public final PBUInt32Field uint32_sender_ts = PBField.initUInt32(0);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    ByteStringMicro localByteStringMicro1 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro2 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro3 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro4 = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 26, 32, 40, 48, 56, 64, 72, 80, 90, 98 }, new String[] { "uint32_action_id", "bytes_action_name", "bytes_action_text", "uint32_flag", "uint32_peer_uin", "uint32_sender_ts", "uint32_peer_ts", "int32_sender_status", "int32_peer_status", "diytext_id", "diytext_content", "input_text" }, new Object[] { Integer.valueOf(0), localByteStringMicro1, localByteStringMicro2, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), localByteStringMicro3, localByteStringMicro4 }, ApolloActMsg.class);
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\msg\im_msg_body$ApolloActMsg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */