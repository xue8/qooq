package com.tencent.widget;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import xsp;

public class AdapterViewPagerAdapter
  extends PagerAdapter
{
  private Context jdField_a_of_type_AndroidContentContext;
  private SparseArray jdField_a_of_type_AndroidUtilSparseArray;
  private AdapterViewPagerAdapter.AdapterViewFactory jdField_a_of_type_ComTencentWidgetAdapterViewPagerAdapter$AdapterViewFactory;
  private AdapterViewPagerAdapter.PageInflateDelegate jdField_a_of_type_ComTencentWidgetAdapterViewPagerAdapter$PageInflateDelegate;
  private PagerBaseAdapterWrapper jdField_a_of_type_ComTencentWidgetPagerBaseAdapterWrapper;
  
  public AdapterViewPagerAdapter(Context paramContext, BaseAdapter paramBaseAdapter, int paramInt)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_AndroidUtilSparseArray = new SparseArray();
    this.jdField_a_of_type_AndroidContentContext = paramContext;
    this.jdField_a_of_type_ComTencentWidgetPagerBaseAdapterWrapper = new PagerBaseAdapterWrapper(paramBaseAdapter, paramInt);
    this.jdField_a_of_type_ComTencentWidgetPagerBaseAdapterWrapper.registerDataSetObserver(new xsp(this));
  }
  
  public AdapterView a(int paramInt)
  {
    Object localObject2 = (AdapterView)this.jdField_a_of_type_AndroidUtilSparseArray.get(paramInt);
    Object localObject1 = localObject2;
    if (localObject2 == null)
    {
      if (this.jdField_a_of_type_ComTencentWidgetAdapterViewPagerAdapter$AdapterViewFactory != null) {
        localObject1 = this.jdField_a_of_type_ComTencentWidgetAdapterViewPagerAdapter$AdapterViewFactory.a(this.jdField_a_of_type_AndroidContentContext, paramInt);
      }
    }
    else
    {
      if (localObject1 != null)
      {
        localObject2 = new PagerBaseAdapterWrapper(this.jdField_a_of_type_ComTencentWidgetPagerBaseAdapterWrapper.a(), this.jdField_a_of_type_ComTencentWidgetPagerBaseAdapterWrapper.a());
        ((PagerBaseAdapterWrapper)localObject2).a(paramInt);
        ((AdapterView)localObject1).setAdapter((Adapter)localObject2);
        this.jdField_a_of_type_AndroidUtilSparseArray.put(paramInt, localObject1);
      }
      return (AdapterView)localObject1;
    }
    throw new IllegalArgumentException("setAdapterViewFactory should be invoked first!");
  }
  
  public void a(AdapterViewPagerAdapter.AdapterViewFactory paramAdapterViewFactory)
  {
    this.jdField_a_of_type_ComTencentWidgetAdapterViewPagerAdapter$AdapterViewFactory = paramAdapterViewFactory;
  }
  
  public void a(AdapterViewPagerAdapter.PageInflateDelegate paramPageInflateDelegate)
  {
    this.jdField_a_of_type_ComTencentWidgetAdapterViewPagerAdapter$PageInflateDelegate = paramPageInflateDelegate;
  }
  
  public void destroyItem(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    if (this.jdField_a_of_type_ComTencentWidgetAdapterViewPagerAdapter$PageInflateDelegate != null)
    {
      this.jdField_a_of_type_ComTencentWidgetAdapterViewPagerAdapter$PageInflateDelegate.a(paramViewGroup, (View)paramObject, paramInt);
      return;
    }
    paramViewGroup.removeView((View)paramObject);
  }
  
  public int getCount()
  {
    return this.jdField_a_of_type_ComTencentWidgetPagerBaseAdapterWrapper.c();
  }
  
  public Object instantiateItem(ViewGroup paramViewGroup, int paramInt)
  {
    AdapterView localAdapterView = a(paramInt);
    if (localAdapterView == null) {
      return null;
    }
    if (this.jdField_a_of_type_ComTencentWidgetAdapterViewPagerAdapter$PageInflateDelegate != null) {
      return this.jdField_a_of_type_ComTencentWidgetAdapterViewPagerAdapter$PageInflateDelegate.a(paramViewGroup, localAdapterView, paramInt);
    }
    paramViewGroup.addView(localAdapterView);
    return localAdapterView;
  }
  
  public boolean isViewFromObject(View paramView, Object paramObject)
  {
    return paramView == paramObject;
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\com\tencent\widget\AdapterViewPagerAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */