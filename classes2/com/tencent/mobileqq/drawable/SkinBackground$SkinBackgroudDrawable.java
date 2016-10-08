package com.tencent.mobileqq.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public class SkinBackground$SkinBackgroudDrawable
  extends BitmapDrawable
{
  private Bitmap jdField_a_of_type_AndroidGraphicsBitmap;
  private final Paint jdField_a_of_type_AndroidGraphicsPaint;
  private Rect jdField_a_of_type_AndroidGraphicsRect;
  
  public SkinBackground$SkinBackgroudDrawable(SkinBackground paramSkinBackground, Resources paramResources, Bitmap paramBitmap)
  {
    super(paramResources, paramBitmap);
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_AndroidGraphicsPaint = new Paint(2);
    this.jdField_a_of_type_AndroidGraphicsRect = new Rect();
    this.jdField_a_of_type_AndroidGraphicsBitmap = paramBitmap;
  }
  
  protected Rect a(Rect paramRect)
  {
    int i = getBitmap().getHeight();
    int k = getBitmap().getWidth();
    if (paramRect == null) {
      return new Rect(0, 0, k, i);
    }
    if (paramRect.height() / paramRect.width() >= i / k)
    {
      int j = paramRect.width() * i / paramRect.height();
      k = (int)((k - j) * 0.5D);
      return new Rect(k, 0, j + k, i);
    }
    return new Rect(0, 0, k, paramRect.height() * k / paramRect.width());
  }
  
  public void draw(Canvas paramCanvas)
  {
    paramCanvas.drawBitmap(this.jdField_a_of_type_AndroidGraphicsBitmap, this.jdField_a_of_type_AndroidGraphicsRect, getBounds(), this.jdField_a_of_type_AndroidGraphicsPaint);
  }
  
  public int getOpacity()
  {
    return 0;
  }
  
  protected void onBoundsChange(Rect paramRect)
  {
    this.jdField_a_of_type_AndroidGraphicsRect = a(getBounds());
  }
  
  public void setAlpha(int paramInt) {}
  
  public void setColorFilter(ColorFilter paramColorFilter) {}
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\mobileqq\drawable\SkinBackground$SkinBackgroudDrawable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */