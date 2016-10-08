import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.open.base.LogUtility;
import com.tencent.open.downloadnew.DownloadInfo;
import com.tencent.open.downloadnew.DownloadQueryListener;
import com.tencent.open.export.js.VipDownloadInterface;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class wxv
  implements DownloadQueryListener
{
  public wxv(VipDownloadInterface paramVipDownloadInterface, String paramString)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void a(int paramInt, String paramString)
  {
    LogUtility.e(this.jdField_a_of_type_ComTencentOpenExportJsVipDownloadInterface.b, "getQueryDownloadAction ERROR");
  }
  
  public void b(List paramList)
  {
    LogUtility.c(this.jdField_a_of_type_ComTencentOpenExportJsVipDownloadInterface.b, "getQueryDownloadAction onResult = " + paramList.size());
    JSONArray localJSONArray = new JSONArray();
    int j = paramList.size();
    int i = 0;
    for (;;)
    {
      if (i < j)
      {
        JSONObject localJSONObject = new JSONObject();
        DownloadInfo localDownloadInfo = (DownloadInfo)paramList.get(i);
        try
        {
          localJSONObject.put("appid", localDownloadInfo.b);
          localJSONObject.put("pro", localDownloadInfo.l);
          localJSONObject.put("state", localDownloadInfo.a());
          localJSONObject.put("ismyapp", localDownloadInfo.h);
          localJSONArray.put(localJSONObject);
          i += 1;
        }
        catch (JSONException localJSONException)
        {
          for (;;)
          {
            localJSONException.printStackTrace();
          }
        }
      }
    }
    paramList = "javascript:if (typeof(QzoneApp) === 'object' && typeof(QzoneApp.fire) === 'function') { QzoneApp.fire('interface.getQueryDownloadAction',{\"guid\": " + this.jdField_a_of_type_JavaLangString + ", \"r\" : 0, \"data\":" + localJSONArray.toString() + "});}void(0);";
    LogUtility.c(this.jdField_a_of_type_ComTencentOpenExportJsVipDownloadInterface.b, "querySucess : " + paramList);
    this.jdField_a_of_type_ComTencentOpenExportJsVipDownloadInterface.a(paramList);
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\wxv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */