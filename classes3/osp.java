import QCARD.GetListRsp;
import com.tencent.mobileqq.activity.qqcard.NearByQQCardFragment;
import com.tencent.mobileqq.app.QQCardObserver;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public class osp
  extends QQCardObserver
{
  public osp(NearByQQCardFragment paramNearByQQCardFragment)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void a(boolean paramBoolean, GetListRsp paramGetListRsp)
  {
    NearByQQCardFragment.a(this.a, paramBoolean, paramGetListRsp);
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\osp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */