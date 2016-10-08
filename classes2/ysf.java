import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.biz.pubaccount.CustomWebView;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.webview.swift.WebViewPlugin.PluginRuntime;
import com.tencent.qphone.base.util.QLog;
import cooperation.qzone.webviewplugin.personalize.QZonePersonalizePlugin;

public class ysf
  extends BroadcastReceiver
{
  public ysf(QZonePersonalizePlugin paramQZonePersonalizePlugin)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    Object localObject;
    if (QLog.isDevelopLevel())
    {
      localObject = QZonePersonalizePlugin.a;
      StringBuilder localStringBuilder = new StringBuilder().append("intent is: ");
      if (paramIntent == null)
      {
        paramContext = "null";
        QLog.d((String)localObject, 4, paramContext);
      }
    }
    else
    {
      if ((paramIntent == null) || (!"QZoneCardPreDownload".equals(paramIntent.getAction()))) {
        break label281;
      }
      if (QLog.isDevelopLevel()) {
        QLog.d("QZoneCardLogic." + QZonePersonalizePlugin.a, 4, "QZoneCardPreDownload js receive setting action" + paramIntent.getAction());
      }
      localObject = paramIntent.getExtras();
      paramIntent = "";
      paramContext = "";
      if (localObject != null)
      {
        paramIntent = ((Bundle)localObject).getString("result");
        paramContext = ((Bundle)localObject).getString("cardurl");
      }
      if (QLog.isDevelopLevel()) {
        QLog.d("QZoneCardLogic." + QZonePersonalizePlugin.a, 4, "QZoneCardPreDownload js receive cardurl:" + paramContext + "\n dowonload result:" + paramIntent);
      }
      if (this.a.mRuntime != null) {
        break label219;
      }
    }
    label219:
    label281:
    int i;
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              return;
              paramContext = "not null";
              break;
            } while (this.a.mRuntime.a() == null);
            paramIntent = this.a.mRuntime.a();
          } while (paramIntent == null);
          paramIntent.c("window.QzFeedDressJSInterface.onReceive({type:\"cardurl\",data:\"" + paramContext + "\"});" + "window.QzFeedDressJSInterface.onReceive({type:\"result\",data:\"success\"});");
          return;
        } while ((paramIntent == null) || (!"action_facade_qzone2js".equals(paramIntent.getAction())));
        paramIntent = paramIntent.getExtras();
      } while (paramIntent == null);
      i = paramIntent.getInt("ret");
      paramContext = paramIntent.getString("imgDir");
      paramIntent = paramIntent.getString("imgNameList");
      if (QLog.isDevelopLevel()) {
        QLog.d(QZonePersonalizePlugin.a, 4, "receive ret:" + i + "|imgDir:" + paramContext + "|imgNameList:" + paramIntent);
      }
    } while ((this.a.mRuntime == null) || (this.a.mRuntime.a() == null));
    if (i == 0)
    {
      this.a.callJs("window.QzAvatarDressJSInterface.onReceive({type:\"result\",data:\"success\",imgDir:\"" + paramContext + "\",imgNameList:\"" + paramIntent + "\"});");
      return;
    }
    this.a.callJs("window.QzAvatarDressJSInterface.onReceive({type:\"result\",data:\"fail\"});");
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\ysf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */