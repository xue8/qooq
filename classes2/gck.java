import android.content.Context;
import com.rookery.asyncHttpClient.JsonHttpResponseHandler;
import com.rookery.translate.microsoft.MicrosoftTranslator;
import com.rookery.translate.type.Language;
import com.rookery.translate.type.TranslateError;
import com.rookery.translate.type.TranslateWithTimeCallback;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.qphone.base.util.QLog;
import java.util.List;
import org.apache.http.Header;
import org.json.JSONException;
import org.json.JSONObject;

public class gck
  extends JsonHttpResponseHandler
{
  public gck(MicrosoftTranslator paramMicrosoftTranslator, Long paramLong, Context paramContext, List paramList, Language paramLanguage, TranslateWithTimeCallback paramTranslateWithTimeCallback)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void a(int paramInt, Header[] paramArrayOfHeader, JSONObject paramJSONObject)
  {
    try
    {
      MicrosoftTranslator.a(this.jdField_a_of_type_ComRookeryTranslateMicrosoftMicrosoftTranslator).jdField_a_of_type_JavaLangString = paramJSONObject.getString("access_token");
      MicrosoftTranslator.a(this.jdField_a_of_type_ComRookeryTranslateMicrosoftMicrosoftTranslator).jdField_a_of_type_Long = (paramJSONObject.getLong("expires_in") * 1000L + this.jdField_a_of_type_JavaLangLong.longValue());
      MicrosoftTranslator.a(this.jdField_a_of_type_ComRookeryTranslateMicrosoftMicrosoftTranslator, this.jdField_a_of_type_AndroidContentContext, this.jdField_a_of_type_JavaUtilList, this.jdField_a_of_type_ComRookeryTranslateTypeLanguage, MicrosoftTranslator.a(this.jdField_a_of_type_ComRookeryTranslateMicrosoftMicrosoftTranslator).jdField_a_of_type_JavaLangString, this.jdField_a_of_type_JavaLangLong, this.jdField_a_of_type_ComRookeryTranslateTypeTranslateWithTimeCallback);
      return;
    }
    catch (JSONException paramArrayOfHeader)
    {
      this.jdField_a_of_type_ComRookeryTranslateTypeTranslateWithTimeCallback.a(new TranslateError(paramArrayOfHeader), this.jdField_a_of_type_JavaLangLong);
    }
  }
  
  public void a(Throwable paramThrowable, String paramString)
  {
    this.jdField_a_of_type_ComRookeryTranslateTypeTranslateWithTimeCallback.a(new TranslateError(paramThrowable), this.jdField_a_of_type_JavaLangLong);
    if (QLog.isColorLevel()) {
      QLog.e("Translator", 2, "error:" + paramThrowable + "\trequest_time:" + this.jdField_a_of_type_JavaLangLong);
    }
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\gck.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */