import android.app.Dialog;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.webview.swift.component.SwiftBrowserTBSHandler;
import mqq.os.MqqHandler;

public class wjg
  implements View.OnClickListener
{
  public wjg(SwiftBrowserTBSHandler paramSwiftBrowserTBSHandler)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onClick(View paramView)
  {
    if (SwiftBrowserTBSHandler.a(this.a) != null) {
      SwiftBrowserTBSHandler.a(this.a).dismiss();
    }
    SwiftBrowserTBSHandler.a(this.a).sendMessage(SwiftBrowserTBSHandler.a(this.a).obtainMessage(102));
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\wjg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */