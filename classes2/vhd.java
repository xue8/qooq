import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.biz.common.util.ImageUtil;
import com.tencent.biz.common.util.Util;
import com.tencent.image.URLDrawable;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.troop.activity.TroopAvatarWallPreviewActivity;
import com.tencent.qphone.base.util.BaseApplication;
import com.tencent.qphone.base.util.QLog;
import com.tencent.smtt.sdk.CookieManager;
import com.tencent.smtt.sdk.CookieSyncManager;
import com.tencent.widget.ActionSheet;
import java.io.File;
import java.net.URL;

public class vhd
  implements Runnable
{
  public vhd(TroopAvatarWallPreviewActivity paramTroopAvatarWallPreviewActivity, URLDrawable paramURLDrawable, ActionSheet paramActionSheet)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void run()
  {
    try
    {
      if (QLog.isColorLevel()) {
        QLog.d("TroopAvatarWallPreviewActivity", 2, "QR Check Start!");
      }
      Object localObject = new Bundle();
      String str1 = this.jdField_a_of_type_ComTencentImageURLDrawable.getURL().toString();
      if (this.jdField_a_of_type_ComTencentMobileqqTroopActivityTroopAvatarWallPreviewActivity.a == null)
      {
        CookieSyncManager.createInstance(this.jdField_a_of_type_ComTencentMobileqqTroopActivityTroopAvatarWallPreviewActivity.getApplicationContext());
        this.jdField_a_of_type_ComTencentMobileqqTroopActivityTroopAvatarWallPreviewActivity.a = CookieManager.getInstance();
      }
      String str2 = this.jdField_a_of_type_ComTencentMobileqqTroopActivityTroopAvatarWallPreviewActivity.a.getCookie(str1);
      if (str2 != null)
      {
        ((Bundle)localObject).putString("Cookie", str2);
        if (QLog.isColorLevel()) {
          QLog.d("TroopAvatarWallPreviewActivity", 2, "Get cookie: " + Util.c(str2, new String[0]) + " from " + Util.b(str1, new String[0]));
        }
      }
      localObject = ImageUtil.a(BaseApplication.getContext(), str1, (Bundle)localObject);
      if (QLog.isColorLevel()) {
        QLog.d("TroopAvatarWallPreviewActivity", 2, "saveTmpImage path = " + (String)localObject);
      }
      this.jdField_a_of_type_ComTencentMobileqqTroopActivityTroopAvatarWallPreviewActivity.o = ((String)localObject);
      com.tencent.qbar.QbarCrashCollector.a = Util.b(str1, new String[0]);
      if ((!TextUtils.isEmpty((CharSequence)localObject)) && (TroopAvatarWallPreviewActivity.a(this.jdField_a_of_type_ComTencentMobileqqTroopActivityTroopAvatarWallPreviewActivity, new File((String)localObject))))
      {
        if (QLog.isColorLevel()) {
          QLog.d("TroopAvatarWallPreviewActivity", 2, "has QRCode ");
        }
        this.jdField_a_of_type_ComTencentMobileqqTroopActivityTroopAvatarWallPreviewActivity.runOnUiThread(new vhe(this));
      }
      for (;;)
      {
        com.tencent.qbar.QbarCrashCollector.a = null;
        return;
        if (QLog.isColorLevel()) {
          QLog.d("TroopAvatarWallPreviewActivity", 2, "no QRCode ");
        }
      }
      return;
    }
    catch (Exception localException)
    {
      if (QLog.isColorLevel())
      {
        QLog.e("TroopAvatarWallPreviewActivity", 2, "showActionSheet error : " + localException.getMessage());
        return;
      }
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
    {
      if (QLog.isColorLevel()) {
        QLog.e("TroopAvatarWallPreviewActivity", 2, "showActionSheet error : " + localUnsatisfiedLinkError.getMessage());
      }
    }
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\vhd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */