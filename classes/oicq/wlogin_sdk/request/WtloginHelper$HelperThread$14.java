package oicq.wlogin_sdk.request;

import oicq.wlogin_sdk.tools.ErrMsg;
import oicq.wlogin_sdk.tools.util;

class WtloginHelper$HelperThread$14
  implements Runnable
{
  WtloginHelper$HelperThread$14(WtloginHelper.HelperThread paramHelperThread, int paramInt) {}
  
  public void run()
  {
    WtloginHelper.HelperThread.access$500(this.this$1);
    if (this.val$cancel != 0) {
      return;
    }
    if (WtloginHelper.access$100(this.this$1.mHelper) == null)
    {
      util.LOGW("login helper listener is null", this.this$1.mUserAccount);
      return;
    }
    WtloginHelper.access$100(this.this$1.mHelper).OnException(new ErrMsg(), this.this$1.mReqType, this.this$1.mUserSigInfo);
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\oicq\wlogin_sdk\request\WtloginHelper$HelperThread$14.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */