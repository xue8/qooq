package com.tencent.ims;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class MobileQQDetect$DetectTimePacket
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16 }, new String[] { "u32_baseline", "u32_delay" }, new Object[] { Integer.valueOf(0), Integer.valueOf(0) }, DetectTimePacket.class);
  public final PBUInt32Field u32_baseline = PBField.initUInt32(0);
  public final PBUInt32Field u32_delay = PBField.initUInt32(0);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\ims\MobileQQDetect$DetectTimePacket.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */