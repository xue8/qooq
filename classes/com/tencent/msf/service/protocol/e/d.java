package com.tencent.msf.service.protocol.e;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class d
  extends JceStruct
{
  static byte[] d;
  public int a;
  public boolean b;
  public byte[] c;
  
  public d() {}
  
  public d(int paramInt, boolean paramBoolean, byte[] paramArrayOfByte)
  {
    this.a = paramInt;
    this.b = paramBoolean;
    this.c = paramArrayOfByte;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.a = paramJceInputStream.read(this.a, 1, true);
    this.b = paramJceInputStream.read(this.b, 2, false);
    if (d == null)
    {
      d = (byte[])new byte[1];
      ((byte[])d)[0] = 0;
    }
    this.c = ((byte[])paramJceInputStream.read(d, 3, false));
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.a, 1);
    paramJceOutputStream.write(this.b, 2);
    if (this.c != null) {
      paramJceOutputStream.write(this.c, 3);
    }
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\com\tencent\msf\service\protocol\e\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */