import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pic.BasePicOprerator;
import com.tencent.mobileqq.pic.Logger;
import com.tencent.mobileqq.pic.PicResult;
import com.tencent.mobileqq.pic.UiCallBack;
import java.util.ArrayList;

public class tsk
  extends Handler
{
  public tsk(BasePicOprerator paramBasePicOprerator, Looper paramLooper)
  {
    super(paramLooper);
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void handleMessage(Message paramMessage)
  {
    Logger.a(this.a.b, this.a.jdField_a_of_type_JavaLangString, "dispatchMessage", "what:" + paramMessage.what + ",result:" + paramMessage.arg1 + ",obj:" + paramMessage.obj);
    if (this.a.jdField_a_of_type_ComTencentMobileqqPicUiCallBack == null) {}
    do
    {
      return;
      switch (paramMessage.what)
      {
      default: 
        return;
      case 0: 
        i = paramMessage.arg1;
        paramMessage = (PicResult)paramMessage.obj;
        this.a.jdField_a_of_type_ComTencentMobileqqPicUiCallBack.a(i, paramMessage);
        return;
      case 1: 
        paramMessage = (PicResult)paramMessage.obj;
      }
    } while (!(paramMessage.a instanceof Integer));
    this.a.jdField_a_of_type_ComTencentMobileqqPicUiCallBack.a(((Integer)paramMessage.a).intValue(), paramMessage.c);
    return;
    int i = paramMessage.arg1;
    paramMessage = (PicResult)paramMessage.obj;
    this.a.jdField_a_of_type_ComTencentMobileqqPicUiCallBack.d(i, paramMessage);
    return;
    i = paramMessage.arg1;
    paramMessage = (PicResult)paramMessage.obj;
    this.a.jdField_a_of_type_ComTencentMobileqqPicUiCallBack.b(i, paramMessage);
    return;
    i = paramMessage.arg1;
    paramMessage = (PicResult)paramMessage.obj;
    this.a.jdField_a_of_type_ComTencentMobileqqPicUiCallBack.c(i, paramMessage);
    return;
    if (paramMessage.obj != null) {}
    for (;;)
    {
      try
      {
        ArrayList localArrayList = (ArrayList)paramMessage.obj;
        this.a.jdField_a_of_type_ComTencentMobileqqPicUiCallBack.a(paramMessage.arg1, localArrayList);
        return;
      }
      catch (ClassCastException localClassCastException)
      {
        localObject = null;
        continue;
      }
      paramMessage = (PicResult)paramMessage.obj;
      this.a.jdField_a_of_type_ComTencentMobileqqPicUiCallBack.a(((Integer)paramMessage.a).intValue());
      return;
      Object localObject = null;
    }
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tsk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */