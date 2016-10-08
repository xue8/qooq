package com.tencent.mobileqq.app.automator.step;

import com.tencent.mobileqq.app.CardHandler;
import com.tencent.mobileqq.app.ConfigHandler;
import com.tencent.mobileqq.app.FriendListHandler;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.automator.AsyncStep;
import com.tencent.mobileqq.app.automator.Automator;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.subaccount.datamanager.SubAccountManager;
import com.tencent.mobileqq.util.FaceDrawable;
import java.util.ArrayList;
import java.util.Iterator;

public class GetSelfInfo
  extends AsyncStep
{
  public GetSelfInfo()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  protected int a()
  {
    FriendListHandler localFriendListHandler = (FriendListHandler)this.a.b.a(1);
    if (this.a.b.d)
    {
      localObject = (SubAccountManager)this.a.b.getManager(60);
      if (localObject == null) {
        break label170;
      }
    }
    label170:
    for (Object localObject = ((SubAccountManager)localObject).a();; localObject = null)
    {
      if ((localObject != null) && (((ArrayList)localObject).size() > 0))
      {
        this.a.b.d = false;
        localObject = ((ArrayList)localObject).iterator();
        while (((Iterator)localObject).hasNext()) {
          localFriendListHandler.b((String)((Iterator)localObject).next());
        }
      }
      localObject = (CardHandler)this.a.b.a(2);
      if (localObject != null) {
        ((CardHandler)localObject).d();
      }
      ((ConfigHandler)this.a.b.a(4)).c();
      FaceDrawable.a(this.a.b, this.a.b.getAccount(), (byte)3);
      return 7;
    }
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\com\tencent\mobileqq\app\automator\step\GetSelfInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */