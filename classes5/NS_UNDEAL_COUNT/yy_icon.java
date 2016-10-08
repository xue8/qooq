package NS_UNDEAL_COUNT;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public final class yy_icon
  extends JceStruct
{
  public int iEntranceId;
  public String sIconName;
  public String sIconTraceInfo;
  public String sIconUrl;
  
  public yy_icon()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.sIconUrl = "";
    this.sIconName = "";
    this.sIconTraceInfo = "";
  }
  
  public yy_icon(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    this.sIconUrl = "";
    this.sIconName = "";
    this.sIconTraceInfo = "";
    this.iEntranceId = paramInt;
    this.sIconUrl = paramString1;
    this.sIconName = paramString2;
    this.sIconTraceInfo = paramString3;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.iEntranceId = paramJceInputStream.read(this.iEntranceId, 0, false);
    this.sIconUrl = paramJceInputStream.readString(1, false);
    this.sIconName = paramJceInputStream.readString(2, false);
    this.sIconTraceInfo = paramJceInputStream.readString(3, false);
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.iEntranceId, 0);
    if (this.sIconUrl != null) {
      paramJceOutputStream.write(this.sIconUrl, 1);
    }
    if (this.sIconName != null) {
      paramJceOutputStream.write(this.sIconName, 2);
    }
    if (this.sIconTraceInfo != null) {
      paramJceOutputStream.write(this.sIconTraceInfo, 3);
    }
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\NS_UNDEAL_COUNT\yy_icon.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */