import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public class xyb
  extends WeakReference
{
  public Object a;
  
  public xyb(Object paramObject1, Object paramObject2, ReferenceQueue paramReferenceQueue)
  {
    super(paramObject2, paramReferenceQueue);
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.a = paramObject1;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\xyb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */