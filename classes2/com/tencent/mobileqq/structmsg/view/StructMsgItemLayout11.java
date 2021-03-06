package com.tencent.mobileqq.structmsg.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mobileqq.activity.aio.AIOUtils;
import com.tencent.mobileqq.activity.aio.BaseChatItemLayout;
import com.tencent.mobileqq.app.FontSettingManager;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.structmsg.AbsStructMsgElement;
import com.tencent.mobileqq.structmsg.AbsStructMsgItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import uwb;

public class StructMsgItemLayout11
  extends AbsStructMsgItem
{
  public static final int av = 240;
  public static final int aw = 1001;
  public static final int ax = 1003;
  
  public StructMsgItemLayout11()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public StructMsgItemLayout11(int paramInt)
  {
    super(paramInt);
  }
  
  public StructMsgItemLayout11(Collection paramCollection)
  {
    super(paramCollection);
  }
  
  protected int b()
  {
    return 11;
  }
  
  public View b(Context paramContext, View paramView, Bundle paramBundle)
  {
    Object localObject4 = paramContext.getResources();
    float f;
    if ((paramView != null) && ((paramView instanceof RelativeLayout)) && ((paramView.getTag() instanceof uwb)))
    {
      localObject1 = (uwb)paramView.getTag();
      localObject2 = this.jdField_a_of_type_JavaUtilArrayList.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (AbsStructMsgElement)((Iterator)localObject2).next();
        ((AbsStructMsgElement)localObject3).jdField_a_of_type_JavaLangRefWeakReference = this.jdField_a_of_type_JavaLangRefWeakReference;
        localObject4 = ((AbsStructMsgElement)localObject3).jdField_a_of_type_JavaLangString;
        if ("title".equals(localObject4))
        {
          localObject3 = (StructMsgItemTitle)localObject3;
          ((StructMsgItemTitle)localObject3).b("#ffffff");
          f = FontSettingManager.a() / 16.0F;
          if (f > 1.0F) {
            ((StructMsgItemTitle)localObject3).d("" + (int)(36 / f));
          }
          for (;;)
          {
            ((StructMsgItemTitle)localObject3).a(paramContext, ((uwb)localObject1).b, paramBundle);
            break;
            ((StructMsgItemTitle)localObject3).d(String.valueOf(36));
          }
        }
        if ("pavideo".equals(localObject4)) {
          ((AbsStructMsgElement)localObject3).a(paramContext, ((uwb)localObject1).a, paramBundle);
        }
      }
      ((TextView)((uwb)localObject1).b).setMaxLines(2);
      return paramView;
    }
    Object localObject2 = new RelativeLayout(paramContext);
    int i = (int)((BaseChatItemLayout.e - AIOUtils.a(46.0F, (Resources)localObject4)) / 1.8D) + AIOUtils.a(30.0F, (Resources)localObject4);
    ((RelativeLayout)localObject2).setLayoutParams(new RelativeLayout.LayoutParams(-1, i));
    int j = AIOUtils.a(15.0F, (Resources)localObject4);
    ((RelativeLayout)localObject2).setPadding(j, j, j, j);
    Object localObject3 = new uwb();
    Object localObject1 = null;
    paramView = null;
    Object localObject5 = this.jdField_a_of_type_JavaUtilArrayList.iterator();
    AbsStructMsgElement localAbsStructMsgElement;
    String str;
    if (((Iterator)localObject5).hasNext())
    {
      localAbsStructMsgElement = (AbsStructMsgElement)((Iterator)localObject5).next();
      localAbsStructMsgElement.jdField_a_of_type_JavaLangRefWeakReference = this.jdField_a_of_type_JavaLangRefWeakReference;
      str = localAbsStructMsgElement.jdField_a_of_type_JavaLangString;
      if ("title".equals(str))
      {
        localObject1 = (StructMsgItemTitle)localAbsStructMsgElement;
        ((StructMsgItemTitle)localObject1).b("#ffffff");
        f = FontSettingManager.a() / 16.0F;
        if (f > 1.0F)
        {
          ((StructMsgItemTitle)localObject1).d("" + (int)(36 / f));
          label426:
          localObject1 = ((StructMsgItemTitle)localObject1).a(paramContext, null, paramBundle);
          ((View)localObject1).setId(1001);
        }
      }
    }
    for (;;)
    {
      break;
      ((StructMsgItemTitle)localObject1).d(String.valueOf(36));
      break label426;
      if ("pavideo".equals(str))
      {
        paramView = localAbsStructMsgElement.a(paramContext, null, paramBundle);
        paramView.setId(1003);
        continue;
        if (paramView != null) {
          ((RelativeLayout)localObject2).addView(paramView, new RelativeLayout.LayoutParams(-1, -1));
        }
        paramBundle = new View(paramContext);
        i = (int)(i * 0.32D);
        paramBundle.setBackgroundResource(2130838904);
        localObject5 = new RelativeLayout.LayoutParams(-1, i);
        ((RelativeLayout.LayoutParams)localObject5).addRule(12, -1);
        ((RelativeLayout)localObject2).addView(paramBundle, (ViewGroup.LayoutParams)localObject5);
        if (localObject1 != null)
        {
          paramBundle = new RelativeLayout.LayoutParams(-1, -2);
          paramBundle.addRule(12, -1);
          paramBundle.bottomMargin = AIOUtils.a(11.5F, (Resources)localObject4);
          paramBundle.leftMargin = AIOUtils.a(20.0F, (Resources)localObject4);
          paramBundle.rightMargin = AIOUtils.a(20.0F, (Resources)localObject4);
          ((RelativeLayout)localObject2).addView((View)localObject1, paramBundle);
        }
        paramBundle = new RelativeLayout.LayoutParams(AIOUtils.a(52.5F, (Resources)localObject4), AIOUtils.a(52.5F, (Resources)localObject4));
        paramBundle.addRule(15, -1);
        paramContext = new ImageView(paramContext);
        paramContext.setImageResource(2130838861);
        paramContext.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        paramBundle.addRule(14, -1);
        ((RelativeLayout)localObject2).addView(paramContext, paramBundle);
        if (paramView != null) {
          ((uwb)localObject3).a = paramView;
        }
        if (localObject1 != null)
        {
          ((uwb)localObject3).b = ((View)localObject1);
          ((TextView)((uwb)localObject3).b).setMaxLines(2);
        }
        ((RelativeLayout)localObject2).setTag(localObject3);
        return (View)localObject2;
      }
    }
  }
  
  public String b()
  {
    return "Layout11";
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\mobileqq\structmsg\view\StructMsgItemLayout11.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */