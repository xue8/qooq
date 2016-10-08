package com.tencent.mobileqq.app.message;

import android.os.Bundle;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.data.MessageRecord;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.persistence.EntityManager;
import com.tencent.mobileqq.service.message.MessageCache;
import java.util.List;

public class SubMessageManager
  extends BaseMessageManager
{
  public SubMessageManager(QQAppInterface paramQQAppInterface, QQMessageFacade paramQQMessageFacade)
  {
    super(paramQQAppInterface, paramQQMessageFacade);
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public long a(MessageRecord paramMessageRecord)
  {
    return 0L;
  }
  
  public void a(MessageRecord paramMessageRecord, EntityManager paramEntityManager, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, BaseMessageManager.AddMessageContext paramAddMessageContext)
  {
    if (paramMessageRecord == null) {
      return;
    }
    if (paramMessageRecord.time == 0L) {
      paramMessageRecord.time = MessageCache.a();
    }
    if (paramMessageRecord.msgseq == 0L) {
      paramMessageRecord.msgseq = ((int)paramMessageRecord.time);
    }
    a(paramMessageRecord, true, 1);
  }
  
  public void a(String paramString, int paramInt, List paramList1, List paramList2, Bundle paramBundle) {}
  
  public void b(String paramString, int paramInt1, int paramInt2, QQMessageFacade.RefreshMessageContext paramRefreshMessageContext) {}
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\com\tencent\mobileqq\app\message\SubMessageManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */