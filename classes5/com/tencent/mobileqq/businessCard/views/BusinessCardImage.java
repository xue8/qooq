package com.tencent.mobileqq.businessCard.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.tencent.image.URLImageView;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public class BusinessCardImage
  extends URLImageView
{
  protected int a;
  protected Paint a;
  protected int b;
  
  public BusinessCardImage(Context paramContext)
  {
    super(paramContext);
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    a();
  }
  
  public BusinessCardImage(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }
  
  public BusinessCardImage(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a();
  }
  
  protected void a()
  {
    this.jdField_a_of_type_AndroidGraphicsPaint = new Paint(1);
    this.jdField_a_of_type_AndroidGraphicsPaint.setColor(getResources().getColor(2131427361));
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    paramCanvas.drawRect(0.0F, 0.0F, this.jdField_a_of_type_Int, this.b, this.jdField_a_of_type_AndroidGraphicsPaint);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    this.jdField_a_of_type_Int = getMeasuredWidth();
    this.b = (this.jdField_a_of_type_Int * 9 / 16);
    setMeasuredDimension(this.jdField_a_of_type_Int, this.b);
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\com\tencent\mobileqq\businessCard\views\BusinessCardImage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */