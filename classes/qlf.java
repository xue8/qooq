import com.tencent.mobileqq.app.message.C2CMessageProcessor;
import com.tencent.mobileqq.data.MessageRecord;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import java.util.Comparator;

public class qlf
  implements Comparator
{
  public qlf(C2CMessageProcessor paramC2CMessageProcessor)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public int a(MessageRecord paramMessageRecord1, MessageRecord paramMessageRecord2)
  {
    return (int)(paramMessageRecord1.time - paramMessageRecord2.time);
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\qlf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */