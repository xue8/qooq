import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.biz.widgets.ShareAioResultDialog;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public class jjm
  implements View.OnClickListener
{
  public jjm(ShareAioResultDialog paramShareAioResultDialog, DialogInterface.OnClickListener paramOnClickListener)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onClick(View paramView)
  {
    if (this.jdField_a_of_type_AndroidContentDialogInterface$OnClickListener != null) {
      this.jdField_a_of_type_AndroidContentDialogInterface$OnClickListener.onClick(this.jdField_a_of_type_ComTencentBizWidgetsShareAioResultDialog, 0);
    }
    this.jdField_a_of_type_ComTencentBizWidgetsShareAioResultDialog.dismiss();
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\jjm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */