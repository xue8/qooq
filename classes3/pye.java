import com.tencent.mobileqq.app.ContactSorter;
import com.tencent.mobileqq.app.FriendsManager;
import com.tencent.mobileqq.data.Friends;
import com.tencent.mobileqq.data.SpecialCareInfo;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.utils.ContactUtils;
import java.util.Comparator;

public class pye
  implements Comparator
{
  public pye(FriendsManager paramFriendsManager)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  private String a(SpecialCareInfo paramSpecialCareInfo)
  {
    Friends localFriends = this.a.a(paramSpecialCareInfo.uin);
    if (localFriends == null) {
      return paramSpecialCareInfo.uin;
    }
    return ContactUtils.a(localFriends) + localFriends.uin;
  }
  
  public int a(SpecialCareInfo paramSpecialCareInfo1, SpecialCareInfo paramSpecialCareInfo2)
  {
    return ContactSorter.a(a(paramSpecialCareInfo1), a(paramSpecialCareInfo2));
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\pye.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */