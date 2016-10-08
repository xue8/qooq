package KQQ;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import java.util.ArrayList;

public final class SyncRes
  extends JceStruct
{
  static SyncReqCookie cache_cookie;
  static ArrayList cache_vecResPkg;
  public SyncReqCookie cookie;
  public byte result;
  public ArrayList vecResPkg;
  
  public SyncRes()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public SyncRes(byte paramByte, ArrayList paramArrayList, SyncReqCookie paramSyncReqCookie)
  {
    this.result = paramByte;
    this.vecResPkg = paramArrayList;
    this.cookie = paramSyncReqCookie;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.result = paramJceInputStream.read(this.result, 0, true);
    if (cache_vecResPkg == null)
    {
      cache_vecResPkg = new ArrayList();
      InfoItem localInfoItem = new InfoItem();
      cache_vecResPkg.add(localInfoItem);
    }
    this.vecResPkg = ((ArrayList)paramJceInputStream.read(cache_vecResPkg, 1, true));
    if (cache_cookie == null) {
      cache_cookie = new SyncReqCookie();
    }
    this.cookie = ((SyncReqCookie)paramJceInputStream.read(cache_cookie, 2, false));
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.result, 0);
    paramJceOutputStream.write(this.vecResPkg, 1);
    if (this.cookie != null) {
      paramJceOutputStream.write(this.cookie, 2);
    }
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\KQQ\SyncRes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */