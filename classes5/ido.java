import android.widget.PopupWindow;
import android.widget.TextView;
import com.tencent.biz.pubaccount.subscript.SubscriptFeedsActivity;
import com.tencent.mobileqq.activity.aio.AIOUtils;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.qphone.base.util.QLog;

public class ido
  implements Runnable
{
  public ido(SubscriptFeedsActivity paramSubscriptFeedsActivity, int paramInt1, int paramInt2)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void run()
  {
    try
    {
      int[] arrayOfInt = new int[2];
      this.jdField_a_of_type_ComTencentBizPubaccountSubscriptSubscriptFeedsActivity.rightViewText.getLocationInWindow(arrayOfInt);
      int i = this.jdField_a_of_type_Int;
      int j = arrayOfInt[0];
      int k = this.b;
      int m = AIOUtils.a(2.0F, this.jdField_a_of_type_ComTencentBizPubaccountSubscriptSubscriptFeedsActivity.getResources());
      SubscriptFeedsActivity.a(this.jdField_a_of_type_ComTencentBizPubaccountSubscriptSubscriptFeedsActivity).showAsDropDown(this.jdField_a_of_type_ComTencentBizPubaccountSubscriptSubscriptFeedsActivity.rightViewText, i - j - k - m, -AIOUtils.a(5.0F, this.jdField_a_of_type_ComTencentBizPubaccountSubscriptSubscriptFeedsActivity.getResources()));
      return;
    }
    catch (Exception localException)
    {
      while (!QLog.isColorLevel()) {}
      QLog.e(SubscriptFeedsActivity.a(), 2, "showSubscriptCenterGuideWindow, " + localException);
    }
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\ido.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */