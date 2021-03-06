package com.tencent.biz.qqstory.network.request;

import com.tencent.biz.qqstory.channel.BaseResponse;
import com.tencent.biz.qqstory.channel.NetworkRequest;
import com.tencent.biz.qqstory.network.pb.qqstory_service.ReqUploadStoryVideo;
import com.tencent.biz.qqstory.network.pb.qqstory_service.RspUploadStoryVideo;
import com.tencent.biz.qqstory.network.response.GetVideoUploadAddrResponse;
import com.tencent.biz.qqstory.support.logging.SLog;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.InvalidProtocolBufferMicroException;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBUInt64Field;

public class GetVideoUploadAddrRequest
  extends NetworkRequest
{
  public static final String a = "Q.qqstory:GetVideoUploadAddrRequest";
  public static final String b = "StorySvc.video_apply_upload";
  public long a;
  public String c;
  public String d;
  
  public GetVideoUploadAddrRequest()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public BaseResponse a(byte[] paramArrayOfByte)
  {
    qqstory_service.RspUploadStoryVideo localRspUploadStoryVideo = new qqstory_service.RspUploadStoryVideo();
    try
    {
      localRspUploadStoryVideo.mergeFrom(paramArrayOfByte);
      return new GetVideoUploadAddrResponse(localRspUploadStoryVideo);
    }
    catch (InvalidProtocolBufferMicroException paramArrayOfByte) {}
    return null;
  }
  
  public String a()
  {
    return "StorySvc.video_apply_upload";
  }
  
  protected byte[] a()
  {
    qqstory_service.ReqUploadStoryVideo localReqUploadStoryVideo = new qqstory_service.ReqUploadStoryVideo();
    if (this.c != null)
    {
      localReqUploadStoryVideo.md5.set(ByteStringMicro.copyFromUtf8(this.c));
      if (this.d != null)
      {
        localReqUploadStoryVideo.sha.set(ByteStringMicro.copyFromUtf8(this.d));
        localReqUploadStoryVideo.size.set(this.a);
        return localReqUploadStoryVideo.toByteArray();
      }
    }
    else
    {
      SLog.d("Q.qqstory:GetVideoUploadAddrRequest", "without md5");
      throw new IllegalArgumentException("without md5");
    }
    SLog.d("Q.qqstory:GetVideoUploadAddrRequest", "without sha");
    throw new IllegalArgumentException("without sha");
  }
  
  public String toString()
  {
    return "GetStoryVideoUploadAddressRequest{md5='" + this.c + '\'' + ", sha='" + this.d + '\'' + ", size=" + this.a + '}';
  }
}


/* Location:              E:\apk\QQ_91\classes6-dex2jar.jar!\com\tencent\biz\qqstory\network\request\GetVideoUploadAddrRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */