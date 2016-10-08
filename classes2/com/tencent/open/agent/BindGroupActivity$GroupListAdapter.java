package com.tencent.open.agent;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.open.agent.datamodel.AgentBaseAdapter;
import com.tencent.open.agent.datamodel.ImageLoader;
import java.util.List;

public class BindGroupActivity$GroupListAdapter
  extends AgentBaseAdapter
{
  protected BindGroupActivity$GroupListAdapter(BindGroupActivity paramBindGroupActivity)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public int getCount()
  {
    return this.a.jdField_a_of_type_JavaUtilList.size();
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    Object localObject;
    if ((paramView != null) && (paramView.getTag() != null))
    {
      localObject = (BindGroupActivity.ViewHolder)paramView.getTag();
      paramViewGroup = paramView;
      paramView = (View)localObject;
    }
    for (;;)
    {
      localObject = (BindGroupActivity.GroupInfo)this.a.jdField_a_of_type_JavaUtilList.get(paramInt);
      paramView.jdField_a_of_type_AndroidWidgetTextView.setText(((BindGroupActivity.GroupInfo)localObject).b);
      paramView.jdField_a_of_type_JavaLangString = ((BindGroupActivity.GroupInfo)localObject).c;
      Bitmap localBitmap = ImageLoader.a().a(((BindGroupActivity.GroupInfo)localObject).c);
      if (localBitmap == null) {
        break;
      }
      paramView.jdField_a_of_type_AndroidWidgetImageView.setImageBitmap(localBitmap);
      return paramViewGroup;
      paramViewGroup = this.a.jdField_a_of_type_AndroidViewLayoutInflater.inflate(2130904974, paramViewGroup, false);
      paramView = new BindGroupActivity.ViewHolder();
      paramView.jdField_a_of_type_AndroidWidgetImageView = ((ImageView)paramViewGroup.findViewById(2131296814));
      paramView.jdField_a_of_type_AndroidWidgetTextView = ((TextView)paramViewGroup.findViewById(2131298260));
      paramViewGroup.setTag(paramView);
    }
    paramView.jdField_a_of_type_AndroidWidgetImageView.setImageResource(2130838658);
    ImageLoader.a().a(((BindGroupActivity.GroupInfo)localObject).c, this.a);
    return paramViewGroup;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\open\agent\BindGroupActivity$GroupListAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */