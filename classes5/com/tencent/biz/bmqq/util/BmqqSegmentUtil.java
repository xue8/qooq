package com.tencent.biz.bmqq.util;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.mobileqq.app.EqqDetailDataManager;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.utils.SecurityUtile;
import com.tencent.mobileqq.utils.SharedPreUtils;
import com.tencent.qphone.base.util.QLog;
import java.io.IOException;
import java.io.StringReader;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import mqq.app.AppRuntime;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class BmqqSegmentUtil
{
  public static final int a = 1;
  public static final AtomicBoolean a;
  private static volatile long[] a;
  public static final int b = 2;
  private static volatile long[] b;
  public static final int c = 3;
  private static volatile long[] c;
  private static volatile long[] d;
  private static volatile long[] e;
  private static volatile long[] f;
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    jdField_a_of_type_ArrayOfLong = new long[] { 2355000000L, 2880000000L, 2885000000L, 2850121000L, 2852200000L, 3001000000L };
    b = new long[] { 2355999999L, 2881999999L, 2885999999L, 2851999999L, 2854120999L, 3005999999L };
    c = new long[] { 2852200000L };
    d = new long[] { 2852999999L };
    e = new long[] { 1496000000L };
    f = new long[] { 1497000000L };
    jdField_a_of_type_JavaUtilConcurrentAtomicAtomicBoolean = new AtomicBoolean(false);
  }
  
  private static void a()
  {
    if ((jdField_a_of_type_ArrayOfLong == null) || (b == null))
    {
      jdField_a_of_type_ArrayOfLong = new long[] { 2355000000L, 2880000000L, 2885000000L, 2850121000L, 2852200000L };
      b = new long[] { 2355999999L, 2881999999L, 2885999999L, 2851999999L, 2854120999L };
    }
    if ((c == null) || (d == null))
    {
      c = new long[] { 2852200000L };
      d = new long[] { 2852999999L };
    }
  }
  
  private static void a(int paramInt, long[] paramArrayOfLong1, long[] paramArrayOfLong2)
  {
    if ((paramArrayOfLong1 == null) || (paramArrayOfLong2 == null)) {}
    do
    {
      return;
      if (1 == paramInt) {
        try
        {
          jdField_a_of_type_ArrayOfLong = paramArrayOfLong1;
          b = paramArrayOfLong2;
          return;
        }
        finally {}
      }
      if (2 == paramInt) {
        try
        {
          c = paramArrayOfLong1;
          d = paramArrayOfLong2;
          return;
        }
        finally {}
      }
    } while (3 != paramInt);
    try
    {
      e = paramArrayOfLong1;
      f = paramArrayOfLong2;
      return;
    }
    finally {}
  }
  
  public static void a(Context paramContext)
  {
    Object localObject = null;
    try
    {
      String str = SharedPreUtils.c(paramContext);
      localObject = str;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    SharedPreUtils.c(paramContext, "");
    if (!TextUtils.isEmpty((CharSequence)localObject))
    {
      a(SecurityUtile.a((String)localObject));
      a((String)localObject, true);
    }
    for (;;)
    {
      jdField_a_of_type_JavaUtilConcurrentAtomicAtomicBoolean.set(true);
      return;
      try
      {
        paramContext = (EqqDetailDataManager)BaseApplicationImpl.a.a().getManager(68);
        if (paramContext != null) {
          a(paramContext.a(), false);
        }
      }
      catch (Exception paramContext) {}
    }
  }
  
  public static void a(String paramString)
  {
    EqqDetailDataManager localEqqDetailDataManager;
    if (a(paramString, false))
    {
      localEqqDetailDataManager = (EqqDetailDataManager)BaseApplicationImpl.a.a().getManager(68);
      if (localEqqDetailDataManager == null) {
        break label47;
      }
      if (!TextUtils.isEmpty(paramString)) {
        break label41;
      }
      localEqqDetailDataManager.a("");
    }
    label41:
    label47:
    while (!QLog.isColorLevel())
    {
      return;
      localEqqDetailDataManager.a(paramString);
      return;
    }
    QLog.d("BmqqSegmentUtil", 2, "EqqDetailDataManager is null");
  }
  
  private static void a(Element paramElement, int paramInt)
  {
    Object localObject1 = null;
    NodeList localNodeList;
    if (paramElement != null)
    {
      localNodeList = paramElement.getElementsByTagName("segment");
      int j = localNodeList.getLength();
      if (j > 0)
      {
        localObject1 = new long[j];
        paramElement = new long[j];
        int i = 0;
        while (i < j)
        {
          Object localObject2 = (Element)localNodeList.item(i);
          String str;
          if (localObject2 != null)
          {
            str = ((Element)localObject2).getAttribute("start");
            localObject2 = ((Element)localObject2).getAttribute("end");
          }
          try
          {
            long l1 = Long.valueOf(str.trim()).longValue();
            long l2 = Long.valueOf(((String)localObject2).trim()).longValue();
            localObject1[i] = l1;
            paramElement[i] = l2;
          }
          catch (Exception localException)
          {
            for (;;) {}
          }
          catch (NumberFormatException localNumberFormatException)
          {
            for (;;) {}
          }
          i += 1;
        }
      }
    }
    for (;;)
    {
      a(paramInt, (long[])localObject1, paramElement);
      return;
      localNodeList = null;
      paramElement = (Element)localObject1;
      localObject1 = localNodeList;
    }
  }
  
  public static boolean a(Context paramContext, String paramString)
  {
    if (!a(paramString)) {}
    for (;;)
    {
      return false;
      if ((!jdField_a_of_type_JavaUtilConcurrentAtomicAtomicBoolean.get()) && (paramContext != null)) {
        a(paramContext);
      }
      long l = Long.valueOf(paramString).longValue();
      if ((jdField_a_of_type_ArrayOfLong == null) || (b == null)) {
        a();
      }
      if ((jdField_a_of_type_ArrayOfLong != null) && (b != null) && (jdField_a_of_type_ArrayOfLong.length == b.length))
      {
        int j = jdField_a_of_type_ArrayOfLong.length;
        int i = 0;
        while (i < j)
        {
          if ((jdField_a_of_type_ArrayOfLong[i] <= l) && (l <= b[i])) {
            return true;
          }
          i += 1;
        }
      }
    }
  }
  
  public static boolean a(String paramString)
  {
    boolean bool = false;
    try
    {
      long l = Long.parseLong(paramString);
      if (l > 10000L) {
        bool = true;
      }
      return bool;
    }
    catch (NumberFormatException paramString)
    {
      return false;
    }
    catch (Exception paramString) {}
    return false;
  }
  
  private static boolean a(String paramString, boolean paramBoolean)
  {
    Object localObject2 = null;
    if (paramString != null)
    {
      String str = paramString.trim();
      if ("".equals(str)) {
        return true;
      }
      try
      {
        paramString = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        if (paramString != null)
        {
          Object localObject1 = str;
          if (paramBoolean) {
            localObject1 = SecurityUtile.a(str);
          }
          localObject1 = new InputSource(new StringReader((String)localObject1));
          try
          {
            paramString = paramString.parse((InputSource)localObject1);
            paramBoolean = true;
          }
          catch (SAXException paramString)
          {
            for (;;)
            {
              paramString.printStackTrace();
              paramBoolean = false;
              paramString = (String)localObject2;
            }
          }
          catch (IOException paramString)
          {
            for (;;)
            {
              paramString.printStackTrace();
              paramBoolean = false;
              paramString = (String)localObject2;
            }
          }
          catch (Exception paramString)
          {
            for (;;)
            {
              paramString.printStackTrace();
              paramBoolean = false;
              paramString = (String)localObject2;
            }
          }
          if (paramString != null)
          {
            a((Element)paramString.getElementsByTagName("hrtx-uin-segment").item(0), 1);
            a((Element)paramString.getElementsByTagName("crm3-ext-uin-segment").item(0), 2);
            a((Element)paramString.getElementsByTagName("crm3-wx-map-uin-segment").item(0), 3);
          }
          return paramBoolean;
        }
      }
      catch (ParserConfigurationException paramString)
      {
        for (;;)
        {
          paramString.printStackTrace();
          paramString = null;
        }
      }
    }
    return true;
  }
  
  public static boolean b(Context paramContext, String paramString)
  {
    if (!a(paramString)) {}
    for (;;)
    {
      return false;
      if (!jdField_a_of_type_JavaUtilConcurrentAtomicAtomicBoolean.get()) {
        a(paramContext);
      }
      long l = Long.valueOf(paramString).longValue();
      if ((c == null) || (d == null)) {
        a();
      }
      if ((c != null) && (d != null) && (c.length == d.length))
      {
        int j = c.length;
        int i = 0;
        while (i < j)
        {
          if ((c[i] <= l) && (l <= d[i])) {
            return true;
          }
          i += 1;
        }
      }
    }
  }
  
  public static boolean b(String paramString)
  {
    if (!a(paramString)) {}
    long l;
    do
    {
      return false;
      l = Long.valueOf(paramString).longValue();
      if ((l >= 2355000000L) && (l <= 2355999999L)) {
        return true;
      }
      if ((l >= 2880000000L) && (l <= 2881999999L)) {
        return true;
      }
      if ((l >= 2885000000L) && (l <= 2885999999L)) {
        return true;
      }
    } while ((l < 2850121000L) || (l > 2854120999L));
    return true;
  }
  
  public static boolean c(Context paramContext, String paramString)
  {
    if (!a(paramString)) {}
    for (;;)
    {
      return false;
      if (!jdField_a_of_type_JavaUtilConcurrentAtomicAtomicBoolean.get()) {
        a(paramContext);
      }
      if ((e != null) && (f != null) && (e.length == f.length))
      {
        int i = 0;
        while (i < e.length)
        {
          long l = Long.valueOf(paramString).longValue();
          if ((l >= e[i]) && (l <= f[i])) {
            return true;
          }
          i += 1;
        }
      }
    }
  }
  
  public static boolean c(String paramString)
  {
    if (!a(paramString)) {}
    while (!jdField_a_of_type_JavaUtilConcurrentAtomicAtomicBoolean.get()) {
      return false;
    }
    return a(null, paramString);
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\com\tencent\biz\bmqq\util\BmqqSegmentUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */