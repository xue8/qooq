package com.tencent.commonsdk.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;

public class MD5Coding
{
  public static byte[] encode(byte[] paramArrayOfByte)
  {
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      localMessageDigest.update(paramArrayOfByte);
      paramArrayOfByte = localMessageDigest.digest();
      return paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte) {}
    return null;
  }
  
  public static String encode2HexStr(byte[] paramArrayOfByte)
  {
    return HexUtil.bytes2HexStr(encode(paramArrayOfByte));
  }
  
  /* Error */
  public static byte[] encodeFile(String paramString)
  {
    // Byte code:
    //   0: ldc 15
    //   2: invokestatic 21	java/security/MessageDigest:getInstance	(Ljava/lang/String;)Ljava/security/MessageDigest;
    //   5: astore_1
    //   6: new 48	java/io/FileInputStream
    //   9: dup
    //   10: aload_0
    //   11: invokespecial 51	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   14: astore_0
    //   15: sipush 16384
    //   18: newarray <illegal type>
    //   20: astore_2
    //   21: aload_0
    //   22: aload_2
    //   23: invokevirtual 55	java/io/FileInputStream:read	([B)I
    //   26: istore_3
    //   27: iload_3
    //   28: iconst_m1
    //   29: if_icmpeq +20 -> 49
    //   32: aload_1
    //   33: aload_2
    //   34: iconst_0
    //   35: iload_3
    //   36: invokevirtual 58	java/security/MessageDigest:update	([BII)V
    //   39: goto -18 -> 21
    //   42: astore_1
    //   43: aload_0
    //   44: invokevirtual 61	java/io/FileInputStream:close	()V
    //   47: aconst_null
    //   48: areturn
    //   49: aload_1
    //   50: invokevirtual 29	java/security/MessageDigest:digest	()[B
    //   53: astore_1
    //   54: aload_0
    //   55: invokevirtual 61	java/io/FileInputStream:close	()V
    //   58: aload_1
    //   59: areturn
    //   60: astore_0
    //   61: aload_1
    //   62: areturn
    //   63: astore_1
    //   64: aload_0
    //   65: invokevirtual 61	java/io/FileInputStream:close	()V
    //   68: aload_1
    //   69: athrow
    //   70: astore_0
    //   71: aconst_null
    //   72: areturn
    //   73: astore_0
    //   74: aconst_null
    //   75: areturn
    //   76: astore_0
    //   77: aconst_null
    //   78: areturn
    //   79: astore_0
    //   80: goto -12 -> 68
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	83	0	paramString	String
    //   5	28	1	localMessageDigest	MessageDigest
    //   42	8	1	localIOException	java.io.IOException
    //   53	9	1	arrayOfByte1	byte[]
    //   63	6	1	localObject	Object
    //   20	14	2	arrayOfByte2	byte[]
    //   26	10	3	i	int
    // Exception table:
    //   from	to	target	type
    //   21	27	42	java/io/IOException
    //   32	39	42	java/io/IOException
    //   49	54	42	java/io/IOException
    //   54	58	60	java/io/IOException
    //   21	27	63	finally
    //   32	39	63	finally
    //   49	54	63	finally
    //   0	21	70	java/io/FileNotFoundException
    //   43	47	70	java/io/FileNotFoundException
    //   54	58	70	java/io/FileNotFoundException
    //   64	68	70	java/io/FileNotFoundException
    //   68	70	70	java/io/FileNotFoundException
    //   0	21	73	java/security/NoSuchAlgorithmException
    //   43	47	73	java/security/NoSuchAlgorithmException
    //   54	58	73	java/security/NoSuchAlgorithmException
    //   64	68	73	java/security/NoSuchAlgorithmException
    //   68	70	73	java/security/NoSuchAlgorithmException
    //   43	47	76	java/io/IOException
    //   64	68	79	java/io/IOException
  }
  
  public static String encodeFile2HexStr(String paramString)
  {
    return HexUtil.bytes2HexStr(encodeFile(paramString));
  }
  
  public static String encodeHexStr(String paramString)
  {
    try
    {
      paramString = HexUtil.bytes2HexStr(encode(paramString.getBytes("UTF-8")));
      return paramString;
    }
    catch (UnsupportedEncodingException paramString)
    {
      paramString.printStackTrace();
    }
    return null;
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\com\tencent\commonsdk\util\MD5Coding.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */