package com.dataline.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.InvalidProtocolBufferMicroException;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.qphone.base.util.QLog;
import cv;
import cw;
import tencent.im.s2c.msgtype0x211.submsgtype0x7.SubMsgType0x7.MsgBody;
import tencent.im.s2c.msgtype0x211.submsgtype0x7.SubMsgType0x7.MsgBody.ProgressRsp;

public class DLRouterSessionInfoRequestTask$NotifyReceiver
  extends BroadcastReceiver
{
  public DLRouterSessionInfoRequestTask$NotifyReceiver(DLRouterSessionInfoRequestTask paramDLRouterSessionInfoRequestTask)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    paramContext = paramIntent.getAction();
    if (paramContext.equalsIgnoreCase("SmartDevice_receiveDatalineCSReply")) {}
    label153:
    label158:
    do
    {
      do
      {
        return;
        if (!paramContext.equalsIgnoreCase("SmartDevice_receiveDatalineCCPush")) {
          break;
        }
        paramContext = paramIntent.getExtras().getByteArray("reqBuff");
      } while (paramContext == null);
      paramIntent = new SubMsgType0x7.MsgBody();
      for (;;)
      {
        try
        {
          paramContext = (SubMsgType0x7.MsgBody)paramIntent.mergeFrom(paramContext);
          if (!paramContext.uint32_sub_cmd.has()) {
            break label153;
          }
          i = paramContext.uint32_sub_cmd.get();
          if ((i != 13) || (!paramContext.msg_subcmd_0xd_progress_rsp.has())) {
            break;
          }
          paramContext = (SubMsgType0x7.MsgBody.ProgressRsp)paramContext.msg_subcmd_0xd_progress_rsp.get();
          paramIntent = Looper.getMainLooper();
          if (Thread.currentThread() == paramIntent.getThread()) {
            break label158;
          }
          new Handler(paramIntent).post(new cv(this, paramContext));
          return;
        }
        catch (InvalidProtocolBufferMicroException paramContext) {}
        if (!QLog.isColorLevel()) {
          break;
        }
        QLog.e("dataline.DLRouterSessionListAdapter", 2, "onRecvRouterMsg : subMsgType[0x7] failed", paramContext);
        return;
        int i = 0;
      }
      this.a.a(paramContext);
      return;
    } while (!paramContext.equalsIgnoreCase("SmartDevice_receiveDatalineCCReply"));
    paramContext = paramIntent.getExtras();
    paramIntent = Looper.getMainLooper();
    if (Thread.currentThread() != paramIntent.getThread())
    {
      new Handler(paramIntent).post(new cw(this, paramContext));
      return;
    }
    this.a.a(paramContext);
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\dataline\util\DLRouterSessionInfoRequestTask$NotifyReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */