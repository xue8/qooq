package com.tencent.mobileqq.activity.aio.item;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public class ApolloItemBuilder$VerticalImageSpan
  extends ImageSpan
{
  public ApolloItemBuilder$VerticalImageSpan(ApolloItemBuilder paramApolloItemBuilder, Drawable paramDrawable)
  {
    super(paramDrawable);
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void draw(Canvas paramCanvas, CharSequence paramCharSequence, int paramInt1, int paramInt2, float paramFloat, int paramInt3, int paramInt4, int paramInt5, Paint paramPaint)
  {
    paramCharSequence = getDrawable();
    paramCanvas.save();
    paramCanvas.translate(paramFloat, (paramInt5 - paramInt3 - paramCharSequence.getBounds().bottom) / 2 + paramInt3);
    paramCharSequence.draw(paramCanvas);
    paramCanvas.restore();
  }
  
  public int getSize(Paint paramPaint, CharSequence paramCharSequence, int paramInt1, int paramInt2, Paint.FontMetricsInt paramFontMetricsInt)
  {
    paramCharSequence = getDrawable().getBounds();
    if (paramFontMetricsInt != null)
    {
      paramPaint = paramPaint.getFontMetricsInt();
      paramInt2 = paramPaint.bottom - paramPaint.top;
      int i = paramCharSequence.bottom - paramCharSequence.top;
      paramInt1 = i / 2 - paramInt2 / 4;
      i /= 2;
      paramInt2 = paramInt2 / 4 + i;
      paramFontMetricsInt.ascent = (-paramInt2);
      paramFontMetricsInt.top = (-paramInt2);
      paramFontMetricsInt.bottom = paramInt1;
      paramFontMetricsInt.descent = paramInt1;
    }
    return paramCharSequence.right;
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\com\tencent\mobileqq\activity\aio\item\ApolloItemBuilder$VerticalImageSpan.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */