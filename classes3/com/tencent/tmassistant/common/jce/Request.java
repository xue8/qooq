package com.tencent.tmassistant.common.jce;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class Request
  extends JceStruct
{
  static ReqHead a;
  static byte[] b;
  public byte[] body = null;
  public ReqHead head = null;
  
  public Request() {}
  
  public Request(ReqHead paramReqHead, byte[] paramArrayOfByte)
  {
    this.head = paramReqHead;
    this.body = paramArrayOfByte;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    if (a == null) {
      a = new ReqHead();
    }
    this.head = ((ReqHead)paramJceInputStream.read(a, 0, true));
    if (b == null)
    {
      b = (byte[])new byte[1];
      ((byte[])b)[0] = 0;
    }
    this.body = ((byte[])paramJceInputStream.read(b, 1, false));
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.head, 0);
    if (this.body != null) {
      paramJceOutputStream.write(this.body, 1);
    }
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\tencent\tmassistant\common\jce\Request.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */