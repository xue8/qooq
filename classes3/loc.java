import com.tencent.mobileqq.activity.GroupManagerActivity;
import com.tencent.mobileqq.app.FriendListObserver;
import com.tencent.mobileqq.app.proxy.GroupActionResp;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.qphone.base.util.QLog;

public class loc
  extends FriendListObserver
{
  public loc(GroupManagerActivity paramGroupManagerActivity)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  protected void a(boolean paramBoolean, GroupActionResp paramGroupActionResp)
  {
    if (QLog.isColorLevel()) {
      QLog.d(GroupManagerActivity.a, 2, "onAddGroupResp isSuccess = " + paramBoolean);
    }
    this.a.a(paramBoolean);
    GroupManagerActivity.c(this.a, true);
  }
  
  protected void b(boolean paramBoolean, GroupActionResp paramGroupActionResp)
  {
    if (QLog.isColorLevel()) {
      QLog.d(GroupManagerActivity.a, 2, "onRenameGroupResp isSuccess = " + paramBoolean);
    }
    this.a.a(paramBoolean);
    GroupManagerActivity.c(this.a, true);
  }
  
  protected void c(boolean paramBoolean, GroupActionResp paramGroupActionResp)
  {
    if (QLog.isColorLevel()) {
      QLog.d(GroupManagerActivity.a, 2, "onDeleteGroupResp isSuccess = " + paramBoolean);
    }
    this.a.a(paramBoolean);
    GroupManagerActivity.c(this.a, true);
  }
  
  protected void d(boolean paramBoolean, GroupActionResp paramGroupActionResp)
  {
    if (QLog.isColorLevel()) {
      QLog.d(GroupManagerActivity.a, 2, "onResortGroupResp isSuccess = " + paramBoolean);
    }
    this.a.a(true);
    GroupManagerActivity.c(this.a, true);
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\loc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */