import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.tencent.mobileqq.freshnews.FreshNewsDetailActivity;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public class soo
  implements ValueAnimator.AnimatorUpdateListener
{
  public soo(FreshNewsDetailActivity paramFreshNewsDetailActivity)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    int i = ((Integer)paramValueAnimator.getAnimatedValue()).intValue();
    paramValueAnimator = this.a.c.getLayoutParams();
    paramValueAnimator.height = i;
    this.a.c.setLayoutParams(paramValueAnimator);
    this.a.c.invalidate();
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\soo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */