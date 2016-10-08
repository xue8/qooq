package com.tencent.mobileqq.dating;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.mobileqq.activity.QQBrowserActivity;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.ThreadManager;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.statistics.ReportController;
import com.tencent.mobileqq.struct.AdData;
import com.tencent.mobileqq.transfile.URLDrawableHelper;
import com.tencent.mobileqq.utils.FileUtils;
import com.tencent.mobileqq.utils.JumpAction;
import com.tencent.mobileqq.utils.JumpParser;
import com.tencent.mobileqq.widget.CarrierADView;
import com.tencent.widget.BorderTextView;
import com.tencent.widget.SingleLineTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import mqq.os.MqqHandler;
import rcu;

public class CarrierHelper
  implements View.OnClickListener
{
  public static final int a = 0;
  public static final String a = "CarrierHelper";
  public static final boolean a = false;
  private static final String[] jdField_a_of_type_ArrayOfJavaLangString = { "特别推荐", "约会的推荐", "附近的群的推荐", "活动的推荐", "热聊的推荐", "特别推荐", "排行榜的推荐" };
  public static final int b = 1;
  public static final String b = "carrier";
  public static final int c = 2;
  public static final String c = "msglist_carrier_5.8";
  public static final int d = 0;
  public static final int e = 1;
  public static final int f = 2;
  float jdField_a_of_type_Float = 0.0F;
  private Activity jdField_a_of_type_AndroidAppActivity;
  private View.OnClickListener jdField_a_of_type_AndroidViewView$OnClickListener;
  private QQAppInterface jdField_a_of_type_ComTencentMobileqqAppQQAppInterface;
  private CarrierADView jdField_a_of_type_ComTencentMobileqqWidgetCarrierADView;
  private ArrayList jdField_a_of_type_JavaUtilArrayList;
  private List jdField_a_of_type_JavaUtilList = new LinkedList();
  private boolean b;
  int g = 0;
  private int h;
  private int i = -1;
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public CarrierHelper(QQAppInterface paramQQAppInterface, View.OnClickListener paramOnClickListener, int paramInt)
  {
    this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface = paramQQAppInterface;
    this.jdField_a_of_type_AndroidViewView$OnClickListener = paramOnClickListener;
    this.h = paramInt;
    if (this.jdField_a_of_type_AndroidViewView$OnClickListener == null) {
      this.jdField_a_of_type_AndroidViewView$OnClickListener = this;
    }
  }
  
  public View a(IFlingSwitch paramIFlingSwitch)
  {
    View localView = LayoutInflater.from(BaseApplicationImpl.getContext()).inflate(2130904224, null);
    this.jdField_a_of_type_ComTencentMobileqqWidgetCarrierADView = ((CarrierADView)localView.findViewById(2131298831));
    this.jdField_a_of_type_ComTencentMobileqqWidgetCarrierADView.setContentDescription(",");
    this.jdField_a_of_type_ComTencentMobileqqWidgetCarrierADView.setFlingSwitch(paramIFlingSwitch);
    return localView;
  }
  
  public CarrierHelper.EntranceConfig a()
  {
    if (this.jdField_a_of_type_JavaUtilArrayList != null)
    {
      Iterator localIterator;
      CarrierHelper.EntranceConfig localEntranceConfig;
      if (this.h == 2)
      {
        localIterator = this.jdField_a_of_type_JavaUtilArrayList.iterator();
        do
        {
          if (!localIterator.hasNext()) {
            break;
          }
          localEntranceConfig = (CarrierHelper.EntranceConfig)localIterator.next();
        } while (localEntranceConfig.type != 2);
        return localEntranceConfig;
      }
      if (this.h == 1)
      {
        localIterator = this.jdField_a_of_type_JavaUtilArrayList.iterator();
        while (localIterator.hasNext())
        {
          localEntranceConfig = (CarrierHelper.EntranceConfig)localIterator.next();
          if (localEntranceConfig.type == 1) {
            return localEntranceConfig;
          }
        }
      }
    }
    return null;
  }
  
  public void a()
  {
    if ((this.b) || (this.jdField_a_of_type_ComTencentMobileqqWidgetCarrierADView == null) || (this.jdField_a_of_type_ComTencentMobileqqWidgetCarrierADView.getVisibility() != 0)) {}
    while (this.jdField_a_of_type_JavaUtilList.size() == 0) {
      return;
    }
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = this.jdField_a_of_type_JavaUtilList.iterator();
    while (localIterator.hasNext())
    {
      AdData localAdData = (AdData)localIterator.next();
      if ((localAdData != null) && (!localLinkedList.contains(Integer.valueOf(localAdData.ad_source)))) {
        localLinkedList.add(Integer.valueOf(localAdData.ad_source));
      }
    }
    ThreadManager.b().post(new rcu(this, localLinkedList));
  }
  
  public void a(int paramInt, Object paramObject)
  {
    switch (paramInt)
    {
    }
    do
    {
      do
      {
        do
        {
          return;
        } while ((this.jdField_a_of_type_ComTencentMobileqqWidgetCarrierADView == null) || (!(paramObject instanceof Boolean)));
        if (((Boolean)paramObject).booleanValue())
        {
          this.jdField_a_of_type_ComTencentMobileqqWidgetCarrierADView.setVisibility(0);
          return;
        }
        this.jdField_a_of_type_ComTencentMobileqqWidgetCarrierADView.setVisibility(8);
        return;
      } while ((this.jdField_a_of_type_ComTencentMobileqqWidgetCarrierADView == null) || (!(paramObject instanceof Boolean)));
      if (((Boolean)paramObject).booleanValue())
      {
        this.jdField_a_of_type_ComTencentMobileqqWidgetCarrierADView.h();
        return;
      }
      this.jdField_a_of_type_ComTencentMobileqqWidgetCarrierADView.i();
      return;
    } while ((this.jdField_a_of_type_ComTencentMobileqqWidgetCarrierADView == null) || (this.jdField_a_of_type_JavaUtilList == null) || (this.i == -1));
    this.jdField_a_of_type_ComTencentMobileqqWidgetCarrierADView.setCarrierData(this.jdField_a_of_type_JavaUtilList, this.i, this);
  }
  
  public void a(Activity paramActivity)
  {
    this.jdField_a_of_type_AndroidAppActivity = paramActivity;
    this.g = paramActivity.getResources().getDisplayMetrics().widthPixels;
    this.jdField_a_of_type_Float = paramActivity.getResources().getDisplayMetrics().density;
  }
  
  public void a(View paramView, AdData paramAdData)
  {
    Object localObject = (ImageView)paramView.findViewById(2131299515);
    BorderTextView localBorderTextView = (BorderTextView)paramView.findViewById(2131299520);
    SingleLineTextView localSingleLineTextView1 = (SingleLineTextView)paramView.findViewById(2131299519);
    SingleLineTextView localSingleLineTextView2 = (SingleLineTextView)paramView.findViewById(2131301881);
    TextView localTextView1 = (TextView)paramView.findViewById(2131299521);
    TextView localTextView2 = (TextView)paramView.findViewById(2131299522);
    View localView = paramView.findViewById(2131301882);
    localBorderTextView.setTextSize(1, 11.0F);
    localBorderTextView.setBorderWidth(Math.round(localBorderTextView.getResources().getDisplayMetrics().density * 1.0F));
    ((ImageView)localObject).setImageDrawable(URLDrawableHelper.a(paramAdData.img_url));
    int j;
    if ((paramAdData.wording != null) && (paramAdData.wording.length() > 0))
    {
      localBorderTextView.setText(paramAdData.wording);
      localBorderTextView.setTextColor(paramAdData.bgColor);
      localBorderTextView.setBorderColor(paramAdData.bgColor);
      localBorderTextView.setVisibility(0);
      if (TextUtils.isEmpty(paramAdData.distance)) {
        break label338;
      }
      localSingleLineTextView2.setText(paramAdData.distance);
      localSingleLineTextView2.setVisibility(0);
      j = Math.round(localBorderTextView.a().measureText(paramAdData.distance)) + 5 + 89;
      label210:
      localSingleLineTextView1.setMaxWidth((int)(this.g - j * this.jdField_a_of_type_Float));
      localSingleLineTextView1.setText(paramAdData.title);
      localTextView1.setText(paramAdData.content);
      localTextView2.setText(paramAdData.content2);
      if ((paramAdData.ad_source < 0) || (paramAdData.ad_source >= jdField_a_of_type_ArrayOfJavaLangString.length)) {
        break label352;
      }
    }
    label338:
    label352:
    for (localObject = jdField_a_of_type_ArrayOfJavaLangString[paramAdData.ad_source];; localObject = jdField_a_of_type_ArrayOfJavaLangString[0])
    {
      paramView.setContentDescription((CharSequence)localObject);
      localView.setContentDescription((CharSequence)localObject);
      localView.setTag(paramAdData.jump_url);
      localView.setTag(2131296453, Integer.valueOf(paramAdData.ad_source));
      localView.setOnClickListener(this.jdField_a_of_type_AndroidViewView$OnClickListener);
      return;
      localBorderTextView.setVisibility(4);
      break;
      localSingleLineTextView2.setVisibility(8);
      j = 89;
      break label210;
    }
  }
  
  public void a(String paramString)
  {
    Class[] arrayOfClass = new Class[3];
    arrayOfClass[0] = Object.class;
    arrayOfClass[1] = Integer.class;
    arrayOfClass[2] = Object.class;
    paramString = FileUtils.a(paramString, arrayOfClass);
    if ((paramString != null) && (paramString.length == arrayOfClass.length))
    {
      this.jdField_a_of_type_JavaUtilList = ((List)paramString[0]);
      this.i = ((Integer)paramString[1]).intValue();
      this.jdField_a_of_type_JavaUtilArrayList = ((ArrayList)paramString[2]);
    }
  }
  
  public void a(List paramList, int paramInt, ArrayList paramArrayList)
  {
    this.jdField_a_of_type_JavaUtilList.clear();
    if ((paramList != null) && (paramList.size() > 0)) {
      this.jdField_a_of_type_JavaUtilList.addAll(paramList);
    }
    this.i = paramInt;
    this.jdField_a_of_type_JavaUtilArrayList = paramArrayList;
  }
  
  public boolean a()
  {
    if (this.jdField_a_of_type_ComTencentMobileqqWidgetCarrierADView == null) {}
    while (this.jdField_a_of_type_ComTencentMobileqqWidgetCarrierADView.getVisibility() != 0) {
      return false;
    }
    return true;
  }
  
  public void b(String paramString)
  {
    if ((this.jdField_a_of_type_JavaUtilList.size() == 0) || (this.jdField_a_of_type_ComTencentMobileqqWidgetCarrierADView == null) || (TextUtils.isEmpty(paramString))) {
      return;
    }
    int j = this.jdField_a_of_type_ComTencentMobileqqWidgetCarrierADView.a();
    FileUtils.a(paramString, new Object[] { this.jdField_a_of_type_JavaUtilList, Integer.valueOf(j), this.jdField_a_of_type_JavaUtilArrayList });
  }
  
  public void onClick(View paramView)
  {
    Object localObject = (Integer)paramView.getTag(2131296453);
    String str = (String)paramView.getTag();
    if ((localObject == null) || (str == null)) {
      return;
    }
    if ((this.h == 2) || (this.h == 1)) {
      ReportController.b(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, "CliOper", "", "", "0X80050D1", "0X80050D1", this.h, 0, String.valueOf(localObject), "", "", "");
    }
    if (((Integer)localObject).intValue() == 5) {
      ReportController.b(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, "CliOper", "", "", "0X80052A3", "0X80052A3", this.h, 0, "", "", "", "");
    }
    if (this.jdField_a_of_type_AndroidAppActivity == null) {}
    for (paramView = BaseApplicationImpl.getContext();; paramView = this.jdField_a_of_type_AndroidAppActivity)
    {
      localObject = JumpParser.a(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, paramView, str);
      if (localObject == null) {
        break;
      }
      ((JumpAction)localObject).b();
      return;
    }
    localObject = new Intent(BaseApplicationImpl.getContext(), QQBrowserActivity.class);
    ((Intent)localObject).putExtra("url", URLUtil.guessUrl(str));
    paramView.startActivity((Intent)localObject);
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\com\tencent\mobileqq\dating\CarrierHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */