package com.tencent.avatarinfo;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class MultiHeadUrl$RspUsrHeadInfo
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 26, 34 }, new String[] { "dstUin", "dstTid", "dstOpenid", "dstHeadInfos" }, new Object[] { Long.valueOf(0L), Long.valueOf(0L), "", null }, RspUsrHeadInfo.class);
  public final PBRepeatMessageField dstHeadInfos = PBField.initRepeatMessage(MultiHeadUrl.RspHeadInfo.class);
  public final PBStringField dstOpenid = PBField.initString("");
  public final PBUInt64Field dstTid = PBField.initUInt64(0L);
  public final PBUInt64Field dstUin = PBField.initUInt64(0L);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\avatarinfo\MultiHeadUrl$RspUsrHeadInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */