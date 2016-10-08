package com.tencent.pb.emosm;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class EmosmPb$SubCmd0x3ReqFetchBq
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBRepeatField rpt_bytes_bqid = PBField.initRepeat(PBBytesField.__repeatHelper__);
  public final PBRepeatField rpt_new_itemid = PBField.initRepeat(PBBytesField.__repeatHelper__);
  public final PBUInt32Field uint32_tab_id = PBField.initUInt32(0);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    ByteStringMicro localByteStringMicro1 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro2 = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 26 }, new String[] { "uint32_tab_id", "rpt_bytes_bqid", "rpt_new_itemid" }, new Object[] { Integer.valueOf(0), localByteStringMicro1, localByteStringMicro2 }, SubCmd0x3ReqFetchBq.class);
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\pb\emosm\EmosmPb$SubCmd0x3ReqFetchBq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */