package com.tencent.mobileqq.pluginsdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;

public abstract class PluginBroadcastReceiver
  extends BroadcastReceiver
  implements IPluginBroadcastReceiver
{
  private int a;
  protected String mApkFilePath;
  protected ClassLoader mDexClassLoader;
  protected boolean mIsRunInPlugin;
  protected BroadcastReceiver mOutReceiver;
  protected PackageInfo mPackageInfo;
  
  public void IInit(String paramString1, String paramString2, BroadcastReceiver paramBroadcastReceiver, ClassLoader paramClassLoader, PackageInfo paramPackageInfo, int paramInt)
  {
    if (DebugHelper.sDebug) {
      DebugHelper.log("plugin_tag", "PluginBroadcastReceiver.Init:" + paramString1 + ", " + this.a);
    }
    this.mIsRunInPlugin = true;
    this.mApkFilePath = paramString2;
    this.mOutReceiver = paramBroadcastReceiver;
    this.mDexClassLoader = paramClassLoader;
    this.mPackageInfo = paramPackageInfo;
    this.a = paramInt;
  }
  
  public void IOnReceive(Context paramContext, Intent paramIntent)
  {
    if (DebugHelper.sDebug) {
      DebugHelper.log("plugin_tag", "PluginBroadcastReceiver.IOnReceive");
    }
    onReceive(new c(paramContext, 0, this.mApkFilePath, this.mDexClassLoader, paramContext.getResources(), this.a), paramIntent);
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\com\tencent\mobileqq\pluginsdk\PluginBroadcastReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */