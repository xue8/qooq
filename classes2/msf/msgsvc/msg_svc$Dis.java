package msf.msgsvc;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class msg_svc$Dis
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8 }, new String[] { "dis_uin" }, new Object[] { Long.valueOf(0L) }, Dis.class);
  public final PBUInt64Field dis_uin = PBField.initUInt64(0L);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\msf\msgsvc\msg_svc$Dis.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */