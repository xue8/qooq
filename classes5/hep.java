import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.biz.PoiMapActivity;
import com.tencent.biz.PoiMapActivity.PoiTab;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import java.util.ArrayList;

public class hep
  implements Runnable
{
  public hep(PoiMapActivity paramPoiMapActivity, boolean paramBoolean1, String paramString1, String paramString2, ArrayList paramArrayList, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean2)
  {
    paramBoolean1 = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void run()
  {
    label109:
    PoiMapActivity localPoiMapActivity;
    String str;
    ArrayList localArrayList;
    if (this.jdField_a_of_type_ComTencentBizPoiMapActivity.j) {
      if (this.jdField_a_of_type_Boolean)
      {
        this.jdField_a_of_type_ComTencentBizPoiMapActivity.a("rec_locate", "call_foursquare", "", "", "", "");
        this.jdField_a_of_type_ComTencentBizPoiMapActivity.jdField_b_of_type_AndroidWidgetImageView.setVisibility(0);
        if (this.jdField_a_of_type_ComTencentBizPoiMapActivity.jdField_b_of_type_AndroidWidgetLinearLayout != null) {
          this.jdField_a_of_type_ComTencentBizPoiMapActivity.jdField_b_of_type_AndroidWidgetLinearLayout.setVisibility(8);
        }
        if (!this.jdField_a_of_type_JavaLangString.equals(this.jdField_a_of_type_ComTencentBizPoiMapActivity.jdField_b_of_type_ArrayOfJavaLangString[0]))
        {
          this.jdField_a_of_type_ComTencentBizPoiMapActivity.l = 0;
          this.jdField_a_of_type_ComTencentBizPoiMapActivity.a[0].b(true);
        }
        if (TextUtils.isEmpty(this.jdField_b_of_type_JavaLangString)) {
          break label227;
        }
        if (this.jdField_b_of_type_JavaLangString.equals(this.jdField_a_of_type_ComTencentBizPoiMapActivity.c))
        {
          localPoiMapActivity = this.jdField_a_of_type_ComTencentBizPoiMapActivity;
          str = this.jdField_b_of_type_JavaLangString;
          localArrayList = this.jdField_a_of_type_JavaUtilArrayList;
          if (this.jdField_a_of_type_Int <= 0) {
            break label221;
          }
        }
      }
    }
    label221:
    for (boolean bool = true;; bool = false)
    {
      localPoiMapActivity.a(str, localArrayList, bool);
      return;
      this.jdField_a_of_type_ComTencentBizPoiMapActivity.jdField_b_of_type_AndroidWidgetImageView.setVisibility(8);
      break;
      this.jdField_a_of_type_ComTencentBizPoiMapActivity.jdField_b_of_type_AndroidWidgetImageView.setVisibility(8);
      if (this.jdField_a_of_type_ComTencentBizPoiMapActivity.jdField_b_of_type_AndroidWidgetLinearLayout == null) {
        break label109;
      }
      this.jdField_a_of_type_ComTencentBizPoiMapActivity.jdField_b_of_type_AndroidWidgetLinearLayout.setVisibility(0);
      break label109;
    }
    label227:
    this.jdField_a_of_type_ComTencentBizPoiMapActivity.a(this.jdField_a_of_type_JavaUtilArrayList, this.jdField_b_of_type_Int, this.c, this.jdField_a_of_type_JavaLangString, this.jdField_a_of_type_Int, this.d, this.jdField_b_of_type_Boolean);
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\hep.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */