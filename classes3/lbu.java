import com.tencent.mobileqq.activity.Conversation;
import com.tencent.mobileqq.activity.recent.BannerManager;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.phonelogin.PhoneNumLoginImpl;

class lbu
  implements Runnable
{
  lbu(lbt paramlbt)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void run()
  {
    boolean bool3 = true;
    int i;
    boolean bool4;
    boolean bool1;
    if (this.a.a.jdField_a_of_type_ComTencentMobileqqActivityRecentBannerManager.a(14) == 2)
    {
      i = 1;
      bool4 = PhoneNumLoginImpl.a().a(this.a.a.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface);
      if (!bool4) {
        break label122;
      }
      if (i != 0) {
        break label165;
      }
      PhoneNumLoginImpl.a().a(this.a.a.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface);
      bool1 = false;
    }
    for (;;)
    {
      label69:
      boolean bool2;
      if ((bool4) && (i == 0))
      {
        bool2 = true;
        label80:
        if ((bool4) || (!bool1) || (i == 0)) {
          break label160;
        }
      }
      label122:
      label160:
      for (bool1 = bool3;; bool1 = false)
      {
        this.a.a.b(new lbv(this, bool2, bool1));
        return;
        i = 0;
        break;
        bool1 = PhoneNumLoginImpl.a().a(this.a.a.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, this.a.a.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a());
        break label69;
        bool2 = false;
        break label80;
      }
      label165:
      bool1 = false;
    }
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\lbu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */