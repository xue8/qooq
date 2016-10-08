package tencent.im.oidb.hotchat;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class LBS$Wifi
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField essid = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBUInt64Field mac = PBField.initUInt64(0L);
  public final PBInt32Field rssi = PBField.initInt32(0);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 24 }, new String[] { "mac", "essid", "rssi" }, new Object[] { Long.valueOf(0L), localByteStringMicro, Integer.valueOf(0) }, Wifi.class);
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\oidb\hotchat\LBS$Wifi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */