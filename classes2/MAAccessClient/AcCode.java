package MAAccessClient;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public final class AcCode
  extends JceStruct
{
  public String appid;
  public String imei;
  public String random;
  public int versionCode;
  
  public AcCode()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.imei = "";
    this.appid = "";
    this.random = "";
  }
  
  public AcCode(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    this.imei = "";
    this.appid = "";
    this.random = "";
    this.imei = paramString1;
    this.appid = paramString2;
    this.random = paramString3;
    this.versionCode = paramInt;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.imei = paramJceInputStream.readString(0, false);
    this.appid = paramJceInputStream.readString(1, false);
    this.random = paramJceInputStream.readString(2, false);
    this.versionCode = paramJceInputStream.read(this.versionCode, 3, false);
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    if (this.imei != null) {
      paramJceOutputStream.write(this.imei, 0);
    }
    if (this.appid != null) {
      paramJceOutputStream.write(this.appid, 1);
    }
    if (this.random != null) {
      paramJceOutputStream.write(this.random, 2);
    }
    paramJceOutputStream.write(this.versionCode, 3);
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\MAAccessClient\AcCode.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */