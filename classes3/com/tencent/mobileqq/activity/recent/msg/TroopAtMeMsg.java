package com.tencent.mobileqq.activity.recent.msg;

import android.content.Context;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public class TroopAtMeMsg
  extends TroopAtMsg
{
  public TroopAtMeMsg(Context paramContext)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.a = paramContext.getString(2131364624);
    this.b = this.a;
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\tencent\mobileqq\activity\recent\msg\TroopAtMeMsg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */