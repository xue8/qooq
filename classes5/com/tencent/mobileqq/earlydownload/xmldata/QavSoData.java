package com.tencent.mobileqq.earlydownload.xmldata;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public class QavSoData
  extends QavSoDataBase
{
  public QavSoData()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public String getSharedPreferencesName()
  {
    return "early_qq.android.qav.so";
  }
  
  public String getStrResName()
  {
    return "qq.android.qav.so";
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\com\tencent\mobileqq\earlydownload\xmldata\QavSoData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */