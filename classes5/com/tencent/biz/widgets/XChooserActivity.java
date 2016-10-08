package com.tencent.biz.widgets;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.pm.ResolveInfo.DisplayNameComparator;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mobileqq.app.ThreadManager;
import com.tencent.mobileqq.filemanager.util.UniformDownloadUtil;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.util.Utils;
import com.tencent.mobileqq.widget.QQToast;
import com.tencent.qphone.base.util.QLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import jjt;
import jju;
import jjv;
import jjw;
import jjx;
import jkb;
import jkc;
import jke;

public class XChooserActivity
  extends Activity
  implements View.OnClickListener, AdapterView.OnItemClickListener
{
  static final int jdField_a_of_type_Int = 52428800;
  public static final String a;
  static final String jdField_b_of_type_JavaLangString = "EXTRA_RECOMMEND_LIST";
  public static final String c = "EXTRA_PACKAGE_NAME";
  public static final String d = "EXTRA_ICON_ID";
  public static final String e = "EXTRA_TITLE";
  public static final String f = "EXTRA_DESC";
  public static final String g = "EXTRA_URL";
  public static final String h = "EXTRA_TYPE";
  public static final String i = "android.intent.action.VIEW";
  public static final String j = "com.tencent.mobileqq.action.ACTION_QB_REPORT";
  public static final String k = "com.tencent.msg.permission.pushnotify";
  static final String l = "KEY_LAST_INSTALLED_POSITION";
  Intent jdField_a_of_type_AndroidContentIntent;
  public PackageManager a;
  public ListView a;
  TextView jdField_a_of_type_AndroidWidgetTextView;
  public Runnable a;
  public Map a;
  public jke a;
  Bundle[] jdField_a_of_type_ArrayOfAndroidOsBundle;
  public int b;
  TextView jdField_b_of_type_AndroidWidgetTextView;
  public String m;
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    jdField_a_of_type_JavaLangString = XChooserActivity.class.getSimpleName();
  }
  
  public XChooserActivity()
  {
    this.jdField_a_of_type_JavaUtilMap = new HashMap();
    this.jdField_a_of_type_JavaLangRunnable = new jjt(this);
    this.jdField_b_of_type_Int = -1;
  }
  
  public static String a(String paramString)
  {
    int n = 0;
    int i1 = paramString.length();
    for (;;)
    {
      if (n < i1)
      {
        int i2 = paramString.charAt(n);
        if ((i2 == 32) || (i2 == 160)) {}
      }
      else
      {
        return paramString.substring(n);
      }
      n += 1;
    }
  }
  
  public static void a(Context paramContext, Intent paramIntent, int paramInt, String paramString1, String paramString2, Bundle[] paramArrayOfBundle)
  {
    Intent localIntent = new Intent(paramContext, XChooserActivity.class);
    localIntent.putExtra("android.intent.extra.INTENT", paramIntent);
    localIntent.putExtra("EXTRA_TYPE", paramString1);
    if (paramString2 != null) {
      localIntent.putExtra("android.intent.extra.TITLE", paramString2);
    }
    if ((paramArrayOfBundle != null) && (paramArrayOfBundle.length > 0)) {
      localIntent.putExtra("EXTRA_RECOMMEND_LIST", paramArrayOfBundle);
    }
    if ((paramContext instanceof Activity))
    {
      ((Activity)paramContext).startActivityForResult(localIntent, paramInt);
      ((Activity)paramContext).overridePendingTransition(0, 0);
      return;
    }
    localIntent.addFlags(268435456);
    paramContext.startActivity(localIntent);
  }
  
  static void a(Intent paramIntent)
  {
    if ("android.intent.action.VIEW".equals(paramIntent.getAction()))
    {
      ComponentName localComponentName = paramIntent.getComponent();
      if ((localComponentName != null) && ("com.tencent.mtt".equals(localComponentName.getPackageName())))
      {
        if (QLog.isColorLevel()) {
          QLog.d(jdField_a_of_type_JavaLangString, 2, "specialLogicForStartQQBrowser: true");
        }
        paramIntent.setAction("com.tencent.QQBrowser.action.VIEW");
        paramIntent.putExtra("KEY_PID", "50079");
      }
    }
  }
  
  public Drawable a(ResolveInfo paramResolveInfo)
  {
    try
    {
      Drawable localDrawable;
      if ((paramResolveInfo.resolvePackageName != null) && (paramResolveInfo.icon != 0))
      {
        localDrawable = a(this.jdField_a_of_type_AndroidContentPmPackageManager.getResourcesForApplication(paramResolveInfo.resolvePackageName), paramResolveInfo.icon);
        if (localDrawable != null) {
          return localDrawable;
        }
      }
      int n = paramResolveInfo.getIconResource();
      if (n != 0)
      {
        localDrawable = a(this.jdField_a_of_type_AndroidContentPmPackageManager.getResourcesForApplication(paramResolveInfo.activityInfo.packageName), n);
        if (localDrawable != null) {
          return ???;
        }
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        if (QLog.isColorLevel()) {
          QLog.e(jdField_a_of_type_JavaLangString, 2, "Couldn't find resources for package", localNameNotFoundException);
        }
      }
      return localNameNotFoundException;
    }
    return paramResolveInfo.loadIcon(this.jdField_a_of_type_AndroidContentPmPackageManager);
  }
  
  Drawable a(Resources paramResources, int paramInt)
  {
    try
    {
      paramResources = paramResources.getDrawable(paramInt);
      return paramResources;
    }
    catch (Resources.NotFoundException paramResources) {}
    return null;
  }
  
  public List a(Intent paramIntent)
  {
    paramIntent = this.jdField_a_of_type_AndroidContentPmPackageManager.queryIntentActivities(paramIntent, 65600);
    if (QLog.isColorLevel()) {
      QLog.d(jdField_a_of_type_JavaLangString, 2, "queryIntentActivities: " + paramIntent.toString());
    }
    int n;
    int i1;
    int i2;
    label68:
    Object localObject;
    if (paramIntent == null)
    {
      n = 0;
      i1 = n;
      if (n <= 0) {
        break label190;
      }
      i2 = n - 1;
      i1 = n;
      if (i2 < 0) {
        break label190;
      }
      localObject = (ResolveInfo)paramIntent.get(i2);
      if (QLog.isColorLevel()) {
        QLog.d(jdField_a_of_type_JavaLangString, 2, ((ResolveInfo)localObject).activityInfo.name + "=" + ((ResolveInfo)localObject).priority + "/" + ((ResolveInfo)localObject).isDefault);
      }
      if (((ResolveInfo)localObject).priority >= 0) {
        break label396;
      }
      n -= 1;
      paramIntent.remove(i2);
    }
    label190:
    label263:
    label390:
    label396:
    for (;;)
    {
      i2 -= 1;
      break label68;
      n = paramIntent.size();
      break;
      localObject = new ArrayList();
      Bundle localBundle;
      if (this.jdField_a_of_type_ArrayOfAndroidOsBundle != null)
      {
        Iterator localIterator = Arrays.asList(this.jdField_a_of_type_ArrayOfAndroidOsBundle).iterator();
        n = i1;
        String str;
        do
        {
          i1 = n;
          if (!localIterator.hasNext()) {
            break;
          }
          localBundle = (Bundle)localIterator.next();
          str = localBundle.getString("EXTRA_PACKAGE_NAME");
        } while (str == null);
        i1 = 0;
        if (i1 >= n) {
          break label390;
        }
        ResolveInfo localResolveInfo = (ResolveInfo)paramIntent.get(i1);
        if (str.equals(localResolveInfo.activityInfo.applicationInfo.packageName))
        {
          ((List)localObject).add(localResolveInfo);
          paramIntent.remove(i1);
          n -= 1;
        }
      }
      for (i1 = 1;; i1 = 0)
      {
        if (i1 == 0) {
          ((List)localObject).add(localBundle);
        }
        break;
        i1 += 1;
        break label263;
        if (i1 > 1) {
          Collections.sort(paramIntent, new ResolveInfo.DisplayNameComparator(this.jdField_a_of_type_AndroidContentPmPackageManager));
        }
        if (paramIntent != null) {
          ((List)localObject).addAll(paramIntent);
        }
        return (List)localObject;
      }
    }
  }
  
  void a(int paramInt)
  {
    if (paramInt != -1)
    {
      Object localObject = this.jdField_a_of_type_Jke.getItem(paramInt);
      if (((localObject instanceof jkb)) && ("com.tencent.mtt".equals(((jkb)localObject).b))) {
        sendOrderedBroadcast(new Intent("com.tencent.mobileqq.action.ACTION_QB_REPORT"), "com.tencent.msg.permission.pushnotify");
      }
    }
  }
  
  void a(String paramString, jkc paramjkc, int paramInt)
  {
    int n = getResources().getDimensionPixelSize(2131492908);
    if (Utils.b() < 52428800L) {
      QQToast.a(getApplicationContext(), 1, 2131364918, 1).b(n);
    }
    do
    {
      return;
      paramString = new jjx(this, paramString, paramjkc, n, paramInt);
    } while ((!paramjkc.jdField_a_of_type_JavaUtilConcurrentAtomicAtomicInteger.compareAndSet(0, 1)) && (!paramjkc.jdField_a_of_type_JavaUtilConcurrentAtomicAtomicInteger.compareAndSet(2, 1)) && (!paramjkc.jdField_a_of_type_JavaUtilConcurrentAtomicAtomicInteger.compareAndSet(4, 1)));
    runOnUiThread(this.jdField_a_of_type_JavaLangRunnable);
    ThreadManager.d(paramString);
  }
  
  void a(jkb paramjkb, boolean paramBoolean)
  {
    Intent localIntent = new Intent(this.jdField_a_of_type_AndroidContentIntent);
    paramjkb = paramjkb.a.activityInfo;
    localIntent.setComponent(new ComponentName(paramjkb.applicationInfo.packageName, paramjkb.name));
    if ((paramBoolean) && (!TextUtils.isEmpty(this.m))) {
      ThreadManager.b(new jjv(this, paramjkb));
    }
    localIntent.addFlags(50331648);
    a(localIntent);
    startActivity(localIntent);
    finish();
  }
  
  public void finish()
  {
    super.finish();
    overridePendingTransition(0, 0);
  }
  
  public void onClick(View paramView)
  {
    int n = -1;
    if (paramView.getId() == 2131297387)
    {
      localObject = paramView.getTag();
      if ((localObject instanceof String)) {}
    }
    do
    {
      do
      {
        do
        {
          String str;
          do
          {
            return;
            str = (String)localObject;
          } while (TextUtils.isEmpty(str));
          jkc localjkc = (jkc)this.jdField_a_of_type_JavaUtilMap.get(str);
          localObject = localjkc;
          if (localjkc == null)
          {
            localObject = new jkc();
            this.jdField_a_of_type_JavaUtilMap.put(str, localObject);
          }
          if ((((jkc)localObject).jdField_a_of_type_JavaUtilConcurrentAtomicAtomicInteger.get() == 0) || (((jkc)localObject).jdField_a_of_type_JavaUtilConcurrentAtomicAtomicInteger.get() == 2) || (((jkc)localObject).jdField_a_of_type_JavaUtilConcurrentAtomicAtomicInteger.get() == 4))
          {
            if (paramView.getParent() != null) {
              n = this.jdField_a_of_type_AndroidWidgetListView.getPositionForView(paramView);
            }
            a(str, (jkc)localObject, n);
            a(n);
            return;
          }
          if (((jkc)localObject).jdField_a_of_type_JavaUtilConcurrentAtomicAtomicInteger.compareAndSet(1, 2))
          {
            paramView = new jjw(this, (jkc)localObject);
            runOnUiThread(this.jdField_a_of_type_JavaLangRunnable);
            ThreadManager.d(paramView);
            return;
          }
        } while (((jkc)localObject).jdField_a_of_type_JavaUtilConcurrentAtomicAtomicInteger.get() != 3);
        if (paramView.getParent() != null) {
          n = this.jdField_a_of_type_AndroidWidgetListView.getPositionForView(paramView);
        }
        this.jdField_b_of_type_Int = n;
        UniformDownloadUtil.a(((jkc)localObject).b);
        return;
        n = this.jdField_a_of_type_AndroidWidgetListView.getCheckedItemPosition();
      } while (n == -1);
      localObject = this.jdField_a_of_type_Jke.getItem(n);
    } while (!(localObject instanceof jkb));
    Object localObject = (jkb)localObject;
    if (paramView == this.jdField_b_of_type_AndroidWidgetTextView) {}
    for (boolean bool = true;; bool = false)
    {
      a((jkb)localObject, bool);
      return;
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    if (QLog.isColorLevel()) {
      QLog.d(jdField_a_of_type_JavaLangString, 2, "onCreate");
    }
    super.onCreate(paramBundle);
    Object localObject2 = getIntent();
    Object localObject1 = ((Intent)localObject2).getParcelableExtra("android.intent.extra.INTENT");
    if (!(localObject1 instanceof Intent))
    {
      if (QLog.isColorLevel()) {
        QLog.w(jdField_a_of_type_JavaLangString, 2, "Target is not an intent: " + localObject1);
      }
      finish();
      return;
    }
    this.jdField_a_of_type_AndroidContentIntent = ((Intent)localObject1);
    localObject1 = getPreferences(0);
    int n;
    try
    {
      this.m = ((Intent)localObject2).getStringExtra("EXTRA_TYPE");
      localObject1 = ((SharedPreferences)localObject1).getString(this.m, null);
      if (!TextUtils.isEmpty((CharSequence)localObject1))
      {
        if (QLog.isColorLevel()) {
          QLog.d(jdField_a_of_type_JavaLangString, 2, "always option:" + (String)localObject1);
        }
        n = ((String)localObject1).indexOf('/');
        Intent localIntent = new Intent(this.jdField_a_of_type_AndroidContentIntent);
        localIntent.addFlags(50331648);
        localIntent.setComponent(new ComponentName(((String)localObject1).substring(0, n), ((String)localObject1).substring(n + 1)));
        a(localIntent);
        startActivity(localIntent);
        finish();
        return;
      }
    }
    catch (Throwable localThrowable)
    {
      localThrowable.printStackTrace();
      localCharSequence = ((Intent)localObject2).getCharSequenceExtra("android.intent.extra.TITLE");
      if (!TextUtils.isEmpty(localCharSequence)) {
        break label728;
      }
    }
    CharSequence localCharSequence = getResources().getText(2131365061);
    label728:
    for (;;)
    {
      localObject2 = ((Intent)localObject2).getParcelableArrayExtra("EXTRA_RECOMMEND_LIST");
      if ((localObject2 != null) && (localObject2.length > 0))
      {
        this.jdField_a_of_type_ArrayOfAndroidOsBundle = new Bundle[localObject2.length];
        n = 0;
        while (n < localObject2.length)
        {
          if (!(localObject2[n] instanceof Bundle))
          {
            if (QLog.isColorLevel()) {
              QLog.w(jdField_a_of_type_JavaLangString, 2, "Initial intent #" + n + " not an Intent: " + localObject2[n]);
            }
            finish();
            return;
          }
          this.jdField_a_of_type_ArrayOfAndroidOsBundle[n] = ((Bundle)localObject2[n]);
          n += 1;
        }
      }
      if (QLog.isColorLevel()) {
        QLog.d(jdField_a_of_type_JavaLangString, 2, "init UI");
      }
      this.jdField_a_of_type_AndroidContentPmPackageManager = getPackageManager();
      localObject2 = (ActivityManager)getSystemService("activity");
      setContentView(2130903723);
      ((TextView)findViewById(2131297386)).setText(localCharSequence);
      this.jdField_b_of_type_AndroidWidgetTextView = ((TextView)findViewById(2131299850));
      this.jdField_b_of_type_AndroidWidgetTextView.setText(2131364909);
      this.jdField_b_of_type_AndroidWidgetTextView.setOnClickListener(this);
      this.jdField_b_of_type_AndroidWidgetTextView.setEnabled(false);
      this.jdField_a_of_type_AndroidWidgetTextView = ((TextView)findViewById(2131299851));
      this.jdField_a_of_type_AndroidWidgetTextView.setText(2131364910);
      this.jdField_a_of_type_AndroidWidgetTextView.setOnClickListener(this);
      this.jdField_a_of_type_AndroidWidgetTextView.setEnabled(false);
      this.jdField_a_of_type_AndroidWidgetListView = new ListView(this);
      this.jdField_a_of_type_AndroidWidgetListView.setCacheColorHint(0);
      this.jdField_a_of_type_Jke = new jke(this, this.jdField_a_of_type_AndroidContentIntent);
      this.jdField_a_of_type_AndroidWidgetListView.setAdapter(this.jdField_a_of_type_Jke);
      this.jdField_a_of_type_AndroidWidgetListView.setDividerHeight(0);
      this.jdField_a_of_type_AndroidWidgetListView.setDivider(null);
      ((ViewGroup)findViewById(2131299848)).addView(this.jdField_a_of_type_AndroidWidgetListView, new LinearLayout.LayoutParams(-1, -1));
      this.jdField_a_of_type_AndroidWidgetListView.setChoiceMode(1);
      this.jdField_a_of_type_AndroidWidgetListView.setOnItemClickListener(this);
      if (paramBundle == null) {
        break;
      }
      try
      {
        n = paramBundle.getInt("KEY_LAST_INSTALLED_POSITION", -1);
        if ((n < 0) || (n >= this.jdField_a_of_type_Jke.getCount()) || (!this.jdField_a_of_type_Jke.isEnabled(n))) {
          break;
        }
        if (QLog.isColorLevel()) {
          QLog.d(jdField_a_of_type_JavaLangString, 2, "found last installed position from savedInstance:" + n);
        }
        this.jdField_a_of_type_AndroidWidgetListView.setItemChecked(n, true);
        this.jdField_b_of_type_AndroidWidgetTextView.setEnabled(true);
        this.jdField_a_of_type_AndroidWidgetTextView.setEnabled(true);
        return;
      }
      catch (Throwable paramBundle)
      {
        paramBundle.printStackTrace();
        return;
      }
    }
  }
  
  protected void onDestroy()
  {
    if (QLog.isColorLevel()) {
      QLog.d(jdField_a_of_type_JavaLangString, 2, "onDestroy");
    }
    Iterator localIterator = this.jdField_a_of_type_JavaUtilMap.values().iterator();
    while (localIterator.hasNext())
    {
      jkc localjkc = (jkc)localIterator.next();
      if (localjkc.jdField_a_of_type_JavaUtilConcurrentAtomicAtomicInteger.compareAndSet(1, 2)) {
        ThreadManager.d(new jju(this, localjkc.jdField_a_of_type_JavaLangString));
      }
    }
    super.onDestroy();
  }
  
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.jdField_a_of_type_Jke.notifyDataSetChanged();
    this.jdField_b_of_type_AndroidWidgetTextView.setEnabled(true);
    this.jdField_a_of_type_AndroidWidgetTextView.setEnabled(true);
  }
  
  protected void onRestart()
  {
    if (QLog.isColorLevel()) {
      QLog.d(jdField_a_of_type_JavaLangString, 2, "onRestart");
    }
    super.onRestart();
    jke.a(this.jdField_a_of_type_Jke);
    if (this.jdField_a_of_type_Jke.getCount() == 0)
    {
      if (QLog.isColorLevel()) {
        QLog.d(jdField_a_of_type_JavaLangString, 2, "list is empty, goto finish");
      }
      finish();
      return;
    }
    if ((this.jdField_b_of_type_Int >= 0) && (this.jdField_b_of_type_Int < this.jdField_a_of_type_Jke.getCount()) && (this.jdField_a_of_type_Jke.isEnabled(this.jdField_b_of_type_Int)))
    {
      if (QLog.isColorLevel()) {
        QLog.d(jdField_a_of_type_JavaLangString, 2, "found last installed position from var:" + this.jdField_b_of_type_Int);
      }
      this.jdField_a_of_type_AndroidWidgetListView.setItemChecked(this.jdField_b_of_type_Int, true);
      this.jdField_b_of_type_AndroidWidgetTextView.setEnabled(true);
      this.jdField_a_of_type_AndroidWidgetTextView.setEnabled(true);
    }
    this.jdField_b_of_type_Int = -1;
    this.jdField_a_of_type_Jke.notifyDataSetChanged();
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    if (QLog.isColorLevel()) {
      QLog.d(jdField_a_of_type_JavaLangString, 2, "onSaveInstanceState");
    }
    paramBundle.putInt("KEY_LAST_INSTALLED_POSITION", this.jdField_b_of_type_Int);
    super.onSaveInstanceState(paramBundle);
  }
  
  protected void onStop()
  {
    if (QLog.isColorLevel()) {
      QLog.d(jdField_a_of_type_JavaLangString, 2, "onStop");
    }
    super.onStop();
    if (((getIntent().getFlags() & 0x10000000) != 0) && ((Build.VERSION.SDK_INT < 11) || (!isChangingConfigurations()))) {
      finish();
    }
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\com\tencent\biz\widgets\XChooserActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */