import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import android.view.SurfaceHolder;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.troop.widget.MediaControllerX;
import com.tencent.mobileqq.troop.widget.VideoViewX;
import com.tencent.qphone.base.util.BaseApplication;
import com.tencent.qphone.base.util.QLog;
import com.tencent.util.VersionUtils;

public class vur
  implements MediaPlayer.OnPreparedListener
{
  public vur(VideoViewX paramVideoViewX)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onPrepared(MediaPlayer paramMediaPlayer)
  {
    VideoViewX.c(this.a, 2);
    VideoViewX.a(this.a, true);
    boolean bool;
    if (VersionUtils.b())
    {
      i = ((AudioManager)BaseApplication.getContext().getSystemService("audio")).requestAudioFocus(this.a.a, 3, 1);
      if (QLog.isColorLevel())
      {
        String str = VideoViewX.a(this.a);
        StringBuilder localStringBuilder = new StringBuilder().append("requestAudioFocus,result:");
        if (i != 1) {
          break label295;
        }
        bool = true;
        QLog.d(str, 2, bool);
      }
    }
    if (VideoViewX.a(this.a) != null) {
      VideoViewX.a(this.a).onPrepared(VideoViewX.a(this.a));
    }
    if (VideoViewX.a(this.a) != null) {
      VideoViewX.a(this.a).setEnabled(true);
    }
    VideoViewX.a(this.a, paramMediaPlayer.getVideoWidth());
    VideoViewX.b(this.a, paramMediaPlayer.getVideoHeight());
    int i = VideoViewX.d(this.a);
    if (i != 0) {
      this.a.a(i);
    }
    if ((VideoViewX.b(this.a) != 0) && (VideoViewX.c(this.a) != 0))
    {
      this.a.getHolder().setFixedSize(VideoViewX.b(this.a), VideoViewX.c(this.a));
      if ((VideoViewX.e(this.a) == VideoViewX.b(this.a)) && (VideoViewX.f(this.a) == VideoViewX.c(this.a)))
      {
        if (VideoViewX.g(this.a) != 3) {
          break label301;
        }
        this.a.d();
      }
    }
    label295:
    label301:
    while (VideoViewX.g(this.a) != 3)
    {
      do
      {
        return;
        bool = false;
        break;
      } while ((this.a.a()) || (i != 0) || (this.a.b() <= 0));
      return;
    }
    this.a.d();
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\vur.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */