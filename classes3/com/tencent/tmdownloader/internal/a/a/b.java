package com.tencent.tmdownloader.internal.a.a;

public class b
{
  public String a = null;
  public String b = null;
  public int c = 0;
  public long d = 0L;
  public long e = 0L;
  public long f = 0L;
  
  public b(String paramString1, String paramString2)
  {
    this.a = paramString1;
    this.b = paramString2;
  }
  
  public boolean a(long paramLong1, long paramLong2, long paramLong3)
  {
    if (paramLong1 == paramLong2)
    {
      this.d = paramLong1;
      this.e = paramLong2;
      this.f = paramLong3;
      return true;
    }
    if ((paramLong3 - this.f >= 1000L) && (paramLong1 != this.d))
    {
      this.d = paramLong1;
      this.e = paramLong2;
      this.f = paramLong3;
      return true;
    }
    if ((paramLong2 > 0L) && (((float)paramLong1 * 1.0F - (float)this.d * 1.0F) / (float)paramLong2 * 1.0F > 0.009999999776482582D))
    {
      this.d = paramLong1;
      this.e = paramLong2;
      this.f = paramLong3;
      return true;
    }
    return false;
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\tencent\tmdownloader\internal\a\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */