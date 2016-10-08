package SummaryCard;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public final class TVideoHeadInfo
  extends JceStruct
{
  static byte[] cache_vMsg;
  public int iBasicFlag;
  public int iNearbyFlag;
  public byte[] vMsg;
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    cache_vMsg = (byte[])new byte[1];
    ((byte[])cache_vMsg)[0] = 0;
  }
  
  public TVideoHeadInfo() {}
  
  public TVideoHeadInfo(int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    this.iNearbyFlag = paramInt1;
    this.iBasicFlag = paramInt2;
    this.vMsg = paramArrayOfByte;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.iNearbyFlag = paramJceInputStream.read(this.iNearbyFlag, 0, false);
    this.iBasicFlag = paramJceInputStream.read(this.iBasicFlag, 1, false);
    this.vMsg = ((byte[])paramJceInputStream.read(cache_vMsg, 2, false));
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.iNearbyFlag, 0);
    paramJceOutputStream.write(this.iBasicFlag, 1);
    if (this.vMsg != null) {
      paramJceOutputStream.write(this.vMsg, 2);
    }
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\SummaryCard\TVideoHeadInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */