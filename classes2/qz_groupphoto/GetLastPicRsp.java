package qz_groupphoto;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class GetLastPicRsp
  extends JceStruct
{
  static Map cache_exend;
  static ArrayList cache_vec_picurl;
  public int cnt;
  public Map exend;
  public boolean is_new;
  public long nexttime;
  public ArrayList vec_picurl;
  
  public GetLastPicRsp()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.is_new = true;
  }
  
  public GetLastPicRsp(ArrayList paramArrayList, boolean paramBoolean, int paramInt, long paramLong, Map paramMap)
  {
    this.is_new = true;
    this.vec_picurl = paramArrayList;
    this.is_new = paramBoolean;
    this.cnt = paramInt;
    this.nexttime = paramLong;
    this.exend = paramMap;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    if (cache_vec_picurl == null)
    {
      cache_vec_picurl = new ArrayList();
      cache_vec_picurl.add("");
    }
    this.vec_picurl = ((ArrayList)paramJceInputStream.read(cache_vec_picurl, 0, true));
    this.is_new = paramJceInputStream.read(this.is_new, 1, false);
    this.cnt = paramJceInputStream.read(this.cnt, 2, false);
    this.nexttime = paramJceInputStream.read(this.nexttime, 3, false);
    if (cache_exend == null)
    {
      cache_exend = new HashMap();
      cache_exend.put("", "");
    }
    this.exend = ((Map)paramJceInputStream.read(cache_exend, 4, false));
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.vec_picurl, 0);
    paramJceOutputStream.write(this.is_new, 1);
    paramJceOutputStream.write(this.cnt, 2);
    paramJceOutputStream.write(this.nexttime, 3);
    if (this.exend != null) {
      paramJceOutputStream.write(this.exend, 4);
    }
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\qz_groupphoto\GetLastPicRsp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */