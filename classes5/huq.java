import com.tencent.biz.pubaccount.ecshopassit.EcShopAssistantManager;
import com.tencent.biz.pubaccount.ecshopassit.EcshopReportHandler;
import com.tencent.biz.pubaccount.serviceAccountFolder.ServiceAccountFolderManager;
import com.tencent.common.app.AppInterface;
import com.tencent.mobileqq.app.MessageObserver;
import com.tencent.mobileqq.data.MessageRecord;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import java.util.Iterator;
import java.util.List;

public class huq
  extends MessageObserver
{
  public huq(EcshopReportHandler paramEcshopReportHandler)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void a(List paramList)
  {
    super.a(paramList);
    EcshopReportHandler localEcshopReportHandler = (EcshopReportHandler)this.a.a.a(88);
    paramList = paramList.iterator();
    label129:
    while (paramList.hasNext())
    {
      MessageRecord localMessageRecord = (MessageRecord)paramList.next();
      if (("2".equals(localMessageRecord.getExtInfoFromExtStr("inter_num"))) || (ServiceAccountFolderManager.d(this.a.b, localMessageRecord.senderuin))) {}
      for (int i = 1;; i = 0)
      {
        if ((i == 0) && ((EcShopAssistantManager.c == null) || (!EcShopAssistantManager.c.contains(localMessageRecord.senderuin)))) {
          break label129;
        }
        if (i != 0) {
          localEcshopReportHandler.a(localMessageRecord);
        }
        localEcshopReportHandler.b(localMessageRecord);
        break;
      }
    }
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\huq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */