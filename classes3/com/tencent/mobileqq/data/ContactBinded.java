package com.tencent.mobileqq.data;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.persistence.Entity;

public class ContactBinded
  extends Entity
{
  public boolean isReaded;
  public long timestamp;
  
  public ContactBinded()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\tencent\mobileqq\data\ContactBinded.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */