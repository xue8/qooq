import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.apkupdate.logic.data.ApkUpdateDetail;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.open.adapter.CommonDataAdapter;
import com.tencent.open.base.APNUtil;
import com.tencent.open.base.LogUtility;
import com.tencent.open.downloadnew.ControlPolicyUtil;
import com.tencent.open.downloadnew.DownloadApi;
import com.tencent.open.downloadnew.DownloadConstants;
import com.tencent.open.downloadnew.DownloadInfo;
import com.tencent.open.downloadnew.DownloadManager;

public final class wur
  implements Runnable
{
  public wur(Bundle paramBundle, int paramInt1, int paramInt2, Activity paramActivity, ApkUpdateDetail paramApkUpdateDetail)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void run()
  {
    boolean bool2 = true;
    String str1 = DownloadApi.a;
    Object localObject = new StringBuilder().append("doDownloadAction pParams=").append(this.jdField_a_of_type_AndroidOsBundle).append(" source=").append(this.jdField_a_of_type_Int).append(" myAppConfig=").append(this.b).append(" ac==null is");
    if (this.jdField_a_of_type_AndroidAppActivity == null) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      LogUtility.a(str1, bool1);
      if (this.jdField_a_of_type_AndroidOsBundle != null) {
        break;
      }
      LogUtility.e(DownloadApi.a, "doDownloadAction pParams == null return");
      return;
    }
    DownloadManager.a().a();
    localObject = this.jdField_a_of_type_AndroidOsBundle.getString(DownloadConstants.a);
    this.jdField_a_of_type_AndroidOsBundle.putInt(DownloadConstants.r, this.jdField_a_of_type_Int);
    this.jdField_a_of_type_AndroidOsBundle.putInt(DownloadConstants.D, 1);
    String str2 = this.jdField_a_of_type_AndroidOsBundle.getString(DownloadConstants.A);
    str1 = this.jdField_a_of_type_AndroidOsBundle.getString(DownloadConstants.h);
    if ((TextUtils.isEmpty(str2)) || (str2.equals("0"))) {
      this.jdField_a_of_type_AndroidOsBundle.putString(DownloadConstants.A, "");
    }
    str2 = this.jdField_a_of_type_AndroidOsBundle.getString(DownloadConstants.C);
    this.jdField_a_of_type_AndroidOsBundle.putString(DownloadConstants.C, str2);
    int i = this.jdField_a_of_type_AndroidOsBundle.getInt(DownloadConstants.E);
    this.jdField_a_of_type_AndroidOsBundle.putInt(DownloadConstants.E, i);
    str2 = this.jdField_a_of_type_AndroidOsBundle.getString(DownloadConstants.F);
    if (!TextUtils.isEmpty(str2)) {
      this.jdField_a_of_type_AndroidOsBundle.putString(DownloadConstants.F, str2);
    }
    localObject = DownloadManager.a().a((String)localObject);
    if ((localObject == null) && (this.jdField_a_of_type_Int == 0) && (ControlPolicyUtil.e()))
    {
      i = this.jdField_a_of_type_AndroidOsBundle.getInt(DownloadConstants.j);
      str1 = this.jdField_a_of_type_AndroidOsBundle.getString(DownloadConstants.e);
      if ((i == 5) && (str1.equals("com.tencent.android.qqdownloader"))) {
        DownloadApi.a(this.jdField_a_of_type_AndroidOsBundle);
      }
    }
    else if ((localObject != null) && (!TextUtils.isEmpty(str1)))
    {
      ((DownloadInfo)localObject).g = str1;
    }
    if (DownloadApi.a(this.jdField_a_of_type_AndroidOsBundle))
    {
      LogUtility.a(DownloadApi.a, "doDownloadAction installApp");
      return;
    }
    if ((this.jdField_a_of_type_ComTencentApkupdateLogicDataApkUpdateDetail != null) && (this.jdField_a_of_type_ComTencentApkupdateLogicDataApkUpdateDetail.updatemethod == 2) && (TextUtils.isEmpty(this.jdField_a_of_type_AndroidOsBundle.getString(DownloadConstants.i))) && (!TextUtils.isEmpty(this.jdField_a_of_type_ComTencentApkupdateLogicDataApkUpdateDetail.url))) {
      this.jdField_a_of_type_AndroidOsBundle.putString(DownloadConstants.i, this.jdField_a_of_type_ComTencentApkupdateLogicDataApkUpdateDetail.url);
    }
    if (this.b == 0)
    {
      if ((localObject != null) && (((DownloadInfo)localObject).h == 1))
      {
        DownloadApi.b(this.jdField_a_of_type_AndroidAppActivity, this.jdField_a_of_type_AndroidOsBundle, this.jdField_a_of_type_Int, this.jdField_a_of_type_ComTencentApkupdateLogicDataApkUpdateDetail, this.b);
        return;
      }
      boolean bool3 = APNUtil.d(CommonDataAdapter.a().a());
      boolean bool4 = APNUtil.c(CommonDataAdapter.a().a());
      if ((localObject == null) || (((DownloadInfo)localObject).a() == 1))
      {
        bool1 = true;
        if (this.jdField_a_of_type_AndroidAppActivity != null) {
          break label638;
        }
      }
      for (;;)
      {
        LogUtility.a(DownloadApi.a, "check wifi dialog isWifiActive=" + bool4 + " isFirstDownload=" + bool1 + " acIsNull=" + bool2);
        if ((!bool3) || (bool2) || (bool4) || (!bool1) || (!this.jdField_a_of_type_AndroidOsBundle.getBoolean(DownloadConstants.q))) {
          break label644;
        }
        DownloadManager.a().a(this.jdField_a_of_type_AndroidAppActivity, this.jdField_a_of_type_AndroidOsBundle, this.jdField_a_of_type_Int, this.jdField_a_of_type_ComTencentApkupdateLogicDataApkUpdateDetail, this.b);
        return;
        bool1 = false;
        break;
        label638:
        bool2 = false;
      }
      label644:
      DownloadApi.a(this.jdField_a_of_type_AndroidOsBundle, this.jdField_a_of_type_Int, this.jdField_a_of_type_ComTencentApkupdateLogicDataApkUpdateDetail);
      return;
    }
    if ((localObject == null) || (((DownloadInfo)localObject).h == 1))
    {
      DownloadApi.b(this.jdField_a_of_type_AndroidAppActivity, this.jdField_a_of_type_AndroidOsBundle, this.jdField_a_of_type_Int, this.jdField_a_of_type_ComTencentApkupdateLogicDataApkUpdateDetail, this.b);
      return;
    }
    DownloadApi.a(this.jdField_a_of_type_AndroidOsBundle, this.jdField_a_of_type_Int, this.jdField_a_of_type_ComTencentApkupdateLogicDataApkUpdateDetail);
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\wur.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */