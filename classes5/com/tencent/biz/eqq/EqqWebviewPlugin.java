package com.tencent.biz.eqq;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.tencent.biz.pubaccount.AccountDetail.activity.EqqAccountDetailActivity;
import com.tencent.mobileqq.activity.ChatActivity;
import com.tencent.mobileqq.activity.aio.AIOUtils;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.webview.swift.JsBridgeListener;
import com.tencent.mobileqq.webview.swift.WebViewPlugin;
import com.tencent.mobileqq.webview.swift.WebViewPlugin.PluginRuntime;
import com.tencent.qphone.base.util.QLog;
import org.json.JSONException;
import org.json.JSONObject;

public class EqqWebviewPlugin
  extends WebViewPlugin
{
  public static final String a = "EqqWebviewPlugin";
  public static final String b = "eqq";
  protected Activity a;
  
  public EqqWebviewPlugin()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.mPluginNameSpace = "eqq";
  }
  
  private void b(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return;
    }
    try
    {
      Object localObject = new JSONObject(paramString);
      paramString = ((JSONObject)localObject).getString("uin");
      localObject = ((JSONObject)localObject).getString("name");
      Intent localIntent = AIOUtils.a(new Intent(this.a, ChatActivity.class), null);
      localIntent.putExtra("uin", paramString);
      localIntent.putExtra("uintype", 1024);
      localIntent.putExtra("uinname", (String)localObject);
      localIntent.putExtra("entrance", 0);
      localIntent.putExtra("aio_msg_source", 999);
      this.a.startActivity(localIntent);
      return;
    }
    catch (JSONException paramString)
    {
      paramString.printStackTrace();
    }
  }
  
  protected void a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {}
    do
    {
      return;
      try
      {
        paramString = new JSONObject(paramString).getString("uin");
        Intent localIntent = new Intent(this.a, EqqAccountDetailActivity.class);
        localIntent.putExtra("uin", paramString);
        localIntent.putExtra("uintype", 1024);
        this.a.startActivity(localIntent);
        return;
      }
      catch (JSONException paramString) {}
    } while (!QLog.isColorLevel());
    QLog.d("EqqWebviewPlugin", 2, "showEqq json error!");
  }
  
  protected boolean handleJsRequest(JsBridgeListener paramJsBridgeListener, String paramString1, String paramString2, String paramString3, String... paramVarArgs)
  {
    if (!"eqq".equals(paramString2)) {}
    do
    {
      return false;
      if ("showEQQ".equals(paramString3))
      {
        if (paramVarArgs.length > 0) {
          a(paramVarArgs[0]);
        }
        return true;
      }
    } while ((!"showEQQAio".equals(paramString3)) || (paramVarArgs.length != 1));
    b(paramVarArgs[0]);
    return false;
  }
  
  protected void onCreate()
  {
    super.onCreate();
    this.a = this.mRuntime.a();
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\com\tencent\biz\eqq\EqqWebviewPlugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */