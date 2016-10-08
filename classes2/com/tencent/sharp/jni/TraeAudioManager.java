package com.tencent.sharp.jni;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.qphone.base.util.QLog;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;
import xqu;
import xqw;
import xqx;
import xqy;
import xqz;
import xrd;
import xre;
import xrf;
import xrg;
import xrh;

public class TraeAudioManager
  extends BroadcastReceiver
{
  public static int A = -1;
  public static final String A = "OPERATION_GETSTREAMTYPE";
  static final int B = 1;
  public static final String B = "OPERATION_CONNECTDEVICE";
  static final int C = 2;
  public static final String C = "CONNECTDEVICE_DEVICENAME";
  static final int D = 4;
  public static final String D = "CONNECTDEVICE_RESULT_DEVICENAME";
  static final int E = 8;
  public static final String E = "OPERATION_CONNECT_HIGHEST_PRIORITY_DEVICE";
  static final int F = 16;
  public static final String F = "OPERATION_ISDEVICECHANGABLED";
  static final int G = 32;
  public static final String G = "ISDEVICECHANGABLED_REULT_ISCHANGABLED";
  static final int H = 64;
  public static final String H = "OPERATION_GETCONNECTEDDEVICE";
  static final int I = 128;
  public static final String I = "GETCONNECTEDDEVICE_REULT_LIST";
  static final int J = 256;
  public static final String J = "OPERATION_GETCONNECTINGDEVICE";
  static final int K = 512;
  public static final String K = "GETCONNECTINGDEVICE_REULT_LIST";
  public static final int L = 0;
  public static final String L = "EXTRA_DATA_STREAMTYPE";
  public static final int M = 1;
  public static final String M = "OPERATION_VOICECALL_PREPROCESS";
  public static final int N = 2;
  public static final String N = "OPERATION_VOICECALL_POSTROCESS";
  public static final int O = 3;
  public static final String O = "OPERATION_STARTRING";
  public static final int P = 4;
  public static final String P = "OPERATION_STOPRING";
  public static final int Q = 5;
  public static final String Q = "OPERATION_REQUEST_RELEASE_AUDIO_FOCUS";
  public static final int R = 6;
  public static final String R = "OPERATION_RECOVER_AUDIO_FOCUS";
  public static final int S = 7;
  public static final String S = "OPERATION_VOICECALL_AUDIOPARAM_CHANGED";
  public static final int T = 8;
  public static final String T = "NOTIFY_SERVICE_STATE";
  public static final int U = 9;
  public static final String U = "NOTIFY_SERVICE_STATE_DATE";
  public static final int V = 10;
  public static final String V = "NOTIFY_DEVICELISTUPDATE";
  public static final int W = 0;
  public static final String W = "EXTRA_DATA_AVAILABLEDEVICE_LIST";
  public static final int X = 0;
  public static final String X = "EXTRA_DATA_PREV_CONNECTEDDEVICE";
  public static final int Y = 1;
  public static final String Y = "EXTRA_DATA_CONNECTEDDEVICE";
  public static final int Z = 2;
  public static final String Z = "EXTRA_DATA_IF_HAS_BLUETOOTH_THIS_IS_NAME";
  public static final int a = 0;
  static TraeAudioManager jdField_a_of_type_ComTencentSharpJniTraeAudioManager;
  public static final String a = "com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST";
  static ReentrantLock jdField_a_of_type_JavaUtilConcurrentLocksReentrantLock;
  static final String[] jdField_a_of_type_ArrayOfJavaLangString = { "FORCE_NONE", "FORCE_SPEAKER", "FORCE_HEADPHONES", "FORCE_BT_SCO", "FORCE_BT_A2DP", "FORCE_WIRED_ACCESSORY", "FORCE_BT_CAR_DOCK", "FORCE_BT_DESK_DOCK", "FORCE_ANALOG_DOCK", "FORCE_NO_BT_A2DP", "FORCE_DIGITAL_DOCK" };
  public static final int aa = 3;
  public static final String aa = "NOTIFY_DEVICECHANGABLE_UPDATE";
  private static final int ab = 11;
  public static final String ab = "NOTIFY_DEVICECHANGABLE_UPDATE_DATE";
  private static final int ac = 4;
  public static final String ac = "NOTIFY_RING_COMPLETION";
  public static final String ad = "NOTIFY_STREAMTYPE_UPDATE";
  public static final String ae = "NOTIFY_ROUTESWITCHSTART";
  public static final String af = "EXTRA_DATA_ROUTESWITCHSTART_FROM";
  public static final String ag = "EXTRA_DATA_ROUTESWITCHSTART_TO";
  public static final String ah = "NOTIFY_ROUTESWITCHEND";
  public static final String ai = "EXTRA_DATA_ROUTESWITCHEND_DEV";
  public static final String aj = "EXTRA_DATA_ROUTESWITCHEND_TIME";
  public static final String ak = "OPERATION_EARACTION";
  public static final String al = "EXTRA_EARACTION";
  public static final String am = "DEVICE_NONE";
  public static final String an = "DEVICE_EARPHONE";
  public static final String ao = "DEVICE_SPEAKERPHONE";
  public static final String ap = "DEVICE_WIREDHEADSET";
  public static final String aq = "DEVICE_BLUETOOTHHEADSET";
  public static final String as = "DEVICE_SPEAKERPHONE;DEVICE_EARPHONE;DEVICE_BLUETOOTHHEADSET;DEVICE_WIREDHEADSET;";
  public static final String at = "DEVICE_EARPHONE;DEVICE_SPEAKERPHONE;DEVICE_BLUETOOTHHEADSET;DEVICE_WIREDHEADSET;";
  static final String av = "routing";
  public static final int b = 1;
  public static final String b = "com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_RES";
  public static final int c = 2;
  public static final String c = "com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_NOTIFY";
  public static final int d = 3;
  public static final String d = "PARAM_OPERATION";
  public static final int e = 4;
  public static final String e = "PARAM_SESSIONID";
  public static final int f = 5;
  public static final String f = "PARAM_ISHOSTSIDE";
  public static final int g = 6;
  public static final String g = "PARAM_RES_ERRCODE";
  public static final int h = 7;
  public static final String h = "PARAM_STATUS";
  public static final int i = 8;
  public static final String i = "PARAM_DEVICE";
  public static final int j = 9;
  public static final String j = "PARAM_ERROR";
  public static final int k = 10;
  public static final String k = "PARAM_MODEPOLICY";
  public static final int l = 0;
  public static final String l = "PARAM_STREAMTYPE";
  public static final int m = 1;
  public static final String m = "PARAM_RING_DATASOURCE";
  public static final int n = -1;
  public static final String n = "PARAM_RING_RSID";
  public static final int o = 0;
  public static final String o = "PARAM_RING_URI";
  public static final int p = 1;
  public static final String p = "PARAM_RING_FILEPATH";
  public static final int q = 2;
  public static final String q = "PARAM_RING_LOOP";
  public static final int r = 3;
  public static final String r = "PARAM_RING_LOOPCOUNT";
  public static final int s = 4;
  public static final String s = "PARAM_RING_MODE";
  public static final int t = 0;
  public static final String t = "PARAM_RING_USERDATA_STRING";
  public static final int u = 1;
  public static final String u = "OPERATION_STARTSERVICE";
  public static final int v = 2;
  public static final String v = "EXTRA_DATA_DEVICECONFIG";
  public static final String w = "OPERATION_STOPSERVICE";
  public static final String x = "OPERATION_REGISTERAUDIOSESSION";
  public static final String y = "REGISTERAUDIOSESSION_ISREGISTER";
  public static final String z = "OPERATION_GETDEVICELIST";
  public Context a;
  public AudioManager a;
  public TraeAudioManager.DeviceConfigManager a;
  public TraeAudioSessionHost a;
  public xqy a;
  xqz jdField_a_of_type_Xqz = null;
  public xrh a;
  public boolean a;
  public String ar = "DEVICE_NONE";
  public String au = "DEVICE_NONE";
  ReentrantLock b = new ReentrantLock();
  public int w = 0;
  public int x = 0;
  public int y = 0;
  public int z = -1;
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    jdField_a_of_type_JavaUtilConcurrentLocksReentrantLock = new ReentrantLock();
  }
  
  TraeAudioManager(Context paramContext)
  {
    this.jdField_a_of_type_AndroidMediaAudioManager = null;
    this.jdField_a_of_type_AndroidContentContext = null;
    this.jdField_a_of_type_ComTencentSharpJniTraeAudioSessionHost = null;
    this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager = null;
    this.jdField_a_of_type_Xqy = null;
    this.jdField_a_of_type_Boolean = true;
    this.jdField_a_of_type_Xrh = null;
    AudioDeviceInterface.LogTraceEntry(" context:" + paramContext);
    if (paramContext == null) {
      return;
    }
    this.jdField_a_of_type_AndroidContentContext = paramContext;
    this.jdField_a_of_type_Xqz = new xqz(this, this);
    if (this.jdField_a_of_type_Xqz != null) {}
    AudioDeviceInterface.LogTraceExit();
  }
  
  static int a(int paramInt)
  {
    int i2 = 0;
    int i1 = 0;
    if (a())
    {
      i2 = i1;
      if (QLog.isColorLevel())
      {
        QLog.w("TRAE", 2, "[Config] armeabi low Version, getAudioSource _audioSourcePolicy:" + paramInt + " source:" + 0);
        i2 = i1;
      }
    }
    do
    {
      return i2;
      int i3 = Build.VERSION.SDK_INT;
      if (paramInt >= 0)
      {
        if (QLog.isColorLevel()) {
          QLog.w("TRAE", 2, "[Config] getAudioSource _audioSourcePolicy:" + paramInt + " source:" + paramInt);
        }
        return paramInt;
      }
      i1 = i2;
      if (i3 >= 11) {
        i1 = 7;
      }
      i2 = i1;
    } while (!QLog.isColorLevel());
    QLog.w("TRAE", 2, "[Config] getAudioSource _audioSourcePolicy:" + paramInt + " source:" + i1);
    return i1;
  }
  
  public static int a(int paramInt, HashMap paramHashMap)
  {
    int i1 = -1;
    jdField_a_of_type_JavaUtilConcurrentLocksReentrantLock.lock();
    if (jdField_a_of_type_ComTencentSharpJniTraeAudioManager != null) {
      i1 = jdField_a_of_type_ComTencentSharpJniTraeAudioManager.b(paramInt, paramHashMap);
    }
    jdField_a_of_type_JavaUtilConcurrentLocksReentrantLock.unlock();
    return i1;
  }
  
  public static int a(Context paramContext)
  {
    AudioDeviceInterface.LogTraceEntry(" _ginstance:" + jdField_a_of_type_ComTencentSharpJniTraeAudioManager);
    jdField_a_of_type_JavaUtilConcurrentLocksReentrantLock.lock();
    if (jdField_a_of_type_ComTencentSharpJniTraeAudioManager == null) {
      jdField_a_of_type_ComTencentSharpJniTraeAudioManager = new TraeAudioManager(paramContext);
    }
    jdField_a_of_type_JavaUtilConcurrentLocksReentrantLock.unlock();
    AudioDeviceInterface.LogTraceExit();
    return 0;
  }
  
  public static int a(Context paramContext, boolean paramBoolean)
  {
    int i2 = -1;
    jdField_a_of_type_JavaUtilConcurrentLocksReentrantLock.lock();
    int i1;
    if (jdField_a_of_type_ComTencentSharpJniTraeAudioManager != null) {
      i1 = jdField_a_of_type_ComTencentSharpJniTraeAudioManager.b(paramContext, paramBoolean);
    }
    for (;;)
    {
      jdField_a_of_type_JavaUtilConcurrentLocksReentrantLock.unlock();
      return i1;
      i1 = i2;
      if (QLog.isColorLevel())
      {
        QLog.w("TRAE", 2, "TraeAudioManager|static SetSpeakerForTest|null == _ginstance");
        i1 = i2;
      }
    }
  }
  
  static int a(String paramString, long paramLong, boolean paramBoolean)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("PARAM_SESSIONID", Long.valueOf(paramLong));
    localHashMap.put("PARAM_OPERATION", paramString);
    localHashMap.put("PARAM_ISHOSTSIDE", Boolean.valueOf(paramBoolean));
    return a(32774, localHashMap);
  }
  
  static int a(String paramString, long paramLong, boolean paramBoolean, int paramInt)
  {
    if ((paramInt != 0) && (paramInt != 1)) {
      return -1;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("PARAM_SESSIONID", Long.valueOf(paramLong));
    localHashMap.put("PARAM_OPERATION", paramString);
    localHashMap.put("PARAM_ISHOSTSIDE", Boolean.valueOf(paramBoolean));
    localHashMap.put("EXTRA_EARACTION", Integer.valueOf(paramInt));
    return a(32776, localHashMap);
  }
  
  static int a(String paramString, long paramLong, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("PARAM_SESSIONID", Long.valueOf(paramLong));
    localHashMap.put("PARAM_OPERATION", paramString);
    localHashMap.put("PARAM_ISHOSTSIDE", Boolean.valueOf(paramBoolean));
    localHashMap.put("PARAM_MODEPOLICY", Integer.valueOf(paramInt1));
    localHashMap.put("PARAM_STREAMTYPE", Integer.valueOf(paramInt2));
    return a(32780, localHashMap);
  }
  
  static int a(String paramString1, long paramLong, boolean paramBoolean1, int paramInt1, int paramInt2, Uri paramUri, String paramString2, boolean paramBoolean2, int paramInt3, String paramString3, boolean paramBoolean3)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("PARAM_SESSIONID", Long.valueOf(paramLong));
    localHashMap.put("PARAM_OPERATION", paramString1);
    localHashMap.put("PARAM_ISHOSTSIDE", Boolean.valueOf(paramBoolean1));
    localHashMap.put("PARAM_RING_DATASOURCE", Integer.valueOf(paramInt1));
    localHashMap.put("PARAM_RING_RSID", Integer.valueOf(paramInt2));
    localHashMap.put("PARAM_RING_URI", paramUri);
    localHashMap.put("PARAM_RING_FILEPATH", paramString2);
    localHashMap.put("PARAM_RING_LOOP", Boolean.valueOf(paramBoolean2));
    localHashMap.put("PARAM_RING_LOOPCOUNT", Integer.valueOf(paramInt3));
    localHashMap.put("PARAM_RING_MODE", Boolean.valueOf(paramBoolean3));
    localHashMap.put("PARAM_RING_USERDATA_STRING", paramString3);
    return a(32782, localHashMap);
  }
  
  static int a(String paramString1, long paramLong, boolean paramBoolean, String paramString2)
  {
    if ((paramString2 == null) || (paramString2.length() <= 0)) {
      return -1;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("PARAM_SESSIONID", Long.valueOf(paramLong));
    localHashMap.put("PARAM_OPERATION", paramString1);
    localHashMap.put("PARAM_ISHOSTSIDE", Boolean.valueOf(paramBoolean));
    localHashMap.put("EXTRA_DATA_DEVICECONFIG", paramString2);
    return a(32772, localHashMap);
  }
  
  public static int a(boolean paramBoolean, long paramLong, Context paramContext)
  {
    int i1 = -1;
    jdField_a_of_type_JavaUtilConcurrentLocksReentrantLock.lock();
    if (jdField_a_of_type_ComTencentSharpJniTraeAudioManager != null)
    {
      if (!paramBoolean) {
        break label42;
      }
      jdField_a_of_type_ComTencentSharpJniTraeAudioManager.jdField_a_of_type_ComTencentSharpJniTraeAudioSessionHost.a(paramLong, paramContext);
    }
    for (;;)
    {
      i1 = 0;
      jdField_a_of_type_JavaUtilConcurrentLocksReentrantLock.unlock();
      return i1;
      label42:
      jdField_a_of_type_ComTencentSharpJniTraeAudioManager.jdField_a_of_type_ComTencentSharpJniTraeAudioSessionHost.a(paramLong);
    }
  }
  
  public static Object a(Object paramObject, String paramString, Object[] paramArrayOfObject, Class[] paramArrayOfClass)
  {
    Object localObject = null;
    try
    {
      paramObject = paramObject.getClass().getMethod(paramString, paramArrayOfClass).invoke(paramObject, paramArrayOfObject);
      return paramObject;
    }
    catch (Exception paramString)
    {
      do
      {
        paramObject = localObject;
      } while (!QLog.isColorLevel());
      QLog.w("TRAE", 2, "invokeMethod Exception:" + paramString.getMessage());
    }
    return null;
  }
  
  public static Object a(String paramString1, String paramString2, Object[] paramArrayOfObject, Class[] paramArrayOfClass)
  {
    Object localObject = null;
    try
    {
      paramArrayOfObject = Class.forName(paramString1).getMethod(paramString2, paramArrayOfClass).invoke(null, paramArrayOfObject);
      return paramArrayOfObject;
    }
    catch (ClassNotFoundException paramString2)
    {
      do
      {
        paramArrayOfObject = (Object[])localObject;
      } while (!QLog.isColorLevel());
      QLog.w("TRAE", 2, "ClassNotFound:" + paramString1);
      return null;
    }
    catch (NoSuchMethodException paramString1)
    {
      do
      {
        paramArrayOfObject = (Object[])localObject;
      } while (!QLog.isColorLevel());
      QLog.w("TRAE", 2, "NoSuchMethod:" + paramString2);
      return null;
    }
    catch (IllegalArgumentException paramString1)
    {
      do
      {
        paramArrayOfObject = (Object[])localObject;
      } while (!QLog.isColorLevel());
      QLog.w("TRAE", 2, "IllegalArgument:" + paramString2);
      return null;
    }
    catch (IllegalAccessException paramString1)
    {
      do
      {
        paramArrayOfObject = (Object[])localObject;
      } while (!QLog.isColorLevel());
      QLog.w("TRAE", 2, "IllegalAccess:" + paramString2);
      return null;
    }
    catch (InvocationTargetException paramString1)
    {
      do
      {
        paramArrayOfObject = (Object[])localObject;
      } while (!QLog.isColorLevel());
      QLog.w("TRAE", 2, "InvocationTarget:" + paramString2);
      return null;
    }
    catch (Exception paramString1)
    {
      do
      {
        paramArrayOfObject = (Object[])localObject;
      } while (!QLog.isColorLevel());
      QLog.w("TRAE", 2, "invokeStaticMethod Exception:" + paramString1.getMessage());
    }
    return null;
  }
  
  static String a(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < jdField_a_of_type_ArrayOfJavaLangString.length)) {
      return jdField_a_of_type_ArrayOfJavaLangString[paramInt];
    }
    return "unknow";
  }
  
  static void a(int paramInt1, int paramInt2)
  {
    Object localObject = new Object[2];
    localObject[0] = Integer.valueOf(paramInt1);
    localObject[1] = Integer.valueOf(paramInt2);
    Class[] arrayOfClass = new Class[localObject.length];
    arrayOfClass[0] = Integer.TYPE;
    arrayOfClass[1] = Integer.TYPE;
    localObject = a("android.media.AudioSystem", "setForceUse", (Object[])localObject, arrayOfClass);
    if (QLog.isColorLevel()) {
      QLog.w("TRAE", 2, "setForceUse  usage:" + paramInt1 + " config:" + paramInt2 + " ->" + a(paramInt2) + " res:" + localObject);
    }
  }
  
  static void a(AudioManager paramAudioManager, int paramInt)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    Class[] arrayOfClass = new Class[arrayOfObject.length];
    arrayOfClass[0] = Integer.TYPE;
    paramAudioManager = a(paramAudioManager, "forceVolumeControlStream", arrayOfObject, arrayOfClass);
    if (QLog.isColorLevel()) {
      QLog.w("TRAE", 2, "forceVolumeControlStream  streamType:" + paramInt + " res:" + paramAudioManager);
    }
  }
  
  static void a(String paramString)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramString;
    Class[] arrayOfClass = new Class[arrayOfObject.length];
    arrayOfClass[0] = String.class;
    if (QLog.isColorLevel()) {
      QLog.w("TRAE", 2, "setParameters  :" + paramString);
    }
    a("android.media.AudioSystem", "setParameters", arrayOfObject, arrayOfClass);
  }
  
  static boolean a()
  {
    String str2 = Build.CPU_ABI;
    String str1 = "unknown";
    if (Build.VERSION.SDK_INT >= 8) {}
    try
    {
      str1 = (String)Build.class.getDeclaredField("CPU_ABI2").get(null);
      if (QLog.isColorLevel()) {
        QLog.w("TRAE", 2, "IsEabiVersion CPU_ABI:" + str2 + " CPU_ABI2:" + str1);
      }
      if ((c(str2)) && (c(str1))) {
        return true;
      }
    }
    catch (Exception localException)
    {
      return c(str2);
    }
    return false;
  }
  
  public static boolean a(int paramInt)
  {
    if (paramInt != -1) {}
    do
    {
      do
      {
        return false;
        if (!Build.MANUFACTURER.equals("Xiaomi")) {
          break;
        }
        if (Build.MODEL.equals("MI 2")) {
          return true;
        }
        if (Build.MODEL.equals("MI 2A")) {
          return true;
        }
        if (Build.MODEL.equals("MI 2S")) {
          return true;
        }
      } while (!Build.MODEL.equals("MI 2SC"));
      return true;
    } while ((!Build.MANUFACTURER.equals("samsung")) || (!Build.MODEL.equals("SCH-I959")));
    return true;
  }
  
  public static boolean a(String paramString)
  {
    if (paramString == null) {}
    while ((!"DEVICE_SPEAKERPHONE".equals(paramString)) && (!"DEVICE_EARPHONE".equals(paramString)) && (!"DEVICE_WIREDHEADSET".equals(paramString)) && (!"DEVICE_BLUETOOTHHEADSET".equals(paramString))) {
      return false;
    }
    return true;
  }
  
  static int b(int paramInt)
  {
    int i1 = 3;
    if (a())
    {
      i2 = i1;
      if (QLog.isColorLevel())
      {
        QLog.w("TRAE", 2, "[Config] armeabi low Version, getAudioStreamType audioStreamTypePolicy:" + paramInt + " streamType:" + 3);
        i2 = i1;
      }
      return i2;
    }
    int i2 = Build.VERSION.SDK_INT;
    if (paramInt >= 0) {
      i1 = paramInt;
    }
    for (;;)
    {
      i2 = i1;
      if (!QLog.isColorLevel()) {
        break;
      }
      QLog.w("TRAE", 2, "[Config] getAudioStreamType audioStreamTypePolicy:" + paramInt + " streamType:" + i1);
      return i1;
      if (i2 >= 9) {
        i1 = 0;
      }
    }
  }
  
  static int b(String paramString, long paramLong, boolean paramBoolean)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("PARAM_SESSIONID", Long.valueOf(paramLong));
    localHashMap.put("PARAM_OPERATION", paramString);
    localHashMap.put("PARAM_ISHOSTSIDE", Boolean.valueOf(paramBoolean));
    return a(32784, localHashMap);
  }
  
  static int b(String paramString, long paramLong, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("PARAM_SESSIONID", Long.valueOf(paramLong));
    localHashMap.put("PARAM_OPERATION", paramString);
    localHashMap.put("PARAM_ISHOSTSIDE", Boolean.valueOf(paramBoolean));
    localHashMap.put("PARAM_MODEPOLICY", Integer.valueOf(paramInt1));
    localHashMap.put("PARAM_STREAMTYPE", Integer.valueOf(paramInt2));
    return a(32788, localHashMap);
  }
  
  static int b(String paramString1, long paramLong, boolean paramBoolean, String paramString2)
  {
    if (paramString2 == null) {
      return -1;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("PARAM_SESSIONID", Long.valueOf(paramLong));
    localHashMap.put("PARAM_OPERATION", paramString1);
    localHashMap.put("PARAM_ISHOSTSIDE", Boolean.valueOf(paramBoolean));
    localHashMap.put("CONNECTDEVICE_DEVICENAME", paramString2);
    localHashMap.put("PARAM_DEVICE", paramString2);
    return a(32775, localHashMap);
  }
  
  static void b(int paramInt)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    Class[] arrayOfClass = new Class[arrayOfObject.length];
    arrayOfClass[0] = Integer.TYPE;
    a("android.media.AudioSystem", "setPhoneState", arrayOfObject, arrayOfClass);
  }
  
  public static boolean b(String paramString)
  {
    if (!a(paramString)) {}
    while (!"DEVICE_SPEAKERPHONE".equals(paramString)) {
      return false;
    }
    return true;
  }
  
  public static int c(int paramInt)
  {
    int i2 = 0;
    int i1 = 0;
    if (a())
    {
      i2 = i1;
      if (QLog.isColorLevel())
      {
        QLog.w("TRAE", 2, "[Config] armeabi low Version, getCallAudioMode modePolicy:" + paramInt + " mode:" + 0);
        i2 = i1;
      }
    }
    do
    {
      return i2;
      int i3 = Build.VERSION.SDK_INT;
      if (paramInt >= 0)
      {
        if (QLog.isColorLevel()) {
          QLog.w("TRAE", 2, "[Config] getCallAudioMode modePolicy:" + paramInt + " mode:" + paramInt);
        }
        return paramInt;
      }
      i1 = i2;
      if (i3 >= 11) {
        i1 = 3;
      }
      i2 = i1;
    } while (!QLog.isColorLevel());
    QLog.w("TRAE", 2, "[Config] getCallAudioMode _modePolicy:" + paramInt + " mode:" + i1 + "facturer:" + Build.MANUFACTURER + " model:" + Build.MODEL);
    return i1;
  }
  
  static int c(String paramString, long paramLong, boolean paramBoolean)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("PARAM_SESSIONID", Long.valueOf(paramLong));
    localHashMap.put("PARAM_OPERATION", paramString);
    localHashMap.put("PARAM_ISHOSTSIDE", Boolean.valueOf(paramBoolean));
    return a(32773, localHashMap);
  }
  
  public static boolean c(String paramString)
  {
    if (paramString == null) {}
    do
    {
      return true;
      if (paramString.contains("x86")) {
        return false;
      }
      if (paramString.contains("mips")) {
        return false;
      }
    } while ((paramString.equalsIgnoreCase("armeabi")) || (!paramString.equalsIgnoreCase("armeabi-v7a")));
    return false;
  }
  
  static int d(int paramInt)
  {
    Object localObject = new Object[1];
    localObject[0] = Integer.valueOf(paramInt);
    Class[] arrayOfClass = new Class[localObject.length];
    arrayOfClass[0] = Integer.TYPE;
    localObject = a("android.media.AudioSystem", "getForceUse", (Object[])localObject, arrayOfClass);
    if (localObject != null) {}
    for (localObject = (Integer)localObject;; localObject = Integer.valueOf(0))
    {
      if (QLog.isColorLevel()) {
        QLog.w("TRAE", 2, "getForceUse  usage:" + paramInt + " config:" + localObject + " ->" + a(((Integer)localObject).intValue()));
      }
      return ((Integer)localObject).intValue();
    }
  }
  
  static int d(String paramString, long paramLong, boolean paramBoolean)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("PARAM_SESSIONID", Long.valueOf(paramLong));
    localHashMap.put("PARAM_OPERATION", paramString);
    localHashMap.put("PARAM_ISHOSTSIDE", Boolean.valueOf(paramBoolean));
    return a(32789, localHashMap);
  }
  
  static int e(String paramString, long paramLong, boolean paramBoolean)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("PARAM_SESSIONID", Long.valueOf(paramLong));
    localHashMap.put("PARAM_OPERATION", paramString);
    localHashMap.put("PARAM_ISHOSTSIDE", Boolean.valueOf(paramBoolean));
    return a(32777, localHashMap);
  }
  
  static int f(String paramString, long paramLong, boolean paramBoolean)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("PARAM_SESSIONID", Long.valueOf(paramLong));
    localHashMap.put("PARAM_OPERATION", paramString);
    localHashMap.put("PARAM_ISHOSTSIDE", Boolean.valueOf(paramBoolean));
    return a(32778, localHashMap);
  }
  
  public static void f()
  {
    AudioDeviceInterface.LogTraceEntry(" _ginstance:" + jdField_a_of_type_ComTencentSharpJniTraeAudioManager);
    jdField_a_of_type_JavaUtilConcurrentLocksReentrantLock.lock();
    if (jdField_a_of_type_ComTencentSharpJniTraeAudioManager != null)
    {
      jdField_a_of_type_ComTencentSharpJniTraeAudioManager.g();
      jdField_a_of_type_ComTencentSharpJniTraeAudioManager = null;
    }
    jdField_a_of_type_JavaUtilConcurrentLocksReentrantLock.unlock();
    AudioDeviceInterface.LogTraceExit();
  }
  
  static int g(String paramString, long paramLong, boolean paramBoolean)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("PARAM_SESSIONID", Long.valueOf(paramLong));
    localHashMap.put("PARAM_OPERATION", paramString);
    localHashMap.put("PARAM_ISHOSTSIDE", Boolean.valueOf(paramBoolean));
    return a(32779, localHashMap);
  }
  
  static int h(String paramString, long paramLong, boolean paramBoolean)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("PARAM_SESSIONID", Long.valueOf(paramLong));
    localHashMap.put("PARAM_OPERATION", paramString);
    localHashMap.put("PARAM_ISHOSTSIDE", Boolean.valueOf(paramBoolean));
    return a(32781, localHashMap);
  }
  
  static int i(String paramString, long paramLong, boolean paramBoolean)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("PARAM_SESSIONID", Long.valueOf(paramLong));
    localHashMap.put("PARAM_OPERATION", paramString);
    localHashMap.put("PARAM_ISHOSTSIDE", Boolean.valueOf(paramBoolean));
    return a(32783, localHashMap);
  }
  
  static int j(String paramString, long paramLong, boolean paramBoolean)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("PARAM_SESSIONID", Long.valueOf(paramLong));
    localHashMap.put("PARAM_OPERATION", paramString);
    localHashMap.put("PARAM_ISHOSTSIDE", Boolean.valueOf(paramBoolean));
    return a(32790, localHashMap);
  }
  
  static int k(String paramString, long paramLong, boolean paramBoolean)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("PARAM_SESSIONID", Long.valueOf(paramLong));
    localHashMap.put("PARAM_OPERATION", paramString);
    localHashMap.put("PARAM_ISHOSTSIDE", Boolean.valueOf(paramBoolean));
    return a(32791, localHashMap);
  }
  
  public int a()
  {
    AudioDeviceInterface.LogTraceEntry("");
    if (this.jdField_a_of_type_AndroidContentContext == null) {
      return -1;
    }
    Object localObject = this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager.a();
    ArrayList localArrayList = (ArrayList)((HashMap)localObject).get("EXTRA_DATA_AVAILABLEDEVICE_LIST");
    String str = (String)((HashMap)localObject).get("EXTRA_DATA_CONNECTEDDEVICE");
    localObject = (String)((HashMap)localObject).get("EXTRA_DATA_PREV_CONNECTEDDEVICE");
    Intent localIntent = new Intent();
    localIntent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_NOTIFY");
    localIntent.putExtra("PARAM_OPERATION", "NOTIFY_DEVICELISTUPDATE");
    localIntent.putExtra("EXTRA_DATA_AVAILABLEDEVICE_LIST", (String[])localArrayList.toArray(new String[0]));
    localIntent.putExtra("EXTRA_DATA_CONNECTEDDEVICE", str);
    localIntent.putExtra("EXTRA_DATA_PREV_CONNECTEDDEVICE", (String)localObject);
    localIntent.putExtra("EXTRA_DATA_IF_HAS_BLUETOOTH_THIS_IS_NAME", this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager.a());
    this.jdField_a_of_type_AndroidContentContext.sendBroadcast(localIntent);
    AudioDeviceInterface.LogTraceExit();
    return 0;
  }
  
  public int a(Intent paramIntent, HashMap paramHashMap, int paramInt)
  {
    if (this.jdField_a_of_type_AndroidContentContext == null) {
      return -1;
    }
    Long localLong = (Long)paramHashMap.get("PARAM_SESSIONID");
    if (QLog.isColorLevel()) {
      QLog.w("TRAE", 2, " sessonID:" + localLong + " " + (String)paramHashMap.get("PARAM_OPERATION"));
    }
    if ((localLong == null) || (localLong.longValue() == Long.MIN_VALUE))
    {
      a();
      if (QLog.isColorLevel()) {
        QLog.e("TRAE", 2, "sendResBroadcast sid null,don't send res");
      }
      return -1;
    }
    paramIntent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_RES");
    paramIntent.putExtra("PARAM_SESSIONID", (Long)paramHashMap.get("PARAM_SESSIONID"));
    paramIntent.putExtra("PARAM_OPERATION", (String)paramHashMap.get("PARAM_OPERATION"));
    paramIntent.putExtra("PARAM_RES_ERRCODE", paramInt);
    this.jdField_a_of_type_AndroidContentContext.sendBroadcast(paramIntent);
    return 0;
  }
  
  int a(AudioManager paramAudioManager, boolean paramBoolean)
  {
    int i1 = 0;
    if (QLog.isColorLevel()) {
      QLog.w("TRAE", 2, "InternalSetSpeakerSpe fac:" + Build.MANUFACTURER + " model:" + Build.MODEL + " st:" + this.y + " media_force_use:" + d(1));
    }
    if (paramBoolean)
    {
      a(0);
      paramAudioManager.setSpeakerphoneOn(true);
      a(1, 1);
      if (paramAudioManager.isSpeakerphoneOn() != paramBoolean) {
        break label178;
      }
    }
    for (;;)
    {
      if (QLog.isColorLevel()) {
        QLog.w("TRAE", 2, "InternalSetSpeakerSpe exit:" + paramBoolean + " res:" + i1 + " mode:" + paramAudioManager.getMode());
      }
      return i1;
      a(3);
      paramAudioManager.setSpeakerphoneOn(false);
      a(1, 0);
      break;
      label178:
      i1 = -1;
    }
  }
  
  public int a(String paramString, HashMap paramHashMap)
  {
    AudioDeviceInterface.LogTraceEntry(" devName:" + paramString);
    if (paramString == null) {}
    do
    {
      do
      {
        return -1;
        if ((!this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager.d().equals("DEVICE_NONE")) && (paramString.equals(this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager.d()))) {
          return 0;
        }
        if ((a(paramString) == true) && (this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager.b(paramString) == true)) {
          break;
        }
      } while (!QLog.isColorLevel());
      QLog.e("TRAE", 2, " checkDevName fail");
      return -1;
      if (b() == true) {
        break;
      }
    } while (!QLog.isColorLevel());
    QLog.e("TRAE", 2, " InternalIsDeviceChangeable fail");
    return -1;
    if (this.jdField_a_of_type_Xrh != null)
    {
      if (QLog.isColorLevel()) {
        QLog.w("TRAE", 2, "_switchThread:" + this.jdField_a_of_type_Xrh.a());
      }
      this.jdField_a_of_type_Boolean = false;
      this.jdField_a_of_type_Xrh.f();
      this.jdField_a_of_type_Xrh = null;
    }
    if (paramString.equals("DEVICE_EARPHONE")) {
      this.jdField_a_of_type_Xrh = new xre(this);
    }
    for (;;)
    {
      if (this.jdField_a_of_type_Xrh != null)
      {
        this.jdField_a_of_type_Boolean = true;
        this.jdField_a_of_type_Xrh.a(paramHashMap);
        this.jdField_a_of_type_Xrh.start();
      }
      AudioDeviceInterface.LogTraceExit();
      return 0;
      if (paramString.equals("DEVICE_SPEAKERPHONE")) {
        this.jdField_a_of_type_Xrh = new xrg(this);
      } else if (paramString.equals("DEVICE_WIREDHEADSET")) {
        this.jdField_a_of_type_Xrh = new xrf(this);
      } else if (paramString.equals("DEVICE_BLUETOOTHHEADSET")) {
        this.jdField_a_of_type_Xrh = new xrd(this);
      }
    }
  }
  
  public int a(HashMap paramHashMap)
  {
    AudioDeviceInterface.LogTraceEntry("");
    if ((paramHashMap == null) || (this.jdField_a_of_type_AndroidContentContext == null)) {
      return -1;
    }
    String str = (String)paramHashMap.get("PARAM_DEVICE");
    boolean bool = b();
    int i1;
    if (a(str) != true) {
      i1 = 7;
    }
    for (;;)
    {
      this.ar = str;
      StringBuilder localStringBuilder;
      if (QLog.isColorLevel())
      {
        localStringBuilder = new StringBuilder().append("sessonID:").append((Long)paramHashMap.get("PARAM_SESSIONID")).append(" devName:").append(str).append(" bChangabled:");
        if (!bool) {
          break label212;
        }
      }
      label212:
      for (Object localObject = "Y";; localObject = "N")
      {
        QLog.w("TRAE", 2, (String)localObject + " err:" + i1);
        if (i1 == 0) {
          break label219;
        }
        localObject = new Intent();
        ((Intent)localObject).putExtra("CONNECTDEVICE_RESULT_DEVICENAME", (String)paramHashMap.get("PARAM_DEVICE"));
        a((Intent)localObject, paramHashMap, i1);
        return -1;
        if (!this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager.b(str))
        {
          i1 = 8;
          break;
        }
        if (bool) {
          break label312;
        }
        this.au = str;
        i1 = 9;
        break;
      }
      label219:
      if (str.equals(this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager.d()))
      {
        if (QLog.isColorLevel()) {
          QLog.e("TRAE", 2, " --has connected!");
        }
        localObject = new Intent();
        ((Intent)localObject).putExtra("CONNECTDEVICE_RESULT_DEVICENAME", (String)paramHashMap.get("PARAM_DEVICE"));
        a((Intent)localObject, paramHashMap, i1);
        return 0;
      }
      if (QLog.isColorLevel()) {
        QLog.w("TRAE", 2, " --connecting...");
      }
      a(str, paramHashMap);
      AudioDeviceInterface.LogTraceExit();
      return 0;
      label312:
      i1 = 0;
    }
  }
  
  public xqy a(Context paramContext, TraeAudioManager.DeviceConfigManager paramDeviceConfigManager)
  {
    Object localObject1;
    Object localObject2;
    if ((Build.VERSION.SDK_INT >= 11) && (Build.VERSION.SDK_INT != 18))
    {
      localObject1 = new xqu(this);
      localObject2 = localObject1;
      if (!((xqy)localObject1).a(paramContext, paramDeviceConfigManager)) {
        localObject2 = new xqw(this);
      }
      if (QLog.isColorLevel())
      {
        paramDeviceConfigManager = new StringBuilder().append("CreateBluetoothCheck:").append(((xqy)localObject2).a()).append(" skip android4.3:");
        if (Build.VERSION.SDK_INT != 18) {
          break label143;
        }
      }
    }
    label143:
    for (paramContext = "Y";; paramContext = "N")
    {
      QLog.w("TRAE", 2, paramContext);
      return (xqy)localObject2;
      if (Build.VERSION.SDK_INT != 18)
      {
        localObject1 = new xqx(this);
        break;
      }
      localObject1 = new xqw(this);
      break;
    }
  }
  
  void a()
  {
    int i2 = 0;
    AudioDeviceInterface.LogTraceEntry("");
    int i3 = this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager.a();
    if (QLog.isColorLevel()) {
      QLog.w("TRAE", 2, "   ConnectedDevice:" + this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager.d());
    }
    if (QLog.isColorLevel()) {
      QLog.w("TRAE", 2, "   ConnectingDevice:" + this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager.c());
    }
    if (QLog.isColorLevel()) {
      QLog.w("TRAE", 2, "   prevConnectedDevice:" + this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager.e());
    }
    if (QLog.isColorLevel()) {
      QLog.w("TRAE", 2, "   AHPDevice:" + this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager.b());
    }
    if (QLog.isColorLevel()) {
      QLog.w("TRAE", 2, "   deviceNamber:" + i3);
    }
    int i1 = 0;
    while (i1 < i3)
    {
      localObject = this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager.a(i1);
      if (QLog.isColorLevel()) {
        QLog.w("TRAE", 2, "      " + i1 + " devName:" + (String)localObject + " Visible:" + this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager.b((String)localObject) + " Priority:" + this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager.a((String)localObject));
      }
      i1 += 1;
    }
    Object localObject = (String[])this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager.a().toArray(new String[0]);
    i1 = i2;
    if (QLog.isColorLevel())
    {
      QLog.w("TRAE", 2, "   AvailableNamber:" + localObject.length);
      i1 = i2;
    }
    while (i1 < localObject.length)
    {
      String str = localObject[i1];
      if (QLog.isColorLevel()) {
        QLog.w("TRAE", 2, "      " + i1 + " devName:" + str + " Visible:" + this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager.b(str) + " Priority:" + this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager.a(str));
      }
      i1 += 1;
    }
    AudioDeviceInterface.LogTraceExit();
  }
  
  public void a(int paramInt)
  {
    if (QLog.isColorLevel()) {
      QLog.w("TRAE", 2, "SetMode entry:" + paramInt);
    }
    if (this.jdField_a_of_type_AndroidMediaAudioManager == null) {
      if (QLog.isColorLevel()) {
        QLog.w("TRAE", 2, "setMode:" + paramInt + " fail am=null");
      }
    }
    do
    {
      return;
      this.jdField_a_of_type_AndroidMediaAudioManager.setMode(paramInt);
    } while (!QLog.isColorLevel());
    StringBuilder localStringBuilder = new StringBuilder().append("setMode:").append(paramInt);
    if (this.jdField_a_of_type_AndroidMediaAudioManager.getMode() != paramInt) {}
    for (String str = "fail";; str = "success")
    {
      QLog.w("TRAE", 2, str);
      return;
    }
  }
  
  void a(Context paramContext, Intent paramIntent)
  {
    Object localObject = paramIntent.getStringExtra("name");
    paramContext = (Context)localObject;
    if (localObject == null) {
      paramContext = "unkonw";
    }
    localObject = "" + " [" + paramContext + "] ";
    int i1 = paramIntent.getIntExtra("state", -1);
    paramContext = (Context)localObject;
    if (i1 != -1)
    {
      localObject = new StringBuilder().append((String)localObject);
      if (i1 == 0)
      {
        paramContext = "unplugged";
        paramContext = paramContext;
      }
    }
    else
    {
      localObject = paramContext + " mic:";
      int i2 = paramIntent.getIntExtra("microphone", -1);
      paramContext = (Context)localObject;
      if (i2 != -1)
      {
        paramIntent = new StringBuilder().append((String)localObject);
        if (i2 != 1) {
          break label249;
        }
        paramContext = "Y";
        label160:
        paramContext = paramContext;
      }
      if (QLog.isColorLevel()) {
        QLog.w("TRAE", 2, "onHeadsetPlug:: " + paramContext);
      }
      paramContext = this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager;
      if (1 != i1) {
        break label256;
      }
    }
    label249:
    label256:
    for (boolean bool = true;; bool = false)
    {
      paramContext.a("DEVICE_WIREDHEADSET", bool);
      if (QLog.isColorLevel()) {
        QLog.w("TRAE", 2, "onHeadsetPlug exit");
      }
      return;
      paramContext = "plugged";
      break;
      paramContext = "unkown";
      break label160;
    }
  }
  
  public void a(String paramString, boolean paramBoolean)
  {
    StringBuilder localStringBuilder;
    if (this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager.a() == true) {
      if (QLog.isColorLevel())
      {
        localStringBuilder = new StringBuilder().append("checkDevicePlug got update dev:").append(paramString);
        if (!paramBoolean) {
          break label117;
        }
      }
    }
    label117:
    for (Object localObject = " piugin";; localObject = " plugout")
    {
      QLog.w("TRAE", 2, (String)localObject + " connectedDev:" + this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager.d());
      c();
      this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager.b();
      if (!paramBoolean) {
        break;
      }
      localObject = new HashMap();
      ((HashMap)localObject).put("PARAM_DEVICE", paramString);
      b(32786, (HashMap)localObject);
      return;
    }
    localObject = this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager.d();
    if ((((String)localObject).equals(paramString)) || (((String)localObject).equals("DEVICE_NONE")))
    {
      localObject = new HashMap();
      ((HashMap)localObject).put("PARAM_DEVICE", paramString);
      b(32787, (HashMap)localObject);
      return;
    }
    if (QLog.isColorLevel()) {
      QLog.w("TRAE", 2, " ---No switch,plugout:" + paramString + " connectedDev:" + (String)localObject);
    }
    b(32793, new HashMap());
  }
  
  public int b()
  {
    if (this.jdField_a_of_type_AndroidContentContext == null) {
      return -1;
    }
    Intent localIntent = new Intent();
    localIntent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_NOTIFY");
    localIntent.putExtra("PARAM_OPERATION", "NOTIFY_DEVICECHANGABLE_UPDATE");
    localIntent.putExtra("NOTIFY_DEVICECHANGABLE_UPDATE_DATE", b());
    this.jdField_a_of_type_AndroidContentContext.sendBroadcast(localIntent);
    return 0;
  }
  
  int b(int paramInt, HashMap paramHashMap)
  {
    int i1 = -1;
    if (this.jdField_a_of_type_Xqz != null) {
      i1 = this.jdField_a_of_type_Xqz.a(paramInt, paramHashMap);
    }
    return i1;
  }
  
  public int b(Context paramContext, boolean paramBoolean)
  {
    if (paramContext == null) {
      if (QLog.isColorLevel()) {
        QLog.e("TRAE", 2, "Could not InternalSetSpeaker - no context");
      }
    }
    AudioManager localAudioManager;
    do
    {
      return -1;
      localAudioManager = (AudioManager)paramContext.getSystemService("audio");
      if (localAudioManager != null) {
        break;
      }
    } while (!QLog.isColorLevel());
    QLog.e("TRAE", 2, "Could not InternalSetSpeaker - no audio manager");
    return -1;
    StringBuilder localStringBuilder;
    if (QLog.isColorLevel())
    {
      localStringBuilder = new StringBuilder().append("InternalSetSpeaker entry:speaker:");
      if (!localAudioManager.isSpeakerphoneOn()) {
        break label150;
      }
      paramContext = "Y";
      localStringBuilder = localStringBuilder.append(paramContext).append("-->:");
      if (!paramBoolean) {
        break label157;
      }
    }
    label150:
    label157:
    for (paramContext = "Y";; paramContext = "N")
    {
      QLog.w("TRAE", 2, paramContext);
      if ((!a(this.z)) || (this.w == 2)) {
        break label164;
      }
      return a(localAudioManager, paramBoolean);
      paramContext = "N";
      break;
    }
    label164:
    if (localAudioManager.isSpeakerphoneOn() != paramBoolean) {
      localAudioManager.setSpeakerphoneOn(paramBoolean);
    }
    if (localAudioManager.isSpeakerphoneOn() == paramBoolean) {}
    for (int i1 = 0;; i1 = -1)
    {
      if (QLog.isColorLevel()) {
        QLog.w("TRAE", 2, "InternalSetSpeaker exit:" + paramBoolean + " res:" + i1 + " mode:" + localAudioManager.getMode());
      }
      return i1;
    }
  }
  
  public int b(HashMap paramHashMap)
  {
    return 0;
  }
  
  public void b()
  {
    int i2 = this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager.a();
    int i1 = 0;
    if (i1 < i2)
    {
      String str = this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager.a(i1);
      boolean bool;
      if (str != null) {
        if (str.equals("DEVICE_BLUETOOTHHEADSET")) {
          if (this.jdField_a_of_type_Xqy == null) {
            bool = this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager.a(str, false);
          }
        }
      }
      for (;;)
      {
        if ((bool == true) && (QLog.isColorLevel())) {
          QLog.w("TRAE", 2, "pollUpdateDevice dev:" + str + " Visible:" + this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager.b(str));
        }
        i1 += 1;
        break;
        bool = this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager.a(str, this.jdField_a_of_type_Xqy.a());
        continue;
        if (str.equals("DEVICE_WIREDHEADSET"))
        {
          bool = this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager.a(str, this.jdField_a_of_type_AndroidMediaAudioManager.isWiredHeadsetOn());
        }
        else
        {
          if (str.equals("DEVICE_SPEAKERPHONE")) {
            this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager.a(str, true);
          }
          bool = false;
        }
      }
    }
    d();
  }
  
  boolean b()
  {
    String str = this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager.c();
    return (str == null) || (str.equals("DEVICE_NONE")) || (str.equals(""));
  }
  
  public int c(HashMap paramHashMap)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("ISDEVICECHANGABLED_REULT_ISCHANGABLED", b());
    a(localIntent, paramHashMap, 0);
    return 0;
  }
  
  void c()
  {
    if (this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager.b("DEVICE_WIREDHEADSET"))
    {
      if (QLog.isColorLevel()) {
        QLog.w("TRAE", 2, " detected headset plugin,so disable earphone");
      }
      this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager.a("DEVICE_EARPHONE", false);
      return;
    }
    if (QLog.isColorLevel()) {
      QLog.w("TRAE", 2, " detected headset plugout,so enable earphone");
    }
    this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager.a("DEVICE_EARPHONE", true);
  }
  
  public int d(HashMap paramHashMap)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("GETCONNECTEDDEVICE_REULT_LIST", this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager.d());
    a(localIntent, paramHashMap, 0);
    return 0;
  }
  
  public void d()
  {
    if (this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager.a() == true)
    {
      if (QLog.isColorLevel()) {
        QLog.w("TRAE", 2, "checkAutoDeviceListUpdate got update!");
      }
      c();
      this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager.b();
      b(32785, new HashMap());
    }
  }
  
  public int e(HashMap paramHashMap)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("GETCONNECTINGDEVICE_REULT_LIST", this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager.c());
    a(localIntent, paramHashMap, 0);
    return 0;
  }
  
  public void e()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("PARAM_DEVICE", "DEVICE_BLUETOOTHHEADSET");
    b(32792, localHashMap);
  }
  
  public void g()
  {
    AudioDeviceInterface.LogTraceEntry("");
    if (this.jdField_a_of_type_Xqz != null)
    {
      this.jdField_a_of_type_Xqz.a();
      this.jdField_a_of_type_Xqz = null;
    }
    AudioDeviceInterface.LogTraceExit();
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ((paramIntent == null) || (paramContext == null)) {
      if (QLog.isColorLevel()) {
        QLog.d("TRAE", 2, "onReceive intent or context is null!");
      }
    }
    for (;;)
    {
      return;
      try
      {
        String str2 = paramIntent.getAction();
        String str1 = paramIntent.getStringExtra("PARAM_OPERATION");
        if (QLog.isColorLevel()) {
          QLog.w("TRAE", 2, "TraeAudioManager|onReceive::Action:" + paramIntent.getAction());
        }
        if (this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager == null)
        {
          if (QLog.isColorLevel()) {
            QLog.d("TRAE", 2, "_deviceConfigManager null!");
          }
        }
        else
        {
          boolean bool1 = this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager.b("DEVICE_WIREDHEADSET");
          boolean bool2 = this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager.b("DEVICE_BLUETOOTHHEADSET");
          if ("android.intent.action.HEADSET_PLUG".equals(paramIntent.getAction()))
          {
            a(paramContext, paramIntent);
            if ((!bool1) && (this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager.b("DEVICE_WIREDHEADSET") == true)) {
              a("DEVICE_WIREDHEADSET", true);
            }
            if ((bool1 == true) && (!this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager.b("DEVICE_WIREDHEADSET"))) {
              a("DEVICE_WIREDHEADSET", false);
            }
          }
          else if (!"android.media.AUDIO_BECOMING_NOISY".equals(paramIntent.getAction()))
          {
            if ("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST".equals(str2))
            {
              if (QLog.isColorLevel()) {
                QLog.w("TRAE", 2, "   OPERATION:" + str1);
              }
              if ("OPERATION_REGISTERAUDIOSESSION".equals(str1))
              {
                a(paramIntent.getBooleanExtra("REGISTERAUDIOSESSION_ISREGISTER", false), paramIntent.getLongExtra("PARAM_SESSIONID", Long.MIN_VALUE), paramContext);
                return;
              }
              if ("OPERATION_STARTSERVICE".equals(str1))
              {
                a(str1, paramIntent.getLongExtra("PARAM_SESSIONID", Long.MIN_VALUE), false, paramIntent.getStringExtra("EXTRA_DATA_DEVICECONFIG"));
                return;
              }
              if ("OPERATION_STOPSERVICE".equals(str1))
              {
                c(str1, paramIntent.getLongExtra("PARAM_SESSIONID", Long.MIN_VALUE), false);
                return;
              }
              if ("OPERATION_GETDEVICELIST".equals(str1))
              {
                a(str1, paramIntent.getLongExtra("PARAM_SESSIONID", Long.MIN_VALUE), false);
                return;
              }
              if ("OPERATION_GETSTREAMTYPE".equals(str1))
              {
                b(str1, paramIntent.getLongExtra("PARAM_SESSIONID", Long.MIN_VALUE), false);
                return;
              }
              if ("OPERATION_CONNECTDEVICE".equals(str1))
              {
                b(str1, paramIntent.getLongExtra("PARAM_SESSIONID", Long.MIN_VALUE), false, paramIntent.getStringExtra("CONNECTDEVICE_DEVICENAME"));
                return;
              }
              if ("OPERATION_CONNECT_HIGHEST_PRIORITY_DEVICE".equals(str1))
              {
                d(str1, paramIntent.getLongExtra("PARAM_SESSIONID", Long.MIN_VALUE), false);
                return;
              }
              if ("OPERATION_EARACTION".equals(str1))
              {
                a(str1, paramIntent.getLongExtra("PARAM_SESSIONID", Long.MIN_VALUE), false, paramIntent.getIntExtra("EXTRA_EARACTION", -1));
                return;
              }
              if ("OPERATION_ISDEVICECHANGABLED".equals(str1))
              {
                e(str1, paramIntent.getLongExtra("PARAM_SESSIONID", Long.MIN_VALUE), false);
                return;
              }
              if ("OPERATION_GETCONNECTEDDEVICE".equals(str1))
              {
                f(str1, paramIntent.getLongExtra("PARAM_SESSIONID", Long.MIN_VALUE), false);
                return;
              }
              if ("OPERATION_GETCONNECTINGDEVICE".equals(str1))
              {
                g(str1, paramIntent.getLongExtra("PARAM_SESSIONID", Long.MIN_VALUE), false);
                return;
              }
              int i1;
              int i2;
              if ("OPERATION_VOICECALL_PREPROCESS".equals(str1))
              {
                i1 = paramIntent.getIntExtra("PARAM_MODEPOLICY", -1);
                i2 = paramIntent.getIntExtra("PARAM_STREAMTYPE", -1);
                a(str1, paramIntent.getLongExtra("PARAM_SESSIONID", Long.MIN_VALUE), false, i1, i2);
                return;
              }
              if ("OPERATION_VOICECALL_POSTROCESS".equals(str1))
              {
                h(str1, paramIntent.getLongExtra("PARAM_SESSIONID", Long.MIN_VALUE), false);
                return;
              }
              if ("OPERATION_VOICECALL_AUDIOPARAM_CHANGED".equals(str1))
              {
                i1 = paramIntent.getIntExtra("PARAM_MODEPOLICY", -1);
                i2 = paramIntent.getIntExtra("PARAM_STREAMTYPE", -1);
                b(str1, paramIntent.getLongExtra("PARAM_SESSIONID", Long.MIN_VALUE), false, i1, i2);
                return;
              }
              if ("OPERATION_STARTRING".equals(str1))
              {
                i1 = paramIntent.getIntExtra("PARAM_RING_DATASOURCE", -1);
                i2 = paramIntent.getIntExtra("PARAM_RING_RSID", -1);
                paramContext = (Uri)paramIntent.getParcelableExtra("PARAM_RING_URI");
                str2 = paramIntent.getStringExtra("PARAM_RING_FILEPATH");
                bool1 = paramIntent.getBooleanExtra("PARAM_RING_LOOP", false);
                String str3 = paramIntent.getStringExtra("PARAM_RING_USERDATA_STRING");
                int i3 = paramIntent.getIntExtra("PARAM_RING_LOOPCOUNT", 1);
                bool2 = paramIntent.getBooleanExtra("PARAM_RING_MODE", false);
                a(str1, paramIntent.getLongExtra("PARAM_SESSIONID", Long.MIN_VALUE), false, i1, i2, paramContext, str2, bool1, i3, str3, bool2);
                return;
              }
              if ("OPERATION_STOPRING".equals(str1)) {
                i(str1, paramIntent.getLongExtra("PARAM_SESSIONID", Long.MIN_VALUE), false);
              }
            }
            else if (this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager != null)
            {
              if (this.jdField_a_of_type_Xqy != null) {
                this.jdField_a_of_type_Xqy.a(paramContext, paramIntent, this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager);
              }
              if ((!bool2) && (this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager.b("DEVICE_BLUETOOTHHEADSET") == true)) {
                a("DEVICE_BLUETOOTHHEADSET", true);
              }
              if ((bool2 == true) && (!this.jdField_a_of_type_ComTencentSharpJniTraeAudioManager$DeviceConfigManager.b("DEVICE_BLUETOOTHHEADSET")))
              {
                a("DEVICE_BLUETOOTHHEADSET", false);
                return;
              }
            }
          }
        }
      }
      catch (Exception paramContext) {}
    }
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\sharp\jni\TraeAudioManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */