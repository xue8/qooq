import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Message;
import com.google.zxing.client.android.wifi.BizWifiConfigManager;
import com.google.zxing.client.android.wifi.WifiParsedResult;
import com.tencent.biz.common.util.Util;
import com.tencent.biz.game.SensorAPIJavaScript;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.qphone.base.util.QLog;

public class hii
  extends Thread
{
  public hii(SensorAPIJavaScript paramSensorAPIJavaScript, String paramString1, String paramString2, String paramString3, boolean paramBoolean, WifiManager paramWifiManager, String paramString4)
  {
    paramBoolean = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void run()
  {
    if (QLog.isDevelopLevel()) {
      QLog.d("SensorApi", 4, "start connectToWiFi");
    }
    Object localObject = new WifiParsedResult(this.jdField_a_of_type_JavaLangString, this.b, this.c, this.jdField_a_of_type_Boolean);
    if (new BizWifiConfigManager(this.jdField_a_of_type_AndroidNetWifiWifiManager).a((WifiParsedResult)localObject))
    {
      localObject = new Message();
      ((Message)localObject).what = 5;
      ((Message)localObject).obj = this.d;
      this.jdField_a_of_type_ComTencentBizGameSensorAPIJavaScript.a.sendMessage((Message)localObject);
      return;
    }
    this.jdField_a_of_type_ComTencentBizGameSensorAPIJavaScript.c = false;
    this.jdField_a_of_type_ComTencentBizGameSensorAPIJavaScript.callJs(this.d, new String[] { Util.b(Integer.toString(1)) });
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\hii.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */