import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.filemanager.app.FMObserver;
import com.tencent.mobileqq.filemanager.app.FileManagerEngine;
import com.tencent.mobileqq.filemanager.core.FileManagerNotifyCenter;
import com.tencent.mobileqq.filemanager.fileviewer.FileView.PhotoFileView;
import com.tencent.mobileqq.filemanager.fileviewer.FileView.PhotoFileViewBase.IControllProxyInterface;
import com.tencent.mobileqq.filemanager.fileviewer.IFileViewerAdapter;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.qphone.base.util.QLog;

public class sgf
  implements PhotoFileViewBase.IControllProxyInterface
{
  private final QQAppInterface jdField_a_of_type_ComTencentMobileqqAppQQAppInterface;
  private FMObserver jdField_a_of_type_ComTencentMobileqqFilemanagerAppFMObserver;
  
  public sgf(PhotoFileView paramPhotoFileView, QQAppInterface paramQQAppInterface)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface = paramQQAppInterface;
  }
  
  public void a()
  {
    this.jdField_a_of_type_ComTencentMobileqqFilemanagerAppFMObserver = new sgg(this);
    this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().addObserver(this.jdField_a_of_type_ComTencentMobileqqFilemanagerAppFMObserver);
  }
  
  public void a(IFileViewerAdapter paramIFileViewerAdapter)
  {
    String str;
    if (1 == paramIFileViewerAdapter.d()) {
      if (paramIFileViewerAdapter.c() == 3000)
      {
        if (paramIFileViewerAdapter.a() == null) {
          QLog.e("PhotoFileView", 1, "peerType is Disc, But Entity is null!");
        }
        str = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().a(paramIFileViewerAdapter.a(), 7);
        if (str != null) {
          this.jdField_a_of_type_ComTencentMobileqqFilemanagerFileviewerFileViewPhotoFileView.a(paramIFileViewerAdapter.e(), str);
        }
      }
    }
    do
    {
      do
      {
        return;
        str = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().a(paramIFileViewerAdapter.e(), 7, paramIFileViewerAdapter.c(), paramIFileViewerAdapter);
        break;
      } while (2 != paramIFileViewerAdapter.d());
      str = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().a(paramIFileViewerAdapter.f(), paramIFileViewerAdapter.a(), 7, paramIFileViewerAdapter);
    } while (str == null);
    this.jdField_a_of_type_ComTencentMobileqqFilemanagerFileviewerFileViewPhotoFileView.a(paramIFileViewerAdapter.f(), str);
  }
  
  public void b()
  {
    if (this.jdField_a_of_type_ComTencentMobileqqFilemanagerAppFMObserver != null) {
      this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().deleteObserver(this.jdField_a_of_type_ComTencentMobileqqFilemanagerAppFMObserver);
    }
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\sgf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */