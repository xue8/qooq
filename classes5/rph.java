import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import com.tencent.mobileqq.filemanager.activity.UniformDownloadActivity;
import com.tencent.mobileqq.filemanager.util.FMDialogUtil;
import com.tencent.mobileqq.filemanager.util.FMToastUtil;
import com.tencent.mobileqq.filemanager.util.FileManagerUtil;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.utils.NetworkUtil;

public class rph
  implements View.OnClickListener
{
  public rph(UniformDownloadActivity paramUniformDownloadActivity)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onClick(View paramView)
  {
    if (NetworkUtil.e(this.a.getActivity()))
    {
      UniformDownloadActivity.a(this.a).setVisibility(8);
      if (FileManagerUtil.a())
      {
        FMDialogUtil.a(this.a.getActivity(), 2131362855, 2131362883, new rpi(this));
        return;
      }
      UniformDownloadActivity.a(this.a);
      this.a.finish();
      this.a.overridePendingTransition(0, 0);
      return;
    }
    FMToastUtil.a(2131362941);
    this.a.finish();
    this.a.overridePendingTransition(0, 0);
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\rph.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */