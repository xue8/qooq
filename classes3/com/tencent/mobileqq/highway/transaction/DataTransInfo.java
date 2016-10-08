package com.tencent.mobileqq.highway.transaction;

import com.tencent.mobileqq.highway.utils.BdhUtils;

public class DataTransInfo
{
  public int bitmapE;
  public int bitmapS;
  public String errString;
  public int errno;
  public int fileSize;
  public int length;
  public byte[] md5;
  public String md5Str;
  public int offset;
  public Transaction parent;
  public int retryTimes;
  public long timeCost_cache;
  public long timeCost_hw;
  public long timeCost_req;
  
  public DataTransInfo(Transaction paramTransaction)
  {
    this.parent = paramTransaction;
  }
  
  public byte[] getData()
  {
    byte[] arrayOfByte = this.parent.getData(this);
    if (arrayOfByte != null)
    {
      this.md5 = BdhUtils.encode(arrayOfByte);
      this.md5Str = BdhUtils.bytes2HexStr(this.md5);
    }
    return arrayOfByte;
  }
  
  public void handleCancle()
  {
    byte[] arrayOfByte = this.parent.bitmap;
    int i = this.bitmapS;
    while (i <= this.bitmapE)
    {
      arrayOfByte[i] = 0;
      i += 1;
    }
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\tencent\mobileqq\highway\transaction\DataTransInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */