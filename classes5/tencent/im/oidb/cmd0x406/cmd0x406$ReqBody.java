package tencent.im.oidb.cmd0x406;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class cmd0x406$ReqBody
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 26, 34 }, new String[] { "uint64_group_id", "msg_group_fee_info", "msg_group_fee_list", "msg_member_list" }, new Object[] { Long.valueOf(0L), null, null, null }, ReqBody.class);
  public cmd0x406.GroupFeeInfoQuery msg_group_fee_info = new cmd0x406.GroupFeeInfoQuery();
  public cmd0x406.GroupFeeListQuery msg_group_fee_list = new cmd0x406.GroupFeeListQuery();
  public cmd0x406.GroupFeeMemberListQuery msg_member_list = new cmd0x406.GroupFeeMemberListQuery();
  public final PBUInt64Field uint64_group_id = PBField.initUInt64(0L);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\oidb\cmd0x406\cmd0x406$ReqBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */