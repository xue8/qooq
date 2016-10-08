package com.tencent.pb.secmsg;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBInt64Field;
import com.tencent.mobileqq.pb.PBStringField;

public final class SecMsgComu$SecGroupMsg_GetMsg_Req
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 16 }, new String[] { "ssid", "local_uts" }, new Object[] { "", Long.valueOf(0L) }, SecGroupMsg_GetMsg_Req.class);
  public final PBInt64Field local_uts = PBField.initInt64(0L);
  public final PBStringField ssid = PBField.initString("");
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\pb\secmsg\SecMsgComu$SecGroupMsg_GetMsg_Req.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */