package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public final class CSUploadStreamMsg
  extends JceStruct
{
  static StreamData cache_stStreamData;
  static StreamInfo cache_stStreamInfo;
  public int iSeq;
  public int shMsgSeq;
  public short shVersion;
  public StreamData stStreamData;
  public StreamInfo stStreamInfo;
  
  public CSUploadStreamMsg()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public CSUploadStreamMsg(short paramShort, int paramInt1, StreamInfo paramStreamInfo, StreamData paramStreamData, int paramInt2)
  {
    this.shVersion = paramShort;
    this.iSeq = paramInt1;
    this.stStreamInfo = paramStreamInfo;
    this.stStreamData = paramStreamData;
    this.shMsgSeq = paramInt2;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.shVersion = paramJceInputStream.read(this.shVersion, 0, true);
    this.iSeq = paramJceInputStream.read(this.iSeq, 1, true);
    if (cache_stStreamInfo == null) {
      cache_stStreamInfo = new StreamInfo();
    }
    this.stStreamInfo = ((StreamInfo)paramJceInputStream.read(cache_stStreamInfo, 2, true));
    if (cache_stStreamData == null) {
      cache_stStreamData = new StreamData();
    }
    this.stStreamData = ((StreamData)paramJceInputStream.read(cache_stStreamData, 3, true));
    this.shMsgSeq = paramJceInputStream.read(this.shMsgSeq, 4, false);
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.shVersion, 0);
    paramJceOutputStream.write(this.iSeq, 1);
    paramJceOutputStream.write(this.stStreamInfo, 2);
    paramJceOutputStream.write(this.stStreamData, 3);
    paramJceOutputStream.write(this.shMsgSeq, 4);
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\QQService\CSUploadStreamMsg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */