package cooperation.dingdong;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public class DingdongMsgItemTitleImageView
  extends ImageView
{
  private Bitmap jdField_a_of_type_AndroidGraphicsBitmap;
  private ColorMatrix jdField_a_of_type_AndroidGraphicsColorMatrix;
  private ColorMatrixColorFilter jdField_a_of_type_AndroidGraphicsColorMatrixColorFilter;
  private Paint jdField_a_of_type_AndroidGraphicsPaint;
  private boolean jdField_a_of_type_Boolean;
  private float[] jdField_a_of_type_ArrayOfFloat;
  
  public DingdongMsgItemTitleImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_ArrayOfFloat = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F };
    invalidate();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (!this.jdField_a_of_type_Boolean)
    {
      buildDrawingCache();
      this.jdField_a_of_type_AndroidGraphicsBitmap = getDrawingCache();
      this.jdField_a_of_type_AndroidGraphicsPaint = new Paint();
      this.jdField_a_of_type_AndroidGraphicsColorMatrix = new ColorMatrix();
      this.jdField_a_of_type_AndroidGraphicsColorMatrix.setSaturation(0.0F);
      this.jdField_a_of_type_AndroidGraphicsColorMatrix.set(this.jdField_a_of_type_ArrayOfFloat);
      this.jdField_a_of_type_AndroidGraphicsColorMatrixColorFilter = new ColorMatrixColorFilter(this.jdField_a_of_type_AndroidGraphicsColorMatrix);
      this.jdField_a_of_type_AndroidGraphicsPaint.setColorFilter(this.jdField_a_of_type_AndroidGraphicsColorMatrixColorFilter);
      this.jdField_a_of_type_Boolean = true;
    }
    paramCanvas.drawBitmap(this.jdField_a_of_type_AndroidGraphicsBitmap, 0.0F, 0.0F, this.jdField_a_of_type_AndroidGraphicsPaint);
  }
  
  public void setReplaceColor(int paramInt)
  {
    this.jdField_a_of_type_ArrayOfFloat = new float[] { 0.0F, 0.0F, 0.0F, 0.0F, Color.red(paramInt), 0.0F, 0.0F, 0.0F, 0.0F, Color.green(paramInt), 0.0F, 0.0F, 0.0F, 0.0F, Color.blue(paramInt), 0.0F, 0.0F, 0.0F, 1.0F, 0.0F };
    this.jdField_a_of_type_Boolean = false;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\cooperation\dingdong\DingdongMsgItemTitleImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */