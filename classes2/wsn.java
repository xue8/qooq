import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.biz.common.util.OfflineSecurity;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.open.appcommon.AppViewBaseActivity;
import com.tencent.open.appcommon.Common;
import com.tencent.open.base.LogUtility;
import java.io.File;

public class wsn
  implements Runnable
{
  public wsn(AppViewBaseActivity paramAppViewBaseActivity, Object paramObject, String paramString1, String paramString2)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void run()
  {
    this.jdField_a_of_type_ComTencentOpenAppcommonAppViewBaseActivity.f = System.currentTimeMillis();
    if (this.jdField_a_of_type_ComTencentOpenAppcommonAppViewBaseActivity.b == null) {}
    for (;;)
    {
      return;
      Message localMessage = this.jdField_a_of_type_ComTencentOpenAppcommonAppViewBaseActivity.b.obtainMessage();
      localMessage.obj = this.jdField_a_of_type_JavaLangObject;
      if ((TextUtils.isEmpty(this.jdField_a_of_type_JavaLangString)) || ((this.jdField_a_of_type_JavaLangString.startsWith("file:///")) && (!this.jdField_a_of_type_JavaLangString.startsWith(Common.D)))) {
        if (this.jdField_a_of_type_ComTencentOpenAppcommonAppViewBaseActivity.h)
        {
          this.jdField_a_of_type_ComTencentOpenAppcommonAppViewBaseActivity.g = System.currentTimeMillis();
          LogUtility.b("opensdk", ">>end verify html ,load assets,so we ingore it=" + (this.jdField_a_of_type_ComTencentOpenAppcommonAppViewBaseActivity.g - this.jdField_a_of_type_ComTencentOpenAppcommonAppViewBaseActivity.f) + ">>");
          localMessage.what = 104;
        }
      }
      while (this.jdField_a_of_type_ComTencentOpenAppcommonAppViewBaseActivity.b != null)
      {
        this.jdField_a_of_type_ComTencentOpenAppcommonAppViewBaseActivity.b.sendMessage(localMessage);
        return;
        boolean bool = false;
        if (!TextUtils.isEmpty(this.jdField_a_of_type_JavaLangString))
        {
          String str = "";
          int i = this.jdField_a_of_type_JavaLangString.lastIndexOf(File.separator);
          if (i != -1) {
            str = this.jdField_a_of_type_JavaLangString.substring(i + 1);
          }
          bool = OfflineSecurity.a(this.b, str, "98");
        }
        this.jdField_a_of_type_ComTencentOpenAppcommonAppViewBaseActivity.g = System.currentTimeMillis();
        if (bool)
        {
          localMessage.what = 102;
          LogUtility.b("opensdk", ">>end verify html ,result ok,tmcost=" + (this.jdField_a_of_type_ComTencentOpenAppcommonAppViewBaseActivity.g - this.jdField_a_of_type_ComTencentOpenAppcommonAppViewBaseActivity.f) + ">>");
        }
        else
        {
          localMessage.what = 103;
          LogUtility.b("opensdk", ">>end verify html ,result fail,tmcost=" + (this.jdField_a_of_type_ComTencentOpenAppcommonAppViewBaseActivity.g - this.jdField_a_of_type_ComTencentOpenAppcommonAppViewBaseActivity.f) + ">>");
          continue;
          localMessage.what = 102;
        }
      }
    }
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\wsn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */