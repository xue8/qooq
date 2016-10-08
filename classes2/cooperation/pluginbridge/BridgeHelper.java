package cooperation.pluginbridge;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Xml;
import com.qq.jce.wup.BasicClassTypeUtil;
import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.ThreadManager;
import com.tencent.mobileqq.config.struct.splashproto.ConfigurationService.Config;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.PBInt32Field;
import com.tencent.mobileqq.pb.PBRepeatField;
import com.tencent.mobileqq.pluginsdk.PluginStatic;
import com.tencent.mobileqq.statistics.ReportController;
import com.tencent.mobileqq.utils.FileUtils;
import com.tencent.mobileqq.utils.SharedPreUtils;
import com.tencent.qphone.base.util.QLog;
import cooperation.plugin.IPluginManager;
import cooperation.plugin.IPluginManager.PluginParams;
import cooperation.qqwifi.QQWiFiHelper.PluginLoadDialog;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import mqq.app.AppRuntime;
import mqq.os.MqqHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import yeg;

public class BridgeHelper
  implements Runnable
{
  static final int jdField_a_of_type_Int = 1;
  private static BroadcastReceiver jdField_a_of_type_AndroidContentBroadcastReceiver;
  private static BridgeHelper jdField_a_of_type_CooperationPluginbridgeBridgeHelper;
  private static QQWiFiHelper.PluginLoadDialog jdField_a_of_type_CooperationQqwifiQQWiFiHelper$PluginLoadDialog;
  static final String jdField_a_of_type_JavaLangString = "isBridgePluginInstalled";
  private static final byte[] jdField_a_of_type_ArrayOfByte = new byte[0];
  static final int jdField_b_of_type_Int = 2;
  static final String jdField_b_of_type_JavaLangString = "distParamsString";
  static final String jdField_c_of_type_JavaLangString = "distPluginId";
  private static final int jdField_d_of_type_Int = 1;
  static final String jdField_d_of_type_JavaLangString = "distPluginName";
  private static final int jdField_e_of_type_Int = 2;
  static final String jdField_e_of_type_JavaLangString = "uin";
  static final String f = "pluginLaunchMode";
  static final String g = "BridgePlatform";
  static final String h = "start_bridge_plugin";
  public static final String i = "GeneralEntryConfigManager";
  public static final String j = "entry_config_verion_code";
  public static final String k = "entry_config_file";
  private static final String l = "BridgeHelper";
  private static final String m = "com.tencent.bridge.BridgeInterface";
  private Context jdField_a_of_type_AndroidContentContext;
  private final HashMap jdField_a_of_type_JavaUtilHashMap;
  private AtomicBoolean jdField_a_of_type_JavaUtilConcurrentAtomicAtomicBoolean = new AtomicBoolean(false);
  private boolean jdField_a_of_type_Boolean;
  private int jdField_c_of_type_Int;
  private String n;
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  private BridgeHelper(Context paramContext, String paramString)
  {
    this.jdField_a_of_type_AndroidContentContext = paramContext.getApplicationContext();
    this.n = paramString;
    this.jdField_a_of_type_JavaUtilHashMap = new HashMap();
    this.jdField_a_of_type_JavaUtilConcurrentAtomicAtomicBoolean.set(false);
  }
  
  public static BridgeHelper a(Context paramContext, String paramString)
  {
    for (;;)
    {
      try
      {
        if (QLog.isColorLevel()) {
          QLog.i("BridgeHelper", 2, "get GeneralEntryConfigManager instancegInstance:" + jdField_a_of_type_CooperationPluginbridgeBridgeHelper + "uin:" + paramString);
        }
        if (jdField_a_of_type_CooperationPluginbridgeBridgeHelper == null) {
          try
          {
            if (jdField_a_of_type_CooperationPluginbridgeBridgeHelper == null) {
              jdField_a_of_type_CooperationPluginbridgeBridgeHelper = new BridgeHelper(paramContext, paramString);
            }
            paramContext = jdField_a_of_type_CooperationPluginbridgeBridgeHelper;
            return paramContext;
          }
          finally {}
        }
        if (TextUtils.isEmpty(paramString)) {
          break label123;
        }
      }
      finally {}
      if ((!TextUtils.isEmpty(paramString)) && (!paramString.equals(jdField_a_of_type_CooperationPluginbridgeBridgeHelper.n)))
      {
        label123:
        jdField_a_of_type_CooperationPluginbridgeBridgeHelper.jdField_a_of_type_JavaUtilConcurrentAtomicAtomicBoolean.set(false);
        jdField_a_of_type_CooperationPluginbridgeBridgeHelper.jdField_a_of_type_Boolean = false;
        jdField_a_of_type_CooperationPluginbridgeBridgeHelper.n = paramString;
        jdField_a_of_type_CooperationPluginbridgeBridgeHelper.jdField_a_of_type_JavaUtilHashMap.clear();
      }
    }
  }
  
  public static AppRuntime a(BaseApplicationImpl paramBaseApplicationImpl, String paramString)
  {
    if ((paramBaseApplicationImpl == null) || (paramString == null)) {
      return null;
    }
    try
    {
      paramString = Class.forName("com.tencent.bridge.BridgeInterface");
      paramBaseApplicationImpl = paramString;
    }
    catch (ClassNotFoundException paramString)
    {
      for (;;)
      {
        paramString = PluginStatic.getOrCreateClassLoader(paramBaseApplicationImpl, "BridgePlugin.apk");
        paramBaseApplicationImpl = paramString.loadClass("com.tencent.bridge.BridgeInterface");
        BasicClassTypeUtil.setClassLoader(true, paramString);
      }
    }
    catch (Exception paramBaseApplicationImpl)
    {
      if (!QLog.isColorLevel()) {
        break label97;
      }
      QLog.e("BridgeHelper", 2, "*createBridgeAppInterface exception:" + paramBaseApplicationImpl.toString());
      label97:
      return null;
    }
    if (paramBaseApplicationImpl == null)
    {
      if (QLog.isColorLevel()) {
        QLog.e("BridgeHelper", 2, "*createBridgeAppInterface load class fail");
      }
    }
    else
    {
      do
      {
        paramBaseApplicationImpl = paramBaseApplicationImpl.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
      } while ((paramBaseApplicationImpl == null) || (!(paramBaseApplicationImpl instanceof AppRuntime)));
      paramBaseApplicationImpl = (AppRuntime)paramBaseApplicationImpl;
      return paramBaseApplicationImpl;
    }
    return null;
  }
  
  public static void a(Activity paramActivity, QQAppInterface paramQQAppInterface, Intent paramIntent, String paramString1, String paramString2, String paramString3)
  {
    if ((paramActivity != null) && (paramQQAppInterface != null))
    {
      if (((IPluginManager)paramQQAppInterface.getManager(26)).isPlugininstalled("BridgePlugin.apk")) {
        b(paramActivity, paramQQAppInterface, paramIntent, paramString1, paramString2, paramString3);
      }
    }
    else {
      return;
    }
    if (paramIntent == null) {
      paramIntent = new Intent(paramActivity, BridgePluginInstallActivity.class);
    }
    for (;;)
    {
      paramIntent.putExtra("distParamsString", paramString1);
      paramIntent.putExtra("distPluginId", paramString2);
      paramIntent.putExtra("distPluginName", paramString3);
      paramActivity.startActivity(paramIntent);
      return;
      paramIntent.setClass(paramActivity, BridgePluginInstallActivity.class);
    }
  }
  
  static void a(Context paramContext)
  {
    if (jdField_a_of_type_AndroidContentBroadcastReceiver == null) {
      jdField_a_of_type_AndroidContentBroadcastReceiver = new yeg(null);
    }
    IntentFilter localIntentFilter = new IntentFilter("bridge.onresume.broadcast");
    localIntentFilter.addAction("bridge.plugin.onresume.broadcast");
    paramContext.registerReceiver(jdField_a_of_type_AndroidContentBroadcastReceiver, localIntentFilter);
  }
  
  public static boolean a(String paramString1, String paramString2, Context paramContext)
  {
    paramString1 = "pluginLaunchMode_" + paramString1;
    paramString1 = a(paramContext, paramString2).a(paramString1);
    if (paramString1 != null) {
      return paramString1.equals("1");
    }
    return false;
  }
  
  static void b(Activity paramActivity, QQAppInterface paramQQAppInterface, Intent paramIntent, String paramString1, String paramString2, String paramString3)
  {
    Intent localIntent = paramIntent;
    if (paramIntent == null) {
      localIntent = new Intent();
    }
    localIntent.putExtra("param_plugin_gesturelock", true);
    localIntent.putExtra("userQqResources", -1);
    localIntent.putExtra("useSkinEngine", true);
    paramIntent = new IPluginManager.PluginParams(1);
    paramIntent.jdField_b_of_type_JavaLangString = "BridgePlugin.apk";
    paramIntent.d = "BridgePlugin";
    if (jdField_a_of_type_CooperationQqwifiQQWiFiHelper$PluginLoadDialog == null) {
      jdField_a_of_type_CooperationQqwifiQQWiFiHelper$PluginLoadDialog = new QQWiFiHelper.PluginLoadDialog(paramActivity, paramString3);
    }
    paramIntent.jdField_a_of_type_AndroidAppDialog = jdField_a_of_type_CooperationQqwifiQQWiFiHelper$PluginLoadDialog;
    paramIntent.jdField_a_of_type_JavaLangString = paramQQAppInterface.a();
    localIntent.putExtra("distParamsString", paramString1);
    localIntent.putExtra("distPluginId", paramString2);
    localIntent.putExtra("distPluginName", paramString3);
    paramIntent.jdField_a_of_type_AndroidContentIntent = localIntent;
    paramIntent.e = "com.tencent.bridge.activity.BridgeMainActivity";
    paramIntent.jdField_a_of_type_JavaLangClass = MainBridgeProxyActivity.class;
    paramIntent.jdField_b_of_type_Int = 19;
    paramIntent.c = 15000;
    paramIntent.jdField_a_of_type_Boolean = false;
    paramIntent.f = null;
    a(paramActivity);
    IPluginManager.a(paramActivity, paramIntent);
    ReportController.b(paramQQAppInterface, "P_CliOper", "BridgePlatform", "", "start_bridge_plugin", "BridgePlugin.apk", 0, 1, "", "", "", "");
  }
  
  public String a(String paramString)
  {
    a();
    return (String)this.jdField_a_of_type_JavaUtilHashMap.get(paramString);
  }
  
  public void a()
  {
    if ((!this.jdField_a_of_type_JavaUtilConcurrentAtomicAtomicBoolean.get()) && (!this.jdField_a_of_type_Boolean))
    {
      this.jdField_a_of_type_Boolean = true;
      this.c = 2;
      ThreadManager.a().post(jdField_a_of_type_CooperationPluginbridgeBridgeHelper);
    }
  }
  
  public void a(ConfigurationService.Config paramConfig)
  {
    if (paramConfig.version != null)
    {
      if (QLog.isColorLevel()) {
        QLog.d("SPLASH_ConfigServlet", 2, "receiveAllConfigs|type: 13,version: " + paramConfig.version.get());
      }
      SharedPreUtils.a(this.jdField_a_of_type_AndroidContentContext, paramConfig.version.get(), this.n);
    }
    if (paramConfig.content_list != null) {
      break label218;
    }
    synchronized (jdField_a_of_type_ArrayOfByte)
    {
      this.jdField_a_of_type_JavaUtilHashMap.clear();
      this.jdField_a_of_type_JavaUtilConcurrentAtomicAtomicBoolean.set(true);
      paramConfig = paramConfig.content_list.get();
      if ((paramConfig == null) || (paramConfig.size() == 0))
      {
        if (QLog.isColorLevel()) {
          QLog.d("SPLASH_ConfigServlet", 2, "receiveAllConfigs|type: 13,content_list is empty ");
        }
        paramConfig = new File(this.jdField_a_of_type_AndroidContentContext.getFilesDir(), "entry_config_file_" + this.n);
        if (paramConfig.exists()) {
          paramConfig.delete();
        }
        label181:
        ThreadManager.a().removeCallbacks(jdField_a_of_type_CooperationPluginbridgeBridgeHelper);
        this.c = 1;
        ThreadManager.a().post(jdField_a_of_type_CooperationPluginbridgeBridgeHelper);
        return;
      }
    }
    Iterator localIterator = paramConfig.iterator();
    label218:
    XmlPullParser localXmlPullParser;
    while (localIterator.hasNext())
    {
      paramConfig = (String)localIterator.next();
      if (QLog.isColorLevel()) {
        QLog.d("SPLASH_ConfigServlet", 2, "receiveAllConfigs|type: 13,content: " + paramConfig);
      }
      if (!TextUtils.isEmpty(paramConfig)) {
        localXmlPullParser = Xml.newPullParser();
      }
    }
    for (;;)
    {
      try
      {
        localXmlPullParser.setInput(new ByteArrayInputStream(paramConfig.getBytes()), "UTF-8");
        i1 = localXmlPullParser.getEventType();
        paramConfig = "";
      }
      catch (XmlPullParserException paramConfig)
      {
        synchronized (jdField_a_of_type_ArrayOfByte)
        {
          String str1;
          String str2;
          this.jdField_a_of_type_JavaUtilHashMap.put(str1, str2);
          ??? = paramConfig;
          if (!QLog.isColorLevel()) {
            continue;
          }
          QLog.i("BridgeHelper", 2, "config put. " + str1 + " : " + str2);
          ??? = paramConfig;
          continue;
          paramConfig = paramConfig;
          paramConfig.printStackTrace();
        }
      }
      catch (IOException paramConfig)
      {
        paramConfig.printStackTrace();
      }
      int i1 = localXmlPullParser.next();
      paramConfig = (ConfigurationService.Config)???;
      if (localXmlPullParser.getDepth() == 2)
      {
        ??? = localXmlPullParser.getName();
      }
      else
      {
        ??? = paramConfig;
        if (localXmlPullParser.getDepth() == 3)
        {
          ??? = localXmlPullParser.getName();
          localXmlPullParser.next();
          str1 = paramConfig + "_" + (String)???;
          str2 = localXmlPullParser.getText();
          break label218;
          break label181;
          if (i1 == 1) {
            break;
          }
          switch (i1)
          {
          }
          ??? = paramConfig;
        }
      }
    }
  }
  
  public void run()
  {
    if (this.c == 1)
    {
      if (QLog.isColorLevel()) {
        QLog.w("BridgeHelper", 2, "Write configContent to file: " + this.jdField_a_of_type_JavaUtilHashMap);
      }
      ??? = new ByteArrayOutputStream();
    }
    for (;;)
    {
      try
      {
        ObjectOutputStream localObjectOutputStream = new ObjectOutputStream((OutputStream)???);
        localObjectOutputStream.writeObject(this.jdField_a_of_type_JavaUtilHashMap);
        localObjectOutputStream.close();
        ((ByteArrayOutputStream)???).close();
        FileUtils.a(new File(this.jdField_a_of_type_AndroidContentContext.getFilesDir(), "entry_config_file_" + this.n).getAbsolutePath(), ((ByteArrayOutputStream)???).toByteArray(), false);
        return;
      }
      catch (IOException localIOException)
      {
        if (!QLog.isColorLevel()) {
          continue;
        }
        QLog.e("BridgeHelper", 2, "Exception happened while construct ObjectOutputStream. ", localIOException);
        continue;
      }
      if (this.c != 2) {
        continue;
      }
      if (QLog.isColorLevel()) {
        QLog.w("BridgeHelper", 2, "Read configContent from file.");
      }
      ??? = new File(this.jdField_a_of_type_AndroidContentContext.getFilesDir(), "entry_config_file_" + this.n);
      if ((??? != null) && (((File)???).exists()))
      {
        ??? = FileUtils.a((File)???);
        if (??? != null) {
          ??? = new ByteArrayInputStream((byte[])???);
        }
      }
      for (;;)
      {
        try
        {
          localObject2 = new ObjectInputStream((InputStream)???).readObject();
          if ((this.jdField_a_of_type_JavaUtilConcurrentAtomicAtomicBoolean.get()) || (!(localObject2 instanceof HashMap))) {}
        }
        catch (Exception localException)
        {
          Object localObject2;
          if (!QLog.isColorLevel()) {
            continue;
          }
          QLog.e("BridgeHelper", 2, "Exception happened while construct ObjectInputStream. ", localException);
          continue;
        }
        synchronized (jdField_a_of_type_ArrayOfByte)
        {
          this.jdField_a_of_type_JavaUtilHashMap.clear();
          this.jdField_a_of_type_JavaUtilHashMap.putAll((HashMap)localObject2);
          if (!QLog.isColorLevel()) {
            break;
          }
          QLog.i("BridgeHelper", 2, "configContent: " + this.jdField_a_of_type_JavaUtilHashMap.toString());
          return;
        }
      }
    }
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\cooperation\pluginbridge\BridgeHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */