import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.biz.qqstory.playvideo.watcherlist.QQStoryWatcherListView;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public class ipz
  implements View.OnTouchListener
{
  public ipz(QQStoryWatcherListView paramQQStoryWatcherListView, GestureDetector paramGestureDetector)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (this.jdField_a_of_type_AndroidViewGestureDetector != null) {
      return this.jdField_a_of_type_AndroidViewGestureDetector.onTouchEvent(paramMotionEvent);
    }
    return false;
  }
}


/* Location:              E:\apk\QQ_91\classes6-dex2jar.jar!\ipz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */