package com.tencent.open.agent;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.biz.widgets.ShareAioResultDialog;
import com.tencent.mobileqq.activity.SplashActivity;
import com.tencent.mobileqq.app.BaseActivity;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.ThreadManager;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.PBInt64Field;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.utils.QQCustomDialog;
import com.tencent.mobileqq.widget.QQProgressDialog;
import com.tencent.mobileqq.widget.QQToast;
import com.tencent.open.adapter.CommonDataAdapter;
import com.tencent.open.agent.datamodel.ImageLoader;
import com.tencent.open.agent.datamodel.ImageLoader.ImageLoadListener;
import com.tencent.open.appcommon.OpensdkServlet;
import com.tencent.open.base.LogUtility;
import com.tencent.open.base.http.HttpBaseUtil.HttpStatusException;
import com.tencent.open.base.http.HttpBaseUtil.NetworkUnavailableException;
import com.tencent.open.base.http.HttpCgiAsyncTask;
import com.tencent.open.base.http.HttpCgiAsyncTask.Callback;
import com.tencent.protofile.getappinfo.GetAppInfoProto.GetAppinfoRequest;
import com.tencent.qphone.base.util.QLog;
import com.tencent.widget.immersive.ImmersiveUtils;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import mqq.app.AppRuntime;
import mqq.app.NewIntent;
import org.apache.http.conn.ConnectTimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import wqk;
import wql;
import wqn;
import wqp;
import wqq;
import wqr;

public class BindGroupConfirmActivity
  extends BaseActivity
  implements DialogInterface.OnClickListener, View.OnClickListener, ImageLoader.ImageLoadListener, HttpCgiAsyncTask.Callback
{
  protected static final int a = 50;
  protected static final String a = "BindGroupConfirmActivity";
  protected static final int b = 50;
  protected static final String b = "http://fusionbase.qq.com/cgi-bin/appstage/mb_get_qqgroup_description";
  protected static final int c = 3;
  protected static final String c = "http://fusionbase.qq.com/cgi-bin/appstage/mb_bind_qqgroup";
  protected static final int d = 4;
  protected static final String d = "ConnAuthSvr.get_app_info";
  protected static final int e = 10071;
  protected static final int f = 10000;
  public Resources a;
  protected Bundle a;
  public final Handler a;
  protected Button a;
  public ImageView a;
  protected TextView a;
  public ShareAioResultDialog a;
  public QQCustomDialog a;
  public QQProgressDialog a;
  private final HttpCgiAsyncTask.Callback a;
  public Runnable a;
  public ImageView b;
  protected TextView b;
  protected TextView c;
  protected TextView d;
  protected TextView e;
  protected String e;
  protected TextView f;
  protected String f;
  protected TextView g;
  protected String g;
  protected String h;
  public String i;
  protected String j;
  
  public BindGroupConfirmActivity()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_ComTencentOpenBaseHttpHttpCgiAsyncTask$Callback = new wqk(this);
    this.jdField_a_of_type_AndroidOsHandler = new wql(this);
    this.jdField_a_of_type_JavaLangRunnable = new wqq(this);
  }
  
  private void a()
  {
    Object localObject = findViewById(2131299491);
    if (ImmersiveUtils.isSupporImmersive() == 1) {
      ImmersiveUtils.a((View)localObject, true);
    }
    this.jdField_a_of_type_AndroidWidgetTextView = ((TextView)super.findViewById(2131297083));
    this.jdField_b_of_type_AndroidWidgetTextView = ((TextView)super.findViewById(2131297391));
    this.c = ((TextView)super.findViewById(2131297183));
    this.d = ((TextView)super.findViewById(2131297139));
    this.jdField_a_of_type_AndroidWidgetButton = ((Button)super.findViewById(2131299824));
    this.jdField_a_of_type_AndroidWidgetButton.setOnClickListener(this);
    this.e = ((TextView)super.findViewById(2131299823));
    this.jdField_a_of_type_AndroidWidgetImageView = ((ImageView)super.findViewById(2131299713));
    if (!TextUtils.isEmpty(this.jdField_g_of_type_JavaLangString))
    {
      localObject = ImageLoader.a().a(this.jdField_g_of_type_JavaLangString);
      if (localObject != null) {
        this.jdField_a_of_type_AndroidWidgetImageView.setImageBitmap((Bitmap)localObject);
      }
    }
    else
    {
      this.jdField_g_of_type_AndroidWidgetTextView = ((TextView)super.findViewById(2131298260));
      if (!TextUtils.isEmpty(this.jdField_f_of_type_JavaLangString)) {
        break label270;
      }
      this.jdField_g_of_type_AndroidWidgetTextView.setText("QQ群");
    }
    for (;;)
    {
      this.jdField_b_of_type_AndroidWidgetImageView = ((ImageView)super.findViewById(2131299820));
      ThreadManager.b(new wqn(this));
      this.jdField_f_of_type_AndroidWidgetTextView = ((TextView)super.findViewById(2131298113));
      this.jdField_f_of_type_AndroidWidgetTextView.setText(this.j);
      if (!TextUtils.isEmpty(this.h)) {
        a(Long.valueOf(this.h).longValue());
      }
      return;
      ImageLoader.a().a(this.jdField_g_of_type_JavaLangString, this);
      break;
      label270:
      this.jdField_g_of_type_AndroidWidgetTextView.setText(this.jdField_f_of_type_JavaLangString);
    }
  }
  
  protected void a(long paramLong)
  {
    GetAppInfoProto.GetAppinfoRequest localGetAppinfoRequest = new GetAppInfoProto.GetAppinfoRequest();
    localGetAppinfoRequest.client_id.set(paramLong);
    localGetAppinfoRequest.sdkp.set("android");
    if (Build.VERSION.RELEASE == null) {}
    for (Object localObject = "";; localObject = Build.VERSION.RELEASE)
    {
      localGetAppinfoRequest.os.set((String)localObject);
      localGetAppinfoRequest.qqv.set(CommonDataAdapter.a().c());
      localGetAppinfoRequest.setHasFlag(true);
      localObject = new NewIntent(this, OpensdkServlet.class);
      ((NewIntent)localObject).setWithouLogin(true);
      ((NewIntent)localObject).putExtra("uin", this.app.a());
      ((NewIntent)localObject).putExtra("data", localGetAppinfoRequest.toByteArray());
      ((NewIntent)localObject).putExtra("cmd", "ConnAuthSvr.get_app_info");
      ((NewIntent)localObject).setObserver(new wqr(this));
      super.getAppRuntime().startServlet((NewIntent)localObject);
      this.jdField_a_of_type_AndroidOsHandler.removeCallbacks(this.jdField_a_of_type_JavaLangRunnable);
      this.jdField_a_of_type_AndroidOsHandler.postDelayed(this.jdField_a_of_type_JavaLangRunnable, 30000L);
      return;
    }
  }
  
  public void a(Exception paramException)
  {
    b(paramException);
  }
  
  public void a(String paramString, Bitmap paramBitmap)
  {
    LogUtility.c("BindGroupConfirmActivity", "-->onImageLoaded() url = " + paramString);
    this.jdField_a_of_type_AndroidOsHandler.post(new wqp(this, paramBitmap));
  }
  
  public void a(JSONObject paramJSONObject)
  {
    StringBuffer localStringBuffer;
    try
    {
      if (paramJSONObject.getInt("ret") != 0) {
        break label222;
      }
      paramJSONObject = paramJSONObject.getJSONArray("list");
      int m = paramJSONObject.length();
      localStringBuffer = new StringBuffer();
      int k = 0;
      for (;;)
      {
        if (k >= m) {
          break label206;
        }
        try
        {
          JSONObject localJSONObject = paramJSONObject.getJSONObject(k);
          if (!localJSONObject.getString("id").equals("0")) {
            localStringBuffer.append(localJSONObject.getString("id") + "、");
          }
          localStringBuffer.append(localJSONObject.getString("desc") + "\n");
        }
        catch (JSONException localJSONException)
        {
          for (;;)
          {
            if (QLog.isColorLevel()) {
              QLog.d("BindGroupConfirmActivity", 2, "The JSONObject has error!" + localJSONException.getMessage());
            }
          }
        }
        k += 1;
      }
      while (localStringBuffer.length() == 0) {}
    }
    catch (Exception paramJSONObject)
    {
      if (this.e != null) {
        this.e.setText(this.jdField_a_of_type_AndroidContentResResources.getString(2131363155));
      }
      a(paramJSONObject);
      return;
    }
    label206:
    this.e.setText(localStringBuffer);
    return;
    label222:
    if (QLog.isColorLevel()) {
      QLog.d("BindGroupConfirmActivity", 2, "The JSONObject has error!");
    }
    if (this.e != null) {
      this.e.setText(this.jdField_a_of_type_AndroidContentResResources.getString(2131363155));
    }
    QQToast.a(this, paramJSONObject.getString("msg"), 0).a(getTitleBarHeight()).show();
  }
  
  public void b(Exception paramException)
  {
    if (QLog.isColorLevel()) {
      QLog.d("BindGroupConfirmActivity", 2, "HttpAsyncTaskCallback exception." + paramException.getMessage());
    }
    if ((paramException instanceof ConnectTimeoutException)) {
      paramException = "网络连接超时!";
    }
    for (;;)
    {
      QQToast.a(this, paramException, 0).a(getTitleBarHeight()).show();
      return;
      if ((paramException instanceof SocketTimeoutException)) {
        paramException = "网络连接超时!";
      } else if ((paramException instanceof MalformedURLException)) {
        paramException = "访问url有误!";
      } else if ((paramException instanceof HttpBaseUtil.HttpStatusException)) {
        paramException = "Http返回码异常!";
      } else if ((paramException instanceof HttpBaseUtil.NetworkUnavailableException)) {
        paramException = "网络连接异常，请检查后重试!";
      } else if ((paramException instanceof JSONException)) {
        paramException = "服务器返回数据格式有误!";
      } else if ((paramException instanceof IOException)) {
        paramException = "网络连接异常，请检查后重试!";
      } else {
        paramException = "未知错误!";
      }
    }
  }
  
  public void finish()
  {
    super.finish();
    overridePendingTransition(2130968587, 2130968588);
  }
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (this.jdField_a_of_type_ComTencentBizWidgetsShareAioResultDialog == paramDialogInterface) {
      if (paramInt == 0)
      {
        super.setResult(-1);
        super.finish();
      }
    }
    while (this.jdField_a_of_type_ComTencentMobileqqUtilsQQCustomDialog != paramDialogInterface)
    {
      do
      {
        return;
      } while (paramInt != 1);
      paramDialogInterface = new Intent(this, SplashActivity.class);
      paramDialogInterface.addFlags(67108864);
      paramDialogInterface.addFlags(268435456);
      super.startActivity(paramDialogInterface);
      super.finish();
      return;
    }
    paramDialogInterface.dismiss();
  }
  
  public void onClick(View paramView)
  {
    if (paramView == null) {
      return;
    }
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131297083: 
      finish();
      return;
    }
    new HttpCgiAsyncTask("http://fusionbase.qq.com/cgi-bin/appstage/mb_bind_qqgroup", "POST", this.jdField_a_of_type_ComTencentOpenBaseHttpHttpCgiAsyncTask$Callback).a(this.jdField_a_of_type_AndroidOsBundle);
    this.jdField_a_of_type_ComTencentMobileqqWidgetQQProgressDialog.show();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.requestWindowFeature(1);
    super.onCreate(paramBundle);
    super.setTheme(2131559171);
    super.setContentView(2130903718);
    this.jdField_a_of_type_AndroidContentResResources = super.getResources();
    this.jdField_a_of_type_ComTencentMobileqqWidgetQQProgressDialog = new QQProgressDialog(this, getTitleBarHeight());
    this.jdField_a_of_type_ComTencentMobileqqWidgetQQProgressDialog.a("正在加载...");
    this.jdField_a_of_type_AndroidOsBundle = super.getIntent().getBundleExtra("key_params");
    if (this.jdField_a_of_type_AndroidOsBundle == null)
    {
      LogUtility.e("BindGroupConfirmActivity", "initParams() mParams is null!");
      return;
    }
    this.j = this.jdField_a_of_type_AndroidOsBundle.getString("union_name");
    this.i = this.jdField_a_of_type_AndroidOsBundle.getString("app_name");
    this.jdField_f_of_type_JavaLangString = this.jdField_a_of_type_AndroidOsBundle.getString("group_name");
    this.jdField_g_of_type_JavaLangString = this.jdField_a_of_type_AndroidOsBundle.getString("group_avatar_url");
    this.h = this.jdField_a_of_type_AndroidOsBundle.getString("appid");
    new HttpCgiAsyncTask("http://fusionbase.qq.com/cgi-bin/appstage/mb_get_qqgroup_description", "POST", this).a(this.jdField_a_of_type_AndroidOsBundle);
    a();
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    BindGroupActivity.b = true;
  }
  
  protected void onStart()
  {
    super.onStart();
    this.jdField_a_of_type_AndroidWidgetTextView.setVisibility(0);
    this.jdField_a_of_type_AndroidWidgetTextView.setText(this.jdField_a_of_type_AndroidContentResResources.getString(2131363127));
    this.jdField_a_of_type_AndroidWidgetTextView.setOnClickListener(this);
    this.jdField_b_of_type_AndroidWidgetTextView.setVisibility(4);
    this.c.setVisibility(4);
    this.d.setText(this.jdField_a_of_type_AndroidContentResResources.getString(2131363152));
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\open\agent\BindGroupConfirmActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */