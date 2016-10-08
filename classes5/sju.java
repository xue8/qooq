import android.os.Handler;
import com.tencent.mobileqq.filemanager.util.UniformDownloader;
import com.tencent.mobileqq.filemanager.util.UniformDownloaderAppBabySdk;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.qphone.base.util.QLog;
import com.tencent.tmassistant.aidl.TMAssistantDownloadTaskInfo;
import com.tencent.tmdownloader.ITMAssistantDownloadClientListener;
import com.tencent.tmdownloader.TMAssistantDownloadClient;

public class sju
  implements ITMAssistantDownloadClientListener
{
  public sju(UniformDownloaderAppBabySdk paramUniformDownloaderAppBabySdk)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void OnDownloadSDKTaskProgressChanged(TMAssistantDownloadClient paramTMAssistantDownloadClient, String paramString, long paramLong1, long paramLong2)
  {
    UniformDownloaderAppBabySdk.b(this.a);
    if (!UniformDownloaderAppBabySdk.a(this.a).post(new sjv(this, paramString, paramLong1, paramLong2))) {
      QLog.e(UniformDownloaderAppBabySdk.a, 1, "[UniformDL] OnDownloadSDKTaskProgressChanged. thread error!!");
    }
  }
  
  public void OnDownloadSDKTaskStateChanged(TMAssistantDownloadClient paramTMAssistantDownloadClient, String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    int i = 0;
    int j = 0;
    Object localObject2 = null;
    QLog.i(UniformDownloaderAppBabySdk.a, 1, "[UniformDL] inPDownloadSDKTaskStateChanged  state:[" + paramInt1 + "] errcode:[" + paramInt2 + "] errStr:[" + paramString2 + "] url:[" + paramString1 + "]");
    String str = "";
    Object localObject1;
    if ((paramTMAssistantDownloadClient != null) && (4 == paramInt1))
    {
      try
      {
        localObject1 = paramTMAssistantDownloadClient.getDownloadTaskState(paramString1);
        i = 0;
        paramTMAssistantDownloadClient = str;
      }
      catch (Exception paramTMAssistantDownloadClient)
      {
        do
        {
          for (;;)
          {
            paramTMAssistantDownloadClient.printStackTrace();
            paramTMAssistantDownloadClient = UniformDownloader.a(22);
            localObject1 = null;
            j = 22;
            i = 1;
            continue;
            localObject1 = ((TMAssistantDownloadTaskInfo)localObject1).mSavePath;
          }
        } while (UniformDownloaderAppBabySdk.a(this.a).post(new sjx(this, paramString1, paramInt1, paramInt2, paramString2, (String)localObject1)));
        QLog.e(UniformDownloaderAppBabySdk.a, 1, "[UniformDL] OnDownloadSDKTaskProgressChanged. thread error!!");
        return;
      }
      if (localObject1 == null) {
        localObject1 = localObject2;
      }
    }
    for (;;)
    {
      UniformDownloaderAppBabySdk.b(this.a);
      if (i != 0)
      {
        if (!UniformDownloaderAppBabySdk.a(this.a).post(new sjw(this, paramString1, j, paramTMAssistantDownloadClient))) {
          QLog.e(UniformDownloaderAppBabySdk.a, 1, "[UniformDL] OnDownloadSDKTaskProgressChanged. haveErr and thread error!!");
        }
        return;
      }
      localObject1 = null;
      paramTMAssistantDownloadClient = "";
      j = 0;
    }
  }
  
  public void OnDwonloadSDKServiceInvalid(TMAssistantDownloadClient paramTMAssistantDownloadClient)
  {
    QLog.e(UniformDownloaderAppBabySdk.a, 1, "[UniformDL] ABSdkdownload service invalid ");
    UniformDownloaderAppBabySdk.b(this.a);
    if (!UniformDownloaderAppBabySdk.a(this.a).post(new sjy(this))) {
      QLog.e(UniformDownloaderAppBabySdk.a, 1, "[UniformDL] OnDwonloadSDKServiceInvalid. thread error!!");
    }
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\sju.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */