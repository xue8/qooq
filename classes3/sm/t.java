package sm;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.qq.taf.jce.JceUtil;

public final class t
  extends JceStruct
  implements Cloneable
{
  public int a = 0;
  public boolean b = true;
  public int c = 0;
  public int d = 0;
  
  static
  {
    if (!t.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      e = bool;
      return;
    }
  }
  
  public t()
  {
    a(this.a);
    a(this.b);
    b(this.c);
    c(this.d);
  }
  
  public int a()
  {
    return this.a;
  }
  
  public void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  public void a(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }
  
  public int b()
  {
    return this.c;
  }
  
  public void b(int paramInt)
  {
    this.c = paramInt;
  }
  
  public void c(int paramInt)
  {
    this.d = paramInt;
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
      while (e) {}
      throw new AssertionError();
    }
    return localObject1;
  }
  
  public void display(StringBuilder paramStringBuilder, int paramInt) {}
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == null) {}
    do
    {
      return false;
      paramObject = (t)paramObject;
    } while ((!JceUtil.equals(this.a, ((t)paramObject).a)) || (!JceUtil.equals(this.b, ((t)paramObject).b)) || (!JceUtil.equals(this.c, ((t)paramObject).c)) || (!JceUtil.equals(this.d, ((t)paramObject).d)));
    return true;
  }
  
  public int hashCode()
  {
    try
    {
      throw new Exception("Need define key first!");
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return 0;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    a(paramJceInputStream.read(this.a, 0, true));
    a(paramJceInputStream.read(this.b, 1, true));
    b(paramJceInputStream.read(this.c, 2, false));
    c(paramJceInputStream.read(this.d, 3, false));
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.a, 0);
    paramJceOutputStream.write(this.b, 1);
    paramJceOutputStream.write(this.c, 2);
    paramJceOutputStream.write(this.d, 3);
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\sm\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */