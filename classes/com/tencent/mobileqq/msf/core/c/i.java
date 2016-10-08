package com.tencent.mobileqq.msf.core.c;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.TrafficStats;
import android.os.Process;
import android.util.SparseArray;
import com.qq.taf.jce.HexUtil;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.tencent.mobileqq.msf.core.MsfCore;
import com.tencent.mobileqq.msf.core.MsfStore;
import com.tencent.mobileqq.msf.core.NetConnInfoCenter;
import com.tencent.mobileqq.msf.core.NetConnInfoCenterImpl;
import com.tencent.mobileqq.msf.core.w;
import com.tencent.mobileqq.msf.sdk.utils.MonitorSocketStat;
import com.tencent.msf.boot.config.NativeConfigStore;
import com.tencent.qphone.base.util.BaseApplication;
import com.tencent.qphone.base.util.QLog;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public class i
{
  private static long A = 0L;
  private static long B = 0L;
  private static boolean C = false;
  private static final int D = 0;
  private static final String E = "cw_";
  private static final String F = "cx_";
  private static final String G = "MSF_lastMonthWifiFlow";
  private static final String H = "MSF_lastMonthXGFlow";
  private static final String I = "MSF_monthWifiFlow";
  private static final String J = "MSF_monthXGFlow";
  static a a = new a();
  static p b = new p();
  static m c;
  static MsfCore d;
  static String[] e = { "param_XGChatFlow", "param_XGFlow", "param_Flow" };
  static String[] f = { "param_WIFIChatFlow", "param_WIFIFlow", "param_Flow" };
  public static long g = 0L;
  static Object h = new Object();
  static final String i = "cautionNetFlowSize";
  static final String j = "cautionNetFlowSizewithStatus";
  static Object k = new Object();
  static Object l = new Object();
  static File m;
  static volatile File n;
  static volatile File o;
  static volatile File p;
  static byte q = 0;
  static String r;
  static long s = 0L;
  static long t = 0L;
  static long u = 0L;
  private static final String v = "MSF.C.NetworkTraffic";
  private static final String w = "MSF_Metrics";
  private static final String x = "MSF_NetflowRdmReport";
  private static final String y = "MSF_NetflowRdmReport_TIME";
  private static final String z = "MSF_TransportMetrics_Status";
  
  public static void a()
  {
    if (MsfCore.SysVerSion >= 8) {}
    long l1;
    try
    {
      j();
      int i1 = l();
      k();
      do
      {
        synchronized (l)
        {
          l1 = TrafficStats.getUidRxBytes(Process.myUid()) + TrafficStats.getUidTxBytes(Process.myUid());
          if ((i1 == 0) || (i1 == 1))
          {
            a(true, l1);
            return;
          }
        }
      } while (i1 != 2);
    }
    catch (Exception localException)
    {
      QLog.e("MSF.C.NetworkTraffic", 1, "get flowDic error " + BaseApplication.getContext().getFilesDir() + " " + localException);
      return;
    }
    a(false, l1);
  }
  
  public static void a(int paramInt)
  {
    j localj = new j(paramInt);
    localj.setName("doReportRdmThread");
    localj.start();
  }
  
  public static void a(long paramLong)
  {
    b.a = (paramLong * 1024L * 1024L);
    d();
  }
  
  public static void a(long paramLong, int paramInt)
  {
    int i1 = 0;
    Object localObject1 = h;
    if (paramInt == 1) {}
    for (;;)
    {
      boolean bool;
      try
      {
        if ((B != 0L) && (paramLong >= B))
        {
          a(1);
          B = 0L;
          MsfStore.getNativeConfigStore().removeConfig("MONITOR_NetflowRdmReport_TIME");
        }
        if ((b.d != 0L) && (paramLong < b.d)) {
          break label375;
        }
        Calendar localCalendar = Calendar.getInstance();
        localCalendar.set(2, localCalendar.get(2) + 1);
        localCalendar.set(5, 1);
        localCalendar.set(11, 0);
        localCalendar.set(12, 0);
        localCalendar.set(13, 0);
        localCalendar.set(14, 0);
        b.d = localCalendar.getTimeInMillis();
        bool = true;
        paramInt = 1;
        if ((b.c == 0L) || (paramLong >= b.c))
        {
          localCalendar = Calendar.getInstance();
          localCalendar.set(6, localCalendar.get(6) + 1);
          localCalendar.set(11, 0);
          localCalendar.set(12, 0);
          localCalendar.set(13, 0);
          localCalendar.set(14, 0);
          if (b.c != 0L)
          {
            k localk = new k(paramLong, bool);
            localk.setName("makeReportDataThread");
            localk.start();
          }
          b.c = localCalendar.getTimeInMillis();
          paramInt = 1;
        }
        if (paramInt != 0) {
          d();
        }
        if (b.e != 0L) {
          break label338;
        }
        b.e = paramLong;
        c();
        return;
      }
      finally {}
      if ((A != 0L) && (paramLong >= A))
      {
        a(0);
        A = 0L;
        MsfStore.getNativeConfigStore().removeConfig("MSF_NetflowRdmReport_TIME");
        continue;
        label338:
        if ((b.e != 0L) && (paramLong - b.e > 120000L))
        {
          b.e = paramLong;
          c();
          return;
          label375:
          bool = false;
          paramInt = i1;
        }
      }
    }
  }
  
  private static void a(long paramLong1, long paramLong2)
  {
    try
    {
      MsfStore.getNativeConfigStore().setConfig("MSF_lastMonthWifiFlow", String.valueOf(paramLong1));
      MsfStore.getNativeConfigStore().setConfig("MSF_lastMonthXGFlow", String.valueOf(paramLong2));
      QLog.d("MSF.C.NetworkTraffic", 1, "save lastMonthWifiCount " + paramLong1 + " lastMonthXGCount " + paramLong2);
      return;
    }
    catch (Exception localException)
    {
      QLog.d("MSF.C.NetworkTraffic", 1, "save lastMonthData error " + localException);
    }
  }
  
  public static void a(m paramm, MsfCore paramMsfCore)
  {
    c = paramm;
    d = paramMsfCore;
    b();
    a(System.currentTimeMillis(), 0);
  }
  
  public static void a(String paramString, String[] paramArrayOfString, long paramLong)
  {
    a(System.currentTimeMillis(), 0);
    if (!a.a.containsKey(paramString))
    {
      localq = new q();
      localq.a = paramString;
      localq.b = new HashMap();
      localq.c = new HashMap();
      a.a.put(paramString, localq);
    }
    q localq = (q)a.a.get(paramString);
    if (localq != null)
    {
      int i2 = paramArrayOfString.length;
      int i1 = 0;
      while (i1 < i2)
      {
        String str = paramArrayOfString[i1];
        label158:
        synchronized (k)
        {
          if (!localq.b.containsKey(str)) {
            localq.b.put(str, Long.valueOf(paramLong));
          }
        }
        synchronized (k)
        {
          if (!localq.c.containsKey(str))
          {
            localq.c.put(str, Long.valueOf(paramLong));
            if ((C) && (QLog.isDevelopLevel())) {
              QLog.d("MSF.C.NetworkTraffic", 4, "onDataIncerment uin:" + paramString + " key:" + str + " count:" + paramLong + " all:" + localq.b.get(str));
            }
            i1 += 1;
            continue;
            localq.b.put(str, Long.valueOf(((Long)localq.b.get(str)).longValue() + paramLong));
            break label158;
            paramString = finally;
            throw paramString;
          }
          else
          {
            localq.c.put(str, Long.valueOf(((Long)localq.c.get(str)).longValue() + paramLong));
          }
        }
      }
    }
  }
  
  public static void a(boolean paramBoolean)
    throws IOException
  {
    for (;;)
    {
      synchronized (l)
      {
        if ((n != null) && (n.exists()))
        {
          if (paramBoolean)
          {
            localFile = new File(r + "last_w");
            n.renameTo(localFile);
            n = localFile;
            return;
          }
          File localFile = new File(r + "last_g");
        }
      }
      if (paramBoolean)
      {
        j();
        n = new File(r + "last_w");
        n.createNewFile();
      }
      else
      {
        j();
        n = new File(r + "last_g");
        n.createNewFile();
      }
    }
  }
  
  private static void a(boolean paramBoolean, long paramLong)
    throws IOException
  {
    long l1 = paramLong - s;
    s = paramLong;
    if (l1 > 0L)
    {
      if (!paramBoolean) {
        break label116;
      }
      t += l1;
      a(true, m.getAbsolutePath(), "cw_" + t);
      if (QLog.isColorLevel()) {
        QLog.d("MSF.C.NetworkTraffic", 2, "monitorNetFlow llastBytesCount " + s + " wifi add " + l1 + " today " + t);
      }
    }
    label116:
    do
    {
      return;
      u += l1;
      a(false, m.getAbsolutePath(), "cx_" + u);
    } while (!QLog.isColorLevel());
    QLog.d("MSF.C.NetworkTraffic", 2, "monitorNetFlow llastBytesCount " + s + " xg add " + l1 + " today " + u);
  }
  
  public static void a(boolean paramBoolean, String paramString1, int paramInt1, String paramString2, int paramInt2, String paramString3, int paramInt3)
  {
    if (NetConnInfoCenterImpl.isMobileConn()) {
      a(paramString1, e, paramInt1);
    }
    try
    {
      int i1 = NetConnInfoCenterImpl.getSystemNetworkType();
      paramString3 = new com.tencent.mobileqq.msf.sdk.utils.a(paramString3, null, paramInt3, paramInt2, paramInt1, i1);
      paramString3.i = MonitorSocketStat.STATUS;
      if (QLog.isDevelopLevel())
      {
        StringBuilder localStringBuilder = new StringBuilder();
        if (paramInt2 == 0)
        {
          paramString1 = "write|";
          label72:
          QLog.d("MSF.C.NetworkTraffic", 2, paramString1 + paramInt1 + "|" + i1 + "|" + paramString2);
        }
      }
      else
      {
        paramInt1 = paramString2.indexOf(".");
        if (paramInt1 == -1) {
          break label171;
        }
      }
      label171:
      for (paramString3.h = paramString2.substring(0, paramInt1);; paramString3.h = paramString2)
      {
        MonitorSocketStat.dataFlow.add(paramString3);
        return;
        if (!NetConnInfoCenterImpl.isWifiConn()) {
          break;
        }
        a(paramString1, f, paramInt1);
        break;
        paramString1 = "read|";
        break label72;
      }
      return;
    }
    catch (Exception paramString1)
    {
      QLog.d("MSF.D.MonitorSocket", 1, "", paramString1);
    }
  }
  
  private static void a(boolean paramBoolean, String paramString1, String paramString2)
    throws IOException
  {
    int i1 = 0;
    for (;;)
    {
      String str;
      synchronized (l)
      {
        File localFile = o;
        if (paramBoolean) {
          break label268;
        }
        localFile = p;
        if (localFile == null) {
          break label260;
        }
        str = localFile.getName();
        if ((localFile != null) && (localFile.exists()))
        {
          paramString1 = new File(paramString1 + "/" + paramString2);
          localFile.renameTo(paramString1);
          if (!paramBoolean)
          {
            p = paramString1;
            break label271;
            if (paramBoolean) {
              break label209;
            }
            p = paramString1;
            if (i1 == 0) {
              break label216;
            }
            if (QLog.isColorLevel()) {
              QLog.d("MSF.C.NetworkTraffic", 2, "monitorNetFlow " + str + " rename to " + paramString2);
            }
            return;
          }
          o = paramString1;
        }
      }
      j();
      paramString1 = new File(paramString1 + "/" + paramString2);
      paramString1.createNewFile();
      continue;
      label209:
      o = paramString1;
      continue;
      label216:
      if (QLog.isColorLevel())
      {
        QLog.d("MSF.C.NetworkTraffic", 2, "monitorNetFlow " + str + " not found, create file " + paramString2);
        return;
        label260:
        str = "null";
        continue;
        label268:
        continue;
        label271:
        i1 = 1;
      }
    }
  }
  
  public static long[][] a(String[] paramArrayOfString)
  {
    a(System.currentTimeMillis(), 0);
    long[] arrayOfLong1 = new long[paramArrayOfString.length];
    long[] arrayOfLong2 = new long[paramArrayOfString.length];
    int i3 = paramArrayOfString.length;
    int i2 = 0;
    int i1 = 0;
    while (i2 < i3)
    {
      String str = paramArrayOfString[i2];
      Iterator localIterator = a.a.entrySet().iterator();
      while (localIterator.hasNext())
      {
        q localq = (q)((Map.Entry)localIterator.next()).getValue();
        if (localq.b.containsKey(str)) {
          arrayOfLong1[i1] += ((Long)localq.b.get(str)).longValue();
        }
        if (localq.c.containsKey(str))
        {
          long l1 = arrayOfLong2[i1];
          arrayOfLong2[i1] = (((Long)localq.c.get(str)).longValue() + l1);
        }
      }
      i2 += 1;
      i1 += 1;
    }
    return new long[][] { arrayOfLong1, arrayOfLong2 };
  }
  
  public static void b()
  {
    for (;;)
    {
      try
      {
        localObject = MsfStore.getNativeConfigStore().getConfig("MSF_NetflowRdmReport_TIME");
        String str = MsfStore.getNativeConfigStore().getConfig("MONITOR_NetflowRdmReport_TIME");
        if ((localObject != null) && (((String)localObject).length() > 0))
        {
          A = Long.parseLong((String)localObject);
          if (QLog.isColorLevel()) {
            QLog.d("MSF.C.NetworkTraffic", 2, "load reportRDM time is " + A);
          }
        }
        if ((str != null) && (str.length() > 0))
        {
          B = Long.parseLong(str);
          if (QLog.isColorLevel()) {
            QLog.d("MSF.C.NetworkTraffic", 2, "load monitor_reportRDM time is " + B);
          }
        }
      }
      catch (Exception localException1)
      {
        Object localObject;
        if (!QLog.isColorLevel()) {
          continue;
        }
        QLog.d("MSF.C.NetworkTraffic", 2, "load reportRDM error " + localException1);
        continue;
      }
      try
      {
        localObject = MsfStore.getNativeConfigStore().getConfig("MSF_TransportMetrics_Status");
        if ((localObject != null) && (((String)localObject).length() > 0))
        {
          localObject = new JceInputStream(HexUtil.hexStr2Bytes((String)localObject));
          b.readFrom((JceInputStream)localObject);
        }
      }
      catch (Exception localException2)
      {
        if (!QLog.isColorLevel()) {
          continue;
        }
        QLog.d("MSF.C.NetworkTraffic", 2, "load transportMetriceStatus error " + localException2);
        continue;
      }
      try
      {
        localObject = MsfStore.getNativeConfigStore().getConfig("MSF_Metrics");
        if ((localObject != null) && (((String)localObject).length() > 0))
        {
          localObject = new JceInputStream(HexUtil.hexStr2Bytes((String)localObject));
          a.readFrom((JceInputStream)localObject);
        }
      }
      catch (Exception localException3)
      {
        if (!QLog.isColorLevel()) {
          continue;
        }
        QLog.d("MSF.C.NetworkTraffic", 2, "load transportMetriceInfo error " + localException3);
      }
    }
    if (a.a == null) {
      a.a = new HashMap();
    }
  }
  
  private static void b(int paramInt, long paramLong)
  {
    Object localObject2 = new h();
    ((h)localObject2).a = new ArrayList();
    Object localObject1;
    Object localObject4;
    Object localObject6;
    Object localObject5;
    if (paramInt == 0)
    {
      localObject1 = a.a.keySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject4 = (String)((Iterator)localObject1).next();
        localObject6 = (q)a.a.get(localObject4);
        if (localObject6 != null)
        {
          localObject5 = new HashMap();
          if (!((q)localObject6).b.containsKey("param_Flow")) {
            break label1800;
          }
        }
      }
    }
    label1800:
    for (paramLong = ((Long)((q)localObject6).b.get("param_Flow")).longValue();; paramLong = 0L)
    {
      Object localObject7 = ((q)localObject6).b.keySet().iterator();
      Object localObject8;
      Object localObject9;
      while (((Iterator)localObject7).hasNext())
      {
        localObject8 = (String)((Iterator)localObject7).next();
        localObject9 = (Long)((q)localObject6).b.get(localObject8);
        if (localObject9 != null) {
          ((HashMap)localObject5).put(localObject8, String.valueOf(Long.valueOf(((Long)localObject9).longValue() / 1024L)));
        }
      }
      ((HashMap)localObject5).put("uin", localObject4);
      paramLong /= 1024L;
      localObject6 = new l();
      ((l)localObject6).b = paramLong;
      ((l)localObject6).c = ((Map)localObject5);
      ((l)localObject6).a = ((String)localObject4);
      ((h)localObject2).a.add(localObject6);
      break;
      localObject1 = new l();
      localObject4 = new HashMap();
      ((l)localObject1).b = (t + u);
      ((HashMap)localObject4).put("param_WIFISystemFlow", String.valueOf(t));
      ((HashMap)localObject4).put("param_XGSystemFlow", String.valueOf(u));
      ((HashMap)localObject4).put("param_MonthWIFISystemFlow", String.valueOf(f()));
      ((HashMap)localObject4).put("param_MonthXGSystemFlow", String.valueOf(g()));
      ((HashMap)localObject4).put("param_LastMonthWIFISystemFlow", String.valueOf(h()));
      ((HashMap)localObject4).put("param_LastMonthXGSystemFlow", String.valueOf(i()));
      if (QLog.isColorLevel())
      {
        QLog.d("MSF.C.NetworkTraffic", 2, "monitorNetFlow makeRdmData todayWifiCount " + t + " todayXGCount:" + u);
        QLog.d("MSF.C.NetworkTraffic", 2, "monitorNetFlow makeRdmData currentMonthWifCount " + (String)((HashMap)localObject4).get("param_MonthWIFISystemFlow") + " currentMonthXGCount:" + (String)((HashMap)localObject4).get("param_MonthXGSystemFlow"));
        QLog.d("MSF.C.NetworkTraffic", 2, "monitorNetFlow makeRdmData lastMonthWifiCount " + (String)((HashMap)localObject4).get("param_LastMonthWIFISystemFlow") + " lastMonthXGCount:" + (String)((HashMap)localObject4).get("param_LastMonthXGSystemFlow"));
      }
      ((l)localObject1).c = ((Map)localObject4);
      if ((d != null) && (d.sender != null) && (d.sender.e().length() > 4))
      {
        ((l)localObject1).a = d.sender.e();
        ((h)localObject2).a.add(localObject1);
        localObject1 = new JceOutputStream();
        ((h)localObject2).writeTo((JceOutputStream)localObject1);
        MsfStore.getNativeConfigStore().setConfig("MSF_NetflowRdmReport", HexUtil.bytes2HexStr(((JceOutputStream)localObject1).toByteArray()));
        localObject1 = new Intent(NetConnInfoCenter.RDMREPORT_INTENT);
        ((Intent)localObject1).setAction(NetConnInfoCenter.RDMREPORT_INTENT);
        localObject1 = PendingIntent.getBroadcast(BaseApplication.getContext(), 0, (Intent)localObject1, 0);
        localObject2 = (AlarmManager)BaseApplication.getContext().getSystemService("alarm");
        localObject4 = new Random(System.currentTimeMillis());
        paramLong = System.currentTimeMillis() + ((Random)localObject4).nextInt(21600000);
        ((AlarmManager)localObject2).set(0, paramLong, (PendingIntent)localObject1);
        localObject1 = new SimpleDateFormat("yy-MM-dd HH:mm:ss", Locale.getDefault());
        A = paramLong;
        MsfStore.getNativeConfigStore().setConfig("MSF_NetflowRdmReport_TIME", String.valueOf(A));
        if (QLog.isColorLevel()) {
          QLog.d("MSF.C.NetworkTraffic", 2, "set reportRDM at " + ((SimpleDateFormat)localObject1).format(Long.valueOf(A)));
        }
      }
      do
      {
        return;
        ((l)localObject1).a = "10000";
        break;
        QLog.d("MSF.C.MonitorNetFlowStore", 1, "make report RDM net flow by socket monitor.");
        localObject4 = new h();
        ((h)localObject4).a = new ArrayList();
        localObject5 = d.getNetFlowStore().a(paramLong, true);
        localObject6 = ((HashMap)localObject5).keySet().iterator();
        while (((Iterator)localObject6).hasNext())
        {
          localObject1 = (String)((Iterator)localObject6).next();
          localObject7 = new l();
          ((l)localObject7).a = ((String)localObject1);
          ((l)localObject7).c = new HashMap();
          ((l)localObject7).c.put("uin", localObject1);
          localObject8 = (SparseArray)((HashMap)localObject5).get(localObject1);
          paramInt = 1;
          if (paramInt <= 4)
          {
            localObject9 = (HashMap)((SparseArray)localObject8).get(paramInt);
            if (localObject9 == null) {}
            for (;;)
            {
              paramInt += 1;
              break;
              Iterator localIterator = ((HashMap)localObject9).keySet().iterator();
              String str;
              for (localObject1 = ""; localIterator.hasNext(); localObject1 = (String)localObject1 + str + ":" + ((HashMap)localObject9).get(str) + "|") {
                str = (String)localIterator.next();
              }
              ((l)localObject7).c.put(String.valueOf(paramInt), localObject1);
            }
          }
          ((h)localObject4).a.add(localObject7);
        }
        localObject1 = new JceOutputStream();
        ((h)localObject4).writeTo((JceOutputStream)localObject1);
        MsfStore.getNativeConfigStore().setConfig("MONITOR_NetflowRdmReportwithStatus", HexUtil.bytes2HexStr(((JceOutputStream)localObject1).toByteArray()));
        localObject1 = d.getNetFlowStore().b(paramLong, true);
        localObject4 = ((HashMap)localObject1).keySet().iterator();
        long l1;
        while (((Iterator)localObject4).hasNext())
        {
          localObject5 = (String)((Iterator)localObject4).next();
          localObject6 = new l();
          ((l)localObject6).a = ((String)localObject5);
          ((l)localObject6).c = new HashMap();
          ((l)localObject6).c.put("uin", localObject5);
          localObject7 = ((HashMap)((HashMap)localObject1).get(localObject5)).keySet().iterator();
          while (((Iterator)localObject7).hasNext())
          {
            localObject8 = (String)((Iterator)localObject7).next();
            l1 = ((Long)((HashMap)((HashMap)localObject1).get(localObject5)).get(localObject8)).longValue();
            ((l)localObject6).b += l1;
            ((l)localObject6).c.put(localObject8, String.valueOf(l1));
          }
          ((h)localObject2).a.add(localObject6);
        }
        localObject1 = new JceOutputStream();
        ((h)localObject2).writeTo((JceOutputStream)localObject1);
        MsfStore.getNativeConfigStore().setConfig("MONITOR_NetflowRdmReport", HexUtil.bytes2HexStr(((JceOutputStream)localObject1).toByteArray()));
        localObject1 = new h();
        ((h)localObject1).a = new ArrayList();
        try
        {
          l1 = Long.parseLong(com.tencent.mobileqq.msf.core.a.a.f());
          localObject2 = d.getNetFlowStore().b(paramLong, false);
          localObject4 = ((HashMap)localObject2).keySet().iterator();
          if (((Iterator)localObject4).hasNext())
          {
            localObject5 = (String)((Iterator)localObject4).next();
            localObject6 = new l();
            ((l)localObject6).a = ((String)localObject5);
            ((l)localObject6).c = new HashMap();
            ((l)localObject6).c.put("uin", localObject5);
            localObject7 = ((HashMap)((HashMap)localObject2).get(localObject5)).keySet().iterator();
            while (((Iterator)localObject7).hasNext())
            {
              localObject8 = (String)((Iterator)localObject7).next();
              paramLong = ((Long)((HashMap)((HashMap)localObject2).get(localObject5)).get(localObject8)).longValue();
              ((l)localObject6).b += paramLong;
              ((l)localObject6).c.put(localObject8, String.valueOf(paramLong));
            }
          }
        }
        catch (Exception localException)
        {
          for (;;)
          {
            l1 = 10485760L;
            continue;
            ((l)localObject6).c.put("TotalBuffSize", String.valueOf(((l)localObject6).b));
            if (((l)localObject6).b > l1) {
              ((h)localObject1).a.add(localObject6);
            }
          }
          if (((h)localObject1).a.size() > 0)
          {
            localObject3 = new JceOutputStream();
            ((h)localObject1).writeTo((JceOutputStream)localObject3);
            MsfStore.getNativeConfigStore().setConfig("cautionNetFlowSize", HexUtil.bytes2HexStr(((JceOutputStream)localObject3).toByteArray()));
          }
          localObject1 = new Intent(NetConnInfoCenter.RDMREPORT_INTENT);
          ((Intent)localObject1).setAction(NetConnInfoCenter.RDMREPORT_INTENT);
          localObject1 = PendingIntent.getBroadcast(BaseApplication.getContext(), 0, (Intent)localObject1, 0);
          Object localObject3 = (AlarmManager)BaseApplication.getContext().getSystemService("alarm");
          localObject4 = new Random(System.currentTimeMillis());
          paramLong = System.currentTimeMillis() + ((Random)localObject4).nextInt(21600000);
          ((AlarmManager)localObject3).set(0, paramLong, (PendingIntent)localObject1);
          localObject1 = new SimpleDateFormat("yy-MM-dd HH:mm:ss", Locale.getDefault());
          B = paramLong;
          MsfStore.getNativeConfigStore().setConfig("MONITOR_NetflowRdmReport_TIME", String.valueOf(B));
        }
      } while (!QLog.isColorLevel());
      QLog.d("MSF.C.MonitorNetFlowStore", 2, "set new netflow reportRDM at " + ((SimpleDateFormat)localObject1).format(Long.valueOf(B)));
      return;
    }
  }
  
  public static void b(long paramLong)
  {
    b.b = (paramLong * 1024L * 1024L);
    d();
  }
  
  private static void b(long paramLong1, long paramLong2)
  {
    try
    {
      MsfStore.getNativeConfigStore().setConfig("MSF_monthWifiFlow", String.valueOf(paramLong1));
      MsfStore.getNativeConfigStore().setConfig("MSF_monthXGFlow", String.valueOf(paramLong2));
      QLog.d("MSF.C.NetworkTraffic", 1, "save monthWifiCount " + paramLong1 + " monthXGCount " + paramLong2);
      return;
    }
    catch (Exception localException)
    {
      QLog.d("MSF.C.NetworkTraffic", 1, "save monthData error " + localException);
    }
  }
  
  public static void c()
  {
    JceOutputStream localJceOutputStream = new JceOutputStream();
    a.writeTo(localJceOutputStream);
    MsfStore.getNativeConfigStore().setConfig("MSF_Metrics", HexUtil.bytes2HexStr(localJceOutputStream.toByteArray()));
  }
  
  public static void d()
  {
    JceOutputStream localJceOutputStream = new JceOutputStream();
    b.writeTo(localJceOutputStream);
    MsfStore.getNativeConfigStore().setConfig("MSF_TransportMetrics_Status", HexUtil.bytes2HexStr(localJceOutputStream.toByteArray()));
  }
  
  private static void d(boolean paramBoolean)
  {
    Iterator localIterator = a.a.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      ((q)localEntry.getValue()).b.clear();
      if (paramBoolean) {
        ((q)localEntry.getValue()).c.clear();
      }
    }
    a.b = 0L;
    a.c = 0L;
  }
  
  public static void e()
  {
    long l1;
    if (MsfCore.SysVerSion >= 8) {
      synchronized (l)
      {
        l1 = TrafficStats.getUidRxBytes(Process.myUid()) + TrafficStats.getUidTxBytes(Process.myUid());
      }
    }
    try
    {
      if (NetConnInfoCenterImpl.isMobileConn()) {
        a(false, l1);
      }
      while (!NetConnInfoCenterImpl.isWifiConn())
      {
        return;
        localObject2 = finally;
        throw ((Throwable)localObject2);
      }
      a(true, l1);
      return;
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
    }
  }
  
  private static void e(boolean paramBoolean)
  {
    File localFile;
    synchronized (l)
    {
      if ((o != null) && (o.exists()))
      {
        localFile = new File(m.getAbsolutePath() + "/" + "cw_" + "0");
        o.renameTo(localFile);
        o = localFile;
        if (QLog.isColorLevel())
        {
          QLog.d("MSF.C.NetworkTraffic", 2, "monitorNetFlow currentWifiFlowFile " + o.getName() + " rename to " + localFile.getName());
          QLog.d("MSF.C.NetworkTraffic", 2, "monitorNetFlow currentDay wifiFlow " + t);
        }
      }
    }
    for (;;)
    {
      long l1;
      long l2;
      synchronized (l)
      {
        if ((p != null) && (p.exists()))
        {
          localFile = new File(m.getAbsolutePath() + "/" + "cx_" + "0");
          p.renameTo(localFile);
          p = localFile;
          if (QLog.isColorLevel())
          {
            QLog.d("MSF.C.NetworkTraffic", 2, "monitorNetFlow currentXGFlowFile " + p.getName() + " rename to " + localFile.getName());
            QLog.d("MSF.C.NetworkTraffic", 2, "monitorNetFlow currentDay xgFlow " + u);
          }
        }
        l1 = f();
        l2 = g();
        if (paramBoolean)
        {
          a(l1 + t, l2 + u);
          b(0L, 0L);
          t = 0L;
          u = 0L;
          return;
          localObject2 = finally;
          throw ((Throwable)localObject2);
        }
      }
      b(l1 + t, l2 + u);
    }
  }
  
  private static long f()
  {
    try
    {
      String str = MsfStore.getNativeConfigStore().getConfig("MSF_monthWifiFlow");
      if ((str != null) && (str.length() > 0))
      {
        long l1 = Long.parseLong(str);
        return l1;
      }
    }
    catch (Exception localException)
    {
      QLog.d("MSF.C.NetworkTraffic", 1, "get monthWifiData error " + localException);
    }
    return 0L;
  }
  
  private static long g()
  {
    try
    {
      String str = MsfStore.getNativeConfigStore().getConfig("MSF_monthXGFlow");
      if ((str != null) && (str.length() > 0))
      {
        long l1 = Long.parseLong(str);
        return l1;
      }
    }
    catch (Exception localException)
    {
      QLog.d("MSF.C.NetworkTraffic", 1, "get monthXGData error " + localException);
    }
    return 0L;
  }
  
  private static long h()
  {
    try
    {
      String str = MsfStore.getNativeConfigStore().getConfig("MSF_lastMonthWifiFlow");
      if ((str != null) && (str.length() > 0))
      {
        long l1 = Long.parseLong(str);
        return l1;
      }
    }
    catch (Exception localException)
    {
      QLog.d("MSF.C.NetworkTraffic", 1, "get lastMonthWifiData error " + localException);
    }
    return 0L;
  }
  
  private static long i()
  {
    try
    {
      String str = MsfStore.getNativeConfigStore().getConfig("MSF_lastMonthXGFlow");
      if ((str != null) && (str.length() > 0))
      {
        long l1 = Long.parseLong(str);
        return l1;
      }
    }
    catch (Exception localException)
    {
      QLog.d("MSF.C.NetworkTraffic", 1, "get lastMonthXGData error " + localException);
    }
    return 0L;
  }
  
  private static void j()
  {
    if (r == null) {
      r = BaseApplication.getContext().getFilesDir().getAbsolutePath() + "/flow/";
    }
    if (m == null) {
      m = new File(r);
    }
    if (!m.exists()) {
      m.mkdirs();
    }
  }
  
  private static void k()
    throws IOException
  {
    int i2 = 0;
    if ((m != null) && (m.exists()))
    {
      String[] arrayOfString = m.list();
      int i5 = arrayOfString.length;
      int i1 = 0;
      int i3 = 0;
      if (i1 < i5)
      {
        String str = arrayOfString[i1];
        int i4;
        if (str.startsWith("cx_"))
        {
          p = new File(m.getAbsolutePath() + "/" + str);
          u = Long.parseLong(str.substring("cx_".length(), str.length()));
          i4 = 1;
        }
        for (;;)
        {
          i1 += 1;
          i2 = i4;
          break;
          i4 = i2;
          if (str.startsWith("cw_"))
          {
            o = new File(m.getAbsolutePath() + "/" + str);
            t = Long.parseLong(str.substring("cw_".length(), str.length()));
            i3 = 1;
            i4 = i2;
          }
        }
      }
      if (i2 == 0)
      {
        p = new File(m.getAbsolutePath() + "/" + "cx_" + "0");
        p.createNewFile();
      }
      if (i3 == 0)
      {
        o = new File(m.getAbsolutePath() + "/" + "cw_" + "0");
        o.createNewFile();
      }
      s = t + u;
      if (QLog.isColorLevel())
      {
        QLog.d("MSF.C.NetworkTraffic", 2, "monitorNetFlow load lastRunning bytesCount " + s + " todayWifiCount:" + t + " todayXGCount:" + u);
        QLog.d("MSF.C.NetworkTraffic", 2, "monitorNetFlow currentXGFlowFile is " + p.getName());
        QLog.d("MSF.C.NetworkTraffic", 2, "monitorNetFlow currentWifiFlowFile is " + o.getName());
      }
    }
  }
  
  private static byte l()
    throws IOException
  {
    n = new File(r + "last_w");
    if (!n.exists())
    {
      n = new File(r + "last_g");
      if (!n.exists()) {
        return 0;
      }
      return 2;
    }
    return 1;
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\com\tencent\mobileqq\msf\core\c\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */