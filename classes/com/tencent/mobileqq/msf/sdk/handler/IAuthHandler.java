package com.tencent.mobileqq.msf.sdk.handler;

import com.tencent.mobileqq.msf.sdk.VerifyCodeInfo;
import com.tencent.msf.service.protocol.security.RespondCustomSig;
import com.tencent.qphone.base.remote.FromServiceMsg;
import com.tencent.qphone.base.remote.ToServiceMsg;

public abstract interface IAuthHandler
  extends IMsfHandler
{
  public abstract void onDelLoginedAccountResp(int paramInt1, int paramInt2, String paramString, ToServiceMsg paramToServiceMsg, FromServiceMsg paramFromServiceMsg);
  
  public abstract void onGetKeyResp(ToServiceMsg paramToServiceMsg, FromServiceMsg paramFromServiceMsg);
  
  public abstract void onGetSidResp(int paramInt1, int paramInt2, String paramString1, String paramString2, ToServiceMsg paramToServiceMsg, FromServiceMsg paramFromServiceMsg);
  
  public abstract void onGetUinSignResp(ToServiceMsg paramToServiceMsg, FromServiceMsg paramFromServiceMsg, byte[] paramArrayOfByte);
  
  public abstract void onReceVerifyCode(VerifyCodeInfo paramVerifyCodeInfo, ToServiceMsg paramToServiceMsg, FromServiceMsg paramFromServiceMsg);
  
  public abstract void onRecvChangeTokenResp(int paramInt1, int paramInt2, String paramString, RespondCustomSig paramRespondCustomSig, ToServiceMsg paramToServiceMsg, FromServiceMsg paramFromServiceMsg);
  
  public abstract void onRecvChangeUinLoginResp(int paramInt1, int paramInt2, String paramString, ToServiceMsg paramToServiceMsg, FromServiceMsg paramFromServiceMsg);
  
  public abstract void onRecvChangeUinResp(int paramInt1, int paramInt2, String paramString, ToServiceMsg paramToServiceMsg, FromServiceMsg paramFromServiceMsg);
  
  public abstract void onRecvLoginResp(int paramInt1, int paramInt2, String paramString, ToServiceMsg paramToServiceMsg, FromServiceMsg paramFromServiceMsg);
  
  public abstract void onRefreSidResp(int paramInt1, int paramInt2, String paramString, ToServiceMsg paramToServiceMsg, FromServiceMsg paramFromServiceMsg);
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\com\tencent\mobileqq\msf\sdk\handler\IAuthHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */