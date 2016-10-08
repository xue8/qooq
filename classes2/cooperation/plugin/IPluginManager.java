package cooperation.plugin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.Toast;
import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.ThreadManager;
import com.tencent.mobileqq.hitrate.PreloadProcHitMgr;
import com.tencent.mobileqq.hitrate.PreloadProcHitPluginSession;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pluginsdk.OnPluginInstallListener;
import com.tencent.mobileqq.pluginsdk.PluginBaseInfo;
import com.tencent.mobileqq.pluginsdk.PluginManagerClient;
import com.tencent.mobileqq.pluginsdk.PluginManagerHelper;
import com.tencent.mobileqq.pluginsdk.PluginManagerHelper.OnPluginManagerLoadedListener;
import com.tencent.mobileqq.pluginsdk.PluginProxyActivity;
import com.tencent.mobileqq.pluginsdk.PluginProxyBroadcastReceiver;
import com.tencent.mobileqq.pluginsdk.PluginProxyService;
import com.tencent.mobileqq.pluginsdk.RemotePluginManager.Stub;
import com.tencent.mobileqq.pluginsdk.SplashDialogWrapper;
import com.tencent.mobileqq.pluginsdk.ipc.PluginCommunicationHandler;
import com.tencent.mobileqq.pluginsdk.ipc.RemoteCommand;
import com.tencent.mobileqq.statistics.PluginStatisticsCollector;
import com.tencent.mobileqq.widget.QzoneProgressDialog;
import com.tencent.qphone.base.util.QLog;
import java.io.File;
import java.util.List;
import mqq.app.AppRuntime;
import mqq.manager.Manager;
import ydm;
import ydn;
import ydo;
import ydp;
import ydq;
import ydr;

public abstract class IPluginManager
  extends RemotePluginManager.Stub
  implements Manager
{
  public static final int a = 950604;
  private static volatile PluginManagerClient jdField_a_of_type_ComTencentMobileqqPluginsdkPluginManagerClient;
  private static PluginManagerHelper.OnPluginManagerLoadedListener jdField_a_of_type_ComTencentMobileqqPluginsdkPluginManagerHelper$OnPluginManagerLoadedListener;
  public static final boolean a = true;
  
  public IPluginManager()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public static IPluginManager a(QQAppInterface paramQQAppInterface)
  {
    return new PluginManagerV2(paramQQAppInterface);
  }
  
  static File a(Context paramContext)
  {
    return paramContext.getDir("", 0);
  }
  
  public static void a(Activity paramActivity, IPluginManager.PluginParams paramPluginParams)
  {
    if (paramPluginParams.f != null)
    {
      localObject = Toast.makeText(BaseApplicationImpl.getContext(), paramPluginParams.f, 0);
      ((Toast)localObject).setGravity(17, 0, 0);
      ((Toast)localObject).show();
    }
    Object localObject = new ydm();
    if ((paramPluginParams.jdField_a_of_type_AndroidAppDialog != null) && (!paramActivity.isFinishing())) {
      new SplashDialogWrapper(paramActivity, paramPluginParams.jdField_a_of_type_AndroidAppDialog, paramPluginParams.d, paramPluginParams.jdField_b_of_type_JavaLangString, paramPluginParams.jdField_a_of_type_Boolean, paramPluginParams.jdField_c_of_type_Int).show();
    }
    if (paramPluginParams.jdField_a_of_type_ComTencentMobileqqHitratePreloadProcHitPluginSession != null) {
      if (TextUtils.equals(paramPluginParams.jdField_a_of_type_ComTencentMobileqqHitratePreloadProcHitPluginSession.jdField_a_of_type_JavaLangString, paramPluginParams.jdField_b_of_type_JavaLangString))
      {
        paramPluginParams.jdField_a_of_type_ComTencentMobileqqHitratePreloadProcHitPluginSession.b();
        paramPluginParams.jdField_a_of_type_ComTencentMobileqqHitratePreloadProcHitPluginSession.d();
      }
    }
    AppRuntime localAppRuntime;
    for (;;)
    {
      localAppRuntime = BaseApplicationImpl.a.a();
      if ((localAppRuntime instanceof QQAppInterface)) {
        break;
      }
      c(paramActivity, paramPluginParams, (IPluginManager.OnPluginReadyListener)localObject);
      return;
      PreloadProcHitMgr.a(paramPluginParams.jdField_b_of_type_JavaLangString);
    }
    ((IPluginManager)((QQAppInterface)localAppRuntime).getManager(26)).a(paramActivity, paramPluginParams, (IPluginManager.OnPluginReadyListener)localObject);
  }
  
  public static void a(Context paramContext, IPluginManager.PluginParams paramPluginParams)
  {
    ydp localydp = new ydp();
    if (paramPluginParams.jdField_a_of_type_ComTencentMobileqqHitratePreloadProcHitPluginSession != null) {
      paramPluginParams.jdField_a_of_type_ComTencentMobileqqHitratePreloadProcHitPluginSession.a();
    }
    AppRuntime localAppRuntime = BaseApplicationImpl.a.a();
    if (!(localAppRuntime instanceof QQAppInterface))
    {
      c(paramContext, paramPluginParams, localydp);
      return;
    }
    ((IPluginManager)((QQAppInterface)localAppRuntime).getManager(26)).a(paramContext, paramPluginParams, localydp);
  }
  
  public static void a(String paramString1, String paramString2)
  {
    if (paramString1 != null)
    {
      paramString1 = paramString1.toLowerCase();
      if ((paramString1.contains("空间")) || (paramString1.contains("space"))) {
        Toast.makeText(BaseApplicationImpl.getContext(), "系统可用内存不足，" + paramString2 + "启动失败!", 0).show();
      }
    }
    else
    {
      return;
    }
    Toast.makeText(BaseApplicationImpl.getContext(), paramString2 + "启动失败!", 0).show();
  }
  
  static void a(List paramList)
  {
    if ((paramList != null) && (!paramList.isEmpty()))
    {
      PluginCommunicationHandler localPluginCommunicationHandler = PluginCommunicationHandler.getInstance();
      int j = paramList.size();
      int i = 0;
      while (i < j)
      {
        RemoteCommand localRemoteCommand = (RemoteCommand)paramList.get(i);
        if ((localRemoteCommand != null) && (!localPluginCommunicationHandler.containsCmd(localRemoteCommand.getCmd()))) {
          localPluginCommunicationHandler.register((RemoteCommand)paramList.get(i));
        }
        i += 1;
      }
    }
  }
  
  public static void b(Activity paramActivity, IPluginManager.PluginParams paramPluginParams)
  {
    if (paramActivity == null) {}
    do
    {
      return;
      a(paramPluginParams.jdField_a_of_type_JavaUtilList);
      paramPluginParams.jdField_a_of_type_AndroidContentIntent.setClass(paramActivity, paramPluginParams.jdField_a_of_type_JavaLangClass);
      if (TextUtils.isEmpty(paramPluginParams.jdField_a_of_type_AndroidContentIntent.getStringExtra("uin")))
      {
        paramPluginParams.jdField_a_of_type_AndroidContentIntent.putExtra("uin", paramPluginParams.jdField_a_of_type_JavaLangString);
        paramPluginParams.jdField_a_of_type_AndroidContentIntent.putExtra("qzone_uin", paramPluginParams.jdField_a_of_type_JavaLangString);
      }
      paramPluginParams.jdField_a_of_type_AndroidContentIntent.putExtra("pluginsdk_selfuin", paramPluginParams.jdField_a_of_type_JavaLangString);
      paramPluginParams.jdField_a_of_type_AndroidContentIntent.putExtra("clsUploader", PluginStatisticsCollector.class.getName());
      if (QLog.isColorLevel()) {
        QLog.d("plugin_tag", 2, "doOpenActivityForResult do start activity");
      }
      PluginProxyActivity.openActivityForResult(paramActivity, paramPluginParams.d, paramPluginParams.jdField_b_of_type_JavaLangString, paramPluginParams.jdField_c_of_type_JavaLangString, paramPluginParams.e, paramPluginParams.jdField_a_of_type_AndroidContentIntent, paramPluginParams.jdField_b_of_type_Int);
    } while ((paramPluginParams.jdField_a_of_type_AndroidAppDialog == null) || (!(paramPluginParams.jdField_a_of_type_AndroidAppDialog instanceof QzoneProgressDialog)));
    paramActivity.overridePendingTransition(2130968662, 2130968662);
  }
  
  public static void b(Context paramContext, IPluginManager.PluginParams paramPluginParams)
  {
    ydq localydq = new ydq();
    if (paramPluginParams.jdField_a_of_type_ComTencentMobileqqHitratePreloadProcHitPluginSession != null) {
      paramPluginParams.jdField_a_of_type_ComTencentMobileqqHitratePreloadProcHitPluginSession.a();
    }
    AppRuntime localAppRuntime = BaseApplicationImpl.a.a();
    if (!(localAppRuntime instanceof QQAppInterface))
    {
      c(paramContext, paramPluginParams, localydq);
      return;
    }
    ((IPluginManager)((QQAppInterface)localAppRuntime).getManager(26)).a(paramContext, paramPluginParams, localydq);
  }
  
  public static void c(Context paramContext, IPluginManager.PluginParams paramPluginParams)
  {
    a(paramPluginParams.jdField_a_of_type_JavaUtilList);
    if ((TextUtils.isEmpty(paramPluginParams.jdField_a_of_type_AndroidContentIntent.getStringExtra("uin"))) && (!TextUtils.isEmpty(paramPluginParams.jdField_a_of_type_JavaLangString)))
    {
      paramPluginParams.jdField_a_of_type_AndroidContentIntent.putExtra("uin", paramPluginParams.jdField_a_of_type_JavaLangString);
      paramPluginParams.jdField_a_of_type_AndroidContentIntent.putExtra("qzone_uin", paramPluginParams.jdField_a_of_type_JavaLangString);
    }
    paramPluginParams.jdField_a_of_type_AndroidContentIntent.putExtra("pluginsdk_selfuin", paramPluginParams.jdField_a_of_type_JavaLangString);
    paramPluginParams.jdField_a_of_type_AndroidContentIntent.putExtra("clsUploader", PluginStatisticsCollector.class.getName());
    PluginProxyBroadcastReceiver.sendBroadcastReceiver(paramContext, paramPluginParams.d, paramPluginParams.jdField_b_of_type_JavaLangString, paramPluginParams.jdField_c_of_type_JavaLangString, paramPluginParams.e, paramPluginParams.jdField_a_of_type_AndroidContentIntent);
  }
  
  private static void c(Context paramContext, IPluginManager.PluginParams paramPluginParams, IPluginManager.OnPluginReadyListener paramOnPluginReadyListener)
  {
    if (jdField_a_of_type_ComTencentMobileqqPluginsdkPluginManagerHelper$OnPluginManagerLoadedListener != null) {
      return;
    }
    if ((jdField_a_of_type_ComTencentMobileqqPluginsdkPluginManagerClient == null) || (!jdField_a_of_type_ComTencentMobileqqPluginsdkPluginManagerClient.useful()))
    {
      jdField_a_of_type_ComTencentMobileqqPluginsdkPluginManagerHelper$OnPluginManagerLoadedListener = new ydn(paramContext, paramPluginParams, paramOnPluginReadyListener);
      PluginManagerHelper.getPluginInterface(paramContext, jdField_a_of_type_ComTencentMobileqqPluginsdkPluginManagerHelper$OnPluginManagerLoadedListener);
      return;
    }
    d(paramContext, paramPluginParams, paramOnPluginReadyListener);
  }
  
  public static void d(Context paramContext, IPluginManager.PluginParams paramPluginParams)
  {
    a(paramPluginParams.jdField_a_of_type_JavaUtilList);
    if ((TextUtils.isEmpty(paramPluginParams.jdField_a_of_type_AndroidContentIntent.getStringExtra("uin"))) && (!TextUtils.isEmpty(paramPluginParams.jdField_a_of_type_JavaLangString)))
    {
      paramPluginParams.jdField_a_of_type_AndroidContentIntent.putExtra("uin", paramPluginParams.jdField_a_of_type_JavaLangString);
      paramPluginParams.jdField_a_of_type_AndroidContentIntent.putExtra("qzone_uin", paramPluginParams.jdField_a_of_type_JavaLangString);
    }
    paramPluginParams.jdField_a_of_type_AndroidContentIntent.putExtra("pluginsdk_selfuin", paramPluginParams.jdField_a_of_type_JavaLangString);
    paramPluginParams.jdField_a_of_type_AndroidContentIntent.putExtra("clsUploader", PluginStatisticsCollector.class.getName());
    if (paramPluginParams.jdField_a_of_type_AndroidContentServiceConnection != null)
    {
      PluginProxyService.bindService(paramContext, paramPluginParams.d, paramPluginParams.jdField_b_of_type_JavaLangString, paramPluginParams.jdField_c_of_type_JavaLangString, paramPluginParams.e, paramPluginParams.jdField_a_of_type_AndroidContentIntent, paramPluginParams.jdField_a_of_type_AndroidContentServiceConnection);
      return;
    }
    ThreadManager.a(new ydr(paramContext, paramPluginParams), 5, null, false);
  }
  
  private static void d(Context paramContext, IPluginManager.PluginParams paramPluginParams, IPluginManager.OnPluginReadyListener paramOnPluginReadyListener)
  {
    if (jdField_a_of_type_ComTencentMobileqqPluginsdkPluginManagerClient == null) {
      paramOnPluginReadyListener.a(false, paramContext, paramPluginParams);
    }
    PluginBaseInfo localPluginBaseInfo;
    do
    {
      return;
      localPluginBaseInfo = jdField_a_of_type_ComTencentMobileqqPluginsdkPluginManagerClient.queryPlugin(paramPluginParams.jdField_b_of_type_JavaLangString);
      if ((localPluginBaseInfo == null) || (localPluginBaseInfo.mState != 4)) {
        break;
      }
    } while (paramOnPluginReadyListener == null);
    paramPluginParams.jdField_c_of_type_JavaLangString = localPluginBaseInfo.mInstalledPath;
    paramOnPluginReadyListener.a(true, paramContext, paramPluginParams);
    return;
    if (QLog.isDevelopLevel())
    {
      QLog.i("plugin_tag", 4, "doHandleOtherProcess: " + jdField_a_of_type_ComTencentMobileqqPluginsdkPluginManagerClient.useful());
      QLog.i("plugin_tag", 4, "doHandleOtherProcess isPluginInstalled false");
    }
    jdField_a_of_type_ComTencentMobileqqPluginsdkPluginManagerClient.installPlugin(paramPluginParams.jdField_b_of_type_JavaLangString, new ydo(paramOnPluginReadyListener, paramPluginParams, paramContext));
  }
  
  public abstract PluginInfo a(String paramString);
  
  public abstract void a();
  
  public abstract void a(Context paramContext, IPluginManager.PluginParams paramPluginParams, IPluginManager.OnPluginReadyListener paramOnPluginReadyListener);
  
  public abstract void a(String paramString);
  
  public abstract void a(String paramString, boolean paramBoolean, OnPluginInstallListener paramOnPluginInstallListener);
  
  public abstract boolean a(String paramString, IPluginManager.OnQueryPluginListener paramOnQueryPluginListener);
  
  public abstract void cancelInstall(String paramString);
  
  public abstract void installPlugin(String paramString, OnPluginInstallListener paramOnPluginInstallListener);
  
  public abstract boolean isPlugininstalled(String paramString);
  
  public abstract boolean isReady();
  
  public abstract void onDestroy();
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\cooperation\plugin\IPluginManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */