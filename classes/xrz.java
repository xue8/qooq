import android.graphics.Rect;
import android.view.View;
import android.view.ViewConfiguration;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.widget.AbsListView;

public class xrz
  implements Runnable
{
  private static final int jdField_a_of_type_Int = 400;
  private static final int b = 1;
  private static final int c = 2;
  private static final int d = 3;
  private static final int e = 4;
  private static final int f = 5;
  private int g;
  private int h;
  private int i;
  private int j;
  private int k;
  private final int l;
  private int m;
  
  public xrz(AbsListView paramAbsListView)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.l = ViewConfiguration.get(paramAbsListView.getContext()).getScaledFadingEdgeLength();
  }
  
  public void a()
  {
    this.a.removeCallbacks(this);
    if (AbsListView.a(this.a) != null) {
      AbsListView.a(this.a).b();
    }
  }
  
  public void a(int paramInt)
  {
    a();
    int n = this.a.au;
    int i1 = this.a.getChildCount() + n - 1;
    if (paramInt <= n)
    {
      n = n - paramInt + 1;
      this.g = 2;
      if (n <= 0) {
        break label97;
      }
    }
    label97:
    for (this.k = (400 / n);; this.k = 400)
    {
      this.h = paramInt;
      this.i = -1;
      this.j = -1;
      this.a.post(this);
      do
      {
        return;
      } while (paramInt < i1);
      n = paramInt - i1 + 1;
      this.g = 1;
      break;
    }
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    a();
    if (paramInt2 == -1) {
      a(paramInt1);
    }
    int i1;
    do
    {
      return;
      n = this.a.au;
      i1 = this.a.getChildCount() + n - 1;
      if (paramInt1 > n) {
        break;
      }
      i1 -= paramInt2;
    } while (i1 < 1);
    int n = n - paramInt1 + 1;
    i1 -= 1;
    if (i1 < n)
    {
      this.g = 4;
      n = i1;
      label79:
      if (n <= 0) {
        break label180;
      }
    }
    label178:
    label180:
    for (this.k = (400 / n);; this.k = 400)
    {
      this.h = paramInt1;
      this.i = paramInt2;
      this.j = -1;
      this.a.post(this);
      return;
      for (this.g = 2;; this.g = 1)
      {
        break label79;
        if (paramInt1 < i1) {
          break label178;
        }
        int i2 = paramInt2 - n;
        if (i2 < 1) {
          break;
        }
        n = paramInt1 - i1 + 1;
        i1 = i2 - 1;
        if (i1 < n)
        {
          this.g = 3;
          n = i1;
          break label79;
        }
      }
      break;
    }
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3)
  {
    a();
    this.h = paramInt1;
    this.m = paramInt2;
    this.i = -1;
    this.j = -1;
    this.g = 5;
    int i1 = this.a.au;
    int n = this.a.getChildCount();
    int i2 = i1 + n - 1;
    if (paramInt1 < i1) {
      paramInt1 = i1 - paramInt1;
    }
    for (;;)
    {
      float f1 = paramInt1 / n;
      this.k = ((int)(paramInt3 / f1));
      this.j = -1;
      this.a.post(this);
      return;
      if (paramInt1 <= i2) {
        break;
      }
      paramInt1 -= i2;
    }
    paramInt1 = this.a.getChildAt(paramInt1 - i1).getTop();
    this.a.f(paramInt1 - paramInt2, paramInt3);
  }
  
  public void b(int paramInt1, int paramInt2)
  {
    a(paramInt1, paramInt2, 400);
  }
  
  public void run()
  {
    int n = 0;
    int i1 = 0;
    int i3 = this.a.getHeight();
    int i2 = this.a.au;
    switch (this.g)
    {
    default: 
    case 1: 
    case 3: 
    case 2: 
    case 4: 
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  do
                  {
                    return;
                    n = this.a.getChildCount() - 1;
                    i2 += n;
                  } while (n < 0);
                  if (i2 == this.j)
                  {
                    this.a.post(this);
                    return;
                  }
                  localView = this.a.getChildAt(n);
                  i4 = localView.getHeight();
                  int i5 = localView.getTop();
                  int i6 = this.a.c.bottom;
                  n = i1;
                  if (i2 < this.h)
                  {
                    n = i1;
                    if (i2 < this.a.aG - 1) {
                      n = this.l;
                    }
                  }
                  this.a.f(n + (i4 - (i3 - i5 - i6)), this.k);
                  this.j = i2;
                } while (i2 >= this.h);
                this.a.post(this);
                return;
                n = this.a.getChildCount();
              } while ((i2 == this.i) || (n <= 1) || (n + i2 >= this.a.aG));
              n = i2 + 1;
              if (n == this.j)
              {
                this.a.post(this);
                return;
              }
              localView = this.a.getChildAt(1);
              i1 = localView.getHeight();
              i2 = localView.getTop();
              i3 = this.l;
              if (n < this.i)
              {
                this.a.f(Math.max(0, i2 + i1 - i3), this.k);
                this.j = n;
                this.a.post(this);
                return;
              }
            } while (i2 <= i3);
            this.a.f(i2 - i3, this.k);
            return;
            if (i2 == this.j)
            {
              this.a.post(this);
              return;
            }
            localView = this.a.getChildAt(0);
          } while (localView == null);
          i1 = localView.getTop();
          if (i2 > 0) {}
          for (n = this.l;; n = this.a.c.top)
          {
            this.a.f(i1 - n, this.k);
            this.j = i2;
            if (i2 <= this.h) {
              break;
            }
            this.a.post(this);
            return;
          }
          i1 = this.a.getChildCount() - 2;
        } while (i1 < 0);
        n = i2 + i1;
        if (n == this.j)
        {
          this.a.post(this);
          return;
        }
        View localView = this.a.getChildAt(i1);
        i1 = localView.getHeight();
        i2 = localView.getTop();
        this.j = n;
        if (n > this.i)
        {
          this.a.f(-(i3 - i2 - this.l), this.k);
          this.a.post(this);
          return;
        }
        n = i3 - this.l;
        i1 = i2 + i1;
      } while (n <= i1);
      this.a.f(-(n - i1), this.k);
      return;
    }
    if (this.j == i2)
    {
      this.a.post(this);
      return;
    }
    this.j = i2;
    i1 = this.a.getChildCount();
    i3 = this.h;
    int i4 = i2 + i1 - 1;
    if (i3 < i2) {
      n = i2 - i3 + 1;
    }
    float f1;
    for (;;)
    {
      f1 = Math.min(Math.abs(n / i1), 1.0F);
      if (i3 >= i2) {
        break;
      }
      this.a.f((int)(f1 * -this.a.getHeight()), this.k);
      this.a.post(this);
      return;
      if (i3 > i4) {
        n = i3 - i4;
      }
    }
    if (i3 > i4)
    {
      this.a.f((int)(f1 * this.a.getHeight()), this.k);
      this.a.post(this);
      return;
    }
    n = this.a.getChildAt(i3 - i2).getTop() - this.m;
    i1 = Math.abs((int)(this.k * (n / this.a.getHeight())));
    this.a.f(n, i1);
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\xrz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */