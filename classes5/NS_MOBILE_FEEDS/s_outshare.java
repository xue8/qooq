package NS_MOBILE_FEEDS;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import java.util.HashMap;
import java.util.Map;

public final class s_outshare
  extends JceStruct
{
  static Map cache_photourl;
  public Map photourl;
  public String summary = "";
  public String title = "";
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    cache_photourl = new HashMap();
    s_picurl locals_picurl = new s_picurl();
    cache_photourl.put(Integer.valueOf(0), locals_picurl);
  }
  
  public s_outshare() {}
  
  public s_outshare(String paramString1, String paramString2, Map paramMap)
  {
    this.title = paramString1;
    this.summary = paramString2;
    this.photourl = paramMap;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.title = paramJceInputStream.readString(0, false);
    this.summary = paramJceInputStream.readString(1, false);
    this.photourl = ((Map)paramJceInputStream.read(cache_photourl, 2, false));
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    if (this.title != null) {
      paramJceOutputStream.write(this.title, 0);
    }
    if (this.summary != null) {
      paramJceOutputStream.write(this.summary, 1);
    }
    if (this.photourl != null) {
      paramJceOutputStream.write(this.photourl, 2);
    }
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\NS_MOBILE_FEEDS\s_outshare.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */