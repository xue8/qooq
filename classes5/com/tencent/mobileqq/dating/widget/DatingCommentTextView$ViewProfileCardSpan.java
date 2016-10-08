package com.tencent.mobileqq.dating.widget;

import android.content.res.Resources;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.tencent.mobileqq.app.BaseActivity;
import com.tencent.mobileqq.dating.DatingUtil;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public class DatingCommentTextView$ViewProfileCardSpan
  extends ClickableSpan
{
  private long jdField_a_of_type_Long;
  private BaseActivity jdField_a_of_type_ComTencentMobileqqAppBaseActivity;
  private String jdField_a_of_type_JavaLangString;
  
  public DatingCommentTextView$ViewProfileCardSpan(BaseActivity paramBaseActivity, long paramLong, String paramString)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity = paramBaseActivity;
    this.jdField_a_of_type_Long = paramLong;
    this.jdField_a_of_type_JavaLangString = paramString;
  }
  
  public void onClick(View paramView)
  {
    if ((paramView == null) || (!(paramView instanceof TextView))) {}
    do
    {
      return;
      if (this.jdField_a_of_type_Long > 0L) {
        DatingUtil.a(this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity, this.jdField_a_of_type_Long, this.jdField_a_of_type_JavaLangString, null, 18, null, -1, -1, 0, false);
      }
      paramView = ((TextView)paramView).getText();
    } while ((paramView == null) || (!(paramView instanceof Spannable)));
    Selection.removeSelection((Spannable)paramView);
  }
  
  public void updateDrawState(TextPaint paramTextPaint)
  {
    paramTextPaint.setUnderlineText(false);
    paramTextPaint.setColor(this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity.getResources().getColor(2131428332));
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\com\tencent\mobileqq\dating\widget\DatingCommentTextView$ViewProfileCardSpan.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */