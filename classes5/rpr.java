import android.widget.ImageView;
import com.tencent.image.URLDrawable;
import com.tencent.image.URLDrawable.URLDrawableListener;
import com.tencent.mobileqq.filemanager.activity.UniformDownloadActivity;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public class rpr
  implements URLDrawable.URLDrawableListener
{
  public rpr(UniformDownloadActivity paramUniformDownloadActivity, ImageView paramImageView)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onLoadCanceled(URLDrawable paramURLDrawable) {}
  
  public void onLoadFialed(URLDrawable paramURLDrawable, Throwable paramThrowable) {}
  
  public void onLoadProgressed(URLDrawable paramURLDrawable, int paramInt) {}
  
  public void onLoadSuccessed(URLDrawable paramURLDrawable)
  {
    this.jdField_a_of_type_AndroidWidgetImageView.setImageDrawable(null);
    this.jdField_a_of_type_AndroidWidgetImageView.setImageDrawable(paramURLDrawable);
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\rpr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */