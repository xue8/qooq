package tencent.im.msg;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class im_msg_body$SmallEmoji
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8 }, new String[] { "packIdSum" }, new Object[] { Integer.valueOf(0) }, SmallEmoji.class);
  public final PBUInt32Field packIdSum = PBField.initUInt32(0);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\msg\im_msg_body$SmallEmoji.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */