import com.tencent.mobileqq.data.PhoneContact;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import java.util.Comparator;

class qcs
  implements Comparator
{
  qcs(qcr paramqcr)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public int a(PhoneContact paramPhoneContact1, PhoneContact paramPhoneContact2)
  {
    return paramPhoneContact1.contactID - paramPhoneContact2.contactID;
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\qcs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */