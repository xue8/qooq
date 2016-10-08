package com.tencent.mobileqq.filemanager.fileviewer.FileViewAdapter;

import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.filemanager.data.FMConfig;
import com.tencent.mobileqq.filemanager.data.FileManagerEntity;
import com.tencent.mobileqq.filemanager.fileviewer.FileBrowserActivity;
import com.tencent.mobileqq.filemanager.util.FileManagerUtil;
import com.tencent.mobileqq.filemanager.util.FileUtil;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.troop.data.TroopFileStatusInfo;
import com.tencent.mobileqq.troop.utils.TroopFileUtils;
import com.tencent.mobileqq.utils.NetworkUtil;
import com.tencent.qphone.base.util.BaseApplication;
import com.tencent.qphone.base.util.QLog;
import mqq.app.MobileQQ;

public class TroopFileViewerAdapter
  extends EntityFileViewerAdapter
{
  QQAppInterface jdField_a_of_type_ComTencentMobileqqAppQQAppInterface;
  public TroopFileStatusInfo a;
  final String jdField_a_of_type_JavaLangString;
  
  public TroopFileViewerAdapter(QQAppInterface paramQQAppInterface, FileManagerEntity paramFileManagerEntity)
  {
    super(paramQQAppInterface, paramFileManagerEntity);
    boolean bool1 = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_JavaLangString = "TroopFileViewerAdapter";
    this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface = paramQQAppInterface;
    this.jdField_a_of_type_Boolean = FileManagerUtil.a(paramQQAppInterface, paramFileManagerEntity.fileName, paramFileManagerEntity.fileSize);
    if ((paramFileManagerEntity.isZipInnerFile) && (FileBrowserActivity.a(paramQQAppInterface, this))) {
      this.jdField_a_of_type_Boolean = false;
    }
    this.jdField_a_of_type_ComTencentMobileqqTroopDataTroopFileStatusInfo = TroopFileUtils.a(paramQQAppInterface, paramFileManagerEntity);
    if ((this.jdField_a_of_type_ComTencentMobileqqTroopDataTroopFileStatusInfo.b == 2) || (this.jdField_a_of_type_ComTencentMobileqqTroopDataTroopFileStatusInfo.b == 3))
    {
      boolean bool3 = FileManagerUtil.a(this);
      if (d() == 3)
      {
        bool1 = bool2;
        if (this.jdField_a_of_type_Boolean)
        {
          bool1 = bool2;
          if (bool3) {
            bool1 = true;
          }
        }
        this.jdField_a_of_type_Boolean = bool1;
      }
    }
  }
  
  public String c()
  {
    String str2 = FileUtil.a(super.a());
    String str1 = str2;
    if (104 == super.a().busId)
    {
      str1 = str2;
      if (super.a().lastTime > 0L)
      {
        str1 = str2 + BaseApplicationImpl.getContext().getString(2131362770);
        str1 = str1 + TroopFileUtils.a(BaseApplicationImpl.getContext(), super.a().lastTime);
      }
    }
    return str1;
  }
  
  public int d()
  {
    if (FileUtil.b(super.b())) {
      return 3;
    }
    return super.d();
  }
  
  public boolean e()
  {
    if (!this.jdField_a_of_type_Boolean) {
      return false;
    }
    String str = FMConfig.c(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getApplication().getBaseContext(), "FunctionSwitch");
    int i;
    for (;;)
    {
      try
      {
        i = Integer.parseInt(str);
        if (i == 1)
        {
          i = 1;
          if (i != 0) {
            break;
          }
          return false;
        }
      }
      catch (NumberFormatException localNumberFormatException1)
      {
        QLog.w("TroopFileViewerAdapter", 1, "canAutoPreview: parse config autoPreviewenable[" + str + "] not correct");
        return false;
      }
      i = 0;
    }
    if (NetworkUtil.i(BaseApplicationImpl.getContext())) {}
    for (str = FMConfig.c(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getApplication().getBaseContext(), "WiFiGroupMaxSize");; str = FMConfig.c(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getApplication().getBaseContext(), "3GGroupMaxSize")) {
      try
      {
        i = Integer.parseInt(str);
        if (a() <= i * 1024 * 1024) {
          break;
        }
        return false;
      }
      catch (NumberFormatException localNumberFormatException2)
      {
        QLog.w("TroopFileViewerAdapter", 1, "canAutoPreview: parse config autoPreview max size[" + str + "] not correct");
        return false;
      }
    }
    if (!d()) {
      return false;
    }
    return (this.jdField_a_of_type_ComTencentMobileqqTroopDataTroopFileStatusInfo.b != 6) && (this.jdField_a_of_type_ComTencentMobileqqTroopDataTroopFileStatusInfo.b != 11);
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\com\tencent\mobileqq\filemanager\fileviewer\FileViewAdapter\TroopFileViewerAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */