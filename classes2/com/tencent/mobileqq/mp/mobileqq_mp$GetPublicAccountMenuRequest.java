package com.tencent.mobileqq.mp;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class mobileqq_mp$GetPublicAccountMenuRequest
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 24 }, new String[] { "seqno", "uin", "luin" }, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Long.valueOf(0L) }, GetPublicAccountMenuRequest.class);
  public final PBUInt64Field luin = PBField.initUInt64(0L);
  public final PBUInt32Field seqno = PBField.initUInt32(0);
  public final PBUInt32Field uin = PBField.initUInt32(0);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\mobileqq\mp\mobileqq_mp$GetPublicAccountMenuRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */