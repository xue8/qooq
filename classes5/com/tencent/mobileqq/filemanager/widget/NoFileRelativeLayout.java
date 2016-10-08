package com.tencent.mobileqq.filemanager.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public class NoFileRelativeLayout
  extends RelativeLayout
{
  int jdField_a_of_type_Int = 0;
  Context jdField_a_of_type_AndroidContentContext;
  ImageView jdField_a_of_type_AndroidWidgetImageView;
  RelativeLayout jdField_a_of_type_AndroidWidgetRelativeLayout = null;
  TextView jdField_a_of_type_AndroidWidgetTextView;
  int b = 0;
  
  public NoFileRelativeLayout(Context paramContext)
  {
    this(paramContext, null);
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public NoFileRelativeLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public NoFileRelativeLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    ((LayoutInflater)paramContext.getSystemService("layout_inflater")).inflate(2130903999, this);
    this.jdField_a_of_type_AndroidWidgetRelativeLayout = ((RelativeLayout)findViewById(2131300957));
    this.jdField_a_of_type_AndroidWidgetTextView = ((TextView)findViewById(2131298715));
    this.jdField_a_of_type_AndroidWidgetImageView = ((ImageView)findViewById(2131296844));
    this.jdField_a_of_type_AndroidContentContext = paramContext;
  }
  
  public void setGone()
  {
    this.jdField_a_of_type_AndroidWidgetRelativeLayout.setVisibility(8);
    this.jdField_a_of_type_AndroidWidgetTextView.setVisibility(8);
    this.jdField_a_of_type_AndroidWidgetImageView.setVisibility(8);
  }
  
  public void setImageViewBackGround(int paramInt)
  {
    this.jdField_a_of_type_AndroidWidgetImageView.setImageResource(paramInt);
  }
  
  public void setLayoutParams(int paramInt1, int paramInt2)
  {
    if ((paramInt1 <= 0) || (paramInt2 <= 20)) {}
    while ((this.jdField_a_of_type_Int == paramInt1) && (this.b == paramInt2)) {
      return;
    }
    this.jdField_a_of_type_Int = paramInt1;
    this.b = paramInt2;
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(this.jdField_a_of_type_Int, this.b - 20);
    this.jdField_a_of_type_AndroidWidgetRelativeLayout.setLayoutParams(localLayoutParams);
    this.jdField_a_of_type_AndroidWidgetRelativeLayout.invalidate();
  }
  
  public void setText(int paramInt)
  {
    this.jdField_a_of_type_AndroidWidgetTextView.setText(paramInt);
  }
  
  public void setTextLeftDrawable(int paramInt)
  {
    Drawable localDrawable = this.jdField_a_of_type_AndroidContentContext.getResources().getDrawable(paramInt);
    localDrawable.setBounds(0, 0, localDrawable.getMinimumWidth(), localDrawable.getMinimumHeight());
    this.jdField_a_of_type_AndroidWidgetTextView.setCompoundDrawables(localDrawable, null, null, null);
  }
  
  public void setVisible()
  {
    this.jdField_a_of_type_AndroidWidgetRelativeLayout.setVisibility(0);
    this.jdField_a_of_type_AndroidWidgetTextView.setVisibility(0);
    this.jdField_a_of_type_AndroidWidgetImageView.setVisibility(0);
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\com\tencent\mobileqq\filemanager\widget\NoFileRelativeLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */