package NeighborSvc;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public final class RespGetPoint
  extends JceStruct
{
  static GPS cache_stGps;
  static UserDetailLocalInfo cache_stUDLinfo;
  public GPS stGps;
  public UserDetailLocalInfo stUDLinfo;
  
  public RespGetPoint()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public RespGetPoint(GPS paramGPS, UserDetailLocalInfo paramUserDetailLocalInfo)
  {
    this.stGps = paramGPS;
    this.stUDLinfo = paramUserDetailLocalInfo;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    if (cache_stGps == null) {
      cache_stGps = new GPS();
    }
    this.stGps = ((GPS)paramJceInputStream.read(cache_stGps, 0, true));
    if (cache_stUDLinfo == null) {
      cache_stUDLinfo = new UserDetailLocalInfo();
    }
    this.stUDLinfo = ((UserDetailLocalInfo)paramJceInputStream.read(cache_stUDLinfo, 1, false));
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.stGps, 0);
    if (this.stUDLinfo != null) {
      paramJceOutputStream.write(this.stUDLinfo, 1);
    }
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\NeighborSvc\RespGetPoint.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */