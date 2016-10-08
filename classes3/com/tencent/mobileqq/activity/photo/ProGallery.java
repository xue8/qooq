package com.tencent.mobileqq.activity.photo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.image.RegionDrawableData;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.widget.Gallery;

public class ProGallery
  extends Gallery
{
  private ProGallery.OnProGalleryListener a;
  private int t;
  
  public ProGallery(Context paramContext)
  {
    super(paramContext);
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.t = 1;
  }
  
  public ProGallery(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.t = 1;
  }
  
  public ProGallery(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.t = 1;
  }
  
  protected void a(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (this.a != null) {
      this.a.a(paramInt, paramView, paramViewGroup);
    }
  }
  
  protected void a(int paramInt, View paramView, ViewGroup paramViewGroup, boolean paramBoolean)
  {
    if (this.a != null) {
      this.a.a(paramInt, paramView, paramViewGroup, paramBoolean);
    }
  }
  
  protected void a(int paramInt, View paramView, RegionDrawableData paramRegionDrawableData)
  {
    super.a(paramInt, paramView, paramRegionDrawableData);
    if (this.a != null) {
      this.a.a(paramInt, paramView, paramRegionDrawableData);
    }
  }
  
  protected void a(int paramInt, ViewGroup paramViewGroup, boolean paramBoolean1, boolean paramBoolean2)
  {
    int k = 0;
    int n = this.t;
    if ((n == 0) || (this.a == null)) {}
    int m;
    label34:
    label158:
    do
    {
      return;
      m = this.aG;
      int i = 0;
      int j = paramInt;
      if (i < n)
      {
        j -= 1;
        if (j >= 0) {}
      }
      else
      {
        j = paramInt;
        i = k;
      }
      for (;;)
      {
        if (i < n)
        {
          j += 1;
          if (j < m) {}
        }
        else
        {
          if (!paramBoolean2) {
            break;
          }
          if (!paramBoolean1) {
            break label158;
          }
          paramInt = paramInt - n - 1;
          if (paramInt < 0) {
            break;
          }
          this.a.b(paramInt, null, paramViewGroup);
          return;
          this.a.a(j, null, paramViewGroup);
          i += 1;
          break label34;
        }
        this.a.a(j, null, paramViewGroup);
        i += 1;
      }
      paramInt = paramInt + n + 1;
    } while (paramInt >= m);
    this.a.b(paramInt, null, paramViewGroup);
  }
  
  protected void b(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (this.a != null) {
      this.a.c(paramInt, paramView, paramViewGroup);
    }
  }
  
  public void setOnNoBlankListener(ProGallery.OnProGalleryListener paramOnProGalleryListener)
  {
    if (paramOnProGalleryListener != this.a) {
      this.a = paramOnProGalleryListener;
    }
  }
  
  public void setSelection(int paramInt)
  {
    int m = 0;
    super.setSelection(paramInt);
    int n = this.t;
    if ((n == 0) || (this.a == null)) {}
    label193:
    for (;;)
    {
      return;
      int i1 = this.aG;
      int i = this.aJ;
      int j = i - n;
      int k = i + n;
      i = j;
      if (j < 0) {
        i = 0;
      }
      j = k;
      if (k >= i1) {
        j = i1 - 1;
      }
      k = paramInt - n;
      n += paramInt;
      paramInt = k;
      if (k < 0) {
        paramInt = 0;
      }
      k = n;
      if (n >= i1) {
        k = i1 - 1;
      }
      if ((paramInt > j) || (k < i))
      {
        paramInt = i;
        i = j;
      }
      for (;;)
      {
        if (paramInt >= i) {
          break label193;
        }
        while (paramInt <= i)
        {
          this.a.b(paramInt, null, this);
          paramInt += 1;
        }
        break;
        if (paramInt > i)
        {
          j = paramInt - 1;
          paramInt = i;
          i = j;
        }
        else if (k < j)
        {
          paramInt = k + 1;
          i = j;
        }
        else
        {
          paramInt = 0;
          i = m;
        }
      }
    }
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\tencent\mobileqq\activity\photo\ProGallery.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */