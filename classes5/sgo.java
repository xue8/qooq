import com.tencent.mobileqq.app.BizTroopObserver;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.filemanager.data.FMConfig;
import com.tencent.mobileqq.filemanager.data.FileManagerEntity;
import com.tencent.mobileqq.filemanager.fileviewer.FileView.PreviewingOfflineFileViewBase.IControllProxyInterface;
import com.tencent.mobileqq.filemanager.fileviewer.FileView.PreviewingTroopFileView;
import com.tencent.mobileqq.filemanager.fileviewer.IFileViewerAdapter;
import com.tencent.mobileqq.filemanager.util.FileManagerUtil;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.troop.utils.TroopFileTransferManager;
import com.tencent.mobileqq.troop.utils.TroopFileTransferManager.PreviewInfo;
import com.tencent.qphone.base.util.QLog;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import mqq.app.MobileQQ;

public class sgo
  implements PreviewingOfflineFileViewBase.IControllProxyInterface
{
  protected BizTroopObserver a;
  protected final QQAppInterface a;
  protected TroopFileTransferManager.PreviewInfo a;
  protected String a;
  
  public sgo(PreviewingTroopFileView paramPreviewingTroopFileView, QQAppInterface paramQQAppInterface)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface = paramQQAppInterface;
  }
  
  public int a()
  {
    return 3;
  }
  
  public String a()
  {
    return this.jdField_a_of_type_ComTencentMobileqqTroopUtilsTroopFileTransferManager$PreviewInfo.jdField_a_of_type_JavaLangString;
  }
  
  public void a()
  {
    this.jdField_a_of_type_JavaLangString = FMConfig.a(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getApplication().getBaseContext(), this.jdField_a_of_type_ComTencentMobileqqFilemanagerFileviewerFileViewPreviewingTroopFileView.a().a(), "FileType");
    FileManagerEntity localFileManagerEntity = this.jdField_a_of_type_ComTencentMobileqqFilemanagerFileviewerFileViewPreviewingTroopFileView.a().a();
    TroopFileTransferManager localTroopFileTransferManager = TroopFileTransferManager.a(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, localFileManagerEntity.TroopUin);
    if (localFileManagerEntity.strTroopFileID != null)
    {
      localTroopFileTransferManager.d(UUID.fromString(localFileManagerEntity.strTroopFileID));
      return;
    }
    localTroopFileTransferManager.a(localFileManagerEntity.strTroopFilePath, localFileManagerEntity.fileName, localFileManagerEntity.busId);
  }
  
  public String b()
  {
    return this.jdField_a_of_type_ComTencentMobileqqTroopUtilsTroopFileTransferManager$PreviewInfo.d;
  }
  
  public void b()
  {
    if (this.jdField_a_of_type_ComTencentMobileqqAppBizTroopObserver != null)
    {
      this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.b(this.jdField_a_of_type_ComTencentMobileqqAppBizTroopObserver);
      this.jdField_a_of_type_ComTencentMobileqqAppBizTroopObserver = null;
    }
  }
  
  public String c()
  {
    String str = FMConfig.a(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getApplication().getBaseContext(), this.jdField_a_of_type_ComTencentMobileqqFilemanagerFileviewerFileViewPreviewingTroopFileView.a().a(), "InterfacePage");
    return "http://" + this.jdField_a_of_type_ComTencentMobileqqTroopUtilsTroopFileTransferManager$PreviewInfo.jdField_a_of_type_JavaLangString + ":" + this.jdField_a_of_type_ComTencentMobileqqTroopUtilsTroopFileTransferManager$PreviewInfo.b + "/ftn_doc_previewer/" + str;
  }
  
  public void c()
  {
    if (this.jdField_a_of_type_ComTencentMobileqqAppBizTroopObserver != null) {
      return;
    }
    this.jdField_a_of_type_ComTencentMobileqqAppBizTroopObserver = new sgp(this);
    this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a(this.jdField_a_of_type_ComTencentMobileqqAppBizTroopObserver);
  }
  
  public String d()
  {
    return "javascript:init('" + this.jdField_a_of_type_ComTencentMobileqqTroopUtilsTroopFileTransferManager$PreviewInfo.jdField_a_of_type_JavaLangString + "','" + this.jdField_a_of_type_ComTencentMobileqqTroopUtilsTroopFileTransferManager$PreviewInfo.b + "','" + this.jdField_a_of_type_ComTencentMobileqqTroopUtilsTroopFileTransferManager$PreviewInfo.d + "','" + this.jdField_a_of_type_JavaLangString + "')";
  }
  
  public String e()
  {
    Object localObject = new HashMap();
    ((Map)localObject).put("domain", this.jdField_a_of_type_ComTencentMobileqqTroopUtilsTroopFileTransferManager$PreviewInfo.jdField_a_of_type_JavaLangString);
    ((Map)localObject).put("fileType", this.jdField_a_of_type_JavaLangString);
    ((Map)localObject).put("port", this.jdField_a_of_type_ComTencentMobileqqTroopUtilsTroopFileTransferManager$PreviewInfo.b);
    ((Map)localObject).put("downloadkey", this.jdField_a_of_type_ComTencentMobileqqTroopUtilsTroopFileTransferManager$PreviewInfo.d);
    localObject = "javascript:qpreview.onClientResponse('init'," + FileManagerUtil.a((Map)localObject) + ")";
    if (QLog.isColorLevel()) {
      QLog.i("PreviewingTroopFileView", 2, "getInitString:" + (String)localObject);
    }
    return (String)localObject;
  }
  
  public String f()
  {
    if (QLog.isColorLevel()) {
      QLog.i("PreviewingTroopFileView", 2, "getAddMoreString:" + "javascript:qpreview.onClientResponse('addMorePage',{})");
    }
    return "javascript:qpreview.onClientResponse('addMorePage',{})";
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\sgo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */