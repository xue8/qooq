package com.tencent.mobileqq.structmsg;

import android.text.TextUtils;
import com.tencent.mobileqq.app.DeviceProfileManager;
import com.tencent.mobileqq.app.DeviceProfileManager.DpcNames;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.structmsg.view.StructMsgItemLayout5;
import com.tencent.mobileqq.structmsg.view.StructMsgItemVideo;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.List;

public class CGILoader
{
  public static final String a = "CGILoader";
  private static WeakReference a;
  public static final String b = "http://cgi.connect.qq.com/qqconnectopen/get_urlinfoForQQV2?url=%2$s&uin=%1$s";
  private static WeakReference b;
  public static final String c = "qsvideo";
  
  public CGILoader()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public static int a(int paramInt)
  {
    int i = 1;
    if (paramInt == 3000) {
      i = 2;
    }
    while (paramInt != 1) {
      return i;
    }
    return 3;
  }
  
  /* Error */
  public static String a(android.content.Context paramContext, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc 12
    //   2: iconst_2
    //   3: anewarray 4	java/lang/Object
    //   6: dup
    //   7: iconst_0
    //   8: aload_1
    //   9: aastore
    //   10: dup
    //   11: iconst_1
    //   12: aload_2
    //   13: invokestatic 38	java/net/URLEncoder:encode	(Ljava/lang/String;)Ljava/lang/String;
    //   16: aastore
    //   17: invokestatic 44	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   20: astore 6
    //   22: ldc 46
    //   24: astore 5
    //   26: aload 5
    //   28: astore_1
    //   29: aload 5
    //   31: astore_3
    //   32: aload 5
    //   34: astore 4
    //   36: aload_0
    //   37: aload 6
    //   39: aconst_null
    //   40: ldc 48
    //   42: aconst_null
    //   43: aconst_null
    //   44: sipush 10000
    //   47: sipush 10000
    //   50: invokestatic 53	com/tencent/biz/common/util/HttpUtil:a	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;II)Lorg/apache/http/HttpResponse;
    //   53: astore 6
    //   55: aconst_null
    //   56: astore_1
    //   57: aload_1
    //   58: astore_0
    //   59: aload 6
    //   61: ifnull +49 -> 110
    //   64: aload_1
    //   65: astore_0
    //   66: aload 5
    //   68: astore_1
    //   69: aload 5
    //   71: astore_3
    //   72: aload 5
    //   74: astore 4
    //   76: aload 6
    //   78: invokeinterface 59 1 0
    //   83: invokeinterface 65 1 0
    //   88: sipush 200
    //   91: if_icmpne +19 -> 110
    //   94: aload 5
    //   96: astore_1
    //   97: aload 5
    //   99: astore_3
    //   100: aload 5
    //   102: astore 4
    //   104: aload 6
    //   106: invokestatic 68	com/tencent/biz/common/util/HttpUtil:a	(Lorg/apache/http/HttpResponse;)Ljava/lang/String;
    //   109: astore_0
    //   110: aload 5
    //   112: astore_1
    //   113: aload 5
    //   115: astore_3
    //   116: aload 5
    //   118: astore 4
    //   120: aload_0
    //   121: invokestatic 74	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   124: ifeq +78 -> 202
    //   127: aload 5
    //   129: astore_1
    //   130: aload 5
    //   132: astore_3
    //   133: aload 5
    //   135: astore 4
    //   137: new 30	java/io/IOException
    //   140: dup
    //   141: invokespecial 75	java/io/IOException:<init>	()V
    //   144: athrow
    //   145: astore_3
    //   146: aload_1
    //   147: astore_0
    //   148: ldc 8
    //   150: iconst_1
    //   151: ldc 77
    //   153: aload_3
    //   154: invokestatic 83	com/tencent/qphone/base/util/QLog:e	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V
    //   157: aload_2
    //   158: invokestatic 85	com/tencent/mobileqq/structmsg/CGILoader:a	(Ljava/lang/String;)Ljava/lang/String;
    //   161: astore_2
    //   162: aload_1
    //   163: invokestatic 74	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   166: ifeq +170 -> 336
    //   169: ldc 87
    //   171: astore_0
    //   172: aload_2
    //   173: invokestatic 74	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   176: ifne +24 -> 200
    //   179: aconst_null
    //   180: ldc 89
    //   182: ldc 46
    //   184: ldc 46
    //   186: aload_0
    //   187: aload_0
    //   188: iconst_0
    //   189: iconst_0
    //   190: ldc 46
    //   192: ldc 46
    //   194: aload_2
    //   195: ldc 46
    //   197: invokestatic 94	com/tencent/mobileqq/statistics/ReportController:b	(Lcom/tencent/mobileqq/app/QQAppInterface;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   200: aconst_null
    //   201: areturn
    //   202: aload 5
    //   204: astore_1
    //   205: aload 5
    //   207: astore_3
    //   208: aload 5
    //   210: astore 4
    //   212: new 96	org/json/JSONObject
    //   215: dup
    //   216: aload_0
    //   217: invokespecial 99	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   220: ldc 15
    //   222: invokevirtual 102	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   225: astore_0
    //   226: aload_0
    //   227: astore_1
    //   228: aload_0
    //   229: astore_3
    //   230: aload_0
    //   231: astore 4
    //   233: aload_0
    //   234: invokestatic 74	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   237: ifeq +48 -> 285
    //   240: aload_0
    //   241: astore_1
    //   242: aload_0
    //   243: astore_3
    //   244: aload_0
    //   245: astore 4
    //   247: invokestatic 106	com/tencent/qphone/base/util/QLog:isColorLevel	()Z
    //   250: ifeq +35 -> 285
    //   253: aload_0
    //   254: astore_1
    //   255: aload_0
    //   256: astore_3
    //   257: aload_0
    //   258: astore 4
    //   260: ldc 8
    //   262: iconst_2
    //   263: new 108	java/lang/StringBuilder
    //   266: dup
    //   267: invokespecial 109	java/lang/StringBuilder:<init>	()V
    //   270: ldc 111
    //   272: invokevirtual 115	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   275: aload_2
    //   276: invokevirtual 115	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   279: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   282: invokestatic 122	com/tencent/qphone/base/util/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   285: aload_2
    //   286: invokestatic 85	com/tencent/mobileqq/structmsg/CGILoader:a	(Ljava/lang/String;)Ljava/lang/String;
    //   289: astore_2
    //   290: aload_0
    //   291: invokestatic 74	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   294: ifeq +36 -> 330
    //   297: ldc 87
    //   299: astore_1
    //   300: aload_2
    //   301: invokestatic 74	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   304: ifne +24 -> 328
    //   307: aconst_null
    //   308: ldc 89
    //   310: ldc 46
    //   312: ldc 46
    //   314: aload_1
    //   315: aload_1
    //   316: iconst_0
    //   317: iconst_0
    //   318: ldc 46
    //   320: ldc 46
    //   322: aload_2
    //   323: ldc 46
    //   325: invokestatic 94	com/tencent/mobileqq/statistics/ReportController:b	(Lcom/tencent/mobileqq/app/QQAppInterface;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   328: aload_0
    //   329: areturn
    //   330: ldc 124
    //   332: astore_1
    //   333: goto -33 -> 300
    //   336: ldc 124
    //   338: astore_0
    //   339: goto -167 -> 172
    //   342: astore_1
    //   343: aload_3
    //   344: astore_0
    //   345: ldc 8
    //   347: iconst_1
    //   348: ldc 126
    //   350: aload_1
    //   351: invokestatic 83	com/tencent/qphone/base/util/QLog:e	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V
    //   354: aload_2
    //   355: invokestatic 85	com/tencent/mobileqq/structmsg/CGILoader:a	(Ljava/lang/String;)Ljava/lang/String;
    //   358: astore_1
    //   359: aload_3
    //   360: invokestatic 74	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   363: ifeq +36 -> 399
    //   366: ldc 87
    //   368: astore_0
    //   369: aload_1
    //   370: invokestatic 74	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   373: ifne +24 -> 397
    //   376: aconst_null
    //   377: ldc 89
    //   379: ldc 46
    //   381: ldc 46
    //   383: aload_0
    //   384: aload_0
    //   385: iconst_0
    //   386: iconst_0
    //   387: ldc 46
    //   389: ldc 46
    //   391: aload_1
    //   392: ldc 46
    //   394: invokestatic 94	com/tencent/mobileqq/statistics/ReportController:b	(Lcom/tencent/mobileqq/app/QQAppInterface;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   397: aconst_null
    //   398: areturn
    //   399: ldc 124
    //   401: astore_0
    //   402: goto -33 -> 369
    //   405: astore_0
    //   406: aload_2
    //   407: invokestatic 85	com/tencent/mobileqq/structmsg/CGILoader:a	(Ljava/lang/String;)Ljava/lang/String;
    //   410: astore_2
    //   411: aload 4
    //   413: invokestatic 74	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   416: ifeq +36 -> 452
    //   419: ldc 87
    //   421: astore_1
    //   422: aload_2
    //   423: invokestatic 74	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   426: ifne +24 -> 450
    //   429: aconst_null
    //   430: ldc 89
    //   432: ldc 46
    //   434: ldc 46
    //   436: aload_1
    //   437: aload_1
    //   438: iconst_0
    //   439: iconst_0
    //   440: ldc 46
    //   442: ldc 46
    //   444: aload_2
    //   445: ldc 46
    //   447: invokestatic 94	com/tencent/mobileqq/statistics/ReportController:b	(Lcom/tencent/mobileqq/app/QQAppInterface;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   450: aload_0
    //   451: athrow
    //   452: ldc 124
    //   454: astore_1
    //   455: goto -33 -> 422
    //   458: astore_1
    //   459: aload_0
    //   460: astore 4
    //   462: aload_1
    //   463: astore_0
    //   464: goto -58 -> 406
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	467	0	paramContext	android.content.Context
    //   0	467	1	paramString1	String
    //   0	467	2	paramString2	String
    //   31	102	3	str1	String
    //   145	9	3	localIOException	java.io.IOException
    //   207	153	3	localObject1	Object
    //   34	427	4	localObject2	Object
    //   24	185	5	str2	String
    //   20	85	6	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   36	55	145	java/io/IOException
    //   76	94	145	java/io/IOException
    //   104	110	145	java/io/IOException
    //   120	127	145	java/io/IOException
    //   137	145	145	java/io/IOException
    //   212	226	145	java/io/IOException
    //   233	240	145	java/io/IOException
    //   247	253	145	java/io/IOException
    //   260	285	145	java/io/IOException
    //   36	55	342	org/json/JSONException
    //   76	94	342	org/json/JSONException
    //   104	110	342	org/json/JSONException
    //   120	127	342	org/json/JSONException
    //   137	145	342	org/json/JSONException
    //   212	226	342	org/json/JSONException
    //   233	240	342	org/json/JSONException
    //   247	253	342	org/json/JSONException
    //   260	285	342	org/json/JSONException
    //   36	55	405	finally
    //   76	94	405	finally
    //   104	110	405	finally
    //   120	127	405	finally
    //   137	145	405	finally
    //   212	226	405	finally
    //   233	240	405	finally
    //   247	253	405	finally
    //   260	285	405	finally
    //   148	157	458	finally
    //   345	354	458	finally
  }
  
  public static String a(String paramString)
  {
    try
    {
      paramString = new URL(paramString).getHost().split("\\.");
      paramString = paramString[(paramString.length - 2)] + "." + paramString[(paramString.length - 1)];
      return paramString;
    }
    catch (Exception paramString) {}
    return "";
  }
  
  public static boolean a(AbsShareMsg paramAbsShareMsg)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    int i;
    if ((paramAbsShareMsg instanceof StructMsgForGeneralShare))
    {
      paramAbsShareMsg = ((StructMsgForGeneralShare)paramAbsShareMsg).getStructMsgItemLists();
      bool1 = bool2;
      if (paramAbsShareMsg != null) {
        i = 0;
      }
    }
    for (;;)
    {
      bool1 = bool2;
      Object localObject;
      int j;
      if (i < paramAbsShareMsg.size())
      {
        localObject = (AbsStructMsgElement)paramAbsShareMsg.get(i);
        if ((localObject instanceof StructMsgItemLayout5))
        {
          localObject = ((StructMsgItemLayout5)localObject).a;
          if (localObject != null) {
            j = 0;
          }
        }
      }
      else
      {
        while (j < ((List)localObject).size())
        {
          if (((AbsStructMsgElement)((List)localObject).get(j) instanceof StructMsgItemVideo))
          {
            bool1 = true;
            return bool1;
          }
          j += 1;
        }
      }
      i += 1;
    }
  }
  
  public static boolean a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {}
    Object localObject;
    label48:
    do
    {
      return false;
      if ((a != null) && (a.get() != null)) {
        break;
      }
      localObject = DeviceProfileManager.a().a(DeviceProfileManager.DpcNames.IsEnableVideoExtraction.name());
      a = new WeakReference(localObject);
      if (!"1".equals(localObject)) {
        break label203;
      }
      if ((b != null) && (b.get() != null)) {
        break label218;
      }
      localObject = DeviceProfileManager.a().a(DeviceProfileManager.DpcNames.VideoWebsiteList.name());
    } while (TextUtils.isEmpty((CharSequence)localObject));
    if (((String)localObject).startsWith("{")) {}
    for (int j = 1;; j = 0)
    {
      if (((String)localObject).endsWith("}")) {}
      for (int i = 1;; i = 0)
      {
        if (j != 0)
        {
          j = 1;
          label120:
          if (i == 0) {
            break label210;
          }
          i = ((String)localObject).length() - 1;
          label131:
          localObject = ((String)localObject).substring(j, i).split("\\|");
          if ((localObject == null) || (localObject.length == 0)) {
            break;
          }
          b = new WeakReference(localObject);
          label163:
          if ((localObject == null) || (localObject.length == 0)) {
            break label229;
          }
          i = 0;
        }
        for (;;)
        {
          if (i >= localObject.length) {
            break label236;
          }
          if (paramString.contains(localObject[i]))
          {
            return true;
            localObject = (String)a.get();
            break label48;
            label203:
            break;
            j = 0;
            break label120;
            label210:
            i = ((String)localObject).length();
            break label131;
            label218:
            localObject = (String[])b.get();
            break label163;
            label229:
            break;
          }
          i += 1;
        }
        label236:
        break;
      }
    }
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\mobileqq\structmsg\CGILoader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */