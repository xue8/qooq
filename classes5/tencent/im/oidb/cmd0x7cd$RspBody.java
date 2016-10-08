package tencent.im.oidb;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class cmd0x7cd$RspBody
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 24, 34 }, new String[] { "uint32_stamp", "uint32_over", "uint32_next", "rpt_msg_appoints_info" }, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), null }, RspBody.class);
  public final PBRepeatMessageField rpt_msg_appoints_info = PBField.initRepeatMessage(cmd0x7cd.AppointBrife.class);
  public final PBUInt32Field uint32_next = PBField.initUInt32(0);
  public final PBUInt32Field uint32_over = PBField.initUInt32(0);
  public final PBUInt32Field uint32_stamp = PBField.initUInt32(0);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\oidb\cmd0x7cd$RspBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */