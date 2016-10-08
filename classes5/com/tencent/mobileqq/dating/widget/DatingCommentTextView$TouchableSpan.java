package com.tencent.mobileqq.dating.widget;

import android.content.res.ColorStateList;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mobileqq.freshnews.BlockableEditTextView.BlockAble;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public class DatingCommentTextView$TouchableSpan
  extends ClickableSpan
  implements BlockableEditTextView.BlockAble
{
  private ColorStateList jdField_a_of_type_AndroidContentResColorStateList;
  private View.OnClickListener jdField_a_of_type_AndroidViewView$OnClickListener;
  private boolean jdField_a_of_type_Boolean;
  private ColorStateList b;
  
  public DatingCommentTextView$TouchableSpan(View.OnClickListener paramOnClickListener, int paramInt)
  {
    this(paramOnClickListener, ColorStateList.valueOf(paramInt), null);
  }
  
  public DatingCommentTextView$TouchableSpan(View.OnClickListener paramOnClickListener, int paramInt1, int paramInt2)
  {
    this(paramOnClickListener, ColorStateList.valueOf(paramInt1), ColorStateList.valueOf(paramInt2));
  }
  
  public DatingCommentTextView$TouchableSpan(View.OnClickListener paramOnClickListener, ColorStateList paramColorStateList)
  {
    this(paramOnClickListener, paramColorStateList, null);
  }
  
  public DatingCommentTextView$TouchableSpan(View.OnClickListener paramOnClickListener, ColorStateList paramColorStateList1, ColorStateList paramColorStateList2)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_AndroidViewView$OnClickListener = paramOnClickListener;
    this.jdField_a_of_type_AndroidContentResColorStateList = paramColorStateList1;
    this.b = paramColorStateList2;
  }
  
  public void a(View.OnClickListener paramOnClickListener)
  {
    this.jdField_a_of_type_AndroidViewView$OnClickListener = paramOnClickListener;
  }
  
  public void a(boolean paramBoolean)
  {
    this.jdField_a_of_type_Boolean = paramBoolean;
  }
  
  public void onClick(View paramView)
  {
    if (this.jdField_a_of_type_AndroidViewView$OnClickListener != null) {
      this.jdField_a_of_type_AndroidViewView$OnClickListener.onClick(paramView);
    }
  }
  
  public void updateDrawState(TextPaint paramTextPaint)
  {
    super.updateDrawState(paramTextPaint);
    paramTextPaint.setUnderlineText(false);
    if (this.jdField_a_of_type_AndroidContentResColorStateList != null) {
      if (this.jdField_a_of_type_Boolean)
      {
        i = this.jdField_a_of_type_AndroidContentResColorStateList.getColorForState(new int[] { 16842919 }, 0);
        paramTextPaint.setColor(i);
        label46:
        if (this.b == null) {
          break label122;
        }
        if (!this.jdField_a_of_type_Boolean) {
          break label107;
        }
      }
    }
    label107:
    for (int i = this.b.getColorForState(new int[] { 16842919 }, 0);; i = this.b.getColorForState(new int[0], 0))
    {
      paramTextPaint.bgColor = i;
      return;
      i = this.jdField_a_of_type_AndroidContentResColorStateList.getColorForState(new int[0], 0);
      break;
      paramTextPaint.setColor(-16777216);
      break label46;
    }
    label122:
    paramTextPaint.bgColor = 0;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\com\tencent\mobileqq\dating\widget\DatingCommentTextView$TouchableSpan.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */