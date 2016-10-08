package com.tencent.biz.addContactTroopView;

import com.tencent.common.app.AppInterface;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.utils.FileUtils;
import java.io.File;
import mqq.app.MobileQQ;
import mqq.manager.Manager;
import tencent.im.troop_search_popclassifc.popclassifc.BannerCard;
import tencent.im.troop_search_popclassifc.popclassifc.PopCard;
import tencent.im.troop_search_popclassifc.popclassifc.RspBody;
import tencent.im.troop_view.troopviewInfo.RspBody;

public class AddContactTroopManage
  implements Manager
{
  protected AppInterface a;
  protected final String a;
  protected troopviewInfo.RspBody a;
  
  public AddContactTroopManage(AppInterface paramAppInterface)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_JavaLangString = "AddContactTroopManage";
    this.jdField_a_of_type_ComTencentCommonAppAppInterface = paramAppInterface;
  }
  
  private boolean a(troopviewInfo.RspBody paramRspBody)
  {
    if (paramRspBody == null) {
      return false;
    }
    return FileUtils.a(new File(this.jdField_a_of_type_ComTencentCommonAppAppInterface.getApplication().getFilesDir(), "AddContactTroopManage" + this.jdField_a_of_type_ComTencentCommonAppAppInterface.a()).getAbsolutePath(), paramRspBody.toByteArray(), false);
  }
  
  /* Error */
  private troopviewInfo.RspBody b()
  {
    // Byte code:
    //   0: new 31	java/io/File
    //   3: dup
    //   4: aload_0
    //   5: getfield 27	com/tencent/biz/addContactTroopView/AddContactTroopManage:jdField_a_of_type_ComTencentCommonAppAppInterface	Lcom/tencent/common/app/AppInterface;
    //   8: invokevirtual 37	com/tencent/common/app/AppInterface:getApplication	()Lmqq/app/MobileQQ;
    //   11: invokevirtual 43	mqq/app/MobileQQ:getFilesDir	()Ljava/io/File;
    //   14: new 45	java/lang/StringBuilder
    //   17: dup
    //   18: invokespecial 46	java/lang/StringBuilder:<init>	()V
    //   21: ldc 23
    //   23: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   26: aload_0
    //   27: getfield 27	com/tencent/biz/addContactTroopView/AddContactTroopManage:jdField_a_of_type_ComTencentCommonAppAppInterface	Lcom/tencent/common/app/AppInterface;
    //   30: invokevirtual 53	com/tencent/common/app/AppInterface:a	()Ljava/lang/String;
    //   33: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   36: invokevirtual 56	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   39: invokespecial 59	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   42: invokestatic 82	com/tencent/mobileqq/utils/FileUtils:a	(Ljava/io/File;)[B
    //   45: astore_2
    //   46: new 64	tencent/im/troop_view/troopviewInfo$RspBody
    //   49: dup
    //   50: invokespecial 83	tencent/im/troop_view/troopviewInfo$RspBody:<init>	()V
    //   53: astore_1
    //   54: aload_2
    //   55: ifnull +9 -> 64
    //   58: aload_1
    //   59: aload_2
    //   60: invokevirtual 87	tencent/im/troop_view/troopviewInfo$RspBody:mergeFrom	([B)Lcom/tencent/mobileqq/pb/MessageMicro;
    //   63: pop
    //   64: aload_1
    //   65: areturn
    //   66: astore_2
    //   67: aconst_null
    //   68: astore_1
    //   69: aload_2
    //   70: invokevirtual 90	com/tencent/mobileqq/pb/InvalidProtocolBufferMicroException:printStackTrace	()V
    //   73: aload_1
    //   74: areturn
    //   75: astore_2
    //   76: aconst_null
    //   77: astore_1
    //   78: aload_2
    //   79: invokevirtual 91	java/lang/NullPointerException:printStackTrace	()V
    //   82: aload_1
    //   83: areturn
    //   84: astore_2
    //   85: goto -7 -> 78
    //   88: astore_2
    //   89: goto -20 -> 69
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	92	0	this	AddContactTroopManage
    //   53	30	1	localRspBody	troopviewInfo.RspBody
    //   45	15	2	arrayOfByte	byte[]
    //   66	4	2	localInvalidProtocolBufferMicroException1	com.tencent.mobileqq.pb.InvalidProtocolBufferMicroException
    //   75	4	2	localNullPointerException1	NullPointerException
    //   84	1	2	localNullPointerException2	NullPointerException
    //   88	1	2	localInvalidProtocolBufferMicroException2	com.tencent.mobileqq.pb.InvalidProtocolBufferMicroException
    // Exception table:
    //   from	to	target	type
    //   0	54	66	com/tencent/mobileqq/pb/InvalidProtocolBufferMicroException
    //   0	54	75	java/lang/NullPointerException
    //   58	64	84	java/lang/NullPointerException
    //   58	64	88	com/tencent/mobileqq/pb/InvalidProtocolBufferMicroException
  }
  
  public popclassifc.BannerCard a()
  {
    troopviewInfo.RspBody localRspBody = a();
    popclassifc.BannerCard localBannerCard = null;
    if (localRspBody != null) {
      localBannerCard = (popclassifc.BannerCard)((popclassifc.RspBody)((popclassifc.RspBody)localRspBody.popRsb.get()).get()).banner_card.get();
    }
    return localBannerCard;
  }
  
  public popclassifc.PopCard a()
  {
    troopviewInfo.RspBody localRspBody = a();
    popclassifc.PopCard localPopCard = null;
    if (localRspBody != null) {
      localPopCard = (popclassifc.PopCard)((popclassifc.RspBody)((popclassifc.RspBody)localRspBody.popRsb.get()).get()).pop_card.get();
    }
    return localPopCard;
  }
  
  public troopviewInfo.RspBody a()
  {
    if (this.jdField_a_of_type_TencentImTroop_viewTroopviewInfo$RspBody == null) {
      this.jdField_a_of_type_TencentImTroop_viewTroopviewInfo$RspBody = b();
    }
    if (this.jdField_a_of_type_TencentImTroop_viewTroopviewInfo$RspBody == null) {
      this.jdField_a_of_type_TencentImTroop_viewTroopviewInfo$RspBody = new troopviewInfo.RspBody();
    }
    return this.jdField_a_of_type_TencentImTroop_viewTroopviewInfo$RspBody;
  }
  
  public void a(troopviewInfo.RspBody paramRspBody)
  {
    this.jdField_a_of_type_TencentImTroop_viewTroopviewInfo$RspBody = paramRspBody;
    a(paramRspBody);
  }
  
  public void onDestroy() {}
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\com\tencent\biz\addContactTroopView\AddContactTroopManage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */