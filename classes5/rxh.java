import com.tencent.mobileqq.filemanager.core.FileUploader;
import com.tencent.mobileqq.filemanager.core.FileUploader.IFlowControl;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.qphone.base.util.BaseApplication;
import com.tencent.wstt.SSCM.SSCM;
import com.tencent.wstt.SSCM.Utils;

public class rxh
  implements FileUploader.IFlowControl
{
  private SSCM jdField_a_of_type_ComTencentWsttSSCMSSCM;
  
  public rxh(FileUploader paramFileUploader)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_ComTencentWsttSSCMSSCM = new SSCM();
    this.jdField_a_of_type_ComTencentWsttSSCMSSCM.a();
  }
  
  public int a(long paramLong1, long paramLong2)
  {
    int j = this.jdField_a_of_type_ComTencentWsttSSCMSSCM.a(BaseApplication.getContext(), paramLong2, paramLong1, 1048576);
    int k = Utils.a(BaseApplication.getContext());
    int i;
    if (k != 1)
    {
      i = j;
      if (k != 2) {}
    }
    else
    {
      i = j;
      if (j > 16384) {
        i = 16384;
      }
    }
    return i;
  }
  
  public void a()
  {
    this.jdField_a_of_type_ComTencentWsttSSCMSSCM.b();
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\rxh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */