package com.tencent.mobileqq.msf.core.c;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.HashMap;
import java.util.Map;

public final class a
  extends JceStruct
{
  static Map d;
  public Map a;
  public long b;
  public long c;
  
  public a() {}
  
  public a(Map paramMap, long paramLong1, long paramLong2)
  {
    this.a = paramMap;
    this.b = paramLong1;
    this.c = paramLong2;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    if (d == null)
    {
      d = new HashMap();
      q localq = new q();
      d.put("", localq);
    }
    this.a = ((Map)paramJceInputStream.read(d, 1, true));
    this.b = paramJceInputStream.read(this.b, 2, true);
    this.c = paramJceInputStream.read(this.c, 3, true);
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.a, 1);
    paramJceOutputStream.write(this.b, 2);
    paramJceOutputStream.write(this.c, 3);
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\com\tencent\mobileqq\msf\core\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */