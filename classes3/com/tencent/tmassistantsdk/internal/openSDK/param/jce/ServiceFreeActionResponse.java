package com.tencent.tmassistantsdk.internal.openSDK.param.jce;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class ServiceFreeActionResponse
  extends JceStruct
{
  static byte[] a;
  public byte[] revertField = null;
  
  public ServiceFreeActionResponse() {}
  
  public ServiceFreeActionResponse(byte[] paramArrayOfByte)
  {
    this.revertField = paramArrayOfByte;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    if (a == null)
    {
      a = (byte[])new byte[1];
      ((byte[])a)[0] = 0;
    }
    this.revertField = ((byte[])paramJceInputStream.read(a, 0, false));
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    if (this.revertField != null) {
      paramJceOutputStream.write(this.revertField, 0);
    }
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\tencent\tmassistantsdk\internal\openSDK\param\jce\ServiceFreeActionResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */