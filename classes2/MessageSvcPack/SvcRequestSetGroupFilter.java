package MessageSvcPack;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public final class SvcRequestSetGroupFilter
  extends JceStruct
{
  public byte cOp;
  public byte cVerifyType;
  public long lGroupCode;
  public long lUin;
  
  public SvcRequestSetGroupFilter()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public SvcRequestSetGroupFilter(long paramLong1, long paramLong2, byte paramByte1, byte paramByte2)
  {
    this.lUin = paramLong1;
    this.lGroupCode = paramLong2;
    this.cOp = paramByte1;
    this.cVerifyType = paramByte2;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.lUin = paramJceInputStream.read(this.lUin, 0, true);
    this.lGroupCode = paramJceInputStream.read(this.lGroupCode, 1, true);
    this.cOp = paramJceInputStream.read(this.cOp, 2, true);
    this.cVerifyType = paramJceInputStream.read(this.cVerifyType, 3, false);
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.lUin, 0);
    paramJceOutputStream.write(this.lGroupCode, 1);
    paramJceOutputStream.write(this.cOp, 2);
    paramJceOutputStream.write(this.cVerifyType, 3);
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\MessageSvcPack\SvcRequestSetGroupFilter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */