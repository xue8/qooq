package com.tencent.mobileqq.ac;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class ArticleComment$GetArticleLikeCountRespond
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 16 }, new String[] { "ret", "count" }, new Object[] { null, Integer.valueOf(0) }, GetArticleLikeCountRespond.class);
  public final PBUInt32Field count = PBField.initUInt32(0);
  public ArticleComment.RetInfo ret = new ArticleComment.RetInfo();
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\mobileqq\ac\ArticleComment$GetArticleLikeCountRespond.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */