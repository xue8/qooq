package tencent.im.cs.cmd0x383;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;

public final class cmd0x383$ApplyTransFileRspBody
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10 }, new String[] { "str_save_file_path" }, new Object[] { "" }, ApplyTransFileRspBody.class);
  public final PBStringField str_save_file_path = PBField.initString("");
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\cs\cmd0x383\cmd0x383$ApplyTransFileRspBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */