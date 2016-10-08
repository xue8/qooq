package com.tencent.mobileqq.msf.service;

import android.text.TextUtils;
import com.tencent.mobileqq.msf.core.MsfCore;
import com.tencent.mobileqq.msf.core.c.m;
import com.tencent.mobileqq.msf.core.push.d;
import com.tencent.mobileqq.msf.core.push.f;
import com.tencent.mobileqq.msf.sdk.MsfMessagePair;
import com.tencent.qphone.base.remote.FromServiceMsg;
import com.tencent.qphone.base.remote.IMsfServiceCallbacker;
import com.tencent.qphone.base.remote.ToServiceMsg;
import com.tencent.qphone.base.util.BaseApplication;
import com.tencent.qphone.base.util.QLog;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public class b
{
  private static final String i = "MSF.S.AppProcessInfo";
  volatile boolean a = true;
  volatile long b = 0L;
  volatile boolean c = false;
  volatile long d = 0L;
  String e;
  String f;
  ConcurrentLinkedQueue g = new ConcurrentLinkedQueue();
  public h h;
  private IMsfServiceCallbacker j;
  
  public String a()
  {
    return this.e + "," + b() + "," + this.a;
  }
  
  public void a(int paramInt, long paramLong1, long paramLong2)
  {
    if (this.h != null) {
      this.h.a(paramInt, paramLong1, paramLong2);
    }
  }
  
  public void a(int paramInt, String paramString)
  {
    if (this.h != null) {
      this.h.a(paramInt);
    }
    while ((paramInt != 0) || (TextUtils.isEmpty(this.f))) {
      return;
    }
    paramInt = c.e.getUinPushStatus(paramString);
    g.a(BaseApplication.getContext(), this.e, paramString, this.f, paramInt);
    MsfService.getCore().pushManager.i.a();
  }
  
  public void a(IMsfServiceCallbacker paramIMsfServiceCallbacker)
  {
    this.j = paramIMsfServiceCallbacker;
  }
  
  public void a(ToServiceMsg paramToServiceMsg, FromServiceMsg paramFromServiceMsg)
  {
    this.g.add(new MsfMessagePair(paramToServiceMsg, paramFromServiceMsg));
    c.d.a();
  }
  
  public void a(String paramString)
  {
    this.f = paramString;
  }
  
  public void a(String paramString1, String paramString2, IMsfServiceCallbacker paramIMsfServiceCallbacker)
  {
    this.e = paramString1;
    a(paramString2);
    if (paramIMsfServiceCallbacker != null)
    {
      a(paramIMsfServiceCallbacker);
      this.a = true;
    }
    for (;;)
    {
      this.d = 0L;
      this.c = false;
      if (QLog.isColorLevel()) {
        QLog.d("MSF.S.AppProcessInfo", 2, paramString1 + " onAppBind, isAppConnected " + this.a);
      }
      paramString2 = new HashMap();
      paramString2.put("appProcessName", paramString1);
      MsfService.getCore().getStatReporter().a("dim.Msf.AppConnectFail", this.a, 0L, 0L, paramString2, false, false);
      if (this.h != null) {
        this.h.a(paramIMsfServiceCallbacker);
      }
      return;
      if (c() == null) {
        this.a = false;
      } else {
        this.a = true;
      }
    }
  }
  
  public String b()
  {
    return this.f;
  }
  
  public IMsfServiceCallbacker c()
  {
    return this.j;
  }
  
  public void d()
  {
    a(null);
    this.a = false;
    this.c = false;
    if (QLog.isColorLevel()) {
      QLog.d("MSF.S.AppProcessInfo", 2, this.e + " setAppDisConnected, isAppConnected " + this.a);
    }
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\com\tencent\mobileqq\msf\service\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */