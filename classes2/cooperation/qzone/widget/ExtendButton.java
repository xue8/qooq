package cooperation.qzone.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public class ExtendButton
  extends CompoundButton
{
  private boolean a;
  
  public ExtendButton(Context paramContext)
  {
    super(paramContext);
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.a = true;
  }
  
  public ExtendButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.a = true;
  }
  
  public ExtendButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.a = true;
  }
  
  protected void dispatchSetSelected(boolean paramBoolean)
  {
    if ((paramBoolean) && (this.a))
    {
      Object localObject = getParent();
      if ((localObject != null) && ((localObject instanceof ViewGroup)))
      {
        localObject = (ViewGroup)localObject;
        int j = ((ViewGroup)localObject).getChildCount();
        int i = 0;
        while (i < j)
        {
          View localView = ((ViewGroup)localObject).getChildAt(i);
          if ((localView != null) && (localView != this)) {
            localView.setSelected(false);
          }
          i += 1;
        }
      }
    }
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    if (Build.VERSION.SDK_INT >= 14) {
      paramAccessibilityEvent.setChecked(isChecked());
    }
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    if (Build.VERSION.SDK_INT >= 14)
    {
      paramAccessibilityNodeInfo.setCheckable(true);
      paramAccessibilityNodeInfo.setChecked(isChecked());
    }
  }
  
  public void setAncestorHaveOneSelected(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\cooperation\qzone\widget\ExtendButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */