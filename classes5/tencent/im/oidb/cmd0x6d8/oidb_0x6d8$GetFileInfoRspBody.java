package tencent.im.oidb.cmd0x6d8;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBInt32Field;
import com.tencent.mobileqq.pb.PBStringField;
import tencent.im.cs.group_file_common.group_file_common.FileInfo;

public final class oidb_0x6d8$GetFileInfoRspBody
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 26, 34 }, new String[] { "int32_ret_code", "str_ret_msg", "str_client_wording", "file_info" }, new Object[] { Integer.valueOf(0), "", "", null }, GetFileInfoRspBody.class);
  public group_file_common.FileInfo file_info = new group_file_common.FileInfo();
  public final PBInt32Field int32_ret_code = PBField.initInt32(0);
  public final PBStringField str_client_wording = PBField.initString("");
  public final PBStringField str_ret_msg = PBField.initString("");
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\oidb\cmd0x6d8\oidb_0x6d8$GetFileInfoRspBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */