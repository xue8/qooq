import com.tencent.biz.qqstory.storyHome.qqstorylist.model.request.GetOfficialRecommendStep;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.widget.QQToast;
import com.tencent.qphone.base.util.BaseApplication;

public class isp
  implements Runnable
{
  public isp(GetOfficialRecommendStep paramGetOfficialRecommendStep)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void run()
  {
    QQToast.a(BaseApplication.getContext(), 1, "当前网络不可用，请检查你的网络设置", 0).a();
  }
}


/* Location:              E:\apk\QQ_91\classes6-dex2jar.jar!\isp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */