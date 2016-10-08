package com.tencent.mobileqq.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.tencent.mobileqq.app.IphoneTitleBarActivity;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.statistics.ReportController;
import lpp;

public class JobSelectionActivity
  extends IphoneTitleBarActivity
  implements AdapterView.OnItemClickListener
{
  public static final String a = "param_id";
  public static final String b = "param_tag";
  public static final String c = "param_name";
  public static final String d = "param_tag_bg";
  public static final String e = "param_need_no_limit";
  public static final String f = "param_from_consearch";
  private int jdField_a_of_type_Int;
  private ListView jdField_a_of_type_AndroidWidgetListView;
  private lpp jdField_a_of_type_Lpp;
  private boolean jdField_a_of_type_Boolean;
  private boolean b;
  
  public JobSelectionActivity()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  protected boolean doOnCreate(Bundle paramBundle)
  {
    super.doOnCreate(paramBundle);
    super.setContentView(2130904202);
    setTitle(2131367335);
    setLeftViewName(2131366637);
    this.jdField_a_of_type_Int = getIntent().getIntExtra("param_id", -1);
    this.jdField_a_of_type_Boolean = getIntent().getBooleanExtra("param_need_no_limit", false);
    this.b = getIntent().getBooleanExtra("param_from_consearch", false);
    this.jdField_a_of_type_AndroidWidgetListView = ((ListView)findViewById(2131297950));
    this.jdField_a_of_type_AndroidWidgetListView.setOnItemClickListener(this);
    this.jdField_a_of_type_Lpp = new lpp(this, null);
    this.jdField_a_of_type_AndroidWidgetListView.setAdapter(this.jdField_a_of_type_Lpp);
    return true;
  }
  
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (this.jdField_a_of_type_Boolean) {}
    for (this.jdField_a_of_type_Int = paramInt;; this.jdField_a_of_type_Int = (paramInt + 1))
    {
      this.jdField_a_of_type_Lpp.notifyDataSetChanged();
      if (this.b) {
        ReportController.b(this.app, "CliOper", "", "", "0X8006F0A", "0X8006F0A", 0, 0, this.jdField_a_of_type_Int + "", "", "", "");
      }
      paramAdapterView = new Intent();
      paramAdapterView.putExtra("param_id", this.jdField_a_of_type_Int);
      if (!this.b)
      {
        paramAdapterView.putExtra("param_tag", com.tencent.mobileqq.util.NearbyProfileUtil.e[this.jdField_a_of_type_Int]);
        paramAdapterView.putExtra("param_name", com.tencent.mobileqq.util.NearbyProfileUtil.d[this.jdField_a_of_type_Int]);
        paramAdapterView.putExtra("param_tag_bg", com.tencent.mobileqq.util.NearbyProfileUtil.a[this.jdField_a_of_type_Int]);
      }
      setResult(-1, paramAdapterView);
      finish();
      return;
    }
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\tencent\mobileqq\activity\JobSelectionActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */