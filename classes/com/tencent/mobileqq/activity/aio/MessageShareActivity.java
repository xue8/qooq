package com.tencent.mobileqq.activity.aio;

import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.tencent.mobileqq.activity.SplashActivity;
import com.tencent.mobileqq.app.BaseActivity;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.statistics.ReportController;
import com.tencent.mobileqq.structmsg.AbsStructMsg;
import com.tencent.mobileqq.structmsg.CGILoader;
import com.tencent.mobileqq.structmsg.StructMsgFactory;
import com.tencent.mobileqq.structmsg.StructMsgForImageShare;
import com.tencent.qphone.base.util.QLog;
import com.tencent.util.MqqWeakReferenceHandler;
import mqq.os.MqqHandler;

public class MessageShareActivity
  extends BaseActivity
  implements Handler.Callback, Runnable
{
  protected static final int a = 1;
  protected static final String a = "MessageShareActivity";
  protected static final int b = 2;
  protected static final int c = 3;
  protected Dialog a;
  protected Bundle a;
  protected final MqqHandler a;
  
  public MessageShareActivity()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_MqqOsMqqHandler = new MqqWeakReferenceHandler(Looper.getMainLooper(), this);
  }
  
  protected void a()
  {
    if (this.jdField_a_of_type_AndroidOsBundle == null) {
      throw new IllegalArgumentException();
    }
  }
  
  protected void doOnDestroy()
  {
    if (this.jdField_a_of_type_AndroidAppDialog != null)
    {
      this.jdField_a_of_type_AndroidAppDialog.dismiss();
      this.jdField_a_of_type_AndroidAppDialog = null;
    }
    super.doOnDestroy();
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    }
    for (;;)
    {
      return true;
      int i = this.jdField_a_of_type_AndroidOsBundle.getInt("forward_type", -1);
      switch (i)
      {
      default: 
        break;
      case 2: 
      case 11: 
        long l = this.jdField_a_of_type_AndroidOsBundle.getLong("req_share_id");
        Object localObject1 = this.jdField_a_of_type_AndroidOsBundle.getString("pkg_name");
        paramMessage = this.jdField_a_of_type_AndroidOsBundle.getString("detail_url");
        this.jdField_a_of_type_AndroidOsBundle.putBoolean("isBack2Root", false);
        this.jdField_a_of_type_AndroidOsBundle.putLong("res_share_id", l);
        this.jdField_a_of_type_AndroidOsBundle.putString("res_pkg_name", (String)localObject1);
        this.jdField_a_of_type_AndroidOsBundle.putString("res_detail_url", paramMessage);
        if (QLog.isColorLevel()) {
          QLog.d("MessageShareActivity", 2, "-->handleMessage--appid = " + l + ", pkgNmae = " + (String)localObject1);
        }
        paramMessage = new Intent(this, SplashActivity.class);
        paramMessage.putExtra("k_from_login", true);
        String str = this.jdField_a_of_type_AndroidOsBundle.getString("uin");
        int j = this.jdField_a_of_type_AndroidOsBundle.getInt("uintype");
        l = this.jdField_a_of_type_AndroidOsBundle.getLong("req_share_id");
        if (i == 11)
        {
          Object localObject2 = new Intent();
          ((Intent)localObject2).setData(Uri.parse(String.format("tencent%1$d://tauth.qq.com/?#action=%2$s&result=complete&response={\"ret\":0}", new Object[] { Long.valueOf(l), "shareToQQ" })));
          ((Intent)localObject2).setPackage((String)localObject1);
          paramMessage.putExtra("activity_finish_run_pendingIntent", PendingIntent.getActivity(this, 0, (Intent)localObject2, 268435456));
          localObject1 = this.jdField_a_of_type_AndroidOsBundle.getString("video_url");
          localObject2 = this.jdField_a_of_type_AndroidOsBundle.getString("detail_url");
          if ((!TextUtils.isEmpty((CharSequence)localObject1)) && (!TextUtils.isEmpty((CharSequence)localObject2)))
          {
            localObject1 = CGILoader.a((String)localObject2);
            if (!TextUtils.isEmpty((CharSequence)localObject1)) {
              ReportController.b(null, "CliOper", "", "", "0X8005F53", "0X8005F53", 0, 0, CGILoader.a(j) + "", "", (String)localObject1, "");
            }
          }
        }
        localObject1 = StructMsgFactory.a(this.jdField_a_of_type_AndroidOsBundle);
        if (localObject1 != null)
        {
          if ((localObject1 instanceof StructMsgForImageShare)) {
            StructMsgForImageShare.sendAndUploadImageShare(this.app, (StructMsgForImageShare)localObject1, str, j, null);
          }
          paramMessage.putExtra("stuctmsg_bytes", ((AbsStructMsg)localObject1).getBytes());
          if (this.jdField_a_of_type_AndroidOsBundle.getBoolean("share_from_aio", false)) {
            break label509;
          }
          paramMessage = AIOUtils.a(paramMessage, new int[] { 2 });
          this.jdField_a_of_type_AndroidOsBundle.remove("share_from_aio");
        }
        for (;;)
        {
          paramMessage.putExtras(this.jdField_a_of_type_AndroidOsBundle);
          startActivity(paramMessage);
          finish();
          break;
          label509:
          paramMessage = AIOUtils.a(paramMessage, null);
          paramMessage.putExtra("share_from_aio", true);
        }
        ((TextView)this.jdField_a_of_type_AndroidAppDialog.findViewById(2131298665)).setText("处理失败");
        this.jdField_a_of_type_AndroidAppDialog.findViewById(2131298664).setVisibility(4);
        this.jdField_a_of_type_MqqOsMqqHandler.sendEmptyMessageDelayed(3, 800L);
        continue;
        finish();
      }
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    super.setContentView(new View(this));
    this.jdField_a_of_type_AndroidAppDialog = new Dialog(this, 2131558973);
    this.jdField_a_of_type_AndroidAppDialog.setCancelable(false);
    this.jdField_a_of_type_AndroidAppDialog.setContentView(2130903453);
    ((TextView)this.jdField_a_of_type_AndroidAppDialog.findViewById(2131298665)).setText(2131370344);
    this.jdField_a_of_type_AndroidOsBundle = getIntent().getExtras();
    if (this.jdField_a_of_type_AndroidOsBundle != null)
    {
      handleMessage(this.jdField_a_of_type_MqqOsMqqHandler.obtainMessage(1));
      return;
    }
    QLog.d("MessageShareActivity", 2, "getExtras() is null !!!!!");
    this.jdField_a_of_type_AndroidAppDialog.show();
    handleMessage(this.jdField_a_of_type_MqqOsMqqHandler.obtainMessage(2));
  }
  
  public void run()
  {
    try
    {
      a();
      this.jdField_a_of_type_MqqOsMqqHandler.sendEmptyMessageDelayed(1, 333L);
      return;
    }
    catch (Exception localException)
    {
      QLog.d("MessageShareActivity", 2, "doShare() cause exception !!!!!");
      this.jdField_a_of_type_MqqOsMqqHandler.sendEmptyMessageDelayed(2, 333L);
    }
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\com\tencent\mobileqq\activity\aio\MessageShareActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */