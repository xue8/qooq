package oicq.wlogin_sdk.a;

import oicq.wlogin_sdk.tools.util;

public class e
  extends a
{
  public e()
  {
    this.b = 4;
  }
  
  public byte[] b(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    this.d = (paramArrayOfByte1.length + 1);
    paramArrayOfByte2 = new byte[this.d];
    util.int8_to_buf(paramArrayOfByte2, 0, paramArrayOfByte1.length);
    System.arraycopy(paramArrayOfByte1, 0, paramArrayOfByte2, 1, paramArrayOfByte1.length);
    int i = paramArrayOfByte1.length;
    return a(paramArrayOfByte2);
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\oicq\wlogin_sdk\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */