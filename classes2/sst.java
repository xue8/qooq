import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.statistics.ReportController;
import java.lang.ref.WeakReference;

class sst
  implements DialogInterface.OnClickListener
{
  sst(ssr paramssr)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface.dismiss();
    ReportController.b(null, "CliOper", "", "", "0X8006B16", "0X8006B16", 0, 0, "", "", "", "");
    paramDialogInterface = BaseApplicationImpl.a().a();
    if ((paramDialogInterface != null) && ((paramDialogInterface instanceof QQAppInterface)))
    {
      paramDialogInterface = (QQAppInterface)paramDialogInterface;
      Object localObject = PreferenceManager.getDefaultSharedPreferences((Context)this.a.a.get());
      paramInt = ((SharedPreferences)localObject).getInt(paramDialogInterface.f() + "_" + "push_open_notify_cancle", 0);
      localObject = ((SharedPreferences)localObject).edit();
      ((SharedPreferences.Editor)localObject).putInt(paramDialogInterface.f() + "_" + "push_open_notify_cancle", paramInt + 1);
      ((SharedPreferences.Editor)localObject).commit();
    }
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\sst.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */