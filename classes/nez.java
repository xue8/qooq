import com.tencent.mobileqq.activity.aio.anim.AIOAnimationConatiner;
import com.tencent.mobileqq.activity.aio.anim.FloorJumper;
import com.tencent.mobileqq.activity.aio.anim.FloorJumperSet;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;

public class nez
  implements Runnable
{
  private nez(FloorJumperSet paramFloorJumperSet)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void run()
  {
    Iterator localIterator = this.a.jdField_a_of_type_JavaUtilArrayList.iterator();
    long l1 = -1L;
    if (localIterator.hasNext())
    {
      long l2 = ((FloorJumper)localIterator.next()).a();
      if (l2 >= 0L) {
        if (l1 < 0L) {
          l1 = l2;
        }
      }
      for (;;)
      {
        break;
        l1 = Math.min(l1, l2);
        continue;
        localIterator.remove();
      }
    }
    if (l1 >= 0L)
    {
      if (FloorJumperSet.a(this.a) == 0L) {
        this.a.jdField_a_of_type_ComTencentWidgetListView.postDelayed(this, l1);
      }
      this.a.jdField_a_of_type_ComTencentMobileqqActivityAioAnimAIOAnimationConatiner.invalidate();
      return;
    }
    this.a.d();
    this.a.jdField_a_of_type_ComTencentMobileqqActivityAioAnimAIOAnimationConatiner.invalidate();
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\nez.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */