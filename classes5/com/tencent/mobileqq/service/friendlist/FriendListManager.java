package com.tencent.mobileqq.service.friendlist;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.service.friendlist.remote.FriendGroupListInfo;
import com.tencent.mobileqq.service.friendlist.remote.FriendListInfo;
import com.tencent.mobileqq.service.friendlist.remote.FriendSingleInfo;
import java.util.HashMap;
import java.util.List;

public class FriendListManager
{
  private static FriendListManager jdField_a_of_type_ComTencentMobileqqServiceFriendlistFriendListManager;
  private HashMap jdField_a_of_type_JavaUtilHashMap;
  private HashMap b;
  
  private FriendListManager()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_JavaUtilHashMap = new HashMap();
    this.b = new HashMap();
  }
  
  public static FriendListManager a()
  {
    if (jdField_a_of_type_ComTencentMobileqqServiceFriendlistFriendListManager == null) {
      jdField_a_of_type_ComTencentMobileqqServiceFriendlistFriendListManager = new FriendListManager();
    }
    return jdField_a_of_type_ComTencentMobileqqServiceFriendlistFriendListManager;
  }
  
  public FriendGroupListInfo a(String paramString)
  {
    return (FriendGroupListInfo)this.b.get(paramString);
  }
  
  public FriendListInfo a(String paramString)
  {
    return (FriendListInfo)this.jdField_a_of_type_JavaUtilHashMap.get(paramString);
  }
  
  public FriendSingleInfo a(String paramString1, String paramString2)
  {
    FriendListInfo localFriendListInfo = (FriendListInfo)this.jdField_a_of_type_JavaUtilHashMap.get(paramString1);
    if (localFriendListInfo == null)
    {
      paramString1 = null;
      return paramString1;
    }
    int i = 0;
    for (;;)
    {
      if (i >= localFriendListInfo.a.size()) {
        break label78;
      }
      FriendSingleInfo localFriendSingleInfo = (FriendSingleInfo)localFriendListInfo.a.get(i);
      paramString1 = localFriendSingleInfo;
      if (localFriendSingleInfo.b.equals(paramString2)) {
        break;
      }
      i += 1;
    }
    label78:
    return null;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\com\tencent\mobileqq\service\friendlist\FriendListManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */