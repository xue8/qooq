import com.tencent.mobileqq.app.CardHandler;
import com.tencent.mobileqq.app.HotChatManager;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBRepeatField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import java.util.ArrayList;
import java.util.List;
import tencent.im.oidb.cmd0x5eb.oidb_0x5eb.ReqBody;
import tencent.im.oidb.cmd0x66b.Oidb_0x66b.ReqBody;

public class pyr
  implements Runnable
{
  public pyr(HotChatManager paramHotChatManager)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void run()
  {
    CardHandler localCardHandler = (CardHandler)this.a.a.a(2);
    oidb_0x5eb.ReqBody localReqBody = new oidb_0x5eb.ReqBody();
    Oidb_0x66b.ReqBody localReqBody1 = new Oidb_0x66b.ReqBody();
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Long.valueOf(Long.parseLong(this.a.a.a())));
    localReqBody.rpt_uint64_uins.set(localArrayList);
    localReqBody1.bytes_reqbody_5eb.set(ByteStringMicro.copyFrom(localReqBody.toByteArray()));
    localReqBody1.uint32_req_pansocialinfo.set(1);
    localCardHandler.a(localReqBody1);
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\pyr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */