package com.tencent.mobileqq.filemanager.core;

import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.ThreadManager;
import com.tencent.mobileqq.filemanager.settings.FMSettings;
import com.tencent.mobileqq.filemanager.util.FileUtil;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.utils.FileUtils;
import com.tencent.mobileqq.utils.NetworkUtil;
import com.tencent.mobileqq.utils.httputils.HttpCommunicator;
import com.tencent.mobileqq.utils.httputils.HttpMsg;
import com.tencent.mobileqq.utils.httputils.IHttpCommunicatorListener;
import com.tencent.qphone.base.util.BaseApplication;
import com.tencent.qphone.base.util.QLog;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import mqq.os.MqqHandler;
import rzp;

public class ThumbHttpDownloader
  implements IHttpCommunicatorListener
{
  public static final int a = 0;
  private static long jdField_a_of_type_Long = 0L;
  protected static final String a;
  public static final int b = -1;
  private static final String jdField_b_of_type_JavaLangString = "ThumbHttpDownloader<FileAssistant>";
  public static final int c = -2;
  public static final int d = -3;
  public static final int e = -4;
  public static final int f = -5;
  public static final int g = -6;
  public static final int h = -7;
  public static final int i = -8;
  public static final int j = -9;
  private static final int k = 8;
  private QQAppInterface jdField_a_of_type_ComTencentMobileqqAppQQAppInterface;
  private LinkedHashMap jdField_a_of_type_JavaUtilLinkedHashMap = new LinkedHashMap();
  private List jdField_a_of_type_JavaUtilList = new ArrayList();
  private List jdField_b_of_type_JavaUtilList;
  private final int l = 3;
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    jdField_a_of_type_JavaLangString = FMSettings.a().d();
  }
  
  public ThumbHttpDownloader(QQAppInterface paramQQAppInterface)
  {
    this.b = new ArrayList();
    this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface = paramQQAppInterface;
  }
  
  private ThumbHttpDownloader.DownloadTask a(long paramLong)
  {
    synchronized (this.jdField_a_of_type_JavaUtilLinkedHashMap)
    {
      ThumbHttpDownloader.DownloadTask localDownloadTask = (ThumbHttpDownloader.DownloadTask)this.jdField_a_of_type_JavaUtilLinkedHashMap.get(Long.valueOf(paramLong));
      return localDownloadTask;
    }
  }
  
  private void a(long paramLong)
  {
    synchronized (this.jdField_a_of_type_JavaUtilLinkedHashMap)
    {
      this.jdField_a_of_type_JavaUtilLinkedHashMap.remove(Long.valueOf(paramLong));
      QLog.i("ThumbHttpDownloader<FileAssistant>", 1, "[downloadThumb]  ID[" + paramLong + "] removeDowloadingTask:");
      return;
    }
  }
  
  private void a(ThumbHttpDownloader.DownloadTask paramDownloadTask)
  {
    if (paramDownloadTask.jdField_a_of_type_JavaIoFileOutputStream == null) {}
    try
    {
      QLog.i("ThumbHttpDownloader<FileAssistant>", 1, "[downloadThumb]  ID[" + paramDownloadTask.jdField_a_of_type_Long + "] runDownload...tmpname[" + String.valueOf(paramDownloadTask.jdField_c_of_type_JavaLangString) + "]");
      paramDownloadTask.jdField_a_of_type_JavaIoFileOutputStream = new FileOutputStream(paramDownloadTask.jdField_c_of_type_JavaLangString, true);
      HttpMsg localHttpMsg = new HttpMsg(paramDownloadTask.jdField_a_of_type_JavaLangString, null, this, true);
      String str = "gprs";
      if (NetworkUtil.b(BaseApplication.getContext()) == 1) {
        str = "wifi";
      }
      localHttpMsg.a("Net-type", str);
      localHttpMsg.a("Range", "bytes=0-");
      localHttpMsg.b(5);
      localHttpMsg.a(true);
      localHttpMsg.jdField_d_of_type_Int = 0;
      localHttpMsg.e = 0;
      localHttpMsg.ai = String.valueOf(paramDownloadTask.jdField_a_of_type_Long);
      QLog.d("ThumbHttpDownloader<FileAssistant>", 1, "[downloadThumb]  ID[" + paramDownloadTask.jdField_a_of_type_Long + "] start runDownload... , url[" + paramDownloadTask.jdField_a_of_type_JavaLangString + "] data RANGE[" + String.valueOf("bytes=0-") + "], peerType[" + String.valueOf(localHttpMsg.e) + "]");
      localHttpMsg.a("Accept-Encoding", "identity");
      if (paramDownloadTask.jdField_a_of_type_ComTencentMobileqqFilemanagerCoreThumbHttpDownloader$WhatHappen != null) {
        paramDownloadTask.jdField_a_of_type_ComTencentMobileqqFilemanagerCoreThumbHttpDownloader$WhatHappen.a(paramDownloadTask.jdField_a_of_type_Long, localHttpMsg);
      }
      this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().a(localHttpMsg);
      paramDownloadTask.jdField_a_of_type_ComTencentMobileqqUtilsHttputilsHttpMsg = localHttpMsg;
      return;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      a(paramDownloadTask, true);
      if (paramDownloadTask.jdField_a_of_type_ComTencentMobileqqFilemanagerCoreThumbHttpDownloader$WhatHappen != null) {
        paramDownloadTask.jdField_a_of_type_ComTencentMobileqqFilemanagerCoreThumbHttpDownloader$WhatHappen.a(paramDownloadTask.jdField_a_of_type_Long, false, -2, null, paramDownloadTask);
      }
      a(paramDownloadTask.jdField_a_of_type_Long);
      b(paramDownloadTask.jdField_c_of_type_JavaLangString);
      b();
    }
  }
  
  private void a(ThumbHttpDownloader.DownloadTask paramDownloadTask, boolean paramBoolean)
  {
    if (paramDownloadTask == null) {}
    for (;;)
    {
      return;
      paramDownloadTask.jdField_c_of_type_Long = 0L;
      try
      {
        if (paramDownloadTask.jdField_a_of_type_JavaIoFileOutputStream != null)
        {
          paramDownloadTask.jdField_a_of_type_JavaIoFileOutputStream.close();
          paramDownloadTask.jdField_a_of_type_JavaIoFileOutputStream = null;
          QLog.i("ThumbHttpDownloader<FileAssistant>", 1, "[downloadThumb][" + jdField_a_of_type_Long + "]. closeFileStream:");
        }
        for (;;)
        {
          if (paramDownloadTask.jdField_a_of_type_ComTencentMobileqqUtilsHttputilsHttpMsg != null) {
            this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().a(paramDownloadTask.jdField_a_of_type_ComTencentMobileqqUtilsHttputilsHttpMsg);
          }
          if (!paramBoolean) {
            break;
          }
          FileUtil.c(paramDownloadTask.jdField_c_of_type_JavaLangString);
          return;
          QLog.w("ThumbHttpDownloader<FileAssistant>", 1, "[downloadThumb][" + jdField_a_of_type_Long + "]. closeFileStream.had closed: stream = null:");
        }
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          paramDownloadTask.jdField_a_of_type_JavaIoFileOutputStream = null;
          QLog.e("ThumbHttpDownloader<FileAssistant>", 1, "[downloadThumb][" + jdField_a_of_type_Long + "]. closeFileStream: exception");
          localIOException.printStackTrace();
        }
      }
    }
  }
  
  private void b()
  {
    boolean bool = false;
    QLog.i("ThumbHttpDownloader<FileAssistant>", 2, "[downloadThumb]  downloadNext ,mWaitDowloadTask.size(" + String.valueOf(this.jdField_a_of_type_JavaUtilList.size()) + ")");
    synchronized (this.jdField_a_of_type_JavaUtilLinkedHashMap)
    {
      int m = this.jdField_a_of_type_JavaUtilLinkedHashMap.size();
      if (m >= 8)
      {
        QLog.w("ThumbHttpDownloader<FileAssistant>", 2, "[downloadThumb]  downloadNext ,but is have" + m + " task downloading, waiting....");
        return;
      }
      synchronized (this.jdField_a_of_type_JavaUtilList)
      {
        if (this.jdField_a_of_type_JavaUtilList.size() == 0)
        {
          QLog.w("ThumbHttpDownloader<FileAssistant>", 2, "[downloadThumb]  downloadNext ,no waiting task.");
          return;
        }
      }
    }
    ThumbHttpDownloader.DownloadTask localDownloadTask = (ThumbHttpDownloader.DownloadTask)this.jdField_a_of_type_JavaUtilList.get(0);
    if (localDownloadTask == null)
    {
      QLog.e("ThumbHttpDownloader<FileAssistant>", 2, "[downloadThumb]  mWaitDowloadTask ,task of 0 location is null. downloadNext");
      this.jdField_a_of_type_JavaUtilList.remove(0);
      b();
      return;
    }
    this.jdField_a_of_type_JavaUtilList.remove(localDownloadTask);
    b(localDownloadTask);
    QLog.i("ThumbHttpDownloader<FileAssistant>", 1, "[downloadThumb]  ID[" + localDownloadTask.jdField_a_of_type_Long + "] downloadNext send cs get url. thumb task," + localDownloadTask.toString());
    localDownloadTask.jdField_d_of_type_Long = System.currentTimeMillis();
    if (localDownloadTask.jdField_a_of_type_ComTencentMobileqqFilemanagerCoreThumbHttpDownloader$WhatHappen != null) {
      bool = localDownloadTask.jdField_a_of_type_ComTencentMobileqqFilemanagerCoreThumbHttpDownloader$WhatHappen.a(localDownloadTask.jdField_a_of_type_Long, localDownloadTask);
    }
    if (!bool)
    {
      QLog.e("ThumbHttpDownloader<FileAssistant>", 2, "[downloadThumb]  downloadNext ,geturl failed");
      a(localDownloadTask.jdField_a_of_type_Long);
      b(localDownloadTask.jdField_c_of_type_JavaLangString);
      b();
    }
  }
  
  private void b(ThumbHttpDownloader.DownloadTask paramDownloadTask)
  {
    if (paramDownloadTask == null)
    {
      QLog.e("ThumbHttpDownloader<FileAssistant>", 1, "[downloadThumb]  addDowloadingTask task = null");
      return;
    }
    synchronized (this.jdField_a_of_type_JavaUtilLinkedHashMap)
    {
      this.jdField_a_of_type_JavaUtilLinkedHashMap.put(Long.valueOf(paramDownloadTask.jdField_a_of_type_Long), paramDownloadTask);
      QLog.i("ThumbHttpDownloader<FileAssistant>", 1, "[downloadThumb]  ID[" + paramDownloadTask.jdField_a_of_type_Long + "] addDowloadingTask:" + paramDownloadTask.toString());
      return;
    }
  }
  
  private void b(String paramString)
  {
    synchronized (this.b)
    {
      this.b.remove(paramString);
      QLog.i("ThumbHttpDownloader<FileAssistant>", 1, "[downloadThumb]  ID[" + jdField_a_of_type_Long + "] removeDowloadingList:");
      return;
    }
  }
  
  public long a(String paramString, ThumbHttpDownloader.WhatHappen paramWhatHappen)
  {
    synchronized (this.jdField_a_of_type_JavaUtilList)
    {
      ThumbHttpDownloader.DownloadTask localDownloadTask = new ThumbHttpDownloader.DownloadTask();
      localDownloadTask.jdField_b_of_type_JavaLangString = paramString;
      localDownloadTask.jdField_c_of_type_JavaLangString = (paramString + ".tmp");
      if (this.b.contains(localDownloadTask.jdField_c_of_type_JavaLangString)) {
        return -1L;
      }
      this.b.add(localDownloadTask.jdField_c_of_type_JavaLangString);
      localDownloadTask.jdField_a_of_type_ComTencentMobileqqFilemanagerCoreThumbHttpDownloader$WhatHappen = paramWhatHappen;
      long l1 = jdField_a_of_type_Long;
      jdField_a_of_type_Long = 1L + l1;
      localDownloadTask.jdField_a_of_type_Long = l1;
      this.jdField_a_of_type_JavaUtilList.add(localDownloadTask);
      QLog.i("ThumbHttpDownloader<FileAssistant>", 1, "[downloadThumb]  ID[" + localDownloadTask.jdField_a_of_type_Long + "] add WaitDowloadTask waiting..." + localDownloadTask.toString());
      l1 = localDownloadTask.jdField_a_of_type_Long;
      return l1;
    }
  }
  
  public void a()
  {
    b();
  }
  
  public void a(long paramLong, boolean paramBoolean, String paramString1, int paramInt, String paramString2, String paramString3)
  {
    paramString3 = a(paramLong);
    if (paramString3 == null)
    {
      QLog.e("ThumbHttpDownloader<FileAssistant>", 2, "[downloadThumb]  ID[" + paramLong + "] OnGetThumbInfo no this task");
      b();
      return;
    }
    if (!paramBoolean)
    {
      QLog.e("ThumbHttpDownloader<FileAssistant>", 2, "[downloadThumb]  ID[" + paramLong + "] onGetDownloadUrlCome failed");
      a(paramString3.jdField_a_of_type_Long);
      b(paramString3.jdField_c_of_type_JavaLangString);
      b();
      return;
    }
    paramString1 = paramString1 + ":" + paramInt;
    ArrayList localArrayList = new ArrayList(1);
    localArrayList.add(paramString1);
    paramString3.jdField_a_of_type_ComTencentMobileqqFilemanagerCoreHttpUrlProcessor = new HttpUrlProcessor(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, localArrayList, paramString2);
    paramString3.jdField_a_of_type_JavaLangString = paramString3.jdField_a_of_type_ComTencentMobileqqFilemanagerCoreHttpUrlProcessor.a();
    ThreadManager.a().post(new rzp(this, paramString3));
  }
  
  public void a(HttpMsg paramHttpMsg) {}
  
  public final void a(HttpMsg arg1, HttpMsg paramHttpMsg2)
  {
    int n = 0;
    boolean bool = false;
    long l1 = Long.parseLong(???.ai);
    ThumbHttpDownloader.DownloadTask localDownloadTask = a(l1);
    if (localDownloadTask == null)
    {
      QLog.w("ThumbHttpDownloader<FileAssistant>", 1, "[downloadThumb] ID[" + l1 + "] decode no this task ");
      return;
    }
    if (??? != localDownloadTask.jdField_a_of_type_ComTencentMobileqqUtilsHttputilsHttpMsg)
    {
      QLog.e("ThumbHttpDownloader<FileAssistant>", 1, "[downloadThumb] ID[" + l1 + "] decode req not match");
      return;
    }
    localDownloadTask.jdField_b_of_type_ComTencentMobileqqUtilsHttputilsHttpMsg = paramHttpMsg2;
    if (paramHttpMsg2 == null)
    {
      QLog.e("ThumbHttpDownloader<FileAssistant>", 1, "[downloadThumb] ID[" + l1 + "] decode resp = null ");
      a(localDownloadTask, true);
      if (localDownloadTask.jdField_a_of_type_ComTencentMobileqqFilemanagerCoreThumbHttpDownloader$WhatHappen != null) {
        localDownloadTask.jdField_a_of_type_ComTencentMobileqqFilemanagerCoreThumbHttpDownloader$WhatHappen.a(localDownloadTask.jdField_a_of_type_Long, false, -7, null, localDownloadTask);
      }
      a(localDownloadTask.jdField_a_of_type_Long);
      b(localDownloadTask.jdField_c_of_type_JavaLangString);
      b();
      return;
    }
    int m;
    synchronized (localDownloadTask.jdField_a_of_type_ArrayOfInt)
    {
      if (paramHttpMsg2.c() != 206)
      {
        m = n;
        if (paramHttpMsg2.c() != 200) {}
      }
      else if (localDownloadTask.jdField_a_of_type_JavaIoFileOutputStream == null)
      {
        a(localDownloadTask, true);
        if (localDownloadTask.jdField_a_of_type_ComTencentMobileqqFilemanagerCoreThumbHttpDownloader$WhatHappen != null) {
          localDownloadTask.jdField_a_of_type_ComTencentMobileqqFilemanagerCoreThumbHttpDownloader$WhatHappen.a(localDownloadTask.jdField_a_of_type_Long, false, -8, null, localDownloadTask);
        }
        a(localDownloadTask.jdField_a_of_type_Long);
        b(localDownloadTask.jdField_c_of_type_JavaLangString);
        b();
        return;
      }
    }
    for (;;)
    {
      try
      {
        localDownloadTask.jdField_a_of_type_JavaIoFileOutputStream.write(paramHttpMsg2.a());
        if (localDownloadTask.jdField_b_of_type_Long == 0L)
        {
          long l2 = paramHttpMsg2.a();
          QLog.i("ThumbHttpDownloader<FileAssistant>", 1, "[downloadThumb] ID[" + l1 + "]  thumb Size[" + String.valueOf(l2) + "]");
          localDownloadTask.jdField_b_of_type_Long = l2;
        }
        localDownloadTask.e = paramHttpMsg2.a().length;
        localDownloadTask.jdField_c_of_type_Long += localDownloadTask.e;
        QLog.d("ThumbHttpDownloader<FileAssistant>", 4, "recv packeg[" + localDownloadTask.e + "],total[" + String.valueOf(localDownloadTask.jdField_c_of_type_Long) + "] thumb Size[" + String.valueOf(localDownloadTask.jdField_b_of_type_Long) + "]");
        if (localDownloadTask.jdField_c_of_type_Long >= localDownloadTask.jdField_b_of_type_Long) {
          localDownloadTask.jdField_a_of_type_ComTencentMobileqqUtilsHttputilsHttpMsg = null;
        }
      }
      catch (Exception paramHttpMsg2)
      {
        try
        {
          localDownloadTask.jdField_a_of_type_JavaIoFileOutputStream.flush();
          localDownloadTask.jdField_a_of_type_JavaIoFileOutputStream.getFD().sync();
          a(localDownloadTask, false);
          if (FileUtils.a(new File(localDownloadTask.jdField_c_of_type_JavaLangString), new File(localDownloadTask.jdField_b_of_type_JavaLangString))) {
            break label795;
          }
          m = -9;
          QLog.e("ThumbHttpDownloader<FileAssistant>", 1, "[downloadThumb] ID[" + l1 + "] renameFile failed");
          if (localDownloadTask.jdField_a_of_type_ComTencentMobileqqFilemanagerCoreThumbHttpDownloader$WhatHappen != null) {
            localDownloadTask.jdField_a_of_type_ComTencentMobileqqFilemanagerCoreThumbHttpDownloader$WhatHappen.a(localDownloadTask.jdField_a_of_type_Long, bool, m, localDownloadTask.jdField_b_of_type_JavaLangString, localDownloadTask);
          }
          a(localDownloadTask.jdField_a_of_type_Long);
          b(localDownloadTask.jdField_c_of_type_JavaLangString);
          m = 1;
          if (m == 0) {
            break;
          }
          b();
          return;
        }
        catch (IOException paramHttpMsg2)
        {
          paramHttpMsg2.printStackTrace();
          a(localDownloadTask, true);
          if (localDownloadTask.jdField_a_of_type_ComTencentMobileqqFilemanagerCoreThumbHttpDownloader$WhatHappen == null) {
            break label720;
          }
          localDownloadTask.jdField_a_of_type_ComTencentMobileqqFilemanagerCoreThumbHttpDownloader$WhatHappen.a(localDownloadTask.jdField_a_of_type_Long, false, -8, null, localDownloadTask);
          a(localDownloadTask.jdField_a_of_type_Long);
          b(localDownloadTask.jdField_c_of_type_JavaLangString);
          b();
          return;
        }
        paramHttpMsg2 = paramHttpMsg2;
        paramHttpMsg2.printStackTrace();
        a(localDownloadTask, true);
        if (localDownloadTask.jdField_a_of_type_ComTencentMobileqqFilemanagerCoreThumbHttpDownloader$WhatHappen != null) {
          localDownloadTask.jdField_a_of_type_ComTencentMobileqqFilemanagerCoreThumbHttpDownloader$WhatHappen.a(localDownloadTask.jdField_a_of_type_Long, false, -8, null, localDownloadTask);
        }
        a(localDownloadTask.jdField_a_of_type_Long);
        b(localDownloadTask.jdField_c_of_type_JavaLangString);
        b();
        return;
      }
      label720:
      int i1 = (int)((float)localDownloadTask.jdField_c_of_type_Long / (float)localDownloadTask.jdField_b_of_type_Long * 10000.0F);
      m = n;
      if (localDownloadTask.jdField_a_of_type_ComTencentMobileqqFilemanagerCoreThumbHttpDownloader$WhatHappen != null)
      {
        localDownloadTask.jdField_a_of_type_ComTencentMobileqqFilemanagerCoreThumbHttpDownloader$WhatHappen.a(localDownloadTask.jdField_a_of_type_Long, i1, localDownloadTask);
        m = n;
        continue;
        label795:
        m = 0;
        bool = true;
      }
    }
  }
  
  public void a(String paramString) {}
  
  public final boolean a(HttpMsg paramHttpMsg1, HttpMsg paramHttpMsg2, int paramInt)
  {
    return true;
  }
  
  public final void b(HttpMsg paramHttpMsg1, HttpMsg paramHttpMsg2)
  {
    long l1 = -1L;
    if (paramHttpMsg1 != null) {
      l1 = Long.parseLong(paramHttpMsg1.ai);
    }
    ThumbHttpDownloader.DownloadTask localDownloadTask = a(l1);
    if (localDownloadTask == null)
    {
      QLog.e("ThumbHttpDownloader<FileAssistant>", 1, "[downloadThumb] ID[" + l1 + "]get mMapDowloadingTask task fail, may be is success taskid[" + String.valueOf(l1) + "]");
      b();
      return;
    }
    if (paramHttpMsg2 == null)
    {
      QLog.e("ThumbHttpDownloader<FileAssistant>", 1, "[downloadThumb] ID[" + l1 + "] response is null");
      a(localDownloadTask, true);
      if (localDownloadTask.jdField_a_of_type_ComTencentMobileqqFilemanagerCoreThumbHttpDownloader$WhatHappen != null) {
        localDownloadTask.jdField_a_of_type_ComTencentMobileqqFilemanagerCoreThumbHttpDownloader$WhatHappen.a(localDownloadTask.jdField_a_of_type_Long, false, -1, null, localDownloadTask);
      }
      a(localDownloadTask.jdField_a_of_type_Long);
      b(localDownloadTask.jdField_c_of_type_JavaLangString);
      b();
      return;
    }
    if (paramHttpMsg2.d() == null) {}
    localDownloadTask.jdField_b_of_type_ComTencentMobileqqUtilsHttputilsHttpMsg = paramHttpMsg2;
    int m = paramHttpMsg2.h;
    QLog.e("ThumbHttpDownloader<FileAssistant>", 1, "[downloadThumb]  ID[" + l1 + "] handleError errCode:" + m);
    if (!NetworkUtil.e(BaseApplication.getContext()))
    {
      QLog.e("ThumbHttpDownloader<FileAssistant>", 1, "[downloadThumb] ID[" + l1 + "] net is broken");
      a(localDownloadTask, true);
      if (localDownloadTask.jdField_a_of_type_ComTencentMobileqqFilemanagerCoreThumbHttpDownloader$WhatHappen != null) {
        localDownloadTask.jdField_a_of_type_ComTencentMobileqqFilemanagerCoreThumbHttpDownloader$WhatHappen.a(localDownloadTask.jdField_a_of_type_Long, false, -3, null, localDownloadTask);
      }
      a(localDownloadTask.jdField_a_of_type_Long);
      b(localDownloadTask.jdField_c_of_type_JavaLangString);
      b();
      return;
    }
    if (paramHttpMsg1 == null)
    {
      m = -6;
      QLog.e("ThumbHttpDownloader<FileAssistant>", 1, "[downloadThumb] ID[" + l1 + "] request = null. over");
    }
    for (;;)
    {
      a(localDownloadTask, true);
      if (localDownloadTask.jdField_a_of_type_ComTencentMobileqqFilemanagerCoreThumbHttpDownloader$WhatHappen != null) {
        localDownloadTask.jdField_a_of_type_ComTencentMobileqqFilemanagerCoreThumbHttpDownloader$WhatHappen.a(localDownloadTask.jdField_a_of_type_Long, false, m, null, localDownloadTask);
      }
      a(localDownloadTask.jdField_a_of_type_Long);
      b(localDownloadTask.jdField_c_of_type_JavaLangString);
      b();
      return;
      if (paramHttpMsg2.d()) {
        break;
      }
      m = -4;
      QLog.e("ThumbHttpDownloader<FileAssistant>", 1, "[downloadThumb] ID[" + l1 + "] response.permitRetry = false. over");
    }
    if (localDownloadTask.jdField_b_of_type_Int < 3)
    {
      QLog.w("ThumbHttpDownloader<FileAssistant>", 1, "[downloadThumb] ID[" + l1 + "] try it. retryTimes:" + localDownloadTask.jdField_b_of_type_Int + " eofRetry:" + localDownloadTask.jdField_d_of_type_Int);
      localDownloadTask.jdField_b_of_type_Int += 1;
      if ((m == 9056) && (localDownloadTask.jdField_d_of_type_Int < 3))
      {
        QLog.w("ThumbHttpDownloader<FileAssistant>", 1, "[downloadThumb] ID[" + l1 + "] .Error_Exp_Eof retryTimes:" + localDownloadTask.jdField_b_of_type_Int + " eofRetry:" + localDownloadTask.jdField_d_of_type_Int);
        localDownloadTask.jdField_b_of_type_Int -= 1;
      }
      for (localDownloadTask.jdField_d_of_type_Int += 1;; localDownloadTask.jdField_d_of_type_Int = 0)
      {
        a(localDownloadTask, true);
        if (localDownloadTask.jdField_a_of_type_ComTencentMobileqqFilemanagerCoreThumbHttpDownloader$WhatHappen != null) {
          localDownloadTask.jdField_a_of_type_ComTencentMobileqqFilemanagerCoreThumbHttpDownloader$WhatHappen.a(localDownloadTask.jdField_a_of_type_Long, localDownloadTask);
        }
        localDownloadTask.jdField_c_of_type_Int += 1;
        a(localDownloadTask);
        return;
      }
    }
    QLog.w("ThumbHttpDownloader<FileAssistant>", 1, "[downloadThumb] ID[" + l1 + "] try it. retryTimes > " + 3 + " getNextUrl....");
    if (localDownloadTask.jdField_a_of_type_ComTencentMobileqqFilemanagerCoreHttpUrlProcessor != null) {}
    for (paramHttpMsg1 = localDownloadTask.jdField_a_of_type_ComTencentMobileqqFilemanagerCoreHttpUrlProcessor.a();; paramHttpMsg1 = null)
    {
      if (paramHttpMsg1 != null)
      {
        localDownloadTask.jdField_b_of_type_Int = 0;
        localDownloadTask.jdField_d_of_type_Int = 0;
        localDownloadTask.jdField_a_of_type_JavaLangString = paramHttpMsg1;
        a(localDownloadTask, true);
        this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().a(localDownloadTask.jdField_a_of_type_ComTencentMobileqqUtilsHttputilsHttpMsg);
        if (localDownloadTask.jdField_a_of_type_ComTencentMobileqqFilemanagerCoreThumbHttpDownloader$WhatHappen != null) {
          localDownloadTask.jdField_a_of_type_ComTencentMobileqqFilemanagerCoreThumbHttpDownloader$WhatHappen.b(localDownloadTask.jdField_a_of_type_Long, localDownloadTask);
        }
        localDownloadTask.jdField_c_of_type_Int += 1;
        a(localDownloadTask);
        return;
      }
      m = -5;
      QLog.w("ThumbHttpDownloader<FileAssistant>", 1, "[downloadThumb] ID[" + l1 + "] had not nextUrl, over....");
      break;
    }
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\com\tencent\mobileqq\filemanager\core\ThumbHttpDownloader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */