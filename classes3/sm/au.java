package sm;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;

public final class au
{
  public static String a()
  {
    return Build.MODEL;
  }
  
  public static String a(Context paramContext)
  {
    return ((TelephonyManager)paramContext.getSystemService("phone")).getDeviceId();
  }
  
  public static String b()
  {
    return Build.PRODUCT;
  }
  
  public static String b(Context paramContext)
  {
    return ((TelephonyManager)paramContext.getSystemService("phone")).getSubscriberId();
  }
  
  public static int c()
  {
    return Integer.parseInt(Build.VERSION.SDK);
  }
  
  public static String c(Context paramContext)
  {
    WifiInfo localWifiInfo = ((WifiManager)paramContext.getSystemService("wifi")).getConnectionInfo();
    paramContext = null;
    if (localWifiInfo != null) {
      paramContext = localWifiInfo.getMacAddress();
    }
    return paramContext;
  }
  
  public static String d()
  {
    return "android_id";
  }
  
  public static String d(Context paramContext)
  {
    return ((TelephonyManager)paramContext.getSystemService("phone")).getSimSerialNumber();
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\sm\au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */