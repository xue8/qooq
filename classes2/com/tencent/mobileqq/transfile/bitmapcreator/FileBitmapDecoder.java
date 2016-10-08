package com.tencent.mobileqq.transfile.bitmapcreator;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.utils.ImageUtil;
import com.tencent.qphone.base.util.QLog;

public class FileBitmapDecoder
{
  private static final String a = FileBitmapDecoder.class.getSimpleName();
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public Bitmap a(String paramString, int paramInt1, int paramInt2, int paramInt3, BitmapFactory.Options paramOptions)
  {
    BitmapFactory.Options localOptions = paramOptions;
    if (paramOptions == null) {
      localOptions = new BitmapFactory.Options();
    }
    if (paramInt3 == 0) {
      if ((paramInt1 > 0) && (paramInt2 > 0))
      {
        localOptions.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(paramString, localOptions);
      }
    }
    for (localOptions.inSampleSize = ImageUtil.b(localOptions, paramInt1, paramInt2);; localOptions.inSampleSize = paramInt3)
    {
      localOptions.inJustDecodeBounds = false;
      try
      {
        paramString = BitmapFactory.decodeFile(paramString, localOptions);
        return paramString;
      }
      catch (OutOfMemoryError paramString)
      {
        if (!QLog.isColorLevel()) {
          break label117;
        }
        QLog.e(a, 2, "getBitmap(): OutOfMemoryError, " + paramString.getMessage());
      }
    }
    label117:
    return null;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\mobileqq\transfile\bitmapcreator\FileBitmapDecoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */