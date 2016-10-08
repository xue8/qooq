package KQQ;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public final class ProfileInfoReq
  extends JceStruct
{
  static byte[] cache_vecValue;
  public byte cType;
  public long dwTimeStamp;
  public String strKey;
  public byte[] vecValue;
  
  public ProfileInfoReq()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.strKey = "";
  }
  
  public ProfileInfoReq(byte paramByte, String paramString, long paramLong, byte[] paramArrayOfByte)
  {
    this.strKey = "";
    this.cType = paramByte;
    this.strKey = paramString;
    this.dwTimeStamp = paramLong;
    this.vecValue = paramArrayOfByte;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.cType = paramJceInputStream.read(this.cType, 0, true);
    this.strKey = paramJceInputStream.readString(1, true);
    this.dwTimeStamp = paramJceInputStream.read(this.dwTimeStamp, 2, true);
    if (cache_vecValue == null)
    {
      cache_vecValue = (byte[])new byte[1];
      ((byte[])cache_vecValue)[0] = 0;
    }
    this.vecValue = ((byte[])paramJceInputStream.read(cache_vecValue, 3, true));
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.cType, 0);
    paramJceOutputStream.write(this.strKey, 1);
    paramJceOutputStream.write(this.dwTimeStamp, 2);
    paramJceOutputStream.write(this.vecValue, 3);
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\KQQ\ProfileInfoReq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */