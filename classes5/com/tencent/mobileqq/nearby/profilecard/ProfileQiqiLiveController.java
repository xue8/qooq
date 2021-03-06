package com.tencent.mobileqq.nearby.profilecard;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.service.gamecenter.AppLaucherHelper;
import com.tencent.open.business.base.AppUtil;
import com.tencent.open.downloadnew.DownloadApi;
import com.tencent.open.downloadnew.DownloadConstants;
import com.tencent.qphone.base.util.QLog;
import java.lang.ref.WeakReference;
import mqq.app.NewIntent;
import mqq.manager.TicketManager;
import tpe;

public class ProfileQiqiLiveController
{
  public static final int a = 1;
  public static final String a = "1101674847";
  public static final int b = 2;
  public static final String b = "com.guagua.qiqi";
  public static final int c = 3;
  public static final int d = 4;
  public static final int e = 5;
  public static final int f = 6;
  public static final int g = 0;
  public static final int h = 1;
  public static final int i = 2;
  public static final int j = 3;
  public static final int k = 4;
  AsyncTask jdField_a_of_type_AndroidOsAsyncTask;
  public Handler a;
  WeakReference jdField_a_of_type_JavaLangRefWeakReference;
  public NewIntent a;
  public String c;
  public String d;
  public String e;
  public String f;
  
  public ProfileQiqiLiveController(NearbyPeopleProfileActivity paramNearbyPeopleProfileActivity, Handler paramHandler)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.c = null;
    this.jdField_a_of_type_MqqAppNewIntent = null;
    this.jdField_a_of_type_AndroidOsAsyncTask = null;
    this.jdField_a_of_type_JavaLangRefWeakReference = new WeakReference(paramNearbyPeopleProfileActivity);
    this.jdField_a_of_type_AndroidOsHandler = paramHandler;
  }
  
  public void a()
  {
    if ((this.jdField_a_of_type_JavaLangRefWeakReference == null) || (this.jdField_a_of_type_JavaLangRefWeakReference.get() == null)) {}
    Activity localActivity;
    do
    {
      return;
      localActivity = (Activity)this.jdField_a_of_type_JavaLangRefWeakReference.get();
    } while (localActivity == null);
    if (this.jdField_a_of_type_MqqAppNewIntent != null)
    {
      this.jdField_a_of_type_MqqAppNewIntent.setObserver(null);
      this.jdField_a_of_type_MqqAppNewIntent = null;
    }
    if (QLog.isColorLevel()) {
      QLog.d(getClass().getSimpleName(), 2, "lauchApp time out");
    }
    AppUtil.a(localActivity, "com.guagua.qiqi", AppLaucherHelper.a("pt=$PT$&at=$AT$&openid=$OPID$&pf=$PF$"), 335544320);
  }
  
  public void a(int paramInt)
  {
    if ((this.jdField_a_of_type_JavaLangRefWeakReference == null) || (this.jdField_a_of_type_JavaLangRefWeakReference.get() == null)) {}
    NearbyPeopleProfileActivity localNearbyPeopleProfileActivity;
    do
    {
      do
      {
        return;
        localNearbyPeopleProfileActivity = (NearbyPeopleProfileActivity)this.jdField_a_of_type_JavaLangRefWeakReference.get();
      } while (localNearbyPeopleProfileActivity == null);
      if (paramInt == 2) {
        this.jdField_a_of_type_AndroidOsHandler.sendEmptyMessage(1);
      }
      if (!TextUtils.isEmpty(this.f)) {
        break;
      }
    } while (this.jdField_a_of_type_AndroidOsAsyncTask != null);
    this.jdField_a_of_type_AndroidOsAsyncTask = new tpe(this);
    this.jdField_a_of_type_AndroidOsAsyncTask.execute(new Integer[] { Integer.valueOf(paramInt) });
    return;
    Bundle localBundle = new Bundle();
    localBundle.putString(DownloadConstants.a, this.e);
    localBundle.putString(DownloadConstants.i, this.f);
    localBundle.putString(DownloadConstants.e, this.d);
    localBundle.putInt(DownloadConstants.j, paramInt);
    localBundle.putString(DownloadConstants.h, "ANDROIDQQ.MSG.QIQI");
    localBundle.putString(DownloadConstants.k, "");
    localBundle.putBoolean(DownloadConstants.w, false);
    localBundle.putBoolean(DownloadConstants.f, true);
    localBundle.putBoolean(DownloadConstants.g, false);
    DownloadApi.a(localNearbyPeopleProfileActivity, localBundle, 0, null, 0);
  }
  
  public void a(long paramLong)
  {
    if ((this.jdField_a_of_type_JavaLangRefWeakReference == null) || (this.jdField_a_of_type_JavaLangRefWeakReference.get() == null) || (paramLong == 0L)) {}
    NearbyPeopleProfileActivity localNearbyPeopleProfileActivity;
    do
    {
      return;
      localNearbyPeopleProfileActivity = (NearbyPeopleProfileActivity)this.jdField_a_of_type_JavaLangRefWeakReference.get();
    } while (localNearbyPeopleProfileActivity == null);
    QQAppInterface localQQAppInterface = localNearbyPeopleProfileActivity.app;
    String str = ((TicketManager)localQQAppInterface.getManager(2)).getSkey(localQQAppInterface.getAccount());
    this.c = ("pt=$PT$&at=$AT$&openid=$OPID$&pf=$PF$&roomid=" + paramLong);
    a(localQQAppInterface, localNearbyPeopleProfileActivity, "1101674847", "com.guagua.qiqi", str, 335544320);
  }
  
  /* Error */
  public void a(com.tencent.common.app.AppInterface paramAppInterface, android.content.Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt)
  {
    // Byte code:
    //   0: lconst_0
    //   1: lstore 15
    //   3: new 230	tpf
    //   6: dup
    //   7: aload_0
    //   8: aload 4
    //   10: aload_2
    //   11: iload 6
    //   13: invokespecial 233	tpf:<init>	(Lcom/tencent/mobileqq/nearby/profilecard/ProfileQiqiLiveController;Ljava/lang/String;Landroid/content/Context;I)V
    //   16: astore 9
    //   18: aload_0
    //   19: getfield 47	com/tencent/mobileqq/nearby/profilecard/ProfileQiqiLiveController:jdField_a_of_type_MqqAppNewIntent	Lmqq/app/NewIntent;
    //   22: ifnonnull +17 -> 39
    //   25: aload_0
    //   26: new 67	mqq/app/NewIntent
    //   29: dup
    //   30: aload_2
    //   31: ldc -21
    //   33: invokespecial 238	mqq/app/NewIntent:<init>	(Landroid/content/Context;Ljava/lang/Class;)V
    //   36: putfield 47	com/tencent/mobileqq/nearby/profilecard/ProfileQiqiLiveController:jdField_a_of_type_MqqAppNewIntent	Lmqq/app/NewIntent;
    //   39: new 240	com/tencent/qconn/protofile/fastauthorize/FastAuthorize$AuthorizeRequest
    //   42: dup
    //   43: invokespecial 241	com/tencent/qconn/protofile/fastauthorize/FastAuthorize$AuthorizeRequest:<init>	()V
    //   46: astore 10
    //   48: aload_1
    //   49: invokevirtual 245	com/tencent/common/app/AppInterface:a	()Ljava/lang/String;
    //   52: invokestatic 251	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   55: lstore 13
    //   57: aload 10
    //   59: getfield 255	com/tencent/qconn/protofile/fastauthorize/FastAuthorize$AuthorizeRequest:uin	Lcom/tencent/mobileqq/pb/PBInt64Field;
    //   62: lload 13
    //   64: invokevirtual 260	com/tencent/mobileqq/pb/PBInt64Field:set	(J)V
    //   67: aload_3
    //   68: invokestatic 251	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   71: lstore 13
    //   73: aload 10
    //   75: getfield 263	com/tencent/qconn/protofile/fastauthorize/FastAuthorize$AuthorizeRequest:client_id	Lcom/tencent/mobileqq/pb/PBInt64Field;
    //   78: lload 13
    //   80: invokevirtual 260	com/tencent/mobileqq/pb/PBInt64Field:set	(J)V
    //   83: aload 10
    //   85: getfield 267	com/tencent/qconn/protofile/fastauthorize/FastAuthorize$AuthorizeRequest:pf	Lcom/tencent/mobileqq/pb/PBStringField;
    //   88: ldc -85
    //   90: invokevirtual 272	com/tencent/mobileqq/pb/PBStringField:set	(Ljava/lang/String;)V
    //   93: aload_2
    //   94: invokestatic 275	com/tencent/open/business/base/AppUtil:a	(Landroid/content/Context;)Ljava/lang/String;
    //   97: astore_3
    //   98: aload 10
    //   100: getfield 278	com/tencent/qconn/protofile/fastauthorize/FastAuthorize$AuthorizeRequest:qqv	Lcom/tencent/mobileqq/pb/PBStringField;
    //   103: aload_3
    //   104: invokevirtual 272	com/tencent/mobileqq/pb/PBStringField:set	(Ljava/lang/String;)V
    //   107: aload 10
    //   109: getfield 281	com/tencent/qconn/protofile/fastauthorize/FastAuthorize$AuthorizeRequest:sdkp	Lcom/tencent/mobileqq/pb/PBStringField;
    //   112: ldc_w 282
    //   115: invokevirtual 272	com/tencent/mobileqq/pb/PBStringField:set	(Ljava/lang/String;)V
    //   118: getstatic 287	android/os/Build:DISPLAY	Ljava/lang/String;
    //   121: astore_3
    //   122: aload 10
    //   124: getfield 290	com/tencent/qconn/protofile/fastauthorize/FastAuthorize$AuthorizeRequest:os	Lcom/tencent/mobileqq/pb/PBStringField;
    //   127: aload_3
    //   128: invokevirtual 272	com/tencent/mobileqq/pb/PBStringField:set	(Ljava/lang/String;)V
    //   131: aload 10
    //   133: getfield 293	com/tencent/qconn/protofile/fastauthorize/FastAuthorize$AuthorizeRequest:skey	Lcom/tencent/mobileqq/pb/PBStringField;
    //   136: aload 5
    //   138: invokevirtual 272	com/tencent/mobileqq/pb/PBStringField:set	(Ljava/lang/String;)V
    //   141: ldc -85
    //   143: astore_3
    //   144: aload_1
    //   145: instanceof 193
    //   148: ifeq +11 -> 159
    //   151: aload_1
    //   152: checkcast 193	com/tencent/mobileqq/app/QQAppInterface
    //   155: invokevirtual 295	com/tencent/mobileqq/app/QQAppInterface:d	()Ljava/lang/String;
    //   158: astore_3
    //   159: aload 10
    //   161: getfield 298	com/tencent/qconn/protofile/fastauthorize/FastAuthorize$AuthorizeRequest:vkey	Lcom/tencent/mobileqq/pb/PBStringField;
    //   164: aload_3
    //   165: invokevirtual 272	com/tencent/mobileqq/pb/PBStringField:set	(Ljava/lang/String;)V
    //   168: aload_0
    //   169: getfield 45	com/tencent/mobileqq/nearby/profilecard/ProfileQiqiLiveController:c	Ljava/lang/String;
    //   172: invokestatic 301	com/tencent/mobileqq/service/gamecenter/AppLaucherHelper:a	(Ljava/lang/String;)I
    //   175: istore 12
    //   177: iload 12
    //   179: ifne +28 -> 207
    //   182: aload_2
    //   183: aload 4
    //   185: aload_0
    //   186: getfield 45	com/tencent/mobileqq/nearby/profilecard/ProfileQiqiLiveController:c	Ljava/lang/String;
    //   189: invokestatic 99	com/tencent/mobileqq/service/gamecenter/AppLaucherHelper:a	(Ljava/lang/String;)Landroid/os/Bundle;
    //   192: iload 6
    //   194: invokestatic 105	com/tencent/open/business/base/AppUtil:a	(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;I)Z
    //   197: pop
    //   198: return
    //   199: astore 7
    //   201: lconst_0
    //   202: lstore 13
    //   204: goto -147 -> 57
    //   207: aload 10
    //   209: getfield 305	com/tencent/qconn/protofile/fastauthorize/FastAuthorize$AuthorizeRequest:flags	Lcom/tencent/mobileqq/pb/PBInt32Field;
    //   212: iload 12
    //   214: invokevirtual 309	com/tencent/mobileqq/pb/PBInt32Field:set	(I)V
    //   217: ldc -85
    //   219: astore 5
    //   221: aload 5
    //   223: astore_3
    //   224: aload_2
    //   225: invokevirtual 315	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   228: aload 4
    //   230: bipush 64
    //   232: invokevirtual 321	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   235: getfield 327	android/content/pm/PackageInfo:signatures	[Landroid/content/pm/Signature;
    //   238: astore 11
    //   240: aload 5
    //   242: astore_3
    //   243: aload 11
    //   245: ifnull +78 -> 323
    //   248: aload 5
    //   250: astore 7
    //   252: aload 5
    //   254: astore_3
    //   255: ldc_w 329
    //   258: invokestatic 335	java/security/MessageDigest:getInstance	(Ljava/lang/String;)Ljava/security/MessageDigest;
    //   261: astore 8
    //   263: aload 5
    //   265: astore 7
    //   267: aload 5
    //   269: astore_3
    //   270: aload 8
    //   272: aload 11
    //   274: iconst_0
    //   275: aaload
    //   276: invokevirtual 341	android/content/pm/Signature:toByteArray	()[B
    //   279: invokevirtual 345	java/security/MessageDigest:update	([B)V
    //   282: aload 5
    //   284: astore 7
    //   286: aload 5
    //   288: astore_3
    //   289: aload 8
    //   291: invokevirtual 348	java/security/MessageDigest:digest	()[B
    //   294: invokestatic 353	com/tencent/mobileqq/utils/HexUtil:a	([B)Ljava/lang/String;
    //   297: astore 5
    //   299: aload 5
    //   301: invokevirtual 358	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   304: astore_3
    //   305: aload_3
    //   306: astore 5
    //   308: aload 5
    //   310: astore 7
    //   312: aload 5
    //   314: astore_3
    //   315: aload 8
    //   317: invokevirtual 361	java/security/MessageDigest:reset	()V
    //   320: aload 5
    //   322: astore_3
    //   323: aload_3
    //   324: invokestatic 122	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   327: ifeq +65 -> 392
    //   330: invokestatic 77	com/tencent/qphone/base/util/QLog:isColorLevel	()Z
    //   333: ifeq +17 -> 350
    //   336: aload_0
    //   337: invokevirtual 81	java/lang/Object:getClass	()Ljava/lang/Class;
    //   340: invokevirtual 87	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   343: iconst_2
    //   344: ldc_w 363
    //   347: invokestatic 92	com/tencent/qphone/base/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   350: aload_2
    //   351: aload 4
    //   353: aload_0
    //   354: getfield 45	com/tencent/mobileqq/nearby/profilecard/ProfileQiqiLiveController:c	Ljava/lang/String;
    //   357: invokestatic 99	com/tencent/mobileqq/service/gamecenter/AppLaucherHelper:a	(Ljava/lang/String;)Landroid/os/Bundle;
    //   360: iload 6
    //   362: invokestatic 105	com/tencent/open/business/base/AppUtil:a	(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;I)Z
    //   365: pop
    //   366: return
    //   367: astore 8
    //   369: aload 7
    //   371: astore 5
    //   373: aload 5
    //   375: astore_3
    //   376: aload 8
    //   378: invokevirtual 366	java/security/NoSuchAlgorithmException:printStackTrace	()V
    //   381: aload 5
    //   383: astore_3
    //   384: goto -61 -> 323
    //   387: astore 5
    //   389: goto -66 -> 323
    //   392: aload 10
    //   394: getfield 369	com/tencent/qconn/protofile/fastauthorize/FastAuthorize$AuthorizeRequest:apk_sign	Lcom/tencent/mobileqq/pb/PBStringField;
    //   397: aload_3
    //   398: invokevirtual 272	com/tencent/mobileqq/pb/PBStringField:set	(Ljava/lang/String;)V
    //   401: aload_0
    //   402: getfield 47	com/tencent/mobileqq/nearby/profilecard/ProfileQiqiLiveController:jdField_a_of_type_MqqAppNewIntent	Lmqq/app/NewIntent;
    //   405: ldc_w 371
    //   408: ldc_w 373
    //   411: invokevirtual 377	mqq/app/NewIntent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   414: pop
    //   415: aload_0
    //   416: getfield 47	com/tencent/mobileqq/nearby/profilecard/ProfileQiqiLiveController:jdField_a_of_type_MqqAppNewIntent	Lmqq/app/NewIntent;
    //   419: ldc_w 379
    //   422: aload 10
    //   424: invokevirtual 380	com/tencent/qconn/protofile/fastauthorize/FastAuthorize$AuthorizeRequest:toByteArray	()[B
    //   427: invokevirtual 383	mqq/app/NewIntent:putExtra	(Ljava/lang/String;[B)Landroid/content/Intent;
    //   430: pop
    //   431: aload_0
    //   432: getfield 47	com/tencent/mobileqq/nearby/profilecard/ProfileQiqiLiveController:jdField_a_of_type_MqqAppNewIntent	Lmqq/app/NewIntent;
    //   435: aload 9
    //   437: invokevirtual 71	mqq/app/NewIntent:setObserver	(Lmqq/observer/BusinessObserver;)V
    //   440: aload_1
    //   441: aload_0
    //   442: getfield 47	com/tencent/mobileqq/nearby/profilecard/ProfileQiqiLiveController:jdField_a_of_type_MqqAppNewIntent	Lmqq/app/NewIntent;
    //   445: invokevirtual 387	com/tencent/common/app/AppInterface:startServlet	(Lmqq/app/NewIntent;)V
    //   448: aload_0
    //   449: getfield 58	com/tencent/mobileqq/nearby/profilecard/ProfileQiqiLiveController:jdField_a_of_type_AndroidOsHandler	Landroid/os/Handler;
    //   452: bipush 6
    //   454: ldc2_w 388
    //   457: invokevirtual 393	android/os/Handler:sendEmptyMessageDelayed	(IJ)Z
    //   460: pop
    //   461: return
    //   462: astore_1
    //   463: invokestatic 77	com/tencent/qphone/base/util/QLog:isColorLevel	()Z
    //   466: ifeq -268 -> 198
    //   469: aload_0
    //   470: invokevirtual 81	java/lang/Object:getClass	()Ljava/lang/Class;
    //   473: invokevirtual 87	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   476: iconst_2
    //   477: aload_1
    //   478: invokevirtual 396	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   481: invokestatic 92	com/tencent/qphone/base/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   484: return
    //   485: astore_3
    //   486: lload 15
    //   488: lstore 13
    //   490: goto -417 -> 73
    //   493: astore_3
    //   494: aload 5
    //   496: astore_3
    //   497: goto -174 -> 323
    //   500: astore 8
    //   502: goto -129 -> 373
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	505	0	this	ProfileQiqiLiveController
    //   0	505	1	paramAppInterface	com.tencent.common.app.AppInterface
    //   0	505	2	paramContext	android.content.Context
    //   0	505	3	paramString1	String
    //   0	505	4	paramString2	String
    //   0	505	5	paramString3	String
    //   0	505	6	paramInt	int
    //   199	1	7	localException	Exception
    //   250	120	7	str	String
    //   261	55	8	localMessageDigest	java.security.MessageDigest
    //   367	10	8	localNoSuchAlgorithmException1	java.security.NoSuchAlgorithmException
    //   500	1	8	localNoSuchAlgorithmException2	java.security.NoSuchAlgorithmException
    //   16	420	9	localtpf	tpf
    //   46	377	10	localAuthorizeRequest	com.tencent.qconn.protofile.fastauthorize.FastAuthorize.AuthorizeRequest
    //   238	35	11	arrayOfSignature	android.content.pm.Signature[]
    //   175	38	12	m	int
    //   55	434	13	l1	long
    //   1	486	15	l2	long
    // Exception table:
    //   from	to	target	type
    //   48	57	199	java/lang/Exception
    //   255	263	367	java/security/NoSuchAlgorithmException
    //   270	282	367	java/security/NoSuchAlgorithmException
    //   289	299	367	java/security/NoSuchAlgorithmException
    //   315	320	367	java/security/NoSuchAlgorithmException
    //   224	240	387	java/lang/Exception
    //   255	263	387	java/lang/Exception
    //   270	282	387	java/lang/Exception
    //   289	299	387	java/lang/Exception
    //   315	320	387	java/lang/Exception
    //   376	381	387	java/lang/Exception
    //   415	431	462	java/lang/Exception
    //   67	73	485	java/lang/Exception
    //   299	305	493	java/lang/Exception
    //   299	305	500	java/security/NoSuchAlgorithmException
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\com\tencent\mobileqq\nearby\profilecard\ProfileQiqiLiveController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */