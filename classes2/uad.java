import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.qcall.QCallFacade;

public class uad
  implements Runnable
{
  public uad(QCallFacade paramQCallFacade)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void run()
  {
    QCallFacade.a(this.a).x();
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\uad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */