package com.tencent.mobileqq.msf.core.net;

import com.tencent.mobileqq.msf.core.MsfCore;
import com.tencent.mobileqq.msf.core.NetConnInfoCenterImpl;
import com.tencent.mobileqq.msf.core.a.a;
import com.tencent.mobileqq.msf.sdk.MsfCommand;
import com.tencent.mobileqq.msf.sdk.MsfSdkUtils;
import com.tencent.mobileqq.msf.sdk.l;
import com.tencent.qphone.base.remote.FromServiceMsg;
import com.tencent.qphone.base.util.QLog;

public class f
{
  public static final String a = "MSF.C.NetExceptionStat";
  private static l b = new l(100);
  private static long c = System.currentTimeMillis() - 180000L;
  
  public static void a(b paramb)
  {
    if (!NetConnInfoCenterImpl.isNetSupport()) {}
    long l;
    do
    {
      return;
      if (b.size() >= 100)
      {
        QLog.d("MSF.C.NetExceptionStat", 2, "addNetException NetExceptionEvent count = " + b.size() + "too much drop");
        return;
      }
      a locala = new a();
      locala.a = paramb;
      l = System.currentTimeMillis();
      locala.b = l;
      try
      {
        b.b(locala);
        QLog.d("MSF.C.NetExceptionStat", 2, "addNetException NetExceptionEvent count = " + b.size() + "");
        try
        {
          for (;;)
          {
            paramb = (a)b.peek();
            if ((paramb == null) || (l - paramb.b < a.S())) {
              break;
            }
            b.a();
          }
        }
        catch (Exception paramb)
        {
          paramb.printStackTrace();
        }
        QLog.d("MSF.C.NetExceptionStat", 2, "addNetException after remove expire event NetExceptionEvent count = " + b.size());
      }
      catch (Exception paramb)
      {
        paramb.printStackTrace();
        return;
      }
    } while ((l - c <= a.S()) || (b.size() < a.U()));
    QLog.d("MSF.C.NetExceptionStat", 2, "NetExceptionEvent count = " + b.size() + " report to ui now");
    paramb = new FromServiceMsg(NetConnInfoCenterImpl.msfCore.getMsfAppid(), MsfCore.getNextSeq(), "0", "cmd_connWeakNet");
    paramb.setMsgSuccess();
    paramb.setMsfCommand(MsfCommand.onConnWeakNet);
    MsfSdkUtils.addFromMsgProcessName("*", paramb);
    NetConnInfoCenterImpl.msfCore.addRespToQuque(null, paramb);
    c = l;
  }
  
  public static class a
  {
    f.b a;
    long b;
  }
  
  public static enum b
  {
    public static b a(String paramString)
    {
      return (b)Enum.valueOf(b.class, paramString);
    }
    
    public static b[] a()
    {
      return (b[])b.clone();
    }
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\com\tencent\mobileqq\msf\core\net\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */