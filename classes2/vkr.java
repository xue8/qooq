import android.os.Handler;
import android.os.Message;
import com.tencent.mobileqq.app.TroopObserver;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.troop.activity.TroopSearchLogicActivity;
import com.tencent.mobileqq.utils.NetworkUtil;
import com.tencent.qphone.base.util.BaseApplication;
import java.util.List;

public class vkr
  extends TroopObserver
{
  public vkr(TroopSearchLogicActivity paramTroopSearchLogicActivity)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  protected void a(int paramInt1, boolean paramBoolean, int paramInt2, List paramList)
  {
    int i = 1;
    this.a.removeObserver(this.a.jdField_a_of_type_ComTencentMobileqqAppTroopObserver);
    if ((paramInt1 == 0) && (paramList != null) && (paramList.size() > 0))
    {
      Message localMessage = Message.obtain();
      localMessage.what = 1;
      localMessage.obj = paramList;
      localMessage.arg1 = paramInt2;
      if (paramBoolean) {}
      for (paramInt1 = i;; paramInt1 = 0)
      {
        localMessage.arg2 = paramInt1;
        this.a.jdField_a_of_type_AndroidOsHandler.sendMessageDelayed(localMessage, 300L);
        return;
      }
    }
    this.a.a();
    if (paramInt1 == 0) {
      this.a.b(2131369732);
    }
    for (;;)
    {
      this.a.finish();
      return;
      if (paramInt1 == 68) {
        this.a.b(2131369732);
      } else if (!NetworkUtil.e(BaseApplication.getContext())) {
        this.a.b(2131368639);
      } else {
        this.a.b(2131368643);
      }
    }
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\vkr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */