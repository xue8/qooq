import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mobileqq.activity.UpgradeDetailActivity;
import com.tencent.mobileqq.activity.recent.BannerManager;
import com.tencent.mobileqq.app.BaseActivity;
import com.tencent.mobileqq.app.upgrade.UpgradeConstants;
import com.tencent.mobileqq.app.upgrade.UpgradeController;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.statistics.ReportController;

public class ovo
  implements View.OnClickListener
{
  public ovo(BannerManager paramBannerManager)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onClick(View paramView)
  {
    this.a.a(-1, null);
    if (UpgradeController.a().a() == 4)
    {
      ReportController.b(BannerManager.a(this.a).app, "CliOper", "", "", "0X8004DA4", "0X8004DA4", 0, 0, UpgradeConstants.b(), UpgradeController.b(), UpgradeController.a(), "1");
      UpgradeController.a().a(BannerManager.a(this.a));
      return;
    }
    ReportController.b(BannerManager.a(this.a).app, "CliOper", "", "", "0X8004DA3", "0X8004DA3", 0, 0, UpgradeConstants.b(), UpgradeController.b(), UpgradeController.a(), "1");
    UpgradeDetailActivity.a(BannerManager.a(this.a), UpgradeController.a().a(), true, true, true);
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\ovo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */