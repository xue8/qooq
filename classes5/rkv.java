import android.os.SystemClock;
import com.tencent.image.URLDrawable;
import com.tencent.image.URLDrawable.URLDrawableListener;
import com.tencent.mobileqq.emoticonview.FastImagePreviewLayout;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.qphone.base.util.QLog;
import mqq.os.MqqHandler;

class rkv
  implements URLDrawable.URLDrawableListener
{
  rkv(rku paramrku, long paramLong)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onLoadCanceled(URLDrawable paramURLDrawable)
  {
    if (QLog.isColorLevel()) {
      QLog.d(FastImagePreviewLayout.jdField_a_of_type_JavaLangString, 2, "queryFastImage Load URLDrawable onLoadCanceled");
    }
  }
  
  public void onLoadFialed(URLDrawable paramURLDrawable, Throwable paramThrowable)
  {
    if (QLog.isColorLevel()) {
      QLog.d(FastImagePreviewLayout.jdField_a_of_type_JavaLangString, 2, "queryFastImage Load URLDrawable onLoadFialed");
    }
  }
  
  public void onLoadProgressed(URLDrawable paramURLDrawable, int paramInt)
  {
    if (QLog.isColorLevel()) {
      QLog.d(FastImagePreviewLayout.jdField_a_of_type_JavaLangString, 2, "queryFastImage Load URLDrawable onLoadProgressed");
    }
  }
  
  public void onLoadSuccessed(URLDrawable paramURLDrawable)
  {
    long l = SystemClock.elapsedRealtime() - this.jdField_a_of_type_Long;
    if (QLog.isColorLevel()) {
      QLog.d(FastImagePreviewLayout.jdField_a_of_type_JavaLangString, 2, "queryFastImage Load URLDrawable Successed, is to call showFastImage,queryTime = " + l);
    }
    if (l > 2000L) {
      return;
    }
    this.jdField_a_of_type_Rku.a.jdField_a_of_type_MqqOsMqqHandler.sendMessage(this.jdField_a_of_type_Rku.a.jdField_a_of_type_MqqOsMqqHandler.obtainMessage(32));
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\rkv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */