import com.tencent.mobileqq.activity.richmedia.PtvTemplateAdapter;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.shortvideo.PtvTemplateManager.IPtvTemplateDownloadListener;
import com.tencent.mobileqq.shortvideo.PtvTemplateManager.PtvTemplateInfo;
import com.tencent.widget.HorizontalListView;

public class pdg
  implements PtvTemplateManager.IPtvTemplateDownloadListener
{
  public pdg(PtvTemplateAdapter paramPtvTemplateAdapter)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void a(PtvTemplateManager.PtvTemplateInfo paramPtvTemplateInfo, int paramInt)
  {
    this.a.a.post(new pdi(this, paramPtvTemplateInfo, paramInt));
  }
  
  public void a(PtvTemplateManager.PtvTemplateInfo paramPtvTemplateInfo, boolean paramBoolean)
  {
    this.a.a.post(new pdh(this, paramPtvTemplateInfo, paramBoolean));
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\pdg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */