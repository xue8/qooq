import android.text.TextUtils;
import com.tencent.mobileqq.activity.aio.item.GrayTipsItemBuilder;
import com.tencent.mobileqq.app.message.QQMessageFacade;
import com.tencent.mobileqq.data.MessageRecord;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import mqq.app.AppRuntime;
import mqq.app.MobileQQ;

public class nkq
  implements Runnable
{
  public nkq(GrayTipsItemBuilder paramGrayTipsItemBuilder, String paramString1, int paramInt, long paramLong, String paramString2)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void run()
  {
    Object localObject = MobileQQ.sMobileQQ.waitAppRuntime(null);
    if (localObject != null)
    {
      localObject = (QQMessageFacade)((AppRuntime)localObject).getManager(19);
      if (localObject != null)
      {
        MessageRecord localMessageRecord = ((QQMessageFacade)localObject).a(this.jdField_a_of_type_JavaLangString, this.jdField_a_of_type_Int, this.jdField_a_of_type_Long);
        if ((localMessageRecord != null) && (!TextUtils.equals(localMessageRecord.getExtInfoFromExtStr("sens_msg_original_text"), this.b)))
        {
          localMessageRecord.saveExtInfoToExtStr("sens_msg_original_text", this.b);
          ((QQMessageFacade)localObject).a(this.jdField_a_of_type_JavaLangString, this.jdField_a_of_type_Int, this.jdField_a_of_type_Long, "extLong", Integer.valueOf(localMessageRecord.extLong));
          ((QQMessageFacade)localObject).a(this.jdField_a_of_type_JavaLangString, this.jdField_a_of_type_Int, this.jdField_a_of_type_Long, "extStr", localMessageRecord.extStr);
          ((QQMessageFacade)localObject).a(localMessageRecord);
        }
      }
    }
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\nkq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */