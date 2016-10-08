package tencent.im.oidb.cmd0x508;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class oidb_0x508$RspBody
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField opt_bytes_errinfo = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBUInt32Field opt_uint32_result = PBField.initUInt32(0);
  public final PBUInt64Field opt_uint64_update_seq = PBField.initUInt64(0L);
  public final PBRepeatField rpt_uint64_appid_list = PBField.initRepeat(PBUInt64Field.__repeatHelper__);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 24, 32 }, new String[] { "opt_uint32_result", "opt_bytes_errinfo", "rpt_uint64_appid_list", "opt_uint64_update_seq" }, new Object[] { Integer.valueOf(0), localByteStringMicro, Long.valueOf(0L), Long.valueOf(0L) }, RspBody.class);
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\oidb\cmd0x508\oidb_0x508$RspBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */