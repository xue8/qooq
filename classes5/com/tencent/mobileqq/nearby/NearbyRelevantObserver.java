package com.tencent.mobileqq.nearby;

import com.tencent.mobileqq.app.BusinessObserver;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import java.util.List;

public class NearbyRelevantObserver
  implements BusinessObserver
{
  public NearbyRelevantObserver()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void a(int paramInt, boolean paramBoolean, Object paramObject)
  {
    switch (paramInt)
    {
    case 9: 
    case 10: 
    case 12: 
    default: 
      return;
    case 4: 
      paramObject = (Object[])paramObject;
      a(paramBoolean, (String)paramObject[0], (List)paramObject[1], (String)paramObject[2], ((Integer)paramObject[3]).intValue(), ((Integer)paramObject[4]).intValue());
      return;
    case 11: 
      a(paramBoolean);
      return;
    case 5: 
      paramObject = (Object[])paramObject;
      if ((paramBoolean) && (paramObject != null) && (paramObject.length == 1))
      {
        a(paramBoolean, (List)paramObject[0]);
        return;
      }
      a(false, null);
      return;
    case 6: 
      c(paramBoolean, ((Boolean)((Object[])(Object[])paramObject)[0]).booleanValue());
      return;
    case 7: 
      b(paramBoolean);
      return;
    case 8: 
      paramObject = (Object[])paramObject;
      a((String)paramObject[0], (String)paramObject[1], paramObject[2]);
      return;
    case 13: 
      b(paramBoolean, ((Boolean)((Object[])(Object[])paramObject)[0]).booleanValue());
      return;
    }
    a(paramBoolean, ((Boolean)((Object[])(Object[])paramObject)[0]).booleanValue());
  }
  
  public void a(String paramString1, String paramString2, Object paramObject) {}
  
  protected void a(boolean paramBoolean) {}
  
  public void a(boolean paramBoolean, String paramString1, List paramList, String paramString2, int paramInt1, int paramInt2) {}
  
  public void a(boolean paramBoolean, List paramList) {}
  
  public void a(boolean paramBoolean1, boolean paramBoolean2) {}
  
  public void b(boolean paramBoolean) {}
  
  public void b(boolean paramBoolean1, boolean paramBoolean2) {}
  
  public void c(boolean paramBoolean1, boolean paramBoolean2) {}
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\com\tencent\mobileqq\nearby\NearbyRelevantObserver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */