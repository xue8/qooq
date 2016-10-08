package tencent.im.cs.longconn.putinfo;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class hd_video_putinfo$VideoHardWareInfo
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 24, 32 }, new String[] { "uint32_mobile_max_encodeframe", "uint32_mobile_max_decodeframe", "uint32_mobile_width", "uint32_mobile_height" }, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) }, VideoHardWareInfo.class);
  public final PBUInt32Field uint32_mobile_height = PBField.initUInt32(0);
  public final PBUInt32Field uint32_mobile_max_decodeframe = PBField.initUInt32(0);
  public final PBUInt32Field uint32_mobile_max_encodeframe = PBField.initUInt32(0);
  public final PBUInt32Field uint32_mobile_width = PBField.initUInt32(0);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\cs\longconn\putinfo\hd_video_putinfo$VideoHardWareInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */