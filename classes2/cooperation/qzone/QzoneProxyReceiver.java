package cooperation.qzone;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pluginsdk.PluginProxyBroadcastReceiver;

public class QzoneProxyReceiver
  extends PluginProxyBroadcastReceiver
{
  public QzoneProxyReceiver()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\cooperation\qzone\QzoneProxyReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */