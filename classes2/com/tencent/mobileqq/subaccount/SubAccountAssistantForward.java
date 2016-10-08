package com.tencent.mobileqq.subaccount;

import android.content.Context;
import android.content.Intent;
import com.tencent.mobileqq.activity.LoginPhoneNumActivity;
import com.tencent.mobileqq.activity.SubAccountBindActivity;
import com.tencent.mobileqq.activity.SubAccountInfoListActivity;
import com.tencent.mobileqq.activity.SubAccountMessageActivity;
import com.tencent.mobileqq.activity.SubAccountSettingActivity;
import com.tencent.mobileqq.activity.SubAccountUgActivity;
import com.tencent.mobileqq.activity.SubLoginActivity;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.util.Pair;
import mqq.os.MqqHandler;

public class SubAccountAssistantForward
{
  public static final String a = "sub.account.none";
  public static final String b = "sub.account.unbind";
  public static final String c = "sub.account.switchAccount";
  
  public SubAccountAssistantForward()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public static void a(QQAppInterface paramQQAppInterface)
  {
    if (paramQQAppInterface == null) {}
    do
    {
      return;
      paramQQAppInterface = paramQQAppInterface.a(SubAccountUgActivity.class);
    } while (paramQQAppInterface == null);
    paramQQAppInterface.sendEmptyMessage(1980);
  }
  
  public static void a(QQAppInterface paramQQAppInterface, long paramLong)
  {
    if (paramQQAppInterface == null) {}
    do
    {
      return;
      paramQQAppInterface = paramQQAppInterface.a(SubAccountBindActivity.class);
    } while (paramQQAppInterface == null);
    paramQQAppInterface.sendEmptyMessageDelayed(1990, paramLong);
  }
  
  public static void a(QQAppInterface paramQQAppInterface, Context paramContext, String paramString)
  {
    boolean bool = false;
    paramQQAppInterface = SubAccountControll.a(paramQQAppInterface, paramString);
    if (paramQQAppInterface != null) {
      bool = ((Boolean)paramQQAppInterface.second).booleanValue();
    }
    if (bool)
    {
      paramQQAppInterface = new Intent(paramContext, SubAccountMessageActivity.class);
      paramQQAppInterface.putExtra("subAccount", paramString);
      paramContext.startActivity(paramQQAppInterface);
      return;
    }
    paramQQAppInterface = new Intent(paramContext, SubAccountUgActivity.class);
    paramQQAppInterface.putExtra("subAccount", paramString);
    paramContext.startActivity(paramQQAppInterface);
  }
  
  public static void b(QQAppInterface paramQQAppInterface)
  {
    if (paramQQAppInterface == null) {}
    do
    {
      return;
      paramQQAppInterface = paramQQAppInterface.a(SubAccountBindActivity.class);
    } while (paramQQAppInterface == null);
    paramQQAppInterface.sendEmptyMessage(1981);
  }
  
  public static void c(QQAppInterface paramQQAppInterface)
  {
    if (paramQQAppInterface == null) {}
    do
    {
      return;
      paramQQAppInterface = paramQQAppInterface.a(SubLoginActivity.class);
    } while (paramQQAppInterface == null);
    paramQQAppInterface.sendEmptyMessage(1982);
  }
  
  public static void d(QQAppInterface paramQQAppInterface)
  {
    if (paramQQAppInterface == null) {}
    do
    {
      return;
      paramQQAppInterface = paramQQAppInterface.a(LoginPhoneNumActivity.class);
    } while (paramQQAppInterface == null);
    paramQQAppInterface.sendEmptyMessage(2014);
  }
  
  public static void e(QQAppInterface paramQQAppInterface)
  {
    if (paramQQAppInterface == null) {}
    do
    {
      return;
      paramQQAppInterface = paramQQAppInterface.a(SubAccountSettingActivity.class);
    } while (paramQQAppInterface == null);
    paramQQAppInterface.sendEmptyMessage(1985);
  }
  
  public static void f(QQAppInterface paramQQAppInterface)
  {
    if (paramQQAppInterface == null) {}
    do
    {
      return;
      paramQQAppInterface = paramQQAppInterface.a(SubAccountInfoListActivity.class);
    } while (paramQQAppInterface == null);
    paramQQAppInterface.sendEmptyMessage(1991);
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\mobileqq\subaccount\SubAccountAssistantForward.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */