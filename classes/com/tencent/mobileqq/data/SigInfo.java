package com.tencent.mobileqq.data;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public class SigInfo
{
  public byte cReplyCodeBody;
  public byte cType;
  public byte[] sessionKey;
  public byte[] signature;
  public short wSignatureLen;
  
  public SigInfo()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\com\tencent\mobileqq\data\SigInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */