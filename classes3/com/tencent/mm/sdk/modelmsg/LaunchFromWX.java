package com.tencent.mm.sdk.modelmsg;

import android.os.Bundle;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.modelbase.BaseReq;
import com.tencent.mm.sdk.modelbase.BaseResp;

public class LaunchFromWX
{
  public static class Req
    extends BaseReq
  {
    private static final int MESSAGE_ACTION_LENGTH_LIMIT = 2048;
    private static final int MESSAGE_EXT_LENGTH_LIMIT = 2048;
    private static final String TAG = "MicroMsg.SDK.LaunchFromWX.Req";
    public String country;
    public String lang;
    public String messageAction;
    public String messageExt;
    
    public Req() {}
    
    public Req(Bundle paramBundle)
    {
      fromBundle(paramBundle);
    }
    
    public boolean checkArgs()
    {
      if ((this.messageAction != null) && (this.messageAction.length() > 2048))
      {
        b.a("MicroMsg.SDK.LaunchFromWX.Req", "checkArgs fail, messageAction is too long");
        return false;
      }
      if ((this.messageExt != null) && (this.messageExt.length() > 2048))
      {
        b.a("MicroMsg.SDK.LaunchFromWX.Req", "checkArgs fail, messageExt is too long");
        return false;
      }
      return true;
    }
    
    public void fromBundle(Bundle paramBundle)
    {
      super.fromBundle(paramBundle);
      this.messageAction = paramBundle.getString("_wxobject_message_action");
      this.messageExt = paramBundle.getString("_wxobject_message_ext");
      this.lang = paramBundle.getString("_wxapi_launch_req_lang");
      this.country = paramBundle.getString("_wxapi_launch_req_country");
    }
    
    public int getType()
    {
      return 6;
    }
    
    public void toBundle(Bundle paramBundle)
    {
      super.toBundle(paramBundle);
      paramBundle.putString("_wxobject_message_action", this.messageAction);
      paramBundle.putString("_wxobject_message_ext", this.messageExt);
      paramBundle.putString("_wxapi_launch_req_lang", this.lang);
      paramBundle.putString("_wxapi_launch_req_country", this.country);
    }
  }
  
  public static class Resp
    extends BaseResp
  {
    public Resp() {}
    
    public Resp(Bundle paramBundle)
    {
      fromBundle(paramBundle);
    }
    
    public boolean checkArgs()
    {
      return true;
    }
    
    public int getType()
    {
      return 6;
    }
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\tencent\mm\sdk\modelmsg\LaunchFromWX.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */