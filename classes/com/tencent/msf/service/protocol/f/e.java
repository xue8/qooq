package com.tencent.msf.service.protocol.f;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.ArrayList;

public final class e
  extends JceStruct
{
  static ArrayList c;
  public ArrayList a;
  public int b = 64;
  
  public e() {}
  
  public e(ArrayList paramArrayList, int paramInt)
  {
    this.a = paramArrayList;
    this.b = paramInt;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    if (c == null)
    {
      c = new ArrayList();
      d locald = new d();
      c.add(locald);
    }
    this.a = ((ArrayList)paramJceInputStream.read(c, 1, true));
    this.b = paramJceInputStream.read(this.b, 2, false);
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.a, 1);
    paramJceOutputStream.write(this.b, 2);
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\com\tencent\msf\service\protocol\f\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */