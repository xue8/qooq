package com.tencent.mobileqq.businessCard.utilities;

import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.view.WindowManager;
import android.widget.TextView;
import com.tencent.mobileqq.businessCard.activity.BusinessCardListActivity;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.util.VersionUtils;
import com.tencent.widget.SwipListView;
import qwz;
import qxa;

public class BusinessCardGroupLogic
  implements View.OnClickListener
{
  View jdField_a_of_type_AndroidViewView;
  TextView jdField_a_of_type_AndroidWidgetTextView;
  public BusinessCardListActivity a;
  BusinessCardGroupLogic.BusinessCardGroupAdapter jdField_a_of_type_ComTencentMobileqqBusinessCardUtilitiesBusinessCardGroupLogic$BusinessCardGroupAdapter;
  
  public BusinessCardGroupLogic(BusinessCardListActivity paramBusinessCardListActivity, View paramView)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_ComTencentMobileqqBusinessCardActivityBusinessCardListActivity = null;
    this.jdField_a_of_type_AndroidWidgetTextView = null;
    this.jdField_a_of_type_AndroidViewView = null;
    this.jdField_a_of_type_ComTencentMobileqqBusinessCardUtilitiesBusinessCardGroupLogic$BusinessCardGroupAdapter = null;
    this.jdField_a_of_type_ComTencentMobileqqBusinessCardActivityBusinessCardListActivity = paramBusinessCardListActivity;
    this.jdField_a_of_type_AndroidWidgetTextView = ((TextView)paramView);
    this.jdField_a_of_type_AndroidWidgetTextView.setOnClickListener(this);
    a(this.jdField_a_of_type_AndroidWidgetTextView, 2130841624, 10);
  }
  
  private void b()
  {
    if (this.jdField_a_of_type_AndroidViewView != null) {
      return;
    }
    this.jdField_a_of_type_AndroidViewView = ((ViewStub)this.jdField_a_of_type_ComTencentMobileqqBusinessCardActivityBusinessCardListActivity.findViewById(2131300816)).inflate();
    View localView = this.jdField_a_of_type_AndroidViewView.findViewById(2131300854);
    SwipListView localSwipListView = (SwipListView)this.jdField_a_of_type_AndroidViewView.findViewById(2131300855);
    if (VersionUtils.c()) {
      localSwipListView.setOverScrollMode(2);
    }
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    this.jdField_a_of_type_ComTencentMobileqqBusinessCardActivityBusinessCardListActivity.getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
    ViewGroup.LayoutParams localLayoutParams = localSwipListView.getLayoutParams();
    localLayoutParams.width = (localDisplayMetrics.widthPixels * 4 / 5);
    localSwipListView.setLayoutParams(localLayoutParams);
    localView.setOnClickListener(new qwz(this));
    this.jdField_a_of_type_ComTencentMobileqqBusinessCardUtilitiesBusinessCardGroupLogic$BusinessCardGroupAdapter = new BusinessCardGroupLogic.BusinessCardGroupAdapter(this, this.jdField_a_of_type_ComTencentMobileqqBusinessCardActivityBusinessCardListActivity);
    localSwipListView.setAdapter(this.jdField_a_of_type_ComTencentMobileqqBusinessCardUtilitiesBusinessCardGroupLogic$BusinessCardGroupAdapter);
    localSwipListView.setOnItemClickListener(new qxa(this));
  }
  
  public void a()
  {
    if (this.jdField_a_of_type_AndroidViewView.getVisibility() != 0)
    {
      this.jdField_a_of_type_AndroidViewView.setVisibility(0);
      if (this.jdField_a_of_type_ComTencentMobileqqBusinessCardUtilitiesBusinessCardGroupLogic$BusinessCardGroupAdapter != null) {
        this.jdField_a_of_type_ComTencentMobileqqBusinessCardUtilitiesBusinessCardGroupLogic$BusinessCardGroupAdapter.notifyDataSetChanged();
      }
    }
    a(this.jdField_a_of_type_AndroidWidgetTextView, 2130841625, 10);
  }
  
  public void a(TextView paramTextView, int paramInt1, int paramInt2)
  {
    paramTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, paramInt1, 0);
    paramTextView.setCompoundDrawablePadding(paramInt2);
  }
  
  public void a(boolean paramBoolean)
  {
    if (this.jdField_a_of_type_AndroidViewView == null) {
      return;
    }
    if (this.jdField_a_of_type_AndroidViewView.getVisibility() == 0) {
      this.jdField_a_of_type_AndroidViewView.setVisibility(8);
    }
    a(this.jdField_a_of_type_AndroidWidgetTextView, 2130841624, 10);
  }
  
  public void onClick(View paramView)
  {
    if (this.jdField_a_of_type_AndroidViewView == null) {
      b();
    }
    if (paramView == this.jdField_a_of_type_AndroidWidgetTextView)
    {
      if (this.jdField_a_of_type_AndroidViewView.getVisibility() != 0) {
        a();
      }
    }
    else {
      return;
    }
    a(true);
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\com\tencent\mobileqq\businessCard\utilities\BusinessCardGroupLogic.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */