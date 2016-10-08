package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public final class ReqFaceInfo
  extends JceStruct
{
  static ReqHead cache_stHeader;
  public byte bReqType;
  public long lUIN;
  public ReqHead stHeader;
  public int uFaceTimeStamp;
  
  public ReqFaceInfo()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public ReqFaceInfo(ReqHead paramReqHead, long paramLong, int paramInt, byte paramByte)
  {
    this.stHeader = paramReqHead;
    this.lUIN = paramLong;
    this.uFaceTimeStamp = paramInt;
    this.bReqType = paramByte;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    if (cache_stHeader == null) {
      cache_stHeader = new ReqHead();
    }
    this.stHeader = ((ReqHead)paramJceInputStream.read(cache_stHeader, 0, true));
    this.lUIN = paramJceInputStream.read(this.lUIN, 1, true);
    this.uFaceTimeStamp = paramJceInputStream.read(this.uFaceTimeStamp, 2, true);
    this.bReqType = paramJceInputStream.read(this.bReqType, 3, false);
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.stHeader, 0);
    paramJceOutputStream.write(this.lUIN, 1);
    paramJceOutputStream.write(this.uFaceTimeStamp, 2);
    paramJceOutputStream.write(this.bReqType, 3);
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\QQService\ReqFaceInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */