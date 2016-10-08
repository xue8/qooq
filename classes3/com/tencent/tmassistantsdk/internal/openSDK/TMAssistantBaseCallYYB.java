package com.tencent.tmassistantsdk.internal.openSDK;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.tmassistantbase.a.f;
import com.tencent.tmassistantbase.a.m;
import com.tencent.tmassistantsdk.ITMAssistantCallBackListener;
import com.tencent.tmassistantsdk.TMAssistantCallYYBParamStruct;
import com.tencent.tmassistantsdk.TMAssistantCallYYBTaskInfo;
import com.tencent.tmassistantsdk.internal.a.b;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public abstract class TMAssistantBaseCallYYB
{
  protected static final String TAG = TMAssistantBaseCallYYB.class.getSimpleName();
  protected String hostPackageName = null;
  protected int hostVersionCode = 0;
  protected String mClientKey;
  protected Context mContext = null;
  protected ReferenceQueue<ITMAssistantCallBackListener> mListenerQueue = new ReferenceQueue();
  protected ArrayList<WeakReference<ITMAssistantCallBackListener>> mWeakListenerArrayList = new ArrayList();
  protected int sdkAPILevel = 1;
  protected b sdkChannel = new b();
  
  public static int getQQDownloadApiLevel(Context paramContext)
  {
    if (paramContext == null)
    {
      m.e(TAG, "context is null,return 0");
      return 0;
    }
    try
    {
      paramContext = paramContext.getPackageManager().getApplicationInfo("com.tencent.android.qqdownloader", 128);
      if ((paramContext != null) && (paramContext.metaData != null))
      {
        int i = paramContext.metaData.getInt("com.tencent.android.qqdownloader.sdk.apilevel");
        m.c(TAG, "apiLevel = " + i);
        return i;
      }
      m.c(TAG, "appInfo is null,return 0");
      return 0;
    }
    catch (Exception paramContext)
    {
      m.c(TAG, "packagename not found！");
    }
    return 0;
  }
  
  public static boolean isExistActoin(long paramLong)
  {
    if (paramLong < 0L)
    {
      m.c(TAG, "actionId < 0,return false");
      return false;
    }
    m.c(TAG, "actionId = " + paramLong);
    Object localObject = new b().a();
    if ((localObject != null) && (((ArrayList)localObject).size() > 0))
    {
      localObject = ((ArrayList)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        com.tencent.tmassistantsdk.internal.a.c localc = (com.tencent.tmassistantsdk.internal.a.c)((Iterator)localObject).next();
        if ((localc.a == paramLong) && (localc.h - localc.g <= 300000L))
        {
          m.c(TAG, "actionId is exist,return true");
          return true;
        }
      }
    }
    m.c(TAG, "return false");
    return false;
  }
  
  public abstract long addDownloadTaskFromAppDetail(TMAssistantCallYYBParamStruct paramTMAssistantCallYYBParamStruct, boolean paramBoolean1, boolean paramBoolean2);
  
  public abstract long addDownloadTaskFromAuthorize(TMAssistantCallYYBParamStruct paramTMAssistantCallYYBParamStruct, String paramString);
  
  public abstract long addDownloadTaskFromTaskList(TMAssistantCallYYBParamStruct paramTMAssistantCallYYBParamStruct, boolean paramBoolean1, boolean paramBoolean2);
  
  public long addDownloadTaskFromTmast(String paramString)
  {
    m.c(TAG, "addDownloadTaskFromTmast url = " + paramString);
    if (TextUtils.isEmpty(paramString))
    {
      m.c(TAG, "url is null !! result = -1");
      return -1L;
    }
    paramString = formatEncryptUrl(paramString);
    long l = System.currentTimeMillis();
    m.c(TAG, "addDownloadTaskFromTmast,hostPackageName=" + this.hostPackageName + "; hostVersionCode=" + this.hostVersionCode + "; hostUserIdentity=" + "" + "; dataItemType=" + 0 + ";dataItemAction=" + paramString);
    l = this.sdkChannel.a(this.hostPackageName, this.hostVersionCode, "", 0, paramString, l, l + 300000L, 0, null);
    m.c(TAG, "result = " + l);
    return l;
  }
  
  public long addDownloadTaskFromWebview(String paramString)
  {
    m.c(TAG, "url = " + paramString);
    HashMap localHashMap = new HashMap();
    localHashMap.put("url", paramString);
    paramString = formatIntentUriPath(5, localHashMap);
    long l = System.currentTimeMillis();
    m.c(TAG, "addDownloadTaskFromTaskList,hostPackageName=" + this.hostPackageName + "; hostVersionCode=" + this.hostVersionCode + "; hostUserIdentity=" + "" + "; dataItemType=" + 0 + ";dataItemAction=" + paramString);
    l = this.sdkChannel.a(this.hostPackageName, this.hostVersionCode, "", 0, paramString, l, l + 300000L, 0, null);
    m.c(TAG, "result = " + l);
    return l;
  }
  
  public long buildAddDBData(TMAssistantCallYYBParamStruct paramTMAssistantCallYYBParamStruct, boolean paramBoolean1, boolean paramBoolean2, String paramString1, String paramString2, int paramInt, String paramString3)
  {
    m.c(TAG, "param = " + paramTMAssistantCallYYBParamStruct + ",isAutoDownload = " + paramBoolean1 + ",isAutoInstall = " + paramBoolean2 + ",actionFlag = " + paramString1 + ",verifyType = " + paramString2 + ",actionType = " + paramInt);
    if (TextUtils.isEmpty(paramString2)) {
      paramTMAssistantCallYYBParamStruct = formatMapParams(paramTMAssistantCallYYBParamStruct, paramBoolean1, paramBoolean2, paramString3);
    }
    for (;;)
    {
      paramTMAssistantCallYYBParamStruct = formatIntentUriPath(paramInt, paramTMAssistantCallYYBParamStruct);
      long l = System.currentTimeMillis();
      m.c(TAG, "addDownloadTaskFromTaskList,hostPackageName=" + this.hostPackageName + "; hostVersionCode=" + this.hostVersionCode + "; hostUserIdentity=" + "" + "; dataItemType=" + 0 + ";dataItemAction=" + paramTMAssistantCallYYBParamStruct);
      l = this.sdkChannel.a(this.hostPackageName, this.hostVersionCode, "", 0, paramTMAssistantCallYYBParamStruct, l, l + 300000L, 0, null);
      m.c(TAG, "result = " + l);
      return l;
      paramTMAssistantCallYYBParamStruct = formatMapParams(paramTMAssistantCallYYBParamStruct, true, true, paramString3);
      paramTMAssistantCallYYBParamStruct.put("verifytype", paramString2);
    }
  }
  
  protected long buildAddDBData(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
    {
      m.c(TAG, "IPCData is null,return -1");
      return -1L;
    }
    m.c(TAG, "IPCData length = " + paramArrayOfByte.length);
    long l = System.currentTimeMillis();
    l = this.sdkChannel.a(null, 0, null, 0, null, l, l + 300000L, 1, paramArrayOfByte);
    m.c(TAG, "result = " + l);
    return l;
  }
  
  public int checkQQDownloaderInstalled()
  {
    j = 1;
    int k = 0;
    if (this.mContext == null)
    {
      m.e(TAG, "mContext is null");
      throw new Exception("you must initial openSDK,by calling initQQDownloaderOpenSDK method!");
    }
    m.c(TAG, "checkQQDownloaderInstalled start");
    PackageManager localPackageManager = this.mContext.getPackageManager();
    i = j;
    if (localPackageManager != null) {}
    for (;;)
    {
      try
      {
        if (localPackageManager.getPackageInfo("com.tencent.android.qqdownloader", 0) == null) {
          continue;
        }
        int m = f.a().k();
        int n = this.sdkAPILevel;
        i = k;
        if (n > m) {
          i = 2;
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        m.c(TAG, "packagename not found！");
        i = j;
        continue;
      }
      m.c(TAG, "result = " + i);
      return i;
      i = 1;
    }
  }
  
  public int checkQQDownloaderInstalled(int paramInt)
  {
    int j = 2;
    k = 1;
    if (this.mContext == null)
    {
      m.e(TAG, "mContext is null");
      throw new Exception("you must initial openSDK,by calling initQQDownloaderOpenSDK method!");
    }
    PackageManager localPackageManager = this.mContext.getPackageManager();
    i = k;
    if (localPackageManager != null) {}
    for (;;)
    {
      try
      {
        if (localPackageManager.getPackageInfo("com.tencent.android.qqdownloader", 0) == null) {
          continue;
        }
        m = f.a().m();
        i = f.a().k();
        int n = this.sdkAPILevel;
        if (n <= i) {
          continue;
        }
        i = j;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        int m;
        localNameNotFoundException.printStackTrace();
        i = k;
        continue;
      }
      m.c(TAG, "result = " + i);
      return i;
      i = j;
      if (paramInt <= m)
      {
        i = 0;
        continue;
        i = 1;
      }
    }
  }
  
  public abstract void destroyQQDownloaderOpenSDK();
  
  protected String formatEncryptUrl(String paramString)
  {
    m.c(TAG, "url = " + paramString);
    paramString = URLEncoder.encode(c.a(paramString));
    paramString = "tmast://encrypt?encryptdata=" + paramString;
    m.c(TAG, "finalPath = " + paramString);
    return paramString;
  }
  
  protected String formatIntentUriPath(int paramInt, Map<String, String> paramMap)
  {
    m.c(TAG, "actionType = " + paramInt + ",params = " + paramMap);
    Object localObject;
    String str2;
    switch (paramInt)
    {
    default: 
      localObject = "appdetails";
      str2 = "tpmast://" + (String)localObject + "?";
      String str1 = "";
      localObject = str1;
      if (paramMap != null)
      {
        localObject = str1;
        if (paramMap.size() > 0)
        {
          Iterator localIterator = paramMap.entrySet().iterator();
          paramInt = 0;
          paramMap = str1;
          label145:
          localObject = paramMap;
          if (localIterator.hasNext())
          {
            localObject = (Map.Entry)localIterator.next();
            str1 = (String)((Map.Entry)localObject).getKey();
            String str3 = (String)((Map.Entry)localObject).getValue();
            if ((TextUtils.isEmpty(str1)) || (TextUtils.isEmpty(str3))) {
              break label352;
            }
            if (paramInt <= 0)
            {
              localObject = "";
              label213:
              paramMap = paramMap + (String)localObject + str1 + "=" + URLEncoder.encode(str3);
            }
          }
        }
      }
      break;
    }
    label352:
    for (;;)
    {
      paramInt += 1;
      break label145;
      localObject = "appdetails";
      break;
      localObject = "download";
      break;
      localObject = "appdetails";
      break;
      localObject = "updatedownload";
      break;
      localObject = "webview";
      break;
      localObject = "&";
      break label213;
      paramMap = str2 + (String)localObject;
      m.c(TAG, "path:" + paramMap);
      return formatEncryptUrl(paramMap);
    }
  }
  
  protected Map<String, String> formatMapParams(TMAssistantCallYYBParamStruct paramTMAssistantCallYYBParamStruct, boolean paramBoolean1, boolean paramBoolean2, String paramString)
  {
    m.c(TAG, "param = " + paramTMAssistantCallYYBParamStruct + ",isAutoDownload = " + paramBoolean1 + ",isAutoInstall = " + paramBoolean2);
    String str = formatOplist(paramBoolean1, paramBoolean2);
    HashMap localHashMap = new HashMap();
    localHashMap.put("hostpname", this.hostPackageName);
    localHashMap.put("hostversioncode", String.valueOf(this.hostVersionCode));
    localHashMap.put("sngappid", paramTMAssistantCallYYBParamStruct.SNGAppId);
    localHashMap.put("appid", paramTMAssistantCallYYBParamStruct.taskAppId);
    localHashMap.put("apkid", paramTMAssistantCallYYBParamStruct.taskApkId);
    localHashMap.put("pname", paramTMAssistantCallYYBParamStruct.taskPackageName);
    localHashMap.put("via", paramTMAssistantCallYYBParamStruct.via);
    localHashMap.put("uin", paramTMAssistantCallYYBParamStruct.uin);
    localHashMap.put("uintype", paramTMAssistantCallYYBParamStruct.uinType);
    localHashMap.put("versioncode", String.valueOf(paramTMAssistantCallYYBParamStruct.taskVersion));
    localHashMap.put("oplist", str);
    localHashMap.put("channelid", paramTMAssistantCallYYBParamStruct.channelId);
    localHashMap.put("actionflag", paramTMAssistantCallYYBParamStruct.actionFlag);
    localHashMap.put("traceid", paramString);
    m.c(TAG, "mapParams = " + localHashMap);
    return localHashMap;
  }
  
  protected String formatOplist(boolean paramBoolean1, boolean paramBoolean2)
  {
    m.c(TAG, "isAutoDownload = " + paramBoolean1 + ",isAutoInstall = " + paramBoolean2);
    String str = "";
    if ((paramBoolean1) && (paramBoolean2)) {
      str = "1;2";
    }
    for (;;)
    {
      m.c(TAG, "oplist = " + str);
      return str;
      if (paramBoolean2) {
        str = "2";
      } else if (paramBoolean1) {
        str = "1";
      }
    }
  }
  
  public abstract TMAssistantCallYYBTaskInfo getDownloadTaskState(TMAssistantCallYYBParamStruct paramTMAssistantCallYYBParamStruct);
  
  public abstract void initTMAssistantCallYYBApi(Context paramContext);
  
  protected void onStateChanged(TMAssistantCallYYBParamStruct paramTMAssistantCallYYBParamStruct, int paramInt1, int paramInt2, String paramString)
  {
    m.c(TAG, "param = " + paramTMAssistantCallYYBParamStruct + ",state = " + paramInt1 + ",errorCode = " + paramInt2 + ",errorMsg = " + paramString);
    Iterator localIterator = this.mWeakListenerArrayList.iterator();
    while (localIterator.hasNext())
    {
      ITMAssistantCallBackListener localITMAssistantCallBackListener = (ITMAssistantCallBackListener)((WeakReference)localIterator.next()).get();
      if (localITMAssistantCallBackListener == null) {
        m.c(TAG, "onDownloadStateChanged listener = null");
      } else {
        localITMAssistantCallBackListener.OnDownloadTaskStateChanged(paramTMAssistantCallYYBParamStruct, paramInt1, paramInt2, paramString);
      }
    }
  }
  
  public boolean registerListener(ITMAssistantCallBackListener paramITMAssistantCallBackListener)
  {
    if (paramITMAssistantCallBackListener == null)
    {
      m.e(TAG, "listener is null,return false");
      return false;
    }
    m.c(TAG, "listener = " + paramITMAssistantCallBackListener);
    for (;;)
    {
      localObject = this.mListenerQueue.poll();
      if (localObject == null) {
        break;
      }
      this.mWeakListenerArrayList.remove(localObject);
    }
    Object localObject = this.mWeakListenerArrayList.iterator();
    while (((Iterator)localObject).hasNext()) {
      if ((ITMAssistantCallBackListener)((WeakReference)((Iterator)localObject).next()).get() == paramITMAssistantCallBackListener)
      {
        m.c(TAG, "listener is existing,return true");
        return true;
      }
    }
    paramITMAssistantCallBackListener = new WeakReference(paramITMAssistantCallBackListener, this.mListenerQueue);
    this.mWeakListenerArrayList.add(paramITMAssistantCallBackListener);
    m.c(TAG, "create new listener,return true");
    return true;
  }
  
  public boolean removeDownloadTask(long paramLong)
  {
    if (paramLong >= 0L) {
      return this.sdkChannel.a(paramLong);
    }
    return false;
  }
  
  public void setQQGameClientKey(String paramString)
  {
    m.c("jimluo", "setQQGameClientKey clientKey = " + paramString);
    this.mClientKey = paramString;
  }
  
  public void startQQDownloader(Context paramContext)
  {
    m.c(TAG, "context = " + paramContext);
    if (paramContext != null)
    {
      Intent localIntent = paramContext.getPackageManager().getLaunchIntentForPackage("com.tencent.android.qqdownloader");
      if ((paramContext instanceof Application)) {
        localIntent.addFlags(268435456);
      }
      paramContext.startActivity(localIntent);
    }
  }
  
  public abstract void startToAuthorized(Context paramContext, TMAssistantCallYYBParamStruct paramTMAssistantCallYYBParamStruct, String paramString);
  
  public void startToDownloadTaskList(Context paramContext)
  {
    if (paramContext == null)
    {
      m.e(TAG, "context is null,return 0");
      throw new Exception("you must input an application or activity context!");
    }
    Object localObject = "tmast://download?hostpname=" + this.hostPackageName + "&hostversion=" + this.hostVersionCode;
    m.c(TAG, "path = " + (String)localObject);
    localObject = new Intent("android.intent.action.VIEW", Uri.parse((String)localObject));
    if ((paramContext instanceof Application)) {
      ((Intent)localObject).addFlags(268435456);
    }
    paramContext.startActivity((Intent)localObject);
  }
  
  public void startToDownloadTaskListWithParams(Context paramContext, Bundle paramBundle)
  {
    if (paramContext == null)
    {
      m.e(TAG, "context is null,return 0");
      throw new Exception("you must input an application or activity context!");
    }
    StringBuilder localStringBuilder = new StringBuilder("tmast://download?hostpname=" + this.hostPackageName + "&hostversion=" + this.hostVersionCode);
    if (paramBundle != null)
    {
      Iterator localIterator = paramBundle.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localStringBuilder.append("&").append(str).append("=").append(paramBundle.getString(str));
      }
    }
    paramBundle = localStringBuilder.toString();
    m.c(TAG, "startToDownloadTaskListWithParams path = " + paramBundle);
    paramBundle = new Intent("android.intent.action.VIEW", Uri.parse(paramBundle));
    if ((paramContext instanceof Application)) {
      paramBundle.addFlags(268435456);
    }
    paramContext.startActivity(paramBundle);
  }
  
  public abstract void startToWebView(Context paramContext, String paramString);
  
  public boolean unregisterListener(ITMAssistantCallBackListener paramITMAssistantCallBackListener)
  {
    if (paramITMAssistantCallBackListener == null)
    {
      m.e(TAG, "listener is null,return false");
      return false;
    }
    Iterator localIterator = this.mWeakListenerArrayList.iterator();
    while (localIterator.hasNext()) {
      if ((ITMAssistantCallBackListener)((WeakReference)localIterator.next()).get() == paramITMAssistantCallBackListener)
      {
        localIterator.remove();
        m.c(TAG, "listener is removed,return true");
        return true;
      }
    }
    m.c(TAG, "return false");
    return false;
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\tencent\tmassistantsdk\internal\openSDK\TMAssistantBaseCallYYB.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */