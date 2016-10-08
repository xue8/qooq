package com.tencent.tmdatasourcesdk.internal.a;

import com.tencent.tmassistant.common.jce.Request;
import com.tencent.tmassistant.common.jce.Response;
import com.tencent.tmassistantbase.a.m;
import com.tencent.tmassistantbase.network.d;
import com.tencent.tmdatasourcesdk.ITMAssistantExchangeURLListenner;
import com.tencent.tmdatasourcesdk.internal.protocol.jce.AppDetailParam;
import com.tencent.tmdatasourcesdk.internal.protocol.jce.GetAppSimpleDetailRequest;
import com.tencent.tmdatasourcesdk.internal.protocol.jce.GetAppSimpleDetailResponse;
import java.util.ArrayList;

public class a
  extends d
{
  protected ITMAssistantExchangeURLListenner b = null;
  
  public a(ITMAssistantExchangeURLListenner paramITMAssistantExchangeURLListenner)
  {
    this.b = paramITMAssistantExchangeURLListenner;
  }
  
  protected void a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt)
  {
    if (paramArrayOfByte2 == null) {
      m.e("GetAppSimpleDetailHttpRequest", "response is null");
    }
    label189:
    label208:
    label247:
    do
    {
      return;
      StringBuilder localStringBuilder = new StringBuilder().append("request length = ");
      if (paramArrayOfByte1 == null) {}
      for (Object localObject = "null";; localObject = Integer.valueOf(paramArrayOfByte1.length))
      {
        m.c("GetAppSimpleDetailHttpRequest", localObject + ",response length = " + paramArrayOfByte2.length + ",errorCode = " + paramInt);
        if ((this.b == null) || (paramInt != 0)) {
          break label247;
        }
        if ((paramArrayOfByte2 == null) || (paramArrayOfByte2.length <= 4)) {
          break;
        }
        paramArrayOfByte2 = com.tencent.tmassistant.common.a.a(paramArrayOfByte2);
        paramArrayOfByte1 = com.tencent.tmassistant.common.a.a(((Request)com.tencent.tmassistant.common.a.a(paramArrayOfByte1, Request.class)).body, GetAppSimpleDetailRequest.class);
        if ((paramArrayOfByte2 == null) || (paramArrayOfByte2.body == null)) {
          break;
        }
        paramArrayOfByte1 = com.tencent.tmassistant.common.a.a(paramArrayOfByte1, paramArrayOfByte2.body);
        if (!(paramArrayOfByte1 instanceof GetAppSimpleDetailResponse)) {
          break;
        }
        paramArrayOfByte1 = (GetAppSimpleDetailResponse)paramArrayOfByte1;
        if (paramArrayOfByte1.ret != 0) {
          break label208;
        }
        paramArrayOfByte1 = paramArrayOfByte1.appSimpleDetailList;
        if ((paramArrayOfByte1 == null) || (paramArrayOfByte1.size() <= 0)) {
          break label189;
        }
        this.b.onExchangedURLSucceed(paramArrayOfByte1, true);
        return;
      }
      m.d("GetAppSimpleDetailHttpRequest", " appDetails 为空!!");
      this.b.onExchangedURLSucceed(null, false);
      return;
      m.d("GetAppSimpleDetailHttpRequest", " 后台返回的ret错误，错误值为：" + paramArrayOfByte1.ret);
      this.b.onExchangedURLSucceed(null, false);
      return;
      m.d("GetAppSimpleDetailHttpRequest", " error happened!!");
    } while (this.b == null);
    m.d("GetAppSimpleDetailHttpRequest", "mListener.onExchangedURLSucceed");
    this.b.onExchangedURLSucceed(null, false);
  }
  
  public boolean a(ArrayList<AppDetailParam> paramArrayList)
  {
    GetAppSimpleDetailRequest localGetAppSimpleDetailRequest = new GetAppSimpleDetailRequest();
    if ((paramArrayList != null) && (paramArrayList.size() > 0))
    {
      m.c("GetAppSimpleDetailHttpRequest", "appDetailParams size = " + paramArrayList.size());
      localGetAppSimpleDetailRequest.appReqList = paramArrayList;
      super.a(com.tencent.tmassistant.common.a.a(com.tencent.tmassistant.common.a.b(localGetAppSimpleDetailRequest)));
      return true;
    }
    m.e("GetAppSimpleDetailHttpRequest", "appDetailParams is null");
    return false;
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\tencent\tmdatasourcesdk\internal\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */