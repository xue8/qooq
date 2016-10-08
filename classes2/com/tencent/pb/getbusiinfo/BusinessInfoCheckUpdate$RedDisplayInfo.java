package com.tencent.pb.getbusiinfo;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;

public final class BusinessInfoCheckUpdate$RedDisplayInfo
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18 }, new String[] { "red_type_info", "tab_display_info" }, new Object[] { null, null }, RedDisplayInfo.class);
  public final PBRepeatMessageField red_type_info = PBField.initRepeatMessage(BusinessInfoCheckUpdate.RedTypeInfo.class);
  public BusinessInfoCheckUpdate.RedTypeInfo tab_display_info = new BusinessInfoCheckUpdate.RedTypeInfo();
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\pb\getbusiinfo\BusinessInfoCheckUpdate$RedDisplayInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */