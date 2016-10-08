package tencent.im.s2c.msgtype0x211.submsgtype0x8;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBoolField;
import com.tencent.mobileqq.pb.PBField;

public final class C2CType0x211_SubC2CType0x8$WifiAbility
  extends MessageMicro
{
  public static final int BOOL_AUTO_CONNECT_ABI_FIELD_NUMBER = 2;
  public static final int BOOL_ESTABLISH_ABI_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16 }, new String[] { "bool_establish_abi", "bool_auto_connect_abi" }, new Object[] { Boolean.valueOf(false), Boolean.valueOf(false) }, WifiAbility.class);
  public final PBBoolField bool_auto_connect_abi = PBField.initBool(false);
  public final PBBoolField bool_establish_abi = PBField.initBool(false);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\s2c\msgtype0x211\submsgtype0x8\C2CType0x211_SubC2CType0x8$WifiAbility.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */