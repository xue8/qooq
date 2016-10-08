package tencent.im.mobileqq.mobroute;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBInt32Field;
import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class DomainIp$DomainiplistInfo
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 24, 32, 42 }, new String[] { "int32_result", "string_dname", "uint32_type", "uint32_ttl", "ServerList_data" }, new Object[] { Integer.valueOf(0), "", Integer.valueOf(0), Integer.valueOf(0), null }, DomainiplistInfo.class);
  public final PBRepeatMessageField ServerList_data = PBField.initRepeatMessage(DomainIp.DomainServerList.class);
  public final PBInt32Field int32_result = PBField.initInt32(0);
  public final PBStringField string_dname = PBField.initString("");
  public final PBUInt32Field uint32_ttl = PBField.initUInt32(0);
  public final PBUInt32Field uint32_type = PBField.initUInt32(0);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\tencent\im\mobileqq\mobroute\DomainIp$DomainiplistInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */