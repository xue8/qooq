package com.tencent.msf.service.protocol.QQWiFi;

import LBS.LBSInfo;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class e
  extends JceStruct
{
  static LBSInfo c;
  public LBSInfo a;
  public long b;
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    if (c == null) {
      c = new LBSInfo();
    }
    this.a = ((LBSInfo)paramJceInputStream.read(c, 0, false));
    this.b = paramJceInputStream.read(this.b, 1, false);
  }
  
  public String toString()
  {
    return "WiFiMapReq [lbsInfo=" + this.a + ", last_id=" + this.b + "]";
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    if (this.a != null) {
      paramJceOutputStream.write(this.a, 0);
    }
    paramJceOutputStream.write(this.b, 1);
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\com\tencent\msf\service\protocol\QQWiFi\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */