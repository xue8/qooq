package com.tencent.mobileqq.shortvideo.hwcodec;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public class SVHwThumbGen
{
  public static final int a = 0;
  public static final int b = -1;
  public static final int c = -2;
  private static final String c = "SVHwThumbGen";
  public static final int d = -3;
  public long a;
  public String a;
  public String b;
  public int e;
  
  public SVHwThumbGen()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.e = 0;
  }
  
  /* Error */
  public int a(String paramString1, int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, String paramString2)
  {
    // Byte code:
    //   0: aload_1
    //   1: iload_2
    //   2: iload_3
    //   3: aload 8
    //   5: iconst_0
    //   6: getstatic 42	android/graphics/Bitmap$Config:RGB_565	Landroid/graphics/Bitmap$Config;
    //   9: invokestatic 47	com/tencent/mobileqq/shortvideo/cover/RecordThumbnailUtils:a	(Ljava/lang/String;IILjava/lang/String;ILandroid/graphics/Bitmap$Config;)Ljava/lang/String;
    //   12: astore_1
    //   13: aload_1
    //   14: invokestatic 53	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   17: ifeq +20 -> 37
    //   20: invokestatic 59	com/tencent/qphone/base/util/QLog:isColorLevel	()Z
    //   23: ifeq +11 -> 34
    //   26: ldc 14
    //   28: iconst_2
    //   29: ldc 61
    //   31: invokestatic 64	com/tencent/qphone/base/util/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   34: bipush -2
    //   36: ireturn
    //   37: new 66	java/io/File
    //   40: dup
    //   41: aload_1
    //   42: invokespecial 69	java/io/File:<init>	(Ljava/lang/String;)V
    //   45: astore 9
    //   47: aload 9
    //   49: invokevirtual 72	java/io/File:exists	()Z
    //   52: ifne +6 -> 58
    //   55: bipush -2
    //   57: ireturn
    //   58: aload_1
    //   59: dload 4
    //   61: dload 6
    //   63: invokestatic 77	com/tencent/mobileqq/utils/ImageUtil:a	(Ljava/lang/String;DD)Z
    //   66: pop
    //   67: new 79	java/io/FileInputStream
    //   70: dup
    //   71: aload_1
    //   72: invokespecial 80	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   75: astore 8
    //   77: aload 8
    //   79: astore_1
    //   80: aload_0
    //   81: aload 8
    //   83: aload 9
    //   85: invokevirtual 84	java/io/File:length	()J
    //   88: invokestatic 90	com/tencent/qphone/base/util/MD5:toMD5Byte	(Ljava/io/InputStream;J)[B
    //   91: invokestatic 96	com/qq/taf/jce/HexUtil:bytes2HexStr	([B)Ljava/lang/String;
    //   94: putfield 98	com/tencent/mobileqq/shortvideo/hwcodec/SVHwThumbGen:a	Ljava/lang/String;
    //   97: aload 8
    //   99: ifnull +8 -> 107
    //   102: aload 8
    //   104: invokevirtual 101	java/io/FileInputStream:close	()V
    //   107: aload_0
    //   108: getfield 98	com/tencent/mobileqq/shortvideo/hwcodec/SVHwThumbGen:a	Ljava/lang/String;
    //   111: invokestatic 53	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   114: ifeq +133 -> 247
    //   117: invokestatic 59	com/tencent/qphone/base/util/QLog:isColorLevel	()Z
    //   120: ifeq +11 -> 131
    //   123: ldc 14
    //   125: iconst_2
    //   126: ldc 103
    //   128: invokestatic 64	com/tencent/qphone/base/util/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   131: iconst_m1
    //   132: ireturn
    //   133: astore_1
    //   134: aload_1
    //   135: invokevirtual 106	java/io/IOException:printStackTrace	()V
    //   138: goto -31 -> 107
    //   141: astore 9
    //   143: aconst_null
    //   144: astore 8
    //   146: aload 8
    //   148: astore_1
    //   149: aload 9
    //   151: invokevirtual 107	java/io/FileNotFoundException:printStackTrace	()V
    //   154: aload 8
    //   156: ifnull +8 -> 164
    //   159: aload 8
    //   161: invokevirtual 101	java/io/FileInputStream:close	()V
    //   164: aload_0
    //   165: getfield 98	com/tencent/mobileqq/shortvideo/hwcodec/SVHwThumbGen:a	Ljava/lang/String;
    //   168: invokestatic 53	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   171: ifeq +76 -> 247
    //   174: invokestatic 59	com/tencent/qphone/base/util/QLog:isColorLevel	()Z
    //   177: ifeq +11 -> 188
    //   180: ldc 14
    //   182: iconst_2
    //   183: ldc 103
    //   185: invokestatic 64	com/tencent/qphone/base/util/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   188: iconst_m1
    //   189: ireturn
    //   190: astore_1
    //   191: aload_1
    //   192: invokevirtual 106	java/io/IOException:printStackTrace	()V
    //   195: goto -31 -> 164
    //   198: astore 8
    //   200: aconst_null
    //   201: astore_1
    //   202: aload_1
    //   203: ifnull +7 -> 210
    //   206: aload_1
    //   207: invokevirtual 101	java/io/FileInputStream:close	()V
    //   210: aload_0
    //   211: getfield 98	com/tencent/mobileqq/shortvideo/hwcodec/SVHwThumbGen:a	Ljava/lang/String;
    //   214: invokestatic 53	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   217: ifeq +27 -> 244
    //   220: invokestatic 59	com/tencent/qphone/base/util/QLog:isColorLevel	()Z
    //   223: ifeq +11 -> 234
    //   226: ldc 14
    //   228: iconst_2
    //   229: ldc 103
    //   231: invokestatic 64	com/tencent/qphone/base/util/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   234: iconst_m1
    //   235: ireturn
    //   236: astore_1
    //   237: aload_1
    //   238: invokevirtual 106	java/io/IOException:printStackTrace	()V
    //   241: goto -31 -> 210
    //   244: aload 8
    //   246: athrow
    //   247: iconst_0
    //   248: ireturn
    //   249: astore 8
    //   251: goto -49 -> 202
    //   254: astore 9
    //   256: goto -110 -> 146
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	259	0	this	SVHwThumbGen
    //   0	259	1	paramString1	String
    //   0	259	2	paramInt1	int
    //   0	259	3	paramInt2	int
    //   0	259	4	paramDouble1	double
    //   0	259	6	paramDouble2	double
    //   0	259	8	paramString2	String
    //   45	39	9	localFile	java.io.File
    //   141	9	9	localFileNotFoundException1	java.io.FileNotFoundException
    //   254	1	9	localFileNotFoundException2	java.io.FileNotFoundException
    // Exception table:
    //   from	to	target	type
    //   102	107	133	java/io/IOException
    //   67	77	141	java/io/FileNotFoundException
    //   159	164	190	java/io/IOException
    //   67	77	198	finally
    //   206	210	236	java/io/IOException
    //   80	97	249	finally
    //   149	154	249	finally
    //   80	97	254	java/io/FileNotFoundException
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\com\tencent\mobileqq\shortvideo\hwcodec\SVHwThumbGen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */