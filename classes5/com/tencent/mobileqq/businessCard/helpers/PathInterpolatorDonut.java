package com.tencent.mobileqq.businessCard.helpers;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public class PathInterpolatorDonut
  implements Interpolator
{
  static final float jdField_a_of_type_Float = 0.002F;
  final float[] jdField_a_of_type_ArrayOfFloat;
  final float[] b;
  
  public PathInterpolatorDonut(float paramFloat1, float paramFloat2)
  {
    this(a(paramFloat1, paramFloat2));
  }
  
  public PathInterpolatorDonut(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    this(a(paramFloat1, paramFloat2, paramFloat3, paramFloat4));
  }
  
  public PathInterpolatorDonut(Path paramPath)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    paramPath = new PathMeasure(paramPath, false);
    float f = paramPath.getLength();
    int j = (int)(f / 0.002F) + 1;
    this.a = new float[j];
    this.b = new float[j];
    float[] arrayOfFloat = new float[2];
    int i = 0;
    while (i < j)
    {
      paramPath.getPosTan(i * f / (j - 1), arrayOfFloat, null);
      this.a[i] = arrayOfFloat[0];
      this.b[i] = arrayOfFloat[1];
      i += 1;
    }
  }
  
  private static Path a(float paramFloat1, float paramFloat2)
  {
    Path localPath = new Path();
    localPath.moveTo(0.0F, 0.0F);
    localPath.quadTo(paramFloat1, paramFloat2, 1.0F, 1.0F);
    return localPath;
  }
  
  private static Path a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    Path localPath = new Path();
    localPath.moveTo(0.0F, 0.0F);
    localPath.cubicTo(paramFloat1, paramFloat2, paramFloat3, paramFloat4, 1.0F, 1.0F);
    return localPath;
  }
  
  public float getInterpolation(float paramFloat)
  {
    float f = 1.0F;
    if (paramFloat <= 0.0F) {
      f = 0.0F;
    }
    while (paramFloat >= 1.0F) {
      return f;
    }
    int j = 0;
    int i = this.a.length - 1;
    if (i - j > 1)
    {
      int k = (j + i) / 2;
      if (paramFloat < this.a[k]) {
        i = k;
      }
      for (;;)
      {
        break;
        j = k;
      }
    }
    f = this.a[i] - this.a[j];
    if (f == 0.0F) {
      return this.b[j];
    }
    paramFloat = (paramFloat - this.a[j]) / f;
    f = this.b[j];
    return paramFloat * (this.b[i] - f) + f;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\com\tencent\mobileqq\businessCard\helpers\PathInterpolatorDonut.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */