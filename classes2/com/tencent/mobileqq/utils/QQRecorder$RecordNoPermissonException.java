package com.tencent.mobileqq.utils;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public class QQRecorder$RecordNoPermissonException
  extends RuntimeException
{
  public QQRecorder$RecordNoPermissonException(String paramString)
  {
    super(paramString);
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\mobileqq\utils\QQRecorder$RecordNoPermissonException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */