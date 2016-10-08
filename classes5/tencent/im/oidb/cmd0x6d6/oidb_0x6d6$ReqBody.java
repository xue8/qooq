package tencent.im.oidb.cmd0x6d6;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;

public final class oidb_0x6d6$ReqBody
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18, 26, 34, 42, 50 }, new String[] { "upload_file_req", "resend_file_req", "download_file_req", "delete_file_req", "rename_file_req", "move_file_req" }, new Object[] { null, null, null, null, null, null }, ReqBody.class);
  public oidb_0x6d6.DeleteFileReqBody delete_file_req = new oidb_0x6d6.DeleteFileReqBody();
  public oidb_0x6d6.DownloadFileReqBody download_file_req = new oidb_0x6d6.DownloadFileReqBody();
  public oidb_0x6d6.MoveFileReqBody move_file_req = new oidb_0x6d6.MoveFileReqBody();
  public oidb_0x6d6.RenameFileReqBody rename_file_req = new oidb_0x6d6.RenameFileReqBody();
  public oidb_0x6d6.ResendReqBody resend_file_req = new oidb_0x6d6.ResendReqBody();
  public oidb_0x6d6.UploadFileReqBody upload_file_req = new oidb_0x6d6.UploadFileReqBody();
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\oidb\cmd0x6d6\oidb_0x6d6$ReqBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */