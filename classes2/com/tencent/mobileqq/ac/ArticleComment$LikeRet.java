package com.tencent.mobileqq.ac;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class ArticleComment$LikeRet
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16 }, new String[] { "uin", "like" }, new Object[] { Long.valueOf(0L), Integer.valueOf(0) }, LikeRet.class);
  public final PBUInt32Field like = PBField.initUInt32(0);
  public final PBUInt64Field uin = PBField.initUInt64(0L);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\mobileqq\ac\ArticleComment$LikeRet.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */