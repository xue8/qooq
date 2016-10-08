import OnlinePushPack.SvcRespPushMsg;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.qq.jce.wup.UniPacket;
import com.tencent.biz.game.MSFToWebViewConnector;
import com.tencent.biz.game.MSFToWebViewConnector.IOnMsgReceiveListener;
import com.tencent.biz.game.SensorAPIJavaScript;
import com.tencent.common.app.AppInterface;
import com.tencent.mobileqq.compatible.TempServlet;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.service.MobileQQService;
import com.tencent.mobileqq.webview.swift.WebViewPlugin.PluginRuntime;
import com.tencent.qphone.base.remote.ToServiceMsg;
import com.tencent.qphone.base.util.QLog;
import mqq.app.AppRuntime;
import mqq.app.NewIntent;

public class hig
  implements MSFToWebViewConnector.IOnMsgReceiveListener
{
  public hig(SensorAPIJavaScript paramSensorAPIJavaScript)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void a(int paramInt, SvcRespPushMsg paramSvcRespPushMsg)
  {
    if (this.a.jdField_a_of_type_AndroidAppActivity != null)
    {
      AppInterface localAppInterface = this.a.mRuntime.a();
      if (localAppInterface != null)
      {
        ToServiceMsg localToServiceMsg = new ToServiceMsg("mobileqq.service", localAppInterface.getAccount(), "OnlinePush.RespPush");
        localToServiceMsg.setNeedCallback(false);
        UniPacket localUniPacket = new UniPacket(true);
        localUniPacket.setEncodeName("utf-8");
        int i = MobileQQService.c;
        MobileQQService.c = i + 1;
        localUniPacket.setRequestId(i);
        localUniPacket.setServantName("OnlinePush");
        localUniPacket.setFuncName("SvcRespPushMsg");
        localUniPacket.setRequestId(paramInt);
        localUniPacket.put("resp", paramSvcRespPushMsg);
        localToServiceMsg.putWupBuffer(localUniPacket.encode());
        paramSvcRespPushMsg = new NewIntent(this.a.jdField_a_of_type_AndroidAppActivity.getApplicationContext(), TempServlet.class);
        paramSvcRespPushMsg.putExtra(ToServiceMsg.class.getSimpleName(), localToServiceMsg);
        localAppInterface.startServlet(paramSvcRespPushMsg);
        if (QLog.isColorLevel()) {
          QLog.d("SensorApi", 2, "reply push");
        }
      }
    }
  }
  
  public void a(int paramInt, String paramString)
  {
    String str = SensorAPIJavaScript.jdField_a_of_type_ComTencentBizGameMSFToWebViewConnector.a(String.valueOf(paramInt));
    if (!TextUtils.isEmpty(str))
    {
      if (QLog.isColorLevel()) {
        QLog.d("SensorApi", 2, "send data to appId=" + paramInt);
      }
      if (this.a.jdField_a_of_type_AndroidOsHandler == null) {
        this.a.jdField_a_of_type_AndroidOsHandler = new Handler(Looper.getMainLooper());
      }
      this.a.jdField_a_of_type_AndroidOsHandler.post(new hih(this, str, paramString));
    }
    while (!QLog.isColorLevel()) {
      return;
    }
    QLog.d("SensorApi", 2, "appId=" + paramInt + "'s callback is empty");
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\hig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */