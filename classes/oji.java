import com.tencent.mobileqq.activity.contact.troop.DiscussionView;
import com.tencent.mobileqq.adapter.DiscussionListAdapter2;
import com.tencent.mobileqq.app.DiscussionObserver;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.widget.PullRefreshHeader;
import com.tencent.mobileqq.widget.SlideDetectListView;
import com.tencent.qphone.base.util.QLog;
import java.util.ArrayList;

public class oji
  extends DiscussionObserver
{
  private oji(DiscussionView paramDiscussionView)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  protected void a()
  {
    this.a.jdField_a_of_type_ComTencentMobileqqAdapterDiscussionListAdapter2.notifyDataSetChanged();
  }
  
  protected void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.a.a();
    }
    this.a.jdField_a_of_type_ComTencentMobileqqAdapterDiscussionListAdapter2.notifyDataSetChanged();
    if (this.a.c)
    {
      this.a.c = false;
      if (paramBoolean)
      {
        DiscussionView.a(this.a).a(0);
        this.a.a(100, 800L);
      }
    }
    else
    {
      return;
    }
    this.a.jdField_a_of_type_ComTencentMobileqqWidgetSlideDetectListView.H();
    this.a.b(2131368597);
  }
  
  protected void a(boolean paramBoolean, int paramInt, long paramLong, String paramString)
  {
    if (paramBoolean) {
      this.a.jdField_a_of_type_ComTencentMobileqqAdapterDiscussionListAdapter2.notifyDataSetChanged();
    }
  }
  
  protected void a(boolean paramBoolean, int paramInt, long paramLong, ArrayList paramArrayList)
  {
    if (paramBoolean) {
      this.a.jdField_a_of_type_ComTencentMobileqqAdapterDiscussionListAdapter2.notifyDataSetChanged();
    }
  }
  
  protected void a(boolean paramBoolean, long paramLong)
  {
    if (paramBoolean) {
      this.a.jdField_a_of_type_ComTencentMobileqqAdapterDiscussionListAdapter2.notifyDataSetChanged();
    }
  }
  
  protected void a(boolean paramBoolean, Long paramLong)
  {
    if (QLog.isColorLevel()) {
      QLog.d("DiscussionView", 2, "onUncollectDiscussion isSuccess:" + paramBoolean + " uin:" + paramLong);
    }
    this.a.jdField_a_of_type_ComTencentMobileqqAdapterDiscussionListAdapter2.notifyDataSetChanged();
  }
  
  protected void a(boolean paramBoolean, Long paramLong1, Long paramLong2)
  {
    this.a.jdField_a_of_type_ComTencentMobileqqAdapterDiscussionListAdapter2.notifyDataSetChanged();
  }
  
  protected void a(boolean paramBoolean, String paramString)
  {
    if (paramBoolean) {
      this.a.jdField_a_of_type_ComTencentMobileqqAdapterDiscussionListAdapter2.notifyDataSetChanged();
    }
  }
  
  protected void a(boolean paramBoolean, Object[] paramArrayOfObject)
  {
    if (paramBoolean) {
      this.a.jdField_a_of_type_ComTencentMobileqqAdapterDiscussionListAdapter2.notifyDataSetChanged();
    }
  }
  
  protected void b()
  {
    this.a.jdField_a_of_type_ComTencentMobileqqAdapterDiscussionListAdapter2.notifyDataSetChanged();
  }
  
  protected void b(boolean paramBoolean, Long paramLong)
  {
    if (QLog.isColorLevel()) {
      QLog.d("DiscussionView", 2, "onUncollectDiscussion isSuccess:" + paramBoolean + " uin:" + paramLong);
    }
    this.a.jdField_a_of_type_ComTencentMobileqqAdapterDiscussionListAdapter2.notifyDataSetChanged();
  }
  
  protected void b(boolean paramBoolean, String paramString)
  {
    if (paramBoolean) {
      this.a.jdField_a_of_type_ComTencentMobileqqAdapterDiscussionListAdapter2.notifyDataSetChanged();
    }
  }
  
  protected void d(boolean paramBoolean, String paramString)
  {
    if (paramBoolean) {
      this.a.jdField_a_of_type_ComTencentMobileqqAdapterDiscussionListAdapter2.notifyDataSetChanged();
    }
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\oji.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */