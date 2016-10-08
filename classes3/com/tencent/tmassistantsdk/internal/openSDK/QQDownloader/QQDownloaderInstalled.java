package com.tencent.tmassistantsdk.internal.openSDK.QQDownloader;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.tencent.tmassistantbase.a.m;

public class QQDownloaderInstalled
  extends BroadcastReceiver
{
  protected static final String a = QQDownloaderInstalled.class.getSimpleName();
  protected static QQDownloaderInstalled b = null;
  protected boolean c = false;
  protected d d = null;
  
  public static QQDownloaderInstalled a()
  {
    try
    {
      if (b == null) {
        b = new QQDownloaderInstalled();
      }
      QQDownloaderInstalled localQQDownloaderInstalled = b;
      return localQQDownloaderInstalled;
    }
    finally {}
  }
  
  public void a(Context paramContext)
  {
    m.c(a, "context = " + paramContext);
    IntentFilter localIntentFilter;
    if (!this.c)
    {
      m.c("QQDownloaderInstalled", "registeReceiver   context" + paramContext + "  receiver:" + this);
      localIntentFilter = new IntentFilter("com.tencent.assistant.ipc.firststart.action");
    }
    try
    {
      paramContext = paramContext.registerReceiver(this, localIntentFilter);
      m.c("QQDownloaderInstalled", "" + paramContext);
      this.c = true;
      return;
    }
    catch (Throwable paramContext)
    {
      m.c("QQDownloaderInstalled", "registeReceiver exception!!!");
      this.c = false;
      paramContext.printStackTrace();
    }
  }
  
  public void a(d paramd)
  {
    m.c(a, "listener = " + paramd);
    this.d = paramd;
  }
  
  public void b()
  {
    m.c(a, "unregisteListener start");
    this.d = null;
  }
  
  public void b(Context paramContext)
  {
    if ((paramContext == null) || (b == null)) {
      m.c(a, "unRegisteReceiver fail! context = " + paramContext + ",mInstance = " + b);
    }
    while (!this.c) {
      return;
    }
    m.c("QQDownloaderInstalled", "realy unRegisteReceiver  context:" + paramContext + "  receiver:" + this);
    try
    {
      paramContext.unregisterReceiver(this);
      this.c = false;
      return;
    }
    catch (Throwable paramContext)
    {
      m.c("QQDownloaderInstalled", "unRegisteReceiver exception!!!");
      this.c = false;
      paramContext.printStackTrace();
    }
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    m.c("QQDownloaderInstalled", "onReceive!");
    new c(this, paramContext).start();
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\tencent\tmassistantsdk\internal\openSDK\QQDownloader\QQDownloaderInstalled.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */