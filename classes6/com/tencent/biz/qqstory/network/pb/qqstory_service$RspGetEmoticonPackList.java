package com.tencent.biz.qqstory.network.pb;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class qqstory_service$RspGetEmoticonPackList
  extends MessageMicro
{
  public static final int IS_END_FIELD_NUMBER = 3;
  public static final int NEXT_COOKIE_FIELD_NUMBER = 4;
  public static final int PACK_LIST_FIELD_NUMBER = 2;
  public static final int RESULT_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBUInt32Field is_end = PBField.initUInt32(0);
  public final PBBytesField next_cookie = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBRepeatMessageField pack_list = PBField.initRepeatMessage(qqstory_struct.EmoticonPack.class);
  public qqstory_struct.ErrorInfo result = new qqstory_struct.ErrorInfo();
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18, 24, 34 }, new String[] { "result", "pack_list", "is_end", "next_cookie" }, new Object[] { null, null, Integer.valueOf(0), localByteStringMicro }, RspGetEmoticonPackList.class);
  }
}


/* Location:              E:\apk\QQ_91\classes6-dex2jar.jar!\com\tencent\biz\qqstory\network\pb\qqstory_service$RspGetEmoticonPackList.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */