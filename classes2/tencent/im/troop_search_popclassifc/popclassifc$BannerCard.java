package tencent.im.troop_search_popclassifc;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class popclassifc$BannerCard
  extends MessageMicro
{
  public static final int RPT_BANNER_ITEMS_FIELD_NUMBER = 1;
  public static final int UINT32_SLID_INTERVAL_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 16 }, new String[] { "rpt_banner_items", "uint32_slid_interval" }, new Object[] { null, Integer.valueOf(0) }, BannerCard.class);
  public final PBRepeatMessageField rpt_banner_items = PBField.initRepeatMessage(popclassifc.BannerItem.class);
  public final PBUInt32Field uint32_slid_interval = PBField.initUInt32(0);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\tencent\im\troop_search_popclassifc\popclassifc$BannerCard.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */