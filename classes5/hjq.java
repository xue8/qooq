import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.biz.lebasearch.SearchProtocol.SearchObserver;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import org.json.JSONArray;

public final class hjq
  extends Handler
{
  public hjq(Looper paramLooper, SearchProtocol.SearchObserver paramSearchObserver)
  {
    super(paramLooper);
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void handleMessage(Message paramMessage)
  {
    if (paramMessage.arg1 == 0)
    {
      this.a.a(paramMessage.arg1, (JSONArray)paramMessage.obj);
      return;
    }
    this.a.a(paramMessage.arg1, null);
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\hjq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */