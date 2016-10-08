package cooperation.plugin.rc;

import android.os.Bundle;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pluginsdk.ipc.RemoteCommand;
import com.tencent.mobileqq.pluginsdk.ipc.RemoteCommand.OnInvokeFinishLinstener;
import com.tencent.mobileqq.utils.ContactUtils;

public class GetQQAppInterfaceDataRemoteCommand
  extends RemoteCommand
{
  public static final int a = 1;
  public static final String a = "common.get_qq_app_interface_data";
  public static final int b = 2;
  public static final String b = "param_data_type";
  public static final String c = "param_uin";
  public static final String d = "param_fetch_if_not_exist";
  private QQAppInterface a;
  
  public GetQQAppInterfaceDataRemoteCommand(QQAppInterface paramQQAppInterface)
  {
    super("common.get_qq_app_interface_data");
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.a = paramQQAppInterface;
  }
  
  public Bundle invoke(Bundle paramBundle, RemoteCommand.OnInvokeFinishLinstener paramOnInvokeFinishLinstener)
  {
    int i = paramBundle.getInt("param_data_type", 0);
    paramOnInvokeFinishLinstener = new Bundle();
    switch (i)
    {
    default: 
      return paramOnInvokeFinishLinstener;
    case 1: 
      paramBundle = paramBundle.getString("param_uin");
      paramOnInvokeFinishLinstener.putString("result_key", ContactUtils.i(this.a, paramBundle));
      return paramOnInvokeFinishLinstener;
    }
    String str = paramBundle.getString("param_uin");
    boolean bool = paramBundle.getBoolean("param_fetch_if_not_exist", false);
    paramOnInvokeFinishLinstener.putString("result_key", ContactUtils.b(this.a, str, bool));
    return paramOnInvokeFinishLinstener;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\cooperation\plugin\rc\GetQQAppInterfaceDataRemoteCommand.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */