package QzoneCombine;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import java.util.ArrayList;

public final class PushInfo
  extends JceStruct
{
  static ArrayList cache_vecMsg;
  public String Mark = "";
  public long opUin;
  public long uin;
  public ArrayList vecMsg;
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    cache_vecMsg = new ArrayList();
    SingleMsg localSingleMsg = new SingleMsg();
    cache_vecMsg.add(localSingleMsg);
  }
  
  public PushInfo() {}
  
  public PushInfo(long paramLong1, ArrayList paramArrayList, long paramLong2, String paramString)
  {
    this.uin = paramLong1;
    this.vecMsg = paramArrayList;
    this.opUin = paramLong2;
    this.Mark = paramString;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.uin = paramJceInputStream.read(this.uin, 0, false);
    this.vecMsg = ((ArrayList)paramJceInputStream.read(cache_vecMsg, 1, false));
    this.opUin = paramJceInputStream.read(this.opUin, 2, false);
    this.Mark = paramJceInputStream.readString(3, false);
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.uin, 0);
    if (this.vecMsg != null) {
      paramJceOutputStream.write(this.vecMsg, 1);
    }
    paramJceOutputStream.write(this.opUin, 2);
    if (this.Mark != null) {
      paramJceOutputStream.write(this.Mark, 3);
    }
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\QzoneCombine\PushInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */