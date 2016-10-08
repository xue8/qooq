package pttcenterservice;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class PttCenter$PttIntrodApplyUploadReq
  extends MessageMicro
{
  public static final int BYTES_MD5_FIELD_NUMBER = 3;
  public static final int STR_FILE_NAME_FIELD_NUMBER = 2;
  public static final int UINT64_FILE_SIZE_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_md5 = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBStringField str_file_name = PBField.initString("");
  public final PBUInt64Field uint64_file_size = PBField.initUInt64(0L);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 26 }, new String[] { "uint64_file_size", "str_file_name", "bytes_md5" }, new Object[] { Long.valueOf(0L), "", localByteStringMicro }, PttIntrodApplyUploadReq.class);
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\pttcenterservice\PttCenter$PttIntrodApplyUploadReq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */