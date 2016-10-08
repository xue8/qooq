package com.tencent.mobileqq.config.struct.splashproto;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBInt32Field;

public final class ConfigurationService$ConfigSeq
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 24 }, new String[] { "type", "version", "compress" }, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) }, ConfigSeq.class);
  public final PBInt32Field compress = PBField.initInt32(0);
  public final PBInt32Field type = PBField.initInt32(0);
  public final PBInt32Field version = PBField.initInt32(0);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\com\tencent\mobileqq\config\struct\splashproto\ConfigurationService$ConfigSeq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */