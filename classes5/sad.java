import android.os.Bundle;
import com.tencent.mobileqq.filemanager.core.UniformDownloadMgr;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public class sad
  implements Runnable
{
  public sad(UniformDownloadMgr paramUniformDownloadMgr, String paramString, Bundle paramBundle)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void run()
  {
    UniformDownloadMgr.b(this.jdField_a_of_type_ComTencentMobileqqFilemanagerCoreUniformDownloadMgr, this.jdField_a_of_type_JavaLangString, this.jdField_a_of_type_AndroidOsBundle);
    UniformDownloadMgr.b(this.jdField_a_of_type_ComTencentMobileqqFilemanagerCoreUniformDownloadMgr);
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\sad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */