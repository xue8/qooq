package cooperation.photoplus;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler.Callback;
import android.os.Message;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.image.URLDrawable;
import com.tencent.mobileqq.app.IphoneTitleBarActivity;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pluginsdk.PluginBaseInfo;
import com.tencent.mobileqq.pluginsdk.PluginManagerClient;
import com.tencent.mobileqq.pluginsdk.PluginManagerHelper;
import com.tencent.mobileqq.pluginsdk.PluginManagerHelper.OnPluginManagerLoadedListener;
import com.tencent.mobileqq.utils.NetworkUtil;
import com.tencent.qphone.base.util.QLog;
import com.tencent.util.MqqWeakReferenceHandler;
import java.io.File;
import java.math.BigDecimal;
import ydi;

public class PhotoPlusBridgeActivity
  extends IphoneTitleBarActivity
  implements Handler.Callback, PluginManagerHelper.OnPluginManagerLoadedListener
{
  public static final int a = 100003;
  public static final String a = "photo_path";
  private static final int b = 400;
  public static final String b = "iswaitforsult";
  private static final int c = 1000;
  public static final String c = "type";
  private static final int d = 1001;
  public static final String d = "uin";
  private static final int e = 1002;
  public static final String e = "nick";
  private static final int f = 1003;
  public static final String f = "headDir";
  private static final int jdField_g_of_type_Int = 1004;
  private static final String jdField_g_of_type_JavaLangString = "Photoplus.apk";
  private static final int jdField_h_of_type_Int = 90;
  private static final String jdField_h_of_type_JavaLangString = "Photoplus.jpg";
  private static final int jdField_i_of_type_Int = 99;
  private static String m = "http://dldir1.qq.com/invc/zebra/imgs/photoplus_dowding_img.jpg";
  private static final String n = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + "tencent" + File.separator + "zebrasdk" + File.separator;
  private long jdField_a_of_type_Long;
  private Intent jdField_a_of_type_AndroidContentIntent;
  private ImageView jdField_a_of_type_AndroidWidgetImageView;
  private ProgressBar jdField_a_of_type_AndroidWidgetProgressBar;
  private TextView jdField_a_of_type_AndroidWidgetTextView;
  private PluginManagerClient jdField_a_of_type_ComTencentMobileqqPluginsdkPluginManagerClient;
  private MqqWeakReferenceHandler jdField_a_of_type_ComTencentUtilMqqWeakReferenceHandler;
  private boolean jdField_a_of_type_Boolean;
  private String jdField_i_of_type_JavaLangString;
  private int jdField_j_of_type_Int;
  private String jdField_j_of_type_JavaLangString;
  private String k;
  private String l;
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  private String a(int paramInt)
  {
    Object localObject = "20秒";
    float f1;
    if (paramInt != 0)
    {
      f1 = (float)((System.currentTimeMillis() - this.jdField_a_of_type_Long) / 1000L) / paramInt * (100 - paramInt);
      if (f1 > 60.0F) {
        localObject = "1分钟";
      }
    }
    else
    {
      return (String)localObject;
    }
    try
    {
      localObject = new BigDecimal(f1).setScale(1, 4);
      localObject = localObject + "秒";
      return (String)localObject;
    }
    catch (Exception localException) {}
    return String.format("%.1f秒", tmp86_83);
  }
  
  private void a(int paramInt)
  {
    if (QLog.isDevelopLevel()) {
      QLog.d("IphoneTitleBarActivity", 4, "[PhotoPlusBridgeActivity] [finishAndResult] begin!");
    }
    setResult(paramInt, this.jdField_a_of_type_AndroidContentIntent);
    finish();
  }
  
  private void b()
  {
    if (QLog.isDevelopLevel()) {
      QLog.d("IphoneTitleBarActivity", 4, "[PhotoPlusBridgeActivity] [initUI] start!");
    }
    setTitle("图片编辑");
    this.jdField_a_of_type_AndroidWidgetProgressBar = ((ProgressBar)findViewById(2131298649));
    this.jdField_a_of_type_AndroidWidgetTextView = ((TextView)findViewById(2131298648));
    this.jdField_a_of_type_AndroidWidgetImageView = ((ImageView)findViewById(2131298650));
    File localFile = new File(n + "Photoplus.jpg");
    if (localFile.exists())
    {
      if (QLog.isDevelopLevel()) {
        QLog.d("IphoneTitleBarActivity", 4, "[PhotoPlusBridgeActivity] [initUI] intro pic exists!" + localFile.getAbsolutePath());
      }
      this.jdField_a_of_type_ComTencentUtilMqqWeakReferenceHandler.obtainMessage(1004).sendToTarget();
    }
    for (;;)
    {
      if (QLog.isDevelopLevel()) {
        QLog.d("IphoneTitleBarActivity", 4, "[PhotoPlusBridgeActivity] [initUI] end!");
      }
      return;
      if (QLog.isDevelopLevel()) {
        QLog.d("IphoneTitleBarActivity", 4, "[PhotoPlusBridgeActivity] [initUI] intro pic not exists!");
      }
      a();
    }
  }
  
  public void a()
  {
    new Thread(new ydi(this)).start();
  }
  
  public void a(String paramString, PluginBaseInfo paramPluginBaseInfo)
  {
    if (paramPluginBaseInfo == null)
    {
      if (!this.jdField_a_of_type_ComTencentMobileqqPluginsdkPluginManagerClient.isReady()) {
        this.jdField_a_of_type_ComTencentUtilMqqWeakReferenceHandler.sendEmptyMessageDelayed(1001, 400L);
      }
      return;
    }
    switch (paramPluginBaseInfo.mState)
    {
    case -1: 
    default: 
      return;
    case -2: 
      if (QLog.isDevelopLevel()) {
        QLog.d("IphoneTitleBarActivity", 4, "[PhotoPlusBridgeActivity] [handlePluginInfo] PluginInfo.STATE_ERROR!");
      }
      this.jdField_a_of_type_ComTencentUtilMqqWeakReferenceHandler.sendEmptyMessage(1003);
      return;
    case 0: 
      if (QLog.isDevelopLevel()) {
        QLog.d("IphoneTitleBarActivity", 4, "[PhotoPlusBridgeActivity] [handlePluginInfo] PluginInfo.STATE_NODOWNLOAD!");
      }
      this.jdField_a_of_type_ComTencentMobileqqPluginsdkPluginManagerClient.installPlugin("Photoplus.apk");
    case 1: 
      if (QLog.isDevelopLevel()) {
        QLog.d("IphoneTitleBarActivity", 4, "[PhotoPlusBridgeActivity] [handlePluginInfo] PluginInfo.STATE_DOWNLOADING!");
      }
    case 2: 
      if (QLog.isDevelopLevel()) {
        QLog.d("IphoneTitleBarActivity", 4, "[PhotoPlusBridgeActivity] [handlePluginInfo] PluginInfo.STATE_DOWNLOADED!");
      }
      int i1 = (int)(paramPluginBaseInfo.mDownloadProgress * 90.0F);
      this.jdField_a_of_type_ComTencentUtilMqqWeakReferenceHandler.obtainMessage(1000, i1, 0).sendToTarget();
      this.jdField_a_of_type_ComTencentUtilMqqWeakReferenceHandler.sendEmptyMessageDelayed(1001, 400L);
      return;
    case 3: 
      if (QLog.isDevelopLevel()) {
        QLog.d("IphoneTitleBarActivity", 4, "[PhotoPlusBridgeActivity] [handlePluginInfo] PluginInfo.STATE_INSTALLING!");
      }
      this.jdField_a_of_type_ComTencentUtilMqqWeakReferenceHandler.sendEmptyMessage(1002);
      this.jdField_a_of_type_ComTencentUtilMqqWeakReferenceHandler.sendEmptyMessageDelayed(1001, 400L);
      return;
    }
    if (QLog.isDevelopLevel()) {
      QLog.d("IphoneTitleBarActivity", 4, "[PhotoPlusBridgeActivity] [handlePluginInfo] PluginInfo.STATE_INSTALLED!");
    }
    a(-1);
  }
  
  public boolean doOnCreate(Bundle paramBundle)
  {
    super.doOnCreate(paramBundle);
    getWindow().setBackgroundDrawableResource(2131427379);
    this.jdField_a_of_type_ComTencentUtilMqqWeakReferenceHandler = new MqqWeakReferenceHandler(this);
    PluginManagerHelper.getPluginInterface(this, this);
    this.jdField_a_of_type_Long = System.currentTimeMillis();
    this.jdField_a_of_type_AndroidContentIntent = getIntent();
    this.i = this.jdField_a_of_type_AndroidContentIntent.getStringExtra("photo_path");
    this.jdField_a_of_type_Boolean = this.jdField_a_of_type_AndroidContentIntent.getBooleanExtra("iswaitforsult", false);
    this.jdField_j_of_type_Int = this.jdField_a_of_type_AndroidContentIntent.getIntExtra("type", 0);
    this.jdField_j_of_type_JavaLangString = this.jdField_a_of_type_AndroidContentIntent.getStringExtra("uin");
    this.k = this.jdField_a_of_type_AndroidContentIntent.getStringExtra("nick");
    this.l = this.jdField_a_of_type_AndroidContentIntent.getStringExtra("headDir");
    paramBundle = (PhotoPlusManager)this.app.getManager(168);
    if (NetworkUtil.a(BaseApplicationImpl.a()) == 1) {
      if (QLog.isColorLevel()) {
        QLog.d("IphoneTitleBarActivity", 2, "[onCreate] update sticker resource");
      }
    }
    try
    {
      paramBundle.a(false);
      return true;
    }
    catch (Throwable paramBundle)
    {
      while (!QLog.isColorLevel()) {}
      QLog.d("IphoneTitleBarActivity", 2, "[onCreate]", paramBundle);
    }
    return true;
  }
  
  public void doOnDestroy()
  {
    super.doOnDestroy();
    this.jdField_a_of_type_ComTencentUtilMqqWeakReferenceHandler.removeMessages(1001);
    if (this.jdField_a_of_type_ComTencentMobileqqPluginsdkPluginManagerClient != null) {}
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    int i1 = 99;
    switch (paramMessage.what)
    {
    }
    for (;;)
    {
      return true;
      if (QLog.isDevelopLevel()) {
        QLog.d("IphoneTitleBarActivity", 4, "[PhotoPlusBridgeActivity] [handleMessage] ACTION_UPDATE_PROGRESS!");
      }
      i1 = paramMessage.arg1;
      this.jdField_a_of_type_AndroidWidgetTextView.setText("正在加载(" + i1 + "%)，大约还需" + a(i1));
      this.jdField_a_of_type_AndroidWidgetProgressBar.setProgress(i1);
      continue;
      if (QLog.isDevelopLevel()) {
        QLog.d("IphoneTitleBarActivity", 4, "[PhotoPlusBridgeActivity] [handleMessage] ACTION_INCREMENT!");
      }
      int i2 = this.jdField_a_of_type_AndroidWidgetProgressBar.getProgress();
      if (i2 < 99) {}
      for (;;)
      {
        this.jdField_a_of_type_AndroidWidgetTextView.setText("正在加载(" + i1 + "%)，大约还需" + a(i1));
        this.jdField_a_of_type_AndroidWidgetProgressBar.setProgress(i1);
        break;
        i1 = i2 + 1;
      }
      if (QLog.isDevelopLevel()) {
        QLog.d("IphoneTitleBarActivity", 4, "[PhotoPlusBridgeActivity] [handleMessage] ACTION_QUERY!");
      }
      if (!isFinishing())
      {
        a("Photoplus.apk", this.jdField_a_of_type_ComTencentMobileqqPluginsdkPluginManagerClient.queryPlugin("Photoplus.apk"));
        continue;
        if (QLog.isDevelopLevel()) {
          QLog.d("IphoneTitleBarActivity", 4, "[PhotoPlusBridgeActivity] [handleMessage] ACTION_ERROR!");
        }
        this.jdField_a_of_type_AndroidWidgetTextView.setText("加载失败");
        Toast.makeText(getApplicationContext(), "网络无连接，请检查你的网络连接", 0).show();
        continue;
        paramMessage = new File(n + "Photoplus.jpg");
        if (paramMessage.exists())
        {
          try
          {
            paramMessage = URLDrawable.getDrawable(paramMessage, null);
            this.jdField_a_of_type_AndroidWidgetImageView.setImageDrawable(paramMessage);
            this.jdField_a_of_type_AndroidWidgetImageView.setVisibility(0);
            if (!QLog.isDevelopLevel()) {
              continue;
            }
            QLog.d("IphoneTitleBarActivity", 4, "[PhotoPlusBridgeActivity] [handleMessage] show image success!");
          }
          catch (Exception paramMessage) {}
          if (QLog.isColorLevel()) {
            QLog.e("IphoneTitleBarActivity", 2, "[PhotoPlusBridgeActivity] [handleMessage] show image failed! getDrawable failed", paramMessage);
          }
        }
        else if (QLog.isDevelopLevel())
        {
          QLog.e("IphoneTitleBarActivity", 4, "[PhotoPlusBridgeActivity] [handleMessage] show image failed! file is not exist!");
        }
      }
    }
  }
  
  protected boolean onBackEvent()
  {
    a(0);
    return super.onBackEvent();
  }
  
  public void onPluginManagerLoaded(PluginManagerClient paramPluginManagerClient)
  {
    this.jdField_a_of_type_ComTencentMobileqqPluginsdkPluginManagerClient = paramPluginManagerClient;
    setContentView(2130903448);
    b();
    if (QLog.isDevelopLevel()) {
      QLog.d("IphoneTitleBarActivity", 4, "[PhotoPlusBridgeActivity] [onPluginManagerLoaded] ");
    }
    if (QLog.isDevelopLevel()) {
      QLog.d("IphoneTitleBarActivity", 4, "[PhotoPlusBridgeActivity] [onCreate] has network!");
    }
    paramPluginManagerClient = this.jdField_a_of_type_ComTencentMobileqqPluginsdkPluginManagerClient.queryPlugin("Photoplus.apk");
    if (QLog.isDevelopLevel()) {
      QLog.d("IphoneTitleBarActivity", 4, "[PhotoPlusBridgeActivity] [onPluginManagerLoaded] pluginInfo WATERMARK_CAMERA_ID:" + paramPluginManagerClient);
    }
    if (paramPluginManagerClient != null)
    {
      if (paramPluginManagerClient.mState != 4) {
        break label174;
      }
      if (QLog.isDevelopLevel()) {
        QLog.d("IphoneTitleBarActivity", 4, "[PhotoPlusBridgeActivity] [onCreate] 已安装，直接启动!");
      }
      a(-1);
    }
    for (;;)
    {
      if (QLog.isDevelopLevel()) {
        QLog.d("IphoneTitleBarActivity", 4, "[PhotoPlusBridgeActivity] [onPluginManagerLoaded ACTION_QUERY] ACTION_QUERY ");
      }
      this.jdField_a_of_type_ComTencentUtilMqqWeakReferenceHandler.sendEmptyMessageDelayed(1001, 400L);
      if (!NetworkUtil.h(getApplicationContext())) {
        Toast.makeText(getApplicationContext(), "网络无连接，请检查你的网络连接", 0).show();
      }
      return;
      label174:
      if (QLog.isDevelopLevel()) {
        QLog.d("IphoneTitleBarActivity", 4, "[PhotoPlusBridgeActivity] [onCreate] 开始下载或者安装!");
      }
      this.jdField_a_of_type_ComTencentMobileqqPluginsdkPluginManagerClient.installPlugin("Photoplus.apk");
    }
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\cooperation\photoplus\PhotoPlusBridgeActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */