import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import com.tencent.av.ui.CallbackWaitingActivityExt;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.utils.AudioUtil;
import com.tencent.qphone.base.util.QLog;

public class gqz
  extends BroadcastReceiver
{
  public gqz(CallbackWaitingActivityExt paramCallbackWaitingActivityExt)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent.getAction().equals("android.intent.action.NEW_OUTGOING_CALL")) {
      return;
    }
    switch (((TelephonyManager)paramContext.getSystemService("phone")).getCallState())
    {
    default: 
      return;
    }
    if (QLog.isColorLevel()) {
      QLog.d(CallbackWaitingActivityExt.a(), 2, "state is TelephonyManager.CALL_STATE_RINGING");
    }
    AudioUtil.a();
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\gqz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */