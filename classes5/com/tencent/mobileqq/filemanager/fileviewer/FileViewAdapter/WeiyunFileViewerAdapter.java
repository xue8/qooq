package com.tencent.mobileqq.filemanager.fileviewer.FileViewAdapter;

import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.filemanager.core.FileManagerDataCenter;
import com.tencent.mobileqq.filemanager.core.FileManagerRSCenter;
import com.tencent.mobileqq.filemanager.data.FMConfig;
import com.tencent.mobileqq.filemanager.data.FileManagerEntity;
import com.tencent.mobileqq.filemanager.data.WeiYunFileInfo;
import com.tencent.mobileqq.filemanager.fileviewer.FileViewerAdapterBase;
import com.tencent.mobileqq.filemanager.util.FileManagerUtil;
import com.tencent.mobileqq.filemanager.util.FileUtil;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.service.message.MessageCache;
import com.tencent.mobileqq.utils.NetworkUtil;
import com.tencent.qphone.base.util.QLog;
import mqq.app.MobileQQ;

public class WeiyunFileViewerAdapter
  extends FileViewerAdapterBase
{
  private static final String jdField_a_of_type_JavaLangString = "WeiyunFileViewerAdapter";
  private final QQAppInterface jdField_a_of_type_ComTencentMobileqqAppQQAppInterface;
  private FileManagerEntity jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity;
  private WeiYunFileInfo jdField_a_of_type_ComTencentMobileqqFilemanagerDataWeiYunFileInfo;
  
  public WeiyunFileViewerAdapter(QQAppInterface paramQQAppInterface, WeiYunFileInfo paramWeiYunFileInfo)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface = paramQQAppInterface;
    this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataWeiYunFileInfo = paramWeiYunFileInfo;
  }
  
  private void a(FileManagerEntity paramFileManagerEntity)
  {
    this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity = paramFileManagerEntity;
  }
  
  public long a()
  {
    return this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataWeiYunFileInfo.jdField_a_of_type_Long;
  }
  
  public FileManagerEntity a()
  {
    return this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity;
  }
  
  public WeiYunFileInfo a()
  {
    return this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataWeiYunFileInfo;
  }
  
  public String a()
  {
    return this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataWeiYunFileInfo.b;
  }
  
  public void a(String paramString)
  {
    if (this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity != null)
    {
      this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.strThumbPath = paramString;
      return;
    }
    this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataWeiYunFileInfo.g = paramString;
  }
  
  public int b()
  {
    return FileManagerUtil.a(this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataWeiYunFileInfo.b);
  }
  
  public long b()
  {
    return -1L;
  }
  
  public String b()
  {
    String str = null;
    if (this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity != null) {
      str = this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.getFilePath();
    }
    FileManagerEntity localFileManagerEntity1;
    do
    {
      return str;
      FileManagerEntity localFileManagerEntity2 = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().a(this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataWeiYunFileInfo.jdField_a_of_type_JavaLangString);
      localFileManagerEntity1 = localFileManagerEntity2;
      if (localFileManagerEntity2 == null) {
        localFileManagerEntity1 = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().c(this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataWeiYunFileInfo.jdField_a_of_type_JavaLangString);
      }
    } while (localFileManagerEntity1 == null);
    a(localFileManagerEntity1);
    return this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.getFilePath();
  }
  
  public void b(String paramString)
  {
    a(paramString);
  }
  
  public int c()
  {
    return 0;
  }
  
  public long c()
  {
    return MessageCache.a() * 1000L;
  }
  
  public String c()
  {
    return FileUtil.a(a());
  }
  
  public boolean c()
  {
    return false;
  }
  
  public int d()
  {
    int i;
    if (this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity != null) {
      i = this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.getCloudType();
    }
    for (;;)
    {
      int j = i;
      if (2 == i)
      {
        j = i;
        if (FileUtil.b(b())) {
          j = 3;
        }
      }
      return j;
      FileManagerEntity localFileManagerEntity2 = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().a(this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataWeiYunFileInfo.jdField_a_of_type_JavaLangString);
      FileManagerEntity localFileManagerEntity1 = localFileManagerEntity2;
      if (localFileManagerEntity2 == null) {
        localFileManagerEntity1 = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().c(this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataWeiYunFileInfo.jdField_a_of_type_JavaLangString);
      }
      if (localFileManagerEntity1 != null)
      {
        a(localFileManagerEntity1);
        i = localFileManagerEntity1.getCloudType();
      }
      else
      {
        i = 2;
      }
    }
  }
  
  public long d()
  {
    return 0L;
  }
  
  public String d()
  {
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity != null)
    {
      localObject1 = localObject2;
      if (this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.nFileType == 5)
      {
        localObject1 = localObject2;
        if (FileUtil.b(this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.getFilePath())) {
          localObject1 = this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.getFilePath();
        }
      }
    }
    return (String)localObject1;
  }
  
  public boolean d()
  {
    return true;
  }
  
  public int e()
  {
    if (QLog.isDevelopLevel()) {
      QLog.w("WeiyunFileViewerAdapter", 4, "getFileStatus: has not status");
    }
    return -1;
  }
  
  public String e()
  {
    return null;
  }
  
  public boolean e()
  {
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
        QLog.w("WeiyunFileViewerAdapter", 1, "canAutoPreview: parse config autoPreviewenable[" + str + "] not correct");
        return false;
      }
      i = 0;
    }
    if (NetworkUtil.i(BaseApplicationImpl.getContext())) {}
    for (str = FMConfig.c(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getApplication().getBaseContext(), "WiFiMaxSize");; str = FMConfig.c(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getApplication().getBaseContext(), "3GMaxSize")) {
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
        QLog.w("WeiyunFileViewerAdapter", 1, "canAutoPreview: parse config autoPreview max size[" + str + "] not correct");
        return false;
      }
    }
    return d();
  }
  
  public int f()
  {
    if (QLog.isDevelopLevel()) {
      QLog.w("WeiyunFileViewerAdapter", 4, "getOpType: has not opType");
    }
    return -1;
  }
  
  public String f()
  {
    return this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataWeiYunFileInfo.jdField_a_of_type_JavaLangString;
  }
  
  public String g()
  {
    if (this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity != null)
    {
      if (FileUtil.b(this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.getFilePath())) {
        return this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.getFilePath();
      }
      return this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataFileManagerEntity.strThumbPath;
    }
    FileManagerEntity localFileManagerEntity2 = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().a(this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataWeiYunFileInfo.jdField_a_of_type_JavaLangString);
    FileManagerEntity localFileManagerEntity1 = localFileManagerEntity2;
    if (localFileManagerEntity2 == null) {
      localFileManagerEntity1 = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().c(this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataWeiYunFileInfo.jdField_a_of_type_JavaLangString);
    }
    if (localFileManagerEntity1 != null)
    {
      a(localFileManagerEntity1);
      if (FileUtil.b(localFileManagerEntity1.getFilePath())) {
        return localFileManagerEntity1.getFilePath();
      }
      return localFileManagerEntity1.strThumbPath;
    }
    return this.jdField_a_of_type_ComTencentMobileqqFilemanagerDataWeiYunFileInfo.g;
  }
  
  public String i()
  {
    return null;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\com\tencent\mobileqq\filemanager\fileviewer\FileViewAdapter\WeiyunFileViewerAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */