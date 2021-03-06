package com.tencent.mobileqq.pb;

import java.io.IOException;

public final class PBSInt64Field
  extends PBPrimitiveField<Long>
{
  public static final PBSInt64Field __repeatHelper__ = new PBSInt64Field(0L, false);
  private long value = 0L;
  
  public PBSInt64Field(long paramLong, boolean paramBoolean)
  {
    set(paramLong, paramBoolean);
  }
  
  public void clear(Object paramObject)
  {
    if ((paramObject instanceof Long)) {}
    for (this.value = ((Long)paramObject).longValue();; this.value = 0L)
    {
      setHasFlag(false);
      return;
    }
  }
  
  public int computeSize(int paramInt)
  {
    if (has()) {
      return CodedOutputStreamMicro.computeSInt64Size(paramInt, this.value);
    }
    return 0;
  }
  
  protected int computeSizeDirectly(int paramInt, Long paramLong)
  {
    return CodedOutputStreamMicro.computeSInt64Size(paramInt, paramLong.longValue());
  }
  
  protected void copyFrom(PBField<Long> paramPBField)
  {
    paramPBField = (PBSInt64Field)paramPBField;
    set(paramPBField.value, paramPBField.has());
  }
  
  public long get()
  {
    return this.value;
  }
  
  public void readFrom(CodedInputStreamMicro paramCodedInputStreamMicro)
    throws IOException
  {
    this.value = paramCodedInputStreamMicro.readSInt64();
    setHasFlag(true);
  }
  
  protected Long readFromDirectly(CodedInputStreamMicro paramCodedInputStreamMicro)
    throws IOException
  {
    return Long.valueOf(paramCodedInputStreamMicro.readSInt64());
  }
  
  public void set(long paramLong)
  {
    set(paramLong, true);
  }
  
  public void set(long paramLong, boolean paramBoolean)
  {
    this.value = paramLong;
    setHasFlag(paramBoolean);
  }
  
  public void writeTo(CodedOutputStreamMicro paramCodedOutputStreamMicro, int paramInt)
    throws IOException
  {
    if (has()) {
      paramCodedOutputStreamMicro.writeSInt64(paramInt, this.value);
    }
  }
  
  protected void writeToDirectly(CodedOutputStreamMicro paramCodedOutputStreamMicro, int paramInt, Long paramLong)
    throws IOException
  {
    paramCodedOutputStreamMicro.writeSInt64(paramInt, paramLong.longValue());
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\com\tencent\mobileqq\pb\PBSInt64Field.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */