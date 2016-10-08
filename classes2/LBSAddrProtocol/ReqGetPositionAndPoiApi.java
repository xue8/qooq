package LBSAddrProtocol;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import java.util.ArrayList;

public final class ReqGetPositionAndPoiApi
  extends JceStruct
{
  static byte[] cache_vLBSKeyData;
  static ArrayList cache_vTypes;
  public int iBeginPos;
  public int iRadius;
  public int iReqNum;
  public int iSortMethod;
  public byte[] vLBSKeyData;
  public ArrayList vTypes;
  
  public ReqGetPositionAndPoiApi()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.iRadius = 100;
    this.iReqNum = 10;
    this.iSortMethod = 2;
  }
  
  public ReqGetPositionAndPoiApi(byte[] paramArrayOfByte, ArrayList paramArrayList, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.iRadius = 100;
    this.iReqNum = 10;
    this.iSortMethod = 2;
    this.vLBSKeyData = paramArrayOfByte;
    this.vTypes = paramArrayList;
    this.iRadius = paramInt1;
    this.iBeginPos = paramInt2;
    this.iReqNum = paramInt3;
    this.iSortMethod = paramInt4;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    if (cache_vLBSKeyData == null)
    {
      cache_vLBSKeyData = (byte[])new byte[1];
      ((byte[])cache_vLBSKeyData)[0] = 0;
    }
    this.vLBSKeyData = ((byte[])paramJceInputStream.read(cache_vLBSKeyData, 0, true));
    if (cache_vTypes == null)
    {
      cache_vTypes = new ArrayList();
      cache_vTypes.add(Integer.valueOf(0));
    }
    this.vTypes = ((ArrayList)paramJceInputStream.read(cache_vTypes, 1, true));
    this.iRadius = paramJceInputStream.read(this.iRadius, 2, true);
    this.iBeginPos = paramJceInputStream.read(this.iBeginPos, 3, true);
    this.iReqNum = paramJceInputStream.read(this.iReqNum, 4, true);
    this.iSortMethod = paramJceInputStream.read(this.iSortMethod, 5, true);
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.vLBSKeyData, 0);
    paramJceOutputStream.write(this.vTypes, 1);
    paramJceOutputStream.write(this.iRadius, 2);
    paramJceOutputStream.write(this.iBeginPos, 3);
    paramJceOutputStream.write(this.iReqNum, 4);
    paramJceOutputStream.write(this.iSortMethod, 5);
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\LBSAddrProtocol\ReqGetPositionAndPoiApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */