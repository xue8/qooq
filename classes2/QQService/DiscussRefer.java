package QQService;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import java.io.Serializable;

public final class DiscussRefer
  implements Serializable
{
  public static final int _ANDROID_FROM_CHAT_WINDOW = 1001;
  public static final int _ANDROID_FROM_CONTACT_LIST = 1002;
  public static final int _ANDROID_FROM_CONVERSATION_TAB = 1003;
  public static final int _ANDROID_FROM_DICUSSION_AIO = 1007;
  public static final int _ANDROID_FROM_INVITE_START_ACTIVITY = 1006;
  public static final int _ANDROID_FROM_OFFICECENTER_DINGDONG = 1004;
  public static final int _ANDROID_FROM_PSTN_C2C_ACTIVITY = 1005;
  public static final int _ANDROID_FROM_Unknown = 0;
  
  public DiscussRefer()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\QQService\DiscussRefer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */