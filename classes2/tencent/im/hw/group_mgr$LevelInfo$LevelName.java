package tencent.im.hw;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class group_mgr$LevelInfo$LevelName
  extends MessageMicro
{
  public static final int LEVEL_FIELD_NUMBER = 1;
  public static final int NAME_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18 }, new String[] { "level", "name" }, new Object[] { Integer.valueOf(0), "" }, LevelName.class);
  public final PBUInt32Field level = PBField.initUInt32(0);
  public final PBStringField name = PBField.initString("");
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\tencent\im\hw\group_mgr$LevelInfo$LevelName.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */