package com.tribe.async.dispatch;

import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public abstract interface Dispatcher
{
  public static final String DEFAULT_GROUP_NAME = "default_group";
  public static final String ROOT_GROUP_NAME = "root_group";
  
  public abstract void cancelDispatch(@Nullable String paramString, Dispatchable paramDispatchable);
  
  public abstract void dispatch(Dispatchable paramDispatchable);
  
  public abstract void dispatch(@Nullable String paramString, Dispatchable paramDispatchable);
  
  public abstract void dispatchDelayed(Dispatchable paramDispatchable, int paramInt);
  
  public abstract void dispatchDelayed(@Nullable String paramString, Dispatchable paramDispatchable, int paramInt);
  
  @NonNull
  public abstract Looper getDefaultLooper();
  
  public abstract void registerSubscriber(Subscriber paramSubscriber);
  
  public abstract void registerSubscriber(@Nullable String paramString, Subscriber paramSubscriber);
  
  public abstract void registerWeakSubscriber(Subscriber paramSubscriber);
  
  public abstract void registerWeakSubscriber(@Nullable String paramString, Subscriber paramSubscriber);
  
  public abstract void unRegisterSubscriber(Subscriber paramSubscriber);
  
  public static abstract interface Command
    extends Dispatcher.Dispatchable
  {}
  
  public static abstract interface Dispatchable {}
  
  public static abstract interface Event
    extends Dispatcher.Dispatchable
  {}
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\tribe\async\dispatch\Dispatcher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */