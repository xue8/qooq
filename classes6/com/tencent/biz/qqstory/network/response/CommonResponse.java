package com.tencent.biz.qqstory.network.response;

import com.tencent.biz.qqstory.channel.BaseResponse;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public class CommonResponse
  extends BaseResponse
{
  public final byte[] a;
  
  public CommonResponse(byte[] paramArrayOfByte)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.a = paramArrayOfByte;
  }
}


/* Location:              E:\apk\QQ_91\classes6-dex2jar.jar!\com\tencent\biz\qqstory\network\response\CommonResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */