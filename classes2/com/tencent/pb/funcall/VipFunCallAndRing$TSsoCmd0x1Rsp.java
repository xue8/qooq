package com.tencent.pb.funcall;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class VipFunCallAndRing$TSsoCmd0x1Rsp
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18 }, new String[] { "u64_server_ver", "st_User_Info" }, new Object[] { Long.valueOf(0L), null }, TSsoCmd0x1Rsp.class);
  public VipFunCallAndRing.TUserInfo st_User_Info = new VipFunCallAndRing.TUserInfo();
  public final PBUInt64Field u64_server_ver = PBField.initUInt64(0L);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\pb\funcall\VipFunCallAndRing$TSsoCmd0x1Rsp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */