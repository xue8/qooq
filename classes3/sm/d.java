package sm;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.qq.taf.jce.JceUtil;

public final class d
  extends JceStruct
  implements Cloneable
{
  public long a = 0L;
  public boolean b = false;
  
  static
  {
    if (!d.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      c = bool;
      return;
    }
  }
  
  public d()
  {
    a(this.a);
    a(this.b);
  }
  
  public d(long paramLong, boolean paramBoolean)
  {
    a(paramLong);
    a(paramBoolean);
  }
  
  public void a(long paramLong)
  {
    this.a = paramLong;
  }
  
  public void a(boolean paramBoolean)
  {
    this.b = paramBoolean;
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
      while (c) {}
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
      paramObject = (d)paramObject;
    } while ((!JceUtil.equals(this.a, ((d)paramObject).a)) || (!JceUtil.equals(this.b, ((d)paramObject).b)));
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
    a(paramJceInputStream.read(this.b, 1, false));
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.a, 0);
    paramJceOutputStream.write(this.b, 1);
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\sm\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */