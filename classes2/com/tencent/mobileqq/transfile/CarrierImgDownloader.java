package com.tencent.mobileqq.transfile;

import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.util.DisplayMetrics;
import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.image.DownloadParams;
import com.tencent.image.URLDrawableHandler;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.utils.ImageUtil;
import java.io.File;
import java.io.OutputStream;
import java.net.URL;

public class CarrierImgDownloader
  extends HttpDownloader
{
  public static final int a = 70;
  public static final String a = "carrier";
  public static final int b = 70;
  
  public CarrierImgDownloader()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public File a(OutputStream paramOutputStream, DownloadParams paramDownloadParams, URLDrawableHandler paramURLDrawableHandler)
  {
    paramDownloadParams.url = new URL(paramDownloadParams.url.getFile());
    paramDownloadParams.urlStr = paramDownloadParams.url.toString();
    return super.a(paramOutputStream, paramDownloadParams, paramURLDrawableHandler);
  }
  
  public Object decodeFile(File paramFile, DownloadParams paramDownloadParams, URLDrawableHandler paramURLDrawableHandler)
  {
    paramURLDrawableHandler = new BitmapFactory.Options();
    paramURLDrawableHandler.inJustDecodeBounds = true;
    paramDownloadParams = BitmapFactory.decodeFile(paramFile.getAbsolutePath(), paramURLDrawableHandler);
    float f = BaseApplicationImpl.a().getResources().getDisplayMetrics().density;
    paramURLDrawableHandler.inSampleSize = (Math.min(paramURLDrawableHandler.outWidth, paramURLDrawableHandler.outHeight) / (int)(f * 70.0F + 0.5F));
    paramURLDrawableHandler.inJustDecodeBounds = false;
    try
    {
      paramFile = BitmapFactory.decodeFile(paramFile.getAbsolutePath(), paramURLDrawableHandler);
      return ImageUtil.b(ImageUtil.b(paramFile), 70, 70);
    }
    catch (OutOfMemoryError paramFile)
    {
      for (;;)
      {
        paramFile = paramDownloadParams;
      }
    }
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\mobileqq\transfile\CarrierImgDownloader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */