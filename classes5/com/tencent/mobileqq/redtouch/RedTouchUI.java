package com.tencent.mobileqq.redtouch;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.image.URLImageView;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public class RedTouchUI
  extends RedTouch
{
  private int F = -1;
  private int G = -1;
  private List b;
  
  public RedTouchUI(Context paramContext)
  {
    this(paramContext, null);
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public RedTouchUI(Context paramContext, View paramView)
  {
    super(paramContext, paramView);
    this.jdField_b_of_type_JavaUtilList = new ArrayList();
  }
  
  private boolean a(RedTypeInfo paramRedTypeInfo1, RedTypeInfo paramRedTypeInfo2)
  {
    if (paramRedTypeInfo1.getRed_type() != paramRedTypeInfo2.getRed_type()) {}
    while ((!paramRedTypeInfo1.getRed_content().equals(paramRedTypeInfo2.getRed_content())) || (!paramRedTypeInfo1.getRed_desc().equals(paramRedTypeInfo2.getRed_desc())) || (paramRedTypeInfo1.getRed_priority() != paramRedTypeInfo2.getRed_priority())) {
      return false;
    }
    return true;
  }
  
  private boolean a(List paramList)
  {
    if (this.jdField_b_of_type_JavaUtilList.size() == 0) {}
    while (this.jdField_b_of_type_JavaUtilList.size() != paramList.size()) {
      return false;
    }
    int i = 0;
    for (;;)
    {
      if (i >= this.jdField_b_of_type_JavaUtilList.size()) {
        break label84;
      }
      if (!a((RedTypeInfo)this.jdField_b_of_type_JavaUtilList.get(i), (RedTypeInfo)paramList.get(i))) {
        break;
      }
      i += 1;
    }
    label84:
    return true;
  }
  
  private void b(RedTypeInfo paramRedTypeInfo)
  {
    int m = 0;
    int k = 0;
    if (paramRedTypeInfo == null) {}
    for (;;)
    {
      return;
      this.jdField_a_of_type_AndroidWidgetLinearLayout.setVisibility(0);
      try
      {
        Object localObject;
        if (TextUtils.isEmpty(paramRedTypeInfo.getRed_desc()))
        {
          localObject = new JSONObject();
          if (!((JSONObject)localObject).has("bg")) {
            break label389;
          }
        }
        label389:
        for (int i = a(((JSONObject)localObject).getString("bg"));; i = 0) {
          switch (paramRedTypeInfo.getRed_type())
          {
          case 0: 
            paramRedTypeInfo = a(i);
            if (paramRedTypeInfo == null) {
              break;
            }
            i = this.p;
            this.p = (i + 1);
            paramRedTypeInfo.setId(i);
            this.jdField_a_of_type_AndroidWidgetLinearLayout.addView(paramRedTypeInfo);
            return;
            localObject = new JSONObject(paramRedTypeInfo.getRed_desc());
            break;
          case 3: 
            if (!((JSONObject)localObject).has("av")) {}
          case 4: 
          case 5: 
          case 9: 
            for (int j = ((JSONObject)localObject).getInt("av");; j = 0)
            {
              if (((JSONObject)localObject).has("dot")) {
                k = ((JSONObject)localObject).getInt("dot");
              }
              paramRedTypeInfo = a(paramRedTypeInfo.getRed_content(), j, k, i);
              if (paramRedTypeInfo == null) {
                break;
              }
              i = this.q;
              this.q = (i + 1);
              paramRedTypeInfo.setId(i);
              this.jdField_a_of_type_AndroidWidgetLinearLayout.addView(paramRedTypeInfo);
              return;
              j = -1;
              if (((JSONObject)localObject).has("cr")) {
                j = a(((JSONObject)localObject).getString("cr"));
              }
              k = m;
              if (((JSONObject)localObject).has("cn")) {
                k = a(((JSONObject)localObject).getString("cn"));
              }
              localObject = a(paramRedTypeInfo.getRed_content(), j, k, i);
              if (localObject == null) {
                break;
              }
              if (paramRedTypeInfo.getRed_type() == 4)
              {
                i = this.r;
                this.r = (i + 1);
              }
              for (;;)
              {
                ((View)localObject).setId(i);
                this.jdField_a_of_type_AndroidWidgetLinearLayout.addView((View)localObject);
                return;
                i = this.s;
                this.s = (i + 1);
              }
              paramRedTypeInfo = a(paramRedTypeInfo.getRed_content());
              if (paramRedTypeInfo == null) {
                break;
              }
              this.jdField_a_of_type_AndroidWidgetLinearLayout.addView(paramRedTypeInfo);
              return;
            }
          }
        }
        return;
      }
      catch (Exception paramRedTypeInfo) {}
    }
  }
  
  protected View a(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject = new URLImageView(this.jdField_a_of_type_AndroidContentContext);
    ((URLImageView)localObject).setScaleType(ImageView.ScaleType.FIT_XY);
    ((URLImageView)localObject).setBackgroundColor(paramInt3);
    a(paramString, (URLImageView)localObject, paramInt1);
    if (paramInt2 == 1)
    {
      if (this.F == -1) {
        throw new RuntimeException("must set the redpoint imageresource");
      }
      paramString = new FrameLayout(getContext());
      ((URLImageView)localObject).setLayoutParams(new FrameLayout.LayoutParams(a(36), a(36)));
      ((URLImageView)localObject).setPadding(a(3), a(3), a(3), a(3));
      paramString.addView((View)localObject);
      localObject = new ImageView(this.jdField_a_of_type_AndroidContentContext);
      ((ImageView)localObject).setImageResource(this.F);
      FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-2, -2);
      localLayoutParams.gravity = 53;
      ((ImageView)localObject).setLayoutParams(localLayoutParams);
      paramString.addView((View)localObject);
      paramString.setLayoutParams(a());
      return paramString;
    }
    paramString = a();
    paramString.width = a(36);
    paramString.height = a(36);
    ((URLImageView)localObject).setLayoutParams(paramString);
    ((URLImageView)localObject).setPadding(a(3), a(3), a(3), a(3));
    return (View)localObject;
  }
  
  protected ImageView a(int paramInt)
  {
    if (this.F == -1) {
      throw new RuntimeException("must set the redpoint imageresource");
    }
    ImageView localImageView = new ImageView(this.jdField_a_of_type_AndroidContentContext);
    localImageView.setImageResource(this.F);
    localImageView.setBackgroundColor(paramInt);
    localImageView.setLayoutParams(a());
    return localImageView;
  }
  
  protected TextView a(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.G == -1) {
      throw new RuntimeException("must set the redpoint imageresource");
    }
    TextView localTextView = new TextView(this.jdField_a_of_type_AndroidContentContext);
    try
    {
      if (Integer.parseInt(paramString) > this.E) {
        localTextView.setText(this.E + "+");
      }
      for (;;)
      {
        localTextView.setTextColor(paramInt1);
        localTextView.setGravity(17);
        localTextView.setSingleLine(true);
        if (paramInt2 == 0) {
          break;
        }
        localTextView.setTextSize(11.0F);
        localTextView.setBackgroundResource(this.G);
        localTextView.setLayoutParams(a());
        if (this.jdField_b_of_type_Boolean)
        {
          localTextView.measure(0, 0);
          this.A = (localTextView.getMeasuredWidth() / 2);
          a();
        }
        return localTextView;
        localTextView.setText(paramString);
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        localTextView.setText(paramString);
        continue;
        localTextView.setTextSize(13.0F);
      }
    }
  }
  
  public void a(RedAppInfo paramRedAppInfo)
  {
    b();
    if (paramRedAppInfo == null) {}
    for (;;)
    {
      return;
      if (this.jdField_b_of_type_JavaUtilList != null) {
        this.jdField_b_of_type_JavaUtilList.clear();
      }
      if ((paramRedAppInfo.b() != 0) && (paramRedAppInfo.a() != null) && (paramRedAppInfo.a().a() != null) && (!a(paramRedAppInfo.a().a())))
      {
        this.jdField_b_of_type_JavaUtilList.addAll(paramRedAppInfo.a().a());
        paramRedAppInfo = this.jdField_b_of_type_JavaUtilList.iterator();
        while (paramRedAppInfo.hasNext()) {
          b((RedTypeInfo)paramRedAppInfo.next());
        }
      }
    }
  }
  
  public void a(RedTypeInfo paramRedTypeInfo)
  {
    b();
    if (paramRedTypeInfo == null) {
      return;
    }
    b(paramRedTypeInfo);
  }
  
  public void setRedpointImgResID(int paramInt)
  {
    this.F = paramInt;
  }
  
  public void setTextOrNumImgRedID(int paramInt)
  {
    this.G = paramInt;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\com\tencent\mobileqq\redtouch\RedTouchUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */