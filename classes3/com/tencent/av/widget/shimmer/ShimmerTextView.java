package com.tencent.av.widget.shimmer;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.widget.TextView;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import hch;
import hci;

public class ShimmerTextView
  extends TextView
  implements IShimmer
{
  public int a;
  private ShimmerViewHelper a;
  
  public ShimmerTextView(Context paramContext)
  {
    super(paramContext);
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_Int = 0;
    this.jdField_a_of_type_ComTencentAvWidgetShimmerShimmerViewHelper = new ShimmerViewHelper(this, getPaint(), null);
    this.jdField_a_of_type_ComTencentAvWidgetShimmerShimmerViewHelper.a(getCurrentTextColor());
    ViewCompat.setAccessibilityDelegate(this, new hch(this));
  }
  
  public ShimmerTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.jdField_a_of_type_Int = 0;
    this.jdField_a_of_type_ComTencentAvWidgetShimmerShimmerViewHelper = new ShimmerViewHelper(this, getPaint(), paramAttributeSet);
    this.jdField_a_of_type_ComTencentAvWidgetShimmerShimmerViewHelper.a(getCurrentTextColor());
    ViewCompat.setAccessibilityDelegate(this, new hch(this));
  }
  
  public ShimmerTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.jdField_a_of_type_Int = 0;
    this.jdField_a_of_type_ComTencentAvWidgetShimmerShimmerViewHelper = new ShimmerViewHelper(this, getPaint(), paramAttributeSet);
    this.jdField_a_of_type_ComTencentAvWidgetShimmerShimmerViewHelper.a(getCurrentTextColor());
    ViewCompat.setAccessibilityDelegate(this, new hch(this));
  }
  
  public float a()
  {
    return this.jdField_a_of_type_ComTencentAvWidgetShimmerShimmerViewHelper.a();
  }
  
  public int a()
  {
    return this.jdField_a_of_type_ComTencentAvWidgetShimmerShimmerViewHelper.a();
  }
  
  public boolean a()
  {
    return this.jdField_a_of_type_ComTencentAvWidgetShimmerShimmerViewHelper.a();
  }
  
  public int b()
  {
    return this.jdField_a_of_type_ComTencentAvWidgetShimmerShimmerViewHelper.b();
  }
  
  public boolean b()
  {
    return this.jdField_a_of_type_ComTencentAvWidgetShimmerShimmerViewHelper.b();
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    setShimmering(true);
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    setShimmering(false);
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    if (this.jdField_a_of_type_ComTencentAvWidgetShimmerShimmerViewHelper != null) {
      this.jdField_a_of_type_ComTencentAvWidgetShimmerShimmerViewHelper.b();
    }
    super.onDraw(paramCanvas);
    if (a()) {
      postDelayed(new hci(this), 40L);
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.jdField_a_of_type_ComTencentAvWidgetShimmerShimmerViewHelper != null) {
      this.jdField_a_of_type_ComTencentAvWidgetShimmerShimmerViewHelper.a();
    }
  }
  
  public void setAnimationSetupCallback(ShimmerViewHelper.AnimationSetupCallback paramAnimationSetupCallback)
  {
    this.jdField_a_of_type_ComTencentAvWidgetShimmerShimmerViewHelper.a(paramAnimationSetupCallback);
  }
  
  public void setGradientX(float paramFloat)
  {
    this.jdField_a_of_type_ComTencentAvWidgetShimmerShimmerViewHelper.a(paramFloat);
  }
  
  public void setPrimaryColor(int paramInt)
  {
    this.jdField_a_of_type_ComTencentAvWidgetShimmerShimmerViewHelper.a(paramInt);
  }
  
  public void setReflectionColor(int paramInt)
  {
    this.jdField_a_of_type_ComTencentAvWidgetShimmerShimmerViewHelper.b(paramInt);
  }
  
  public void setShimmering(boolean paramBoolean)
  {
    this.jdField_a_of_type_ComTencentAvWidgetShimmerShimmerViewHelper.a(paramBoolean);
    super.postInvalidate();
  }
  
  public void setTextColor(int paramInt)
  {
    super.setTextColor(paramInt);
    if (this.jdField_a_of_type_ComTencentAvWidgetShimmerShimmerViewHelper != null) {
      this.jdField_a_of_type_ComTencentAvWidgetShimmerShimmerViewHelper.a(getCurrentTextColor());
    }
  }
  
  public void setTextColor(ColorStateList paramColorStateList)
  {
    super.setTextColor(paramColorStateList);
    if (this.jdField_a_of_type_ComTencentAvWidgetShimmerShimmerViewHelper != null) {
      this.jdField_a_of_type_ComTencentAvWidgetShimmerShimmerViewHelper.a(getCurrentTextColor());
    }
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\tencent\av\widget\shimmer\ShimmerTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */