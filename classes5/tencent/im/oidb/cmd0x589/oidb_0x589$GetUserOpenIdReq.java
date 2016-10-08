package tencent.im.oidb.cmd0x589;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class oidb_0x589$GetUserOpenIdReq
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 24 }, new String[] { "uint32_req_flag", "uint64_req_uin", "uint64_req_host_uin" }, new Object[] { Integer.valueOf(0), Long.valueOf(0L), Long.valueOf(0L) }, GetUserOpenIdReq.class);
  public final PBUInt32Field uint32_req_flag = PBField.initUInt32(0);
  public final PBUInt64Field uint64_req_host_uin = PBField.initUInt64(0L);
  public final PBUInt64Field uint64_req_uin = PBField.initUInt64(0L);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\oidb\cmd0x589\oidb_0x589$GetUserOpenIdReq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */