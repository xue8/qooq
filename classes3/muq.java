import android.app.Dialog;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mobileqq.activity.TroopMemberListActivity;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.statistics.ReportController;

public class muq
  implements View.OnClickListener
{
  public muq(TroopMemberListActivity paramTroopMemberListActivity)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onClick(View paramView)
  {
    if (this.a.J == 11) {
      ReportController.b(this.a.app, "CliOper", "", "", "0X8006216", "0X8006216", 0, 0, "", "", "", "");
    }
    this.a.b.cancel();
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\muq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */