import android.os.Bundle;
import com.tencent.mobileqq.app.ConfigHandler;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.qipc.QIPCModule;
import com.tencent.open.base.LogUtility;
import com.tencent.open.downloadnew.DownloaderGetCodeServer;
import eipc.EIPCResult;
import java.util.Map;

public class wwj
  extends QIPCModule
{
  public wwj(DownloaderGetCodeServer paramDownloaderGetCodeServer, String paramString)
  {
    super(paramString);
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public EIPCResult onCall(String paramString, Bundle paramBundle, int paramInt)
  {
    LogUtility.c("DownloaderWriteCodeIPC", "onCall action|" + paramString + " params|" + paramBundle + " callbackId|" + paramInt);
    Object localObject = DownloaderGetCodeServer.a(this.a);
    if (localObject == null) {
      LogUtility.c("DownloaderWriteCodeIPC", "onCall action but appInterface is null");
    }
    String str;
    int i;
    do
    {
      do
      {
        return null;
      } while ((!"DownloaderWriteCodeIPC_Action__GetCode".equals(paramString)) || (paramBundle == null));
      str = paramBundle.getString("PackageName");
      i = paramBundle.getInt("VersionCode");
      LogUtility.c("DownloaderWriteCodeIPC", "onCall action|" + paramString + " packageName|" + str + " versionCode|" + i);
    } while (str == null);
    ((QQAppInterface)localObject).c(DownloaderGetCodeServer.a(this.a));
    paramString = (ConfigHandler)((QQAppInterface)localObject).a(4);
    localObject = str + "_" + i;
    paramBundle.putInt("CallbackId", paramInt);
    paramBundle = new Bundle(paramBundle);
    DownloaderGetCodeServer.a(this.a).put(localObject, paramBundle);
    paramString.a(str, i, (String)localObject);
    return null;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\wwj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */