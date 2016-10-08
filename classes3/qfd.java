import AvatarInfo.QQHeadInfo;
import android.text.TextUtils;
import com.tencent.mobileqq.app.FriendListHandler;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.QQHeadDownloadHandler;
import com.tencent.mobileqq.data.Setting;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.nearby.NearbyProxy;
import com.tencent.mobileqq.persistence.EntityManager;
import com.tencent.mobileqq.persistence.EntityManagerFactory;
import com.tencent.mobileqq.util.FaceInfo;
import com.tencent.mobileqq.util.IPCFaceHelper;
import com.tencent.mobileqq.util.ProfileCardUtil;
import com.tencent.mobileqq.utils.NetworkUtil;
import java.io.File;

public class qfd
  implements Runnable
{
  QQHeadInfo jdField_a_of_type_AvatarInfoQQHeadInfo;
  Setting jdField_a_of_type_ComTencentMobileqqDataSetting;
  FaceInfo jdField_a_of_type_ComTencentMobileqqUtilFaceInfo;
  
  public qfd(QQHeadDownloadHandler paramQQHeadDownloadHandler, Setting paramSetting, FaceInfo paramFaceInfo)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_ComTencentMobileqqDataSetting = paramSetting;
    this.jdField_a_of_type_AvatarInfoQQHeadInfo = paramFaceInfo.jdField_a_of_type_AvatarInfoQQHeadInfo;
    this.jdField_a_of_type_ComTencentMobileqqUtilFaceInfo = paramFaceInfo;
  }
  
  public void run()
  {
    int i = 0;
    QQHeadDownloadHandler.a(this.jdField_a_of_type_ComTencentMobileqqAppQQHeadDownloadHandler).a(this.jdField_a_of_type_ComTencentMobileqqDataSetting);
    Object localObject1 = QQHeadDownloadHandler.a(this.jdField_a_of_type_ComTencentMobileqqAppQQHeadDownloadHandler).a().createEntityManager();
    ((EntityManager)localObject1).b(this.jdField_a_of_type_ComTencentMobileqqDataSetting);
    ((EntityManager)localObject1).a();
    QQHeadDownloadHandler.a(this.jdField_a_of_type_ComTencentMobileqqAppQQHeadDownloadHandler).a(45, true, this.jdField_a_of_type_ComTencentMobileqqDataSetting);
    if (this.jdField_a_of_type_AvatarInfoQQHeadInfo.dstUsrType == 32)
    {
      localObject1 = QQHeadDownloadHandler.a(this.jdField_a_of_type_ComTencentMobileqqAppQQHeadDownloadHandler).a().a(true);
      if (localObject1 != null) {
        ((IPCFaceHelper)localObject1).a(32, this.jdField_a_of_type_ComTencentMobileqqUtilFaceInfo.jdField_a_of_type_JavaLangString, this.jdField_a_of_type_ComTencentMobileqqUtilFaceInfo.b);
      }
    }
    localObject1 = QQHeadDownloadHandler.a(this.jdField_a_of_type_ComTencentMobileqqAppQQHeadDownloadHandler).a(this.jdField_a_of_type_AvatarInfoQQHeadInfo.uin, this.jdField_a_of_type_AvatarInfoQQHeadInfo.phoneNum);
    String str1 = QQHeadDownloadHandler.a(this.jdField_a_of_type_ComTencentMobileqqAppQQHeadDownloadHandler).a(this.jdField_a_of_type_AvatarInfoQQHeadInfo.dstUsrType, (String)localObject1, this.jdField_a_of_type_AvatarInfoQQHeadInfo.idType);
    Object localObject2 = str1.substring(0, str1.lastIndexOf("/"));
    String str2 = str1.substring(str1.lastIndexOf("/") + 1);
    if ((!TextUtils.isEmpty(str2)) && (str2.endsWith("jpg_")))
    {
      localObject2 = new File((String)localObject2 + File.separator + str2.substring(0, str2.lastIndexOf("jpg_")) + "png");
      if (((File)localObject2).exists()) {
        ((File)localObject2).delete();
      }
    }
    for (;;)
    {
      try
      {
        int j = NetworkUtil.b(QQHeadDownloadHandler.a(this.jdField_a_of_type_ComTencentMobileqqAppQQHeadDownloadHandler).a());
        if (this.jdField_a_of_type_AvatarInfoQQHeadInfo.dstUsrType != 1) {
          continue;
        }
        k = (int)new File(str1).length();
        if (k > 0) {
          QQHeadDownloadHandler.a(this.jdField_a_of_type_ComTencentMobileqqAppQQHeadDownloadHandler).a(QQHeadDownloadHandler.a(this.jdField_a_of_type_ComTencentMobileqqAppQQHeadDownloadHandler).a(), false, j, 131074, i, k + 126 + 239);
        }
      }
      catch (Throwable localThrowable)
      {
        int k;
        localThrowable.printStackTrace();
        continue;
        if (this.jdField_a_of_type_AvatarInfoQQHeadInfo.dstUsrType != 16) {
          continue;
        }
        localObject1 = "qcall_" + this.jdField_a_of_type_AvatarInfoQQHeadInfo.idType + "_" + (String)localObject1;
        ProfileCardUtil.a((String)localObject1);
        ProfileCardUtil.a(QQHeadDownloadHandler.a(this.jdField_a_of_type_ComTencentMobileqqAppQQHeadDownloadHandler), (String)localObject1);
        return;
        ProfileCardUtil.a((String)localObject1);
        ProfileCardUtil.a(QQHeadDownloadHandler.a(this.jdField_a_of_type_ComTencentMobileqqAppQQHeadDownloadHandler), (String)localObject1);
      }
      if (this.jdField_a_of_type_AvatarInfoQQHeadInfo.dstUsrType != 32) {
        continue;
      }
      localObject1 = "stranger_" + this.jdField_a_of_type_AvatarInfoQQHeadInfo.idType + "_" + (String)localObject1;
      ProfileCardUtil.a((String)localObject1);
      ProfileCardUtil.a(QQHeadDownloadHandler.a(this.jdField_a_of_type_ComTencentMobileqqAppQQHeadDownloadHandler), (String)localObject1);
      return;
      if (this.jdField_a_of_type_AvatarInfoQQHeadInfo.dstUsrType == 4)
      {
        i = 1;
      }
      else if (this.jdField_a_of_type_AvatarInfoQQHeadInfo.dstUsrType == 11)
      {
        i = 3;
      }
      else
      {
        k = this.jdField_a_of_type_AvatarInfoQQHeadInfo.dstUsrType;
        if (k == 32) {
          i = 1003;
        }
      }
    }
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\qfd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */