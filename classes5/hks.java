import android.os.Bundle;
import com.tencent.biz.pubaccount.AccountDetail.activity.EqqAccountDetailActivity;
import com.tencent.mobileqq.data.EqqDetail;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.mp.mobileqq_mp.GetEqqAccountDetailInfoResponse;
import com.tencent.mobileqq.mp.mobileqq_mp.RetInfo;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.qphone.base.util.QLog;
import mqq.observer.BusinessObserver;

public class hks
  implements BusinessObserver
{
  public hks(EqqAccountDetailActivity paramEqqAccountDetailActivity)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onReceive(int paramInt, boolean paramBoolean, Bundle paramBundle)
  {
    if (QLog.isColorLevel()) {
      QLog.d(this.a.jdField_a_of_type_JavaLangString, 2, "success:" + String.valueOf(paramBoolean));
    }
    if (!paramBoolean) {
      if (!EqqAccountDetailActivity.a(this.a)) {
        this.a.d(2131364487);
      }
    }
    for (;;)
    {
      EqqAccountDetailActivity.a(this.a);
      if (EqqAccountDetailActivity.b(this.a) == 0) {
        EqqAccountDetailActivity.a(this.a);
      }
      if (QLog.isDevelopLevel()) {
        QLog.d("crmtest", 4, "receive sendCrmDetailInfoRequest, ts=" + System.currentTimeMillis());
      }
      return;
      if (paramBoolean) {}
      try
      {
        paramBundle = paramBundle.getByteArray("data");
        if (paramBundle != null)
        {
          mobileqq_mp.GetEqqAccountDetailInfoResponse localGetEqqAccountDetailInfoResponse = new mobileqq_mp.GetEqqAccountDetailInfoResponse();
          localGetEqqAccountDetailInfoResponse.mergeFrom(paramBundle);
          if (((mobileqq_mp.RetInfo)localGetEqqAccountDetailInfoResponse.ret_info.get()).ret_code.get() == 0)
          {
            if ((this.a.jdField_a_of_type_ComTencentMobileqqDataEqqDetail == null) || ((localGetEqqAccountDetailInfoResponse.seqno.has()) && (localGetEqqAccountDetailInfoResponse.seqno.get() != this.a.jdField_a_of_type_ComTencentMobileqqDataEqqDetail.seqno)))
            {
              this.a.jdField_a_of_type_ComTencentMobileqqMpMobileqq_mp$GetEqqAccountDetailInfoResponse = localGetEqqAccountDetailInfoResponse;
              paramBundle = new EqqDetail(this.a.jdField_a_of_type_ComTencentMobileqqMpMobileqq_mp$GetEqqAccountDetailInfoResponse);
              if ((EqqAccountDetailActivity.b(this.a)) && (paramBundle.followType == 1))
              {
                this.a.a(paramBundle, false);
                continue;
              }
              this.a.a(paramBundle, true);
              continue;
            }
            if ((!EqqAccountDetailActivity.c(this.a)) || (this.a.jdField_a_of_type_ComTencentMobileqqDataEqqDetail.followType != 1)) {
              continue;
            }
            this.a.e();
            continue;
          }
          this.a.d(2131364487);
          continue;
        }
        if (EqqAccountDetailActivity.d(this.a)) {
          continue;
        }
        this.a.d(2131364487);
      }
      catch (Exception paramBundle) {}
      if (!EqqAccountDetailActivity.e(this.a)) {
        this.a.d(2131364487);
      }
    }
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\hks.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */