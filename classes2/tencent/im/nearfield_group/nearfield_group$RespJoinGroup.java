package tencent.im.nearfield_group;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class nearfield_group$RespJoinGroup
  extends MessageMicro
{
  public static final int MSG_HEAD_FIELD_NUMBER = 1;
  public static final int UINT64_GROUP_CODE_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 16 }, new String[] { "msg_head", "uint64_group_code" }, new Object[] { null, Long.valueOf(0L) }, RespJoinGroup.class);
  public nearfield_group.BusiRespHead msg_head = new nearfield_group.BusiRespHead();
  public final PBUInt64Field uint64_group_code = PBField.initUInt64(0L);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\tencent\im\nearfield_group\nearfield_group$RespJoinGroup.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */