import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.qcall.QCallCardInfo;

public final class tyy
  implements Parcelable.Creator
{
  public tyy()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public QCallCardInfo a(Parcel paramParcel)
  {
    QCallCardInfo localQCallCardInfo = new QCallCardInfo();
    localQCallCardInfo.uin = paramParcel.readString();
    localQCallCardInfo.nickname = paramParcel.readString();
    localQCallCardInfo.gender = paramParcel.readInt();
    localQCallCardInfo.birthday = paramParcel.readInt();
    localQCallCardInfo.in_use_flag = paramParcel.readInt();
    localQCallCardInfo.pre_recycle_flag = paramParcel.readInt();
    localQCallCardInfo.recycle_flag = paramParcel.readInt();
    localQCallCardInfo.reg_time = paramParcel.readInt();
    localQCallCardInfo.reg_ip = paramParcel.readString();
    localQCallCardInfo.recycle_time = paramParcel.readInt();
    localQCallCardInfo.recycle_ip = paramParcel.readString();
    localQCallCardInfo.remark = paramParcel.readString();
    localQCallCardInfo.netstatus = paramParcel.readInt();
    localQCallCardInfo.qq = paramParcel.readString();
    localQCallCardInfo.phonenum = paramParcel.readString();
    localQCallCardInfo.phone_mask = paramParcel.readInt();
    localQCallCardInfo.freeStatus = paramParcel.readInt();
    localQCallCardInfo.pstn_freeStatus = paramParcel.readInt();
    localQCallCardInfo.is_ever_pstn = paramParcel.readInt();
    localQCallCardInfo.vip_all_free_time = paramParcel.readInt();
    localQCallCardInfo.vip_left_free_time = paramParcel.readInt();
    localQCallCardInfo.normal_all_free_time = paramParcel.readInt();
    localQCallCardInfo.normal_left_free_time = paramParcel.readInt();
    localQCallCardInfo.used_free_time = paramParcel.readInt();
    localQCallCardInfo.identity = paramParcel.readInt();
    localQCallCardInfo.autoRemark = paramParcel.readString();
    localQCallCardInfo.card_type = paramParcel.readInt();
    localQCallCardInfo.isPopup = paramParcel.readInt();
    localQCallCardInfo.qqUin2 = paramParcel.readString();
    localQCallCardInfo.qid_qq_status = paramParcel.readInt();
    localQCallCardInfo.contact_qq_status = paramParcel.readInt();
    return localQCallCardInfo;
  }
  
  public QCallCardInfo[] a(int paramInt)
  {
    return new QCallCardInfo[paramInt];
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\tyy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */