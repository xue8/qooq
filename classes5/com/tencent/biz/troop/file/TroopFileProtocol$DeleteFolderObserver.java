package com.tencent.biz.troop.file;

import android.os.Bundle;
import com.tencent.biz.ProtoUtils.TroopProtocolObserver;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.InvalidProtocolBufferMicroException;
import com.tencent.mobileqq.pb.PBInt32Field;
import tencent.im.oidb.cmd0x6d7.oidb_0x6d7.DeleteFolderRspBody;
import tencent.im.oidb.cmd0x6d7.oidb_0x6d7.RspBody;

public abstract class TroopFileProtocol$DeleteFolderObserver
  extends ProtoUtils.TroopProtocolObserver
{
  public TroopFileProtocol$DeleteFolderObserver()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void a(int paramInt, byte[] paramArrayOfByte, Bundle paramBundle)
  {
    if (paramInt != 0)
    {
      a(false, paramInt);
      return;
    }
    paramBundle = new oidb_0x6d7.RspBody();
    try
    {
      paramBundle.mergeFrom(paramArrayOfByte);
      paramArrayOfByte = (oidb_0x6d7.DeleteFolderRspBody)paramBundle.delete_folder_rsp.get();
      if (!paramArrayOfByte.int32_ret_code.has()) {
        break label84;
      }
      if (paramArrayOfByte.int32_ret_code.get() == 0)
      {
        a(true, 0);
        return;
      }
    }
    catch (InvalidProtocolBufferMicroException paramArrayOfByte)
    {
      a(false, -1);
      return;
    }
    a(false, paramArrayOfByte.int32_ret_code.get());
    return;
    label84:
    a(false, -1);
  }
  
  protected abstract void a(boolean paramBoolean, int paramInt);
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\com\tencent\biz\troop\file\TroopFileProtocol$DeleteFolderObserver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */