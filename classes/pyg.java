import android.text.TextUtils;
import com.tencent.mobileqq.app.DeviceProfileManager;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.qphone.base.util.QLog;
import java.util.Arrays;

public class pyg
{
  private static final float jdField_a_of_type_Float = 0.0F;
  private static pyg jdField_a_of_type_Pyg;
  private static final float jdField_b_of_type_Float = 15.0F;
  private static final String jdField_b_of_type_JavaLangString = "qq_process_gm";
  private static final String c = ";";
  public static final int d = 0;
  private static final String d = "\\|";
  public static final int e = 1;
  private static final String e = "__";
  public static final int f = 2;
  public static final int g = 0;
  public static final int h = 1;
  public static final int i = 2;
  static final int j = 3;
  static final int k = 15;
  private static final int l = 20;
  private static final int m = 200;
  private static final int n = 5;
  private static final int o = 100;
  private static final int p = 1;
  private static final int q = 120;
  public int a;
  long jdField_a_of_type_Long;
  public String a;
  float[] jdField_a_of_type_ArrayOfFloat;
  int[] jdField_a_of_type_ArrayOfInt;
  public int b;
  int[] jdField_b_of_type_ArrayOfInt;
  public int c;
  private int r;
  private int s;
  private int t;
  
  private pyg()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_ArrayOfInt = new int[] { 47185920, 68157440, 89128960, 120586240 };
    this.jdField_b_of_type_ArrayOfInt = new int[] { 3840000, 1920000, 960000, 720000, 600000 };
    this.jdField_a_of_type_ArrayOfFloat = new float[] { 0.94F, 0.6F, 0.0F };
    this.jdField_a_of_type_Int = 12;
    this.jdField_b_of_type_Int = 3;
    this.jdField_a_of_type_Long = 720000L;
    this.c = 0;
    this.jdField_a_of_type_JavaLangString = "";
    this.r = 1;
    this.s = -1;
    this.t = 1;
    Object localObject1 = DeviceProfileManager.a();
    Object localObject2 = ((DeviceProfileManager)localObject1).a("qq_process_gm");
    if (QLog.isColorLevel()) {
      QLog.d("GuardManager", 2, "config = " + (String)localObject2);
    }
    if ((TextUtils.isEmpty((CharSequence)localObject2)) || (((String)localObject2).equals("0"))) {}
    int i1;
    label352:
    label478:
    label557:
    do
    {
      do
      {
        return;
        localObject2 = ((String)localObject2).split("__");
        if (localObject2.length > 1) {
          localObject1 = localObject2[(localObject1.jdField_a_of_type_Int % localObject2.length)];
        }
        for (;;)
        {
          localObject1 = ((String)localObject1).split(";");
          if (localObject1.length < 4) {
            break;
          }
          try
          {
            localObject2 = localObject1[0].split("\\|");
            i1 = 0;
            for (;;)
            {
              if (i1 >= this.jdField_a_of_type_ArrayOfInt.length) {
                break label352;
              }
              i2 = Integer.parseInt(localObject2[i1]);
              if ((i2 <= 20) || (i2 >= 200)) {
                break;
              }
              this.jdField_a_of_type_ArrayOfInt[i1] = (i2 * 1024 * 1024);
              i1 += 1;
            }
            localObject1 = localObject2[0];
            continue;
            throw new IllegalArgumentException("Illegal memory size " + i2);
          }
          catch (Throwable localThrowable) {}
        }
      } while (!QLog.isColorLevel());
      QLog.d("GuardManager", 2, "Exception: ", localThrowable);
      return;
      localObject2 = localThrowable[1].split("\\|");
      i1 = 0;
      while (i1 < this.jdField_b_of_type_ArrayOfInt.length)
      {
        i2 = Integer.parseInt(localObject2[i1]);
        if ((i2 > 5) && (i2 < 100))
        {
          this.jdField_b_of_type_ArrayOfInt[i1] = (i2 * 60 * 1000);
          i1 += 1;
        }
        else
        {
          throw new IllegalArgumentException("Illegal timeout value " + i2);
        }
      }
      localObject2 = localThrowable[2].split("\\|");
      float f1;
      if (this.jdField_a_of_type_ArrayOfFloat.length < localObject2.length)
      {
        i1 = this.jdField_a_of_type_ArrayOfFloat.length;
        break label777;
        for (;;)
        {
          if (i2 >= i1) {
            break label557;
          }
          f1 = Float.parseFloat(localObject2[i2]);
          if ((f1 < 0.0F) || (f1 > 15.0F)) {
            break;
          }
          this.jdField_a_of_type_ArrayOfFloat[i2] = f1;
          i2 += 1;
        }
      }
      i1 = localObject2.length;
      break label777;
      throw new IllegalArgumentException("Illegal fraction value " + f1);
      i1 = Integer.parseInt(localThrowable[3].split("\\|")[0]);
      if ((i1 <= 1) || (i1 >= 120)) {
        break;
      }
      this.jdField_a_of_type_Long = (i1 * 60 * 1000);
    } while (localThrowable.length <= 4);
    localObject2 = localThrowable[4].split("\\|");
    int i2 = Integer.parseInt(localObject2[0]);
    if (i2 < 1) {
      i1 = 1;
    }
    for (;;)
    {
      if (24 % i1 == 0) {
        this.jdField_a_of_type_Int = i1;
      }
      i2 = Integer.parseInt(localObject2[1]);
      if (i2 < 0) {
        i1 = 0;
      }
      for (;;)
      {
        this.jdField_b_of_type_Int = i1;
        if (localThrowable.length > 6)
        {
          this.c = Integer.parseInt(localThrowable[5]);
          this.jdField_a_of_type_JavaLangString = localThrowable[6];
        }
        if (localThrowable.length <= 7) {
          break;
        }
        i1 = Integer.parseInt(localThrowable[7]);
        if ((i1 < 1) || (i1 >= 10)) {
          break;
        }
        com.tencent.mobileqq.app.GuardManager.s = i1;
        return;
        throw new IllegalArgumentException("Illegal wake interval " + i1);
        i1 = i2;
        if (i2 > this.jdField_a_of_type_Int) {
          i1 = this.jdField_a_of_type_Int;
        }
      }
      label777:
      i2 = 0;
      break label478;
      i1 = i2;
      if (i2 > 24) {
        i1 = 24;
      }
    }
  }
  
  public static pyg a()
  {
    if (jdField_a_of_type_Pyg == null) {}
    try
    {
      if (jdField_a_of_type_Pyg == null) {
        jdField_a_of_type_Pyg = new pyg();
      }
      return jdField_a_of_type_Pyg;
    }
    finally {}
  }
  
  public int a(long paramLong)
  {
    int i2 = Arrays.binarySearch(this.jdField_a_of_type_ArrayOfInt, (int)paramLong);
    int i1 = i2;
    if (i2 < 0) {
      i1 = -1 - i2;
    }
    i2 = i1 - this.r;
    if (i2 > 2) {
      i1 = 2;
    }
    do
    {
      return i1;
      i1 = i2;
    } while (i2 >= 0);
    return 0;
  }
  
  public int a(long[][] paramArrayOfLong, int paramInt1, int paramInt2)
  {
    int i2 = 0;
    if (paramInt2 != this.s)
    {
      paramInt1 = 0;
      float f2;
      for (float f1 = 0.0F; paramInt1 < 3; f1 += f2)
      {
        int i1 = 0;
        f2 = 0.0F;
        while (i1 < 15)
        {
          f2 += (float)paramArrayOfLong[paramInt1][i1];
          i1 += 1;
        }
        f2 = this.jdField_a_of_type_ArrayOfFloat[paramInt1] * f2 * 5.0F / 15.0F;
        paramInt1 += 1;
      }
      paramInt1 = (int)(3.0F - f1);
      if (paramInt1 < 0) {
        paramInt1 = i2;
      }
    }
    for (;;)
    {
      this.s = paramInt2;
      this.t = paramInt1;
      return paramInt1;
      if (paramInt1 > 2)
      {
        paramInt1 = 2;
        continue;
        return this.t;
      }
    }
  }
  
  public long a(long[][] paramArrayOfLong, int paramInt1, int paramInt2, long paramLong)
  {
    return this.jdField_b_of_type_ArrayOfInt[(a(paramLong) + a(paramArrayOfLong, paramInt1, paramInt2))];
  }
  
  public String a()
  {
    return this.jdField_a_of_type_JavaLangString;
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\pyg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */