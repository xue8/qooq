package mqq.app;

import android.content.Intent;
import android.os.Bundle;
import mqq.observer.BusinessObserver;

public abstract class Servlet
{
  private ServletContainer container;
  private AppRuntime mAppRuntime;
  
  public AppRuntime getAppRuntime()
  {
    return this.mAppRuntime;
  }
  
  ServletContainer getServletContainer()
  {
    return this.container;
  }
  
  void init(AppRuntime paramAppRuntime, ServletContainer paramServletContainer)
  {
    this.mAppRuntime = paramAppRuntime;
    this.container = paramServletContainer;
  }
  
  public void notifyObserver(Intent paramIntent, int paramInt, boolean paramBoolean, Bundle paramBundle, Class<? extends BusinessObserver> paramClass)
  {
    if ((paramIntent instanceof NewIntent))
    {
      paramIntent = ((NewIntent)paramIntent).getObserver();
      if (paramIntent != null) {
        getAppRuntime().notifyObserver(paramIntent, paramInt, paramBoolean, paramBundle);
      }
    }
    getAppRuntime().notifyObservers(paramClass, paramInt, paramBoolean, paramBundle);
  }
  
  protected void onCreate() {}
  
  protected void onDestroy() {}
  
  public abstract void service(Intent paramIntent);
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\mqq\app\Servlet.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */