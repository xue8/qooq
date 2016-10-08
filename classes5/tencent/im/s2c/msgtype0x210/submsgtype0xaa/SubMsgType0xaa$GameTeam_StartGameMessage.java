package tencent.im.s2c.msgtype0x210.submsgtype0xaa;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class SubMsgType0xaa$GameTeam_StartGameMessage
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 16, 26, 34, 42, 50, 58, 66, 72, 80, 88 }, new String[] { "str_gamedata", "uint32_platformType", "str_title", "str_summary", "str_picUrl", "str_appid", "str_appStoreId", "str_packageName", "uint64_createMsgTime", "uint32_expire", "uint64_buildTeamTime" }, new Object[] { "", Integer.valueOf(0), "", "", "", "", "", "", Long.valueOf(0L), Integer.valueOf(0), Long.valueOf(0L) }, GameTeam_StartGameMessage.class);
  public final PBStringField str_appStoreId = PBField.initString("");
  public final PBStringField str_appid = PBField.initString("");
  public final PBStringField str_gamedata = PBField.initString("");
  public final PBStringField str_packageName = PBField.initString("");
  public final PBStringField str_picUrl = PBField.initString("");
  public final PBStringField str_summary = PBField.initString("");
  public final PBStringField str_title = PBField.initString("");
  public final PBUInt32Field uint32_expire = PBField.initUInt32(0);
  public final PBUInt32Field uint32_platformType = PBField.initUInt32(0);
  public final PBUInt64Field uint64_buildTeamTime = PBField.initUInt64(0L);
  public final PBUInt64Field uint64_createMsgTime = PBField.initUInt64(0L);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\s2c\msgtype0x210\submsgtype0xaa\SubMsgType0xaa$GameTeam_StartGameMessage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */