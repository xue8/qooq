package com.facebook.react;

import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.List;

public abstract interface ReactPackage
{
  public abstract List<Class<? extends JavaScriptModule>> createJSModules();
  
  public abstract List<NativeModule> createNativeModules(ReactApplicationContext paramReactApplicationContext);
  
  public abstract List<ViewManager> createViewManagers(ReactApplicationContext paramReactApplicationContext);
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\com\facebook\react\ReactPackage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */