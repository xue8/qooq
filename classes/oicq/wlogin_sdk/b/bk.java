package oicq.wlogin_sdk.b;

import oicq.wlogin_sdk.tools.util;

public class bk
  extends a
{
  public int h = 0;
  public int i = 0;
  
  public bk()
  {
    this.g = 376;
  }
  
  public Boolean e()
  {
    if (this.e < 12) {
      return Boolean.valueOf(false);
    }
    int j = util.buf_to_int16(this.f, this.d);
    if (this.e < j + 12) {
      return Boolean.valueOf(false);
    }
    this.h = j;
    j = util.buf_to_int16(this.f, this.d + 2 + this.h);
    if (this.e < this.h + 12 + j) {
      return Boolean.valueOf(false);
    }
    this.i = j;
    return Boolean.valueOf(true);
  }
  
  public byte[] f()
  {
    byte[] arrayOfByte = new byte[this.h];
    System.arraycopy(this.f, this.d + 2, arrayOfByte, 0, this.h);
    return arrayOfByte;
  }
  
  public byte[] g()
  {
    byte[] arrayOfByte = new byte[this.i];
    System.arraycopy(this.f, this.d + 2 + this.h + 2, arrayOfByte, 0, this.i);
    return arrayOfByte;
  }
  
  public int h()
  {
    return util.buf_to_int32(this.f, this.d + 2 + this.h + 2 + this.i);
  }
  
  public int i()
  {
    return util.buf_to_int16(this.f, this.d + 2 + this.h + 2 + this.i + 4);
  }
  
  public int j()
  {
    return util.buf_to_int16(this.f, this.d + 2 + this.h + 2 + this.i + 4 + 2);
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\oicq\wlogin_sdk\b\bk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */