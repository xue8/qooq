import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mobileqq.activity.MainFragment;
import com.tencent.mobileqq.activity.SplashActivity;
import com.tencent.mobileqq.activity.SubAccountBindActivity;
import com.tencent.mobileqq.activity.SubLoginActivity;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.subaccount.SubAccountAssistantForward;
import com.tencent.mobileqq.subaccount.SubAccountControll;
import com.tencent.mobileqq.subaccount.SubAccountProtocManager;
import com.tencent.mobileqq.subaccount.datamanager.SubAccountManager;
import com.tencent.qphone.base.remote.SimpleAccount;
import com.tencent.qphone.base.util.QLog;
import java.util.List;
import mqq.app.AppRuntime;
import mqq.observer.SubAccountObserver;

public class mmm
  implements View.OnClickListener
{
  public mmm(SubAccountBindActivity paramSubAccountBindActivity)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onClick(View paramView)
  {
    Object localObject = paramView.findViewById(2131296831);
    if ((localObject != null) && (((View)localObject).getVisibility() == 0)) {}
    SubAccountProtocManager localSubAccountProtocManager;
    do
    {
      do
      {
        return;
        int i = ((Integer)paramView.getTag()).intValue();
        paramView = (SimpleAccount)SubAccountBindActivity.a(this.a).get(i);
        localObject = (SubAccountManager)this.a.app.getManager(60);
        if (((SubAccountManager)localObject).a(paramView.getUin()))
        {
          this.a.b(this.a.getString(2131370557));
          SubAccountAssistantForward.a(this.a.app);
          this.a.setTitle("");
          paramView = new Intent(this.a, SplashActivity.class);
          paramView.putExtra("tab_index", MainFragment.a);
          paramView.setFlags(67108864);
          this.a.startActivity(paramView);
          this.a.finish();
          return;
        }
        if (((SubAccountManager)localObject).a() >= 2)
        {
          SubAccountControll.a(this.a.app, this.a);
          return;
        }
        if (!paramView.isLogined())
        {
          if (QLog.isColorLevel()) {
            QLog.d("Q.subaccount.SubAccountBindActivity", 2, "onSelectAccountClick.onClick:add account");
          }
          localObject = new Intent(this.a, SubLoginActivity.class);
          ((Intent)localObject).putExtra("subuin", paramView.getUin());
          ((Intent)localObject).putExtra("fromWhere", this.a.a);
          this.a.startActivity((Intent)localObject);
          return;
        }
      } while (!this.a.b());
      localObject = ((SubAccountManager)localObject).a(paramView.getUin());
      this.a.a(2131370577);
      if (TextUtils.isEmpty((CharSequence)localObject))
      {
        localObject = new mmn(this, paramView);
        this.a.getAppRuntime().getSubAccountKey(this.a.app.getAccount(), paramView.getUin(), (SubAccountObserver)localObject);
        return;
      }
      localSubAccountProtocManager = (SubAccountProtocManager)this.a.app.getManager(27);
    } while (localSubAccountProtocManager == null);
    localSubAccountProtocManager.a(paramView.getUin(), (String)localObject, this.a.a);
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\mmm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */