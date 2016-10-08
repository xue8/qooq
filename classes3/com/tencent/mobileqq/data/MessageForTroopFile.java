package com.tencent.mobileqq.data;

import com.tencent.mobileqq.app.utils.MessagePkgUtils;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public class MessageForTroopFile
  extends ChatMessage
{
  public static final String TAG = MessageForTroopFile.class.getSimpleName();
  public String FromUin;
  public boolean bReported = false;
  public int bisID;
  public String dspFileName;
  public String dspFileSize;
  public long entitySessionId;
  public String fileName;
  public long fileSize;
  public int height;
  public long lastTime;
  public String sha1;
  public String url;
  public String uuid;
  public int width;
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void doParse()
  {
    try
    {
      TroopFileData localTroopFileData = (TroopFileData)MessagePkgUtils.a(this.msgData);
      if (localTroopFileData != null)
      {
        this.url = localTroopFileData.fileUrl;
        this.sha1 = localTroopFileData.sha1;
        this.dspFileSize = localTroopFileData.dspFileSize;
        this.dspFileName = localTroopFileData.dspFileName;
        this.bisID = localTroopFileData.bisID;
        this.uuid = localTroopFileData.uuid;
        this.fileSize = localTroopFileData.lfileSize;
        this.fileName = localTroopFileData.fileName;
        this.FromUin = localTroopFileData.FromUin;
        this.lastTime = localTroopFileData.lastTime;
        this.entitySessionId = localTroopFileData.entitySessionId;
        this.width = localTroopFileData.width;
        this.height = localTroopFileData.height;
      }
      this.msg = "[群文件]";
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
        Object localObject = null;
      }
    }
  }
  
  public String getSummaryMsg()
  {
    return "[文件]" + this.fileName;
  }
  
  public boolean isSupportReply()
  {
    return true;
  }
  
  protected void postRead()
  {
    parse();
  }
  
  protected void prewrite()
  {
    serial();
  }
  
  public void serial()
  {
    TroopFileData localTroopFileData = new TroopFileData();
    localTroopFileData.fileUrl = this.url;
    localTroopFileData.sha1 = this.sha1;
    localTroopFileData.fileName = this.fileName;
    localTroopFileData.dspFileName = this.dspFileName;
    localTroopFileData.dspFileSize = this.dspFileSize;
    localTroopFileData.bisID = this.bisID;
    localTroopFileData.uuid = this.uuid;
    localTroopFileData.lfileSize = this.fileSize;
    localTroopFileData.FromUin = this.FromUin;
    localTroopFileData.lastTime = this.lastTime;
    localTroopFileData.entitySessionId = this.entitySessionId;
    localTroopFileData.width = this.width;
    localTroopFileData.height = this.height;
    try
    {
      this.msgData = MessagePkgUtils.a(localTroopFileData);
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\tencent\mobileqq\data\MessageForTroopFile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */