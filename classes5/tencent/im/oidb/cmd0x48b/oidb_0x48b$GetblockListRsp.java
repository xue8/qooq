package tencent.im.oidb.cmd0x48b;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class oidb_0x48b$GetblockListRsp
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 24, 34 }, new String[] { "uint32_over", "uint32_next_start_idx", "uint32_get_time", "rpt_msg_get_total_block_info" }, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), null }, GetblockListRsp.class);
  public final PBRepeatMessageField rpt_msg_get_total_block_info = PBField.initRepeatMessage(oidb_0x48b.GetTotalblockInfo.class);
  public final PBUInt32Field uint32_get_time = PBField.initUInt32(0);
  public final PBUInt32Field uint32_next_start_idx = PBField.initUInt32(0);
  public final PBUInt32Field uint32_over = PBField.initUInt32(0);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\oidb\cmd0x48b\oidb_0x48b$GetblockListRsp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */