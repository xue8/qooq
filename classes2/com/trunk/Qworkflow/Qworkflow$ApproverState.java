package com.trunk.Qworkflow;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class Qworkflow$ApproverState
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_comment = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBUInt32Field uint32_bepushed_times = PBField.initUInt32(0);
  public final PBUInt32Field uint32_last_bepushed_time = PBField.initUInt32(0);
  public final PBUInt32Field uint32_state = PBField.initUInt32(0);
  public final PBUInt64Field uint64_approve_time = PBField.initUInt64(0L);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 26, 32, 40 }, new String[] { "uint32_state", "uint32_bepushed_times", "bytes_comment", "uint32_last_bepushed_time", "uint64_approve_time" }, new Object[] { Integer.valueOf(0), Integer.valueOf(0), localByteStringMicro, Integer.valueOf(0), Long.valueOf(0L) }, ApproverState.class);
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\trunk\Qworkflow\Qworkflow$ApproverState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */