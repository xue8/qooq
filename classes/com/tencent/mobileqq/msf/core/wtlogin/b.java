package com.tencent.mobileqq.msf.core.wtlogin;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.tencent.qphone.base.remote.IWtloginService.Stub;
import com.tencent.qphone.base.util.QLog;

class b
  implements ServiceConnection
{
  b(MsfWtloginHelper paramMsfWtloginHelper) {}
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    QLog.d("MsfWtloginHelper", 2, " onServiceConnected service:" + paramComponentName);
    this.a._baseService = IWtloginService.Stub.asInterface(paramIBinder);
    MsfWtloginHelper.access$000(this.a);
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    QLog.d("MsfWtloginHelper", 2, " onServiceDisconnected " + paramComponentName);
    this.a._baseService = null;
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\com\tencent\mobileqq\msf\core\wtlogin\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */