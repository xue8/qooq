package oicq.wlogin_sdk.request;

import oicq.wlogin_sdk.tools.ErrMsg;
import oicq.wlogin_sdk.tools.util;

class WtloginHelper$HelperThread$2
  implements Runnable
{
  WtloginHelper$HelperThread$2(WtloginHelper.HelperThread paramHelperThread, int paramInt1, int paramInt2) {}
  
  public void run()
  {
    WtloginHelper.HelperThread.access$500(this.this$1);
    if (this.val$cancel != 0) {
      return;
    }
    ErrMsg localErrMsg = t.b(this.this$1.mUserSigInfo._seqence)._last_err_msg;
    if (WtloginHelper.access$100(this.this$1.mHelper) == null)
    {
      util.LOGW("login helper listener is null", this.this$1.mUserAccount);
      return;
    }
    if (this.this$1.mDwSubAppidList == null)
    {
      if (this.this$1.mIsSmslogin)
      {
        WtloginHelper.access$100(this.this$1.mHelper).OnGetStViaSMSVerifyLogin(this.this$1.mUserAccount, this.this$1.mDwAppid, this.this$1.mDwMainSigMap, this.this$1.mDwSubDstAppid, this.this$1.mUserSigInfo, this.val$ret, localErrMsg);
        return;
      }
      WtloginHelper.access$100(this.this$1.mHelper).OnGetStWithPasswd(this.this$1.mUserAccount, this.this$1.mDwAppid, this.this$1.mDwMainSigMap, this.this$1.mDwSubDstAppid, this.this$1.mUserPasswd, this.this$1.mUserSigInfo, this.val$ret, localErrMsg);
      return;
    }
    if (this.this$1.mIsSmslogin)
    {
      WtloginHelper.access$100(this.this$1.mHelper).OnGetStViaSMSVerifyLogin(this.this$1.mUserAccount, this.this$1.mDwAppid, this.this$1.mDwMainSigMap, this.this$1.mDwSubDstAppid, this.this$1.mDwSubAppidList, this.this$1.mUserSigInfo, this.this$1.mST, this.val$ret, localErrMsg);
      return;
    }
    WtloginHelper.access$100(this.this$1.mHelper).OnGetStWithPasswd(this.this$1.mUserAccount, this.this$1.mDwAppid, this.this$1.mDwMainSigMap, this.this$1.mDwSubDstAppid, this.this$1.mDwSubAppidList, this.this$1.mUserPasswd, this.this$1.mUserSigInfo, this.this$1.mST, this.val$ret, localErrMsg);
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\oicq\wlogin_sdk\request\WtloginHelper$HelperThread$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */