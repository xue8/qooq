package com.tencent.mobileqq.utils.kapalaiadapter;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class ReflecterHelper
{
  public static Class a;
  
  public ReflecterHelper()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public static final int a(Object paramObject, String paramString, int paramInt)
  {
    a(paramObject.getClass().getName());
    paramString = a(paramString);
    int i = paramInt;
    if (paramString != null) {}
    try
    {
      i = paramString.getInt(paramObject);
      return i;
    }
    catch (IllegalArgumentException paramObject)
    {
      ((IllegalArgumentException)paramObject).printStackTrace();
      return paramInt;
    }
    catch (IllegalAccessException paramObject)
    {
      ((IllegalAccessException)paramObject).printStackTrace();
    }
    return paramInt;
  }
  
  public static final int a(String paramString, int paramInt)
  {
    paramString = a(paramString);
    int i = paramInt;
    if (paramString != null) {}
    try
    {
      i = paramString.getInt(null);
      return i;
    }
    catch (IllegalArgumentException paramString)
    {
      paramString.printStackTrace();
      return paramInt;
    }
    catch (IllegalAccessException paramString)
    {
      paramString.printStackTrace();
    }
    return paramInt;
  }
  
  public static Object a(Object paramObject, String paramString)
  {
    return a(paramObject, paramString, null);
  }
  
  public static Object a(Object paramObject, String paramString, Class[] paramArrayOfClass, Object[] paramArrayOfObject)
  {
    paramString = paramObject.getClass().getMethod(paramString, paramArrayOfClass);
    paramString.setAccessible(true);
    return paramString.invoke(paramObject, paramArrayOfObject);
  }
  
  public static Object a(Object paramObject, String paramString, Object[] paramArrayOfObject)
  {
    return a(paramObject, paramString, a(paramArrayOfObject), paramArrayOfObject);
  }
  
  public static Object a(String paramString)
  {
    return a(paramString, (Object[])null);
  }
  
  public static Object a(String paramString1, String paramString2)
  {
    Object localObject = null;
    a(paramString1);
    paramString2 = a(paramString2);
    paramString1 = (String)localObject;
    if (paramString2 != null) {}
    try
    {
      paramString1 = paramString2.get(null);
      return paramString1;
    }
    catch (IllegalArgumentException paramString1)
    {
      paramString1.printStackTrace();
      return null;
    }
    catch (IllegalAccessException paramString1)
    {
      paramString1.printStackTrace();
    }
    return null;
  }
  
  public static Object a(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    return a(paramString1, paramString2, paramArrayOfObject, a(paramArrayOfObject));
  }
  
  public static Object a(String paramString1, String paramString2, Object[] paramArrayOfObject, Class[] paramArrayOfClass)
  {
    paramString1 = Class.forName(paramString1);
    return paramString1.getDeclaredMethod(paramString2, paramArrayOfClass).invoke(paramString1, paramArrayOfObject);
  }
  
  public static Object a(String paramString, Object[] paramArrayOfObject)
  {
    return Class.forName(paramString).getConstructor(a(paramArrayOfObject)).newInstance(paramArrayOfObject);
  }
  
  public static Object a(String paramString, Object[] paramArrayOfObject, Class[] paramArrayOfClass)
  {
    return Class.forName(paramString).getConstructor(paramArrayOfClass).newInstance(paramArrayOfObject);
  }
  
  /* Error */
  private static final Field a(String paramString)
  {
    // Byte code:
    //   0: getstatic 112	com/tencent/mobileqq/utils/kapalaiadapter/ReflecterHelper:a	Ljava/lang/Class;
    //   3: aload_0
    //   4: invokevirtual 115	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   7: astore_0
    //   8: aload_0
    //   9: iconst_1
    //   10: invokevirtual 116	java/lang/reflect/Field:setAccessible	(Z)V
    //   13: aload_0
    //   14: areturn
    //   15: astore_1
    //   16: aconst_null
    //   17: astore_0
    //   18: aload_1
    //   19: invokevirtual 117	java/lang/SecurityException:printStackTrace	()V
    //   22: aload_0
    //   23: areturn
    //   24: astore_1
    //   25: aconst_null
    //   26: astore_0
    //   27: aload_1
    //   28: invokevirtual 118	java/lang/NoSuchFieldException:printStackTrace	()V
    //   31: aload_0
    //   32: areturn
    //   33: astore_1
    //   34: goto -7 -> 27
    //   37: astore_1
    //   38: goto -20 -> 18
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	41	0	paramString	String
    //   15	4	1	localSecurityException1	SecurityException
    //   24	4	1	localNoSuchFieldException1	NoSuchFieldException
    //   33	1	1	localNoSuchFieldException2	NoSuchFieldException
    //   37	1	1	localSecurityException2	SecurityException
    // Exception table:
    //   from	to	target	type
    //   0	8	15	java/lang/SecurityException
    //   0	8	24	java/lang/NoSuchFieldException
    //   8	13	33	java/lang/NoSuchFieldException
    //   8	13	37	java/lang/SecurityException
  }
  
  public static void a(Object paramObject1, String paramString, Object paramObject2)
  {
    paramString = paramObject1.getClass().getField(paramString);
    paramString.setAccessible(true);
    paramString.set(paramObject1, paramObject2);
  }
  
  public static void a(String paramString1, String paramString2, Object paramObject)
  {
    a(paramString1);
    paramString1 = a(paramString2);
    if (paramString1 != null) {}
    try
    {
      paramString1.setAccessible(true);
      paramString1.set(null, paramObject);
      return;
    }
    catch (IllegalArgumentException paramString1)
    {
      paramString1.printStackTrace();
      return;
    }
    catch (IllegalAccessException paramString1)
    {
      paramString1.printStackTrace();
      return;
    }
    catch (Exception paramString1)
    {
      paramString1.printStackTrace();
    }
  }
  
  public static final boolean a(String paramString)
  {
    Object localObject = null;
    try
    {
      paramString = Class.forName(paramString);
      a = paramString;
      if (a != null) {
        return true;
      }
    }
    catch (ClassNotFoundException paramString)
    {
      for (;;)
      {
        paramString.printStackTrace();
        paramString = (String)localObject;
      }
    }
    return false;
  }
  
  private static Class[] a(Object[] paramArrayOfObject)
  {
    Object localObject = (Class[])null;
    if (paramArrayOfObject != null)
    {
      Class[] arrayOfClass = new Class[paramArrayOfObject.length];
      int i = 0;
      int j = paramArrayOfObject.length;
      localObject = arrayOfClass;
      if (i < j)
      {
        if (paramArrayOfObject[i] != null)
        {
          arrayOfClass[i] = paramArrayOfObject[i].getClass();
          label44:
          if (arrayOfClass[i] != Integer.class) {
            break label73;
          }
          arrayOfClass[i] = Integer.TYPE;
        }
        for (;;)
        {
          i += 1;
          break;
          arrayOfClass[i] = String.class;
          break label44;
          label73:
          if (arrayOfClass[i] == Boolean.class) {
            arrayOfClass[i] = Boolean.TYPE;
          }
        }
      }
    }
    return (Class[])localObject;
  }
  
  public static Object b(Object paramObject, String paramString)
  {
    return paramObject.getClass().getField(paramString).get(paramObject);
  }
  
  public static Object b(String paramString1, String paramString2)
  {
    return a(paramString1, paramString2, (Object[])null);
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\mobileqq\utils\kapalaiadapter\ReflecterHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */