package tencent.im.cs;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;

public final class head$MsgHead
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10 }, new String[] { "msg_content_head" }, new Object[] { null }, MsgHead.class);
  public head.ContentHead msg_content_head = new head.ContentHead();
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\cs\head$MsgHead.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */