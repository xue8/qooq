package LBS_V2_PROTOCOL;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public final class GeoInfo_V2
  extends JceStruct
{
  public int iDistrictCode;
  public int iRange;
  public String strCity;
  public String strCountry;
  public String strDefaultName;
  public String strDistrict;
  public String strProvince;
  public String strRoad;
  public String strTown;
  public String strVillage;
  
  public GeoInfo_V2()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.iRange = -1;
    this.strCountry = "";
    this.strProvince = "";
    this.strCity = "";
    this.strDistrict = "";
    this.strTown = "";
    this.strVillage = "";
    this.strRoad = "";
    this.strDefaultName = "";
  }
  
  public GeoInfo_V2(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8)
  {
    this.iRange = -1;
    this.strCountry = "";
    this.strProvince = "";
    this.strCity = "";
    this.strDistrict = "";
    this.strTown = "";
    this.strVillage = "";
    this.strRoad = "";
    this.strDefaultName = "";
    this.iDistrictCode = paramInt1;
    this.iRange = paramInt2;
    this.strCountry = paramString1;
    this.strProvince = paramString2;
    this.strCity = paramString3;
    this.strDistrict = paramString4;
    this.strTown = paramString5;
    this.strVillage = paramString6;
    this.strRoad = paramString7;
    this.strDefaultName = paramString8;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.iDistrictCode = paramJceInputStream.read(this.iDistrictCode, 0, true);
    this.iRange = paramJceInputStream.read(this.iRange, 1, true);
    this.strCountry = paramJceInputStream.readString(2, true);
    this.strProvince = paramJceInputStream.readString(3, true);
    this.strCity = paramJceInputStream.readString(4, true);
    this.strDistrict = paramJceInputStream.readString(5, true);
    this.strTown = paramJceInputStream.readString(6, true);
    this.strVillage = paramJceInputStream.readString(7, true);
    this.strRoad = paramJceInputStream.readString(8, true);
    this.strDefaultName = paramJceInputStream.readString(9, false);
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.iDistrictCode, 0);
    paramJceOutputStream.write(this.iRange, 1);
    paramJceOutputStream.write(this.strCountry, 2);
    paramJceOutputStream.write(this.strProvince, 3);
    paramJceOutputStream.write(this.strCity, 4);
    paramJceOutputStream.write(this.strDistrict, 5);
    paramJceOutputStream.write(this.strTown, 6);
    paramJceOutputStream.write(this.strVillage, 7);
    paramJceOutputStream.write(this.strRoad, 8);
    if (this.strDefaultName != null) {
      paramJceOutputStream.write(this.strDefaultName, 9);
    }
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\LBS_V2_PROTOCOL\GeoInfo_V2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */