package com.tencent.pb.emosm;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBFixed32Field;
import com.tencent.mobileqq.pb.PBInt32Field;
import com.tencent.mobileqq.pb.PBRepeatField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;

public final class EmosmPb$SubCmd0x2RspFetchTab
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 13, 16, 26, 34, 42, 48 }, new String[] { "fixed32_timestamp", "int32_segment_flag", "rpt_msg_tabinfo", "rpt_magic_tabinfo", "rpt_smallbq_tabinfo", "uint32_tab_id" }, new Object[] { Integer.valueOf(0), Integer.valueOf(0), null, null, null, Integer.valueOf(0) }, SubCmd0x2RspFetchTab.class);
  public final PBFixed32Field fixed32_timestamp = PBField.initFixed32(0);
  public final PBInt32Field int32_segment_flag = PBField.initInt32(0);
  public final PBRepeatMessageField rpt_magic_tabinfo = PBField.initRepeatMessage(EmosmPb.SubCmd0x2RspFetchTab.TabInfo.class);
  public final PBRepeatMessageField rpt_msg_tabinfo = PBField.initRepeatMessage(EmosmPb.SubCmd0x2RspFetchTab.TabInfo.class);
  public final PBRepeatMessageField rpt_smallbq_tabinfo = PBField.initRepeatMessage(EmosmPb.SubCmd0x2RspFetchTab.TabInfo.class);
  public final PBRepeatField uint32_tab_id = PBField.initRepeat(PBInt32Field.__repeatHelper__);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\pb\emosm\EmosmPb$SubCmd0x2RspFetchTab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */