package tencent.im.oidb.cmd0x51d;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;

public final class oidb_0x51d$GetAppNoticeRsp
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10 }, new String[] { "rpt_msg_app_notice" }, new Object[] { null }, GetAppNoticeRsp.class);
  public final PBRepeatMessageField rpt_msg_app_notice = PBField.initRepeatMessage(oidb_0x51d.AppNoticeInfo.class);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\oidb\cmd0x51d\oidb_0x51d$GetAppNoticeRsp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */