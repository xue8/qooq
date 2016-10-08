package com.tencent.mobileqq.data;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.persistence.ConflictClause;
import com.tencent.mobileqq.persistence.Entity;
import com.tencent.mobileqq.persistence.uniqueConstraints;

@uniqueConstraints(clause=ConflictClause.IGNORE, columnNames="userUin,friendUin")
public class UinPair
  extends Entity
{
  public String friendUin;
  public String userUin;
  
  public UinPair()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public UinPair(String paramString1, String paramString2)
  {
    this.userUin = paramString1;
    this.friendUin = paramString2;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof UinPair)) {
        break label123;
      }
      if (this.userUin == null)
      {
        if (((UinPair)paramObject).userUin != null) {
          break label123;
        }
        if (this.friendUin == null)
        {
          if (((UinPair)paramObject).friendUin == null) {}
          for (boolean bool = true;; bool = false) {
            return bool;
          }
        }
        return this.friendUin.equals(((UinPair)paramObject).friendUin);
      }
      if (!this.userUin.equals(((UinPair)paramObject).userUin)) {
        break label123;
      }
      if (this.friendUin != null) {
        break;
      }
    } while (((UinPair)paramObject).friendUin == null);
    return false;
    return this.friendUin.equals(((UinPair)paramObject).friendUin);
    label123:
    return super.equals(paramObject);
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\tencent\mobileqq\data\UinPair.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */