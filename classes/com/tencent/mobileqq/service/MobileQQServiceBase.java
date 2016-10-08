package com.tencent.mobileqq.service;

import android.os.Bundle;
import android.os.Looper;
import com.qq.jce.wup.UniPacket;
import com.tencent.common.app.AppInterface;
import com.tencent.common.app.BaseProtocolCoder;
import com.tencent.mobileqq.app.AppConstants;
import com.tencent.mobileqq.app.BusinessHandler;
import com.tencent.mobileqq.app.Cmd2HandlerMap;
import com.tencent.mobileqq.app.MessageHandler;
import com.tencent.mobileqq.app.ThreadManager;
import com.tencent.mobileqq.compatible.ActionListener;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.statistics.StatisticCollector;
import com.tencent.mobileqq.streamtransfile.StreamDataManager;
import com.tencent.mobileqq.utils.httputils.PkgTools;
import com.tencent.qphone.base.remote.FromServiceMsg;
import com.tencent.qphone.base.remote.IBaseActionListener;
import com.tencent.qphone.base.remote.ToServiceMsg;
import com.tencent.qphone.base.util.BaseApplication;
import com.tencent.qphone.base.util.QLog;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import mqq.app.NewIntent;
import uot;

public abstract class MobileQQServiceBase
  implements AppConstants
{
  public static HashMap a;
  public static final String b;
  public static volatile int c = 0;
  protected static final String c = "sendtimekey";
  private DecimalFormat jdField_a_of_type_JavaTextDecimalFormat = new DecimalFormat("0.00");
  private ConcurrentHashMap jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap;
  private volatile boolean jdField_a_of_type_Boolean;
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    b = MobileQQServiceBase.class.getSimpleName();
    jdField_a_of_type_JavaUtilHashMap = new HashMap();
  }
  
  public static boolean a(String paramString)
  {
    return ("OnlinePush.PbPushGroupMsg".equalsIgnoreCase(paramString)) || ("OnlinePush.PbPushDisMsg".equalsIgnoreCase(paramString)) || ("OnlinePush.PbC2CMsgSync".equalsIgnoreCase(paramString)) || ("NearFieldTranFileSvr.NotifyList".equalsIgnoreCase(paramString)) || ("NearFieldDiscussSvr.NotifyList".equalsIgnoreCase(paramString)) || ("SharpSvr.s2cpstncallback".equalsIgnoreCase(paramString));
  }
  
  public UniPacket a(ToServiceMsg paramToServiceMsg)
  {
    if ("StreamSvr.UploadStreamMsg".equalsIgnoreCase(paramToServiceMsg.getServiceCmd()))
    {
      String str = paramToServiceMsg.extraData.getString("filepath");
      UniPacket localUniPacket = (UniPacket)jdField_a_of_type_JavaUtilHashMap.get(str);
      Object localObject;
      if (localUniPacket == null)
      {
        if (QLog.isColorLevel()) {
          QLog.d(b, 2, "no saved packet, new one " + str);
        }
        localObject = new PttUniPacket(true);
        jdField_a_of_type_JavaUtilHashMap.clear();
        jdField_a_of_type_JavaUtilHashMap.put(str, localObject);
      }
      for (;;)
      {
        paramToServiceMsg = Short.valueOf(paramToServiceMsg.extraData.getShort("PackSeq"));
        int i = StreamDataManager.b(str);
        if (paramToServiceMsg.shortValue() <= i)
        {
          jdField_a_of_type_JavaUtilHashMap.remove(str);
          if (QLog.isColorLevel()) {
            QLog.d(b, 2, "last stream, remove " + i + ", " + paramToServiceMsg);
          }
        }
        return (UniPacket)localObject;
        localObject = localUniPacket;
        if (QLog.isColorLevel())
        {
          QLog.d(b, 2, "got last packet, reuse it " + str);
          localObject = localUniPacket;
        }
      }
    }
    if (QLog.isColorLevel()) {
      QLog.d(b, 2, "not stream ptt");
    }
    return new UniPacket(true);
  }
  
  public abstract AppInterface a();
  
  public BaseProtocolCoder a(String paramString)
  {
    if (!this.jdField_a_of_type_Boolean) {}
    int i;
    try
    {
      if (!this.jdField_a_of_type_Boolean) {
        a();
      }
      i = paramString.indexOf('.');
      if (i <= 1) {
        return null;
      }
    }
    finally {}
    paramString = paramString.substring(0, i);
    return (BaseProtocolCoder)this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap.get(paramString);
  }
  
  public void a()
  {
    try
    {
      if (this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap == null) {
        this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap = new ConcurrentHashMap();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  protected void a(FromServiceMsg paramFromServiceMsg) {}
  
  public void a(ToServiceMsg paramToServiceMsg, ActionListener paramActionListener, Class paramClass)
  {
    int j = 0;
    int i = 0;
    int k = 0;
    Object localObject2 = null;
    boolean bool = paramToServiceMsg.extraData.getBoolean("req_pb_protocol_flag", false);
    AppInterface localAppInterface = a();
    Object localObject1;
    if (bool)
    {
      localObject1 = localObject2;
      j = i;
      i = k;
      long l;
      if (paramToServiceMsg.getWupBuffer() != null)
      {
        l = paramToServiceMsg.getWupBuffer().length;
        localObject1 = new byte[(int)l + 4];
        PkgTools.a((byte[])localObject1, 0, 4L + l);
        PkgTools.a((byte[])localObject1, 4, paramToServiceMsg.getWupBuffer(), (int)l);
        paramToServiceMsg.putWupBuffer((byte[])localObject1);
        int m = 1;
        localObject1 = localObject2;
        j = m;
        i = k;
        if (QLog.isColorLevel())
        {
          QLog.d(b, 2, "PB cmd: req cmd: " + paramToServiceMsg.getServiceCmd());
          i = k;
          j = m;
          localObject1 = localObject2;
        }
      }
      if (j != 0)
      {
        paramToServiceMsg.actionListener = paramActionListener;
        paramActionListener = new NewIntent(localAppInterface.getApplication(), paramClass);
        paramActionListener.putExtra(ToServiceMsg.class.getSimpleName(), paramToServiceMsg);
        localAppInterface.startServlet(paramActionListener);
        l = System.currentTimeMillis();
        paramToServiceMsg.extraData.putLong("sendtimekey", l);
      }
    }
    else
    {
      label221:
      localObject1 = a(paramToServiceMsg.getServiceCmd());
      if (localObject1 != null)
      {
        localObject2 = a(paramToServiceMsg);
        ((UniPacket)localObject2).setEncodeName("utf-8");
        i = c;
        c = i + 1;
        ((UniPacket)localObject2).setRequestId(i);
        if (((BaseProtocolCoder)localObject1).a())
        {
          localObject2 = ((BaseProtocolCoder)localObject1).a(paramToServiceMsg);
          if (localObject2 == null) {
            break label670;
          }
          paramToServiceMsg.putWupBuffer((byte[])localObject2);
        }
      }
    }
    label561:
    label601:
    label670:
    for (i = 1;; i = 0)
    {
      k = 1;
      j = i;
      i = k;
      for (;;)
      {
        break;
        if (((BaseProtocolCoder)localObject1).a(paramToServiceMsg, (UniPacket)localObject2))
        {
          paramToServiceMsg.putWupBuffer(((UniPacket)localObject2).encode());
          j = 1;
          i = 0;
          continue;
          if ("RegPrxySvc.infoSync".equals(paramToServiceMsg.getServiceCmd()))
          {
            QLog.i(b, 1, "infoSync error! lookupCoder is null!");
            localObject2 = (MessageHandler)localAppInterface.a(0);
            if (localObject2 != null)
            {
              ((MessageHandler)localObject2).a(4004, false, null);
              QLog.i("jensenweng", 1, "notifyUI failed!");
            }
            localObject2 = new HashMap();
            ((HashMap)localObject2).put("param_uin", localAppInterface.a());
            if ((this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap != null) && (this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap.keySet().size() > 0)) {
              ((HashMap)localObject2).put("param_coderMap", this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap.keySet().toString());
            }
            StatisticCollector.a(BaseApplication.getContext()).a(null, "prxyLookupCoderNull", true, 0L, 0L, (HashMap)localObject2, null);
          }
          j = i;
          i = k;
          break;
          if ((!bool) && ((localObject1 == null) || (i != 0))) {
            break label221;
          }
          paramActionListener = new FromServiceMsg(localAppInterface.a(), paramToServiceMsg.getServiceCmd());
          paramClass = (int[])Cmd2HandlerMap.a().get(paramToServiceMsg.getServiceCmd());
          if ((paramClass == null) || (paramClass.length <= 0)) {
            break label221;
          }
          j = paramClass.length;
          i = 0;
          if (i < j)
          {
            localObject1 = (BusinessHandler)localAppInterface.a(paramClass[i]);
            if ((localObject1 != null) && (!bool)) {
              break label601;
            }
          }
          for (;;)
          {
            i += 1;
            break label561;
            break;
            try
            {
              ((BusinessHandler)localObject1).a(paramToServiceMsg, paramActionListener, null);
            }
            catch (Exception localException)
            {
              localException.printStackTrace();
            }
            if (QLog.isColorLevel()) {
              QLog.w(b, 2, localObject1.getClass().getSimpleName() + " onReceive error,", localException);
            }
          }
        }
        i = 0;
      }
    }
  }
  
  public void a(boolean paramBoolean, ToServiceMsg paramToServiceMsg, FromServiceMsg paramFromServiceMsg, Exception paramException)
  {
    BusinessHandler localBusinessHandler = null;
    int i = 0;
    if (paramToServiceMsg == null) {
      return;
    }
    AppInterface localAppInterface = a();
    float f = (float)(System.currentTimeMillis() - paramToServiceMsg.extraData.getLong("sendtimekey")) / 1000.0F;
    label115:
    boolean bool;
    label175:
    Object localObject;
    label213:
    int j;
    if (paramBoolean)
    {
      if (QLog.isColorLevel()) {
        QLog.d(b, 2, "[RES]cmd=" + paramFromServiceMsg.getServiceCmd() + " app seq:" + paramFromServiceMsg.getAppSeq() + " during " + this.jdField_a_of_type_JavaTextDecimalFormat.format(f) + "sec.");
      }
      bool = paramToServiceMsg.extraData.getBoolean("req_pb_protocol_flag", false);
      if (QLog.isDevelopLevel()) {
        QLog.d(b, 4, "bPbResp:" + bool);
      }
      if (bool) {
        break label714;
      }
      bool = a(paramFromServiceMsg.getServiceCmd());
      paramException = (IBaseActionListener)paramToServiceMsg.getAttribute("listener");
      if (paramException != null) {
        paramToServiceMsg.actionListener = paramException;
      }
      if (bool) {
        break label708;
      }
      localObject = a(paramFromServiceMsg.getServiceCmd());
      paramException = localBusinessHandler;
      if (paramBoolean)
      {
        if (!bool) {
          break label574;
        }
        if (QLog.isColorLevel()) {
          QLog.d(b, 2, "PB cmd: recv cmd: " + paramFromServiceMsg.getServiceCmd());
        }
        paramException = localBusinessHandler;
        if (paramFromServiceMsg.getWupBuffer() != null)
        {
          j = paramFromServiceMsg.getWupBuffer().length - 4;
          paramException = new byte[j];
          PkgTools.a(paramException, 0, paramFromServiceMsg.getWupBuffer(), 4, j);
          paramFromServiceMsg.putWupBuffer(paramException);
          paramException = paramFromServiceMsg.getWupBuffer();
        }
      }
    }
    label361:
    label574:
    label708:
    label714:
    label717:
    for (;;)
    {
      a(paramFromServiceMsg);
      if ((!bool) && (localObject == null)) {
        break;
      }
      localObject = (int[])Cmd2HandlerMap.a().get(paramFromServiceMsg.getServiceCmd());
      if ((localObject == null) || (localObject.length <= 0)) {
        break;
      }
      j = localObject.length;
      if (i >= j) {
        break;
      }
      localBusinessHandler = (BusinessHandler)localAppInterface.a(localObject[i]);
      if (localBusinessHandler != null) {}
      try
      {
        localBusinessHandler.a(paramToServiceMsg, paramFromServiceMsg, paramException);
        i += 1;
        break label361;
        if (paramException != null)
        {
          localObject = new ByteArrayOutputStream();
          paramException.printStackTrace(new PrintStream((OutputStream)localObject));
          paramException = new String(((ByteArrayOutputStream)localObject).toByteArray());
          if (!QLog.isColorLevel()) {
            break label115;
          }
          QLog.d(b, 2, "[NOT SEND]cmd=" + paramFromServiceMsg.getServiceCmd() + ", " + paramException);
          break label115;
        }
        if (!QLog.isColorLevel()) {
          break label115;
        }
        QLog.w(b, 2, "[RES]cmd=" + paramFromServiceMsg.getServiceCmd() + ",CODE=" + paramFromServiceMsg.getResultCode() + " during " + this.jdField_a_of_type_JavaTextDecimalFormat.format(f) + "sec.");
        break label115;
        if (localObject != null) {}
        try
        {
          ((BaseProtocolCoder)localObject).a(paramToServiceMsg, paramFromServiceMsg);
          paramException = ((BaseProtocolCoder)localObject).a(paramToServiceMsg, paramFromServiceMsg);
        }
        catch (Exception localException1)
        {
          localException1.printStackTrace();
          paramException = localBusinessHandler;
        }
        if (QLog.isColorLevel()) {
          QLog.d(b, 2, "bpc null");
        }
        paramException = null;
        break label717;
        if (!QLog.isColorLevel()) {
          continue;
        }
        QLog.d(b, 2, "", localException1);
        paramException = localBusinessHandler;
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          localException2.printStackTrace();
          if (QLog.isColorLevel()) {
            QLog.w(b, 2, localBusinessHandler.getClass().getSimpleName() + " onReceive error,", localException2);
          }
        }
      }
      localObject = null;
      break label213;
      break label175;
    }
  }
  
  public boolean a(BaseProtocolCoder paramBaseProtocolCoder)
  {
    int i = 0;
    String[] arrayOfString = paramBaseProtocolCoder.a();
    if ((arrayOfString == null) || (arrayOfString.length == 0)) {
      return false;
    }
    while (i < arrayOfString.length)
    {
      this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap.put(arrayOfString[i], paramBaseProtocolCoder);
      i += 1;
    }
    return true;
  }
  
  public void b(ToServiceMsg paramToServiceMsg, ActionListener paramActionListener, Class paramClass)
  {
    paramToServiceMsg = new uot(this, paramToServiceMsg, paramActionListener, paramClass);
    if (Thread.currentThread() == Looper.getMainLooper().getThread())
    {
      ThreadManager.a(paramToServiceMsg, 10, null, false);
      return;
    }
    paramToServiceMsg.run();
  }
  
  public void c()
  {
    e();
  }
  
  public void d()
  {
    try
    {
      this.jdField_a_of_type_Boolean = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  protected void e()
  {
    if (this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap != null)
    {
      Iterator localIterator = this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (String)localIterator.next();
        localObject = (BaseProtocolCoder)this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap.get(localObject);
        if (localObject != null)
        {
          try
          {
            ((BaseProtocolCoder)localObject).a();
          }
          catch (Exception localException) {}
          if (QLog.isColorLevel()) {
            QLog.d(b, 2, "bpc destory error " + localException, localException);
          }
        }
      }
      this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap.clear();
    }
    this.jdField_a_of_type_Boolean = false;
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\com\tencent\mobileqq\service\MobileQQServiceBase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */