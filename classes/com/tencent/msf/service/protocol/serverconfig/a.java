package com.tencent.msf.service.protocol.serverconfig;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class a
  extends JceStruct
{
  static k g;
  static k h;
  public int a;
  public k b;
  public k c;
  public byte d;
  public int e;
  public long f;
  
  public a() {}
  
  public a(int paramInt1, k paramk1, k paramk2, byte paramByte, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramk1;
    this.c = paramk2;
    this.d = paramByte;
    this.e = paramInt2;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.a = paramJceInputStream.read(this.a, 1, true);
    if (g == null) {
      g = new k();
    }
    this.b = ((k)paramJceInputStream.read(g, 2, false));
    if (h == null) {
      h = new k();
    }
    this.c = ((k)paramJceInputStream.read(h, 3, false));
    this.d = paramJceInputStream.read(this.d, 4, false);
    this.e = paramJceInputStream.read(this.e, 5, false);
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.a, 1);
    if (this.b != null) {
      paramJceOutputStream.write(this.b, 2);
    }
    if (this.c != null) {
      paramJceOutputStream.write(this.c, 3);
    }
    paramJceOutputStream.write(this.d, 4);
    paramJceOutputStream.write(this.e, 5);
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\com\tencent\msf\service\protocol\serverconfig\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */