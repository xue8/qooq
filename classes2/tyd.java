import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.Animation;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.ptt.LSRecordAnimations.LSRecordAnimationCallback;
import com.tencent.mobileqq.ptt.LSRecordPanel;
import com.tencent.qphone.base.util.QLog;

public class tyd
  extends LSRecordAnimations.LSRecordAnimationCallback
{
  public tyd(LSRecordPanel paramLSRecordPanel)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    if (QLog.isDevelopLevel()) {
      QLog.d("LsRecord", 4, "LS startCloseAnimation onAnimationEnd");
    }
    if (LSRecordPanel.a(this.a))
    {
      if (paramAnimation == this.a.b) {
        LSRecordPanel.a(this.a);
      }
      this.a.a = null;
      this.a.b = null;
      paramAnimation = (RelativeLayout.LayoutParams)LSRecordPanel.a(this.a).getLayoutParams();
      int i = (int)(this.a.getResources().getDisplayMetrics().density * 4.0F);
      paramAnimation.height -= i;
      paramAnimation.width -= i;
      int j = paramAnimation.rightMargin;
      paramAnimation.rightMargin = (i / 2 + j);
      LSRecordPanel.a(this.a, false);
      LSRecordPanel.a(this.a).setLayoutParams(paramAnimation);
    }
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\tyd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */