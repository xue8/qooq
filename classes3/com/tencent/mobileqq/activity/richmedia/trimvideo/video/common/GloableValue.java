package com.tencent.mobileqq.activity.richmedia.trimvideo.video.common;

import android.content.Context;
import android.media.AudioManager;
import android.text.TextUtils;
import com.tencent.mobileqq.activity.richmedia.trimvideo.video.mediadevice.StorageManager;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.qphone.base.util.BaseApplication;
import com.tencent.qphone.base.util.QLog;
import java.io.File;
import mqq.app.MobileQQ;

public class GloableValue
{
  public static long a;
  public static Context a;
  public static String a;
  private static final String b;
  private static String c;
  private static String d;
  private static String e;
  private static String f;
  private static String g;
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    b = GloableValue.class.getSimpleName();
    jdField_a_of_type_AndroidContentContext = MobileQQ.getContext();
    jdField_a_of_type_Long = -1L;
  }
  
  public static void a()
  {
    try
    {
      ((AudioManager)MobileQQ.getContext().getSystemService("audio")).requestAudioFocus(null, 3, 1);
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public static boolean a(long paramLong)
  {
    if ((jdField_a_of_type_Long > 0L) && (jdField_a_of_type_Long == paramLong)) {}
    Object localObject;
    do
    {
      return true;
      localObject = StorageManager.a().a();
      if (TextUtils.isEmpty((CharSequence)localObject)) {
        return false;
      }
      jdField_a_of_type_JavaLangString = (String)localObject + File.separator + "cover" + File.separator + paramLong;
      localObject = new File(jdField_a_of_type_JavaLangString);
    } while ((((File)localObject).mkdirs()) || (((File)localObject).isDirectory()));
    QLog.e(b, 2, "make cover dir: " + jdField_a_of_type_JavaLangString + " failed.");
    return false;
  }
  
  public static void b()
  {
    try
    {
      ((AudioManager)MobileQQ.getContext().getSystemService("audio")).abandonAudioFocus(null);
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\tencent\mobileqq\activity\richmedia\trimvideo\video\common\GloableValue.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */