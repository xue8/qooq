import android.view.animation.Interpolator;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public class ttn
  implements Interpolator
{
  public ttn()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public float getInterpolation(float paramFloat)
  {
    if (paramFloat < 0.2094D) {
      return (float)(-34.0D * (paramFloat - 0.18D) * (paramFloat - 0.18D) + 1.08D);
    }
    if (paramFloat < 0.404D) {
      return (float)(5.9D * (paramFloat - 0.34D) * (paramFloat - 0.34D) + 0.95D);
    }
    if (paramFloat < 0.6045D) {
      return (float)(-3.0D * (paramFloat - 0.53D) * (paramFloat - 0.53D) + 1.02D);
    }
    if (paramFloat < 0.8064D) {
      return (float)((paramFloat - 0.72D) * (paramFloat - 0.72D) + 0.99D);
    }
    return (float)(-0.3D * (paramFloat - 0.915D) * (paramFloat - 0.915D) + 1.001D);
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\ttn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */