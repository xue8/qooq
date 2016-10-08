import android.content.res.Resources;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.nearby.interestTag.ChooseInterestTagActivity;
import com.tencent.mobileqq.nearby.interestTag.InterestTagInfo;
import com.tencent.mobileqq.nearby.interestTag.ShowTagNamePopupWindow;
import com.tencent.qphone.base.util.QLog;
import java.util.ArrayList;

public class tjj
  implements View.OnClickListener
{
  public tjj(ChooseInterestTagActivity paramChooseInterestTagActivity)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onClick(View paramView)
  {
    if ((ChooseInterestTagActivity.a(this.a) == 3) || (ChooseInterestTagActivity.a(this.a) == 2) || (ChooseInterestTagActivity.a(this.a) == 1) || (ChooseInterestTagActivity.a(this.a) == 4))
    {
      paramView = (InterestTagInfo)paramView.getTag();
      if (paramView != null)
      {
        ChooseInterestTagActivity.a(this.a).remove(paramView);
        ChooseInterestTagActivity.a(this.a, paramView);
        ChooseInterestTagActivity.b(this.a, paramView);
      }
    }
    do
    {
      for (;;)
      {
        return;
        try
        {
          int[] arrayOfInt = new int[2];
          paramView.getLocationInWindow(arrayOfInt);
          if (arrayOfInt[0] > 0)
          {
            InterestTagInfo localInterestTagInfo = (InterestTagInfo)paramView.getTag();
            if (localInterestTagInfo != null)
            {
              Paint localPaint = new Paint();
              localPaint.setTextSize((float)(ChooseInterestTagActivity.a(this.a) * 14.0F + 0.5D));
              localPaint.setColor(this.a.getResources().getColor(2131428296));
              localPaint.setFakeBoldText(false);
              localPaint.setAntiAlias(true);
              Object localObject2 = localInterestTagInfo.tagName;
              Object localObject1 = localObject2;
              if (TextUtils.isEmpty((CharSequence)localObject2)) {
                localObject1 = " ";
              }
              localObject2 = localObject1;
              if (((String)localObject1).length() > 8) {
                localObject2 = ((String)localObject1).substring(0, 8) + "...";
              }
              float f = localPaint.measureText((String)localObject2);
              int i = (int)(ChooseInterestTagActivity.a(this.a) * 64.0F + 0.5D + f);
              localObject1 = new ShowTagNamePopupWindow(this.a, arrayOfInt[0], i);
              ((ShowTagNamePopupWindow)localObject1).a(ChooseInterestTagActivity.a(this.a));
              ((ShowTagNamePopupWindow)localObject1).a(localInterestTagInfo);
              ((ShowTagNamePopupWindow)localObject1).showAsDropDown(paramView, -(int)((i - 40.0F * ChooseInterestTagActivity.a(this.a)) / 2.0F), 10);
              return;
            }
          }
        }
        catch (Exception paramView) {}
      }
    } while (!QLog.isDevelopLevel());
    QLog.i("choose_interest_tag", 4, paramView.getMessage());
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tjj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */