package com.tencent.mobileqq.utils;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Vector;
import waj;

public class FileSystemTool
{
  public static final int a = 1;
  public static FileInputStream a;
  public static FileOutputStream a;
  public static final String a = "file:///";
  private static Vector a;
  public static final int b = 2;
  public static final int c = 4;
  public static final int d = 4;
  private static int e;
  private static int f;
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    jdField_a_of_type_JavaUtilVector = new Vector(4);
  }
  
  public static int a(String paramString1, String paramString2, int paramInt, boolean paramBoolean)
  {
    try
    {
      paramString2 = a(paramString1, paramString2, paramBoolean);
      File localFile = new File(paramString2);
      if (!localFile.exists())
      {
        if ((paramString1 == null) || ("".equals(paramString1))) {
          localFile.mkdirs();
        }
      }
      else
      {
        if (paramInt != 1) {
          break label106;
        }
        jdField_a_of_type_JavaIoFileInputStream = new FileInputStream(paramString2);
      }
      for (;;)
      {
        e += 1;
        paramString1 = new waj(e, paramString2, jdField_a_of_type_JavaIoFileInputStream, jdField_a_of_type_JavaIoFileOutputStream);
        jdField_a_of_type_JavaUtilVector.addElement(paramString1);
        return e;
        localFile.createNewFile();
        break;
        label106:
        if (paramInt == 2)
        {
          jdField_a_of_type_JavaIoFileOutputStream = new FileOutputStream(paramString2);
        }
        else if (paramInt == 4)
        {
          jdField_a_of_type_JavaIoFileInputStream = new FileInputStream(paramString2);
          jdField_a_of_type_JavaIoFileOutputStream = new FileOutputStream(paramString2);
        }
      }
      return -1;
    }
    catch (Exception paramString1) {}
  }
  
  public static long a(int paramInt)
  {
    if (paramInt == -1) {
      return -1L;
    }
    int i = 0;
    while (i < jdField_a_of_type_JavaUtilVector.size())
    {
      waj localwaj = (waj)jdField_a_of_type_JavaUtilVector.elementAt(i);
      if (localwaj.a() == paramInt) {
        try
        {
          int j = localwaj.jdField_a_of_type_JavaIoFileInputStream.available();
          return j;
        }
        catch (IOException localIOException) {}
      }
      i += 1;
    }
    return -1L;
  }
  
  public static DataInputStream a(int paramInt)
  {
    if (paramInt == -1) {
      return null;
    }
    int i = 0;
    while (i < jdField_a_of_type_JavaUtilVector.size())
    {
      waj localwaj = (waj)jdField_a_of_type_JavaUtilVector.elementAt(i);
      if (localwaj.a() == paramInt) {
        return localwaj.a();
      }
      i += 1;
    }
    return null;
  }
  
  public static DataOutputStream a(int paramInt)
  {
    return a(paramInt, 0L);
  }
  
  public static DataOutputStream a(int paramInt, long paramLong)
  {
    if (paramInt == -1) {
      return null;
    }
    int i = 0;
    while (i < jdField_a_of_type_JavaUtilVector.size())
    {
      waj localwaj = (waj)jdField_a_of_type_JavaUtilVector.elementAt(i);
      if (localwaj.a() == paramInt) {
        return localwaj.a(paramLong);
      }
      i += 1;
    }
    return null;
  }
  
  public static String a(int paramInt)
  {
    if (paramInt == -1) {
      return null;
    }
    int i = 0;
    while (i < jdField_a_of_type_JavaUtilVector.size())
    {
      waj localwaj = (waj)jdField_a_of_type_JavaUtilVector.elementAt(i);
      if (localwaj.a() == paramInt) {
        return localwaj.b();
      }
      i += 1;
    }
    return null;
  }
  
  private static String a(String paramString1, String paramString2, boolean paramBoolean)
  {
    paramString2 = paramString2 + "/" + paramString1;
    paramString1 = paramString2;
    if (!paramString2.startsWith("file:///"))
    {
      paramString1 = paramString2;
      if (paramBoolean) {
        paramString1 = "file:///" + paramString2;
      }
    }
    return paramString1;
  }
  
  public static void a()
  {
    int i = 0;
    while (i < jdField_a_of_type_JavaUtilVector.size())
    {
      ((waj)jdField_a_of_type_JavaUtilVector.elementAt(i)).a();
      jdField_a_of_type_JavaUtilVector.removeElementAt(i);
      i += 1;
    }
  }
  
  public static void a(int paramInt)
  {
    int i = 0;
    for (;;)
    {
      if (i < jdField_a_of_type_JavaUtilVector.size())
      {
        waj localwaj = (waj)jdField_a_of_type_JavaUtilVector.elementAt(i);
        if (localwaj.a() == paramInt)
        {
          localwaj.a();
          jdField_a_of_type_JavaUtilVector.removeElementAt(i);
        }
      }
      else
      {
        return;
      }
      i += 1;
    }
  }
  
  public static boolean a()
  {
    return true;
  }
  
  public static boolean a(int paramInt)
  {
    if (paramInt == -1) {}
    for (;;)
    {
      return false;
      int i = 0;
      while (i < jdField_a_of_type_JavaUtilVector.size())
      {
        waj localwaj = (waj)jdField_a_of_type_JavaUtilVector.elementAt(i);
        if (localwaj.a() == paramInt) {}
        try
        {
          localwaj.b();
          jdField_a_of_type_JavaUtilVector.removeElement(localwaj);
          return true;
        }
        catch (Exception localException) {}
        i += 1;
      }
    }
    return false;
  }
  
  private static boolean a(String paramString)
  {
    if (jdField_a_of_type_JavaUtilVector.size() >= 4) {
      return false;
    }
    int i = 0;
    for (;;)
    {
      if (i >= jdField_a_of_type_JavaUtilVector.size()) {
        break label51;
      }
      if (((waj)jdField_a_of_type_JavaUtilVector.elementAt(i)).a().equals(paramString)) {
        break;
      }
      i += 1;
    }
    label51:
    return true;
  }
  
  private static boolean a(String paramString1, String paramString2, boolean paramBoolean)
  {
    String str = a(paramString1, paramString2, paramBoolean);
    if ((paramString1.length() == 0) && (paramString2.length() == 0)) {
      return false;
    }
    return a(str);
  }
  
  public static int b(String paramString1, String paramString2, int paramInt, boolean paramBoolean)
  {
    return a(paramString1, paramString2, paramInt, paramBoolean);
  }
  
  public static String b(int paramInt)
  {
    if (paramInt == -1) {
      return null;
    }
    int i = 0;
    while (i < jdField_a_of_type_JavaUtilVector.size())
    {
      waj localwaj = (waj)jdField_a_of_type_JavaUtilVector.elementAt(i);
      if (localwaj.a() == paramInt) {
        return localwaj.c();
      }
      i += 1;
    }
    return null;
  }
  
  public static boolean b(int paramInt)
  {
    if (paramInt < 0) {}
    for (;;)
    {
      return false;
      int i = 0;
      while (i < jdField_a_of_type_JavaUtilVector.size())
      {
        if (((waj)jdField_a_of_type_JavaUtilVector.elementAt(i)).a() == paramInt) {
          return true;
        }
        i += 1;
      }
    }
  }
  
  public static String c(int paramInt)
  {
    if (paramInt == -1) {
      return null;
    }
    int i = 0;
    while (i < jdField_a_of_type_JavaUtilVector.size())
    {
      waj localwaj = (waj)jdField_a_of_type_JavaUtilVector.elementAt(i);
      if (localwaj.a() == paramInt) {
        return localwaj.a();
      }
      i += 1;
    }
    return null;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\mobileqq\utils\FileSystemTool.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */