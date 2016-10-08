package com.tencent.mobileqq.activity.activateFriend;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public class ActivateFriendGridItem
  extends RelativeLayout
{
  ImageView jdField_a_of_type_AndroidWidgetImageView;
  TextView jdField_a_of_type_AndroidWidgetTextView;
  public boolean a;
  ImageView jdField_b_of_type_AndroidWidgetImageView;
  TextView jdField_b_of_type_AndroidWidgetTextView;
  
  public ActivateFriendGridItem(Context paramContext)
  {
    this(paramContext, true, true);
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public ActivateFriendGridItem(Context paramContext, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramContext);
    this.jdField_a_of_type_Boolean = true;
    a(paramContext, paramBoolean1, paramBoolean2);
  }
  
  private void a(Context paramContext, boolean paramBoolean1, boolean paramBoolean2)
  {
    LayoutInflater.from(paramContext).inflate(2130904065, this, true);
    this.jdField_a_of_type_AndroidWidgetImageView = ((ImageView)findViewById(2131296790));
    this.jdField_b_of_type_AndroidWidgetImageView = ((ImageView)findViewById(2131301237));
    this.jdField_a_of_type_AndroidWidgetTextView = ((TextView)findViewById(2131296829));
    this.jdField_b_of_type_AndroidWidgetTextView = ((TextView)findViewById(2131301238));
    if (!paramBoolean2)
    {
      this.jdField_a_of_type_AndroidWidgetTextView.setHorizontallyScrolling(false);
      this.jdField_b_of_type_AndroidWidgetTextView.setHorizontallyScrolling(false);
    }
    if (!paramBoolean1)
    {
      paramContext = findViewById(2131301236).getBackground();
      if ((paramContext != null) && ((paramContext instanceof GradientDrawable))) {
        ((GradientDrawable)paramContext).setColor(-1);
      }
      this.jdField_a_of_type_AndroidWidgetTextView.setTextColor(-16777216);
    }
  }
  
  public void a()
  {
    if (!this.jdField_a_of_type_Boolean) {}
    for (boolean bool = true;; bool = false)
    {
      setChecked(bool);
      return;
    }
  }
  
  public void setBirthday(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
    {
      this.jdField_b_of_type_AndroidWidgetTextView.setVisibility(8);
      return;
    }
    this.jdField_b_of_type_AndroidWidgetTextView.setVisibility(0);
    this.jdField_b_of_type_AndroidWidgetTextView.setText(paramString);
  }
  
  public void setChecked(boolean paramBoolean)
  {
    this.jdField_a_of_type_Boolean = paramBoolean;
    if (this.jdField_a_of_type_Boolean)
    {
      this.jdField_b_of_type_AndroidWidgetImageView.setImageResource(2130840520);
      str2 = getResources().getString(2131371419) + this.jdField_a_of_type_AndroidWidgetTextView.getText();
      str1 = str2;
      if (this.jdField_b_of_type_AndroidWidgetTextView.getVisibility() == 0) {
        str1 = str2 + this.jdField_b_of_type_AndroidWidgetTextView.getText();
      }
      setContentDescription(str1);
      return;
    }
    this.jdField_b_of_type_AndroidWidgetImageView.setImageResource(2130840521);
    String str2 = "" + this.jdField_a_of_type_AndroidWidgetTextView.getText();
    String str1 = str2;
    if (this.jdField_b_of_type_AndroidWidgetTextView.getVisibility() == 0) {
      str1 = str2 + this.jdField_b_of_type_AndroidWidgetTextView.getText();
    }
    setContentDescription(str1);
  }
  
  public void setHead(Bitmap paramBitmap)
  {
    this.jdField_a_of_type_AndroidWidgetImageView.setImageBitmap(paramBitmap);
  }
  
  public void setNickName(String paramString)
  {
    this.jdField_a_of_type_AndroidWidgetTextView.setText(paramString);
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\com\tencent\mobileqq\activity\activateFriend\ActivateFriendGridItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */