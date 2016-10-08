import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.av.utils.UITools;
import com.tencent.mobileqq.activity.ChatActivityUtils;
import com.tencent.mobileqq.activity.ChatActivityUtils.StartVideoListener;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import java.util.Map;

public final class kts
  implements DialogInterface.OnClickListener
{
  public kts(int paramInt, Map paramMap, QQAppInterface paramQQAppInterface, Context paramContext, String paramString1, String paramString2, String paramString3, boolean paramBoolean1, String paramString4, boolean paramBoolean2, boolean paramBoolean3, ChatActivityUtils.StartVideoListener paramStartVideoListener, String paramString5, boolean paramBoolean4)
  {
    paramBoolean1 = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    int i = UITools.a(this.jdField_a_of_type_Int);
    String str;
    if ((this.jdField_a_of_type_JavaUtilMap != null) && (i == 1))
    {
      str = (String)this.jdField_a_of_type_JavaUtilMap.get("MultiAVType");
      if (str == null) {}
    }
    for (paramInt = Integer.valueOf(str).intValue();; paramInt = 0)
    {
      ChatActivityUtils.a(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, this.jdField_a_of_type_AndroidContentContext, i, paramInt);
      ChatActivityUtils.a(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, this.jdField_a_of_type_AndroidContentContext, this.jdField_a_of_type_Int, this.jdField_a_of_type_JavaLangString, this.jdField_b_of_type_JavaLangString, this.jdField_c_of_type_JavaLangString, this.jdField_a_of_type_Boolean, this.jdField_d_of_type_JavaLangString, this.jdField_b_of_type_Boolean, this.jdField_c_of_type_Boolean, this.jdField_a_of_type_ComTencentMobileqqActivityChatActivityUtils$StartVideoListener, this.e, this.jdField_a_of_type_JavaUtilMap, this.jdField_d_of_type_Boolean, false, false);
      paramDialogInterface.dismiss();
      return;
    }
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\kts.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */