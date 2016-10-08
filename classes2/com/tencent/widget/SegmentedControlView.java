package com.tencent.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.mobileqq.R.styleable;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.utils.kapalaiadapter.KapalaiRadioGroupBase;
import com.tencent.qphone.base.util.QLog;

public class SegmentedControlView
  extends KapalaiRadioGroupBase
{
  private Drawable a;
  private Drawable b;
  private Drawable c;
  private Drawable d;
  
  public SegmentedControlView(Context paramContext)
  {
    super(paramContext);
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    setOrientation(0);
  }
  
  public SegmentedControlView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.ak);
    try
    {
      this.a = paramContext.getDrawable(1);
      this.b = paramContext.getDrawable(2);
      this.c = paramContext.getDrawable(3);
      this.d = paramContext.getDrawable(4);
      setOrientation(paramContext.getInt(0, 0));
      paramContext.recycle();
      return;
    }
    catch (Exception paramAttributeSet)
    {
      for (;;)
      {
        paramAttributeSet.printStackTrace();
        if (QLog.isColorLevel()) {
          QLog.i("Q.recent", 2, paramAttributeSet.toString());
        }
      }
    }
  }
  
  private void b()
  {
    int j = getChildCount();
    if (j > 1)
    {
      if (this.a != null) {
        getChildAt(0).setBackgroundDrawable(this.a);
      }
      if (this.c != null)
      {
        i = j - 2;
        while (i > 0)
        {
          getChildAt(i).setBackgroundDrawable(this.c);
          i -= 1;
        }
      }
      if (this.b != null) {
        getChildAt(j - 1).setBackgroundDrawable(this.b);
      }
    }
    while ((j != 1) || (this.d == null))
    {
      int i;
      return;
    }
    getChildAt(0).setBackgroundDrawable(this.d);
  }
  
  protected void a()
  {
    super.a();
    b();
  }
  
  public void setBackgroundFirstButton(Drawable paramDrawable)
  {
    this.a = paramDrawable;
  }
  
  public void setBackgroundLastButton(Drawable paramDrawable)
  {
    this.b = paramDrawable;
  }
  
  public void setBackgroundMiddleButton(Drawable paramDrawable)
  {
    this.c = paramDrawable;
  }
  
  public void setBackgroundUniqueButton(Drawable paramDrawable)
  {
    this.d = paramDrawable;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\widget\SegmentedControlView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */