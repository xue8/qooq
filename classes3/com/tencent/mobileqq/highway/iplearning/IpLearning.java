package com.tencent.mobileqq.highway.iplearning;

import com.tencent.mobileqq.highway.utils.EndPoint;
import java.util.ArrayList;

public abstract interface IpLearning
  extends IpLearningStrategy
{
  public static final String TAG = "IpLearning";
  
  public abstract ArrayList<EndPoint> adjustNewIpList(ArrayList<EndPoint> paramArrayList);
  
  public abstract void onIpConnFail(String paramString, int paramInt);
  
  public abstract void onIpConnSucc(String paramString, int paramInt, boolean paramBoolean);
  
  public abstract void onRecvClearCMD();
  
  public static class IpLearningAdapter
    implements IpLearning
  {
    public ArrayList<EndPoint> adjustNewIpList(ArrayList<EndPoint> paramArrayList)
    {
      ArrayList localArrayList = new ArrayList();
      if ((paramArrayList == null) || (paramArrayList.isEmpty())) {
        return localArrayList;
      }
      localArrayList.addAll(paramArrayList);
      return localArrayList;
    }
    
    public void onIpConnFail(String paramString, int paramInt) {}
    
    public void onIpConnSucc(String paramString, int paramInt, boolean paramBoolean) {}
    
    public void onRecvClearCMD() {}
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\tencent\mobileqq\highway\iplearning\IpLearning.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */