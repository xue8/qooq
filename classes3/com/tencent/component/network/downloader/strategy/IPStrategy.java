package com.tencent.component.network.downloader.strategy;

import com.tencent.component.network.downloader.common.IPInfo;
import java.util.List;

public abstract interface IPStrategy
{
  public abstract boolean isIPValid(String paramString1, String paramString2);
  
  public abstract void onIPAccessResult(String paramString1, String paramString2, boolean paramBoolean);
  
  public abstract String resolveIP(String paramString);
  
  public abstract String resolveIP(String paramString, int paramInt);
  
  public abstract List<IPInfo> resolveVideoIP(String paramString);
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\tencent\component\network\downloader\strategy\IPStrategy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */