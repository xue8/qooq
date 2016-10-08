package com.tencent.tmdownloader;

import com.tencent.tmassistant.common.c;
import com.tencent.tmassistantbase.a.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class b
  extends com.tencent.tmassistant.aidl.b
{
  b(TMAssistantDownloadClient paramTMAssistantDownloadClient) {}
  
  public void a(String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3)
  {
    m.c("TMAssistantDownloadSDKClient", "clientKey:" + paramString1 + ",state:" + paramInt1 + ", errorcode" + paramInt2 + ",url:" + paramString2);
    paramString1 = this.a.mWeakListenerArrayList.iterator();
    while (paramString1.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)paramString1.next();
      ITMAssistantDownloadClientListener localITMAssistantDownloadClientListener = (ITMAssistantDownloadClientListener)localWeakReference.get();
      if (localITMAssistantDownloadClientListener != null) {
        m.c("TMAssistantDownloadSDKClient", " listener ： " + localITMAssistantDownloadClientListener + "   linstenerWeakReference :" + localWeakReference);
      }
      c.a().a(this.a, localITMAssistantDownloadClientListener, paramString2, paramInt1, paramInt2, paramString3);
    }
  }
  
  public void a(String paramString1, String paramString2, long paramLong1, long paramLong2)
  {
    m.c("TMAssistantDownloadSDKClient", "clientKey:" + paramString1 + ",receivedLen:" + paramLong1 + ",totalLen:" + paramLong2 + ",url:" + paramString2);
    paramString1 = this.a.mWeakListenerArrayList.iterator();
    while (paramString1.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)paramString1.next();
      ITMAssistantDownloadClientListener localITMAssistantDownloadClientListener = (ITMAssistantDownloadClientListener)localWeakReference.get();
      if (localITMAssistantDownloadClientListener != null) {
        m.c("TMAssistantDownloadSDKClient", " listener : " + localITMAssistantDownloadClientListener + "   linstenerWeakReference :" + localWeakReference);
      }
      c.a().a(this.a, localITMAssistantDownloadClientListener, paramString2, paramLong1, paramLong2);
    }
  }
  
  public void a(List<String> paramList)
  {
    if (this.a.mWeakLogListenerArrayList != null)
    {
      Iterator localIterator = this.a.mWeakLogListenerArrayList.iterator();
      while (localIterator.hasNext())
      {
        ITMAssistantDownloadLogListener localITMAssistantDownloadLogListener = (ITMAssistantDownloadLogListener)((WeakReference)localIterator.next()).get();
        if (localITMAssistantDownloadLogListener != null) {
          localITMAssistantDownloadLogListener.onLog(TMAssistantDownloadClient.access$000(this.a, paramList));
        }
      }
    }
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\tencent\tmdownloader\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */