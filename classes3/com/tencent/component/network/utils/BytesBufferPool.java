package com.tencent.component.network.utils;

import java.util.ArrayList;

public class BytesBufferPool
{
  private final int a;
  private final int b;
  private final ArrayList<BytesBuffer> c;
  
  public BytesBufferPool(int paramInt1, int paramInt2)
  {
    this.c = new ArrayList(paramInt1);
    this.a = paramInt1;
    this.b = paramInt2;
  }
  
  public void clear()
  {
    try
    {
      this.c.clear();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public BytesBuffer get()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 25	com/tencent/component/network/utils/BytesBufferPool:c	Ljava/util/ArrayList;
    //   6: invokevirtual 39	java/util/ArrayList:size	()I
    //   9: istore_2
    //   10: iload_2
    //   11: ifle +21 -> 32
    //   14: aload_0
    //   15: getfield 25	com/tencent/component/network/utils/BytesBufferPool:c	Ljava/util/ArrayList;
    //   18: iload_2
    //   19: iconst_1
    //   20: isub
    //   21: invokevirtual 43	java/util/ArrayList:remove	(I)Ljava/lang/Object;
    //   24: checkcast 6	com/tencent/component/network/utils/BytesBufferPool$BytesBuffer
    //   27: astore_1
    //   28: aload_0
    //   29: monitorexit
    //   30: aload_1
    //   31: areturn
    //   32: new 6	com/tencent/component/network/utils/BytesBufferPool$BytesBuffer
    //   35: dup
    //   36: aload_0
    //   37: getfield 29	com/tencent/component/network/utils/BytesBufferPool:b	I
    //   40: iconst_0
    //   41: invokespecial 46	com/tencent/component/network/utils/BytesBufferPool$BytesBuffer:<init>	(IB)V
    //   44: astore_1
    //   45: goto -17 -> 28
    //   48: astore_1
    //   49: aload_0
    //   50: monitorexit
    //   51: aload_1
    //   52: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	53	0	this	BytesBufferPool
    //   27	18	1	localBytesBuffer	BytesBuffer
    //   48	4	1	localObject	Object
    //   9	12	2	i	int
    // Exception table:
    //   from	to	target	type
    //   2	10	48	finally
    //   14	28	48	finally
    //   32	45	48	finally
  }
  
  /* Error */
  public void recycle(BytesBuffer paramBytesBuffer)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: getfield 52	com/tencent/component/network/utils/BytesBufferPool$BytesBuffer:data	[B
    //   6: arraylength
    //   7: istore_2
    //   8: aload_0
    //   9: getfield 29	com/tencent/component/network/utils/BytesBufferPool:b	I
    //   12: istore_3
    //   13: iload_2
    //   14: iload_3
    //   15: if_icmpeq +6 -> 21
    //   18: aload_0
    //   19: monitorexit
    //   20: return
    //   21: aload_0
    //   22: getfield 25	com/tencent/component/network/utils/BytesBufferPool:c	Ljava/util/ArrayList;
    //   25: invokevirtual 39	java/util/ArrayList:size	()I
    //   28: aload_0
    //   29: getfield 27	com/tencent/component/network/utils/BytesBufferPool:a	I
    //   32: if_icmpge -14 -> 18
    //   35: aload_1
    //   36: iconst_0
    //   37: putfield 55	com/tencent/component/network/utils/BytesBufferPool$BytesBuffer:offset	I
    //   40: aload_1
    //   41: iconst_0
    //   42: putfield 58	com/tencent/component/network/utils/BytesBufferPool$BytesBuffer:length	I
    //   45: aload_0
    //   46: getfield 25	com/tencent/component/network/utils/BytesBufferPool:c	Ljava/util/ArrayList;
    //   49: aload_1
    //   50: invokevirtual 62	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   53: pop
    //   54: goto -36 -> 18
    //   57: astore_1
    //   58: aload_0
    //   59: monitorexit
    //   60: aload_1
    //   61: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	62	0	this	BytesBufferPool
    //   0	62	1	paramBytesBuffer	BytesBuffer
    //   7	9	2	i	int
    //   12	4	3	j	int
    // Exception table:
    //   from	to	target	type
    //   2	13	57	finally
    //   21	54	57	finally
  }
  
  public static class BytesBuffer
  {
    public byte[] data;
    public int length;
    public int offset;
    
    private BytesBuffer(int paramInt)
    {
      this.data = new byte[paramInt];
    }
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\tencent\component\network\utils\BytesBufferPool.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */