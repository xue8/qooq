package NS_MOBILE_OPERATION;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public final class operation_get_eggskeyword_req
  extends JceStruct
{
  public long uin;
  
  public operation_get_eggskeyword_req()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public operation_get_eggskeyword_req(long paramLong)
  {
    this.uin = paramLong;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.uin = paramJceInputStream.read(this.uin, 0, false);
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.uin, 0);
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\NS_MOBILE_OPERATION\operation_get_eggskeyword_req.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */