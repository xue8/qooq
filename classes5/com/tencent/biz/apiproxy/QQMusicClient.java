package com.tencent.biz.apiproxy;

import android.os.Bundle;
import com.tencent.biz.troop.TroopMemberApiClient;
import com.tencent.biz.troop.TroopMemberApiClient.Callback;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public class QQMusicClient
{
  TroopMemberApiClient a;
  
  public QQMusicClient(TroopMemberApiClient paramTroopMemberApiClient)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.a = paramTroopMemberApiClient;
  }
  
  public void a()
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt(QQMusicService.a, 2);
    this.a.a(8, localBundle);
  }
  
  public void a(int paramInt)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt(QQMusicService.a, 5);
    localBundle.putInt("mode", paramInt);
    this.a.a(8, localBundle);
  }
  
  public void a(Bundle paramBundle)
  {
    if (paramBundle == null) {}
    TroopMemberApiClient.Callback localCallback;
    do
    {
      int i;
      do
      {
        return;
        i = paramBundle.getInt("seq", -1);
      } while (i == -1);
      localCallback = this.a.a(i);
    } while (localCallback == null);
    localCallback.a(paramBundle);
  }
  
  public void a(TroopMemberApiClient.Callback paramCallback)
  {
    if (paramCallback == null) {
      return;
    }
    Bundle localBundle = new Bundle();
    localBundle.putInt(QQMusicService.a, 4);
    localBundle.putInt("seq", this.a.a(paramCallback));
    this.a.a(8, localBundle);
  }
  
  public void a(String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt(QQMusicService.a, 1);
    localBundle.putString("music", paramString);
    this.a.a(8, localBundle);
  }
  
  public void b()
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt(QQMusicService.a, 3);
    this.a.a(8, localBundle);
  }
  
  public void b(TroopMemberApiClient.Callback paramCallback)
  {
    if (paramCallback == null) {
      return;
    }
    Bundle localBundle = new Bundle();
    localBundle.putInt(QQMusicService.a, 6);
    localBundle.putInt("seq", this.a.a(paramCallback));
    this.a.a(8, localBundle);
  }
  
  public void c()
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt(QQMusicService.a, 8);
    this.a.a(8, localBundle);
  }
  
  public void c(TroopMemberApiClient.Callback paramCallback)
  {
    if (paramCallback == null) {
      return;
    }
    Bundle localBundle = new Bundle();
    localBundle.putInt(QQMusicService.a, 7);
    localBundle.putInt("seq", this.a.a(paramCallback));
    this.a.a(8, localBundle);
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\com\tencent\biz\apiproxy\QQMusicClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */