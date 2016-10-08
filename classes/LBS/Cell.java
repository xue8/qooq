package LBS;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class Cell
  extends JceStruct
{
  public int iCellId = -1;
  public int iLac = -1;
  public short shMcc = -1;
  public short shMnc = -1;
  public short shRssi = 0;
  
  public Cell() {}
  
  public Cell(short paramShort1, short paramShort2, int paramInt1, int paramInt2, short paramShort3)
  {
    this.shMcc = paramShort1;
    this.shMnc = paramShort2;
    this.iLac = paramInt1;
    this.iCellId = paramInt2;
    this.shRssi = paramShort3;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.shMcc = paramJceInputStream.read(this.shMcc, 0, true);
    this.shMnc = paramJceInputStream.read(this.shMnc, 1, true);
    this.iLac = paramJceInputStream.read(this.iLac, 2, true);
    this.iCellId = paramJceInputStream.read(this.iCellId, 3, true);
    this.shRssi = paramJceInputStream.read(this.shRssi, 4, false);
  }
  
  public String toString()
  {
    return "Cell[cellId=" + this.iCellId + ",Lac=" + this.iLac + ",Mcc=" + this.shMcc + ",Mnc=" + this.shMnc + ",rssi=" + this.shRssi + "]\n";
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.shMcc, 0);
    paramJceOutputStream.write(this.shMnc, 1);
    paramJceOutputStream.write(this.iLac, 2);
    paramJceOutputStream.write(this.iCellId, 3);
    paramJceOutputStream.write(this.shRssi, 4);
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\LBS\Cell.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */