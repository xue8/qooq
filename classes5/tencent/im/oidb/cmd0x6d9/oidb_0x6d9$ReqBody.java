package tencent.im.oidb.cmd0x6d9;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;

public final class oidb_0x6d9$ReqBody
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 42 }, new String[] { "trans_file_req", "feeds_info_req" }, new Object[] { null, null }, ReqBody.class);
  public oidb_0x6d9.FeedsReqBody feeds_info_req = new oidb_0x6d9.FeedsReqBody();
  public oidb_0x6d9.TransFileReqBody trans_file_req = new oidb_0x6d9.TransFileReqBody();
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\oidb\cmd0x6d9\oidb_0x6d9$ReqBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */