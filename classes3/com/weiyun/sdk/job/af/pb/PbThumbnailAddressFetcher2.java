package com.weiyun.sdk.job.af.pb;

import com.weiyun.sdk.IWyFileSystem.ThumbnailType;
import com.weiyun.sdk.job.af.AddressFetcher.DownloadAddress;
import com.weiyun.sdk.job.af.AddressFetcher.ImageDownloadAddress;
import com.weiyun.sdk.util.ThumbnailUtils;

public class PbThumbnailAddressFetcher2
  extends PbDownloadAddressFetcher
{
  protected final IWyFileSystem.ThumbnailType mThumbnailType;
  
  public PbThumbnailAddressFetcher2(String paramString1, String paramString2, int paramInt, IWyFileSystem.ThumbnailType paramThumbnailType)
  {
    super(paramString1, paramString2, paramInt, null);
    this.mThumbnailType = paramThumbnailType;
  }
  
  public PbThumbnailAddressFetcher2(String paramString1, String paramString2, IWyFileSystem.ThumbnailType paramThumbnailType)
  {
    super(paramString1, paramString2);
    this.mThumbnailType = paramThumbnailType;
  }
  
  public AddressFetcher.DownloadAddress createDownloadAddress(String paramString1, int paramInt, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    return new AddressFetcher.ImageDownloadAddress(paramString1, paramInt, paramString2, paramString3, 30223, paramString4, paramString5, ThumbnailUtils.getThumbnailSpec(this.mThumbnailType));
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\weiyun\sdk\job\af\pb\PbThumbnailAddressFetcher2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */