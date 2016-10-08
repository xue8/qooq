package NS_MOBILE_FEEDS;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public final class cell_count
  extends JceStruct
{
  public String desc;
  public String icon;
  public int icon_height;
  public int icon_width;
  public int num;
  public int type;
  
  public cell_count()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.icon = "";
    this.desc = "";
  }
  
  public cell_count(int paramInt1, int paramInt2, String paramString1, String paramString2, int paramInt3, int paramInt4)
  {
    this.icon = "";
    this.desc = "";
    this.type = paramInt1;
    this.num = paramInt2;
    this.icon = paramString1;
    this.desc = paramString2;
    this.icon_width = paramInt3;
    this.icon_height = paramInt4;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.type = paramJceInputStream.read(this.type, 0, false);
    this.num = paramJceInputStream.read(this.num, 1, false);
    this.icon = paramJceInputStream.readString(2, false);
    this.desc = paramJceInputStream.readString(3, false);
    this.icon_width = paramJceInputStream.read(this.icon_width, 4, false);
    this.icon_height = paramJceInputStream.read(this.icon_height, 5, false);
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.type, 0);
    paramJceOutputStream.write(this.num, 1);
    if (this.icon != null) {
      paramJceOutputStream.write(this.icon, 2);
    }
    if (this.desc != null) {
      paramJceOutputStream.write(this.desc, 3);
    }
    paramJceOutputStream.write(this.icon_width, 4);
    paramJceOutputStream.write(this.icon_height, 5);
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\NS_MOBILE_FEEDS\cell_count.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */