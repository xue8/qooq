package com.tencent.av.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BlurMaskFilter;
import android.graphics.BlurMaskFilter.Blur;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import hbv;

public class SparkDot
  extends LinearLayout
{
  float jdField_a_of_type_Float;
  public int a;
  Bitmap jdField_a_of_type_AndroidGraphicsBitmap;
  public Handler a;
  public Runnable a;
  public boolean a;
  ImageView[] jdField_a_of_type_ArrayOfAndroidWidgetImageView;
  int jdField_b_of_type_Int;
  Bitmap jdField_b_of_type_AndroidGraphicsBitmap;
  private boolean jdField_b_of_type_Boolean;
  public int c;
  int d;
  public int e;
  public int f;
  public int g;
  
  public SparkDot(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SparkDot(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_AndroidGraphicsBitmap = null;
    this.jdField_b_of_type_AndroidGraphicsBitmap = null;
    this.jdField_a_of_type_Int = 400;
    this.jdField_b_of_type_Int = 40;
    this.c = 0;
    this.d = 0;
    this.jdField_a_of_type_Float = 0.0F;
    this.e = 6;
    this.f = -849386130;
    this.g = 1281320302;
    this.jdField_a_of_type_Boolean = true;
    this.jdField_a_of_type_ArrayOfAndroidWidgetImageView = null;
    this.jdField_a_of_type_AndroidOsHandler = new Handler();
    this.jdField_a_of_type_JavaLangRunnable = new hbv(this);
    setOrientation(0);
  }
  
  Bitmap a(int paramInt)
  {
    Bitmap localBitmap = Bitmap.createBitmap(this.jdField_b_of_type_Int, this.jdField_b_of_type_Int, Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    Paint localPaint = new Paint();
    localPaint.setAntiAlias(true);
    localPaint.setDither(true);
    localPaint.setColor(paramInt);
    localPaint.setStyle(Paint.Style.FILL);
    if (this.jdField_a_of_type_Boolean) {
      localPaint.setMaskFilter(new BlurMaskFilter(this.jdField_a_of_type_Float * 3.0F, BlurMaskFilter.Blur.SOLID));
    }
    localCanvas.drawOval(new RectF(this.jdField_a_of_type_Float * 3.0F, this.jdField_a_of_type_Float * 3.0F, this.jdField_a_of_type_Float * 10.0F, this.jdField_a_of_type_Float * 10.0F), localPaint);
    return localBitmap;
  }
  
  void a()
  {
    this.jdField_a_of_type_Float = getResources().getDisplayMetrics().scaledDensity;
    this.jdField_b_of_type_Int = ((int)(13.0F * this.jdField_a_of_type_Float));
    this.jdField_a_of_type_AndroidGraphicsBitmap = a(this.g);
    this.jdField_b_of_type_AndroidGraphicsBitmap = a(this.f);
    int i = 0;
    while (i < this.e)
    {
      ImageView localImageView = new ImageView(getContext());
      localImageView.setImageBitmap(this.jdField_a_of_type_AndroidGraphicsBitmap);
      localImageView.layout(this.jdField_b_of_type_Int * i, 0, this.jdField_b_of_type_Int * (i + 1), this.jdField_b_of_type_Int);
      this.jdField_a_of_type_ArrayOfAndroidWidgetImageView[i] = localImageView;
      super.addViewInLayout(localImageView, getChildCount(), generateDefaultLayoutParams());
      i += 1;
    }
  }
  
  public void a(int paramInt)
  {
    this.d = paramInt;
    this.jdField_a_of_type_ArrayOfAndroidWidgetImageView[paramInt].setImageBitmap(this.jdField_b_of_type_AndroidGraphicsBitmap);
    if (paramInt > 0)
    {
      this.jdField_a_of_type_ArrayOfAndroidWidgetImageView[(paramInt - 1)].setImageBitmap(this.jdField_a_of_type_AndroidGraphicsBitmap);
      return;
    }
    this.jdField_a_of_type_ArrayOfAndroidWidgetImageView[(this.e - 1)].setImageBitmap(this.jdField_a_of_type_AndroidGraphicsBitmap);
  }
  
  public void b()
  {
    this.jdField_b_of_type_Boolean = false;
    if (this.jdField_a_of_type_JavaLangRunnable != null)
    {
      this.jdField_a_of_type_AndroidOsHandler.removeCallbacks(this.jdField_a_of_type_JavaLangRunnable);
      this.jdField_a_of_type_ArrayOfAndroidWidgetImageView[this.d].setImageBitmap(this.jdField_a_of_type_AndroidGraphicsBitmap);
      this.d = 0;
      this.c = 0;
    }
  }
  
  public void c()
  {
    if (this.jdField_b_of_type_Boolean) {}
    do
    {
      return;
      this.jdField_b_of_type_Boolean = true;
    } while (this.jdField_a_of_type_JavaLangRunnable == null);
    this.jdField_a_of_type_AndroidOsHandler.removeCallbacks(this.jdField_a_of_type_JavaLangRunnable);
    this.jdField_a_of_type_AndroidOsHandler.postDelayed(this.jdField_a_of_type_JavaLangRunnable, this.jdField_a_of_type_Int);
  }
  
  public void d()
  {
    this.jdField_b_of_type_Boolean = false;
    if (this.jdField_a_of_type_JavaLangRunnable != null)
    {
      this.jdField_a_of_type_AndroidOsHandler.removeCallbacks(this.jdField_a_of_type_JavaLangRunnable);
      this.jdField_a_of_type_JavaLangRunnable = null;
    }
    this.jdField_a_of_type_AndroidOsHandler = null;
    if (this.jdField_a_of_type_AndroidGraphicsBitmap != null)
    {
      this.jdField_a_of_type_AndroidGraphicsBitmap.recycle();
      this.jdField_a_of_type_AndroidGraphicsBitmap = null;
    }
    if (this.jdField_b_of_type_AndroidGraphicsBitmap != null)
    {
      this.jdField_b_of_type_AndroidGraphicsBitmap.recycle();
      this.jdField_b_of_type_AndroidGraphicsBitmap = null;
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)getLayoutParams();
    localLayoutParams.width = (this.jdField_b_of_type_Int * this.e);
    setLayoutParams(localLayoutParams);
  }
  
  public void setDotCount(int paramInt)
  {
    this.e = paramInt;
    this.jdField_a_of_type_ArrayOfAndroidWidgetImageView = new ImageView[this.e];
    a();
    this.jdField_a_of_type_AndroidOsHandler.postDelayed(this.jdField_a_of_type_JavaLangRunnable, this.jdField_a_of_type_Int);
  }
  
  public void setDuration(int paramInt)
  {
    this.jdField_a_of_type_Int = paramInt;
  }
  
  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    if (paramInt == 0)
    {
      c();
      return;
    }
    b();
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\tencent\av\utils\SparkDot.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */