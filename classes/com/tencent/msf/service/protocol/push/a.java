package com.tencent.msf.service.protocol.push;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class a
  extends JceStruct
{
  static byte[] d = (byte[])new byte[1];
  public long a;
  public byte[] b;
  public int c = 11;
  
  static
  {
    ((byte[])d)[0] = 0;
  }
  
  public a() {}
  
  public a(long paramLong, byte[] paramArrayOfByte, int paramInt)
  {
    this.a = paramLong;
    this.b = paramArrayOfByte;
    this.c = paramInt;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.a = paramJceInputStream.read(this.a, 0, true);
    this.b = ((byte[])paramJceInputStream.read(d, 1, true));
    this.c = paramJceInputStream.read(this.c, 2, false);
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.a, 0);
    paramJceOutputStream.write(this.b, 1);
    paramJceOutputStream.write(this.c, 2);
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\com\tencent\msf\service\protocol\push\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */