import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.TroopManager;
import com.tencent.mobileqq.app.message.QQMessageFacade;
import com.tencent.mobileqq.data.ChatMessage;
import com.tencent.mobileqq.data.TroopInfo;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.statistics.StatisticCollector;
import com.tencent.qphone.base.util.BaseApplication;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class ncd
  implements Runnable
{
  public ncd(QQAppInterface paramQQAppInterface, int paramInt, String paramString, long paramLong)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void run()
  {
    if (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface == null) {}
    do
    {
      do
      {
        return;
        if (this.jdField_a_of_type_Int != 1) {
          break;
        }
        localObject = ((TroopManager)this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getManager(51)).a(this.jdField_a_of_type_JavaLangString);
      } while (localObject == null);
      HashMap localHashMap = new HashMap(3);
      localHashMap.put("m_num", ((TroopInfo)localObject).wMemberNum + "");
      StatisticCollector.a(BaseApplication.getContext()).a(null, "AIOWebTC", false, 0L, 0L, localHashMap, "", false);
      localObject = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().a(this.jdField_a_of_type_JavaLangString, this.jdField_a_of_type_Int);
    } while (localObject == null);
    Object localObject = ((List)localObject).iterator();
    do
    {
      if (!((Iterator)localObject).hasNext()) {
        break;
      }
    } while (((ChatMessage)((Iterator)localObject).next()).msgUid != this.jdField_a_of_type_Long);
    for (int i = 1;; i = 2)
    {
      localObject = new HashMap(3);
      ((HashMap)localObject).put("m_i", i + "");
      StatisticCollector.a(BaseApplication.getContext()).a(null, "AIOWebmsgposition", false, 0L, 0L, (HashMap)localObject, "", false);
      return;
    }
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\ncd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */