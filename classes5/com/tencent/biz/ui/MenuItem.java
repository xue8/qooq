package com.tencent.biz.ui;

import android.graphics.drawable.Drawable;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.mp.mobileqq_mp.ButtonInfo;
import com.tencent.mobileqq.pb.PBStringField;
import java.util.ArrayList;
import java.util.List;

public class MenuItem
{
  private int jdField_a_of_type_Int;
  private Drawable jdField_a_of_type_AndroidGraphicsDrawableDrawable;
  String jdField_a_of_type_JavaLangString;
  private List jdField_a_of_type_JavaUtilList;
  String b;
  String c;
  String d;
  private String e;
  private String f;
  
  public MenuItem(String paramString1, String paramString2, Drawable paramDrawable, int paramInt)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_AndroidGraphicsDrawableDrawable = paramDrawable;
    this.e = paramString2;
    this.f = paramString1;
    this.jdField_a_of_type_Int = paramInt;
  }
  
  public int a()
  {
    return this.jdField_a_of_type_Int;
  }
  
  public Drawable a()
  {
    return this.jdField_a_of_type_AndroidGraphicsDrawableDrawable;
  }
  
  public MenuItem a(int paramInt)
  {
    if (this.jdField_a_of_type_JavaUtilList == null) {
      return null;
    }
    return (MenuItem)this.jdField_a_of_type_JavaUtilList.get(paramInt);
  }
  
  public String a()
  {
    return this.e;
  }
  
  public List a()
  {
    return this.jdField_a_of_type_JavaUtilList;
  }
  
  public void a(Drawable paramDrawable)
  {
    this.jdField_a_of_type_AndroidGraphicsDrawableDrawable = paramDrawable;
  }
  
  public void a(MenuItem paramMenuItem)
  {
    if (paramMenuItem == null) {
      return;
    }
    if (this.jdField_a_of_type_JavaUtilList == null) {
      this.jdField_a_of_type_JavaUtilList = new ArrayList();
    }
    this.jdField_a_of_type_JavaUtilList.add(paramMenuItem);
  }
  
  public void a(mobileqq_mp.ButtonInfo paramButtonInfo)
  {
    if (paramButtonInfo.logo_url.has()) {
      this.jdField_a_of_type_JavaLangString = paramButtonInfo.logo_url.get();
    }
    if (paramButtonInfo.texture_url.has()) {
      this.d = paramButtonInfo.texture_url.get();
    }
    if (paramButtonInfo.bg_colors.has())
    {
      paramButtonInfo = paramButtonInfo.bg_colors.get().split("\\|");
      if (paramButtonInfo.length > 0) {
        this.b = paramButtonInfo[0];
      }
      if (paramButtonInfo.length > 1) {
        this.c = paramButtonInfo[1];
      }
    }
  }
  
  public void a(String paramString)
  {
    this.e = paramString;
  }
  
  public boolean a()
  {
    return this.jdField_a_of_type_JavaUtilList != null;
  }
  
  public int b()
  {
    if (this.jdField_a_of_type_JavaUtilList == null) {
      return 0;
    }
    return this.jdField_a_of_type_JavaUtilList.size();
  }
  
  public String b()
  {
    return this.f;
  }
  
  public void b(String paramString)
  {
    this.f = paramString;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\com\tencent\biz\ui\MenuItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */