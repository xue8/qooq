package tencent.im.hw;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;

public final class group_mgr$GroupInfo
  extends MessageMicro
{
  public static final int COMMON_FIELD_NUMBER = 1;
  public static final int HWINFO_FIELD_NUMBER = 2;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18 }, new String[] { "common", "hwinfo" }, new Object[] { null, null }, GroupInfo.class);
  public group_mgr.GroupCommInfo common = new group_mgr.GroupCommInfo();
  public group_mgr.GroupHomeworkInfo hwinfo = new group_mgr.GroupHomeworkInfo();
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\tencent\im\hw\group_mgr$GroupInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */