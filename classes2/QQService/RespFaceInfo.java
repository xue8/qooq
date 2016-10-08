package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import java.util.ArrayList;

public final class RespFaceInfo
  extends JceStruct
{
  static RespHead cache_stHeader;
  static ArrayList cache_vFaceInfo;
  public int iFaceNum;
  public RespHead stHeader;
  public int uFaceTimeStamp;
  public ArrayList vFaceInfo;
  
  public RespFaceInfo()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public RespFaceInfo(RespHead paramRespHead, int paramInt1, ArrayList paramArrayList, int paramInt2)
  {
    this.stHeader = paramRespHead;
    this.uFaceTimeStamp = paramInt1;
    this.vFaceInfo = paramArrayList;
    this.iFaceNum = paramInt2;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    if (cache_stHeader == null) {
      cache_stHeader = new RespHead();
    }
    this.stHeader = ((RespHead)paramJceInputStream.read(cache_stHeader, 0, true));
    this.uFaceTimeStamp = paramJceInputStream.read(this.uFaceTimeStamp, 1, true);
    if (cache_vFaceInfo == null)
    {
      cache_vFaceInfo = new ArrayList();
      FaceInfo localFaceInfo = new FaceInfo();
      cache_vFaceInfo.add(localFaceInfo);
    }
    this.vFaceInfo = ((ArrayList)paramJceInputStream.read(cache_vFaceInfo, 2, true));
    this.iFaceNum = paramJceInputStream.read(this.iFaceNum, 3, false);
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.stHeader, 0);
    paramJceOutputStream.write(this.uFaceTimeStamp, 1);
    paramJceOutputStream.write(this.vFaceInfo, 2);
    paramJceOutputStream.write(this.iFaceNum, 3);
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\QQService\RespFaceInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */