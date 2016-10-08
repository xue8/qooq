package com.tencent.open.agent;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.util.DisplayUtil;
import com.tencent.open.agent.datamodel.ImageLoader;
import com.tencent.open.agent.datamodel.ImageLoader.ImageLoadListener;
import com.tencent.open.agent.datamodel.QZonePortraitData;
import com.tencent.open.base.LengthInputFilter;
import com.tencent.open.base.LogUtility;
import com.tencent.open.business.base.StaticAnalyz;
import com.tencent.open.widget.IKeyboardChanged;
import com.tencent.open.widget.KeyboardDetectorRelativeLayout;
import com.tencent.widget.immersive.ImmersiveUtils;

public class ChallengeActivity
  extends ChallengeBragBase
  implements View.OnClickListener, ImageLoader.ImageLoadListener, IKeyboardChanged
{
  protected static final int a = 100;
  protected static final String a = "ChallengeActivity";
  protected static final int b = 12;
  public static final int c = 10;
  public static final int d = 10;
  public static final int e = 255;
  public static final int f = 20;
  public static final int g = 30;
  public static final int h = 5;
  public static final int i = 55;
  public static final int j = 145;
  protected ImageView a;
  protected ScrollView a;
  protected KeyboardDetectorRelativeLayout a;
  protected InputFilter[] a;
  protected ImageView b;
  protected ScrollView b;
  protected String b;
  protected String c;
  
  public ChallengeActivity()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  protected void a()
  {
    this.jdField_a_of_type_ComTencentOpenWidgetKeyboardDetectorRelativeLayout = ((KeyboardDetectorRelativeLayout)super.findViewById(2131298898));
    if (ImmersiveUtils.isSupporImmersive() == 1)
    {
      this.jdField_a_of_type_ComTencentOpenWidgetKeyboardDetectorRelativeLayout.setFitsSystemWindows(true);
      this.jdField_a_of_type_ComTencentOpenWidgetKeyboardDetectorRelativeLayout.setPadding(0, ImmersiveUtils.a(this), 0, 0);
    }
    this.jdField_b_of_type_AndroidWidgetScrollView = ((ScrollView)super.findViewById(2131298900));
    this.jdField_a_of_type_AndroidWidgetTextView = ((TextView)super.findViewById(2131298901));
    this.jdField_a_of_type_AndroidWidgetEditText = ((EditText)super.findViewById(2131298897));
    this.jdField_a_of_type_AndroidWidgetScrollView = ((ScrollView)super.findViewById(2131298902));
    this.jdField_b_of_type_AndroidWidgetTextView = ((TextView)super.findViewById(2131298910));
    this.jdField_c_of_type_AndroidWidgetTextView = ((TextView)super.findViewById(2131298909));
    this.jdField_a_of_type_AndroidWidgetImageView = ((ImageView)super.findViewById(2131298904));
    this.jdField_b_of_type_AndroidWidgetImageView = ((ImageView)super.findViewById(2131298906));
    this.jdField_a_of_type_ComTencentOpenWidgetKeyboardDetectorRelativeLayout.a(this);
    this.jdField_b_of_type_AndroidWidgetScrollView.setVerticalFadingEdgeEnabled(false);
    this.jdField_a_of_type_ArrayOfAndroidTextInputFilter = new InputFilter[] { new LengthInputFilter(this.jdField_a_of_type_AndroidWidgetEditText, 100) };
    this.jdField_a_of_type_AndroidWidgetEditText.setFilters(this.jdField_a_of_type_ArrayOfAndroidTextInputFilter);
    this.jdField_a_of_type_AndroidWidgetEditText.setText(this.j);
    if (this.jdField_a_of_type_AndroidWidgetScrollView != null) {
      this.jdField_a_of_type_AndroidWidgetScrollView.setVerticalFadingEdgeEnabled(false);
    }
    this.jdField_b_of_type_AndroidWidgetTextView.setOnClickListener(this);
    this.jdField_c_of_type_AndroidWidgetTextView.setOnClickListener(this);
    for (;;)
    {
      try
      {
        a(this.i);
        this.jdField_b_of_type_JavaLangString = QZonePortraitData.a(this.d, this.e);
        this.jdField_c_of_type_JavaLangString = QZonePortraitData.a(this.d, this.i);
        Bitmap localBitmap1 = ImageLoader.a().a(this.jdField_b_of_type_JavaLangString);
        Bitmap localBitmap2 = ImageLoader.a().a(this.jdField_c_of_type_JavaLangString);
        if (localBitmap1 != null)
        {
          this.jdField_a_of_type_AndroidWidgetImageView.setImageBitmap(localBitmap1);
          if (localBitmap2 == null) {
            break;
          }
          this.jdField_b_of_type_AndroidWidgetImageView.setImageBitmap(localBitmap2);
          return;
        }
      }
      catch (Exception localException)
      {
        LogUtility.c("ChallengeActivity", "getNickName error. " + localException.getMessage(), localException);
        c();
        return;
      }
      this.jdField_a_of_type_AndroidWidgetImageView.setImageResource(2130838582);
      ImageLoader.a().a(this.jdField_b_of_type_JavaLangString, this);
    }
    this.jdField_b_of_type_AndroidWidgetImageView.setImageResource(2130838582);
    ImageLoader.a().a(this.jdField_c_of_type_JavaLangString, this);
  }
  
  public void a(int paramInt)
  {
    int k = DisplayUtil.b(this, paramInt) - 10 - 10;
    if ((this.jdField_a_of_type_AndroidWidgetScrollView != null) && (k < 255))
    {
      paramInt = k - 20 - 30 - 5 - 145;
      k = k - 20 - 5 - 145;
      if ((paramInt > 0) && (paramInt < 55))
      {
        this.jdField_a_of_type_AndroidWidgetScrollView.setVisibility(0);
        this.jdField_a_of_type_AndroidWidgetScrollView.getLayoutParams().height = DisplayUtil.a(this, paramInt);
        this.jdField_a_of_type_AndroidWidgetScrollView.setVerticalFadingEdgeEnabled(true);
        this.jdField_b_of_type_AndroidWidgetScrollView.getLayoutParams().height = DisplayUtil.a(this, 30.0F);
        this.jdField_b_of_type_AndroidWidgetScrollView.setVerticalFadingEdgeEnabled(false);
        this.jdField_b_of_type_AndroidWidgetScrollView.setVisibility(0);
      }
    }
    else
    {
      return;
    }
    if ((paramInt <= 0) && (k > 0) && (k < 30))
    {
      this.jdField_a_of_type_AndroidWidgetScrollView.getLayoutParams().height = 0;
      this.jdField_a_of_type_AndroidWidgetScrollView.setVisibility(8);
      this.jdField_a_of_type_AndroidWidgetTextView.getLayoutParams().height = DisplayUtil.a(this, k);
      this.jdField_b_of_type_AndroidWidgetScrollView.setVerticalFadingEdgeEnabled(true);
      return;
    }
    this.jdField_a_of_type_AndroidWidgetScrollView.getLayoutParams().height = 0;
    this.jdField_a_of_type_AndroidWidgetScrollView.setVisibility(8);
    this.jdField_b_of_type_AndroidWidgetScrollView.getLayoutParams().height = 0;
    this.jdField_b_of_type_AndroidWidgetScrollView.setVisibility(8);
  }
  
  public void a(String paramString, Bitmap paramBitmap)
  {
    if (this.jdField_b_of_type_JavaLangString.equals(paramString)) {
      this.jdField_a_of_type_AndroidWidgetImageView.setImageBitmap(paramBitmap);
    }
    while (!this.jdField_c_of_type_JavaLangString.equals(paramString)) {
      return;
    }
    this.jdField_b_of_type_AndroidWidgetImageView.setImageBitmap(paramBitmap);
  }
  
  public void b()
  {
    if (this.jdField_a_of_type_AndroidWidgetScrollView != null)
    {
      this.jdField_a_of_type_AndroidWidgetScrollView.getLayoutParams().height = DisplayUtil.a(this, 55.0F);
      this.jdField_a_of_type_AndroidWidgetScrollView.setVerticalFadingEdgeEnabled(false);
      this.jdField_a_of_type_AndroidWidgetScrollView.setVisibility(0);
      this.jdField_b_of_type_AndroidWidgetScrollView.getLayoutParams().height = DisplayUtil.a(this, 30.0F);
      this.jdField_b_of_type_AndroidWidgetScrollView.setVerticalFadingEdgeEnabled(false);
      this.jdField_b_of_type_AndroidWidgetScrollView.setVisibility(0);
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.getWindow().requestFeature(1);
    super.onCreate(paramBundle);
    super.setContentView(2130903515);
    super.a();
    a();
    StaticAnalyz.a("100", "ANDROIDQQ.PK.FS", this.d);
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\open\agent\ChallengeActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */