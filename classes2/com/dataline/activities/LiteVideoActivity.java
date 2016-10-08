package com.dataline.activities;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.WindowManager;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.TextView;
import bz;
import ca;
import cb;
import cc;
import cd;
import com.dataline.util.file.FileUtil;
import com.dataline.util.file.ImageInfo;
import com.dataline.util.file.SendInfo;
import com.tencent.mobileqq.app.DataLineHandler;
import com.tencent.mobileqq.app.IphoneTitleBarActivity;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.filemanager.util.FMDialogUtil;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.widget.QQToast;
import com.tencent.qphone.base.util.BaseApplication;
import com.tencent.qphone.base.util.QLog;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;

public class LiteVideoActivity
  extends IphoneTitleBarActivity
{
  public static String a;
  private static Comparator jdField_a_of_type_JavaUtilComparator = new cd();
  public static final String b = "NEED_WARNING_WHEN_OVER_5M_IN_G234";
  private static int jdField_c_of_type_Int = 0;
  private static final int e = 4;
  int jdField_a_of_type_Int;
  private DisplayMetrics jdField_a_of_type_AndroidUtilDisplayMetrics;
  private AdapterView.OnItemClickListener jdField_a_of_type_AndroidWidgetAdapterView$OnItemClickListener = new cc(this);
  private GridView jdField_a_of_type_AndroidWidgetGridView;
  private TextView jdField_a_of_type_AndroidWidgetTextView;
  private LiteVideoActivity.ImageAdapter jdField_a_of_type_ComDatalineActivitiesLiteVideoActivity$ImageAdapter;
  private ArrayList jdField_a_of_type_JavaUtilArrayList = new ArrayList();
  public boolean a;
  int jdField_b_of_type_Int;
  private TextView jdField_b_of_type_AndroidWidgetTextView;
  private ArrayList jdField_b_of_type_JavaUtilArrayList = new ArrayList();
  private boolean jdField_b_of_type_Boolean;
  private String jdField_c_of_type_JavaLangString;
  private int d;
  private int f;
  private int g;
  private int h;
  private int i = 20;
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    jdField_a_of_type_JavaLangString = "LiteVideoActivity";
    jdField_c_of_type_Int = 3145728;
  }
  
  public LiteVideoActivity()
  {
    this.jdField_a_of_type_Boolean = true;
  }
  
  private void a()
  {
    Object localObject = ((WindowManager)getSystemService("window")).getDefaultDisplay();
    this.h = getResources().getDimensionPixelSize(2131493033);
    this.f = getResources().getDimensionPixelSize(2131493031);
    this.g = getResources().getDimensionPixelSize(2131493032);
    this.jdField_a_of_type_Int = ((((Display)localObject).getWidth() - this.h * 2 - this.f * 3) / 4);
    this.jdField_b_of_type_Int = this.jdField_a_of_type_Int;
    localObject = getIntent();
    if (localObject != null) {
      this.jdField_a_of_type_Boolean = ((Intent)localObject).getBooleanExtra("NEED_WARNING_WHEN_OVER_5M_IN_G234", true);
    }
  }
  
  private void a(ImageInfo paramImageInfo)
  {
    if ((!this.jdField_a_of_type_JavaUtilArrayList.contains(paramImageInfo)) && (this.jdField_a_of_type_JavaUtilArrayList.add(paramImageInfo))) {
      g();
    }
    if ((this.rightViewText != null) && (this.jdField_a_of_type_JavaUtilArrayList.size() > 0)) {
      enableRightHighlight(true);
    }
  }
  
  private boolean a()
  {
    return super.onBackEvent();
  }
  
  private boolean a(ImageInfo paramImageInfo)
  {
    return this.jdField_a_of_type_JavaUtilArrayList.contains(paramImageInfo);
  }
  
  private boolean a(String paramString)
  {
    if (!new File(paramString).exists())
    {
      f();
      return false;
    }
    return true;
  }
  
  private int b()
  {
    return this.jdField_a_of_type_JavaUtilArrayList.size();
  }
  
  private void b()
  {
    setTitle(2131362139);
    if (this.jdField_a_of_type_AndroidWidgetTextView == null) {
      this.jdField_a_of_type_AndroidWidgetTextView = ((TextView)findViewById(2131297139));
    }
    this.jdField_b_of_type_AndroidWidgetTextView = this.leftView;
    if (this.jdField_b_of_type_AndroidWidgetTextView != null) {
      this.jdField_b_of_type_AndroidWidgetTextView.setOnClickListener(new bz(this));
    }
    setRightHighlightButton(2131362146, new ca(this));
    if (b() == 0)
    {
      enableRightHighlight(false);
      return;
    }
    enableRightHighlight(true);
  }
  
  private void b(ImageInfo paramImageInfo)
  {
    if (this.jdField_a_of_type_JavaUtilArrayList.remove(paramImageInfo)) {
      g();
    }
    if ((this.rightViewText != null) && (this.jdField_a_of_type_JavaUtilArrayList.size() == 0)) {
      enableRightHighlight(false);
    }
  }
  
  private boolean b()
  {
    if ((this.i > 0) && (b() >= this.i))
    {
      e();
      return false;
    }
    return true;
  }
  
  private void c()
  {
    Intent localIntent = new Intent();
    localIntent.putParcelableArrayListExtra("sendInfo", this.jdField_b_of_type_JavaUtilArrayList);
    setResult(-1, localIntent);
    if (this.jdField_a_of_type_JavaUtilArrayList != null) {
      this.jdField_a_of_type_JavaUtilArrayList.clear();
    }
    super.finish();
  }
  
  private void d()
  {
    FMDialogUtil.a(getActivity(), 2131362855, 2131362851, new cb(this));
  }
  
  private void e()
  {
    QQToast localQQToast = new QQToast(this);
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
    localQQToast.a(2130838420);
    localQQToast.c(2000);
    localQQToast.a(String.format(this.app.a().getString(2131362148), new Object[] { Integer.valueOf(this.i) }));
    localQQToast.b(localDisplayMetrics.heightPixels / 2);
  }
  
  private void f()
  {
    QQToast localQQToast = new QQToast(this);
    localQQToast.a(2130838420);
    localQQToast.c(2000);
    localQQToast.b(2131362149);
    localQQToast.b(this.jdField_a_of_type_AndroidUtilDisplayMetrics.heightPixels / 2);
  }
  
  private void g()
  {
    int j = b();
    setTitle(this.jdField_c_of_type_JavaLangString + "(" + Integer.toString(j) + "/" + Integer.toString(this.i) + ")");
  }
  
  public SendInfo a(ImageInfo paramImageInfo)
  {
    SendInfo localSendInfo = null;
    String str3 = paramImageInfo.a();
    String str2 = FileUtil.b(this, str3);
    String str1 = str2;
    if (str2 == null) {
      str1 = FileUtil.a(this);
    }
    long l = ((DataLineHandler)this.app.a(8)).a(null, str1, 2, 0L, 0, 0, 0, false);
    if (a(paramImageInfo)) {
      localSendInfo = SendInfo.a(str3, str1, l);
    }
    if (QLog.isColorLevel()) {
      QLog.d(jdField_a_of_type_JavaLangString, 2, "mediaPath:" + str3 + ", thumbPath:" + str1 + ", msgId:" + l);
    }
    return localSendInfo;
  }
  
  public boolean doOnCreate(Bundle paramBundle)
  {
    super.doOnCreate(paramBundle);
    this.i = getIntent().getIntExtra("maxCount", 20);
    setContentView(2130903279);
    b();
    a();
    this.jdField_c_of_type_JavaLangString = ((String)getResources().getText(2131362139));
    this.jdField_a_of_type_AndroidWidgetGridView = ((GridView)findViewById(2131296687));
    this.jdField_a_of_type_AndroidWidgetGridView.setSelector(new ColorDrawable(0));
    this.jdField_a_of_type_AndroidWidgetGridView.setScrollBarStyle(0);
    this.jdField_a_of_type_AndroidWidgetGridView.setNumColumns(4);
    this.jdField_a_of_type_AndroidWidgetGridView.setColumnWidth(this.jdField_a_of_type_Int);
    this.jdField_a_of_type_AndroidWidgetGridView.setHorizontalSpacing(this.f);
    this.jdField_a_of_type_AndroidWidgetGridView.setVerticalSpacing(this.g);
    this.jdField_a_of_type_AndroidWidgetGridView.setPadding(this.h, this.jdField_a_of_type_AndroidWidgetGridView.getPaddingTop(), this.h, this.jdField_a_of_type_AndroidWidgetGridView.getPaddingBottom());
    this.jdField_a_of_type_ComDatalineActivitiesLiteVideoActivity$ImageAdapter = new LiteVideoActivity.ImageAdapter(this, this);
    this.jdField_a_of_type_AndroidWidgetGridView.setAdapter(this.jdField_a_of_type_ComDatalineActivitiesLiteVideoActivity$ImageAdapter);
    this.jdField_a_of_type_AndroidWidgetGridView.setOnItemClickListener(this.jdField_a_of_type_AndroidWidgetAdapterView$OnItemClickListener);
    return true;
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      setResult(0, null);
      super.finish();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\dataline\activities\LiteVideoActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */