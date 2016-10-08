package com.tencent.mobileqq.app;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.nearby.NearbyUtils;
import com.tencent.qphone.base.util.QLog;
import oicq.wlogin_sdk.tools.MD5;
import org.json.JSONObject;

public class HotchatSCMng$ConfigData
{
  String a;
  String b;
  String c;
  
  public HotchatSCMng$ConfigData()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public static ConfigData a(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      paramString = null;
    }
    for (;;)
    {
      return paramString;
      try
      {
        ConfigData localConfigData = new ConfigData();
        paramString = new JSONObject(paramString);
        localConfigData.a = paramString.getString("url");
        if (localConfigData.a != null)
        {
          localConfigData.a = localConfigData.a.trim();
          localConfigData.c = MD5.toMD5(localConfigData.a);
        }
        localConfigData.b = paramString.getString("md5");
        if (localConfigData.b != null) {
          localConfigData.b = localConfigData.b.trim();
        }
        paramString = localConfigData;
        if (QLog.isDevelopLevel())
        {
          NearbyUtils.a(HotchatSCMng.a, "parse ConfigData", new Object[] { localConfigData });
          return localConfigData;
        }
      }
      catch (Exception paramString)
      {
        paramString.printStackTrace();
        return null;
      }
      catch (Throwable paramString)
      {
        paramString.printStackTrace();
      }
    }
    return null;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(100);
    localStringBuilder.append("[url:").append(this.a).append(",").append("md5:").append(this.b).append("]");
    return localStringBuilder.toString();
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\tencent\mobileqq\app\HotchatSCMng$ConfigData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */