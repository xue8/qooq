package NS_MOBILE_PHOTO;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import java.io.Serializable;

public final class enum_album_error_code_define
  implements Serializable
{
  public static final int _enum_album_not_exist = -11529;
  private static enum_album_error_code_define[] a;
  public static final enum_album_error_code_define enum_album_not_exist;
  private String __T = new String();
  private int __value;
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    if (!enum_album_error_code_define.class.desiredAssertionStatus()) {}
    for (bool = true;; bool = false)
    {
      $assertionsDisabled = bool;
      a = new enum_album_error_code_define[1];
      enum_album_not_exist = new enum_album_error_code_define(0, 54007, "enum_album_not_exist");
      return;
    }
  }
  
  private enum_album_error_code_define(int paramInt1, int paramInt2, String paramString)
  {
    this.__T = paramString;
    this.__value = paramInt2;
    a[paramInt1] = this;
  }
  
  public static enum_album_error_code_define convert(int paramInt)
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
  
  public static enum_album_error_code_define convert(String paramString)
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


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\NS_MOBILE_PHOTO\enum_album_error_code_define.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */