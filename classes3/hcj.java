import android.view.animation.Interpolator;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public final class hcj
  implements Interpolator
{
  private static final float jdField_a_of_type_Float = 1.0F / (jdField_a_of_type_ArrayOfFloat.length - 1);
  private static final hcj jdField_a_of_type_Hcj;
  private static final float[] jdField_a_of_type_ArrayOfFloat;
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    jdField_a_of_type_Hcj = new hcj();
    jdField_a_of_type_ArrayOfFloat = new float[] { 0.0F, 2.0E-4F, 9.0E-4F, 0.0019F, 0.0036F, 0.0059F, 0.0086F, 0.0119F, 0.0157F, 0.0209F, 0.0257F, 0.0321F, 0.0392F, 0.0469F, 0.0566F, 0.0656F, 0.0768F, 0.0887F, 0.1033F, 0.1186F, 0.1349F, 0.1519F, 0.1696F, 0.1928F, 0.2121F, 0.237F, 0.2627F, 0.2892F, 0.3109F, 0.3386F, 0.3667F, 0.3952F, 0.4241F, 0.4474F, 0.4766F, 0.5F, 0.5234F, 0.5468F, 0.5701F, 0.5933F, 0.6134F, 0.6333F, 0.6531F, 0.6698F, 0.6891F, 0.7054F, 0.7214F, 0.7346F, 0.7502F, 0.763F, 0.7756F, 0.7879F, 0.8F, 0.8107F, 0.8212F, 0.8326F, 0.8415F, 0.8503F, 0.8588F, 0.8672F, 0.8754F, 0.8833F, 0.8911F, 0.8977F, 0.9041F, 0.9113F, 0.9165F, 0.9232F, 0.9281F, 0.9328F, 0.9382F, 0.9434F, 0.9476F, 0.9518F, 0.9557F, 0.9596F, 0.9632F, 0.9662F, 0.9695F, 0.9722F, 0.9753F, 0.9777F, 0.9805F, 0.9826F, 0.9847F, 0.9866F, 0.9884F, 0.9901F, 0.9917F, 0.9931F, 0.9944F, 0.9955F, 0.9964F, 0.9973F, 0.9981F, 0.9986F, 0.9992F, 0.9995F, 0.9998F, 1.0F, 1.0F };
  }
  
  public static final hcj a()
  {
    return jdField_a_of_type_Hcj;
  }
  
  public float getInterpolation(float paramFloat)
  {
    if (paramFloat >= 1.0F) {
      return 1.0F;
    }
    if (paramFloat <= 0.0F) {
      return 0.0F;
    }
    int i = Math.min((int)((jdField_a_of_type_ArrayOfFloat.length - 1) * paramFloat), jdField_a_of_type_ArrayOfFloat.length - 2);
    paramFloat = (paramFloat - i * jdField_a_of_type_Float) / jdField_a_of_type_Float;
    float f = jdField_a_of_type_ArrayOfFloat[i];
    return (jdField_a_of_type_ArrayOfFloat[(i + 1)] - jdField_a_of_type_ArrayOfFloat[i]) * paramFloat + f;
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\hcj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */