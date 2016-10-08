package com.tencent.component.network.module.base.inter;

public abstract interface Log
{
  public static final int ASSERT = 6;
  public static final int DEBUG = 2;
  public static final int ERROR = 5;
  public static final int INFO = 3;
  public static final int VERBOSE = 1;
  public static final int WARN = 4;
  
  public abstract void d(String paramString1, String paramString2);
  
  public abstract void d(String paramString1, String paramString2, Throwable paramThrowable);
  
  public abstract void e(String paramString1, String paramString2);
  
  public abstract void e(String paramString1, String paramString2, Throwable paramThrowable);
  
  public abstract int getLogLevel();
  
  public abstract void i(String paramString1, String paramString2);
  
  public abstract void i(String paramString1, String paramString2, Throwable paramThrowable);
  
  public abstract void w(String paramString1, String paramString2);
  
  public abstract void w(String paramString1, String paramString2, Throwable paramThrowable);
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\tencent\component\network\module\base\inter\Log.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */