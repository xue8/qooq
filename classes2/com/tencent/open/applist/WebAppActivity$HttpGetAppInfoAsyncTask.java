package com.tencent.open.applist;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.open.adapter.CommonDataAdapter;
import com.tencent.open.base.LogUtility;
import java.util.HashMap;
import org.json.JSONObject;

public class WebAppActivity$HttpGetAppInfoAsyncTask
  extends AsyncTask
{
  public WebAppActivity$HttpGetAppInfoAsyncTask(WebAppActivity paramWebAppActivity)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  protected HashMap a(Bundle... paramVarArgs)
  {
    paramVarArgs = new Bundle();
    paramVarArgs.putString("type", "h5_appinfo");
    paramVarArgs.putString("platform", "android");
    paramVarArgs.putString("appid", this.a.g);
    if (TextUtils.isEmpty(this.a.k)) {
      paramVarArgs.putString("sid", CommonDataAdapter.a().a());
    }
    for (;;)
    {
      if (!TextUtils.isEmpty(this.a.j)) {
        paramVarArgs.putString("args", this.a.j);
      }
      return this.a.a("http://mapp.qzone.qq.com/cgi-bin/mapp/mapp_info", paramVarArgs);
      paramVarArgs.putString("sid", this.a.k);
    }
  }
  
  protected void a(HashMap paramHashMap)
  {
    int i = -4;
    Message localMessage = this.a.jdField_b_of_type_AndroidOsHandler.obtainMessage();
    if ((paramHashMap == null) || (paramHashMap.get("ResultType") == null)) {
      localMessage.what = 6;
    }
    for (;;)
    {
      label36:
      this.a.jdField_b_of_type_AndroidOsHandler.sendMessage(localMessage);
      return;
      if (((Integer)paramHashMap.get("ResultType")).intValue() == 1)
      {
        LogUtility.c("WebAppActivity", "onPostExecute success");
        paramHashMap = (JSONObject)paramHashMap.get("ResultValue");
        LogUtility.c("WebAppActivity", "onPostExecute ");
        if (paramHashMap == null) {}
        for (;;)
        {
          LogUtility.c("WebAppActivity", "resultCode >>> " + i);
          switch (i)
          {
          default: 
            localMessage.what = 6;
            break label36;
            i = paramHashMap.optInt("resultCode", -4);
          }
        }
        Object localObject = paramHashMap.optJSONObject("meta");
        JSONObject localJSONObject = paramHashMap.optJSONObject("app");
        paramHashMap = (HashMap)localObject;
        if (localObject == null) {
          paramHashMap = new JSONObject();
        }
        localObject = localJSONObject;
        if (localJSONObject == null) {
          localObject = new JSONObject();
        }
        this.a.f = paramHashMap.optString("jumpurl");
        boolean bool = this.a.a((JSONObject)localObject);
        this.a.o = ((JSONObject)localObject).optInt("quickbar");
        this.a.p = ((JSONObject)localObject).optInt("isGenIcon");
        this.a.q = ((JSONObject)localObject).optInt("orientation");
        paramHashMap = this.a;
        if (this.a.o == 1) {}
        for (i = 0;; i = 1)
        {
          paramHashMap.r = i;
          if (bool)
          {
            LogUtility.c("WebAppActivity", "replace Shortcut");
            this.a.a(this.a.h, ((JSONObject)localObject).optString("name"), true);
          }
          this.a.h = ((JSONObject)localObject).optString("name");
          LogUtility.c("WebAppActivity", "onPostExecute appName = " + this.a.h + " | " + "strUrl = " + this.a.f + " | " + this.a.n + " | " + this.a.q + " | " + this.a.o + " | " + this.a.r + " | " + this.a.g + " | " + this.a.j);
          if (TextUtils.isEmpty(this.a.f)) {
            break label538;
          }
          localMessage.what = 4;
          break;
        }
        label538:
        localMessage.what = 6;
        continue;
        if (!this.a.jdField_b_of_type_Boolean)
        {
          localMessage.what = 3;
          this.a.jdField_b_of_type_Boolean = true;
        }
        else
        {
          localMessage.what = 7;
          continue;
          if (!this.a.jdField_b_of_type_Boolean)
          {
            localMessage.what = 3;
            this.a.jdField_b_of_type_Boolean = true;
          }
          else
          {
            localMessage.what = 7;
            continue;
            localMessage.what = 5;
            continue;
            localMessage.what = 6;
          }
        }
      }
      else
      {
        localMessage.what = 6;
        LogUtility.c("WebAppActivity", "onPostExecute error >>> 1");
      }
    }
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\open\applist\WebAppActivity$HttpGetAppInfoAsyncTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */