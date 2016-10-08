package cooperation.qlink;

import android.content.ServiceConnection;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.qphone.base.util.QLog;
import java.util.concurrent.ConcurrentLinkedQueue;
import mqq.app.AppRuntime;
import yey;
import yez;

public class QlinkServiceProxy
{
  private static final String jdField_a_of_type_JavaLangString = "QlinkServiceProxy";
  private volatile long jdField_a_of_type_Long;
  private ServiceConnection jdField_a_of_type_AndroidContentServiceConnection;
  private volatile IQlinkService jdField_a_of_type_CooperationQlinkIQlinkService;
  private Object jdField_a_of_type_JavaLangObject;
  private ConcurrentLinkedQueue jdField_a_of_type_JavaUtilConcurrentConcurrentLinkedQueue;
  private AppRuntime jdField_a_of_type_MqqAppAppRuntime;
  private boolean jdField_a_of_type_Boolean;
  
  public QlinkServiceProxy(AppRuntime paramAppRuntime)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_JavaLangObject = new Object();
    this.jdField_a_of_type_JavaUtilConcurrentConcurrentLinkedQueue = new ConcurrentLinkedQueue();
    this.jdField_a_of_type_Long = -1L;
    this.jdField_a_of_type_AndroidContentServiceConnection = new yey(this);
    this.jdField_a_of_type_MqqAppAppRuntime = paramAppRuntime;
  }
  
  private boolean a()
  {
    return this.jdField_a_of_type_CooperationQlinkIQlinkService != null;
  }
  
  private void b()
  {
    yez localyez = new yez(this);
    localyez.setName("handleWaitSendProxyMsgThread");
    localyez.start();
  }
  
  private void b(SendMsg paramSendMsg)
  {
    this.jdField_a_of_type_JavaUtilConcurrentConcurrentLinkedQueue.add(paramSendMsg);
  }
  
  private void c(SendMsg paramSendMsg)
  {
    this.jdField_a_of_type_CooperationQlinkIQlinkService.a(paramSendMsg);
  }
  
  public void a()
  {
    long l = System.currentTimeMillis();
    if ((this.jdField_a_of_type_Long == -1L) || (l - this.jdField_a_of_type_Long > 10000L))
    {
      this.jdField_a_of_type_Long = l;
      QlinkPluginProxyService.a(this.jdField_a_of_type_MqqAppAppRuntime, this.jdField_a_of_type_AndroidContentServiceConnection);
      return;
    }
    QLog.d("QlinkServiceProxy", 1, "wait start qlink service result, skiped...");
  }
  
  /* Error */
  public void a(SendMsg paramSendMsg)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 27	cooperation/qlink/QlinkServiceProxy:jdField_a_of_type_JavaLangObject	Ljava/lang/Object;
    //   4: astore_2
    //   5: aload_2
    //   6: monitorenter
    //   7: aload_0
    //   8: invokespecial 113	cooperation/qlink/QlinkServiceProxy:a	()Z
    //   11: ifeq +11 -> 22
    //   14: aload_0
    //   15: aload_1
    //   16: invokespecial 60	cooperation/qlink/QlinkServiceProxy:c	(Lcooperation/qlink/SendMsg;)V
    //   19: aload_2
    //   20: monitorexit
    //   21: return
    //   22: aload_0
    //   23: getfield 64	cooperation/qlink/QlinkServiceProxy:jdField_a_of_type_Boolean	Z
    //   26: ifeq +23 -> 49
    //   29: aload_0
    //   30: aload_1
    //   31: invokespecial 115	cooperation/qlink/QlinkServiceProxy:b	(Lcooperation/qlink/SendMsg;)V
    //   34: goto -15 -> 19
    //   37: astore_3
    //   38: aload_2
    //   39: monitorexit
    //   40: aload_3
    //   41: athrow
    //   42: astore_2
    //   43: aload_0
    //   44: aload_1
    //   45: invokespecial 115	cooperation/qlink/QlinkServiceProxy:b	(Lcooperation/qlink/SendMsg;)V
    //   48: return
    //   49: aload_0
    //   50: iconst_1
    //   51: putfield 64	cooperation/qlink/QlinkServiceProxy:jdField_a_of_type_Boolean	Z
    //   54: aload_0
    //   55: aload_1
    //   56: invokespecial 115	cooperation/qlink/QlinkServiceProxy:b	(Lcooperation/qlink/SendMsg;)V
    //   59: aload_0
    //   60: invokevirtual 117	cooperation/qlink/QlinkServiceProxy:a	()V
    //   63: goto -44 -> 19
    //   66: astore_2
    //   67: aload_0
    //   68: getfield 50	cooperation/qlink/QlinkServiceProxy:jdField_a_of_type_CooperationQlinkIQlinkService	Lcooperation/qlink/IQlinkService;
    //   71: ifnonnull +9 -> 80
    //   74: aload_0
    //   75: aload_1
    //   76: invokespecial 115	cooperation/qlink/QlinkServiceProxy:b	(Lcooperation/qlink/SendMsg;)V
    //   79: return
    //   80: aload_2
    //   81: invokevirtual 120	java/lang/Exception:printStackTrace	()V
    //   84: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	85	0	this	QlinkServiceProxy
    //   0	85	1	paramSendMsg	SendMsg
    //   42	1	2	localDeadObjectException	android.os.DeadObjectException
    //   66	15	2	localException	Exception
    //   37	4	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   7	19	37	finally
    //   19	21	37	finally
    //   22	34	37	finally
    //   38	40	37	finally
    //   49	63	37	finally
    //   0	7	42	android/os/DeadObjectException
    //   40	42	42	android/os/DeadObjectException
    //   0	7	66	java/lang/Exception
    //   40	42	66	java/lang/Exception
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\cooperation\qlink\QlinkServiceProxy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */