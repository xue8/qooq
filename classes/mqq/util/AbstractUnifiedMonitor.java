package mqq.util;

import java.util.Map;

public abstract class AbstractUnifiedMonitor
{
  public static final int FAMILY_ACT_TIME = 8;
  public static final int FAMILY_BG_TASK = 6;
  public static final int FAMILY_CPU_STATS = 11;
  public static final int FAMILY_DROP_FRAME = 10;
  public static final int FAMILY_FILE_TASK = 5;
  public static final int FAMILY_IMAGE_DRAWABLE = 2;
  public static final int FAMILY_IMAGE_VIEW = 3;
  public static final int FAMILY_LAST = 15;
  public static final int FAMILY_LOOPER = 0;
  public static final int FAMILY_MSF_MSG = 7;
  public static final int FAMILY_NEW_FPS = 12;
  public static final int FAMILY_OBSERVER = 1;
  public static final int FAMILY_QZONE_LOOPER = 14;
  public static final int FAMILY_RECENT = 13;
  public static final int FAMILY_SCENE_SMOOTH = 9;
  public static final int FAMILY_SUB_TASK = 4;
  
  public abstract void addEvent(int paramInt1, String paramString, int paramInt2, int paramInt3, Map<String, String> paramMap);
  
  public abstract int getThreshold(int paramInt);
  
  public abstract void notifyNotTimeout(int paramInt);
  
  public abstract void reportStackIfTimeout(int paramInt);
  
  public abstract boolean setMonitoredThread(int paramInt, Thread paramThread, ThreadMonitorCallback paramThreadMonitorCallback);
  
  public abstract boolean whetherReportDuringThisStartup(int paramInt);
  
  public abstract boolean whetherReportThisTime(int paramInt);
  
  public abstract boolean whetherReportThisTime(int paramInt, boolean paramBoolean);
  
  public abstract boolean whetherStackEnabled(int paramInt);
  
  public static abstract interface ThreadMonitorCallback
  {
    public abstract void onThreadMonitorEnd(int paramInt);
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\mqq\util\AbstractUnifiedMonitor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */