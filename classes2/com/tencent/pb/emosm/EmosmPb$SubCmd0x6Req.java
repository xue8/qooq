package com.tencent.pb.emosm;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class EmosmPb$SubCmd0x6Req
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18 }, new String[] { "u32_tab_id", "str_item_id" }, new Object[] { Integer.valueOf(0), "" }, SubCmd0x6Req.class);
  public final PBStringField str_item_id = PBField.initString("");
  public final PBUInt32Field u32_tab_id = PBField.initUInt32(0);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\pb\emosm\EmosmPb$SubCmd0x6Req.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */