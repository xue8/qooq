package com.tencent.mobileqq.msf.core.d;

import android.content.IntentFilter;
import com.tencent.qphone.base.util.BaseApplication;

class b
  extends Thread
{
  b(a parama, String paramString)
  {
    super(paramString);
  }
  
  public void run()
  {
    a.a(this.a);
    BaseApplication.getContext().registerReceiver(this.a, new IntentFilter("android.intent.action.SCREEN_OFF"));
    BaseApplication.getContext().registerReceiver(this.a, new IntentFilter("android.intent.action.SCREEN_ON"));
    if (!a.b(this.a)) {
      a.c(this.a);
    }
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\com\tencent\mobileqq\msf\core\d\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */