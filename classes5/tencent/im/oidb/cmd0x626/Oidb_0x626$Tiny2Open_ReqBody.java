package tencent.im.oidb.cmd0x626;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;

public final class Oidb_0x626$Tiny2Open_ReqBody
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10 }, new String[] { "msg_tinyid_req_info" }, new Object[] { null }, Tiny2Open_ReqBody.class);
  public final PBRepeatMessageField msg_tinyid_req_info = PBField.initRepeatMessage(Oidb_0x626.TinyIDInfoReq.class);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\oidb\cmd0x626\Oidb_0x626$Tiny2Open_ReqBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */