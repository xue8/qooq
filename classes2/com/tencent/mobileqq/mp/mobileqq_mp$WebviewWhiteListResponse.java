package com.tencent.mobileqq.mp;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;

public final class mobileqq_mp$WebviewWhiteListResponse
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18, 26 }, new String[] { "ret_info", "version", "data" }, new Object[] { null, "", "" }, WebviewWhiteListResponse.class);
  public final PBStringField data = PBField.initString("");
  public mobileqq_mp.RetInfo ret_info = new mobileqq_mp.RetInfo();
  public final PBStringField version = PBField.initString("");
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\mobileqq\mp\mobileqq_mp$WebviewWhiteListResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */