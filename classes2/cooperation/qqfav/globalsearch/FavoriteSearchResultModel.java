package cooperation.qqfav.globalsearch;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.mobileqq.app.BaseActivity;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.search.model.ISearchResultModel;
import com.tencent.mobileqq.search.util.SearchUtils;
import com.tencent.mobileqq.text.QQText;
import cooperation.qqfav.QfavHelper;
import mqq.app.AppRuntime;

public class FavoriteSearchResultModel
  implements ISearchResultModel
{
  private static ForegroundColorSpan jdField_a_of_type_AndroidTextStyleForegroundColorSpan = new ForegroundColorSpan(BaseApplicationImpl.a.getResources().getColor(2131428332));
  public int a;
  public long a;
  private CharSequence jdField_a_of_type_JavaLangCharSequence;
  public String a;
  public boolean a;
  public byte[] a;
  public int b;
  public long b;
  public String b;
  public int c;
  public long c;
  public String c;
  public int d;
  public String d;
  public int e;
  public int f;
  public int g;
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public int a()
  {
    switch (this.e)
    {
    default: 
      return 0;
    case 1: 
      return 1;
    case 2: 
      return 4;
    }
    return 101;
  }
  
  public CharSequence a()
  {
    if ((this.jdField_a_of_type_JavaLangCharSequence == null) && (this.jdField_b_of_type_JavaLangString != null))
    {
      QQText localQQText = new QQText(this.jdField_b_of_type_JavaLangString, 3, 20);
      if ((this.jdField_a_of_type_Int == 0) && (this.jdField_c_of_type_Int > this.jdField_b_of_type_Int)) {
        localQQText.setSpan(jdField_a_of_type_AndroidTextStyleForegroundColorSpan, this.jdField_b_of_type_Int, this.jdField_c_of_type_Int, 33);
      }
      this.jdField_a_of_type_JavaLangCharSequence = localQQText;
    }
    return this.jdField_a_of_type_JavaLangCharSequence;
  }
  
  public String a()
  {
    if (this.jdField_c_of_type_Long == 0L) {
      return null;
    }
    return "" + this.jdField_c_of_type_Long;
  }
  
  public void a(View paramView)
  {
    BaseActivity localBaseActivity = (BaseActivity)paramView.getContext();
    QfavHelper.a(localBaseActivity, localBaseActivity.getAppRuntime().getAccount(), this.jdField_a_of_type_Long);
    SearchUtils.a(this.jdField_a_of_type_JavaLangString, 60, 0, paramView);
  }
  
  public boolean a()
  {
    return false;
  }
  
  public CharSequence b()
  {
    return null;
  }
  
  public String b()
  {
    return this.jdField_a_of_type_JavaLangString;
  }
  
  public CharSequence c()
  {
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    if (this.jdField_c_of_type_JavaLangString != null)
    {
      if (this.jdField_a_of_type_Int == 1) {
        localSpannableStringBuilder.append("来自: ").append(this.jdField_c_of_type_JavaLangString).setSpan(jdField_a_of_type_AndroidTextStyleForegroundColorSpan, this.jdField_b_of_type_Int + 4, this.jdField_c_of_type_Int + 4, 33);
      }
    }
    else {
      return localSpannableStringBuilder;
    }
    return localSpannableStringBuilder.append("来自: ").append(SearchUtils.a(this.jdField_c_of_type_JavaLangString, this.jdField_a_of_type_JavaLangString, 30));
  }
  
  public CharSequence d()
  {
    return null;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\cooperation\qqfav\globalsearch\FavoriteSearchResultModel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */