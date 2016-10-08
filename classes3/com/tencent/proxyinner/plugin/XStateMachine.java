package com.tencent.proxyinner.plugin;

import com.tencent.proxyinner.log.XLog;

public class XStateMachine
{
  private static final String TAG = "TXProxy|XStateMachine";
  int mCurrentFlag = 0;
  int mCurrentStatus = 0;
  
  public int getStatus()
  {
    return this.mCurrentStatus;
  }
  
  public int getmCurrentFlag()
  {
    return this.mCurrentFlag;
  }
  
  protected boolean gotoStatus(int paramInt1, int paramInt2)
  {
    if ((this.mCurrentStatus == paramInt1) && (paramInt2 == 0))
    {
      XLog.i("TXProxy|XStateMachine", "no need to gotoStatus");
      return false;
    }
    XLog.i("TXProxy|XStateMachine", "插件状态机gotoStatus: " + toString(paramInt1) + "(" + paramInt1 + ")");
    this.mCurrentStatus = paramInt1;
    this.mCurrentFlag = paramInt2;
    return true;
  }
  
  protected String toString(int paramInt)
  {
    if (paramInt == 0) {
      return "idle";
    }
    if (paramInt == 1) {
      return "downloading";
    }
    if (paramInt == 2) {
      return "downloaded";
    }
    if (paramInt == 5) {
      return "loading";
    }
    if (paramInt == 6) {
      return "loaded";
    }
    if (paramInt == 7) {
      return "starting";
    }
    if (paramInt == 8) {
      return "started";
    }
    if (paramInt == 3) {
      return "安装中";
    }
    if (paramInt == 4) {
      return "安装完成";
    }
    return "unknown";
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\tencent\proxyinner\plugin\XStateMachine.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */