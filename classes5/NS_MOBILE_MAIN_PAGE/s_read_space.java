package NS_MOBILE_MAIN_PAGE;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import java.util.ArrayList;

public final class s_read_space
  extends JceStruct
{
  static ArrayList cache_detailreadspace;
  public int allnum;
  public ArrayList detailreadspace;
  public int unreadnum;
  
  public s_read_space()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public s_read_space(int paramInt1, int paramInt2, ArrayList paramArrayList)
  {
    this.allnum = paramInt1;
    this.unreadnum = paramInt2;
    this.detailreadspace = paramArrayList;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.allnum = paramJceInputStream.read(this.allnum, 0, false);
    this.unreadnum = paramJceInputStream.read(this.unreadnum, 1, false);
    if (cache_detailreadspace == null)
    {
      cache_detailreadspace = new ArrayList();
      s_user locals_user = new s_user();
      cache_detailreadspace.add(locals_user);
    }
    this.detailreadspace = ((ArrayList)paramJceInputStream.read(cache_detailreadspace, 2, false));
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.allnum, 0);
    paramJceOutputStream.write(this.unreadnum, 1);
    if (this.detailreadspace != null) {
      paramJceOutputStream.write(this.detailreadspace, 2);
    }
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\NS_MOBILE_MAIN_PAGE\s_read_space.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */