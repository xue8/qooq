package oicq.wlogin_sdk.devicelock;

import oicq.wlogin_sdk.tools.util;

public class j
  extends e
{
  public byte[] a = new byte[0];
  public byte[] b = new byte[0];
  public int c;
  public int d;
  
  public j()
  {
    this._type = 14;
  }
  
  public void parse()
  {
    int i = this._head_len;
    this.c = util.buf_to_int16(this._buf, i);
    int j = i + 2;
    i = util.buf_to_int16(this._buf, j);
    j += 2;
    this.a = new byte[i];
    System.arraycopy(this._buf, j, this.a, 0, i);
    i = j + i;
    this.d = util.buf_to_int16(this._buf, i);
    j = i + 2;
    i = util.buf_to_int16(this._buf, j);
    j += 2;
    this.b = new byte[i];
    System.arraycopy(this._buf, j, this.b, 0, i);
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\oicq\wlogin_sdk\devicelock\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */