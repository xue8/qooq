package tencent.im.oidb.hotchat;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;

public final class oidb_0x8ab$ReqBody
  extends MessageMicro
{
  public static final int HOTNAMECODE_FIELD_NUMBER = 2;
  public static final int LBS_INFO_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18 }, new String[] { "lbs_info", "hotnamecode" }, new Object[] { null, "" }, ReqBody.class);
  public final PBStringField hotnamecode = PBField.initString("");
  public LBS.LBSInfo lbs_info = new LBS.LBSInfo();
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\oidb\hotchat\oidb_0x8ab$ReqBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */