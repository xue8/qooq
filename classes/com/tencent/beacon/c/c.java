package com.tencent.beacon.c;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class c
{
  private int a;
  private int b;
  private int c;
  private List<d> d = Collections.synchronizedList(new ArrayList());
  
  public final int a()
  {
    try
    {
      int i = this.b;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void a(int paramInt)
  {
    try
    {
      this.a = paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final int b()
  {
    try
    {
      int i = this.c;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void b(int paramInt)
  {
    try
    {
      this.b = paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final List<d> c()
  {
    return this.d;
  }
  
  public final void c(int paramInt)
  {
    try
    {
      this.c = paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == null) {}
    while ((getClass() != paramObject.getClass()) || (!(paramObject instanceof c)) || (((c)paramObject).a != this.a)) {
      return false;
    }
    return true;
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\com\tencent\beacon\c\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */