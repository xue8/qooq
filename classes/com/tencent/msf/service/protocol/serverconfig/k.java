package com.tencent.msf.service.protocol.serverconfig;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class k
  extends JceStruct
{
  public int a;
  public byte b;
  public byte c;
  public byte d;
  
  public k() {}
  
  public k(int paramInt, byte paramByte1, byte paramByte2, byte paramByte3)
  {
    this.a = paramInt;
    this.b = paramByte1;
    this.c = paramByte2;
    this.d = paramByte3;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.a = paramJceInputStream.read(this.a, 1, true);
    this.b = paramJceInputStream.read(this.b, 2, true);
    this.c = paramJceInputStream.read(this.c, 3, true);
    this.d = paramJceInputStream.read(this.d, 4, true);
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.a, 1);
    paramJceOutputStream.write(this.b, 2);
    paramJceOutputStream.write(this.c, 3);
    paramJceOutputStream.write(this.d, 4);
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\com\tencent\msf\service\protocol\serverconfig\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */