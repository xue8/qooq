package com.tencent.mobileqq.app;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Process;
import android.util.DisplayMetrics;
import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.utils.DeviceInfoUtil;
import com.tencent.qphone.base.util.QLog;
import java.util.Iterator;
import java.util.List;

public class FontSettingManager
{
  private static float jdField_a_of_type_Float = 0.0F;
  public static final int a = -1000;
  public static DisplayMetrics a;
  public static final String a = "FontSettingManager";
  private static final String[] jdField_a_of_type_ArrayOfJavaLangString;
  public static DisplayMetrics b;
  public static final String b = "font_level_sp_name";
  private static final String[] b;
  public static final String c = "font_setting_font_level_key";
  public static final String d = "1";
  public static final String e = "0";
  public static final String f = "-1";
  private static final String g = "com.tencent.mobileqq";
  private static final String h = "font_set_prop";
  private static final String i = "font_level";
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    jdField_a_of_type_ArrayOfJavaLangString = new String[] { "com.tencent.mobileqq:web", "com.tencent.mobileqq:picture", "com.tencent.mobileqq:qqreader", "com.tencent.mobileqq:story", "com.tencent.mobileqq:qzone", "com.tencent.mobileqq:qwallet", "com.tencent.mobileqq:qqwifi", "com.tencent.mobileqq:qqfav", "com.tencent.mobileqq:dingdong", "com.tencent.mobileqq:buscard", "com.tencent.mobileqq:qqhotspot", "com.tencent.mobileqq" };
    jdField_a_of_type_AndroidUtilDisplayMetrics = new DisplayMetrics();
    jdField_b_of_type_AndroidUtilDisplayMetrics = new DisplayMetrics();
    jdField_a_of_type_Float = 16.0F;
    jdField_b_of_type_ArrayOfJavaLangString = new String[] { "com.tencent.mobileqq:qqreader", "com.tencent.mobileqq:photoplus", "com.tencent.mobileqq:video" };
  }
  
  public static float a()
  {
    return jdField_a_of_type_Float;
  }
  
  /* Error */
  public static float a(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull +8 -> 9
    //   4: ldc 99
    //   6: fstore_1
    //   7: fload_1
    //   8: freturn
    //   9: getstatic 104	com/tencent/common/app/BaseApplicationImpl:a	Lcom/tencent/common/app/BaseApplicationImpl;
    //   12: astore_3
    //   13: aload_3
    //   14: ifnonnull +240 -> 254
    //   17: new 106	java/util/Properties
    //   20: dup
    //   21: invokespecial 107	java/util/Properties:<init>	()V
    //   24: astore 4
    //   26: new 109	java/io/File
    //   29: dup
    //   30: new 111	java/lang/StringBuilder
    //   33: dup
    //   34: invokespecial 112	java/lang/StringBuilder:<init>	()V
    //   37: aload_0
    //   38: invokevirtual 118	android/content/Context:getFilesDir	()Ljava/io/File;
    //   41: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   44: ldc 35
    //   46: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   49: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   52: invokespecial 132	java/io/File:<init>	(Ljava/lang/String;)V
    //   55: astore_0
    //   56: aload_0
    //   57: invokevirtual 136	java/io/File:exists	()Z
    //   60: ifeq +177 -> 237
    //   63: new 138	java/io/FileInputStream
    //   66: dup
    //   67: aload_0
    //   68: invokespecial 141	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   71: astore_3
    //   72: aload_3
    //   73: astore_0
    //   74: aload 4
    //   76: aload_3
    //   77: invokevirtual 145	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   80: aload_3
    //   81: astore_0
    //   82: aload 4
    //   84: ldc 38
    //   86: invokevirtual 149	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   89: invokestatic 155	java/lang/Float:valueOf	(Ljava/lang/String;)Ljava/lang/Float;
    //   92: invokevirtual 158	java/lang/Float:floatValue	()F
    //   95: putstatic 84	com/tencent/mobileqq/app/FontSettingManager:jdField_a_of_type_Float	F
    //   98: aload_3
    //   99: astore_0
    //   100: getstatic 84	com/tencent/mobileqq/app/FontSettingManager:jdField_a_of_type_Float	F
    //   103: ldc -97
    //   105: fcmpg
    //   106: iflt +14 -> 120
    //   109: aload_3
    //   110: astore_0
    //   111: getstatic 84	com/tencent/mobileqq/app/FontSettingManager:jdField_a_of_type_Float	F
    //   114: ldc -96
    //   116: fcmpl
    //   117: ifle +10 -> 127
    //   120: aload_3
    //   121: astore_0
    //   122: ldc 82
    //   124: putstatic 84	com/tencent/mobileqq/app/FontSettingManager:jdField_a_of_type_Float	F
    //   127: aload_3
    //   128: astore_0
    //   129: getstatic 84	com/tencent/mobileqq/app/FontSettingManager:jdField_a_of_type_Float	F
    //   132: fstore_2
    //   133: aload_3
    //   134: invokevirtual 163	java/io/FileInputStream:close	()V
    //   137: fload_2
    //   138: freturn
    //   139: astore_0
    //   140: fload_2
    //   141: fstore_1
    //   142: invokestatic 168	com/tencent/qphone/base/util/QLog:isColorLevel	()Z
    //   145: ifeq -138 -> 7
    //   148: ldc 13
    //   150: iconst_2
    //   151: ldc -86
    //   153: aload_0
    //   154: invokestatic 173	com/tencent/qphone/base/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V
    //   157: fload_2
    //   158: freturn
    //   159: astore 4
    //   161: aconst_null
    //   162: astore_3
    //   163: aload_3
    //   164: astore_0
    //   165: aload 4
    //   167: invokevirtual 176	java/io/IOException:printStackTrace	()V
    //   170: aload_3
    //   171: astore_0
    //   172: ldc 82
    //   174: putstatic 84	com/tencent/mobileqq/app/FontSettingManager:jdField_a_of_type_Float	F
    //   177: aload_3
    //   178: astore_0
    //   179: getstatic 84	com/tencent/mobileqq/app/FontSettingManager:jdField_a_of_type_Float	F
    //   182: fstore_2
    //   183: aload_3
    //   184: invokevirtual 163	java/io/FileInputStream:close	()V
    //   187: fload_2
    //   188: freturn
    //   189: astore_0
    //   190: fload_2
    //   191: fstore_1
    //   192: invokestatic 168	com/tencent/qphone/base/util/QLog:isColorLevel	()Z
    //   195: ifeq -188 -> 7
    //   198: ldc 13
    //   200: iconst_2
    //   201: ldc -86
    //   203: aload_0
    //   204: invokestatic 173	com/tencent/qphone/base/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V
    //   207: fload_2
    //   208: freturn
    //   209: astore_3
    //   210: aconst_null
    //   211: astore_0
    //   212: aload_0
    //   213: invokevirtual 163	java/io/FileInputStream:close	()V
    //   216: aload_3
    //   217: athrow
    //   218: astore_0
    //   219: invokestatic 168	com/tencent/qphone/base/util/QLog:isColorLevel	()Z
    //   222: ifeq -6 -> 216
    //   225: ldc 13
    //   227: iconst_2
    //   228: ldc -86
    //   230: aload_0
    //   231: invokestatic 173	com/tencent/qphone/base/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V
    //   234: goto -18 -> 216
    //   237: ldc 82
    //   239: putstatic 84	com/tencent/mobileqq/app/FontSettingManager:jdField_a_of_type_Float	F
    //   242: ldc 82
    //   244: freturn
    //   245: astore_3
    //   246: goto -34 -> 212
    //   249: astore 4
    //   251: goto -88 -> 163
    //   254: aload_3
    //   255: astore_0
    //   256: goto -239 -> 17
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	259	0	paramContext	Context
    //   6	186	1	f1	float
    //   132	76	2	f2	float
    //   12	172	3	localObject1	Object
    //   209	8	3	localObject2	Object
    //   245	10	3	localObject3	Object
    //   24	59	4	localProperties	java.util.Properties
    //   159	7	4	localIOException1	java.io.IOException
    //   249	1	4	localIOException2	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   133	137	139	java/lang/Exception
    //   63	72	159	java/io/IOException
    //   183	187	189	java/lang/Exception
    //   63	72	209	finally
    //   212	216	218	java/lang/Exception
    //   74	80	245	finally
    //   82	98	245	finally
    //   100	109	245	finally
    //   111	120	245	finally
    //   122	127	245	finally
    //   129	133	245	finally
    //   165	170	245	finally
    //   172	177	245	finally
    //   179	183	245	finally
    //   74	80	249	java/io/IOException
    //   82	98	249	java/io/IOException
    //   100	109	249	java/io/IOException
    //   111	120	249	java/io/IOException
    //   122	127	249	java/io/IOException
    //   129	133	249	java/io/IOException
  }
  
  public static void a()
  {
    String[] arrayOfString = jdField_a_of_type_ArrayOfJavaLangString;
    int k = arrayOfString.length;
    int j = 0;
    while (j < k)
    {
      String str = arrayOfString[j];
      a(BaseApplicationImpl.getContext(), str);
      j += 1;
    }
  }
  
  public static void a(Context paramContext)
  {
    paramContext = paramContext.getResources().getDisplayMetrics();
    paramContext.density = jdField_b_of_type_AndroidUtilDisplayMetrics.density;
    paramContext.scaledDensity = jdField_b_of_type_AndroidUtilDisplayMetrics.density;
    paramContext.densityDpi = jdField_b_of_type_AndroidUtilDisplayMetrics.densityDpi;
  }
  
  /* Error */
  public static void a(Context paramContext, float paramFloat)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_0
    //   3: ifnonnull +4 -> 7
    //   6: return
    //   7: getstatic 104	com/tencent/common/app/BaseApplicationImpl:a	Lcom/tencent/common/app/BaseApplicationImpl;
    //   10: astore_2
    //   11: aload_2
    //   12: ifnonnull +167 -> 179
    //   15: new 106	java/util/Properties
    //   18: dup
    //   19: invokespecial 107	java/util/Properties:<init>	()V
    //   22: astore 4
    //   24: new 109	java/io/File
    //   27: dup
    //   28: new 111	java/lang/StringBuilder
    //   31: dup
    //   32: invokespecial 112	java/lang/StringBuilder:<init>	()V
    //   35: aload_0
    //   36: invokevirtual 118	android/content/Context:getFilesDir	()Ljava/io/File;
    //   39: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   42: ldc 35
    //   44: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   50: invokespecial 132	java/io/File:<init>	(Ljava/lang/String;)V
    //   53: astore_0
    //   54: aload_0
    //   55: invokevirtual 136	java/io/File:exists	()Z
    //   58: ifne +8 -> 66
    //   61: aload_0
    //   62: invokevirtual 207	java/io/File:createNewFile	()Z
    //   65: pop
    //   66: aload 4
    //   68: ldc 38
    //   70: fload_1
    //   71: invokestatic 210	java/lang/String:valueOf	(F)Ljava/lang/String;
    //   74: invokevirtual 214	java/util/Properties:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   77: pop
    //   78: new 216	java/io/FileOutputStream
    //   81: dup
    //   82: aload_0
    //   83: invokevirtual 219	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   86: invokespecial 220	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   89: astore_2
    //   90: aload_2
    //   91: astore_0
    //   92: aload 4
    //   94: aload_2
    //   95: aconst_null
    //   96: invokevirtual 224	java/util/Properties:store	(Ljava/io/OutputStream;Ljava/lang/String;)V
    //   99: aload_2
    //   100: ifnull -94 -> 6
    //   103: aload_2
    //   104: invokevirtual 225	java/io/FileOutputStream:close	()V
    //   107: return
    //   108: astore_0
    //   109: aload_0
    //   110: invokevirtual 176	java/io/IOException:printStackTrace	()V
    //   113: return
    //   114: astore_2
    //   115: aload_2
    //   116: invokevirtual 176	java/io/IOException:printStackTrace	()V
    //   119: goto -53 -> 66
    //   122: astore_3
    //   123: aconst_null
    //   124: astore_2
    //   125: aload_2
    //   126: astore_0
    //   127: aload_3
    //   128: invokevirtual 176	java/io/IOException:printStackTrace	()V
    //   131: aload_2
    //   132: ifnull -126 -> 6
    //   135: aload_2
    //   136: invokevirtual 225	java/io/FileOutputStream:close	()V
    //   139: return
    //   140: astore_0
    //   141: aload_0
    //   142: invokevirtual 176	java/io/IOException:printStackTrace	()V
    //   145: return
    //   146: astore_0
    //   147: aload_3
    //   148: astore_2
    //   149: aload_2
    //   150: ifnull +7 -> 157
    //   153: aload_2
    //   154: invokevirtual 225	java/io/FileOutputStream:close	()V
    //   157: aload_0
    //   158: athrow
    //   159: astore_2
    //   160: aload_2
    //   161: invokevirtual 176	java/io/IOException:printStackTrace	()V
    //   164: goto -7 -> 157
    //   167: astore_3
    //   168: aload_0
    //   169: astore_2
    //   170: aload_3
    //   171: astore_0
    //   172: goto -23 -> 149
    //   175: astore_3
    //   176: goto -51 -> 125
    //   179: aload_2
    //   180: astore_0
    //   181: goto -166 -> 15
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	184	0	paramContext	Context
    //   0	184	1	paramFloat	float
    //   10	94	2	localObject1	Object
    //   114	2	2	localIOException1	java.io.IOException
    //   124	30	2	localIOException2	java.io.IOException
    //   159	2	2	localIOException3	java.io.IOException
    //   169	11	2	localContext	Context
    //   1	1	3	localObject2	Object
    //   122	26	3	localIOException4	java.io.IOException
    //   167	4	3	localObject3	Object
    //   175	1	3	localIOException5	java.io.IOException
    //   22	71	4	localProperties	java.util.Properties
    // Exception table:
    //   from	to	target	type
    //   103	107	108	java/io/IOException
    //   61	66	114	java/io/IOException
    //   66	90	122	java/io/IOException
    //   135	139	140	java/io/IOException
    //   66	90	146	finally
    //   153	157	159	java/io/IOException
    //   92	99	167	finally
    //   127	131	167	finally
    //   92	99	175	java/io/IOException
  }
  
  public static void a(Context paramContext, SharedPreferences paramSharedPreferences, boolean paramBoolean)
  {
    if (!a(paramContext))
    {
      jdField_b_of_type_AndroidUtilDisplayMetrics.setTo(paramContext.getResources().getDisplayMetrics());
      return;
    }
    if (paramBoolean) {}
    for (float f1 = jdField_a_of_type_Float;; f1 = a(paramContext))
    {
      a(paramContext, f1, true);
      return;
    }
  }
  
  private static void a(DisplayMetrics paramDisplayMetrics)
  {
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    localDisplayMetrics.setTo(paramDisplayMetrics);
    localDisplayMetrics.density = jdField_a_of_type_AndroidUtilDisplayMetrics.density;
    localDisplayMetrics.scaledDensity = jdField_a_of_type_AndroidUtilDisplayMetrics.scaledDensity;
    localDisplayMetrics.densityDpi = jdField_a_of_type_AndroidUtilDisplayMetrics.densityDpi;
    if (QLog.isColorLevel())
    {
      QLog.d("FontSettingManager", 2, "systemMetrics.density : " + jdField_a_of_type_AndroidUtilDisplayMetrics.density);
      QLog.d("FontSettingManager", 2, "systemMetrics.scaledDensity : " + jdField_a_of_type_AndroidUtilDisplayMetrics.scaledDensity);
      QLog.d("FontSettingManager", 2, "systemMetrics.densityDpi : " + jdField_a_of_type_AndroidUtilDisplayMetrics.densityDpi);
    }
    jdField_a_of_type_AndroidUtilDisplayMetrics = localDisplayMetrics;
  }
  
  public static boolean a()
  {
    String str1 = DeviceInfoUtil.h();
    String str2 = DeviceInfoUtil.d();
    if (((str1.equals("OPPO")) && (str2.equals("R815T"))) || ((str1.equals("PHILIPS")) && (str2.equals("W6500"))) || ((str1.equals("KONKA")) && (str2.equals("K5"))) || ((str1.equals("Sony")) && (str2.equals("S39h"))) || ((str1.equals("Meitu")) && (str2.equals("MK150"))) || ((str1.equals("GiONEE")) && (str2.equals("GN137"))) || ((str1.equals("GiONEE")) && (str2.equals("GN705T"))) || ((str1.equals("GiONEE")) && (str2.equals("GN708T"))) || ((str1.equals("GiONEE")) && (str2.equals("E3T"))) || ((str1.equals("alps")) && (str2.equals("K5"))) || ((str1.equals("Xiaomi")) && (str2.equals("Mi-4c")))) {}
    while ((str2.equals("vivo Y13")) || (str2.equals("vivo X3t")) || (str2.equals("vivo Y11i T")) || (str2.equals("MI-ONE Plus")) || (str2.equals("vivoY11iT")) || (str2.equals("Coolpad 7270")) || (str2.equals("Coolpad 8122")) || (str2.equals("Lenovo A708T")) || (str2.equals("Lenovo S820")) || (str2.equals("Lenovo S898t")) || (str2.equals("GT-I9050")) || (str2.equals("GT-S7568")) || (str2.equals("DOOV S2y")) || (str2.equals("TCL J928")) || (str2.equals("vivo Y22")) || (str2.equals("ChanghongZ8t")) || (str2.equals("HUAWEI Y516-T00")) || (str2.equals("Lenovo A678t")) || (str2.equals("K-Touch T60")) || (str2.equals("vivo X710L")) || (str2.equals("HM MOTE 1TD"))) {
      return false;
    }
    return true;
  }
  
  private static boolean a(float paramFloat)
  {
    return (paramFloat > 13.82F) && (paramFloat < 18.1F);
  }
  
  private static boolean a(Context paramContext)
  {
    paramContext = BaseApplicationImpl.processName;
    String[] arrayOfString = jdField_b_of_type_ArrayOfJavaLangString;
    int k = arrayOfString.length;
    int j = 0;
    while (j < k)
    {
      if (arrayOfString[j].equals(paramContext)) {
        return false;
      }
      j += 1;
    }
    return true;
  }
  
  public static boolean a(Context paramContext, float paramFloat, boolean paramBoolean)
  {
    if (!a(paramFloat)) {
      if (QLog.isColorLevel()) {
        QLog.d("FontSettingManager", 2, "wrong scale vale : " + paramFloat);
      }
    }
    do
    {
      DisplayMetrics localDisplayMetrics;
      do
      {
        return false;
        float f1 = paramFloat / 16.0F;
        localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
        a(localDisplayMetrics);
        localDisplayMetrics.density = (jdField_a_of_type_AndroidUtilDisplayMetrics.density * f1);
        localDisplayMetrics.scaledDensity = (jdField_a_of_type_AndroidUtilDisplayMetrics.density * f1);
        localDisplayMetrics.densityDpi = ((int)(f1 * jdField_a_of_type_AndroidUtilDisplayMetrics.densityDpi));
        if (QLog.isColorLevel()) {
          QLog.d("FontSettingManager", 2, localDisplayMetrics.density + ", " + localDisplayMetrics.scaledDensity + ", " + localDisplayMetrics.densityDpi);
        }
      } while (!paramBoolean);
      jdField_b_of_type_AndroidUtilDisplayMetrics.setTo(localDisplayMetrics);
    } while (jdField_a_of_type_Float == paramFloat);
    jdField_a_of_type_Float = paramFloat;
    a(paramContext, paramFloat);
    return true;
  }
  
  private static boolean a(Context paramContext, String paramString)
  {
    if ((paramContext == null) || (paramString == null)) {
      return false;
    }
    paramContext = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses().iterator();
    while (paramContext.hasNext())
    {
      ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)paramContext.next();
      if (localRunningAppProcessInfo.processName.equals(paramString))
      {
        Process.killProcess(localRunningAppProcessInfo.pid);
        return true;
      }
    }
    return false;
  }
  
  public static void b(Context paramContext)
  {
    if (paramContext.getResources().getDisplayMetrics().density != jdField_a_of_type_AndroidUtilDisplayMetrics.density) {
      a(paramContext, 16.0F, true);
    }
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\com\tencent\mobileqq\app\FontSettingManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */