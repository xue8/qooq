import android.app.Activity;
import com.tencent.common.galleryactivity.AbstractAnimationManager;
import com.tencent.common.galleryactivity.AbstractGalleryPageView;
import com.tencent.common.galleryactivity.AbstractGalleryScene;
import com.tencent.common.galleryactivity.AbstractProgressView;
import com.tencent.common.galleryactivity.AnimationLister;
import com.tencent.common.galleryactivity.GalleryManager;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.qphone.base.util.QLog;
import com.tencent.widget.Gallery;

public class jkq
  implements AnimationLister
{
  public jkq(AbstractGalleryScene paramAbstractGalleryScene)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void b()
  {
    if (QLog.isColorLevel()) {
      QLog.d("GalleryComponent", 2, "gallery onEnterAnimationEnd");
    }
    if (this.a.jdField_a_of_type_ComTencentWidgetGallery.getVisibility() != 0) {
      this.a.jdField_a_of_type_ComTencentWidgetGallery.setVisibility(0);
    }
    this.a.b();
    if ((this.a.jdField_a_of_type_ComTencentCommonGalleryactivityAbstractProgressView != null) && (!this.a.jdField_a_of_type_ComTencentCommonGalleryactivityAbstractProgressView.a())) {
      this.a.jdField_a_of_type_ComTencentCommonGalleryactivityAbstractProgressView.a();
    }
  }
  
  public void c()
  {
    if (this.a.jdField_a_of_type_ComTencentCommonGalleryactivityGalleryManager.a().b) {
      this.a.jdField_a_of_type_ComTencentWidgetGallery.setVisibility(4);
    }
    this.a.c();
    if ((this.a.jdField_a_of_type_ComTencentCommonGalleryactivityAbstractProgressView != null) && (this.a.jdField_a_of_type_ComTencentCommonGalleryactivityAbstractProgressView.a())) {
      this.a.jdField_a_of_type_ComTencentCommonGalleryactivityAbstractProgressView.b();
    }
  }
  
  public void d()
  {
    if (this.a.jdField_a_of_type_ComTencentCommonGalleryactivityGalleryManager.a().b) {
      this.a.jdField_a_of_type_ComTencentWidgetGallery.setVisibility(4);
    }
    if (this.a.jdField_a_of_type_ComTencentCommonGalleryactivityAbstractGalleryPageView != null) {
      this.a.jdField_a_of_type_ComTencentCommonGalleryactivityAbstractGalleryPageView.a(4);
    }
    if ((this.a.jdField_a_of_type_ComTencentCommonGalleryactivityAbstractProgressView != null) && (this.a.jdField_a_of_type_ComTencentCommonGalleryactivityAbstractProgressView.a())) {
      this.a.jdField_a_of_type_ComTencentCommonGalleryactivityAbstractProgressView.b();
    }
    this.a.d();
    this.a.jdField_a_of_type_ComTencentWidgetGallery.e();
  }
  
  public void e()
  {
    this.a.e();
    StringBuilder localStringBuilder;
    if (QLog.isColorLevel())
    {
      localStringBuilder = new StringBuilder().append("gallery onExitAnimationEnd ");
      if (this.a.jdField_a_of_type_ComTencentCommonGalleryactivityGalleryManager.a() != this.a) {
        break label87;
      }
    }
    label87:
    for (boolean bool = true;; bool = false)
    {
      QLog.d("GalleryComponent", 2, bool);
      if (this.a.jdField_a_of_type_ComTencentCommonGalleryactivityGalleryManager.a() != this.a) {
        break;
      }
      this.a.jdField_a_of_type_AndroidAppActivity.finish();
      return;
    }
    this.a.jdField_a_of_type_ComTencentWidgetGallery.setVisibility(0);
    this.a.k();
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\jkq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */