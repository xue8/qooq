package com.tencent.pb.mqqcomic;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;

public final class MqqComicPb$GetMyComicFavorEmotIconsRspBody
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10 }, new String[] { "rsps" }, new Object[] { null }, GetMyComicFavorEmotIconsRspBody.class);
  public final PBRepeatMessageField rsps = PBField.initRepeatMessage(MqqComicPb.ComicFavorEmotIcons.class);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\pb\mqqcomic\MqqComicPb$GetMyComicFavorEmotIconsRspBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */