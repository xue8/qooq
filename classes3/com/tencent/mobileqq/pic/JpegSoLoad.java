package com.tencent.mobileqq.pic;

import android.content.Context;
import android.os.Environment;
import java.io.File;

public final class JpegSoLoad
{
  public static final int FILE_NOT_FIND = -2;
  public static final int INVALID_PARAM = -1;
  private static final String JPEG_SO_LIB = "/jpeglib/";
  public static final int LOAD_ERROR = -3;
  public static final int LOAD_SUCCESS = 0;
  private static final String PKG_NAME = "com.tencent.mobileqq";
  
  public static int LoadJpegExtractedSo(String paramString)
  {
    i = 0;
    if (paramString == null) {
      return -1;
    }
    String str = getJpegSolibPath(null) + getLibActualName(paramString);
    if (!new File(str).exists()) {
      i = -2;
    }
    for (;;)
    {
      j = i;
      if (i != 0) {}
      try
      {
        System.loadLibrary(paramString);
        j = 0;
      }
      catch (UnsatisfiedLinkError paramString)
      {
        for (;;)
        {
          j = i;
        }
      }
      return j;
      try
      {
        System.load(str);
      }
      catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
      {
        i = -3;
      }
    }
  }
  
  public static String getJpegSolibPath(Context paramContext)
  {
    if (paramContext == null) {
      return Environment.getDataDirectory() + "/data/" + "com.tencent.mobileqq" + "/jpeglib/";
    }
    File localFile = paramContext.getFilesDir();
    if (localFile != null) {
      return localFile.getParent() + "/jpeglib/";
    }
    return Environment.getDataDirectory() + "/data/" + paramContext.getPackageName() + "/jpeglib/";
  }
  
  private static String getLibActualName(String paramString)
  {
    return "lib" + paramString + ".so";
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\tencent\mobileqq\pic\JpegSoLoad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */