import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.utils.DialogUtil;
import com.tencent.mobileqq.utils.QQCustomDialog;

public final class sik
  implements Runnable
{
  public sik(Context paramContext, String paramString, int paramInt, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void run()
  {
    DialogUtil.a(this.jdField_a_of_type_AndroidContentContext, 230, this.jdField_a_of_type_JavaLangString, this.jdField_a_of_type_AndroidContentContext.getString(this.jdField_a_of_type_Int), 2131362754, 2131362755, this.jdField_a_of_type_AndroidContentDialogInterface$OnClickListener, this.b).show();
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\sik.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */