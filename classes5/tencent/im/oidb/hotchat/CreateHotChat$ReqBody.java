package tencent.im.oidb.hotchat;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;

public final class CreateHotChat$ReqBody
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18 }, new String[] { "create_req_info", "lbs_info" }, new Object[] { null, null }, ReqBody.class);
  public Common.WifiPOIInfo create_req_info = new Common.WifiPOIInfo();
  public LBS.LBSInfo lbs_info = new LBS.LBSInfo();
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\oidb\hotchat\CreateHotChat$ReqBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */