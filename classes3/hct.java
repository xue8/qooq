import android.os.SystemClock;
import com.tencent.av.widget.stageview.MathUtils;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public class hct
{
  public final int a;
  public final long a;
  public final boolean a;
  public int[] a;
  public final int b;
  public final int c;
  public int d;
  public int e;
  
  private hct(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.b = MathUtils.a(paramInt1, 20000);
    this.c = paramInt2;
    this.jdField_a_of_type_Long = (SystemClock.uptimeMillis() + paramInt4);
    this.e = paramInt1;
    paramInt1 = MathUtils.a(paramInt1, this.c, 20000, true);
    if (paramInt1 > 10000) {
      this.d = (20000 - paramInt1);
    }
    for (this.jdField_a_of_type_Boolean = false; paramInt3 == -1; this.jdField_a_of_type_Boolean = true)
    {
      this.jdField_a_of_type_Int = ((int)(0.1F * this.d));
      return;
      this.d = paramInt1;
    }
    this.jdField_a_of_type_Int = paramInt3;
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\hct.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */