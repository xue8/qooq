package com.tencent.mobileqq.vaswebviewplugin;

import Wallet.AuthCodeItem;
import Wallet.AuthCodeRsp;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.msf.core.NetConnInfoCenter;
import com.tencent.mobileqq.utils.FileUtils;
import java.io.File;
import java.util.ArrayList;

class QWalletCommonJsPlugin$1
  implements Runnable
{
  QWalletCommonJsPlugin$1(QWalletCommonJsPlugin paramQWalletCommonJsPlugin, String paramString)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void run()
  {
    for (;;)
    {
      int i;
      try
      {
        Object localObject1 = FileUtils.a(this.val$cacheFileName);
        if (localObject1 == null)
        {
          QWalletCommonJsPlugin.access$000(this.this$0);
          return;
        }
        localObject2 = new JceInputStream((byte[])localObject1);
        localObject1 = new AuthCodeRsp();
        ((AuthCodeRsp)localObject1).readFrom((JceInputStream)localObject2);
        long l = NetConnInfoCenter.getServerTimeMillis() / 1000L;
        if ((localObject1 == null) || (((AuthCodeRsp)localObject1).items == null)) {
          break;
        }
        i = 0;
        if (i >= ((AuthCodeRsp)localObject1).items.size()) {
          break;
        }
        if ((((AuthCodeRsp)localObject1).items.get(i) == null) || (((AuthCodeItem)((AuthCodeRsp)localObject1).items.get(i)).appid != QWalletCommonJsPlugin.access$100(this.this$0)) || (((AuthCodeItem)((AuthCodeRsp)localObject1).items.get(i)).expireTime <= l)) {
          break label226;
        }
        this.this$0.doAuthCodeCallback(QWalletCommonJsPlugin.access$200(this.this$0), (AuthCodeItem)((AuthCodeRsp)localObject1).items.get(i));
        ((AuthCodeRsp)localObject1).items.remove(i);
        if (((AuthCodeRsp)localObject1).items.size() <= 0)
        {
          new File(this.val$cacheFileName).delete();
          return;
        }
      }
      catch (Exception localException)
      {
        QWalletCommonJsPlugin.access$000(this.this$0);
        return;
      }
      Object localObject2 = new JceOutputStream();
      localException.writeTo((JceOutputStream)localObject2);
      FileUtils.a(((JceOutputStream)localObject2).toByteArray(), this.val$cacheFileName);
      return;
      label226:
      i += 1;
    }
    QWalletCommonJsPlugin.access$000(this.this$0);
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\mobileqq\vaswebviewplugin\QWalletCommonJsPlugin$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */