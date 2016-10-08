package NS_MOBILE_MAIN_PAGE;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import java.util.ArrayList;

public final class CoverCate
  extends JceStruct
{
  static ArrayList cache_items;
  public String attachInfo;
  public String description;
  public int hasMore;
  public String id;
  public ArrayList items;
  public int manyBits;
  public String name;
  public int showCount;
  public int totalCount;
  public int type;
  public String zhuanTiBannerUrl;
  public String zhuanTiThumbUrl;
  
  public CoverCate()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.name = "";
    this.attachInfo = "";
    this.id = "";
    this.description = "";
    this.zhuanTiThumbUrl = "";
    this.zhuanTiBannerUrl = "";
  }
  
  public CoverCate(String paramString1, ArrayList paramArrayList, int paramInt1, int paramInt2, int paramInt3, String paramString2, String paramString3, String paramString4, int paramInt4, String paramString5, String paramString6, int paramInt5)
  {
    this.name = "";
    this.attachInfo = "";
    this.id = "";
    this.description = "";
    this.zhuanTiThumbUrl = "";
    this.zhuanTiBannerUrl = "";
    this.name = paramString1;
    this.items = paramArrayList;
    this.showCount = paramInt1;
    this.totalCount = paramInt2;
    this.hasMore = paramInt3;
    this.attachInfo = paramString2;
    this.id = paramString3;
    this.description = paramString4;
    this.type = paramInt4;
    this.zhuanTiThumbUrl = paramString5;
    this.zhuanTiBannerUrl = paramString6;
    this.manyBits = paramInt5;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.name = paramJceInputStream.readString(0, false);
    if (cache_items == null)
    {
      cache_items = new ArrayList();
      CoverItem localCoverItem = new CoverItem();
      cache_items.add(localCoverItem);
    }
    this.items = ((ArrayList)paramJceInputStream.read(cache_items, 1, false));
    this.showCount = paramJceInputStream.read(this.showCount, 2, false);
    this.totalCount = paramJceInputStream.read(this.totalCount, 3, false);
    this.hasMore = paramJceInputStream.read(this.hasMore, 4, false);
    this.attachInfo = paramJceInputStream.readString(5, false);
    this.id = paramJceInputStream.readString(6, false);
    this.description = paramJceInputStream.readString(7, false);
    this.type = paramJceInputStream.read(this.type, 8, false);
    this.zhuanTiThumbUrl = paramJceInputStream.readString(9, false);
    this.zhuanTiBannerUrl = paramJceInputStream.readString(10, false);
    this.manyBits = paramJceInputStream.read(this.manyBits, 11, false);
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    if (this.name != null) {
      paramJceOutputStream.write(this.name, 0);
    }
    if (this.items != null) {
      paramJceOutputStream.write(this.items, 1);
    }
    paramJceOutputStream.write(this.showCount, 2);
    paramJceOutputStream.write(this.totalCount, 3);
    paramJceOutputStream.write(this.hasMore, 4);
    if (this.attachInfo != null) {
      paramJceOutputStream.write(this.attachInfo, 5);
    }
    if (this.id != null) {
      paramJceOutputStream.write(this.id, 6);
    }
    if (this.description != null) {
      paramJceOutputStream.write(this.description, 7);
    }
    paramJceOutputStream.write(this.type, 8);
    if (this.zhuanTiThumbUrl != null) {
      paramJceOutputStream.write(this.zhuanTiThumbUrl, 9);
    }
    if (this.zhuanTiBannerUrl != null) {
      paramJceOutputStream.write(this.zhuanTiBannerUrl, 10);
    }
    paramJceOutputStream.write(this.manyBits, 11);
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\NS_MOBILE_MAIN_PAGE\CoverCate.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */