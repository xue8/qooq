package com.trunk.feeds_inner_define;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class feeds_inner_define$ConcernUinRecord
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 24, 32, 40 }, new String[] { "uint64_concern_uin", "uint32_confirm_time", "uint32_read_time", "uint32_concern_type", "uint32_ignore_time" }, new Object[] { Long.valueOf(0L), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) }, ConcernUinRecord.class);
  public final PBUInt32Field uint32_concern_type = PBField.initUInt32(0);
  public final PBUInt32Field uint32_confirm_time = PBField.initUInt32(0);
  public final PBUInt32Field uint32_ignore_time = PBField.initUInt32(0);
  public final PBUInt32Field uint32_read_time = PBField.initUInt32(0);
  public final PBUInt64Field uint64_concern_uin = PBField.initUInt64(0L);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\trunk\feeds_inner_define\feeds_inner_define$ConcernUinRecord.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */