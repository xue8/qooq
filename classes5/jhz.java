import android.os.Bundle;
import com.tencent.biz.webviewplugin.SSOWebviewPlugin;
import com.tencent.mobileqq.WebSsoBody.WebSsoControlData;
import com.tencent.mobileqq.WebSsoBody.WebSsoResponseBody;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import mqq.observer.BusinessObserver;
import org.json.JSONException;
import org.json.JSONObject;

public class jhz
  implements BusinessObserver
{
  public jhz(SSOWebviewPlugin paramSSOWebviewPlugin, String paramString)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onReceive(int paramInt, boolean paramBoolean, Bundle paramBundle)
  {
    if (paramBoolean) {}
    try
    {
      Object localObject = paramBundle.getByteArray("data");
      if (localObject == null) {
        return;
      }
      paramBundle = new WebSsoBody.WebSsoResponseBody();
      paramBundle.mergeFrom((byte[])localObject);
      localObject = new JSONObject();
      ((JSONObject)localObject).put("data", paramBundle.data.get());
      ((JSONObject)localObject).put("retcode", paramBundle.ret.get());
      ((JSONObject)localObject).put("cret", 0);
      this.jdField_a_of_type_ComTencentBizWebviewpluginSSOWebviewPlugin.callJs(this.jdField_a_of_type_JavaLangString, new String[] { ((JSONObject)localObject).toString() });
      if (((WebSsoBody.WebSsoControlData)paramBundle.controlData.get()).frequency.has()) {
        this.jdField_a_of_type_ComTencentBizWebviewpluginSSOWebviewPlugin.a = ((WebSsoBody.WebSsoControlData)paramBundle.controlData.get()).frequency.get();
      }
      if (!((WebSsoBody.WebSsoControlData)paramBundle.controlData.get()).packageSize.has()) {
        return;
      }
      this.jdField_a_of_type_ComTencentBizWebviewpluginSSOWebviewPlugin.b = ((WebSsoBody.WebSsoControlData)paramBundle.controlData.get()).packageSize.get();
      return;
    }
    catch (Exception paramBundle)
    {
      paramBundle = new JSONObject();
      try
      {
        paramBundle.put("cret", 2);
        this.jdField_a_of_type_ComTencentBizWebviewpluginSSOWebviewPlugin.callJs(this.jdField_a_of_type_JavaLangString, new String[] { paramBundle.toString() });
        return;
      }
      catch (JSONException localJSONException)
      {
        for (;;)
        {
          localJSONException.printStackTrace();
        }
      }
    }
    paramBundle = new JSONObject();
    paramBundle.put("cret", 1);
    this.jdField_a_of_type_ComTencentBizWebviewpluginSSOWebviewPlugin.callJs(this.jdField_a_of_type_JavaLangString, new String[] { paramBundle.toString() });
    return;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\jhz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */