package com.tencent.mobileqq.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mobileqq.app.FriendListObserver;
import com.tencent.mobileqq.app.IphoneTitleBarActivity;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.ThreadManager;
import com.tencent.mobileqq.app.TroopHandler;
import com.tencent.mobileqq.app.TroopManager;
import com.tencent.mobileqq.app.TroopObserver;
import com.tencent.mobileqq.data.TroopInfo;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.statistics.ReportController;
import com.tencent.mobileqq.utils.DialogUtil;
import com.tencent.mobileqq.utils.NetworkUtil;
import com.tencent.mobileqq.utils.QQCustomDialog;
import com.tencent.mobileqq.widget.QQProgressNotifier;
import com.tencent.qphone.base.util.QLog;
import java.util.ArrayList;
import mqb;
import mqc;
import mqd;
import mqe;
import mqh;

public class TroopDisbandActivity
  extends IphoneTitleBarActivity
  implements View.OnClickListener
{
  public static final int a = 0;
  public static final String a = "Q.troopdisband.disband";
  protected static final int b = 1;
  protected static final int c = 2;
  protected static final int e = 6;
  public long a;
  protected View a;
  protected Button a;
  protected GridView a;
  protected ImageView a;
  protected TextView a;
  public TroopDisbandActivity.MemberGridAdapter a;
  private FriendListObserver jdField_a_of_type_ComTencentMobileqqAppFriendListObserver;
  TroopObserver jdField_a_of_type_ComTencentMobileqqAppTroopObserver;
  public TroopInfo a;
  public QQProgressNotifier a;
  public ArrayList a;
  protected Button b;
  protected TextView b;
  public String b;
  protected TextView c;
  public String c;
  public int d;
  public String d;
  public String e;
  protected int f;
  protected int g;
  
  public TroopDisbandActivity()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_ComTencentMobileqqAppTroopObserver = new mqe(this);
    this.jdField_a_of_type_ComTencentMobileqqAppFriendListObserver = new mqh(this);
  }
  
  private void c()
  {
    this.jdField_a_of_type_AndroidWidgetTextView = ((TextView)findViewById(2131302569));
    this.jdField_a_of_type_AndroidWidgetImageView = ((ImageView)findViewById(2131302571));
    this.jdField_a_of_type_AndroidViewView = findViewById(2131302568);
    this.jdField_b_of_type_AndroidWidgetTextView = ((TextView)findViewById(2131302570));
    this.jdField_a_of_type_AndroidWidgetGridView = ((GridView)findViewById(2131302573));
    this.jdField_c_of_type_AndroidWidgetTextView = ((TextView)findViewById(2131302575));
    this.jdField_a_of_type_AndroidWidgetButton = ((Button)findViewById(2131302576));
    this.jdField_a_of_type_AndroidWidgetButton.setOnClickListener(this);
    this.jdField_b_of_type_AndroidWidgetButton = ((Button)findViewById(2131302577));
    this.jdField_b_of_type_AndroidWidgetButton.setOnClickListener(this);
    this.jdField_a_of_type_ComTencentMobileqqActivityTroopDisbandActivity$MemberGridAdapter = new TroopDisbandActivity.MemberGridAdapter(this);
    this.jdField_a_of_type_AndroidWidgetGridView.setAdapter(this.jdField_a_of_type_ComTencentMobileqqActivityTroopDisbandActivity$MemberGridAdapter);
    this.f = (getResources().getDimensionPixelSize(2131492981) * 2);
    Object localObject = findViewById(2131302572);
    int i = this.f;
    int j = ((View)localObject).getPaddingLeft();
    this.f = (((View)localObject).getPaddingRight() + j + i);
    this.f += getResources().getDimensionPixelSize(2131493093) * 2;
    this.g = getResources().getDimensionPixelSize(2131493092);
    b();
    localObject = (TroopManager)this.app.getManager(51);
    if (localObject == null) {}
    for (localObject = null;; localObject = ((TroopManager)localObject).a(this.jdField_b_of_type_JavaLangString))
    {
      this.jdField_a_of_type_ComTencentMobileqqDataTroopInfo = ((TroopInfo)localObject);
      a(this.jdField_a_of_type_ComTencentMobileqqDataTroopInfo, true);
      return;
    }
  }
  
  protected void a()
  {
    Bundle localBundle = getIntent().getExtras();
    this.jdField_b_of_type_JavaLangString = localBundle.getString("troop_uin");
    this.jdField_d_of_type_JavaLangString = localBundle.getString("troop_code");
    this.jdField_c_of_type_JavaLangString = localBundle.getString("uinname");
    try
    {
      long l = Long.parseLong(this.jdField_b_of_type_JavaLangString);
      if (l <= 0L)
      {
        if (QLog.isColorLevel()) {
          QLog.i("Q.troopdisband.disband", 2, "troopuin = " + l + " is illegal");
        }
        finish();
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        if (QLog.isColorLevel()) {
          QLog.i("Q.troopdisband.disband", 2, localException.toString());
        }
        finish();
      }
    }
    if (QLog.isColorLevel()) {
      QLog.i("Q.troopdisband.disband", 2, "onCreate intent params mTroopUin= " + this.jdField_b_of_type_JavaLangString + ", mTroopName=" + this.jdField_c_of_type_JavaLangString + ", mTroopCode= " + this.jdField_d_of_type_JavaLangString);
    }
  }
  
  public void a(TroopInfo paramTroopInfo, boolean paramBoolean)
  {
    this.jdField_a_of_type_ComTencentMobileqqDataTroopInfo = paramTroopInfo;
    if (this.jdField_a_of_type_ComTencentMobileqqDataTroopInfo != null)
    {
      this.jdField_d_of_type_JavaLangString = this.jdField_a_of_type_ComTencentMobileqqDataTroopInfo.troopcode;
      this.jdField_c_of_type_JavaLangString = this.jdField_a_of_type_ComTencentMobileqqDataTroopInfo.troopname;
      if (QLog.isColorLevel()) {
        QLog.i("Q.troopdisband.disband", 2, "initTroopTips groupInfo mTroopUin =" + this.jdField_b_of_type_JavaLangString + ", wMemberNum=" + this.jdField_a_of_type_ComTencentMobileqqDataTroopInfo.wMemberNum + ", troopCreateTime = " + this.jdField_a_of_type_ComTencentMobileqqDataTroopInfo.troopCreateTime);
      }
      this.jdField_b_of_type_AndroidWidgetTextView.setText(String.format(getString(2131369422), new Object[] { Integer.valueOf(this.jdField_a_of_type_ComTencentMobileqqDataTroopInfo.wMemberNum) }));
      if (this.jdField_a_of_type_ComTencentMobileqqDataTroopInfo.wMemberNum <= 1)
      {
        this.jdField_c_of_type_AndroidWidgetTextView.setText(2131369416);
        this.jdField_a_of_type_AndroidWidgetTextView.setText(2131369419);
        this.jdField_a_of_type_AndroidWidgetImageView.setVisibility(8);
        this.jdField_a_of_type_AndroidViewView.setClickable(false);
        findViewById(2131302574).setClickable(false);
        this.jdField_a_of_type_ComTencentMobileqqActivityTroopDisbandActivity$MemberGridAdapter.a();
        this.jdField_a_of_type_AndroidWidgetButton.setVisibility(8);
      }
      do
      {
        return;
        this.jdField_a_of_type_AndroidWidgetImageView.setVisibility(0);
        findViewById(2131302574).setOnClickListener(this);
        this.jdField_a_of_type_AndroidViewView.setOnClickListener(this);
        this.jdField_c_of_type_AndroidWidgetTextView.setText(2131369417);
        this.jdField_a_of_type_AndroidWidgetTextView.setText(2131369418);
      } while (!paramBoolean);
      this.jdField_a_of_type_ComTencentMobileqqActivityTroopDisbandActivity$MemberGridAdapter.a(this.jdField_a_of_type_ComTencentMobileqqDataTroopInfo.getSomeMemberUins());
      ThreadManager.a(new mqb(this), 5, null, true);
      return;
    }
    this.jdField_b_of_type_AndroidWidgetTextView.setText("");
    this.jdField_c_of_type_AndroidWidgetTextView.setText("");
    this.jdField_a_of_type_AndroidWidgetImageView.setVisibility(8);
    this.jdField_a_of_type_AndroidViewView.setClickable(false);
  }
  
  protected void b()
  {
    int i = 125;
    int k = getResources().getDisplayMetrics().widthPixels;
    int j = (k - this.f - this.g * 5) / 6;
    if (j > 125) {}
    for (;;)
    {
      this.jdField_a_of_type_AndroidWidgetGridView.setColumnWidth(i);
      ViewGroup.LayoutParams localLayoutParams = this.jdField_a_of_type_AndroidWidgetGridView.getLayoutParams();
      if (localLayoutParams != null) {
        localLayoutParams.height = (i + 4);
      }
      this.jdField_a_of_type_ComTencentMobileqqActivityTroopDisbandActivity$MemberGridAdapter.a(i);
      if (QLog.isColorLevel())
      {
        QLog.i("Q.troopdisband.disband", 2, "initListItemSize|width = " + k + ", columnWidth = " + i);
        QLog.i("Q.troopdisband.disband", 2, "initListItemSize|list.width = " + this.jdField_a_of_type_AndroidWidgetGridView.getWidth() + ", list.height = " + this.jdField_a_of_type_AndroidWidgetGridView.getHeight());
      }
      return;
      i = j;
    }
  }
  
  protected boolean doOnCreate(Bundle paramBundle)
  {
    super.doOnCreate(paramBundle);
    setContentViewB(2130904374);
    setTitle(2131368715);
    a();
    this.jdField_a_of_type_Long = 0L;
    this.jdField_a_of_type_JavaUtilArrayList = new ArrayList();
    this.e = this.app.a();
    addObserver(this.jdField_a_of_type_ComTencentMobileqqAppTroopObserver);
    addObserver(this.jdField_a_of_type_ComTencentMobileqqAppFriendListObserver);
    c();
    return true;
  }
  
  protected void doOnDestroy()
  {
    removeObserver(this.jdField_a_of_type_ComTencentMobileqqAppTroopObserver);
    removeObserver(this.jdField_a_of_type_ComTencentMobileqqAppFriendListObserver);
    if (this.jdField_a_of_type_ComTencentMobileqqWidgetQQProgressNotifier != null)
    {
      this.jdField_a_of_type_ComTencentMobileqqWidgetQQProgressNotifier.a();
      this.jdField_a_of_type_ComTencentMobileqqWidgetQQProgressNotifier = null;
    }
    super.doOnDestroy();
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    String str;
    if ((paramInt1 == 0) && (paramIntent != null))
    {
      boolean bool = paramIntent.getBooleanExtra("isNeedFinish", false);
      str = paramIntent.getStringExtra("fin_tip_msg");
      paramIntent = paramIntent.getStringExtra("uin");
      if (QLog.isColorLevel()) {
        QLog.i("Q.troopdisband.disband", 2, "onActivityResult|REQUEST_FOR_TROOP_TRANSFER|isNeedFinish = " + bool + ", strTip = " + str);
      }
      if (!bool) {
        break label126;
      }
      localIntent = new Intent();
      localIntent.putExtra("fin_tip_msg", str);
      localIntent.putExtra("uin", paramIntent);
      setResult(paramInt2, localIntent);
      finish();
    }
    label126:
    while (TextUtils.isEmpty(str))
    {
      Intent localIntent;
      return;
    }
    if (this.jdField_a_of_type_ComTencentMobileqqWidgetQQProgressNotifier == null) {
      this.jdField_a_of_type_ComTencentMobileqqWidgetQQProgressNotifier = new QQProgressNotifier(this);
    }
    this.jdField_a_of_type_ComTencentMobileqqWidgetQQProgressNotifier.a(1, str, 1500);
  }
  
  public void onClick(View paramView)
  {
    int j = 1;
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131302568: 
    case 2131302574: 
      if (this.jdField_a_of_type_ComTencentMobileqqDataTroopInfo != null) {}
      for (paramView = this.jdField_a_of_type_ComTencentMobileqqDataTroopInfo.troopuin;; paramView = this.jdField_b_of_type_JavaLangString)
      {
        startActivity(TroopMemberListActivity.a(this, paramView, 4));
        try
        {
          ReportController.b(this.app, "P_CliOper", "Grp_mber", "", "mber_list", "Clk_mberlist", 0, 0, paramView, "1", "0", "");
          return;
        }
        catch (Exception paramView)
        {
          return;
        }
      }
    case 2131302576: 
      int i = j;
      if (this.jdField_a_of_type_ComTencentMobileqqDataTroopInfo != null)
      {
        i = j;
        if (this.jdField_a_of_type_ComTencentMobileqqDataTroopInfo.wMemberNum <= 1) {
          i = 0;
        }
      }
      if (this.jdField_a_of_type_ComTencentMobileqqWidgetQQProgressNotifier == null) {
        this.jdField_a_of_type_ComTencentMobileqqWidgetQQProgressNotifier = new QQProgressNotifier(this);
      }
      if ((i != 0) && (NetworkUtil.e(this)))
      {
        paramView = (TroopHandler)this.app.a(20);
        if (paramView != null) {
          if ((this.jdField_d_of_type_Int & 0x2) != 0) {}
        }
      }
      for (;;)
      {
        try
        {
          long l = Long.parseLong(this.jdField_b_of_type_JavaLangString);
          this.jdField_d_of_type_Int |= 0x2;
          this.jdField_a_of_type_Long = 0L;
          this.jdField_a_of_type_JavaUtilArrayList.clear();
          paramView.a(l, this.jdField_a_of_type_Long, 4, null, 0, 0);
          this.jdField_a_of_type_ComTencentMobileqqWidgetQQProgressNotifier.a(0, 2131369423, 1000);
          ReportController.b(this.app, "CliOper", "", "", "Grp", "Clk_transgrp", 0, 0, "", "", "", "");
          return;
        }
        catch (Exception paramView)
        {
          if (!QLog.isColorLevel()) {
            continue;
          }
          QLog.i("Q.troopdisband.disband", 2, paramView.toString());
          continue;
        }
        this.jdField_a_of_type_ComTencentMobileqqWidgetQQProgressNotifier.a(2, 2131369424, 1500);
        continue;
        if (i != 0) {
          this.jdField_a_of_type_ComTencentMobileqqWidgetQQProgressNotifier.a(2, 2131368805, 1500);
        } else {
          this.jdField_a_of_type_ComTencentMobileqqWidgetQQProgressNotifier.a(2, 2131369415, 1500);
        }
      }
    }
    paramView = getString(2131368720);
    String str = getString(2131368713);
    QQCustomDialog localQQCustomDialog = DialogUtil.a(this, 230);
    localQQCustomDialog.setTitle(paramView);
    localQQCustomDialog.setMessage(str);
    localQQCustomDialog.setPositiveButton(getString(2131368714), new mqc(this, localQQCustomDialog));
    localQQCustomDialog.setPositiveButtonContentDescription(getString(2131362031));
    localQQCustomDialog.setNegativeButton(getString(2131367262), new mqd(this));
    localQQCustomDialog.setNegativeButtonContentDescription(getString(2131362032));
    localQQCustomDialog.show();
    ReportController.b(this.app, "CliOper", "", "", "Grp", "Clk_dismiss_grp", 0, 0, "", "", "", "");
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    b();
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\tencent\mobileqq\activity\TroopDisbandActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */