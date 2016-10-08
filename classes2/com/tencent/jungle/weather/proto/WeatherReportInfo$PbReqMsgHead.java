package com.tencent.jungle.weather.proto;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class WeatherReportInfo$PbReqMsgHead
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 24 }, new String[] { "uint32_platform_type", "uint32_version", "uint32_ext_mask" }, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) }, PbReqMsgHead.class);
  public final PBUInt32Field uint32_ext_mask = PBField.initUInt32(0);
  public final PBUInt32Field uint32_platform_type = PBField.initUInt32(0);
  public final PBUInt32Field uint32_version = PBField.initUInt32(0);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\jungle\weather\proto\WeatherReportInfo$PbReqMsgHead.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */