import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.tencent.mobileqq.activity.AssistantSettingActivity;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.qcall.PstnManager;

public class kkd
  implements CompoundButton.OnCheckedChangeListener
{
  public kkd(AssistantSettingActivity paramAssistantSettingActivity, PstnManager paramPstnManager)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    this.jdField_a_of_type_ComTencentMobileqqQcallPstnManager.a(paramBoolean);
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\kkd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */