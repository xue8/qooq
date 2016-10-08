package NS_MOBILE_OPERATION;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public final class operation_addfavour_rsp
  extends JceStruct
{
  public String msg;
  public int ret;
  public String strFavID;
  
  public operation_addfavour_rsp()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.msg = "";
    this.strFavID = "";
  }
  
  public operation_addfavour_rsp(int paramInt, String paramString1, String paramString2)
  {
    this.msg = "";
    this.strFavID = "";
    this.ret = paramInt;
    this.msg = paramString1;
    this.strFavID = paramString2;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.ret = paramJceInputStream.read(this.ret, 0, false);
    this.msg = paramJceInputStream.readString(1, false);
    this.strFavID = paramJceInputStream.readString(2, false);
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.ret, 0);
    if (this.msg != null) {
      paramJceOutputStream.write(this.msg, 1);
    }
    if (this.strFavID != null) {
      paramJceOutputStream.write(this.strFavID, 2);
    }
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\NS_MOBILE_OPERATION\operation_addfavour_rsp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */