package tencent.im.s2c.msgtype0x210.submsgtype0xb1;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class submsgtype0xb1$MsgBody
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 26, 34 }, new String[] { "uint32_notify_type", "invite_info", "univite_info", "deal_info" }, new Object[] { Integer.valueOf(0), null, null, null }, MsgBody.class);
  public submsgtype0xb1.DealInviteInfo deal_info = new submsgtype0xb1.DealInviteInfo();
  public submsgtype0xb1.InviteInfo invite_info = new submsgtype0xb1.InviteInfo();
  public final PBUInt32Field uint32_notify_type = PBField.initUInt32(0);
  public submsgtype0xb1.UninviteInfo univite_info = new submsgtype0xb1.UninviteInfo();
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\s2c\msgtype0x210\submsgtype0xb1\submsgtype0xb1$MsgBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */