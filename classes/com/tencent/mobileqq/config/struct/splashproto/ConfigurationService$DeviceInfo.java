package com.tencent.mobileqq.config.struct.splashproto;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;

public final class ConfigurationService$DeviceInfo
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18, 26, 34, 42, 50, 58, 66 }, new String[] { "brand", "model", "os", "cpu", "memory", "storage", "screen", "camera" }, new Object[] { "", "", null, null, null, null, null, null }, DeviceInfo.class);
  public final PBStringField brand = PBField.initString("");
  public ConfigurationService.Camera camera = new ConfigurationService.Camera();
  public ConfigurationService.CPU cpu = new ConfigurationService.CPU();
  public ConfigurationService.Memory memory = new ConfigurationService.Memory();
  public final PBStringField model = PBField.initString("");
  public ConfigurationService.OS os = new ConfigurationService.OS();
  public ConfigurationService.Screen screen = new ConfigurationService.Screen();
  public ConfigurationService.Storage storage = new ConfigurationService.Storage();
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\com\tencent\mobileqq\config\struct\splashproto\ConfigurationService$DeviceInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */