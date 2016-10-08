package com.tencent.mobileqq.app.automator.step;

import ConfigPush.FileStoragePushFSSvcList;
import com.tencent.kingkong.Common;
import com.tencent.mobileqq.app.DeviceProfileManager;
import com.tencent.mobileqq.app.DeviceProfileManager.DpcNames;
import com.tencent.mobileqq.app.FriendListObserver;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.automator.AsyncStep;
import com.tencent.mobileqq.app.automator.Automator;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.ptt.preop.PTTPreDownloader;
import com.tencent.mobileqq.servlet.PushServlet;
import com.tencent.mobileqq.transfile.FMTSrvAddrProvider;
import mqq.app.MobileQQ;
import qjj;

public class GetGeneralSettings
  extends AsyncStep
{
  private FriendListObserver a;
  
  public GetGeneralSettings()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  protected int a()
  {
    boolean bool = false;
    ??? = this.jdField_a_of_type_ComTencentMobileqqAppAutomatorAutomator.b.a();
    if (??? != null)
    {
      Common.SetContext(this.jdField_a_of_type_ComTencentMobileqqAppAutomatorAutomator.b.a());
      Common.SetQQUni((String)???);
    }
    if ("0".endsWith(DeviceProfileManager.b().a(DeviceProfileManager.DpcNames.KKFixerConfig.name(), "0"))) {
      Common.SetDPCStatus(this.jdField_a_of_type_ComTencentMobileqqAppAutomatorAutomator.b.getApplication().getApplicationContext(), false);
    }
    for (;;)
    {
      if (this.jdField_a_of_type_ComTencentMobileqqAppAutomatorAutomator.d == 1) {
        bool = true;
      }
      if (!bool) {
        break;
      }
      if (this.jdField_a_of_type_ComTencentMobileqqAppFriendListObserver == null)
      {
        this.jdField_a_of_type_ComTencentMobileqqAppFriendListObserver = new qjj(this, null);
        this.jdField_a_of_type_ComTencentMobileqqAppAutomatorAutomator.b.a(this.jdField_a_of_type_ComTencentMobileqqAppFriendListObserver, true);
      }
      if (!this.jdField_a_of_type_ComTencentMobileqqAppAutomatorAutomator.b.a(bool)) {
        break;
      }
      return 2;
      Common.SetDPCStatus(this.jdField_a_of_type_ComTencentMobileqqAppAutomatorAutomator.b.getApplication().getApplicationContext(), true);
      Common.SetContext(this.jdField_a_of_type_ComTencentMobileqqAppAutomatorAutomator.b.getApplication().getApplicationContext());
      Common.SetSafeStatus(true);
    }
    synchronized (FMTSrvAddrProvider.a().a)
    {
      FileStoragePushFSSvcList localFileStoragePushFSSvcList = FMTSrvAddrProvider.a().a();
      if (localFileStoragePushFSSvcList != null)
      {
        PushServlet.a(localFileStoragePushFSSvcList, this.jdField_a_of_type_ComTencentMobileqqAppAutomatorAutomator.b);
        FMTSrvAddrProvider.a().b(null);
      }
      PTTPreDownloader.a(this.jdField_a_of_type_ComTencentMobileqqAppAutomatorAutomator.b).a(true, true);
      return 7;
    }
  }
  
  public void b()
  {
    if (this.jdField_a_of_type_ComTencentMobileqqAppFriendListObserver != null)
    {
      this.jdField_a_of_type_ComTencentMobileqqAppAutomatorAutomator.b.b(this.jdField_a_of_type_ComTencentMobileqqAppFriendListObserver);
      this.jdField_a_of_type_ComTencentMobileqqAppFriendListObserver = null;
    }
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\com\tencent\mobileqq\app\automator\step\GetGeneralSettings.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */