import android.text.TextUtils;
import com.tencent.mobileqq.activity.aio.ChatItemBuilder;
import com.tencent.mobileqq.activity.aio.item.RichStatItemBuilder;
import com.tencent.mobileqq.app.FriendListHandler;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.SignatureHandler;
import com.tencent.mobileqq.data.MessageForRichState;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.richstatus.RichStatus;
import com.tencent.qphone.base.util.QLog;

public class noe
  implements Runnable
{
  public noe(RichStatItemBuilder paramRichStatItemBuilder, MessageForRichState paramMessageForRichState)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void run()
  {
    if (TextUtils.isEmpty(RichStatItemBuilder.a().feedsId))
    {
      ((FriendListHandler)this.jdField_a_of_type_ComTencentMobileqqActivityAioItemRichStatItemBuilder.a.a(1)).b(new String[] { this.jdField_a_of_type_ComTencentMobileqqDataMessageForRichState.frienduin });
      if (QLog.isColorLevel()) {
        QLog.d(ChatItemBuilder.a, 2, "sign feedid is is null reget friend sign");
      }
    }
    SignatureHandler localSignatureHandler;
    do
    {
      return;
      localSignatureHandler = (SignatureHandler)this.jdField_a_of_type_ComTencentMobileqqActivityAioItemRichStatItemBuilder.a.a(41);
    } while (localSignatureHandler == null);
    localSignatureHandler.a(this.jdField_a_of_type_ComTencentMobileqqDataMessageForRichState.frienduin, this.jdField_a_of_type_ComTencentMobileqqDataMessageForRichState.feedId);
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\noe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */