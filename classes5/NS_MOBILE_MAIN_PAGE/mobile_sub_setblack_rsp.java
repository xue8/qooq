package NS_MOBILE_MAIN_PAGE;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public final class mobile_sub_setblack_rsp
  extends JceStruct
{
  public int ret;
  
  public mobile_sub_setblack_rsp()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public mobile_sub_setblack_rsp(int paramInt)
  {
    this.ret = paramInt;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.ret = paramJceInputStream.read(this.ret, 0, false);
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.ret, 0);
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\NS_MOBILE_MAIN_PAGE\mobile_sub_setblack_rsp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */