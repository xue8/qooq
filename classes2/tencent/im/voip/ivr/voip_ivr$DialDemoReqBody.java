package tencent.im.voip.ivr;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;

public final class voip_ivr$DialDemoReqBody
  extends MessageMicro
{
  public static final int KEY_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10 }, new String[] { "key" }, new Object[] { "" }, DialDemoReqBody.class);
  public final PBStringField key = PBField.initString("");
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\tencent\im\voip\ivr\voip_ivr$DialDemoReqBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */