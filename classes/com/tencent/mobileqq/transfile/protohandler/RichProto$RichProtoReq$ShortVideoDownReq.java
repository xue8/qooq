package com.tencent.mobileqq.transfile.protohandler;

import com.qq.taf.jce.HexUtil;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public class RichProto$RichProtoReq$ShortVideoDownReq
  extends RichProto.RichProtoReq.ReqCommon
{
  public int a;
  public String a;
  public byte[] a;
  public int b;
  public String b;
  public int c;
  public int d;
  public int f;
  public int g;
  public int h;
  public int i;
  public int j;
  
  public RichProto$RichProtoReq$ShortVideoDownReq()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(" chatType:");
    localStringBuilder.append(this.jdField_a_of_type_Int);
    localStringBuilder.append(" clientType:");
    localStringBuilder.append(this.jdField_b_of_type_Int);
    localStringBuilder.append(" seq:");
    localStringBuilder.append(this.c);
    localStringBuilder.append(" fileId:");
    localStringBuilder.append(this.jdField_a_of_type_JavaLangString);
    localStringBuilder.append(" troopUin:");
    localStringBuilder.append(this.jdField_b_of_type_JavaLangString);
    localStringBuilder.append(" agentType:");
    localStringBuilder.append(this.d);
    localStringBuilder.append(" md5:");
    localStringBuilder.append(HexUtil.bytes2HexStr(this.jdField_a_of_type_ArrayOfByte));
    localStringBuilder.append(" busiType:");
    localStringBuilder.append(this.f);
    localStringBuilder.append(" fileType:");
    localStringBuilder.append(this.g);
    localStringBuilder.append(" downType:");
    localStringBuilder.append(this.h);
    localStringBuilder.append(" sceneType:");
    localStringBuilder.append(this.i);
    localStringBuilder.append(" subBusiType:");
    localStringBuilder.append(this.j);
    return localStringBuilder.toString();
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\com\tencent\mobileqq\transfile\protohandler\RichProto$RichProtoReq$ShortVideoDownReq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */