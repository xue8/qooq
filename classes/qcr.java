import SecurityAccountServer.RespondQueryQQBindingStat;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.tencent.mobileqq.app.FriendsManager;
import com.tencent.mobileqq.app.PhoneContactManagerImp;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.data.Friends;
import com.tencent.mobileqq.data.PhoneContact;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.qphone.base.util.QLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class qcr
  extends AsyncTask
{
  private static final String jdField_a_of_type_JavaLangString = "PhoneContact.Manager.ContactFriendTask";
  private List jdField_a_of_type_JavaUtilList;
  
  private qcr(PhoneContactManagerImp paramPhoneContactManagerImp)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  protected List a(RespondQueryQQBindingStat... paramVarArgs)
  {
    if (QLog.isColorLevel()) {
      QLog.d("PhoneContact.Manager.ContactFriendTask", 2, "doInBackground");
    }
    Object localObject = paramVarArgs[0];
    paramVarArgs = new ArrayList();
    paramVarArgs.addAll(PhoneContactManagerImp.a(this.jdField_a_of_type_ComTencentMobileqqAppPhoneContactManagerImp).values());
    Collections.sort(paramVarArgs, new qcs(this));
    ArrayList localArrayList = new ArrayList();
    FriendsManager localFriendsManager = (FriendsManager)PhoneContactManagerImp.a(this.jdField_a_of_type_ComTencentMobileqqAppPhoneContactManagerImp).getManager(50);
    Iterator localIterator;
    if (paramVarArgs.size() > 0)
    {
      localObject = ((RespondQueryQQBindingStat)localObject).mobileNo;
      localIterator = paramVarArgs.iterator();
    }
    PhoneContact localPhoneContact;
    do
    {
      do
      {
        if (localIterator.hasNext())
        {
          paramVarArgs = (PhoneContact)localIterator.next();
          if (!isCancelled()) {}
        }
        else
        {
          Collections.sort(localArrayList, new qct(this));
          return localArrayList;
        }
      } while ((localObject != null) && (((String)localObject).endsWith(paramVarArgs.mobileNo.trim())));
      localPhoneContact = (PhoneContact)paramVarArgs.clone();
    } while (TextUtils.isEmpty(localPhoneContact.uin));
    if (localPhoneContact.uin.equals("0"))
    {
      paramVarArgs = null;
      label201:
      if ((paramVarArgs == null) || (paramVarArgs.groupid < 0)) {
        break label272;
      }
      localPhoneContact.nickName = paramVarArgs.getFriendNick();
      localPhoneContact.remark = paramVarArgs.remark;
      localPhoneContact.faceUrl = Short.toString(paramVarArgs.faceid);
      localPhoneContact.sortWeight = 262144;
    }
    for (;;)
    {
      localArrayList.add(localPhoneContact);
      break;
      paramVarArgs = localFriendsManager.c(localPhoneContact.uin);
      break label201;
      label272:
      localPhoneContact.uin = "0";
      if (localFriendsManager.d(localPhoneContact.nationCode + localPhoneContact.mobileCode))
      {
        localPhoneContact.sortWeight = 131072;
        localPhoneContact.hasSendAddReq = true;
      }
      else if ((this.jdField_a_of_type_JavaUtilList != null) && (this.jdField_a_of_type_JavaUtilList.contains(localPhoneContact.mobileNo)))
      {
        localPhoneContact.sortWeight = this.jdField_a_of_type_JavaUtilList.indexOf(localPhoneContact.mobileNo);
      }
      else
      {
        localPhoneContact.sortWeight = 65536;
      }
    }
  }
  
  public void a(List paramList)
  {
    this.jdField_a_of_type_JavaUtilList = paramList;
  }
  
  protected void b(List paramList)
  {
    if (!isCancelled()) {
      this.jdField_a_of_type_ComTencentMobileqqAppPhoneContactManagerImp.a(paramList);
    }
  }
  
  protected void onCancelled()
  {
    if (QLog.isColorLevel()) {
      QLog.d("PhoneContact.Manager.ContactFriendTask", 2, "on cancelled");
    }
    PhoneContactManagerImp.a(this.jdField_a_of_type_ComTencentMobileqqAppPhoneContactManagerImp, null);
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\qcr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */