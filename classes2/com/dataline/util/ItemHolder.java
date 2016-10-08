package com.dataline.util;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.mobileqq.bubble.BubbleInfo;
import com.tencent.mobileqq.data.DataLineMsgSet;
import com.tencent.mobileqq.data.RouterMsgRecord;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.qphone.base.util.QLog;

public class ItemHolder
  implements Cloneable
{
  private static final String jdField_a_of_type_JavaLangString = "Dataline.ItemHolder";
  private View jdField_a_of_type_AndroidViewView;
  public ImageView a;
  private ProgressBar jdField_a_of_type_AndroidWidgetProgressBar;
  public RelativeLayout a;
  private TextView jdField_a_of_type_AndroidWidgetTextView;
  private ItemHolder.FileItemHolder jdField_a_of_type_ComDatalineUtilItemHolder$FileItemHolder;
  private ItemHolder.GrayTipItemHolder jdField_a_of_type_ComDatalineUtilItemHolder$GrayTipItemHolder;
  private ItemHolder.ImageItemHolder jdField_a_of_type_ComDatalineUtilItemHolder$ImageItemHolder;
  private ItemHolder.MutiImageItemHolder jdField_a_of_type_ComDatalineUtilItemHolder$MutiImageItemHolder;
  private ItemHolder.TextItemHolder jdField_a_of_type_ComDatalineUtilItemHolder$TextItemHolder;
  public BubbleInfo a;
  private DataLineMsgSet jdField_a_of_type_ComTencentMobileqqDataDataLineMsgSet;
  private RouterMsgRecord jdField_a_of_type_ComTencentMobileqqDataRouterMsgRecord;
  private Object jdField_a_of_type_JavaLangObject;
  private TextView b;
  
  public ItemHolder()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_ComDatalineUtilItemHolder$FileItemHolder = new ItemHolder.FileItemHolder(this);
    this.jdField_a_of_type_ComDatalineUtilItemHolder$ImageItemHolder = new ItemHolder.ImageItemHolder(this);
    this.jdField_a_of_type_ComDatalineUtilItemHolder$TextItemHolder = new ItemHolder.TextItemHolder(this);
    this.jdField_a_of_type_ComDatalineUtilItemHolder$MutiImageItemHolder = new ItemHolder.MutiImageItemHolder(this);
    this.jdField_a_of_type_ComDatalineUtilItemHolder$GrayTipItemHolder = new ItemHolder.GrayTipItemHolder(this);
  }
  
  public View a()
  {
    return this.jdField_a_of_type_AndroidViewView;
  }
  
  public ImageView a()
  {
    return this.jdField_a_of_type_AndroidWidgetImageView;
  }
  
  public ProgressBar a()
  {
    return this.jdField_a_of_type_AndroidWidgetProgressBar;
  }
  
  public TextView a()
  {
    return this.jdField_a_of_type_AndroidWidgetTextView;
  }
  
  public ItemHolder.FileItemHolder a()
  {
    return this.jdField_a_of_type_ComDatalineUtilItemHolder$FileItemHolder;
  }
  
  public ItemHolder.GrayTipItemHolder a()
  {
    return this.jdField_a_of_type_ComDatalineUtilItemHolder$GrayTipItemHolder;
  }
  
  public ItemHolder.ImageItemHolder a()
  {
    return this.jdField_a_of_type_ComDatalineUtilItemHolder$ImageItemHolder;
  }
  
  public ItemHolder.MutiImageItemHolder a()
  {
    return this.jdField_a_of_type_ComDatalineUtilItemHolder$MutiImageItemHolder;
  }
  
  public ItemHolder.TextItemHolder a()
  {
    return this.jdField_a_of_type_ComDatalineUtilItemHolder$TextItemHolder;
  }
  
  public DataLineMsgSet a()
  {
    return this.jdField_a_of_type_ComTencentMobileqqDataDataLineMsgSet;
  }
  
  public RouterMsgRecord a()
  {
    return this.jdField_a_of_type_ComTencentMobileqqDataRouterMsgRecord;
  }
  
  public Object a()
  {
    return this.jdField_a_of_type_JavaLangObject;
  }
  
  public void a(View paramView)
  {
    this.jdField_a_of_type_AndroidViewView = paramView;
  }
  
  public void a(ImageView paramImageView)
  {
    this.jdField_a_of_type_AndroidWidgetImageView = paramImageView;
  }
  
  public void a(ProgressBar paramProgressBar)
  {
    this.jdField_a_of_type_AndroidWidgetProgressBar = paramProgressBar;
  }
  
  public void a(TextView paramTextView)
  {
    this.jdField_a_of_type_AndroidWidgetTextView = paramTextView;
  }
  
  public void a(DataLineMsgSet paramDataLineMsgSet)
  {
    this.jdField_a_of_type_ComTencentMobileqqDataDataLineMsgSet = paramDataLineMsgSet;
  }
  
  public void a(RouterMsgRecord paramRouterMsgRecord)
  {
    this.jdField_a_of_type_ComTencentMobileqqDataRouterMsgRecord = paramRouterMsgRecord;
  }
  
  public void a(Object paramObject)
  {
    this.jdField_a_of_type_JavaLangObject = paramObject;
  }
  
  public TextView b()
  {
    return this.b;
  }
  
  public void b(TextView paramTextView)
  {
    this.b = paramTextView;
  }
  
  public Object clone()
  {
    try
    {
      localObject = super.clone();
      return localObject;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      do
      {
        Object localObject = this;
      } while (!QLog.isDevelopLevel());
      QLog.w("Dataline.ItemHolder", 4, "ItemHolder clone failed." + localCloneNotSupportedException.toString());
    }
    return this;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\dataline\util\ItemHolder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */