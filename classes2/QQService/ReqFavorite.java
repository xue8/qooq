package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public final class ReqFavorite
  extends JceStruct
{
  static int cache_cOpType = 0;
  static int cache_emSource = 0;
  static ReqHead cache_stHeader;
  public int cOpType = 0;
  public int emSource = 65535;
  public int iCount = 1;
  public long lMID;
  public ReqHead stHeader;
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    cache_stHeader = new ReqHead();
  }
  
  public ReqFavorite() {}
  
  public ReqFavorite(ReqHead paramReqHead, long paramLong, int paramInt1, int paramInt2, int paramInt3)
  {
    this.stHeader = paramReqHead;
    this.lMID = paramLong;
    this.cOpType = paramInt1;
    this.emSource = paramInt2;
    this.iCount = paramInt3;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.stHeader = ((ReqHead)paramJceInputStream.read(cache_stHeader, 0, true));
    this.lMID = paramJceInputStream.read(this.lMID, 1, true);
    this.cOpType = paramJceInputStream.read(this.cOpType, 2, true);
    this.emSource = paramJceInputStream.read(this.emSource, 3, false);
    this.iCount = paramJceInputStream.read(this.iCount, 4, false);
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.stHeader, 0);
    paramJceOutputStream.write(this.lMID, 1);
    paramJceOutputStream.write(this.cOpType, 2);
    paramJceOutputStream.write(this.emSource, 3);
    paramJceOutputStream.write(this.iCount, 4);
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\QQService\ReqFavorite.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */