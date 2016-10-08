package com.tencent.mobileqq.activity;

import android.os.Bundle;
import android.os.Environment;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import com.tencent.mobileqq.app.BaseActivity;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import mhi;
import mhj;
import mqq.observer.AccountObserver;

public class QuickLoginActivity
  extends BaseActivity
{
  private static final String jdField_a_of_type_JavaLangString = "QuickLogin";
  ListView jdField_a_of_type_AndroidWidgetListView;
  SimpleAdapter jdField_a_of_type_AndroidWidgetSimpleAdapter;
  public ArrayList a;
  private AccountObserver jdField_a_of_type_MqqObserverAccountObserver;
  
  public QuickLoginActivity()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_MqqObserverAccountObserver = new mhj(this);
  }
  
  private void a()
  {
    this.jdField_a_of_type_AndroidWidgetListView = ((ListView)findViewById(2131296848));
    this.jdField_a_of_type_JavaUtilArrayList = new ArrayList();
    c();
    b();
  }
  
  private void b()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.jdField_a_of_type_JavaUtilArrayList.iterator();
    while (localIterator.hasNext())
    {
      HashMap localHashMap1 = (HashMap)localIterator.next();
      HashMap localHashMap2 = new HashMap();
      localHashMap2.put("text", (String)localHashMap1.get("qq") + " " + (String)localHashMap1.get("password"));
      localArrayList.add(localHashMap2);
    }
    this.jdField_a_of_type_AndroidWidgetSimpleAdapter = new SimpleAdapter(this, localArrayList, 2130903051, new String[] { "text" }, new int[] { 2131296849 });
    this.jdField_a_of_type_AndroidWidgetListView.setAdapter(this.jdField_a_of_type_AndroidWidgetSimpleAdapter);
    this.jdField_a_of_type_AndroidWidgetListView.setOnItemClickListener(new mhi(this));
  }
  
  private void c()
  {
    Object localObject = new File(Environment.getExternalStorageDirectory().getPath() + "/tencent/com/tencent/mobileqq/quicklogin.txt");
    if (((File)localObject).exists()) {
      try
      {
        BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream((File)localObject)));
        for (localObject = localBufferedReader.readLine(); localObject != null; localObject = localBufferedReader.readLine())
        {
          localObject = ((String)localObject).split(" ");
          if (localObject.length == 2)
          {
            HashMap localHashMap = new HashMap();
            localHashMap.put("qq", localObject[0]);
            localHashMap.put("password", localObject[1]);
            this.jdField_a_of_type_JavaUtilArrayList.add(localHashMap);
          }
        }
        return;
      }
      catch (IOException localIOException)
      {
        localIOException.printStackTrace();
      }
    }
  }
  
  protected boolean doOnCreate(Bundle paramBundle)
  {
    super.doOnCreate(paramBundle);
    super.setContentView(2130903050);
    a();
    return true;
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\tencent\mobileqq\activity\QuickLoginActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */