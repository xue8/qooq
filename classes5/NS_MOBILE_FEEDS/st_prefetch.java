package NS_MOBILE_FEEDS;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class st_prefetch
  extends JceStruct
{
  static Map cache_mapExt;
  static ArrayList cache_vecPicUrl;
  public Map mapExt;
  public String sExtendInfo = "";
  public ArrayList vecPicUrl;
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    cache_vecPicUrl = new ArrayList();
    cache_vecPicUrl.add("");
    cache_mapExt = new HashMap();
    cache_mapExt.put("", "");
  }
  
  public st_prefetch() {}
  
  public st_prefetch(ArrayList paramArrayList, String paramString, Map paramMap)
  {
    this.vecPicUrl = paramArrayList;
    this.sExtendInfo = paramString;
    this.mapExt = paramMap;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.vecPicUrl = ((ArrayList)paramJceInputStream.read(cache_vecPicUrl, 0, false));
    this.sExtendInfo = paramJceInputStream.readString(1, false);
    this.mapExt = ((Map)paramJceInputStream.read(cache_mapExt, 2, false));
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    if (this.vecPicUrl != null) {
      paramJceOutputStream.write(this.vecPicUrl, 0);
    }
    if (this.sExtendInfo != null) {
      paramJceOutputStream.write(this.sExtendInfo, 1);
    }
    if (this.mapExt != null) {
      paramJceOutputStream.write(this.mapExt, 2);
    }
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\NS_MOBILE_FEEDS\st_prefetch.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */