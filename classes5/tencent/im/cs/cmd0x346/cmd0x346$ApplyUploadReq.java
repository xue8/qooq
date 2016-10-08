package tencent.im.cs.cmd0x346;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class cmd0x346$ApplyUploadReq
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_10m_md5 = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBStringField str_file_name = PBField.initString("");
  public final PBStringField str_local_filepath = PBField.initString("");
  public final PBUInt32Field uint32_danger_level = PBField.initUInt32(0);
  public final PBUInt32Field uint32_file_type = PBField.initUInt32(0);
  public final PBUInt64Field uint64_file_size = PBField.initUInt64(0L);
  public final PBUInt64Field uint64_recver_uin = PBField.initUInt64(0L);
  public final PBUInt64Field uint64_sender_uin = PBField.initUInt64(0L);
  public final PBUInt64Field uint64_total_space = PBField.initUInt64(0L);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 80, 160, 240, 320, 402, 482, 562, 640, 720 }, new String[] { "uint64_sender_uin", "uint64_recver_uin", "uint32_file_type", "uint64_file_size", "str_file_name", "bytes_10m_md5", "str_local_filepath", "uint32_danger_level", "uint64_total_space" }, new Object[] { Long.valueOf(0L), Long.valueOf(0L), Integer.valueOf(0), Long.valueOf(0L), "", localByteStringMicro, "", Integer.valueOf(0), Long.valueOf(0L) }, ApplyUploadReq.class);
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\cs\cmd0x346\cmd0x346$ApplyUploadReq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */