import com.tencent.mobileqq.activity.Conversation;
import com.tencent.mobileqq.app.HotChatObserver;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.qphone.base.util.QLog;
import java.util.List;

public class ldp
  extends HotChatObserver
{
  public ldp(Conversation paramConversation)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void a(boolean paramBoolean, String paramString1, int paramInt, String paramString2, Long paramLong)
  {
    if (QLog.isColorLevel()) {
      QLog.d("Q.recent", 2, "onGetUserCreateHotChatAnnounce  isSuccess= " + paramBoolean + ", result=" + paramInt + ", memo=" + paramString2 + ", troopOwner=" + paramLong);
    }
    if ((paramBoolean) && (paramInt == 0)) {
      this.a.a(0L);
    }
  }
  
  public void a(boolean paramBoolean, String paramString1, byte[] paramArrayOfByte, int paramInt, String paramString2, String paramString3, List paramList)
  {
    if (QLog.isColorLevel()) {
      QLog.d("Q.recent", 2, "onGetHotChatAnnounce  isSuccess= " + paramBoolean + ", result=" + paramInt + ", memo=" + paramString2 + ", jumpurl=" + paramString3);
    }
    if ((paramBoolean) && (paramInt == 0)) {
      this.a.a(0L);
    }
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\ldp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */