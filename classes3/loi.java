import com.tencent.mobileqq.activity.GroupManagerActivity;
import com.tencent.mobileqq.adapter.GroupEditeDragSortAdapter;
import com.tencent.mobileqq.data.Groups;
import com.tencent.mobileqq.emosm.view.DragSortListView.DropListener;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.statistics.ReportController;
import com.tencent.qphone.base.util.QLog;
import java.util.Arrays;
import java.util.List;

public class loi
  implements DragSortListView.DropListener
{
  public loi(GroupManagerActivity paramGroupManagerActivity)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void a_(int paramInt1, int paramInt2)
  {
    if (paramInt1 == paramInt2) {
      return;
    }
    int j = this.a.jdField_a_of_type_JavaUtilList.size();
    this.a.jdField_a_of_type_ArrayOfByte = new byte[j];
    this.a.b = new byte[j];
    int i = 0;
    while (i < j)
    {
      this.a.jdField_a_of_type_ArrayOfByte[i] = ((byte)((Groups)this.a.jdField_a_of_type_JavaUtilList.get(i)).group_id);
      i += 1;
    }
    if (paramInt2 < paramInt1)
    {
      i = j - 1;
      if (i >= 0)
      {
        if ((paramInt2 < i) && (i <= paramInt1)) {
          this.a.b[i] = this.a.jdField_a_of_type_ArrayOfByte[(i - 1)];
        }
        for (;;)
        {
          i -= 1;
          break;
          if (i == paramInt2) {
            this.a.b[i] = this.a.jdField_a_of_type_ArrayOfByte[paramInt1];
          } else {
            this.a.b[i] = this.a.jdField_a_of_type_ArrayOfByte[i];
          }
        }
      }
    }
    else if (paramInt1 < paramInt2)
    {
      i = 0;
      if (i < j)
      {
        if ((i < paramInt1) || (paramInt2 < i)) {
          this.a.b[i] = this.a.jdField_a_of_type_ArrayOfByte[i];
        }
        for (;;)
        {
          i += 1;
          break;
          if (i == paramInt2) {
            this.a.b[i] = this.a.jdField_a_of_type_ArrayOfByte[paramInt1];
          } else {
            this.a.b[i] = this.a.jdField_a_of_type_ArrayOfByte[(i + 1)];
          }
        }
      }
    }
    i = 0;
    while (i < j)
    {
      this.a.jdField_a_of_type_ArrayOfByte[i] = ((byte)i);
      i += 1;
    }
    Groups localGroups;
    if (paramInt2 < paramInt1)
    {
      localGroups = (Groups)this.a.jdField_a_of_type_JavaUtilList.remove(paramInt1);
      this.a.jdField_a_of_type_JavaUtilList.add(paramInt2, localGroups);
      GroupManagerActivity.a(this.a).notifyDataSetChanged();
      if (QLog.isColorLevel())
      {
        QLog.d(GroupManagerActivity.jdField_a_of_type_JavaLangString, 2, "DragSortListView.DropListener onDrop groupIdList = " + Arrays.toString(this.a.b));
        QLog.d(GroupManagerActivity.jdField_a_of_type_JavaLangString, 2, "DragSortListView.DropListener onDrop sortIdList = " + Arrays.toString(this.a.jdField_a_of_type_ArrayOfByte));
      }
      GroupManagerActivity.a(this.a, this.a.a(this.a.b, this.a.jdField_a_of_type_ArrayOfByte));
      if (QLog.isColorLevel()) {
        QLog.d(GroupManagerActivity.jdField_a_of_type_JavaLangString, 2, "SortFriendGroup needShowDialog = " + GroupManagerActivity.a(this.a));
      }
      if (!GroupManagerActivity.a(this.a)) {
        break label621;
      }
      this.a.a(2131369752);
    }
    for (;;)
    {
      ReportController.b(this.a.app, "CliOper", "", "", "category", "Move_category", 0, 0, "", "", "", "");
      return;
      if (paramInt1 >= paramInt2) {
        break;
      }
      localGroups = (Groups)this.a.jdField_a_of_type_JavaUtilList.remove(paramInt1);
      this.a.jdField_a_of_type_JavaUtilList.add(paramInt2, localGroups);
      break;
      label621:
      this.a.a();
    }
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\loi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */