package NS_MOBILE_PHOTO;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import java.util.HashMap;
import java.util.Map;

public final class get_photo_list_2_req
  extends JceStruct
{
  static Map cache_busi_param;
  public String albumid;
  public Map busi_param;
  public String curlloc;
  public long face_uin;
  public String password;
  public int pn;
  public int ps;
  public String req_url;
  public int sheight;
  public int swidth;
  public long uin;
  
  public get_photo_list_2_req()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.albumid = "";
    this.password = "";
    this.curlloc = "";
    this.req_url = "";
  }
  
  public get_photo_list_2_req(long paramLong1, String paramString1, int paramInt1, int paramInt2, String paramString2, String paramString3, int paramInt3, int paramInt4, Map paramMap, String paramString4, long paramLong2)
  {
    this.albumid = "";
    this.password = "";
    this.curlloc = "";
    this.req_url = "";
    this.uin = paramLong1;
    this.albumid = paramString1;
    this.ps = paramInt1;
    this.pn = paramInt2;
    this.password = paramString2;
    this.curlloc = paramString3;
    this.swidth = paramInt3;
    this.sheight = paramInt4;
    this.busi_param = paramMap;
    this.req_url = paramString4;
    this.face_uin = paramLong2;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.uin = paramJceInputStream.read(this.uin, 1, true);
    this.albumid = paramJceInputStream.readString(2, true);
    this.ps = paramJceInputStream.read(this.ps, 3, true);
    this.pn = paramJceInputStream.read(this.pn, 4, true);
    this.password = paramJceInputStream.readString(5, false);
    this.curlloc = paramJceInputStream.readString(6, false);
    this.swidth = paramJceInputStream.read(this.swidth, 7, false);
    this.sheight = paramJceInputStream.read(this.sheight, 8, false);
    if (cache_busi_param == null)
    {
      cache_busi_param = new HashMap();
      cache_busi_param.put(Integer.valueOf(0), "");
    }
    this.busi_param = ((Map)paramJceInputStream.read(cache_busi_param, 9, false));
    this.req_url = paramJceInputStream.readString(10, false);
    this.face_uin = paramJceInputStream.read(this.face_uin, 11, false);
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.uin, 1);
    paramJceOutputStream.write(this.albumid, 2);
    paramJceOutputStream.write(this.ps, 3);
    paramJceOutputStream.write(this.pn, 4);
    if (this.password != null) {
      paramJceOutputStream.write(this.password, 5);
    }
    if (this.curlloc != null) {
      paramJceOutputStream.write(this.curlloc, 6);
    }
    paramJceOutputStream.write(this.swidth, 7);
    paramJceOutputStream.write(this.sheight, 8);
    if (this.busi_param != null) {
      paramJceOutputStream.write(this.busi_param, 9);
    }
    if (this.req_url != null) {
      paramJceOutputStream.write(this.req_url, 10);
    }
    paramJceOutputStream.write(this.face_uin, 11);
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\NS_MOBILE_PHOTO\get_photo_list_2_req.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */