import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.nearby.NearbyUtils;
import com.tencent.mobileqq.nearby.interestTag.ChooseInterestTagActivity;
import com.tencent.mobileqq.nearby.interestTag.InterestTagAdapter;
import com.tencent.mobileqq.utils.NetworkUtil;

public class tjl
  implements TextWatcher
{
  public tjl(ChooseInterestTagActivity paramChooseInterestTagActivity)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void afterTextChanged(Editable paramEditable)
  {
    ChooseInterestTagActivity.a(this.a).removeMessages(4097);
    ChooseInterestTagActivity.b(this.a, 0);
    String str;
    if (ChooseInterestTagActivity.a(this.a).getText() == null)
    {
      paramEditable = "";
      str = NearbyUtils.a(paramEditable);
      if (ChooseInterestTagActivity.a(this.a).getText() != null) {
        break label163;
      }
      paramEditable = "";
      label59:
      if (!TextUtils.isEmpty(paramEditable)) {
        break label185;
      }
      if (ChooseInterestTagActivity.b(this.a).getVisibility() != 8) {
        ChooseInterestTagActivity.b(this.a).setVisibility(8);
      }
      ChooseInterestTagActivity.a(this.a).a(ChooseInterestTagActivity.a(this.a), true);
      paramEditable = this.a;
      if (ChooseInterestTagActivity.b(this.a) == -1) {
        break label180;
      }
    }
    label163:
    label180:
    for (boolean bool = true;; bool = false)
    {
      ChooseInterestTagActivity.a(paramEditable, false, bool);
      ChooseInterestTagActivity.a(this.a, "");
      return;
      paramEditable = ChooseInterestTagActivity.a(this.a).getText().toString();
      break;
      paramEditable = ChooseInterestTagActivity.a(this.a).getText().toString();
      break label59;
    }
    label185:
    if (TextUtils.isEmpty(str))
    {
      if (ChooseInterestTagActivity.b(this.a).getVisibility() != 0) {
        ChooseInterestTagActivity.b(this.a).setVisibility(0);
      }
      ChooseInterestTagActivity.b(this.a).setText("无结果");
      ChooseInterestTagActivity.c(this.a).setVisibility(8);
      ChooseInterestTagActivity.a(this.a, "");
      return;
    }
    if (ChooseInterestTagActivity.b(this.a).getVisibility() != 0) {
      ChooseInterestTagActivity.b(this.a).setVisibility(0);
    }
    if (NetworkUtil.e(this.a))
    {
      ChooseInterestTagActivity.b(this.a).setText("正在加载...");
      ChooseInterestTagActivity.c(this.a).setVisibility(8);
      ChooseInterestTagActivity.a(this.a, str);
      ChooseInterestTagActivity.a(this.a).sendEmptyMessageDelayed(4097, 400L);
      return;
    }
    if (!ChooseInterestTagActivity.c(this.a))
    {
      ChooseInterestTagActivity.a(this.a, "当前网络不可用，请检查网络设置。");
      ChooseInterestTagActivity.a(this.a, true);
      ChooseInterestTagActivity.a(this.a).sendEmptyMessageDelayed(4100, 3000L);
    }
    ChooseInterestTagActivity.b(this.a).setText("");
    ChooseInterestTagActivity.b(this.a).setOnClickListener(null);
    ChooseInterestTagActivity.c(this.a).setVisibility(8);
    ChooseInterestTagActivity.a(this.a, "");
  }
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    ChooseInterestTagActivity.a(this.a, 0);
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tjl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */