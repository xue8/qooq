package com.tencent.mobileqq.pluginsdk;

import android.content.Context;
import android.content.ServiceConnection;
import com.tencent.qphone.base.util.QLog;
import java.lang.ref.WeakReference;

public class PluginManagerHelper
{
  private static PluginManagerClient a;
  private static WeakReference b;
  private static ServiceConnection c = new f();
  
  public static void destory(Context paramContext)
  {
    PluginRemoteProcessor.get().cancel(c);
  }
  
  public static void getPluginInterface(Context paramContext, OnPluginManagerLoadedListener paramOnPluginManagerLoadedListener)
  {
    if (QLog.isColorLevel()) {
      QLog.i("plugin_tag", 2, "PluginManagerHelper.getPluginInterface");
    }
    if ((a == null) || (!a.useful()))
    {
      b = new WeakReference(paramOnPluginManagerLoadedListener);
      PluginRemoteProcessor.get().process(paramContext, c, 1);
      return;
    }
    paramOnPluginManagerLoadedListener.onPluginManagerLoaded(a);
  }
  
  public static abstract interface OnPluginManagerLoadedListener
  {
    public abstract void onPluginManagerLoaded(PluginManagerClient paramPluginManagerClient);
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\com\tencent\mobileqq\pluginsdk\PluginManagerHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */