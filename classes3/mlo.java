import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mobileqq.activity.SoundAndVibrateActivity;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.msf.sdk.SettingCloneUtil;

public class mlo
  implements View.OnClickListener
{
  public mlo(SoundAndVibrateActivity paramSoundAndVibrateActivity)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onClick(View paramView)
  {
    this.a.a(0);
    SettingCloneUtil.writeValueForInt(this.a, this.a.app.a(), "sound_type", "qqsetting_notify_soundtype_key", 2131165184);
    if (this.a.a().booleanValue())
    {
      this.a.b();
      this.a.a(Uri.parse("android.resource://" + this.a.getApplicationContext().getPackageName() + "/" + 2131165184));
    }
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\mlo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */