package SummaryCard;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public final class QQApolloInfo
  extends JceStruct
{
  public long uTimestamp;
  public long uUserFlag;
  public long uVipFlag;
  public long uVipLevel;
  
  public QQApolloInfo()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public QQApolloInfo(long paramLong1, long paramLong2, long paramLong3, long paramLong4)
  {
    this.uVipFlag = paramLong1;
    this.uVipLevel = paramLong2;
    this.uUserFlag = paramLong3;
    this.uTimestamp = paramLong4;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.uVipFlag = paramJceInputStream.read(this.uVipFlag, 0, false);
    this.uVipLevel = paramJceInputStream.read(this.uVipLevel, 1, false);
    this.uUserFlag = paramJceInputStream.read(this.uUserFlag, 2, false);
    this.uTimestamp = paramJceInputStream.read(this.uTimestamp, 3, false);
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.uVipFlag, 0);
    paramJceOutputStream.write(this.uVipLevel, 1);
    paramJceOutputStream.write(this.uUserFlag, 2);
    paramJceOutputStream.write(this.uTimestamp, 3);
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\SummaryCard\QQApolloInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */