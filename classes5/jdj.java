import android.os.Bundle;
import com.tencent.biz.troop.TroopMemberApiService;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.InvalidProtocolBufferMicroException;
import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import mqq.observer.BusinessObserver;
import tencent.im.group.nearbybanner.nearbybanner.Banners;
import tencent.im.group.nearbybanner.nearbybanner.RspBody;

class jdj
  implements BusinessObserver
{
  jdj(jdh paramjdh, Bundle paramBundle)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onReceive(int paramInt, boolean paramBoolean, Bundle paramBundle)
  {
    this.jdField_a_of_type_AndroidOsBundle.remove("data");
    if (!paramBoolean)
    {
      this.jdField_a_of_type_Jdh.a.a(16, this.jdField_a_of_type_AndroidOsBundle);
      return;
    }
    paramBundle = paramBundle.getByteArray("data");
    nearbybanner.RspBody localRspBody = new nearbybanner.RspBody();
    try
    {
      localRspBody.mergeFrom(paramBundle);
      if ((localRspBody.uint32_result.get() != 0) && (!localRspBody.msg_banners.has()))
      {
        this.jdField_a_of_type_Jdh.a.a(16, this.jdField_a_of_type_AndroidOsBundle);
        return;
      }
    }
    catch (InvalidProtocolBufferMicroException paramBundle)
    {
      this.jdField_a_of_type_Jdh.a.a(16, this.jdField_a_of_type_AndroidOsBundle);
      return;
      paramBundle = (nearbybanner.Banners)localRspBody.msg_banners.get();
      if (!paramBundle.rpt_banner_info.has())
      {
        this.jdField_a_of_type_Jdh.a.a(16, this.jdField_a_of_type_AndroidOsBundle);
        return;
      }
    }
    catch (Exception paramBundle)
    {
      this.jdField_a_of_type_Jdh.a.a(16, this.jdField_a_of_type_AndroidOsBundle);
      return;
    }
    this.jdField_a_of_type_AndroidOsBundle.putByteArray("data", paramBundle.toByteArray());
    this.jdField_a_of_type_Jdh.a.a(16, this.jdField_a_of_type_AndroidOsBundle);
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\jdj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */