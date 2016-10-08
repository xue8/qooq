package com.tencent.tmassistantsdk.internal.openSDK.param.jce;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class SyncSDKHandShakeRequest
  extends JceStruct
{
  public String extra = "";
  
  public SyncSDKHandShakeRequest() {}
  
  public SyncSDKHandShakeRequest(String paramString)
  {
    this.extra = paramString;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.extra = paramJceInputStream.readString(0, true);
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.extra, 0);
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\tencent\tmassistantsdk\internal\openSDK\param\jce\SyncSDKHandShakeRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */