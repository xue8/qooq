import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.troop.data.TroopBarPOI;

public final class vlx
  implements Parcelable.Creator
{
  public vlx()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public TroopBarPOI a(Parcel paramParcel)
  {
    return new TroopBarPOI(paramParcel.readString(), paramParcel.readString(), paramParcel.readString(), paramParcel.readInt(), paramParcel.readString(), paramParcel.readInt(), paramParcel.readString());
  }
  
  public TroopBarPOI[] a(int paramInt)
  {
    return null;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\vlx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */