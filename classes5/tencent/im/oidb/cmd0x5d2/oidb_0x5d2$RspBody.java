package tencent.im.oidb.cmd0x5d2;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class oidb_0x5d2$RspBody
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 26 }, new String[] { "sub_cmd", "rsp_get_list", "rsp_get_info" }, new Object[] { Integer.valueOf(0), null, null }, RspBody.class);
  public oidb_0x5d2.RspGetInfo rsp_get_info = new oidb_0x5d2.RspGetInfo();
  public oidb_0x5d2.RspGetList rsp_get_list = new oidb_0x5d2.RspGetList();
  public final PBUInt32Field sub_cmd = PBField.initUInt32(0);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\oidb\cmd0x5d2\oidb_0x5d2$RspBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */