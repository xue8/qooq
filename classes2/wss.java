import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.open.adapter.CommonDataAdapter;
import com.tencent.open.appcommon.Common;
import com.tencent.open.appcommon.ResourceUpdater;
import com.tencent.open.appcommon.TaskThread;
import com.tencent.open.base.FileUtils;
import com.tencent.open.base.LogUtility;

public class wss
  implements Runnable
{
  public wss(TaskThread paramTaskThread, int paramInt)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void run()
  {
    try
    {
      switch (this.jdField_a_of_type_Int)
      {
      case 1: 
        if (!Common.a()) {
          return;
        }
        LogUtility.c(TaskThread.a, "try check md5");
        ResourceUpdater.a();
        return;
      }
    }
    catch (Exception localException)
    {
      LogUtility.c(TaskThread.a, "runTask exception", localException);
      return;
    }
    TaskThread.a(CommonDataAdapter.a().a());
    return;
    FileUtils.a("Page/system", Common.j());
    return;
    this.jdField_a_of_type_ComTencentOpenAppcommonTaskThread.a(true, null);
    return;
    LogUtility.b(TaskThread.a, ">>start reset js ,del local and copy from assets");
    this.jdField_a_of_type_ComTencentOpenAppcommonTaskThread.a(false, null);
    return;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\wss.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */