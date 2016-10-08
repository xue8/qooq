package AccostSvc;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import java.util.ArrayList;

public final class RichMsg
  extends JceStruct
{
  static ArrayList cache_VecMsg;
  static UserInfo cache_stSender;
  public ArrayList VecMsg;
  public int iActionID;
  public String sAction;
  public UserInfo stSender;
  
  public RichMsg()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.sAction = "";
  }
  
  public RichMsg(ArrayList paramArrayList, String paramString, UserInfo paramUserInfo, int paramInt)
  {
    this.sAction = "";
    this.VecMsg = paramArrayList;
    this.sAction = paramString;
    this.stSender = paramUserInfo;
    this.iActionID = paramInt;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    if (cache_VecMsg == null)
    {
      cache_VecMsg = new ArrayList();
      MsgItem localMsgItem = new MsgItem();
      cache_VecMsg.add(localMsgItem);
    }
    this.VecMsg = ((ArrayList)paramJceInputStream.read(cache_VecMsg, 0, true));
    this.sAction = paramJceInputStream.readString(1, false);
    if (cache_stSender == null) {
      cache_stSender = new UserInfo();
    }
    this.stSender = ((UserInfo)paramJceInputStream.read(cache_stSender, 2, false));
    this.iActionID = paramJceInputStream.read(this.iActionID, 3, false);
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.VecMsg, 0);
    if (this.sAction != null) {
      paramJceOutputStream.write(this.sAction, 1);
    }
    if (this.stSender != null) {
      paramJceOutputStream.write(this.stSender, 2);
    }
    paramJceOutputStream.write(this.iActionID, 3);
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\AccostSvc\RichMsg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */