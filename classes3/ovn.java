import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mobileqq.activity.QQBrowserActivity;
import com.tencent.mobileqq.activity.recent.BannerManager;
import com.tencent.mobileqq.app.BaseActivity;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.redtouch.RedTouchManager;
import com.tencent.mobileqq.redtouch.VipBannerInfo;
import com.tencent.mobileqq.utils.VipUtils;
import com.tencent.pb.getbusiinfo.BusinessInfoCheckUpdate.AppInfo;
import mqq.os.MqqHandler;

public class ovn
  implements View.OnClickListener
{
  public ovn(BannerManager paramBannerManager, RedTouchManager paramRedTouchManager, VipBannerInfo paramVipBannerInfo, BusinessInfoCheckUpdate.AppInfo paramAppInfo)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onClick(View paramView)
  {
    this.jdField_a_of_type_ComTencentMobileqqRedtouchRedTouchManager.b("200001");
    if ((this.jdField_a_of_type_ComTencentMobileqqRedtouchVipBannerInfo.d == null) || (TextUtils.isEmpty(this.jdField_a_of_type_ComTencentMobileqqRedtouchVipBannerInfo.d)))
    {
      paramView = this.jdField_a_of_type_ComTencentMobileqqRedtouchVipBannerInfo.c;
      if (paramView == null)
      {
        paramView = "";
        switch (this.jdField_a_of_type_ComTencentMobileqqRedtouchVipBannerInfo.e)
        {
        }
      }
    }
    for (;;)
    {
      this.jdField_a_of_type_ComTencentMobileqqRedtouchRedTouchManager.a(this.jdField_a_of_type_ComTencentPbGetbusiinfoBusinessInfoCheckUpdate$AppInfo, this.jdField_a_of_type_ComTencentMobileqqRedtouchVipBannerInfo.a, 3);
      BannerManager.a(this.jdField_a_of_type_ComTencentMobileqqActivityRecentBannerManager).removeMessages(9);
      BannerManager.a(this.jdField_a_of_type_ComTencentMobileqqActivityRecentBannerManager).sendEmptyMessage(9);
      return;
      paramView = paramView.replace(" ", "_");
      break;
      VipUtils.a(BannerManager.a(this.jdField_a_of_type_ComTencentMobileqqActivityRecentBannerManager), 3, String.format("mvip.gongneng.mobileqq.androiddaoqiqian.xufeivip%s", new Object[] { paramView }));
      continue;
      VipUtils.b(BannerManager.a(this.jdField_a_of_type_ComTencentMobileqqActivityRecentBannerManager), 3, String.format("mvip.gongneng.mobileqq.androiddaoqiqian.xufeisvip%s", new Object[] { paramView }));
      continue;
      VipUtils.a(BannerManager.a(this.jdField_a_of_type_ComTencentMobileqqActivityRecentBannerManager), 3, String.format("mvip.gongneng.mobileqq.androidyidaoqi.xufeivip%s", new Object[] { paramView }));
      continue;
      VipUtils.b(BannerManager.a(this.jdField_a_of_type_ComTencentMobileqqActivityRecentBannerManager), 3, String.format("mvip.gongneng.mobileqq.androidyidaoqi.xufeisvip%s", new Object[] { paramView }));
      continue;
      paramView = new Intent(BannerManager.a(this.jdField_a_of_type_ComTencentMobileqqActivityRecentBannerManager), QQBrowserActivity.class);
      paramView.putExtra("url", this.jdField_a_of_type_ComTencentMobileqqRedtouchVipBannerInfo.d);
      BannerManager.a(this.jdField_a_of_type_ComTencentMobileqqActivityRecentBannerManager).startActivity(paramView);
    }
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\ovn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */