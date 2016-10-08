package LBSAddrProtocol;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public final class Cell
  extends JceStruct
{
  public int iCellId;
  public int iLac;
  public short shMcc;
  public short shMnc;
  
  public Cell()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.shMcc = -1;
    this.shMnc = -1;
    this.iLac = -1;
    this.iCellId = -1;
  }
  
  public Cell(short paramShort1, short paramShort2, int paramInt1, int paramInt2)
  {
    this.shMcc = -1;
    this.shMnc = -1;
    this.iLac = -1;
    this.iCellId = -1;
    this.shMcc = paramShort1;
    this.shMnc = paramShort2;
    this.iLac = paramInt1;
    this.iCellId = paramInt2;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.shMcc = paramJceInputStream.read(this.shMcc, 0, true);
    this.shMnc = paramJceInputStream.read(this.shMnc, 1, true);
    this.iLac = paramJceInputStream.read(this.iLac, 2, true);
    this.iCellId = paramJceInputStream.read(this.iCellId, 3, true);
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.shMcc, 0);
    paramJceOutputStream.write(this.shMnc, 1);
    paramJceOutputStream.write(this.iLac, 2);
    paramJceOutputStream.write(this.iCellId, 3);
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\LBSAddrProtocol\Cell.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */