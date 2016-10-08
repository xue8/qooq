package cooperation.qzone.remote;

import android.content.Intent;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.RemoteException;
import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.mobileqq.app.ThreadManager;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.qphone.base.util.BaseApplication;
import com.tencent.qphone.base.util.QLog;
import cooperation.plugin.IPluginManager;
import cooperation.plugin.IPluginManager.PluginParams;
import cooperation.qzone.QzonePluginProxyActivity;
import java.util.concurrent.ConcurrentLinkedQueue;
import yos;
import yot;
import you;

public class RemoteServiceProxy
{
  private static final String tag = "RemoteServiceProxy";
  private Class clazz;
  protected ServiceConnection conn;
  protected volatile long lastStartSerivceTime;
  private IActionListener mActionListener;
  private String mUin;
  protected Object sendLock;
  public ConcurrentLinkedQueue sendMsgQueue;
  public volatile IServiceHandler serviceHandler;
  private String serviceName;
  
  public RemoteServiceProxy(String paramString1, Class paramClass, String paramString2)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.sendLock = new Object();
    this.sendMsgQueue = new ConcurrentLinkedQueue();
    this.lastStartSerivceTime = -1L;
    this.conn = new yos(this);
    this.serviceName = paramString1;
    this.clazz = paramClass;
    this.mUin = paramString2;
  }
  
  protected void addMsgToSendQueue(SendMsg paramSendMsg)
  {
    this.sendMsgQueue.add(paramSendMsg);
  }
  
  public RecvMsg createWaiteRespTimeout(SendMsg paramSendMsg, String paramString)
  {
    paramSendMsg = new RecvMsg(paramSendMsg.getRequestId(), paramSendMsg.getServiceCmd());
    paramSendMsg.setBusinessFail(1002, paramString);
    return paramSendMsg;
  }
  
  protected boolean isConnected()
  {
    return this.serviceHandler != null;
  }
  
  public void onBaseServiceConnected()
  {
    yot localyot = new yot(this);
    localyot.setName("handleWaitSendProxyMsgThread");
    localyot.start();
  }
  
  public void sendFailedRespToApp(SendMsg paramSendMsg, RecvMsg paramRecvMsg)
  {
    try
    {
      if (paramSendMsg.getActionListener() != null)
      {
        paramSendMsg.getActionListener().onRecvFromMsg(paramRecvMsg);
        return;
      }
      if (this.mActionListener != null)
      {
        this.mActionListener.onRecvFromMsg(paramRecvMsg);
        return;
      }
    }
    catch (RemoteException paramSendMsg)
    {
      paramSendMsg.printStackTrace();
    }
  }
  
  public void sendMsg(SendMsg paramSendMsg)
  {
    try
    {
      synchronized (this.sendLock)
      {
        if (isConnected())
        {
          sendMsgToService(paramSendMsg);
          return;
        }
        addMsgToSendQueue(paramSendMsg);
        startBaseServiceConn();
      }
      return;
    }
    catch (DeadObjectException localDeadObjectException)
    {
      addMsgToSendQueue(paramSendMsg);
      return;
    }
    catch (Exception localException)
    {
      if (this.serviceHandler == null)
      {
        addMsgToSendQueue(paramSendMsg);
        return;
      }
      localException.printStackTrace();
    }
  }
  
  public void sendMsgToService(SendMsg paramSendMsg)
  {
    if (Looper.getMainLooper().getThread() == Thread.currentThread())
    {
      ThreadManager.a(new you(this, paramSendMsg), 10, null, false);
      return;
    }
    this.serviceHandler.sendMsg(paramSendMsg);
  }
  
  public void setActionListener(IActionListener paramIActionListener)
  {
    this.mActionListener = paramIActionListener;
  }
  
  void startBaseService()
  {
    try
    {
      Intent localIntent = new Intent(BaseApplicationImpl.a(), this.clazz);
      localIntent.putExtra("useSkinEngine", 1);
      IPluginManager.PluginParams localPluginParams = new IPluginManager.PluginParams(0);
      localPluginParams.b = QzonePluginProxyActivity.a();
      localPluginParams.d = "QQ空间";
      localPluginParams.jdField_a_of_type_JavaLangString = this.mUin;
      localPluginParams.e = this.serviceName;
      localPluginParams.jdField_a_of_type_AndroidContentIntent = localIntent;
      localPluginParams.jdField_a_of_type_AndroidContentServiceConnection = this.conn;
      IPluginManager.b(BaseApplicationImpl.a(), localPluginParams);
      if (QLog.isColorLevel()) {
        QLog.d("RemoteServiceProxy", 2, " start service finish");
      }
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public void startBaseServiceConn()
  {
    long l = System.currentTimeMillis();
    if ((this.lastStartSerivceTime == -1L) || (l - this.lastStartSerivceTime > 1000L))
    {
      this.lastStartSerivceTime = l;
      startBaseService();
    }
    while (!QLog.isColorLevel()) {
      return;
    }
    QLog.d("RemoteServiceProxy", 2, "wait start " + this.serviceName + " service result, skiped...");
  }
  
  public void unbindBaseService()
  {
    try
    {
      BaseApplication.getContext().unbindService(this.conn);
      this.serviceHandler = null;
      if (QLog.isColorLevel()) {
        QLog.d("RemoteServiceProxy", 2, " unbindService service finished");
      }
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\cooperation\qzone\remote\RemoteServiceProxy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */