package MessageSvcPack;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import java.io.Serializable;

public final class MsgFilter
  implements Serializable
{
  public static final MsgFilter LIMIT_10_AND_IN_3_DAYS;
  public static final MsgFilter NO_FILTER;
  public static final int _LIMIT_10_AND_IN_3_DAYS = 1;
  public static final int _NO_FILTER = 0;
  private static MsgFilter[] a;
  private String __T = new String();
  private int __value;
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    if (!MsgFilter.class.desiredAssertionStatus()) {}
    for (bool = true;; bool = false)
    {
      $assertionsDisabled = bool;
      a = new MsgFilter[2];
      NO_FILTER = new MsgFilter(0, 0, "NO_FILTER");
      LIMIT_10_AND_IN_3_DAYS = new MsgFilter(1, 1, "LIMIT_10_AND_IN_3_DAYS");
      return;
    }
  }
  
  private MsgFilter(int paramInt1, int paramInt2, String paramString)
  {
    this.__T = paramString;
    this.__value = paramInt2;
    a[paramInt1] = this;
  }
  
  public static MsgFilter convert(int paramInt)
  {
    int i = 0;
    while (i < a.length)
    {
      if (a[i].value() == paramInt) {
        return a[i];
      }
      i += 1;
    }
    if (!$assertionsDisabled) {
      throw new AssertionError();
    }
    return null;
  }
  
  public static MsgFilter convert(String paramString)
  {
    int i = 0;
    while (i < a.length)
    {
      if (a[i].toString().equals(paramString)) {
        return a[i];
      }
      i += 1;
    }
    if (!$assertionsDisabled) {
      throw new AssertionError();
    }
    return null;
  }
  
  public String toString()
  {
    return this.__T;
  }
  
  public int value()
  {
    return this.__value;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\MessageSvcPack\MsgFilter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */