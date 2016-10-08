package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import java.util.ArrayList;

public final class ReqCreateDiscuss
  extends JceStruct
{
  static int cache_DiscussType;
  static ArrayList cache_Members;
  public int DiscussType;
  public ArrayList Members;
  public String Name;
  public String Nick;
  public int Refer;
  
  public ReqCreateDiscuss()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.Name = "";
    this.DiscussType = 0;
    this.Nick = "";
  }
  
  public ReqCreateDiscuss(String paramString1, ArrayList paramArrayList, int paramInt1, String paramString2, int paramInt2)
  {
    this.Name = "";
    this.DiscussType = 0;
    this.Nick = "";
    this.Name = paramString1;
    this.Members = paramArrayList;
    this.DiscussType = paramInt1;
    this.Nick = paramString2;
    this.Refer = paramInt2;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.Name = paramJceInputStream.readString(0, true);
    if (cache_Members == null)
    {
      cache_Members = new ArrayList();
      AddDiscussMemberInfo localAddDiscussMemberInfo = new AddDiscussMemberInfo();
      cache_Members.add(localAddDiscussMemberInfo);
    }
    this.Members = ((ArrayList)paramJceInputStream.read(cache_Members, 1, true));
    this.DiscussType = paramJceInputStream.read(this.DiscussType, 2, false);
    this.Nick = paramJceInputStream.readString(3, false);
    this.Refer = paramJceInputStream.read(this.Refer, 4, false);
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.Name, 0);
    paramJceOutputStream.write(this.Members, 1);
    paramJceOutputStream.write(this.DiscussType, 2);
    if (this.Nick != null) {
      paramJceOutputStream.write(this.Nick, 3);
    }
    paramJceOutputStream.write(this.Refer, 4);
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\QQService\ReqCreateDiscuss.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */