import android.support.v4.app.FragmentActivity;
import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.mobileqq.activity.ChatActivityUtils;
import com.tencent.mobileqq.activity.aio.SessionInfo;
import com.tencent.mobileqq.activity.aio.rebuild.MultiForwardChatPie;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.message.MultiMsgProxy;
import com.tencent.mobileqq.app.message.QQMessageFacade;
import com.tencent.mobileqq.app.proxy.ProxyManager;
import com.tencent.mobileqq.bubble.ChatXListView;
import com.tencent.mobileqq.data.ChatMessage;
import com.tencent.mobileqq.data.MessageRecord;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.mixedmsg.MixedMsgManager;
import com.tencent.mobileqq.multimsg.LongTextMsgManager;
import com.tencent.mobileqq.multimsg.MultiMsgManager;
import com.tencent.mobileqq.pic.DownCallBack;
import com.tencent.mobileqq.pic.DownCallBack.DownResult;
import com.tencent.qphone.base.util.QLog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class nza
  implements DownCallBack
{
  WeakReference a;
  
  public nza(MultiForwardChatPie paramMultiForwardChatPie)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.a = new WeakReference(paramMultiForwardChatPie);
  }
  
  public void a(int paramInt, boolean paramBoolean) {}
  
  public void a(DownCallBack.DownResult paramDownResult)
  {
    if (this.a == null) {}
    label406:
    for (;;)
    {
      return;
      MultiForwardChatPie localMultiForwardChatPie = (MultiForwardChatPie)this.a.get();
      if ((localMultiForwardChatPie != null) && (localMultiForwardChatPie.jdField_b_of_type_JavaLangRunnable != null))
      {
        MultiForwardChatPie.a(localMultiForwardChatPie).removeCallbacks(localMultiForwardChatPie.jdField_b_of_type_JavaLangRunnable);
        localMultiForwardChatPie.jdField_b_of_type_JavaLangRunnable = null;
      }
      if ((paramDownResult.jdField_a_of_type_Int == 0) && (paramDownResult.jdField_a_of_type_ArrayOfByte != null))
      {
        if (QLog.isColorLevel()) {
          QLog.d("StructLongTextMsg", 2, "MultiForwardActivity.onDownload success");
        }
        if (localMultiForwardChatPie == null) {
          continue;
        }
        Object localObject1 = new HashMap();
        Object localObject2 = localMultiForwardChatPie.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().a(localMultiForwardChatPie.jdField_a_of_type_ComTencentMobileqqActivityAioSessionInfo.jdField_a_of_type_JavaLangString, localMultiForwardChatPie.jdField_a_of_type_ComTencentMobileqqActivityAioSessionInfo.jdField_a_of_type_Int, localMultiForwardChatPie.h);
        localObject2 = localMultiForwardChatPie.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().a().a(paramDownResult.jdField_a_of_type_ArrayOfByte, (HashMap)localObject1, (MessageRecord)localObject2, null);
        if ((localObject2 != null) && (((ArrayList)localObject2).size() == 1))
        {
          if (((MessageRecord)((ArrayList)localObject2).get(0)).msgtype == 64501) {
            ((MixedMsgManager)localMultiForwardChatPie.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getManager(173)).a(false, localMultiForwardChatPie.jdField_a_of_type_ComTencentMobileqqActivityAioSessionInfo.jdField_a_of_type_Int);
          }
          MultiMsgManager.a().a((HashMap)localObject1, localMultiForwardChatPie.h, localMultiForwardChatPie.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface);
          localObject1 = new ArrayList();
          ((List)localObject1).add((ChatMessage)((ArrayList)localObject2).get(0));
          localMultiForwardChatPie.jdField_b_of_type_JavaUtilList = ((List)localObject1);
          localObject1 = ChatActivityUtils.a(localMultiForwardChatPie.jdField_b_of_type_JavaUtilList, localMultiForwardChatPie.jdField_a_of_type_ComTencentMobileqqActivityAioSessionInfo, localMultiForwardChatPie.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface);
          localObject1 = ChatActivityUtils.a(localMultiForwardChatPie.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, BaseApplicationImpl.getContext(), localMultiForwardChatPie.jdField_a_of_type_ComTencentMobileqqActivityAioSessionInfo, (MessageRecord)localObject1);
          if (QLog.isColorLevel()) {
            QLog.d("StructLongTextMsg", 2, "MultiForwardActivity.onDownload, requestReceiveMultiMsg uses " + (System.currentTimeMillis() - MultiForwardChatPie.a(localMultiForwardChatPie)));
          }
          localMultiForwardChatPie.jdField_a_of_type_AndroidSupportV4AppFragmentActivity.runOnUiThread(new nzb(this, localMultiForwardChatPie, (CharSequence)localObject1));
        }
      }
      for (;;)
      {
        if ((localMultiForwardChatPie == null) || (localMultiForwardChatPie.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface == null)) {
          break label406;
        }
        ((LongTextMsgManager)localMultiForwardChatPie.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getManager(165)).a(localMultiForwardChatPie.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, localMultiForwardChatPie.jdField_a_of_type_ComTencentMobileqqActivityAioSessionInfo.jdField_a_of_type_Int, paramDownResult.jdField_a_of_type_Int, 2);
        return;
        if (QLog.isColorLevel()) {
          QLog.d("StructLongTextMsg", 2, "MultiForwardActivity.onDownload failed");
        }
        if (localMultiForwardChatPie == null) {
          break;
        }
        localMultiForwardChatPie.jdField_a_of_type_AndroidSupportV4AppFragmentActivity.runOnUiThread(new nzc(this, localMultiForwardChatPie));
      }
    }
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\nza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */