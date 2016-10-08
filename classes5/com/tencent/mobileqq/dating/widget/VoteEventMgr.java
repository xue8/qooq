package com.tencent.mobileqq.dating.widget;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.v4.app.NotificationCompat.Builder;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.mobileqq.activity.JumpActivity;
import com.tencent.mobileqq.activity.recent.RecentBaseData;
import com.tencent.mobileqq.activity.recent.data.RecentItemVoteData;
import com.tencent.mobileqq.app.AppConstants;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.message.QQMessageFacade;
import com.tencent.mobileqq.data.MessageForText;
import com.tencent.mobileqq.data.RecentUser;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.managers.QQLSRecentManager;
import com.tencent.mobileqq.msf.sdk.SettingCloneUtil;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.service.message.MessageCache;
import com.tencent.mobileqq.service.message.MessageRecordFactory;
import com.tencent.mobileqq.statistics.ReportController;
import com.tencent.mobileqq.util.BitmapManager;
import com.tencent.mobileqq.utils.QQUtils;
import com.tencent.mobileqq.utils.TimeFormatterUtils;
import com.tencent.qphone.base.util.BaseApplication;
import com.tencent.qphone.base.util.QLog;
import tencent.im.s2c.msgtype0x210.submsgtype0x6f.SubMsgType0x6f.MCardNotificationLike;

public class VoteEventMgr
{
  public static final int a = 4098;
  public static final String a = "nearby_like_notification_tag";
  public static final String b = "mqqapi://nearby_entry/nearby_profile?src_type=web&version=1&from=10002&from_type=0&mode=2&source_id=1001&uid=%s&PUSH_CONTENT=%s";
  RecentItemVoteData jdField_a_of_type_ComTencentMobileqqActivityRecentDataRecentItemVoteData;
  QQAppInterface jdField_a_of_type_ComTencentMobileqqAppQQAppInterface;
  MessageForText jdField_a_of_type_ComTencentMobileqqDataMessageForText;
  
  public VoteEventMgr(QQAppInterface paramQQAppInterface)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface = paramQQAppInterface;
  }
  
  private Intent a(Context paramContext)
  {
    String str = String.format("mqqapi://nearby_entry/nearby_profile?src_type=web&version=1&from=10002&from_type=0&mode=2&source_id=1001&uid=%s&PUSH_CONTENT=%s", new Object[] { this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a(), this.jdField_a_of_type_ComTencentMobileqqActivityRecentDataRecentItemVoteData.b });
    paramContext = new Intent(paramContext, JumpActivity.class);
    paramContext.setData(Uri.parse(str));
    return paramContext;
  }
  
  private void c()
  {
    BaseApplication localBaseApplication = BaseApplicationImpl.getContext();
    boolean bool = QQUtils.a(localBaseApplication);
    Object localObject1;
    if ((this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.isBackground_Pause) || (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.isBackground_Stop) || (bool))
    {
      Object localObject2 = BitmapManager.a(localBaseApplication.getResources(), 2130840844);
      localObject1 = new NotificationCompat.Builder(localBaseApplication).setContentTitle(this.jdField_a_of_type_ComTencentMobileqqActivityRecentDataRecentItemVoteData.b).setAutoCancel(true).setSmallIcon(BaseApplicationImpl.appnewmsgicon).setTicker(this.jdField_a_of_type_ComTencentMobileqqActivityRecentDataRecentItemVoteData.b).setWhen(System.currentTimeMillis());
      if (localObject2 != null) {
        ((NotificationCompat.Builder)localObject1).setLargeIcon((Bitmap)localObject2);
      }
      if (Build.VERSION.SDK_INT < 11) {
        ((NotificationCompat.Builder)localObject1).setSmallIcon(2130840844);
      }
      if (Build.VERSION.SDK_INT >= 16)
      {
        localObject2 = new RemoteViews(localBaseApplication.getPackageName(), 2130904142);
        ((NotificationCompat.Builder)localObject1).setContent((RemoteViews)localObject2);
        ((RemoteViews)localObject2).setCharSequence(2131297123, "setText", this.jdField_a_of_type_ComTencentMobileqqActivityRecentDataRecentItemVoteData.b);
        ((RemoteViews)localObject2).setCharSequence(2131299892, "setText", TimeFormatterUtils.a(System.currentTimeMillis(), true, "yyyy-MM-dd"));
      }
      ((NotificationCompat.Builder)localObject1).setContentIntent(PendingIntent.getActivity(localBaseApplication, 0, a(localBaseApplication), 134217728));
      localObject1 = ((NotificationCompat.Builder)localObject1).build();
      ((Notification)localObject1).flags |= 0x10;
      ((Notification)localObject1).defaults |= 0x1;
      ((Notification)localObject1).defaults |= 0x4;
      ((Notification)localObject1).icon = 2130840844;
      localObject2 = (NotificationManager)localBaseApplication.getSystemService("notification");
      if (localObject2 != null)
      {
        ((NotificationManager)localObject2).cancel("nearby_like_notification_tag", 4098);
        ((NotificationManager)localObject2).notify("nearby_like_notification_tag", 4098, (Notification)localObject1);
      }
      ReportController.b(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, "CliOper", "", "", "0X80053CD", "0X80053CD", 0, 0, "", "", "", "");
    }
    if (bool)
    {
      localObject1 = (QQLSRecentManager)this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getManager(71);
      if (SettingCloneUtil.readValue(localBaseApplication, this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a(), localBaseApplication.getString(2131369618), "qqsetting_lock_screen_whenexit_key", true))
      {
        if (QLog.isColorLevel()) {
          QLog.d("QQLSActivity", 2, "videochatting start lsActivity from appinterface VoteEventMgr.notifyVoteEvent");
        }
        ((QQLSRecentManager)localObject1).a(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, AppConstants.aL, 1012, false);
      }
      this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().notifyObservers(a());
    }
  }
  
  public int a()
  {
    if (this.jdField_a_of_type_ComTencentMobileqqActivityRecentDataRecentItemVoteData == null) {
      return 0;
    }
    return 1;
  }
  
  public RecentBaseData a()
  {
    return this.jdField_a_of_type_ComTencentMobileqqActivityRecentDataRecentItemVoteData;
  }
  
  public MessageForText a(RecentBaseData paramRecentBaseData)
  {
    paramRecentBaseData = (RecentItemVoteData)paramRecentBaseData;
    if (this.jdField_a_of_type_ComTencentMobileqqDataMessageForText == null)
    {
      this.jdField_a_of_type_ComTencentMobileqqDataMessageForText = ((MessageForText)MessageRecordFactory.a(64536));
      this.jdField_a_of_type_ComTencentMobileqqDataMessageForText.msgtype = 64536;
      this.jdField_a_of_type_ComTencentMobileqqDataMessageForText.istroop = 1012;
      this.jdField_a_of_type_ComTencentMobileqqDataMessageForText.isread = false;
      this.jdField_a_of_type_ComTencentMobileqqDataMessageForText.selfuin = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a();
      this.jdField_a_of_type_ComTencentMobileqqDataMessageForText.senderuin = AppConstants.aH;
      this.jdField_a_of_type_ComTencentMobileqqDataMessageForText.frienduin = AppConstants.aH;
      this.jdField_a_of_type_ComTencentMobileqqDataMessageForText.msg = paramRecentBaseData.b;
      this.jdField_a_of_type_ComTencentMobileqqDataMessageForText.time = paramRecentBaseData.a;
    }
    if ((this.jdField_a_of_type_ComTencentMobileqqDataMessageForText.msg == null) || (!this.jdField_a_of_type_ComTencentMobileqqDataMessageForText.msg.equals(paramRecentBaseData.b))) {
      this.jdField_a_of_type_ComTencentMobileqqDataMessageForText.msg = paramRecentBaseData.b;
    }
    if (this.jdField_a_of_type_ComTencentMobileqqDataMessageForText.time != paramRecentBaseData.a) {
      this.jdField_a_of_type_ComTencentMobileqqDataMessageForText.time = paramRecentBaseData.a;
    }
    return this.jdField_a_of_type_ComTencentMobileqqDataMessageForText;
  }
  
  public void a()
  {
    this.jdField_a_of_type_ComTencentMobileqqActivityRecentDataRecentItemVoteData = null;
    NotificationManager localNotificationManager = (NotificationManager)BaseApplicationImpl.getContext().getSystemService("notification");
    if (localNotificationManager != null) {
      localNotificationManager.cancel("nearby_like_notification_tag", 4098);
    }
  }
  
  public void a(SubMsgType0x6f.MCardNotificationLike paramMCardNotificationLike)
  {
    String str2 = "";
    String str1 = str2;
    if (paramMCardNotificationLike != null)
    {
      str1 = str2;
      if (paramMCardNotificationLike.str_wording.has()) {
        str1 = paramMCardNotificationLike.str_wording.get();
      }
    }
    if (TextUtils.isEmpty(str1)) {}
    long l;
    do
    {
      return;
      l = MessageCache.a();
      if (this.jdField_a_of_type_ComTencentMobileqqActivityRecentDataRecentItemVoteData == null)
      {
        paramMCardNotificationLike = new RecentUser();
        paramMCardNotificationLike.uin = AppConstants.aL;
        paramMCardNotificationLike.msgType = 1012;
        paramMCardNotificationLike.type = 1012;
        this.jdField_a_of_type_ComTencentMobileqqActivityRecentDataRecentItemVoteData = new RecentItemVoteData(paramMCardNotificationLike);
        this.jdField_a_of_type_ComTencentMobileqqActivityRecentDataRecentItemVoteData.a(str1, l);
        c();
        return;
      }
    } while ((this.jdField_a_of_type_ComTencentMobileqqActivityRecentDataRecentItemVoteData.b.equals(str1)) && (this.jdField_a_of_type_ComTencentMobileqqActivityRecentDataRecentItemVoteData.a == l));
    this.jdField_a_of_type_ComTencentMobileqqActivityRecentDataRecentItemVoteData.a(str1, l);
    c();
  }
  
  public void b()
  {
    NotificationManager localNotificationManager = (NotificationManager)BaseApplicationImpl.getContext().getSystemService("notification");
    if (localNotificationManager != null) {
      localNotificationManager.cancel("nearby_like_notification_tag", 4098);
    }
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\com\tencent\mobileqq\dating\widget\VoteEventMgr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */