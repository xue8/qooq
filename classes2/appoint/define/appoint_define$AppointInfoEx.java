package appoint.define;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class appoint_define$AppointInfoEx
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18, 26, 34, 40, 50, 58, 64 }, new String[] { "str_feeds_pic_url", "str_feeds_url", "str_detail_title", "str_detail_describe", "uint32_show_publisher", "str_detail_pic_url", "str_detail_url", "uint32_show_attend" }, new Object[] { "", "", "", "", Integer.valueOf(0), "", "", Integer.valueOf(0) }, AppointInfoEx.class);
  public final PBStringField str_detail_describe = PBField.initString("");
  public final PBStringField str_detail_pic_url = PBField.initString("");
  public final PBStringField str_detail_title = PBField.initString("");
  public final PBStringField str_detail_url = PBField.initString("");
  public final PBStringField str_feeds_pic_url = PBField.initString("");
  public final PBStringField str_feeds_url = PBField.initString("");
  public final PBUInt32Field uint32_show_attend = PBField.initUInt32(0);
  public final PBUInt32Field uint32_show_publisher = PBField.initUInt32(0);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\appoint\define\appoint_define$AppointInfoEx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */