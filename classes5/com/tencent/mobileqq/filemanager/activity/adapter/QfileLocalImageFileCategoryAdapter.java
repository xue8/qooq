package com.tencent.mobileqq.filemanager.activity.adapter;

import android.app.Activity;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.tencent.mobileqq.filemanager.activity.BaseFileAssistantActivity;
import com.tencent.mobileqq.filemanager.data.FMDataCache;
import com.tencent.mobileqq.filemanager.data.FileInfo;
import com.tencent.mobileqq.filemanager.widget.AsyncImageView;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.widget.GridListView.GridListAdapter;
import java.util.ArrayList;
import java.util.List;

public class QfileLocalImageFileCategoryAdapter
  extends GridListView.GridListAdapter
{
  private static final int b = 4;
  private LayoutInflater jdField_a_of_type_AndroidViewLayoutInflater;
  protected View.OnClickListener a;
  protected View.OnLongClickListener a;
  private BaseFileAssistantActivity jdField_a_of_type_ComTencentMobileqqFilemanagerActivityBaseFileAssistantActivity;
  private List jdField_a_of_type_JavaUtilList;
  private int c;
  
  public QfileLocalImageFileCategoryAdapter(Activity paramActivity, List paramList, View.OnClickListener paramOnClickListener, View.OnLongClickListener paramOnLongClickListener)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_JavaUtilList = new ArrayList();
    this.c = 50;
    this.jdField_a_of_type_ComTencentMobileqqFilemanagerActivityBaseFileAssistantActivity = ((BaseFileAssistantActivity)paramActivity);
    this.jdField_a_of_type_AndroidViewLayoutInflater = LayoutInflater.from(paramActivity);
    this.jdField_a_of_type_JavaUtilList = paramList;
    this.jdField_a_of_type_AndroidViewView$OnClickListener = paramOnClickListener;
    this.jdField_a_of_type_AndroidViewView$OnLongClickListener = paramOnLongClickListener;
  }
  
  public int a()
  {
    return 1;
  }
  
  public int a(int paramInt)
  {
    return 1;
  }
  
  public FileInfo a(int paramInt)
  {
    return (FileInfo)this.jdField_a_of_type_JavaUtilList.get(paramInt);
  }
  
  public void a(int paramInt)
  {
    this.c = paramInt;
  }
  
  public int b(int paramInt)
  {
    return 1;
  }
  
  public int getCount()
  {
    return this.jdField_a_of_type_JavaUtilList.size();
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      paramView = this.jdField_a_of_type_AndroidViewLayoutInflater.inflate(2130904001, null);
      paramView.setOnClickListener(this.jdField_a_of_type_AndroidViewView$OnClickListener);
      paramViewGroup = new QfileLocalImageFileCategoryAdapter.LocalImageHolder(this);
      paramViewGroup.jdField_a_of_type_ComTencentMobileqqFilemanagerWidgetAsyncImageView = ((AsyncImageView)paramView.findViewById(2131296303));
      paramViewGroup.jdField_a_of_type_AndroidWidgetImageView = ((ImageView)paramView.findViewById(2131300967));
      paramViewGroup.b = ((ImageView)paramView.findViewById(2131300966));
      paramView.setTag(paramViewGroup);
    }
    for (;;)
    {
      FileInfo localFileInfo = a(paramInt);
      paramViewGroup.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileInfo = localFileInfo;
      paramViewGroup.jdField_a_of_type_Int = paramInt;
      paramViewGroup.jdField_a_of_type_ComTencentMobileqqFilemanagerWidgetAsyncImageView.setAdjustViewBounds(false);
      paramViewGroup.jdField_a_of_type_ComTencentMobileqqFilemanagerWidgetAsyncImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
      paramViewGroup.jdField_a_of_type_ComTencentMobileqqFilemanagerWidgetAsyncImageView.setDefaultImage(2130842111);
      paramViewGroup.jdField_a_of_type_ComTencentMobileqqFilemanagerWidgetAsyncImageView.setAsyncClipSize(this.c, this.c);
      int i = paramInt / 4;
      String str = String.format(this.jdField_a_of_type_ComTencentMobileqqFilemanagerActivityBaseFileAssistantActivity.getString(2131362848), new Object[] { Integer.valueOf(i + 1), Integer.valueOf((paramInt & 0x3) + 1) });
      paramViewGroup.jdField_a_of_type_ComTencentMobileqqFilemanagerWidgetAsyncImageView.setContentDescription(str);
      if ((localFileInfo.d() != null) && (localFileInfo.d().length() > 0)) {
        paramViewGroup.jdField_a_of_type_ComTencentMobileqqFilemanagerWidgetAsyncImageView.setAsyncImage(localFileInfo.d());
      }
      if ((!this.jdField_a_of_type_ComTencentMobileqqFilemanagerActivityBaseFileAssistantActivity.f()) || (!FMDataCache.a(localFileInfo))) {
        break;
      }
      paramViewGroup.b.setVisibility(0);
      paramViewGroup.jdField_a_of_type_AndroidWidgetImageView.setVisibility(0);
      paramView.setBackgroundColor(this.jdField_a_of_type_ComTencentMobileqqFilemanagerActivityBaseFileAssistantActivity.getResources().getColor(2131427407));
      return paramView;
      paramViewGroup = (QfileLocalImageFileCategoryAdapter.LocalImageHolder)paramView.getTag();
    }
    paramViewGroup.b.setVisibility(4);
    paramViewGroup.jdField_a_of_type_AndroidWidgetImageView.setVisibility(4);
    return paramView;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\com\tencent\mobileqq\filemanager\activity\adapter\QfileLocalImageFileCategoryAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */