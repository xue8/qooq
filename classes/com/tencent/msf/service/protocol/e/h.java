package com.tencent.msf.service.protocol.e;

import com.qq.taf.jce.JceDisplayer;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.qq.taf.jce.JceUtil;
import java.util.ArrayList;

public final class h
  extends JceStruct
{
  static ArrayList e;
  static ArrayList f;
  public ArrayList a;
  public int b;
  public ArrayList c;
  public byte d;
  
  static
  {
    if (!h.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      g = bool;
      return;
    }
  }
  
  public h() {}
  
  public h(ArrayList paramArrayList1, int paramInt, ArrayList paramArrayList2, byte paramByte)
  {
    this.a = paramArrayList1;
    this.b = paramInt;
    this.c = paramArrayList2;
    this.d = paramByte;
  }
  
  public Object clone()
  {
    Object localObject1 = null;
    try
    {
      Object localObject2 = super.clone();
      localObject1 = localObject2;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      while (g) {}
      throw new AssertionError();
    }
    return localObject1;
  }
  
  public void display(StringBuilder paramStringBuilder, int paramInt)
  {
    paramStringBuilder = new JceDisplayer(paramStringBuilder, paramInt);
    paramStringBuilder.display(this.a, "signatures");
    paramStringBuilder.display(this.b, "lcid");
    paramStringBuilder.display(this.c, "uins");
    paramStringBuilder.display(this.d, "base");
  }
  
  public boolean equals(Object paramObject)
  {
    paramObject = (h)paramObject;
    return (JceUtil.equals(this.a, ((h)paramObject).a)) && (JceUtil.equals(this.b, ((h)paramObject).b)) && (JceUtil.equals(this.c, ((h)paramObject).c)) && (JceUtil.equals(this.d, ((h)paramObject).d));
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    if (e == null)
    {
      e = new ArrayList();
      e.add("");
    }
    this.a = ((ArrayList)paramJceInputStream.read(e, 1, true));
    this.b = paramJceInputStream.read(this.b, 2, true);
    if (f == null)
    {
      f = new ArrayList();
      f.add("");
    }
    this.c = ((ArrayList)paramJceInputStream.read(f, 3, true));
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


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\com\tencent\msf\service\protocol\e\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */