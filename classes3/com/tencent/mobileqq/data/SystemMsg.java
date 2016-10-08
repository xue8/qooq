package com.tencent.mobileqq.data;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.service.message.MessageUtils;
import com.tencent.mobileqq.utils.httputils.PkgTools;

public class SystemMsg
  extends JceStruct
{
  private static final String TAG = "Q.systemmsg.SystemMsg";
  public String append;
  public byte[] auth;
  public int cVession;
  public String inviteMemUin;
  public long lToMobile;
  public String managerUin;
  public String message;
  public byte op;
  public String requestUin;
  public String sMsg;
  public String strAddressBookNickName;
  public String strGameName;
  public String strGroupName;
  public String strGroupNickName;
  public long strGroupUin;
  public String strNickName;
  public String strServerFromUinNickName;
  public String troopCode;
  public byte troopType;
  public int wSourceID;
  public int wSourceSubID;
  
  public SystemMsg()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.strServerFromUinNickName = "";
    this.strGameName = "";
  }
  
  /* Error */
  public static SystemMsg decode(com.tencent.mobileqq.app.QQAppInterface paramQQAppInterface, String paramString1, String paramString2, int paramInt)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 10
    //   3: iconst_0
    //   4: istore 11
    //   6: iconst_0
    //   7: istore 12
    //   9: iconst_0
    //   10: istore 13
    //   12: iconst_0
    //   13: istore 9
    //   15: aload_1
    //   16: ifnull +4596 -> 4612
    //   19: iload_3
    //   20: invokestatic 60	com/tencent/mobileqq/data/SystemMsg:isTroopSystemMessage	(I)Z
    //   23: ifeq +2527 -> 2550
    //   26: aload_1
    //   27: invokestatic 66	com/tencent/mobileqq/utils/HexUtil:a	(Ljava/lang/String;)[B
    //   30: astore_2
    //   31: new 2	com/tencent/mobileqq/data/SystemMsg
    //   34: dup
    //   35: invokespecial 67	com/tencent/mobileqq/data/SystemMsg:<init>	()V
    //   38: astore_1
    //   39: aload_1
    //   40: astore 4
    //   42: aload_1
    //   43: astore 5
    //   45: aload_1
    //   46: aload_2
    //   47: invokestatic 71	com/tencent/mobileqq/data/SystemMsg:getTroopCodeFromTroopSysMsg	([B)Ljava/lang/String;
    //   50: putfield 73	com/tencent/mobileqq/data/SystemMsg:troopCode	Ljava/lang/String;
    //   53: aload_1
    //   54: astore 4
    //   56: aload_1
    //   57: astore 5
    //   59: aload_1
    //   60: aload_2
    //   61: invokestatic 77	com/tencent/mobileqq/data/SystemMsg:getTroopTypeFromTroopSysMsg	([B)B
    //   64: putfield 79	com/tencent/mobileqq/data/SystemMsg:troopType	B
    //   67: aload_1
    //   68: astore 4
    //   70: aload_1
    //   71: astore 5
    //   73: aload_1
    //   74: aload_2
    //   75: iload_3
    //   76: invokestatic 83	com/tencent/mobileqq/data/SystemMsg:getManagerUinFromTroopSysMsg	([BI)Ljava/lang/String;
    //   79: putfield 85	com/tencent/mobileqq/data/SystemMsg:managerUin	Ljava/lang/String;
    //   82: aload_1
    //   83: astore 4
    //   85: aload_1
    //   86: astore 5
    //   88: aload_1
    //   89: aload_2
    //   90: iload_3
    //   91: invokestatic 88	com/tencent/mobileqq/data/SystemMsg:getStrMsgFromTroopSysMsg	([BI)Ljava/lang/String;
    //   94: putfield 90	com/tencent/mobileqq/data/SystemMsg:sMsg	Ljava/lang/String;
    //   97: aload_1
    //   98: astore 4
    //   100: aload_1
    //   101: astore 5
    //   103: aload_1
    //   104: aload_2
    //   105: iload_3
    //   106: invokestatic 94	com/tencent/mobileqq/data/SystemMsg:getTroopOpFromTroopSysMsg	([BI)B
    //   109: putfield 96	com/tencent/mobileqq/data/SystemMsg:op	B
    //   112: aload_1
    //   113: astore 4
    //   115: aload_1
    //   116: astore 5
    //   118: aload_1
    //   119: aload_2
    //   120: iload_3
    //   121: invokestatic 99	com/tencent/mobileqq/data/SystemMsg:getRequestUinFromTroopSysMsg	([BI)Ljava/lang/String;
    //   124: putfield 101	com/tencent/mobileqq/data/SystemMsg:requestUin	Ljava/lang/String;
    //   127: aload_1
    //   128: astore 4
    //   130: aload_1
    //   131: astore 5
    //   133: aload_1
    //   134: aload_2
    //   135: iload_3
    //   136: invokestatic 105	com/tencent/mobileqq/data/SystemMsg:getAuthFromTroopSysMsg	([BI)[B
    //   139: putfield 107	com/tencent/mobileqq/data/SystemMsg:auth	[B
    //   142: aload_1
    //   143: astore 4
    //   145: aload_1
    //   146: astore 5
    //   148: aload_1
    //   149: aload_2
    //   150: iload_3
    //   151: invokestatic 110	com/tencent/mobileqq/data/SystemMsg:getInviteUinFromTroopSysMsg	([BI)Ljava/lang/String;
    //   154: putfield 112	com/tencent/mobileqq/data/SystemMsg:inviteMemUin	Ljava/lang/String;
    //   157: aload_1
    //   158: astore 4
    //   160: aload_1
    //   161: astore 5
    //   163: aload_0
    //   164: aload_1
    //   165: getfield 73	com/tencent/mobileqq/data/SystemMsg:troopCode	Ljava/lang/String;
    //   168: iconst_1
    //   169: invokestatic 117	com/tencent/mobileqq/utils/ContactUtils:a	(Lcom/tencent/mobileqq/app/QQAppInterface;Ljava/lang/String;Z)Ljava/lang/String;
    //   172: astore_2
    //   173: aload_1
    //   174: astore 4
    //   176: aload_1
    //   177: astore 5
    //   179: aload_0
    //   180: aload_1
    //   181: getfield 101	com/tencent/mobileqq/data/SystemMsg:requestUin	Ljava/lang/String;
    //   184: iconst_1
    //   185: invokestatic 120	com/tencent/mobileqq/utils/ContactUtils:b	(Lcom/tencent/mobileqq/app/QQAppInterface;Ljava/lang/String;Z)Ljava/lang/String;
    //   188: astore 6
    //   190: aload_1
    //   191: astore 4
    //   193: aload_1
    //   194: astore 5
    //   196: aload_0
    //   197: aload_1
    //   198: getfield 85	com/tencent/mobileqq/data/SystemMsg:managerUin	Ljava/lang/String;
    //   201: iconst_1
    //   202: invokestatic 120	com/tencent/mobileqq/utils/ContactUtils:b	(Lcom/tencent/mobileqq/app/QQAppInterface;Ljava/lang/String;Z)Ljava/lang/String;
    //   205: astore 7
    //   207: aload_1
    //   208: astore 4
    //   210: aload_1
    //   211: astore 5
    //   213: aload_0
    //   214: aload_1
    //   215: getfield 112	com/tencent/mobileqq/data/SystemMsg:inviteMemUin	Ljava/lang/String;
    //   218: iconst_1
    //   219: invokestatic 120	com/tencent/mobileqq/utils/ContactUtils:b	(Lcom/tencent/mobileqq/app/QQAppInterface;Ljava/lang/String;Z)Ljava/lang/String;
    //   222: astore 8
    //   224: iload_3
    //   225: lookupswitch	default:+4389->4614, -1023:+844->1069, -1022:+252->477, -1021:+107->332, -1020:+453->678, 35:+453->678, 36:+107->332, 37:+252->477, 46:+844->1069, 84:+453->678, 85:+107->332, 86:+252->477, 87:+844->1069
    //   332: aload_1
    //   333: astore 4
    //   335: aload_1
    //   336: astore 5
    //   338: aload_1
    //   339: getfield 85	com/tencent/mobileqq/data/SystemMsg:managerUin	Ljava/lang/String;
    //   342: ifnull +74 -> 416
    //   345: aload_1
    //   346: astore 4
    //   348: aload_1
    //   349: astore 5
    //   351: aload_1
    //   352: getfield 85	com/tencent/mobileqq/data/SystemMsg:managerUin	Ljava/lang/String;
    //   355: aload 7
    //   357: invokevirtual 126	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   360: ifne +56 -> 416
    //   363: aload_1
    //   364: astore 4
    //   366: aload_1
    //   367: astore 5
    //   369: aload_1
    //   370: new 128	java/lang/StringBuilder
    //   373: dup
    //   374: invokespecial 129	java/lang/StringBuilder:<init>	()V
    //   377: aload 7
    //   379: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   382: ldc -122
    //   384: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   387: invokestatic 140	com/tencent/qphone/base/util/BaseApplication:getContext	()Lcom/tencent/qphone/base/util/BaseApplication;
    //   390: ldc -115
    //   392: invokevirtual 145	com/tencent/qphone/base/util/BaseApplication:getString	(I)Ljava/lang/String;
    //   395: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   398: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   401: putfield 151	com/tencent/mobileqq/data/SystemMsg:message	Ljava/lang/String;
    //   404: aload_1
    //   405: areturn
    //   406: astore_1
    //   407: aload 4
    //   409: astore_0
    //   410: aload_1
    //   411: invokevirtual 154	java/io/IOException:printStackTrace	()V
    //   414: aload_0
    //   415: areturn
    //   416: aload_1
    //   417: astore 4
    //   419: aload_1
    //   420: astore 5
    //   422: aload_1
    //   423: new 128	java/lang/StringBuilder
    //   426: dup
    //   427: invokespecial 129	java/lang/StringBuilder:<init>	()V
    //   430: ldc -100
    //   432: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   435: aload 7
    //   437: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   440: ldc -100
    //   442: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   445: ldc -122
    //   447: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   450: invokestatic 140	com/tencent/qphone/base/util/BaseApplication:getContext	()Lcom/tencent/qphone/base/util/BaseApplication;
    //   453: ldc -115
    //   455: invokevirtual 145	com/tencent/qphone/base/util/BaseApplication:getString	(I)Ljava/lang/String;
    //   458: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   461: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   464: putfield 151	com/tencent/mobileqq/data/SystemMsg:message	Ljava/lang/String;
    //   467: aload_1
    //   468: areturn
    //   469: astore_0
    //   470: aload_0
    //   471: invokevirtual 157	java/lang/Exception:printStackTrace	()V
    //   474: aload 5
    //   476: areturn
    //   477: aload_1
    //   478: astore 4
    //   480: aload_1
    //   481: astore 5
    //   483: aload_1
    //   484: getfield 90	com/tencent/mobileqq/data/SystemMsg:sMsg	Ljava/lang/String;
    //   487: ifnull +24 -> 511
    //   490: aload_1
    //   491: astore 4
    //   493: aload_1
    //   494: astore 5
    //   496: ldc 45
    //   498: aload_1
    //   499: getfield 90	com/tencent/mobileqq/data/SystemMsg:sMsg	Ljava/lang/String;
    //   502: invokevirtual 160	java/lang/String:trim	()Ljava/lang/String;
    //   505: invokevirtual 126	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   508: ifeq +103 -> 611
    //   511: aload_1
    //   512: astore 4
    //   514: aload_1
    //   515: astore 5
    //   517: invokestatic 140	com/tencent/qphone/base/util/BaseApplication:getContext	()Lcom/tencent/qphone/base/util/BaseApplication;
    //   520: ldc -95
    //   522: invokevirtual 145	com/tencent/qphone/base/util/BaseApplication:getString	(I)Ljava/lang/String;
    //   525: astore_0
    //   526: aload_1
    //   527: astore 4
    //   529: aload_1
    //   530: astore 5
    //   532: aload_1
    //   533: aload_0
    //   534: putfield 90	com/tencent/mobileqq/data/SystemMsg:sMsg	Ljava/lang/String;
    //   537: aload_1
    //   538: astore 4
    //   540: aload_1
    //   541: astore 5
    //   543: aload_1
    //   544: getfield 85	com/tencent/mobileqq/data/SystemMsg:managerUin	Ljava/lang/String;
    //   547: ifnull +78 -> 625
    //   550: aload_1
    //   551: astore 4
    //   553: aload_1
    //   554: astore 5
    //   556: aload_1
    //   557: getfield 85	com/tencent/mobileqq/data/SystemMsg:managerUin	Ljava/lang/String;
    //   560: aload 7
    //   562: invokevirtual 126	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   565: ifne +60 -> 625
    //   568: aload_1
    //   569: astore 4
    //   571: aload_1
    //   572: astore 5
    //   574: aload_1
    //   575: new 128	java/lang/StringBuilder
    //   578: dup
    //   579: invokespecial 129	java/lang/StringBuilder:<init>	()V
    //   582: aload 7
    //   584: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   587: ldc -122
    //   589: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   592: invokestatic 140	com/tencent/qphone/base/util/BaseApplication:getContext	()Lcom/tencent/qphone/base/util/BaseApplication;
    //   595: ldc -94
    //   597: invokevirtual 145	com/tencent/qphone/base/util/BaseApplication:getString	(I)Ljava/lang/String;
    //   600: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   603: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   606: putfield 151	com/tencent/mobileqq/data/SystemMsg:message	Ljava/lang/String;
    //   609: aload_1
    //   610: areturn
    //   611: aload_1
    //   612: astore 4
    //   614: aload_1
    //   615: astore 5
    //   617: aload_1
    //   618: getfield 90	com/tencent/mobileqq/data/SystemMsg:sMsg	Ljava/lang/String;
    //   621: astore_0
    //   622: goto -96 -> 526
    //   625: aload_1
    //   626: astore 4
    //   628: aload_1
    //   629: astore 5
    //   631: aload_1
    //   632: new 128	java/lang/StringBuilder
    //   635: dup
    //   636: invokespecial 129	java/lang/StringBuilder:<init>	()V
    //   639: ldc -100
    //   641: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   644: aload 7
    //   646: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   649: ldc -100
    //   651: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   654: ldc -122
    //   656: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   659: invokestatic 140	com/tencent/qphone/base/util/BaseApplication:getContext	()Lcom/tencent/qphone/base/util/BaseApplication;
    //   662: ldc -94
    //   664: invokevirtual 145	com/tencent/qphone/base/util/BaseApplication:getString	(I)Ljava/lang/String;
    //   667: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   670: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   673: putfield 151	com/tencent/mobileqq/data/SystemMsg:message	Ljava/lang/String;
    //   676: aload_1
    //   677: areturn
    //   678: aload_1
    //   679: astore 4
    //   681: aload_1
    //   682: astore 5
    //   684: aload_1
    //   685: getfield 90	com/tencent/mobileqq/data/SystemMsg:sMsg	Ljava/lang/String;
    //   688: ifnull +21 -> 709
    //   691: aload_1
    //   692: astore 4
    //   694: aload_1
    //   695: astore 5
    //   697: ldc 45
    //   699: aload_1
    //   700: getfield 90	com/tencent/mobileqq/data/SystemMsg:sMsg	Ljava/lang/String;
    //   703: invokevirtual 126	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   706: ifeq +137 -> 843
    //   709: aload_1
    //   710: astore 4
    //   712: aload_1
    //   713: astore 5
    //   715: invokestatic 140	com/tencent/qphone/base/util/BaseApplication:getContext	()Lcom/tencent/qphone/base/util/BaseApplication;
    //   718: ldc -95
    //   720: invokevirtual 145	com/tencent/qphone/base/util/BaseApplication:getString	(I)Ljava/lang/String;
    //   723: astore_0
    //   724: aload_1
    //   725: astore 4
    //   727: aload_1
    //   728: astore 5
    //   730: aload_1
    //   731: aload_0
    //   732: putfield 90	com/tencent/mobileqq/data/SystemMsg:sMsg	Ljava/lang/String;
    //   735: aload_1
    //   736: astore 4
    //   738: aload_1
    //   739: astore 5
    //   741: aload_1
    //   742: getfield 73	com/tencent/mobileqq/data/SystemMsg:troopCode	Ljava/lang/String;
    //   745: ifnull +169 -> 914
    //   748: aload_1
    //   749: astore 4
    //   751: aload_1
    //   752: astore 5
    //   754: aload_1
    //   755: getfield 73	com/tencent/mobileqq/data/SystemMsg:troopCode	Ljava/lang/String;
    //   758: aload_2
    //   759: invokevirtual 126	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   762: ifne +152 -> 914
    //   765: aload_1
    //   766: astore 4
    //   768: aload_1
    //   769: astore 5
    //   771: aload_1
    //   772: getfield 101	com/tencent/mobileqq/data/SystemMsg:requestUin	Ljava/lang/String;
    //   775: ifnull +82 -> 857
    //   778: aload_1
    //   779: astore 4
    //   781: aload_1
    //   782: astore 5
    //   784: aload_1
    //   785: getfield 101	com/tencent/mobileqq/data/SystemMsg:requestUin	Ljava/lang/String;
    //   788: aload 6
    //   790: invokevirtual 126	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   793: ifne +64 -> 857
    //   796: aload_1
    //   797: astore 4
    //   799: aload_1
    //   800: astore 5
    //   802: aload_1
    //   803: new 128	java/lang/StringBuilder
    //   806: dup
    //   807: invokespecial 129	java/lang/StringBuilder:<init>	()V
    //   810: aload 6
    //   812: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   815: ldc -122
    //   817: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   820: invokestatic 140	com/tencent/qphone/base/util/BaseApplication:getContext	()Lcom/tencent/qphone/base/util/BaseApplication;
    //   823: ldc -93
    //   825: invokevirtual 145	com/tencent/qphone/base/util/BaseApplication:getString	(I)Ljava/lang/String;
    //   828: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   831: aload_2
    //   832: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   835: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   838: putfield 151	com/tencent/mobileqq/data/SystemMsg:message	Ljava/lang/String;
    //   841: aload_1
    //   842: areturn
    //   843: aload_1
    //   844: astore 4
    //   846: aload_1
    //   847: astore 5
    //   849: aload_1
    //   850: getfield 90	com/tencent/mobileqq/data/SystemMsg:sMsg	Ljava/lang/String;
    //   853: astore_0
    //   854: goto -130 -> 724
    //   857: aload_1
    //   858: astore 4
    //   860: aload_1
    //   861: astore 5
    //   863: aload_1
    //   864: new 128	java/lang/StringBuilder
    //   867: dup
    //   868: invokespecial 129	java/lang/StringBuilder:<init>	()V
    //   871: ldc -100
    //   873: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   876: aload 6
    //   878: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   881: ldc -100
    //   883: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   886: ldc -122
    //   888: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   891: invokestatic 140	com/tencent/qphone/base/util/BaseApplication:getContext	()Lcom/tencent/qphone/base/util/BaseApplication;
    //   894: ldc -93
    //   896: invokevirtual 145	com/tencent/qphone/base/util/BaseApplication:getString	(I)Ljava/lang/String;
    //   899: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   902: aload_2
    //   903: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   906: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   909: putfield 151	com/tencent/mobileqq/data/SystemMsg:message	Ljava/lang/String;
    //   912: aload_1
    //   913: areturn
    //   914: aload_1
    //   915: astore 4
    //   917: aload_1
    //   918: astore 5
    //   920: aload_1
    //   921: getfield 101	com/tencent/mobileqq/data/SystemMsg:requestUin	Ljava/lang/String;
    //   924: ifnull +78 -> 1002
    //   927: aload_1
    //   928: astore 4
    //   930: aload_1
    //   931: astore 5
    //   933: aload_1
    //   934: getfield 101	com/tencent/mobileqq/data/SystemMsg:requestUin	Ljava/lang/String;
    //   937: aload 6
    //   939: invokevirtual 126	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   942: ifne +60 -> 1002
    //   945: aload_1
    //   946: astore 4
    //   948: aload_1
    //   949: astore 5
    //   951: aload_1
    //   952: new 128	java/lang/StringBuilder
    //   955: dup
    //   956: invokespecial 129	java/lang/StringBuilder:<init>	()V
    //   959: aload 6
    //   961: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   964: ldc -122
    //   966: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   969: invokestatic 140	com/tencent/qphone/base/util/BaseApplication:getContext	()Lcom/tencent/qphone/base/util/BaseApplication;
    //   972: ldc -93
    //   974: invokevirtual 145	com/tencent/qphone/base/util/BaseApplication:getString	(I)Ljava/lang/String;
    //   977: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   980: ldc -100
    //   982: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   985: aload_2
    //   986: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   989: ldc -100
    //   991: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   994: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   997: putfield 151	com/tencent/mobileqq/data/SystemMsg:message	Ljava/lang/String;
    //   1000: aload_1
    //   1001: areturn
    //   1002: aload_1
    //   1003: astore 4
    //   1005: aload_1
    //   1006: astore 5
    //   1008: aload_1
    //   1009: new 128	java/lang/StringBuilder
    //   1012: dup
    //   1013: invokespecial 129	java/lang/StringBuilder:<init>	()V
    //   1016: ldc -100
    //   1018: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1021: aload 6
    //   1023: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1026: ldc -100
    //   1028: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1031: ldc -122
    //   1033: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1036: invokestatic 140	com/tencent/qphone/base/util/BaseApplication:getContext	()Lcom/tencent/qphone/base/util/BaseApplication;
    //   1039: ldc -93
    //   1041: invokevirtual 145	com/tencent/qphone/base/util/BaseApplication:getString	(I)Ljava/lang/String;
    //   1044: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1047: ldc -100
    //   1049: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1052: aload_2
    //   1053: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1056: ldc -100
    //   1058: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1061: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1064: putfield 151	com/tencent/mobileqq/data/SystemMsg:message	Ljava/lang/String;
    //   1067: aload_1
    //   1068: areturn
    //   1069: aload_1
    //   1070: astore 4
    //   1072: aload_1
    //   1073: astore 5
    //   1075: aload_1
    //   1076: getfield 90	com/tencent/mobileqq/data/SystemMsg:sMsg	Ljava/lang/String;
    //   1079: ifnull +21 -> 1100
    //   1082: aload_1
    //   1083: astore 4
    //   1085: aload_1
    //   1086: astore 5
    //   1088: ldc 45
    //   1090: aload_1
    //   1091: getfield 90	com/tencent/mobileqq/data/SystemMsg:sMsg	Ljava/lang/String;
    //   1094: invokevirtual 126	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1097: ifeq +165 -> 1262
    //   1100: aload_1
    //   1101: astore 4
    //   1103: aload_1
    //   1104: astore 5
    //   1106: invokestatic 140	com/tencent/qphone/base/util/BaseApplication:getContext	()Lcom/tencent/qphone/base/util/BaseApplication;
    //   1109: ldc -95
    //   1111: invokevirtual 145	com/tencent/qphone/base/util/BaseApplication:getString	(I)Ljava/lang/String;
    //   1114: astore_0
    //   1115: aload_1
    //   1116: astore 4
    //   1118: aload_1
    //   1119: astore 5
    //   1121: aload_1
    //   1122: aload_0
    //   1123: putfield 90	com/tencent/mobileqq/data/SystemMsg:sMsg	Ljava/lang/String;
    //   1126: aload_1
    //   1127: astore 4
    //   1129: aload_1
    //   1130: astore 5
    //   1132: aload_1
    //   1133: getfield 96	com/tencent/mobileqq/data/SystemMsg:op	B
    //   1136: iconst_1
    //   1137: if_icmpeq +17 -> 1154
    //   1140: aload_1
    //   1141: astore 4
    //   1143: aload_1
    //   1144: astore 5
    //   1146: aload_1
    //   1147: getfield 96	com/tencent/mobileqq/data/SystemMsg:op	B
    //   1150: iconst_4
    //   1151: if_icmpne +337 -> 1488
    //   1154: aload_1
    //   1155: astore 4
    //   1157: aload_1
    //   1158: astore 5
    //   1160: aload_1
    //   1161: getfield 73	com/tencent/mobileqq/data/SystemMsg:troopCode	Ljava/lang/String;
    //   1164: ifnull +169 -> 1333
    //   1167: aload_1
    //   1168: astore 4
    //   1170: aload_1
    //   1171: astore 5
    //   1173: aload_1
    //   1174: getfield 73	com/tencent/mobileqq/data/SystemMsg:troopCode	Ljava/lang/String;
    //   1177: aload_2
    //   1178: invokevirtual 126	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1181: ifne +152 -> 1333
    //   1184: aload_1
    //   1185: astore 4
    //   1187: aload_1
    //   1188: astore 5
    //   1190: aload_1
    //   1191: getfield 101	com/tencent/mobileqq/data/SystemMsg:requestUin	Ljava/lang/String;
    //   1194: ifnull +82 -> 1276
    //   1197: aload_1
    //   1198: astore 4
    //   1200: aload_1
    //   1201: astore 5
    //   1203: aload_1
    //   1204: getfield 101	com/tencent/mobileqq/data/SystemMsg:requestUin	Ljava/lang/String;
    //   1207: aload 6
    //   1209: invokevirtual 126	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1212: ifne +64 -> 1276
    //   1215: aload_1
    //   1216: astore 4
    //   1218: aload_1
    //   1219: astore 5
    //   1221: aload_1
    //   1222: new 128	java/lang/StringBuilder
    //   1225: dup
    //   1226: invokespecial 129	java/lang/StringBuilder:<init>	()V
    //   1229: aload 6
    //   1231: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1234: ldc -122
    //   1236: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1239: invokestatic 140	com/tencent/qphone/base/util/BaseApplication:getContext	()Lcom/tencent/qphone/base/util/BaseApplication;
    //   1242: ldc -92
    //   1244: invokevirtual 145	com/tencent/qphone/base/util/BaseApplication:getString	(I)Ljava/lang/String;
    //   1247: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1250: aload_2
    //   1251: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1254: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1257: putfield 151	com/tencent/mobileqq/data/SystemMsg:message	Ljava/lang/String;
    //   1260: aload_1
    //   1261: areturn
    //   1262: aload_1
    //   1263: astore 4
    //   1265: aload_1
    //   1266: astore 5
    //   1268: aload_1
    //   1269: getfield 90	com/tencent/mobileqq/data/SystemMsg:sMsg	Ljava/lang/String;
    //   1272: astore_0
    //   1273: goto -158 -> 1115
    //   1276: aload_1
    //   1277: astore 4
    //   1279: aload_1
    //   1280: astore 5
    //   1282: aload_1
    //   1283: new 128	java/lang/StringBuilder
    //   1286: dup
    //   1287: invokespecial 129	java/lang/StringBuilder:<init>	()V
    //   1290: ldc -100
    //   1292: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1295: aload 6
    //   1297: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1300: ldc -100
    //   1302: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1305: ldc -122
    //   1307: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1310: invokestatic 140	com/tencent/qphone/base/util/BaseApplication:getContext	()Lcom/tencent/qphone/base/util/BaseApplication;
    //   1313: ldc -92
    //   1315: invokevirtual 145	com/tencent/qphone/base/util/BaseApplication:getString	(I)Ljava/lang/String;
    //   1318: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1321: aload_2
    //   1322: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1325: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1328: putfield 151	com/tencent/mobileqq/data/SystemMsg:message	Ljava/lang/String;
    //   1331: aload_1
    //   1332: areturn
    //   1333: aload_1
    //   1334: astore 4
    //   1336: aload_1
    //   1337: astore 5
    //   1339: aload_1
    //   1340: getfield 101	com/tencent/mobileqq/data/SystemMsg:requestUin	Ljava/lang/String;
    //   1343: ifnull +78 -> 1421
    //   1346: aload_1
    //   1347: astore 4
    //   1349: aload_1
    //   1350: astore 5
    //   1352: aload_1
    //   1353: getfield 101	com/tencent/mobileqq/data/SystemMsg:requestUin	Ljava/lang/String;
    //   1356: aload 6
    //   1358: invokevirtual 126	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1361: ifne +60 -> 1421
    //   1364: aload_1
    //   1365: astore 4
    //   1367: aload_1
    //   1368: astore 5
    //   1370: aload_1
    //   1371: new 128	java/lang/StringBuilder
    //   1374: dup
    //   1375: invokespecial 129	java/lang/StringBuilder:<init>	()V
    //   1378: aload 6
    //   1380: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1383: ldc -122
    //   1385: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1388: invokestatic 140	com/tencent/qphone/base/util/BaseApplication:getContext	()Lcom/tencent/qphone/base/util/BaseApplication;
    //   1391: ldc -92
    //   1393: invokevirtual 145	com/tencent/qphone/base/util/BaseApplication:getString	(I)Ljava/lang/String;
    //   1396: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1399: ldc -100
    //   1401: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1404: aload_2
    //   1405: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1408: ldc -100
    //   1410: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1413: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1416: putfield 151	com/tencent/mobileqq/data/SystemMsg:message	Ljava/lang/String;
    //   1419: aload_1
    //   1420: areturn
    //   1421: aload_1
    //   1422: astore 4
    //   1424: aload_1
    //   1425: astore 5
    //   1427: aload_1
    //   1428: new 128	java/lang/StringBuilder
    //   1431: dup
    //   1432: invokespecial 129	java/lang/StringBuilder:<init>	()V
    //   1435: ldc -100
    //   1437: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1440: aload 6
    //   1442: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1445: ldc -100
    //   1447: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1450: ldc -122
    //   1452: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1455: invokestatic 140	com/tencent/qphone/base/util/BaseApplication:getContext	()Lcom/tencent/qphone/base/util/BaseApplication;
    //   1458: ldc -92
    //   1460: invokevirtual 145	com/tencent/qphone/base/util/BaseApplication:getString	(I)Ljava/lang/String;
    //   1463: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1466: ldc -100
    //   1468: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1471: aload_2
    //   1472: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1475: ldc -100
    //   1477: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1480: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1483: putfield 151	com/tencent/mobileqq/data/SystemMsg:message	Ljava/lang/String;
    //   1486: aload_1
    //   1487: areturn
    //   1488: aload_1
    //   1489: astore 4
    //   1491: aload_1
    //   1492: astore 5
    //   1494: aload_1
    //   1495: getfield 96	com/tencent/mobileqq/data/SystemMsg:op	B
    //   1498: iconst_2
    //   1499: if_icmpne +323 -> 1822
    //   1502: aload_1
    //   1503: astore 4
    //   1505: aload_1
    //   1506: astore 5
    //   1508: aload_1
    //   1509: getfield 73	com/tencent/mobileqq/data/SystemMsg:troopCode	Ljava/lang/String;
    //   1512: ifnull +155 -> 1667
    //   1515: aload_1
    //   1516: astore 4
    //   1518: aload_1
    //   1519: astore 5
    //   1521: aload_1
    //   1522: getfield 73	com/tencent/mobileqq/data/SystemMsg:troopCode	Ljava/lang/String;
    //   1525: aload_2
    //   1526: invokevirtual 126	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1529: ifne +138 -> 1667
    //   1532: aload_1
    //   1533: astore 4
    //   1535: aload_1
    //   1536: astore 5
    //   1538: aload_1
    //   1539: getfield 101	com/tencent/mobileqq/data/SystemMsg:requestUin	Ljava/lang/String;
    //   1542: ifnull +68 -> 1610
    //   1545: aload_1
    //   1546: astore 4
    //   1548: aload_1
    //   1549: astore 5
    //   1551: aload_1
    //   1552: getfield 101	com/tencent/mobileqq/data/SystemMsg:requestUin	Ljava/lang/String;
    //   1555: aload 6
    //   1557: invokevirtual 126	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1560: ifne +50 -> 1610
    //   1563: aload_1
    //   1564: astore 4
    //   1566: aload_1
    //   1567: astore 5
    //   1569: aload_1
    //   1570: new 128	java/lang/StringBuilder
    //   1573: dup
    //   1574: invokespecial 129	java/lang/StringBuilder:<init>	()V
    //   1577: aload 6
    //   1579: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1582: ldc -122
    //   1584: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1587: invokestatic 140	com/tencent/qphone/base/util/BaseApplication:getContext	()Lcom/tencent/qphone/base/util/BaseApplication;
    //   1590: ldc -91
    //   1592: invokevirtual 145	com/tencent/qphone/base/util/BaseApplication:getString	(I)Ljava/lang/String;
    //   1595: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1598: aload_2
    //   1599: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1602: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1605: putfield 151	com/tencent/mobileqq/data/SystemMsg:message	Ljava/lang/String;
    //   1608: aload_1
    //   1609: areturn
    //   1610: aload_1
    //   1611: astore 4
    //   1613: aload_1
    //   1614: astore 5
    //   1616: aload_1
    //   1617: new 128	java/lang/StringBuilder
    //   1620: dup
    //   1621: invokespecial 129	java/lang/StringBuilder:<init>	()V
    //   1624: ldc -100
    //   1626: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1629: aload 6
    //   1631: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1634: ldc -100
    //   1636: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1639: ldc -122
    //   1641: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1644: invokestatic 140	com/tencent/qphone/base/util/BaseApplication:getContext	()Lcom/tencent/qphone/base/util/BaseApplication;
    //   1647: ldc -91
    //   1649: invokevirtual 145	com/tencent/qphone/base/util/BaseApplication:getString	(I)Ljava/lang/String;
    //   1652: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1655: aload_2
    //   1656: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1659: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1662: putfield 151	com/tencent/mobileqq/data/SystemMsg:message	Ljava/lang/String;
    //   1665: aload_1
    //   1666: areturn
    //   1667: aload_1
    //   1668: astore 4
    //   1670: aload_1
    //   1671: astore 5
    //   1673: aload_1
    //   1674: getfield 101	com/tencent/mobileqq/data/SystemMsg:requestUin	Ljava/lang/String;
    //   1677: ifnull +78 -> 1755
    //   1680: aload_1
    //   1681: astore 4
    //   1683: aload_1
    //   1684: astore 5
    //   1686: aload_1
    //   1687: getfield 101	com/tencent/mobileqq/data/SystemMsg:requestUin	Ljava/lang/String;
    //   1690: aload 6
    //   1692: invokevirtual 126	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1695: ifne +60 -> 1755
    //   1698: aload_1
    //   1699: astore 4
    //   1701: aload_1
    //   1702: astore 5
    //   1704: aload_1
    //   1705: new 128	java/lang/StringBuilder
    //   1708: dup
    //   1709: invokespecial 129	java/lang/StringBuilder:<init>	()V
    //   1712: aload 6
    //   1714: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1717: ldc -122
    //   1719: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1722: invokestatic 140	com/tencent/qphone/base/util/BaseApplication:getContext	()Lcom/tencent/qphone/base/util/BaseApplication;
    //   1725: ldc -91
    //   1727: invokevirtual 145	com/tencent/qphone/base/util/BaseApplication:getString	(I)Ljava/lang/String;
    //   1730: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1733: ldc -100
    //   1735: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1738: aload_2
    //   1739: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1742: ldc -100
    //   1744: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1747: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1750: putfield 151	com/tencent/mobileqq/data/SystemMsg:message	Ljava/lang/String;
    //   1753: aload_1
    //   1754: areturn
    //   1755: aload_1
    //   1756: astore 4
    //   1758: aload_1
    //   1759: astore 5
    //   1761: aload_1
    //   1762: new 128	java/lang/StringBuilder
    //   1765: dup
    //   1766: invokespecial 129	java/lang/StringBuilder:<init>	()V
    //   1769: ldc -100
    //   1771: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1774: aload 6
    //   1776: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1779: ldc -100
    //   1781: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1784: ldc -122
    //   1786: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1789: invokestatic 140	com/tencent/qphone/base/util/BaseApplication:getContext	()Lcom/tencent/qphone/base/util/BaseApplication;
    //   1792: ldc -91
    //   1794: invokevirtual 145	com/tencent/qphone/base/util/BaseApplication:getString	(I)Ljava/lang/String;
    //   1797: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1800: ldc -100
    //   1802: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1805: aload_2
    //   1806: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1809: ldc -100
    //   1811: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1814: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1817: putfield 151	com/tencent/mobileqq/data/SystemMsg:message	Ljava/lang/String;
    //   1820: aload_1
    //   1821: areturn
    //   1822: aload_1
    //   1823: astore 4
    //   1825: aload_1
    //   1826: astore 5
    //   1828: aload_1
    //   1829: getfield 96	com/tencent/mobileqq/data/SystemMsg:op	B
    //   1832: iconst_3
    //   1833: if_icmpne +323 -> 2156
    //   1836: aload_1
    //   1837: astore 4
    //   1839: aload_1
    //   1840: astore 5
    //   1842: aload_1
    //   1843: getfield 73	com/tencent/mobileqq/data/SystemMsg:troopCode	Ljava/lang/String;
    //   1846: ifnull +155 -> 2001
    //   1849: aload_1
    //   1850: astore 4
    //   1852: aload_1
    //   1853: astore 5
    //   1855: aload_1
    //   1856: getfield 73	com/tencent/mobileqq/data/SystemMsg:troopCode	Ljava/lang/String;
    //   1859: aload_2
    //   1860: invokevirtual 126	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1863: ifne +138 -> 2001
    //   1866: aload_1
    //   1867: astore 4
    //   1869: aload_1
    //   1870: astore 5
    //   1872: aload_1
    //   1873: getfield 101	com/tencent/mobileqq/data/SystemMsg:requestUin	Ljava/lang/String;
    //   1876: ifnull +68 -> 1944
    //   1879: aload_1
    //   1880: astore 4
    //   1882: aload_1
    //   1883: astore 5
    //   1885: aload_1
    //   1886: getfield 101	com/tencent/mobileqq/data/SystemMsg:requestUin	Ljava/lang/String;
    //   1889: aload 6
    //   1891: invokevirtual 126	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1894: ifne +50 -> 1944
    //   1897: aload_1
    //   1898: astore 4
    //   1900: aload_1
    //   1901: astore 5
    //   1903: aload_1
    //   1904: new 128	java/lang/StringBuilder
    //   1907: dup
    //   1908: invokespecial 129	java/lang/StringBuilder:<init>	()V
    //   1911: aload 6
    //   1913: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1916: ldc -122
    //   1918: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1921: invokestatic 140	com/tencent/qphone/base/util/BaseApplication:getContext	()Lcom/tencent/qphone/base/util/BaseApplication;
    //   1924: ldc -90
    //   1926: invokevirtual 145	com/tencent/qphone/base/util/BaseApplication:getString	(I)Ljava/lang/String;
    //   1929: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1932: aload_2
    //   1933: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1936: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1939: putfield 151	com/tencent/mobileqq/data/SystemMsg:message	Ljava/lang/String;
    //   1942: aload_1
    //   1943: areturn
    //   1944: aload_1
    //   1945: astore 4
    //   1947: aload_1
    //   1948: astore 5
    //   1950: aload_1
    //   1951: new 128	java/lang/StringBuilder
    //   1954: dup
    //   1955: invokespecial 129	java/lang/StringBuilder:<init>	()V
    //   1958: ldc -100
    //   1960: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1963: aload 6
    //   1965: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1968: ldc -100
    //   1970: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1973: ldc -122
    //   1975: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1978: invokestatic 140	com/tencent/qphone/base/util/BaseApplication:getContext	()Lcom/tencent/qphone/base/util/BaseApplication;
    //   1981: ldc -90
    //   1983: invokevirtual 145	com/tencent/qphone/base/util/BaseApplication:getString	(I)Ljava/lang/String;
    //   1986: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1989: aload_2
    //   1990: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1993: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1996: putfield 151	com/tencent/mobileqq/data/SystemMsg:message	Ljava/lang/String;
    //   1999: aload_1
    //   2000: areturn
    //   2001: aload_1
    //   2002: astore 4
    //   2004: aload_1
    //   2005: astore 5
    //   2007: aload_1
    //   2008: getfield 101	com/tencent/mobileqq/data/SystemMsg:requestUin	Ljava/lang/String;
    //   2011: ifnull +78 -> 2089
    //   2014: aload_1
    //   2015: astore 4
    //   2017: aload_1
    //   2018: astore 5
    //   2020: aload_1
    //   2021: getfield 101	com/tencent/mobileqq/data/SystemMsg:requestUin	Ljava/lang/String;
    //   2024: aload 6
    //   2026: invokevirtual 126	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   2029: ifne +60 -> 2089
    //   2032: aload_1
    //   2033: astore 4
    //   2035: aload_1
    //   2036: astore 5
    //   2038: aload_1
    //   2039: new 128	java/lang/StringBuilder
    //   2042: dup
    //   2043: invokespecial 129	java/lang/StringBuilder:<init>	()V
    //   2046: aload 6
    //   2048: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2051: ldc -122
    //   2053: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2056: invokestatic 140	com/tencent/qphone/base/util/BaseApplication:getContext	()Lcom/tencent/qphone/base/util/BaseApplication;
    //   2059: ldc -90
    //   2061: invokevirtual 145	com/tencent/qphone/base/util/BaseApplication:getString	(I)Ljava/lang/String;
    //   2064: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2067: ldc -100
    //   2069: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2072: aload_2
    //   2073: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2076: ldc -100
    //   2078: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2081: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2084: putfield 151	com/tencent/mobileqq/data/SystemMsg:message	Ljava/lang/String;
    //   2087: aload_1
    //   2088: areturn
    //   2089: aload_1
    //   2090: astore 4
    //   2092: aload_1
    //   2093: astore 5
    //   2095: aload_1
    //   2096: new 128	java/lang/StringBuilder
    //   2099: dup
    //   2100: invokespecial 129	java/lang/StringBuilder:<init>	()V
    //   2103: ldc -100
    //   2105: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2108: aload 6
    //   2110: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2113: ldc -100
    //   2115: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2118: ldc -122
    //   2120: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2123: invokestatic 140	com/tencent/qphone/base/util/BaseApplication:getContext	()Lcom/tencent/qphone/base/util/BaseApplication;
    //   2126: ldc -90
    //   2128: invokevirtual 145	com/tencent/qphone/base/util/BaseApplication:getString	(I)Ljava/lang/String;
    //   2131: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2134: ldc -100
    //   2136: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2139: aload_2
    //   2140: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2143: ldc -100
    //   2145: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2148: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2151: putfield 151	com/tencent/mobileqq/data/SystemMsg:message	Ljava/lang/String;
    //   2154: aload_1
    //   2155: areturn
    //   2156: aload_1
    //   2157: astore 4
    //   2159: aload_1
    //   2160: astore 5
    //   2162: aload_1
    //   2163: getfield 96	com/tencent/mobileqq/data/SystemMsg:op	B
    //   2166: iconst_5
    //   2167: if_icmpne +2447 -> 4614
    //   2170: aload_1
    //   2171: astore 4
    //   2173: aload_1
    //   2174: astore 5
    //   2176: aload_1
    //   2177: getfield 73	com/tencent/mobileqq/data/SystemMsg:troopCode	Ljava/lang/String;
    //   2180: ifnull +213 -> 2393
    //   2183: aload_1
    //   2184: astore 4
    //   2186: aload_1
    //   2187: astore 5
    //   2189: aload_1
    //   2190: getfield 73	com/tencent/mobileqq/data/SystemMsg:troopCode	Ljava/lang/String;
    //   2193: aload_2
    //   2194: invokevirtual 126	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   2197: ifne +196 -> 2393
    //   2200: aload_1
    //   2201: astore 4
    //   2203: aload_1
    //   2204: astore 5
    //   2206: aload_1
    //   2207: getfield 101	com/tencent/mobileqq/data/SystemMsg:requestUin	Ljava/lang/String;
    //   2210: ifnull +125 -> 2335
    //   2213: aload_1
    //   2214: astore 4
    //   2216: aload_1
    //   2217: astore 5
    //   2219: aload_1
    //   2220: getfield 101	com/tencent/mobileqq/data/SystemMsg:requestUin	Ljava/lang/String;
    //   2223: aload 6
    //   2225: invokevirtual 126	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   2228: ifne +107 -> 2335
    //   2231: aload_1
    //   2232: astore 4
    //   2234: aload_1
    //   2235: astore 5
    //   2237: aload_1
    //   2238: new 128	java/lang/StringBuilder
    //   2241: dup
    //   2242: invokespecial 129	java/lang/StringBuilder:<init>	()V
    //   2245: aload 6
    //   2247: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2250: ldc -122
    //   2252: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2255: invokestatic 140	com/tencent/qphone/base/util/BaseApplication:getContext	()Lcom/tencent/qphone/base/util/BaseApplication;
    //   2258: ldc -93
    //   2260: invokevirtual 145	com/tencent/qphone/base/util/BaseApplication:getString	(I)Ljava/lang/String;
    //   2263: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2266: aload_2
    //   2267: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2270: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2273: putfield 151	com/tencent/mobileqq/data/SystemMsg:message	Ljava/lang/String;
    //   2276: aload_1
    //   2277: astore 4
    //   2279: aload_1
    //   2280: astore 5
    //   2282: aload_1
    //   2283: new 128	java/lang/StringBuilder
    //   2286: dup
    //   2287: invokespecial 129	java/lang/StringBuilder:<init>	()V
    //   2290: invokestatic 140	com/tencent/qphone/base/util/BaseApplication:getContext	()Lcom/tencent/qphone/base/util/BaseApplication;
    //   2293: ldc -89
    //   2295: invokevirtual 145	com/tencent/qphone/base/util/BaseApplication:getString	(I)Ljava/lang/String;
    //   2298: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2301: ldc -122
    //   2303: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2306: aload 8
    //   2308: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2311: ldc -122
    //   2313: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2316: invokestatic 140	com/tencent/qphone/base/util/BaseApplication:getContext	()Lcom/tencent/qphone/base/util/BaseApplication;
    //   2319: ldc -88
    //   2321: invokevirtual 145	com/tencent/qphone/base/util/BaseApplication:getString	(I)Ljava/lang/String;
    //   2324: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2327: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2330: putfield 90	com/tencent/mobileqq/data/SystemMsg:sMsg	Ljava/lang/String;
    //   2333: aload_1
    //   2334: areturn
    //   2335: aload_1
    //   2336: astore 4
    //   2338: aload_1
    //   2339: astore 5
    //   2341: aload_1
    //   2342: new 128	java/lang/StringBuilder
    //   2345: dup
    //   2346: invokespecial 129	java/lang/StringBuilder:<init>	()V
    //   2349: ldc -100
    //   2351: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2354: aload 6
    //   2356: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2359: ldc -100
    //   2361: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2364: ldc -122
    //   2366: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2369: invokestatic 140	com/tencent/qphone/base/util/BaseApplication:getContext	()Lcom/tencent/qphone/base/util/BaseApplication;
    //   2372: ldc -93
    //   2374: invokevirtual 145	com/tencent/qphone/base/util/BaseApplication:getString	(I)Ljava/lang/String;
    //   2377: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2380: aload_2
    //   2381: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2384: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2387: putfield 151	com/tencent/mobileqq/data/SystemMsg:message	Ljava/lang/String;
    //   2390: goto -114 -> 2276
    //   2393: aload_1
    //   2394: astore 4
    //   2396: aload_1
    //   2397: astore 5
    //   2399: aload_1
    //   2400: getfield 101	com/tencent/mobileqq/data/SystemMsg:requestUin	Ljava/lang/String;
    //   2403: ifnull +79 -> 2482
    //   2406: aload_1
    //   2407: astore 4
    //   2409: aload_1
    //   2410: astore 5
    //   2412: aload_1
    //   2413: getfield 101	com/tencent/mobileqq/data/SystemMsg:requestUin	Ljava/lang/String;
    //   2416: aload 6
    //   2418: invokevirtual 126	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   2421: ifne +61 -> 2482
    //   2424: aload_1
    //   2425: astore 4
    //   2427: aload_1
    //   2428: astore 5
    //   2430: aload_1
    //   2431: new 128	java/lang/StringBuilder
    //   2434: dup
    //   2435: invokespecial 129	java/lang/StringBuilder:<init>	()V
    //   2438: aload 6
    //   2440: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2443: ldc -122
    //   2445: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2448: invokestatic 140	com/tencent/qphone/base/util/BaseApplication:getContext	()Lcom/tencent/qphone/base/util/BaseApplication;
    //   2451: ldc -93
    //   2453: invokevirtual 145	com/tencent/qphone/base/util/BaseApplication:getString	(I)Ljava/lang/String;
    //   2456: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2459: ldc -100
    //   2461: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2464: aload_2
    //   2465: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2468: ldc -100
    //   2470: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2473: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2476: putfield 151	com/tencent/mobileqq/data/SystemMsg:message	Ljava/lang/String;
    //   2479: goto -203 -> 2276
    //   2482: aload_1
    //   2483: astore 4
    //   2485: aload_1
    //   2486: astore 5
    //   2488: aload_1
    //   2489: new 128	java/lang/StringBuilder
    //   2492: dup
    //   2493: invokespecial 129	java/lang/StringBuilder:<init>	()V
    //   2496: ldc -100
    //   2498: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2501: aload 6
    //   2503: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2506: ldc -100
    //   2508: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2511: ldc -122
    //   2513: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2516: invokestatic 140	com/tencent/qphone/base/util/BaseApplication:getContext	()Lcom/tencent/qphone/base/util/BaseApplication;
    //   2519: ldc -93
    //   2521: invokevirtual 145	com/tencent/qphone/base/util/BaseApplication:getString	(I)Ljava/lang/String;
    //   2524: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2527: ldc -100
    //   2529: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2532: aload_2
    //   2533: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2536: ldc -100
    //   2538: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2541: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2544: putfield 151	com/tencent/mobileqq/data/SystemMsg:message	Ljava/lang/String;
    //   2547: goto -271 -> 2276
    //   2550: new 170	java/io/DataInputStream
    //   2553: dup
    //   2554: new 172	java/io/ByteArrayInputStream
    //   2557: dup
    //   2558: aload_1
    //   2559: invokestatic 66	com/tencent/mobileqq/utils/HexUtil:a	(Ljava/lang/String;)[B
    //   2562: invokespecial 175	java/io/ByteArrayInputStream:<init>	([B)V
    //   2565: invokespecial 178	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   2568: astore 6
    //   2570: iload_3
    //   2571: lookupswitch	default:+2045->4616, -2004:+1973->4544, -2003:+1939->4510, -1010:+1520->4091, -1009:+1201->3772, -1008:+897->3468, -1007:+586->3157, -1006:+156->2727, 9:+1939->4510, 187:+156->2727, 188:+586->3157, 189:+897->3468, 190:+1201->3772, 191:+1520->4091, 513:+1973->4544
    //   2692: aload_2
    //   2693: getstatic 183	com/tencent/mobileqq/app/AppConstants:as	Ljava/lang/String;
    //   2696: invokestatic 187	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   2699: invokevirtual 126	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   2702: ifeq +1910 -> 4612
    //   2705: new 2	com/tencent/mobileqq/data/SystemMsg
    //   2708: dup
    //   2709: invokespecial 67	com/tencent/mobileqq/data/SystemMsg:<init>	()V
    //   2712: astore_0
    //   2713: aload_0
    //   2714: astore 4
    //   2716: aload_0
    //   2717: astore 5
    //   2719: aload_0
    //   2720: ldc -67
    //   2722: putfield 151	com/tencent/mobileqq/data/SystemMsg:message	Ljava/lang/String;
    //   2725: aload_0
    //   2726: areturn
    //   2727: new 2	com/tencent/mobileqq/data/SystemMsg
    //   2730: dup
    //   2731: invokespecial 67	com/tencent/mobileqq/data/SystemMsg:<init>	()V
    //   2734: astore_0
    //   2735: aload_0
    //   2736: aload 6
    //   2738: invokevirtual 193	java/io/DataInputStream:readUnsignedByte	()I
    //   2741: putfield 195	com/tencent/mobileqq/data/SystemMsg:cVession	I
    //   2744: aload 6
    //   2746: invokevirtual 193	java/io/DataInputStream:readUnsignedByte	()I
    //   2749: newarray <illegal type>
    //   2751: astore_1
    //   2752: aload 6
    //   2754: aload_1
    //   2755: invokevirtual 199	java/io/DataInputStream:read	([B)I
    //   2758: pop
    //   2759: aload_0
    //   2760: new 122	java/lang/String
    //   2763: dup
    //   2764: aload_1
    //   2765: invokestatic 204	com/tencent/mobileqq/service/message/MessageUtils:b	([B)[B
    //   2768: ldc -50
    //   2770: invokespecial 209	java/lang/String:<init>	([BLjava/lang/String;)V
    //   2773: invokevirtual 160	java/lang/String:trim	()Ljava/lang/String;
    //   2776: putfield 90	com/tencent/mobileqq/data/SystemMsg:sMsg	Ljava/lang/String;
    //   2779: aload 6
    //   2781: lconst_1
    //   2782: invokevirtual 213	java/io/DataInputStream:skip	(J)J
    //   2785: pop2
    //   2786: aload_0
    //   2787: aload 6
    //   2789: invokevirtual 216	java/io/DataInputStream:readUnsignedShort	()I
    //   2792: putfield 218	com/tencent/mobileqq/data/SystemMsg:wSourceID	I
    //   2795: aload_0
    //   2796: aload 6
    //   2798: invokevirtual 216	java/io/DataInputStream:readUnsignedShort	()I
    //   2801: putfield 220	com/tencent/mobileqq/data/SystemMsg:wSourceSubID	I
    //   2804: aload 6
    //   2806: aload 6
    //   2808: invokevirtual 216	java/io/DataInputStream:readUnsignedShort	()I
    //   2811: i2l
    //   2812: invokevirtual 213	java/io/DataInputStream:skip	(J)J
    //   2815: pop2
    //   2816: aload 6
    //   2818: invokevirtual 216	java/io/DataInputStream:readUnsignedShort	()I
    //   2821: ifeq +1805 -> 4626
    //   2824: aload 6
    //   2826: invokevirtual 216	java/io/DataInputStream:readUnsignedShort	()I
    //   2829: istore_3
    //   2830: iload_3
    //   2831: newarray <illegal type>
    //   2833: astore_1
    //   2834: aload 6
    //   2836: aload_1
    //   2837: invokevirtual 199	java/io/DataInputStream:read	([B)I
    //   2840: pop
    //   2841: aload_1
    //   2842: arraylength
    //   2843: ifne +173 -> 3016
    //   2846: aload_0
    //   2847: new 128	java/lang/StringBuilder
    //   2850: dup
    //   2851: invokespecial 129	java/lang/StringBuilder:<init>	()V
    //   2854: ldc -100
    //   2856: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2859: aload_2
    //   2860: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2863: ldc -100
    //   2865: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2868: invokestatic 140	com/tencent/qphone/base/util/BaseApplication:getContext	()Lcom/tencent/qphone/base/util/BaseApplication;
    //   2871: ldc -35
    //   2873: invokevirtual 145	com/tencent/qphone/base/util/BaseApplication:getString	(I)Ljava/lang/String;
    //   2876: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2879: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2882: putfield 151	com/tencent/mobileqq/data/SystemMsg:message	Ljava/lang/String;
    //   2885: aload 6
    //   2887: ldc2_w 222
    //   2890: invokevirtual 213	java/io/DataInputStream:skip	(J)J
    //   2893: pop2
    //   2894: aload 6
    //   2896: aload 6
    //   2898: invokevirtual 216	java/io/DataInputStream:readUnsignedShort	()I
    //   2901: newarray <illegal type>
    //   2903: invokevirtual 199	java/io/DataInputStream:read	([B)I
    //   2906: pop
    //   2907: aload 6
    //   2909: invokevirtual 193	java/io/DataInputStream:readUnsignedByte	()I
    //   2912: pop
    //   2913: aload 6
    //   2915: invokevirtual 193	java/io/DataInputStream:readUnsignedByte	()I
    //   2918: istore 10
    //   2920: iload 9
    //   2922: istore_3
    //   2923: iload_3
    //   2924: iload 10
    //   2926: if_icmpge +229 -> 3155
    //   2929: aload 6
    //   2931: invokevirtual 227	java/io/DataInputStream:readShort	()S
    //   2934: istore 9
    //   2936: aload 6
    //   2938: invokevirtual 227	java/io/DataInputStream:readShort	()S
    //   2941: newarray <illegal type>
    //   2943: astore_1
    //   2944: aload 6
    //   2946: aload_1
    //   2947: invokevirtual 199	java/io/DataInputStream:read	([B)I
    //   2950: pop
    //   2951: iload 9
    //   2953: sipush 1000
    //   2956: if_icmpne +107 -> 3063
    //   2959: new 229	tencent/im/s2c/frdsysmsg/FrdSysMsg$GroupInfo
    //   2962: dup
    //   2963: invokespecial 230	tencent/im/s2c/frdsysmsg/FrdSysMsg$GroupInfo:<init>	()V
    //   2966: astore_2
    //   2967: aload_2
    //   2968: aload_1
    //   2969: invokevirtual 234	tencent/im/s2c/frdsysmsg/FrdSysMsg$GroupInfo:mergeFrom	([B)Lcom/tencent/mobileqq/pb/MessageMicro;
    //   2972: checkcast 229	tencent/im/s2c/frdsysmsg/FrdSysMsg$GroupInfo
    //   2975: astore_1
    //   2976: aload_1
    //   2977: ifnull +1642 -> 4619
    //   2980: aload_0
    //   2981: aload_1
    //   2982: getfield 238	tencent/im/s2c/frdsysmsg/FrdSysMsg$GroupInfo:str_group_name	Lcom/tencent/mobileqq/pb/PBStringField;
    //   2985: invokevirtual 243	com/tencent/mobileqq/pb/PBStringField:get	()Ljava/lang/String;
    //   2988: putfield 245	com/tencent/mobileqq/data/SystemMsg:strGroupName	Ljava/lang/String;
    //   2991: aload_0
    //   2992: aload_1
    //   2993: getfield 248	tencent/im/s2c/frdsysmsg/FrdSysMsg$GroupInfo:str_group_nick	Lcom/tencent/mobileqq/pb/PBStringField;
    //   2996: invokevirtual 243	com/tencent/mobileqq/pb/PBStringField:get	()Ljava/lang/String;
    //   2999: putfield 250	com/tencent/mobileqq/data/SystemMsg:strGroupNickName	Ljava/lang/String;
    //   3002: aload_0
    //   3003: aload_1
    //   3004: getfield 254	tencent/im/s2c/frdsysmsg/FrdSysMsg$GroupInfo:uint64_group_uin	Lcom/tencent/mobileqq/pb/PBUInt64Field;
    //   3007: invokevirtual 259	com/tencent/mobileqq/pb/PBUInt64Field:get	()J
    //   3010: putfield 261	com/tencent/mobileqq/data/SystemMsg:strGroupUin	J
    //   3013: goto +1606 -> 4619
    //   3016: aload_1
    //   3017: invokestatic 204	com/tencent/mobileqq/service/message/MessageUtils:b	([B)[B
    //   3020: pop
    //   3021: aload_0
    //   3022: new 128	java/lang/StringBuilder
    //   3025: dup
    //   3026: invokespecial 129	java/lang/StringBuilder:<init>	()V
    //   3029: ldc -100
    //   3031: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3034: aload_2
    //   3035: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3038: ldc -100
    //   3040: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3043: invokestatic 140	com/tencent/qphone/base/util/BaseApplication:getContext	()Lcom/tencent/qphone/base/util/BaseApplication;
    //   3046: ldc -35
    //   3048: invokevirtual 145	com/tencent/qphone/base/util/BaseApplication:getString	(I)Ljava/lang/String;
    //   3051: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3054: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3057: putfield 151	com/tencent/mobileqq/data/SystemMsg:message	Ljava/lang/String;
    //   3060: goto -175 -> 2885
    //   3063: iload 9
    //   3065: sipush 1001
    //   3068: if_icmpne +38 -> 3106
    //   3071: new 263	tencent/im/s2c/frdsysmsg/FrdSysMsg$TongXunLuNickInfo
    //   3074: dup
    //   3075: invokespecial 264	tencent/im/s2c/frdsysmsg/FrdSysMsg$TongXunLuNickInfo:<init>	()V
    //   3078: astore_2
    //   3079: aload_2
    //   3080: aload_1
    //   3081: invokevirtual 265	tencent/im/s2c/frdsysmsg/FrdSysMsg$TongXunLuNickInfo:mergeFrom	([B)Lcom/tencent/mobileqq/pb/MessageMicro;
    //   3084: checkcast 263	tencent/im/s2c/frdsysmsg/FrdSysMsg$TongXunLuNickInfo
    //   3087: astore_1
    //   3088: aload_1
    //   3089: ifnull +1530 -> 4619
    //   3092: aload_0
    //   3093: aload_1
    //   3094: getfield 268	tencent/im/s2c/frdsysmsg/FrdSysMsg$TongXunLuNickInfo:str_tongxunlu_nickname	Lcom/tencent/mobileqq/pb/PBStringField;
    //   3097: invokevirtual 243	com/tencent/mobileqq/pb/PBStringField:get	()Ljava/lang/String;
    //   3100: putfield 270	com/tencent/mobileqq/data/SystemMsg:strAddressBookNickName	Ljava/lang/String;
    //   3103: goto +1516 -> 4619
    //   3106: iload 9
    //   3108: sipush 1002
    //   3111: if_icmpne +1508 -> 4619
    //   3114: new 272	tencent/im/s2c/frdsysmsg/FrdSysMsg$FriendMiscInfo
    //   3117: dup
    //   3118: invokespecial 273	tencent/im/s2c/frdsysmsg/FrdSysMsg$FriendMiscInfo:<init>	()V
    //   3121: astore_2
    //   3122: aload_2
    //   3123: aload_1
    //   3124: invokevirtual 274	tencent/im/s2c/frdsysmsg/FrdSysMsg$FriendMiscInfo:mergeFrom	([B)Lcom/tencent/mobileqq/pb/MessageMicro;
    //   3127: checkcast 272	tencent/im/s2c/frdsysmsg/FrdSysMsg$FriendMiscInfo
    //   3130: astore_1
    //   3131: aload_1
    //   3132: ifnull +1487 -> 4619
    //   3135: aload_0
    //   3136: aload_1
    //   3137: getfield 277	tencent/im/s2c/frdsysmsg/FrdSysMsg$FriendMiscInfo:str_fromuin_nick	Lcom/tencent/mobileqq/pb/PBStringField;
    //   3140: invokevirtual 243	com/tencent/mobileqq/pb/PBStringField:get	()Ljava/lang/String;
    //   3143: putfield 47	com/tencent/mobileqq/data/SystemMsg:strServerFromUinNickName	Ljava/lang/String;
    //   3146: goto +1473 -> 4619
    //   3149: astore_1
    //   3150: aconst_null
    //   3151: astore_1
    //   3152: goto -21 -> 3131
    //   3155: aload_0
    //   3156: areturn
    //   3157: new 2	com/tencent/mobileqq/data/SystemMsg
    //   3160: dup
    //   3161: invokespecial 67	com/tencent/mobileqq/data/SystemMsg:<init>	()V
    //   3164: astore_0
    //   3165: aload_0
    //   3166: aload 6
    //   3168: invokevirtual 193	java/io/DataInputStream:readUnsignedByte	()I
    //   3171: putfield 195	com/tencent/mobileqq/data/SystemMsg:cVession	I
    //   3174: aload 6
    //   3176: invokevirtual 193	java/io/DataInputStream:readUnsignedByte	()I
    //   3179: pop
    //   3180: aload 6
    //   3182: invokevirtual 216	java/io/DataInputStream:readUnsignedShort	()I
    //   3185: ifeq +1478 -> 4663
    //   3188: aload 6
    //   3190: invokevirtual 216	java/io/DataInputStream:readUnsignedShort	()I
    //   3193: istore_3
    //   3194: iload_3
    //   3195: newarray <illegal type>
    //   3197: astore_1
    //   3198: aload 6
    //   3200: aload_1
    //   3201: invokevirtual 199	java/io/DataInputStream:read	([B)I
    //   3204: pop
    //   3205: aload_1
    //   3206: arraylength
    //   3207: ifne +146 -> 3353
    //   3210: aload_0
    //   3211: new 128	java/lang/StringBuilder
    //   3214: dup
    //   3215: invokespecial 129	java/lang/StringBuilder:<init>	()V
    //   3218: ldc -100
    //   3220: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3223: aload_2
    //   3224: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3227: ldc -100
    //   3229: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3232: invokestatic 140	com/tencent/qphone/base/util/BaseApplication:getContext	()Lcom/tencent/qphone/base/util/BaseApplication;
    //   3235: ldc_w 278
    //   3238: invokevirtual 145	com/tencent/qphone/base/util/BaseApplication:getString	(I)Ljava/lang/String;
    //   3241: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3244: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3247: putfield 151	com/tencent/mobileqq/data/SystemMsg:message	Ljava/lang/String;
    //   3250: aload 6
    //   3252: ldc2_w 222
    //   3255: invokevirtual 213	java/io/DataInputStream:skip	(J)J
    //   3258: pop2
    //   3259: aload 6
    //   3261: aload 6
    //   3263: invokevirtual 216	java/io/DataInputStream:readUnsignedShort	()I
    //   3266: newarray <illegal type>
    //   3268: invokevirtual 199	java/io/DataInputStream:read	([B)I
    //   3271: pop
    //   3272: aload 6
    //   3274: invokevirtual 193	java/io/DataInputStream:readUnsignedByte	()I
    //   3277: istore 9
    //   3279: iload 10
    //   3281: istore_3
    //   3282: iload_3
    //   3283: iload 9
    //   3285: if_icmpge +181 -> 3466
    //   3288: aload 6
    //   3290: invokevirtual 227	java/io/DataInputStream:readShort	()S
    //   3293: istore 10
    //   3295: aload 6
    //   3297: invokevirtual 227	java/io/DataInputStream:readShort	()S
    //   3300: newarray <illegal type>
    //   3302: astore_1
    //   3303: aload 6
    //   3305: aload_1
    //   3306: invokevirtual 199	java/io/DataInputStream:read	([B)I
    //   3309: pop
    //   3310: iload 10
    //   3312: sipush 1002
    //   3315: if_icmpne +93 -> 3408
    //   3318: new 272	tencent/im/s2c/frdsysmsg/FrdSysMsg$FriendMiscInfo
    //   3321: dup
    //   3322: invokespecial 273	tencent/im/s2c/frdsysmsg/FrdSysMsg$FriendMiscInfo:<init>	()V
    //   3325: astore_2
    //   3326: aload_2
    //   3327: aload_1
    //   3328: invokevirtual 274	tencent/im/s2c/frdsysmsg/FrdSysMsg$FriendMiscInfo:mergeFrom	([B)Lcom/tencent/mobileqq/pb/MessageMicro;
    //   3331: checkcast 272	tencent/im/s2c/frdsysmsg/FrdSysMsg$FriendMiscInfo
    //   3334: astore_1
    //   3335: aload_1
    //   3336: ifnull +1320 -> 4656
    //   3339: aload_0
    //   3340: aload_1
    //   3341: getfield 277	tencent/im/s2c/frdsysmsg/FrdSysMsg$FriendMiscInfo:str_fromuin_nick	Lcom/tencent/mobileqq/pb/PBStringField;
    //   3344: invokevirtual 243	com/tencent/mobileqq/pb/PBStringField:get	()Ljava/lang/String;
    //   3347: putfield 47	com/tencent/mobileqq/data/SystemMsg:strServerFromUinNickName	Ljava/lang/String;
    //   3350: goto +1306 -> 4656
    //   3353: new 122	java/lang/String
    //   3356: dup
    //   3357: aload_1
    //   3358: invokestatic 204	com/tencent/mobileqq/service/message/MessageUtils:b	([B)[B
    //   3361: invokespecial 279	java/lang/String:<init>	([B)V
    //   3364: pop
    //   3365: aload_0
    //   3366: new 128	java/lang/StringBuilder
    //   3369: dup
    //   3370: invokespecial 129	java/lang/StringBuilder:<init>	()V
    //   3373: ldc -100
    //   3375: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3378: aload_2
    //   3379: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3382: ldc -100
    //   3384: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3387: invokestatic 140	com/tencent/qphone/base/util/BaseApplication:getContext	()Lcom/tencent/qphone/base/util/BaseApplication;
    //   3390: ldc_w 278
    //   3393: invokevirtual 145	com/tencent/qphone/base/util/BaseApplication:getString	(I)Ljava/lang/String;
    //   3396: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3399: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3402: putfield 151	com/tencent/mobileqq/data/SystemMsg:message	Ljava/lang/String;
    //   3405: goto -155 -> 3250
    //   3408: iload 10
    //   3410: sipush 1003
    //   3413: if_icmpne +1243 -> 4656
    //   3416: new 281	tencent/im/s2c/frdsysmsg/FrdSysMsg$FriendHelloInfo
    //   3419: dup
    //   3420: invokespecial 282	tencent/im/s2c/frdsysmsg/FrdSysMsg$FriendHelloInfo:<init>	()V
    //   3423: astore_2
    //   3424: aload_2
    //   3425: aload_1
    //   3426: invokevirtual 283	tencent/im/s2c/frdsysmsg/FrdSysMsg$FriendHelloInfo:mergeFrom	([B)Lcom/tencent/mobileqq/pb/MessageMicro;
    //   3429: checkcast 281	tencent/im/s2c/frdsysmsg/FrdSysMsg$FriendHelloInfo
    //   3432: astore_1
    //   3433: aload_1
    //   3434: ifnull +1222 -> 4656
    //   3437: aload_0
    //   3438: aload_1
    //   3439: getfield 286	tencent/im/s2c/frdsysmsg/FrdSysMsg$FriendHelloInfo:str_source_name	Lcom/tencent/mobileqq/pb/PBStringField;
    //   3442: invokevirtual 243	com/tencent/mobileqq/pb/PBStringField:get	()Ljava/lang/String;
    //   3445: putfield 49	com/tencent/mobileqq/data/SystemMsg:strGameName	Ljava/lang/String;
    //   3448: goto +1208 -> 4656
    //   3451: astore_1
    //   3452: aload_0
    //   3453: astore 5
    //   3455: aload_1
    //   3456: astore_0
    //   3457: goto -2987 -> 470
    //   3460: astore_1
    //   3461: aconst_null
    //   3462: astore_1
    //   3463: goto -30 -> 3433
    //   3466: aload_0
    //   3467: areturn
    //   3468: new 2	com/tencent/mobileqq/data/SystemMsg
    //   3471: dup
    //   3472: invokespecial 67	com/tencent/mobileqq/data/SystemMsg:<init>	()V
    //   3475: astore_0
    //   3476: aload_0
    //   3477: aload 6
    //   3479: invokevirtual 193	java/io/DataInputStream:readUnsignedByte	()I
    //   3482: putfield 195	com/tencent/mobileqq/data/SystemMsg:cVession	I
    //   3485: aload 6
    //   3487: invokevirtual 193	java/io/DataInputStream:readUnsignedByte	()I
    //   3490: pop
    //   3491: aload 6
    //   3493: invokevirtual 216	java/io/DataInputStream:readUnsignedShort	()I
    //   3496: ifeq +1189 -> 4685
    //   3499: aload 6
    //   3501: invokevirtual 216	java/io/DataInputStream:readUnsignedShort	()I
    //   3504: istore_3
    //   3505: iload_3
    //   3506: newarray <illegal type>
    //   3508: astore_1
    //   3509: aload 6
    //   3511: aload_1
    //   3512: invokevirtual 199	java/io/DataInputStream:read	([B)I
    //   3515: pop
    //   3516: aload_1
    //   3517: arraylength
    //   3518: ifne +146 -> 3664
    //   3521: aload_0
    //   3522: new 128	java/lang/StringBuilder
    //   3525: dup
    //   3526: invokespecial 129	java/lang/StringBuilder:<init>	()V
    //   3529: ldc -100
    //   3531: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3534: aload_2
    //   3535: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3538: ldc -100
    //   3540: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3543: invokestatic 140	com/tencent/qphone/base/util/BaseApplication:getContext	()Lcom/tencent/qphone/base/util/BaseApplication;
    //   3546: ldc_w 287
    //   3549: invokevirtual 145	com/tencent/qphone/base/util/BaseApplication:getString	(I)Ljava/lang/String;
    //   3552: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3555: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3558: putfield 151	com/tencent/mobileqq/data/SystemMsg:message	Ljava/lang/String;
    //   3561: aload 6
    //   3563: ldc2_w 222
    //   3566: invokevirtual 213	java/io/DataInputStream:skip	(J)J
    //   3569: pop2
    //   3570: aload 6
    //   3572: aload 6
    //   3574: invokevirtual 216	java/io/DataInputStream:readUnsignedShort	()I
    //   3577: newarray <illegal type>
    //   3579: invokevirtual 199	java/io/DataInputStream:read	([B)I
    //   3582: pop
    //   3583: aload 6
    //   3585: invokevirtual 193	java/io/DataInputStream:readUnsignedByte	()I
    //   3588: istore 9
    //   3590: iload 11
    //   3592: istore_3
    //   3593: iload_3
    //   3594: iload 9
    //   3596: if_icmpge +174 -> 3770
    //   3599: aload 6
    //   3601: invokevirtual 227	java/io/DataInputStream:readShort	()S
    //   3604: istore 10
    //   3606: aload 6
    //   3608: invokevirtual 227	java/io/DataInputStream:readShort	()S
    //   3611: newarray <illegal type>
    //   3613: astore_1
    //   3614: aload 6
    //   3616: aload_1
    //   3617: invokevirtual 199	java/io/DataInputStream:read	([B)I
    //   3620: pop
    //   3621: iload 10
    //   3623: sipush 1002
    //   3626: if_icmpne +86 -> 3712
    //   3629: new 272	tencent/im/s2c/frdsysmsg/FrdSysMsg$FriendMiscInfo
    //   3632: dup
    //   3633: invokespecial 273	tencent/im/s2c/frdsysmsg/FrdSysMsg$FriendMiscInfo:<init>	()V
    //   3636: astore_2
    //   3637: aload_2
    //   3638: aload_1
    //   3639: invokevirtual 274	tencent/im/s2c/frdsysmsg/FrdSysMsg$FriendMiscInfo:mergeFrom	([B)Lcom/tencent/mobileqq/pb/MessageMicro;
    //   3642: checkcast 272	tencent/im/s2c/frdsysmsg/FrdSysMsg$FriendMiscInfo
    //   3645: astore_1
    //   3646: aload_1
    //   3647: ifnull +1031 -> 4678
    //   3650: aload_0
    //   3651: aload_1
    //   3652: getfield 277	tencent/im/s2c/frdsysmsg/FrdSysMsg$FriendMiscInfo:str_fromuin_nick	Lcom/tencent/mobileqq/pb/PBStringField;
    //   3655: invokevirtual 243	com/tencent/mobileqq/pb/PBStringField:get	()Ljava/lang/String;
    //   3658: putfield 47	com/tencent/mobileqq/data/SystemMsg:strServerFromUinNickName	Ljava/lang/String;
    //   3661: goto +1017 -> 4678
    //   3664: aload_1
    //   3665: invokestatic 204	com/tencent/mobileqq/service/message/MessageUtils:b	([B)[B
    //   3668: pop
    //   3669: aload_0
    //   3670: new 128	java/lang/StringBuilder
    //   3673: dup
    //   3674: invokespecial 129	java/lang/StringBuilder:<init>	()V
    //   3677: ldc -100
    //   3679: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3682: aload_2
    //   3683: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3686: ldc -100
    //   3688: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3691: invokestatic 140	com/tencent/qphone/base/util/BaseApplication:getContext	()Lcom/tencent/qphone/base/util/BaseApplication;
    //   3694: ldc_w 287
    //   3697: invokevirtual 145	com/tencent/qphone/base/util/BaseApplication:getString	(I)Ljava/lang/String;
    //   3700: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3703: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3706: putfield 151	com/tencent/mobileqq/data/SystemMsg:message	Ljava/lang/String;
    //   3709: goto -148 -> 3561
    //   3712: iload 10
    //   3714: sipush 1003
    //   3717: if_icmpne +961 -> 4678
    //   3720: new 281	tencent/im/s2c/frdsysmsg/FrdSysMsg$FriendHelloInfo
    //   3723: dup
    //   3724: invokespecial 282	tencent/im/s2c/frdsysmsg/FrdSysMsg$FriendHelloInfo:<init>	()V
    //   3727: astore_2
    //   3728: aload_2
    //   3729: aload_1
    //   3730: invokevirtual 283	tencent/im/s2c/frdsysmsg/FrdSysMsg$FriendHelloInfo:mergeFrom	([B)Lcom/tencent/mobileqq/pb/MessageMicro;
    //   3733: checkcast 281	tencent/im/s2c/frdsysmsg/FrdSysMsg$FriendHelloInfo
    //   3736: astore_1
    //   3737: aload_1
    //   3738: ifnull +940 -> 4678
    //   3741: aload_0
    //   3742: aload_1
    //   3743: getfield 286	tencent/im/s2c/frdsysmsg/FrdSysMsg$FriendHelloInfo:str_source_name	Lcom/tencent/mobileqq/pb/PBStringField;
    //   3746: invokevirtual 243	com/tencent/mobileqq/pb/PBStringField:get	()Ljava/lang/String;
    //   3749: putfield 49	com/tencent/mobileqq/data/SystemMsg:strGameName	Ljava/lang/String;
    //   3752: goto +926 -> 4678
    //   3755: astore_1
    //   3756: aload_0
    //   3757: astore 5
    //   3759: aload_1
    //   3760: astore_0
    //   3761: goto -3291 -> 470
    //   3764: astore_1
    //   3765: aconst_null
    //   3766: astore_1
    //   3767: goto -30 -> 3737
    //   3770: aload_0
    //   3771: areturn
    //   3772: new 2	com/tencent/mobileqq/data/SystemMsg
    //   3775: dup
    //   3776: invokespecial 67	com/tencent/mobileqq/data/SystemMsg:<init>	()V
    //   3779: astore_0
    //   3780: aload_0
    //   3781: aload 6
    //   3783: invokevirtual 193	java/io/DataInputStream:readUnsignedByte	()I
    //   3786: putfield 195	com/tencent/mobileqq/data/SystemMsg:cVession	I
    //   3789: aload 6
    //   3791: invokevirtual 193	java/io/DataInputStream:readUnsignedByte	()I
    //   3794: newarray <illegal type>
    //   3796: astore_1
    //   3797: aload 6
    //   3799: aload_1
    //   3800: invokevirtual 199	java/io/DataInputStream:read	([B)I
    //   3803: pop
    //   3804: new 122	java/lang/String
    //   3807: dup
    //   3808: aload_1
    //   3809: invokestatic 204	com/tencent/mobileqq/service/message/MessageUtils:b	([B)[B
    //   3812: invokespecial 279	java/lang/String:<init>	([B)V
    //   3815: invokevirtual 160	java/lang/String:trim	()Ljava/lang/String;
    //   3818: astore 4
    //   3820: aload 4
    //   3822: ifnull +16 -> 3838
    //   3825: aload 4
    //   3827: astore_1
    //   3828: ldc 45
    //   3830: aload 4
    //   3832: invokevirtual 126	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   3835: ifeq +12 -> 3847
    //   3838: invokestatic 140	com/tencent/qphone/base/util/BaseApplication:getContext	()Lcom/tencent/qphone/base/util/BaseApplication;
    //   3841: ldc -95
    //   3843: invokevirtual 145	com/tencent/qphone/base/util/BaseApplication:getString	(I)Ljava/lang/String;
    //   3846: astore_1
    //   3847: aload_0
    //   3848: aload_1
    //   3849: putfield 90	com/tencent/mobileqq/data/SystemMsg:sMsg	Ljava/lang/String;
    //   3852: aload 6
    //   3854: invokevirtual 216	java/io/DataInputStream:readUnsignedShort	()I
    //   3857: ifeq +850 -> 4707
    //   3860: aload 6
    //   3862: invokevirtual 216	java/io/DataInputStream:readUnsignedShort	()I
    //   3865: istore_3
    //   3866: iload_3
    //   3867: newarray <illegal type>
    //   3869: astore_1
    //   3870: aload 6
    //   3872: aload_1
    //   3873: invokevirtual 199	java/io/DataInputStream:read	([B)I
    //   3876: pop
    //   3877: aload_1
    //   3878: arraylength
    //   3879: ifne +152 -> 4031
    //   3882: aload_0
    //   3883: new 128	java/lang/StringBuilder
    //   3886: dup
    //   3887: invokespecial 129	java/lang/StringBuilder:<init>	()V
    //   3890: ldc -100
    //   3892: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3895: aload_2
    //   3896: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3899: ldc -100
    //   3901: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3904: invokestatic 140	com/tencent/qphone/base/util/BaseApplication:getContext	()Lcom/tencent/qphone/base/util/BaseApplication;
    //   3907: ldc_w 288
    //   3910: invokevirtual 145	com/tencent/qphone/base/util/BaseApplication:getString	(I)Ljava/lang/String;
    //   3913: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3916: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3919: putfield 151	com/tencent/mobileqq/data/SystemMsg:message	Ljava/lang/String;
    //   3922: aload 6
    //   3924: ldc2_w 222
    //   3927: invokevirtual 213	java/io/DataInputStream:skip	(J)J
    //   3930: pop2
    //   3931: aload 6
    //   3933: aload 6
    //   3935: invokevirtual 216	java/io/DataInputStream:readUnsignedShort	()I
    //   3938: newarray <illegal type>
    //   3940: invokevirtual 199	java/io/DataInputStream:read	([B)I
    //   3943: pop
    //   3944: aload 6
    //   3946: invokevirtual 193	java/io/DataInputStream:readUnsignedByte	()I
    //   3949: pop
    //   3950: aload 6
    //   3952: invokevirtual 193	java/io/DataInputStream:readUnsignedByte	()I
    //   3955: istore 9
    //   3957: iload 12
    //   3959: istore_3
    //   3960: iload_3
    //   3961: iload 9
    //   3963: if_icmpge +126 -> 4089
    //   3966: aload 6
    //   3968: invokevirtual 227	java/io/DataInputStream:readShort	()S
    //   3971: istore 10
    //   3973: aload 6
    //   3975: invokevirtual 227	java/io/DataInputStream:readShort	()S
    //   3978: newarray <illegal type>
    //   3980: astore_1
    //   3981: aload 6
    //   3983: aload_1
    //   3984: invokevirtual 199	java/io/DataInputStream:read	([B)I
    //   3987: pop
    //   3988: iload 10
    //   3990: sipush 1002
    //   3993: if_icmpne +707 -> 4700
    //   3996: new 272	tencent/im/s2c/frdsysmsg/FrdSysMsg$FriendMiscInfo
    //   3999: dup
    //   4000: invokespecial 273	tencent/im/s2c/frdsysmsg/FrdSysMsg$FriendMiscInfo:<init>	()V
    //   4003: astore_2
    //   4004: aload_2
    //   4005: aload_1
    //   4006: invokevirtual 274	tencent/im/s2c/frdsysmsg/FrdSysMsg$FriendMiscInfo:mergeFrom	([B)Lcom/tencent/mobileqq/pb/MessageMicro;
    //   4009: checkcast 272	tencent/im/s2c/frdsysmsg/FrdSysMsg$FriendMiscInfo
    //   4012: astore_1
    //   4013: aload_1
    //   4014: ifnull +686 -> 4700
    //   4017: aload_0
    //   4018: aload_1
    //   4019: getfield 277	tencent/im/s2c/frdsysmsg/FrdSysMsg$FriendMiscInfo:str_fromuin_nick	Lcom/tencent/mobileqq/pb/PBStringField;
    //   4022: invokevirtual 243	com/tencent/mobileqq/pb/PBStringField:get	()Ljava/lang/String;
    //   4025: putfield 47	com/tencent/mobileqq/data/SystemMsg:strServerFromUinNickName	Ljava/lang/String;
    //   4028: goto +672 -> 4700
    //   4031: aload_1
    //   4032: invokestatic 204	com/tencent/mobileqq/service/message/MessageUtils:b	([B)[B
    //   4035: pop
    //   4036: aload_0
    //   4037: new 128	java/lang/StringBuilder
    //   4040: dup
    //   4041: invokespecial 129	java/lang/StringBuilder:<init>	()V
    //   4044: ldc -100
    //   4046: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4049: aload_2
    //   4050: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4053: ldc -100
    //   4055: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4058: invokestatic 140	com/tencent/qphone/base/util/BaseApplication:getContext	()Lcom/tencent/qphone/base/util/BaseApplication;
    //   4061: ldc_w 288
    //   4064: invokevirtual 145	com/tencent/qphone/base/util/BaseApplication:getString	(I)Ljava/lang/String;
    //   4067: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4070: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   4073: putfield 151	com/tencent/mobileqq/data/SystemMsg:message	Ljava/lang/String;
    //   4076: goto -154 -> 3922
    //   4079: astore_1
    //   4080: goto -3670 -> 410
    //   4083: astore_1
    //   4084: aconst_null
    //   4085: astore_1
    //   4086: goto -73 -> 4013
    //   4089: aload_0
    //   4090: areturn
    //   4091: new 2	com/tencent/mobileqq/data/SystemMsg
    //   4094: dup
    //   4095: invokespecial 67	com/tencent/mobileqq/data/SystemMsg:<init>	()V
    //   4098: astore_0
    //   4099: aload_0
    //   4100: astore 4
    //   4102: aload_0
    //   4103: astore 5
    //   4105: aload_0
    //   4106: new 128	java/lang/StringBuilder
    //   4109: dup
    //   4110: invokespecial 129	java/lang/StringBuilder:<init>	()V
    //   4113: ldc -100
    //   4115: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4118: aload_2
    //   4119: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4122: ldc -100
    //   4124: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4127: invokestatic 140	com/tencent/qphone/base/util/BaseApplication:getContext	()Lcom/tencent/qphone/base/util/BaseApplication;
    //   4130: ldc_w 289
    //   4133: invokevirtual 145	com/tencent/qphone/base/util/BaseApplication:getString	(I)Ljava/lang/String;
    //   4136: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4139: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   4142: putfield 151	com/tencent/mobileqq/data/SystemMsg:message	Ljava/lang/String;
    //   4145: aload_0
    //   4146: astore 4
    //   4148: new 2	com/tencent/mobileqq/data/SystemMsg
    //   4151: dup
    //   4152: invokespecial 67	com/tencent/mobileqq/data/SystemMsg:<init>	()V
    //   4155: astore_1
    //   4156: aload_1
    //   4157: aload 6
    //   4159: invokevirtual 193	java/io/DataInputStream:readUnsignedByte	()I
    //   4162: putfield 195	com/tencent/mobileqq/data/SystemMsg:cVession	I
    //   4165: aload 6
    //   4167: aload 6
    //   4169: invokevirtual 193	java/io/DataInputStream:readUnsignedByte	()I
    //   4172: newarray <illegal type>
    //   4174: invokevirtual 199	java/io/DataInputStream:read	([B)I
    //   4177: pop
    //   4178: aload_1
    //   4179: aload 6
    //   4181: invokevirtual 216	java/io/DataInputStream:readUnsignedShort	()I
    //   4184: putfield 218	com/tencent/mobileqq/data/SystemMsg:wSourceID	I
    //   4187: aload_1
    //   4188: aload 6
    //   4190: invokevirtual 216	java/io/DataInputStream:readUnsignedShort	()I
    //   4193: putfield 220	com/tencent/mobileqq/data/SystemMsg:wSourceSubID	I
    //   4196: aload 6
    //   4198: aload 6
    //   4200: invokevirtual 216	java/io/DataInputStream:readUnsignedShort	()I
    //   4203: i2l
    //   4204: invokevirtual 213	java/io/DataInputStream:skip	(J)J
    //   4207: pop2
    //   4208: aload 6
    //   4210: invokevirtual 216	java/io/DataInputStream:readUnsignedShort	()I
    //   4213: ifeq +506 -> 4719
    //   4216: aload 6
    //   4218: invokevirtual 216	java/io/DataInputStream:readUnsignedShort	()I
    //   4221: istore_3
    //   4222: iload_3
    //   4223: newarray <illegal type>
    //   4225: astore_0
    //   4226: aload 6
    //   4228: aload_0
    //   4229: invokevirtual 199	java/io/DataInputStream:read	([B)I
    //   4232: pop
    //   4233: aload_0
    //   4234: arraylength
    //   4235: ifne +168 -> 4403
    //   4238: aload_1
    //   4239: new 128	java/lang/StringBuilder
    //   4242: dup
    //   4243: invokespecial 129	java/lang/StringBuilder:<init>	()V
    //   4246: ldc -100
    //   4248: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4251: aload_2
    //   4252: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4255: ldc -100
    //   4257: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4260: invokestatic 140	com/tencent/qphone/base/util/BaseApplication:getContext	()Lcom/tencent/qphone/base/util/BaseApplication;
    //   4263: ldc_w 289
    //   4266: invokevirtual 145	com/tencent/qphone/base/util/BaseApplication:getString	(I)Ljava/lang/String;
    //   4269: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4272: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   4275: putfield 151	com/tencent/mobileqq/data/SystemMsg:message	Ljava/lang/String;
    //   4278: aload 6
    //   4280: ldc2_w 222
    //   4283: invokevirtual 213	java/io/DataInputStream:skip	(J)J
    //   4286: pop2
    //   4287: aload 6
    //   4289: aload 6
    //   4291: invokevirtual 216	java/io/DataInputStream:readUnsignedShort	()I
    //   4294: newarray <illegal type>
    //   4296: invokevirtual 199	java/io/DataInputStream:read	([B)I
    //   4299: pop
    //   4300: aload 6
    //   4302: invokevirtual 193	java/io/DataInputStream:readUnsignedByte	()I
    //   4305: istore 9
    //   4307: iload 13
    //   4309: istore_3
    //   4310: iload_3
    //   4311: iload 9
    //   4313: if_icmpge +195 -> 4508
    //   4316: aload 6
    //   4318: invokevirtual 227	java/io/DataInputStream:readShort	()S
    //   4321: istore 10
    //   4323: aload 6
    //   4325: invokevirtual 227	java/io/DataInputStream:readShort	()S
    //   4328: newarray <illegal type>
    //   4330: astore_0
    //   4331: aload 6
    //   4333: aload_0
    //   4334: invokevirtual 199	java/io/DataInputStream:read	([B)I
    //   4337: pop
    //   4338: iload 10
    //   4340: sipush 1000
    //   4343: if_icmpne +108 -> 4451
    //   4346: new 229	tencent/im/s2c/frdsysmsg/FrdSysMsg$GroupInfo
    //   4349: dup
    //   4350: invokespecial 230	tencent/im/s2c/frdsysmsg/FrdSysMsg$GroupInfo:<init>	()V
    //   4353: astore_2
    //   4354: aload_2
    //   4355: aload_0
    //   4356: invokevirtual 234	tencent/im/s2c/frdsysmsg/FrdSysMsg$GroupInfo:mergeFrom	([B)Lcom/tencent/mobileqq/pb/MessageMicro;
    //   4359: checkcast 229	tencent/im/s2c/frdsysmsg/FrdSysMsg$GroupInfo
    //   4362: astore_0
    //   4363: aload_0
    //   4364: ifnull +348 -> 4712
    //   4367: aload_1
    //   4368: aload_0
    //   4369: getfield 238	tencent/im/s2c/frdsysmsg/FrdSysMsg$GroupInfo:str_group_name	Lcom/tencent/mobileqq/pb/PBStringField;
    //   4372: invokevirtual 243	com/tencent/mobileqq/pb/PBStringField:get	()Ljava/lang/String;
    //   4375: putfield 245	com/tencent/mobileqq/data/SystemMsg:strGroupName	Ljava/lang/String;
    //   4378: aload_1
    //   4379: aload_0
    //   4380: getfield 248	tencent/im/s2c/frdsysmsg/FrdSysMsg$GroupInfo:str_group_nick	Lcom/tencent/mobileqq/pb/PBStringField;
    //   4383: invokevirtual 243	com/tencent/mobileqq/pb/PBStringField:get	()Ljava/lang/String;
    //   4386: putfield 250	com/tencent/mobileqq/data/SystemMsg:strGroupNickName	Ljava/lang/String;
    //   4389: aload_1
    //   4390: aload_0
    //   4391: getfield 254	tencent/im/s2c/frdsysmsg/FrdSysMsg$GroupInfo:uint64_group_uin	Lcom/tencent/mobileqq/pb/PBUInt64Field;
    //   4394: invokevirtual 259	com/tencent/mobileqq/pb/PBUInt64Field:get	()J
    //   4397: putfield 261	com/tencent/mobileqq/data/SystemMsg:strGroupUin	J
    //   4400: goto +312 -> 4712
    //   4403: aload_0
    //   4404: invokestatic 204	com/tencent/mobileqq/service/message/MessageUtils:b	([B)[B
    //   4407: pop
    //   4408: aload_1
    //   4409: new 128	java/lang/StringBuilder
    //   4412: dup
    //   4413: invokespecial 129	java/lang/StringBuilder:<init>	()V
    //   4416: ldc -100
    //   4418: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4421: aload_2
    //   4422: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4425: ldc -100
    //   4427: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4430: invokestatic 140	com/tencent/qphone/base/util/BaseApplication:getContext	()Lcom/tencent/qphone/base/util/BaseApplication;
    //   4433: ldc_w 289
    //   4436: invokevirtual 145	com/tencent/qphone/base/util/BaseApplication:getString	(I)Ljava/lang/String;
    //   4439: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4442: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   4445: putfield 151	com/tencent/mobileqq/data/SystemMsg:message	Ljava/lang/String;
    //   4448: goto -170 -> 4278
    //   4451: iload 10
    //   4453: sipush 1002
    //   4456: if_icmpne +256 -> 4712
    //   4459: new 272	tencent/im/s2c/frdsysmsg/FrdSysMsg$FriendMiscInfo
    //   4462: dup
    //   4463: invokespecial 273	tencent/im/s2c/frdsysmsg/FrdSysMsg$FriendMiscInfo:<init>	()V
    //   4466: astore_2
    //   4467: aload_2
    //   4468: aload_0
    //   4469: invokevirtual 274	tencent/im/s2c/frdsysmsg/FrdSysMsg$FriendMiscInfo:mergeFrom	([B)Lcom/tencent/mobileqq/pb/MessageMicro;
    //   4472: checkcast 272	tencent/im/s2c/frdsysmsg/FrdSysMsg$FriendMiscInfo
    //   4475: astore_0
    //   4476: aload_0
    //   4477: ifnull +235 -> 4712
    //   4480: aload_1
    //   4481: aload_0
    //   4482: getfield 277	tencent/im/s2c/frdsysmsg/FrdSysMsg$FriendMiscInfo:str_fromuin_nick	Lcom/tencent/mobileqq/pb/PBStringField;
    //   4485: invokevirtual 243	com/tencent/mobileqq/pb/PBStringField:get	()Ljava/lang/String;
    //   4488: putfield 47	com/tencent/mobileqq/data/SystemMsg:strServerFromUinNickName	Ljava/lang/String;
    //   4491: goto +221 -> 4712
    //   4494: astore_2
    //   4495: aload_1
    //   4496: astore_0
    //   4497: aload_2
    //   4498: astore_1
    //   4499: goto -4089 -> 410
    //   4502: astore_0
    //   4503: aconst_null
    //   4504: astore_0
    //   4505: goto -29 -> 4476
    //   4508: aload_1
    //   4509: areturn
    //   4510: aload_2
    //   4511: getstatic 183	com/tencent/mobileqq/app/AppConstants:as	Ljava/lang/String;
    //   4514: invokestatic 187	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   4517: invokevirtual 126	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   4520: ifeq +92 -> 4612
    //   4523: new 2	com/tencent/mobileqq/data/SystemMsg
    //   4526: dup
    //   4527: invokespecial 67	com/tencent/mobileqq/data/SystemMsg:<init>	()V
    //   4530: astore_0
    //   4531: aload_0
    //   4532: astore 4
    //   4534: aload_0
    //   4535: astore 5
    //   4537: aload_0
    //   4538: aload_1
    //   4539: putfield 151	com/tencent/mobileqq/data/SystemMsg:message	Ljava/lang/String;
    //   4542: aload_0
    //   4543: areturn
    //   4544: aload_2
    //   4545: getstatic 183	com/tencent/mobileqq/app/AppConstants:as	Ljava/lang/String;
    //   4548: invokestatic 187	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   4551: invokevirtual 126	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   4554: ifeq +58 -> 4612
    //   4557: new 2	com/tencent/mobileqq/data/SystemMsg
    //   4560: dup
    //   4561: invokespecial 67	com/tencent/mobileqq/data/SystemMsg:<init>	()V
    //   4564: astore_0
    //   4565: aload_0
    //   4566: astore 4
    //   4568: aload_0
    //   4569: astore 5
    //   4571: aload_0
    //   4572: ldc_w 291
    //   4575: aload_1
    //   4576: invokestatic 296	com/tencent/mobileqq/utils/httputils/PkgTools:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   4579: invokestatic 300	com/tencent/mobileqq/utils/httputils/PkgTools:c	(Ljava/lang/String;)Ljava/lang/String;
    //   4582: putfield 151	com/tencent/mobileqq/data/SystemMsg:message	Ljava/lang/String;
    //   4585: aload_0
    //   4586: areturn
    //   4587: astore_0
    //   4588: aconst_null
    //   4589: astore 5
    //   4591: goto -4121 -> 470
    //   4594: astore_1
    //   4595: aload_0
    //   4596: astore 5
    //   4598: aload_1
    //   4599: astore_0
    //   4600: goto -4130 -> 470
    //   4603: astore_1
    //   4604: aconst_null
    //   4605: astore_0
    //   4606: goto -4196 -> 410
    //   4609: astore_1
    //   4610: aload_0
    //   4611: areturn
    //   4612: aconst_null
    //   4613: areturn
    //   4614: aload_1
    //   4615: areturn
    //   4616: goto -1924 -> 2692
    //   4619: iload_3
    //   4620: iconst_1
    //   4621: iadd
    //   4622: istore_3
    //   4623: goto -1700 -> 2923
    //   4626: iconst_0
    //   4627: istore_3
    //   4628: goto -1798 -> 2830
    //   4631: astore_1
    //   4632: goto -4222 -> 410
    //   4635: astore_1
    //   4636: aconst_null
    //   4637: astore_1
    //   4638: goto -1662 -> 2976
    //   4641: astore_1
    //   4642: aload_0
    //   4643: astore 5
    //   4645: aload_1
    //   4646: astore_0
    //   4647: goto -4177 -> 470
    //   4650: astore_1
    //   4651: aconst_null
    //   4652: astore_1
    //   4653: goto -1565 -> 3088
    //   4656: iload_3
    //   4657: iconst_1
    //   4658: iadd
    //   4659: istore_3
    //   4660: goto -1378 -> 3282
    //   4663: iconst_0
    //   4664: istore_3
    //   4665: goto -1471 -> 3194
    //   4668: astore_1
    //   4669: goto -4259 -> 410
    //   4672: astore_1
    //   4673: aconst_null
    //   4674: astore_1
    //   4675: goto -1340 -> 3335
    //   4678: iload_3
    //   4679: iconst_1
    //   4680: iadd
    //   4681: istore_3
    //   4682: goto -1089 -> 3593
    //   4685: iconst_0
    //   4686: istore_3
    //   4687: goto -1182 -> 3505
    //   4690: astore_1
    //   4691: goto -4281 -> 410
    //   4694: astore_1
    //   4695: aconst_null
    //   4696: astore_1
    //   4697: goto -1051 -> 3646
    //   4700: iload_3
    //   4701: iconst_1
    //   4702: iadd
    //   4703: istore_3
    //   4704: goto -744 -> 3960
    //   4707: iconst_0
    //   4708: istore_3
    //   4709: goto -843 -> 3866
    //   4712: iload_3
    //   4713: iconst_1
    //   4714: iadd
    //   4715: istore_3
    //   4716: goto -406 -> 4310
    //   4719: iconst_0
    //   4720: istore_3
    //   4721: goto -499 -> 4222
    //   4724: astore_0
    //   4725: aload_1
    //   4726: areturn
    //   4727: astore_0
    //   4728: aconst_null
    //   4729: astore_0
    //   4730: goto -367 -> 4363
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	4733	0	paramQQAppInterface	com.tencent.mobileqq.app.QQAppInterface
    //   0	4733	1	paramString1	String
    //   0	4733	2	paramString2	String
    //   0	4733	3	paramInt	int
    //   40	4527	4	localObject1	Object
    //   43	4601	5	localObject2	Object
    //   188	4144	6	localObject3	Object
    //   205	440	7	str1	String
    //   222	2085	8	str2	String
    //   13	4301	9	i	int
    //   1	4456	10	j	int
    //   4	3587	11	k	int
    //   7	3951	12	m	int
    //   10	4298	13	n	int
    // Exception table:
    //   from	to	target	type
    //   45	53	406	java/io/IOException
    //   59	67	406	java/io/IOException
    //   73	82	406	java/io/IOException
    //   88	97	406	java/io/IOException
    //   103	112	406	java/io/IOException
    //   118	127	406	java/io/IOException
    //   133	142	406	java/io/IOException
    //   148	157	406	java/io/IOException
    //   163	173	406	java/io/IOException
    //   179	190	406	java/io/IOException
    //   196	207	406	java/io/IOException
    //   213	224	406	java/io/IOException
    //   338	345	406	java/io/IOException
    //   351	363	406	java/io/IOException
    //   369	404	406	java/io/IOException
    //   422	467	406	java/io/IOException
    //   483	490	406	java/io/IOException
    //   496	511	406	java/io/IOException
    //   517	526	406	java/io/IOException
    //   532	537	406	java/io/IOException
    //   543	550	406	java/io/IOException
    //   556	568	406	java/io/IOException
    //   574	609	406	java/io/IOException
    //   617	622	406	java/io/IOException
    //   631	676	406	java/io/IOException
    //   684	691	406	java/io/IOException
    //   697	709	406	java/io/IOException
    //   715	724	406	java/io/IOException
    //   730	735	406	java/io/IOException
    //   741	748	406	java/io/IOException
    //   754	765	406	java/io/IOException
    //   771	778	406	java/io/IOException
    //   784	796	406	java/io/IOException
    //   802	841	406	java/io/IOException
    //   849	854	406	java/io/IOException
    //   863	912	406	java/io/IOException
    //   920	927	406	java/io/IOException
    //   933	945	406	java/io/IOException
    //   951	1000	406	java/io/IOException
    //   1008	1067	406	java/io/IOException
    //   1075	1082	406	java/io/IOException
    //   1088	1100	406	java/io/IOException
    //   1106	1115	406	java/io/IOException
    //   1121	1126	406	java/io/IOException
    //   1132	1140	406	java/io/IOException
    //   1146	1154	406	java/io/IOException
    //   1160	1167	406	java/io/IOException
    //   1173	1184	406	java/io/IOException
    //   1190	1197	406	java/io/IOException
    //   1203	1215	406	java/io/IOException
    //   1221	1260	406	java/io/IOException
    //   1268	1273	406	java/io/IOException
    //   1282	1331	406	java/io/IOException
    //   1339	1346	406	java/io/IOException
    //   1352	1364	406	java/io/IOException
    //   1370	1419	406	java/io/IOException
    //   1427	1486	406	java/io/IOException
    //   1494	1502	406	java/io/IOException
    //   1508	1515	406	java/io/IOException
    //   1521	1532	406	java/io/IOException
    //   1538	1545	406	java/io/IOException
    //   1551	1563	406	java/io/IOException
    //   1569	1608	406	java/io/IOException
    //   1616	1665	406	java/io/IOException
    //   1673	1680	406	java/io/IOException
    //   1686	1698	406	java/io/IOException
    //   1704	1753	406	java/io/IOException
    //   1761	1820	406	java/io/IOException
    //   1828	1836	406	java/io/IOException
    //   1842	1849	406	java/io/IOException
    //   1855	1866	406	java/io/IOException
    //   1872	1879	406	java/io/IOException
    //   1885	1897	406	java/io/IOException
    //   1903	1942	406	java/io/IOException
    //   1950	1999	406	java/io/IOException
    //   2007	2014	406	java/io/IOException
    //   2020	2032	406	java/io/IOException
    //   2038	2087	406	java/io/IOException
    //   2095	2154	406	java/io/IOException
    //   2162	2170	406	java/io/IOException
    //   2176	2183	406	java/io/IOException
    //   2189	2200	406	java/io/IOException
    //   2206	2213	406	java/io/IOException
    //   2219	2231	406	java/io/IOException
    //   2237	2276	406	java/io/IOException
    //   2282	2333	406	java/io/IOException
    //   2341	2390	406	java/io/IOException
    //   2399	2406	406	java/io/IOException
    //   2412	2424	406	java/io/IOException
    //   2430	2479	406	java/io/IOException
    //   2488	2547	406	java/io/IOException
    //   2719	2725	406	java/io/IOException
    //   4105	4145	406	java/io/IOException
    //   4148	4156	406	java/io/IOException
    //   4537	4542	406	java/io/IOException
    //   4571	4585	406	java/io/IOException
    //   45	53	469	java/lang/Exception
    //   59	67	469	java/lang/Exception
    //   73	82	469	java/lang/Exception
    //   88	97	469	java/lang/Exception
    //   103	112	469	java/lang/Exception
    //   118	127	469	java/lang/Exception
    //   133	142	469	java/lang/Exception
    //   148	157	469	java/lang/Exception
    //   163	173	469	java/lang/Exception
    //   179	190	469	java/lang/Exception
    //   196	207	469	java/lang/Exception
    //   213	224	469	java/lang/Exception
    //   338	345	469	java/lang/Exception
    //   351	363	469	java/lang/Exception
    //   369	404	469	java/lang/Exception
    //   422	467	469	java/lang/Exception
    //   483	490	469	java/lang/Exception
    //   496	511	469	java/lang/Exception
    //   517	526	469	java/lang/Exception
    //   532	537	469	java/lang/Exception
    //   543	550	469	java/lang/Exception
    //   556	568	469	java/lang/Exception
    //   574	609	469	java/lang/Exception
    //   617	622	469	java/lang/Exception
    //   631	676	469	java/lang/Exception
    //   684	691	469	java/lang/Exception
    //   697	709	469	java/lang/Exception
    //   715	724	469	java/lang/Exception
    //   730	735	469	java/lang/Exception
    //   741	748	469	java/lang/Exception
    //   754	765	469	java/lang/Exception
    //   771	778	469	java/lang/Exception
    //   784	796	469	java/lang/Exception
    //   802	841	469	java/lang/Exception
    //   849	854	469	java/lang/Exception
    //   863	912	469	java/lang/Exception
    //   920	927	469	java/lang/Exception
    //   933	945	469	java/lang/Exception
    //   951	1000	469	java/lang/Exception
    //   1008	1067	469	java/lang/Exception
    //   1075	1082	469	java/lang/Exception
    //   1088	1100	469	java/lang/Exception
    //   1106	1115	469	java/lang/Exception
    //   1121	1126	469	java/lang/Exception
    //   1132	1140	469	java/lang/Exception
    //   1146	1154	469	java/lang/Exception
    //   1160	1167	469	java/lang/Exception
    //   1173	1184	469	java/lang/Exception
    //   1190	1197	469	java/lang/Exception
    //   1203	1215	469	java/lang/Exception
    //   1221	1260	469	java/lang/Exception
    //   1268	1273	469	java/lang/Exception
    //   1282	1331	469	java/lang/Exception
    //   1339	1346	469	java/lang/Exception
    //   1352	1364	469	java/lang/Exception
    //   1370	1419	469	java/lang/Exception
    //   1427	1486	469	java/lang/Exception
    //   1494	1502	469	java/lang/Exception
    //   1508	1515	469	java/lang/Exception
    //   1521	1532	469	java/lang/Exception
    //   1538	1545	469	java/lang/Exception
    //   1551	1563	469	java/lang/Exception
    //   1569	1608	469	java/lang/Exception
    //   1616	1665	469	java/lang/Exception
    //   1673	1680	469	java/lang/Exception
    //   1686	1698	469	java/lang/Exception
    //   1704	1753	469	java/lang/Exception
    //   1761	1820	469	java/lang/Exception
    //   1828	1836	469	java/lang/Exception
    //   1842	1849	469	java/lang/Exception
    //   1855	1866	469	java/lang/Exception
    //   1872	1879	469	java/lang/Exception
    //   1885	1897	469	java/lang/Exception
    //   1903	1942	469	java/lang/Exception
    //   1950	1999	469	java/lang/Exception
    //   2007	2014	469	java/lang/Exception
    //   2020	2032	469	java/lang/Exception
    //   2038	2087	469	java/lang/Exception
    //   2095	2154	469	java/lang/Exception
    //   2162	2170	469	java/lang/Exception
    //   2176	2183	469	java/lang/Exception
    //   2189	2200	469	java/lang/Exception
    //   2206	2213	469	java/lang/Exception
    //   2219	2231	469	java/lang/Exception
    //   2237	2276	469	java/lang/Exception
    //   2282	2333	469	java/lang/Exception
    //   2341	2390	469	java/lang/Exception
    //   2399	2406	469	java/lang/Exception
    //   2412	2424	469	java/lang/Exception
    //   2430	2479	469	java/lang/Exception
    //   2488	2547	469	java/lang/Exception
    //   2719	2725	469	java/lang/Exception
    //   4105	4145	469	java/lang/Exception
    //   4537	4542	469	java/lang/Exception
    //   4571	4585	469	java/lang/Exception
    //   3122	3131	3149	java/lang/Exception
    //   3165	3194	3451	java/lang/Exception
    //   3194	3250	3451	java/lang/Exception
    //   3250	3279	3451	java/lang/Exception
    //   3288	3310	3451	java/lang/Exception
    //   3318	3326	3451	java/lang/Exception
    //   3339	3350	3451	java/lang/Exception
    //   3353	3405	3451	java/lang/Exception
    //   3416	3424	3451	java/lang/Exception
    //   3437	3448	3451	java/lang/Exception
    //   3424	3433	3460	java/lang/Exception
    //   3476	3505	3755	java/lang/Exception
    //   3505	3561	3755	java/lang/Exception
    //   3561	3590	3755	java/lang/Exception
    //   3599	3621	3755	java/lang/Exception
    //   3629	3637	3755	java/lang/Exception
    //   3650	3661	3755	java/lang/Exception
    //   3664	3709	3755	java/lang/Exception
    //   3720	3728	3755	java/lang/Exception
    //   3741	3752	3755	java/lang/Exception
    //   3728	3737	3764	java/lang/Exception
    //   3780	3820	4079	java/io/IOException
    //   3828	3838	4079	java/io/IOException
    //   3838	3847	4079	java/io/IOException
    //   3847	3866	4079	java/io/IOException
    //   3866	3922	4079	java/io/IOException
    //   3922	3957	4079	java/io/IOException
    //   3966	3988	4079	java/io/IOException
    //   3996	4004	4079	java/io/IOException
    //   4004	4013	4079	java/io/IOException
    //   4017	4028	4079	java/io/IOException
    //   4031	4076	4079	java/io/IOException
    //   4004	4013	4083	java/lang/Exception
    //   4156	4222	4494	java/io/IOException
    //   4222	4278	4494	java/io/IOException
    //   4278	4307	4494	java/io/IOException
    //   4316	4338	4494	java/io/IOException
    //   4346	4354	4494	java/io/IOException
    //   4354	4363	4494	java/io/IOException
    //   4367	4400	4494	java/io/IOException
    //   4403	4448	4494	java/io/IOException
    //   4459	4467	4494	java/io/IOException
    //   4467	4476	4494	java/io/IOException
    //   4480	4491	4494	java/io/IOException
    //   4467	4476	4502	java/lang/Exception
    //   19	39	4587	java/lang/Exception
    //   2550	2570	4587	java/lang/Exception
    //   2692	2713	4587	java/lang/Exception
    //   2727	2735	4587	java/lang/Exception
    //   3157	3165	4587	java/lang/Exception
    //   3468	3476	4587	java/lang/Exception
    //   3772	3780	4587	java/lang/Exception
    //   4091	4099	4587	java/lang/Exception
    //   4510	4531	4587	java/lang/Exception
    //   4544	4565	4587	java/lang/Exception
    //   3780	3820	4594	java/lang/Exception
    //   3828	3838	4594	java/lang/Exception
    //   3838	3847	4594	java/lang/Exception
    //   3847	3866	4594	java/lang/Exception
    //   3866	3922	4594	java/lang/Exception
    //   3922	3957	4594	java/lang/Exception
    //   3966	3988	4594	java/lang/Exception
    //   3996	4004	4594	java/lang/Exception
    //   4017	4028	4594	java/lang/Exception
    //   4031	4076	4594	java/lang/Exception
    //   19	39	4603	java/io/IOException
    //   2550	2570	4603	java/io/IOException
    //   2692	2713	4603	java/io/IOException
    //   2727	2735	4603	java/io/IOException
    //   3157	3165	4603	java/io/IOException
    //   3468	3476	4603	java/io/IOException
    //   3772	3780	4603	java/io/IOException
    //   4091	4099	4603	java/io/IOException
    //   4510	4531	4603	java/io/IOException
    //   4544	4565	4603	java/io/IOException
    //   4148	4156	4609	java/lang/Exception
    //   2735	2830	4631	java/io/IOException
    //   2830	2885	4631	java/io/IOException
    //   2885	2920	4631	java/io/IOException
    //   2929	2951	4631	java/io/IOException
    //   2959	2967	4631	java/io/IOException
    //   2967	2976	4631	java/io/IOException
    //   2980	3013	4631	java/io/IOException
    //   3016	3060	4631	java/io/IOException
    //   3071	3079	4631	java/io/IOException
    //   3079	3088	4631	java/io/IOException
    //   3092	3103	4631	java/io/IOException
    //   3114	3122	4631	java/io/IOException
    //   3122	3131	4631	java/io/IOException
    //   3135	3146	4631	java/io/IOException
    //   2967	2976	4635	java/lang/Exception
    //   2735	2830	4641	java/lang/Exception
    //   2830	2885	4641	java/lang/Exception
    //   2885	2920	4641	java/lang/Exception
    //   2929	2951	4641	java/lang/Exception
    //   2959	2967	4641	java/lang/Exception
    //   2980	3013	4641	java/lang/Exception
    //   3016	3060	4641	java/lang/Exception
    //   3071	3079	4641	java/lang/Exception
    //   3092	3103	4641	java/lang/Exception
    //   3114	3122	4641	java/lang/Exception
    //   3135	3146	4641	java/lang/Exception
    //   3079	3088	4650	java/lang/Exception
    //   3165	3194	4668	java/io/IOException
    //   3194	3250	4668	java/io/IOException
    //   3250	3279	4668	java/io/IOException
    //   3288	3310	4668	java/io/IOException
    //   3318	3326	4668	java/io/IOException
    //   3326	3335	4668	java/io/IOException
    //   3339	3350	4668	java/io/IOException
    //   3353	3405	4668	java/io/IOException
    //   3416	3424	4668	java/io/IOException
    //   3424	3433	4668	java/io/IOException
    //   3437	3448	4668	java/io/IOException
    //   3326	3335	4672	java/lang/Exception
    //   3476	3505	4690	java/io/IOException
    //   3505	3561	4690	java/io/IOException
    //   3561	3590	4690	java/io/IOException
    //   3599	3621	4690	java/io/IOException
    //   3629	3637	4690	java/io/IOException
    //   3637	3646	4690	java/io/IOException
    //   3650	3661	4690	java/io/IOException
    //   3664	3709	4690	java/io/IOException
    //   3720	3728	4690	java/io/IOException
    //   3728	3737	4690	java/io/IOException
    //   3741	3752	4690	java/io/IOException
    //   3637	3646	4694	java/lang/Exception
    //   4156	4222	4724	java/lang/Exception
    //   4222	4278	4724	java/lang/Exception
    //   4278	4307	4724	java/lang/Exception
    //   4316	4338	4724	java/lang/Exception
    //   4346	4354	4724	java/lang/Exception
    //   4367	4400	4724	java/lang/Exception
    //   4403	4448	4724	java/lang/Exception
    //   4459	4467	4724	java/lang/Exception
    //   4480	4491	4724	java/lang/Exception
    //   4354	4363	4727	java/lang/Exception
  }
  
  public static byte[] getAuthFromTroopSysMsg(byte[] paramArrayOfByte, int paramInt)
  {
    if (paramArrayOfByte == null) {}
    do
    {
      return null;
      switch (paramInt)
      {
      case -1022: 
      case -1021: 
      case 36: 
      case 37: 
      case 85: 
      case 86: 
      default: 
        return null;
      case -1023: 
      case 46: 
      case 87: 
        paramInt = getTroopOpFromTroopSysMsg(paramArrayOfByte, paramInt);
        if ((paramInt == 1) || (paramInt == 4))
        {
          paramInt = PkgTools.a(paramArrayOfByte[15]) + 15;
          i = PkgTools.a(paramArrayOfByte, paramInt);
          arrayOfByte = new byte[i];
          System.arraycopy(paramArrayOfByte, paramInt + 2, arrayOfByte, 0, i);
          return arrayOfByte;
        }
        break;
      case -1020: 
      case 35: 
      case 84: 
        paramInt = PkgTools.a(paramArrayOfByte[9]);
        paramInt = PkgTools.a(paramArrayOfByte, PkgTools.a(paramArrayOfByte[9]) + 10) + (paramInt + 10 + 2);
        i = PkgTools.a(paramArrayOfByte, paramInt);
        arrayOfByte = new byte[i];
        System.arraycopy(paramArrayOfByte, paramInt + 2, arrayOfByte, 0, i);
        return arrayOfByte;
      }
    } while (paramInt != 5);
    paramInt = PkgTools.a(paramArrayOfByte[19]) + 19;
    int i = PkgTools.a(paramArrayOfByte, paramInt);
    byte[] arrayOfByte = new byte[i];
    System.arraycopy(paramArrayOfByte, paramInt + 2, arrayOfByte, 0, i);
    return arrayOfByte;
  }
  
  public static String getInviteUinFromTroopSysMsg(byte[] paramArrayOfByte, int paramInt)
  {
    if (paramArrayOfByte == null) {}
    do
    {
      return null;
      switch (paramInt)
      {
      default: 
        return null;
      }
    } while (getTroopOpFromTroopSysMsg(paramArrayOfByte, paramInt) != 5);
    return String.valueOf(PkgTools.a(paramArrayOfByte, 14));
  }
  
  public static String getManagerUinFromTroopSysMsg(byte[] paramArrayOfByte, int paramInt)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    switch (paramInt)
    {
    case -1020: 
    case 35: 
    case 84: 
    default: 
      return null;
    case -1023: 
    case 46: 
    case 87: 
      return String.valueOf(PkgTools.a(paramArrayOfByte, 10));
    }
    return String.valueOf(PkgTools.a(paramArrayOfByte, 5));
  }
  
  public static String getRequestUinFromTroopSysMsg(byte[] paramArrayOfByte, int paramInt)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    switch (paramInt)
    {
    default: 
      return null;
    case -1023: 
    case -1022: 
    case -1021: 
    case 36: 
    case 37: 
    case 46: 
    case 85: 
    case 86: 
    case 87: 
      return String.valueOf(PkgTools.a(paramArrayOfByte, 10));
    }
    return String.valueOf(PkgTools.a(paramArrayOfByte, 5));
  }
  
  public static String getStrMsgFromTroopSysMsg(byte[] paramArrayOfByte, int paramInt)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    byte[] arrayOfByte;
    switch (paramInt)
    {
    default: 
      return null;
    case -1023: 
    case 46: 
    case 87: 
      if (getTroopOpFromTroopSysMsg(paramArrayOfByte, paramInt) == 5)
      {
        paramInt = PkgTools.a(paramArrayOfByte[18]);
        arrayOfByte = new byte[paramInt];
        PkgTools.a(arrayOfByte, 0, paramArrayOfByte, 19, paramInt);
      }
      break;
    }
    for (paramArrayOfByte = MessageUtils.b(arrayOfByte);; paramArrayOfByte = MessageUtils.b(arrayOfByte))
    {
      return String.valueOf(PkgTools.c(paramArrayOfByte, 0, paramInt));
      paramInt = PkgTools.a(paramArrayOfByte[9]);
      arrayOfByte = new byte[paramInt];
      PkgTools.a(arrayOfByte, 0, paramArrayOfByte, 10, paramInt);
      return String.valueOf(PkgTools.c(MessageUtils.b(arrayOfByte), 0, paramInt));
      paramInt = PkgTools.a(paramArrayOfByte[14]);
      arrayOfByte = new byte[paramInt];
      PkgTools.a(arrayOfByte, 0, paramArrayOfByte, 15, paramInt);
    }
  }
  
  public static String getTroopCodeFromTroopSysMsg(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    return String.valueOf(PkgTools.a(paramArrayOfByte, 0));
  }
  
  public static byte getTroopOpFromTroopSysMsg(byte[] paramArrayOfByte, int paramInt)
  {
    if (paramArrayOfByte == null) {
      return -1;
    }
    switch (paramInt)
    {
    case -1022: 
    case -1021: 
    case -1020: 
    case 35: 
    case 36: 
    case 37: 
    case 84: 
    case 85: 
    case 86: 
    default: 
      return -1;
    }
    return paramArrayOfByte[5];
  }
  
  public static int getTroopSystemMsgType(int paramInt)
  {
    int j = 64513;
    int i;
    if ((paramInt == 64516) || (paramInt == 84) || (paramInt == 35)) {
      i = 64516;
    }
    do
    {
      do
      {
        do
        {
          return i;
          if ((paramInt == 64515) || (paramInt == 85) || (paramInt == 36)) {
            return 64515;
          }
          if ((paramInt == 64514) || (paramInt == 86) || (paramInt == 37)) {
            return 64514;
          }
          i = j;
        } while (paramInt == 64513);
        i = j;
      } while (paramInt == 87);
      i = j;
    } while (paramInt == 46);
    return 64536;
  }
  
  public static byte getTroopTypeFromTroopSysMsg(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return -1;
    }
    return paramArrayOfByte[4];
  }
  
  public static boolean isSystemMessage(int paramInt)
  {
    if ((paramInt <= 64530) && (paramInt >= 64526)) {}
    while ((paramInt == 64525) || ((paramInt >= 187) && (paramInt <= 191))) {
      return true;
    }
    return false;
  }
  
  public static boolean isTroopSystemMessage(int paramInt)
  {
    if ((paramInt <= 64516) && (paramInt >= 64513)) {}
    while (((paramInt >= 84) && (paramInt <= 87)) || ((paramInt >= 35) && (paramInt <= 37)) || (paramInt == 46) || (paramInt == 45)) {
      return true;
    }
    return false;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    try
    {
      this.cVession = paramJceInputStream.read(this.cVession, 0, true);
      this.sMsg = paramJceInputStream.read(this.sMsg, 1, false);
      this.append = paramJceInputStream.read(this.append, 2, false);
      this.message = paramJceInputStream.read(this.message, 3, false);
      this.troopCode = paramJceInputStream.read(this.troopCode, 4, false);
      this.managerUin = paramJceInputStream.readString(5, false);
      this.requestUin = paramJceInputStream.readString(6, false);
      this.troopType = paramJceInputStream.read(this.troopType, 7, true);
      this.op = paramJceInputStream.read(this.op, 8, true);
      this.auth = paramJceInputStream.read(this.auth, 9, false);
      this.lToMobile = paramJceInputStream.read(this.lToMobile, 10, true);
      this.strNickName = paramJceInputStream.read(this.strNickName, 11, false);
      return;
    }
    catch (Exception paramJceInputStream) {}
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.cVession, 0);
    if (this.sMsg != null) {
      paramJceOutputStream.write(this.sMsg, 1);
    }
    if (this.append != null) {
      paramJceOutputStream.write(this.append, 2);
    }
    if (this.message != null) {
      paramJceOutputStream.write(this.message, 3);
    }
    if (this.troopCode != null) {
      paramJceOutputStream.write(this.troopCode, 4);
    }
    if (this.managerUin != null) {
      paramJceOutputStream.write(this.managerUin, 5);
    }
    if (this.requestUin != null) {
      paramJceOutputStream.write(this.requestUin, 6);
    }
    paramJceOutputStream.write(this.troopType, 7);
    paramJceOutputStream.write(this.op, 8);
    if (this.auth != null) {
      paramJceOutputStream.write(this.auth, 9);
    }
    paramJceOutputStream.write(this.lToMobile, 10);
    if (this.strNickName != null) {
      paramJceOutputStream.write(this.strNickName, 11);
    }
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\tencent\mobileqq\data\SystemMsg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */