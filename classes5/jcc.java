import android.app.Activity;
import android.os.Bundle;
import com.tencent.biz.qrcode.QRActionEntity;
import com.tencent.biz.qrcode.QRResultHandler;
import com.tencent.biz.qrcode.activity.QRJumpActivity;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import mqq.observer.BusinessObserver;
import org.json.JSONObject;

public class jcc
  implements BusinessObserver
{
  public jcc(QRJumpActivity paramQRJumpActivity, String paramString1, Activity paramActivity, String paramString2)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onReceive(int paramInt, boolean paramBoolean, Bundle paramBundle)
  {
    Object localObject1 = null;
    if (this.jdField_a_of_type_ComTencentBizQrcodeActivityQRJumpActivity.isFinishing()) {
      return;
    }
    if ((paramBoolean) && (paramBundle != null)) {
      paramBundle = paramBundle.getString("result");
    }
    for (;;)
    {
      try
      {
        Object localObject2 = new JSONObject(paramBundle);
        QRActionEntity localQRActionEntity;
        if (((JSONObject)localObject2).getInt("r") == 0) {
          localQRActionEntity = new QRActionEntity(((JSONObject)localObject2).getString("d"));
        }
        boolean bool;
        Bundle localBundle;
        paramBundle = null;
      }
      catch (Exception paramBundle)
      {
        try
        {
          if (((JSONObject)localObject2).has("wpa"))
          {
            paramBoolean = "1".equals(((JSONObject)localObject2).getString("wpa"));
            bool = ((JSONObject)localObject2).has("extvalue");
            if (((JSONObject)localObject2).has("exttype"))
            {
              if ("2".equals(((JSONObject)localObject2).getString("exttype"))) {
                break label292;
              }
              if ("1".equals(((JSONObject)localObject2).getString("exttype")))
              {
                break label292;
                paramBundle = new Bundle();
                if (!paramBoolean) {}
              }
            }
            try
            {
              paramBundle.putBoolean("issupportwpa", paramBoolean);
              if ((paramInt != 0) && (bool))
              {
                localObject1 = ((JSONObject)localObject2).getString("exttype");
                localObject2 = ((JSONObject)localObject2).getString("extvalue");
                paramBundle.putString("exttype", (String)localObject1);
                paramBundle.putString("extvalue", (String)localObject2);
              }
              paramBundle.putString("authKey", this.jdField_a_of_type_JavaLangString);
              localObject1 = paramBundle;
              paramBundle = localQRActionEntity;
            }
            catch (Exception localException)
            {
              localBundle = paramBundle;
              paramBundle = localQRActionEntity;
              continue;
            }
            if (localObject1 != null) {
              QRResultHandler.a(this.jdField_a_of_type_ComTencentBizQrcodeActivityQRJumpActivity.app, this.jdField_a_of_type_AndroidAppActivity, paramBundle, this.b, (Bundle)localObject1);
            }
            this.jdField_a_of_type_AndroidAppActivity.finish();
            return;
            paramInt = 0;
            continue;
            paramBundle = paramBundle;
            paramBundle = null;
            continue;
          }
        }
        catch (Exception paramBundle)
        {
          paramBundle = localQRActionEntity;
          continue;
          paramBoolean = false;
          continue;
        }
      }
      continue;
      label292:
      paramInt = 1;
    }
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\jcc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */