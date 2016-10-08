package com.tencent.mobileqq.service.lbs;

import QQService.UserProfile;
import android.os.Bundle;
import com.qq.taf.jce.HexUtil;
import com.tencent.mobileqq.app.LBSHandler.UserProfileComparator;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.data.CardProfile;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.qphone.base.remote.ToServiceMsg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class LbsPortraitUtil
{
  public static final int a = 1048576;
  public static final String a = "LBS_PORTRAIT";
  public static final int b = 34;
  public static final String b = "LAST_PORTRAIT_FILEKEY";
  public static final int c = 1;
  public static final String c = "LAST_PORTRAIT_PATH";
  public static final int d = 2;
  public static final String d = "LAST_PORTRAIT_TIMESTAMP";
  public static final int e = 3;
  public static final String e = "ALL_JOINED_FILE_KEYS";
  public static final int f = 4;
  public static final String f = "_FILEKEYS";
  public static final int g = 0;
  public static final int h = 1;
  public static final int i = 2;
  public static final int j = 3;
  public static final int k = 4;
  
  public LbsPortraitUtil()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public static int a(String paramString)
  {
    int n = 0;
    int i1 = paramString.lastIndexOf(".");
    int m = n;
    if (i1 < paramString.length())
    {
      paramString = paramString.substring(i1 + 1).toLowerCase();
      if (!"bmp".equals(paramString)) {
        break label43;
      }
      m = 1;
    }
    label43:
    do
    {
      return m;
      if ("gif".equals(paramString)) {
        return 2;
      }
      if (("jpg".equals(paramString)) || ("jpeg".equals(paramString))) {
        return 3;
      }
      m = n;
    } while (!"png".equals(paramString));
    return 4;
  }
  
  public static ArrayList a(ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    HashSet localHashSet = new HashSet();
    Object localObject = paramArrayList1.iterator();
    paramArrayList1 = paramArrayList2.iterator();
    while (((Iterator)localObject).hasNext()) {
      localHashSet.add(Long.valueOf(((UserProfile)((Iterator)localObject).next()).lEctID));
    }
    while (paramArrayList1.hasNext())
    {
      localObject = (UserProfile)paramArrayList1.next();
      if (localHashSet.contains(Long.valueOf(((UserProfile)localObject).lEctID))) {
        ((UserProfile)localObject).bVote = 1;
      }
    }
    Collections.sort(paramArrayList2, new LBSHandler.UserProfileComparator());
    return paramArrayList2;
  }
  
  public static ArrayList a(List paramList1, List paramList2)
  {
    HashSet localHashSet = new HashSet();
    ArrayList localArrayList = new ArrayList();
    paramList1 = paramList1.iterator();
    paramList2 = paramList2.iterator();
    while (paramList1.hasNext())
    {
      CardProfile localCardProfile = (CardProfile)paramList1.next();
      localHashSet.add(Long.valueOf(localCardProfile.lEctID));
      localArrayList.add(localCardProfile);
    }
    while (paramList2.hasNext())
    {
      paramList1 = (CardProfile)paramList2.next();
      if (!localHashSet.contains(Long.valueOf(paramList1.lEctID))) {
        localArrayList.add(paramList1);
      }
    }
    return localArrayList;
  }
  
  public static List a(List paramList)
  {
    paramList = paramList.iterator();
    ArrayList localArrayList = new ArrayList();
    while (paramList.hasNext())
    {
      byte[] arrayOfByte = ((UserProfile)paramList.next()).vFaceID;
      if ((arrayOfByte != null) && (arrayOfByte.length > 0)) {
        localArrayList.add(HexUtil.bytes2HexStr(arrayOfByte));
      }
    }
    return localArrayList;
  }
  
  public static void a(int paramInt, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int n;
    int m;
    if ((paramInt == 0) && (paramArrayOfByte1[0] == 1))
    {
      int i1 = paramArrayOfByte1[1];
      paramInt = 4;
      while (paramInt < paramArrayOfByte1.length)
      {
        n = paramArrayOfByte1[paramInt];
        m = n;
        if (n < 0) {
          m = n + 255 + 1;
        }
        paramArrayOfByte1[paramInt] = ((byte)(m ^ i1));
        paramInt += 1;
      }
      paramArrayOfByte2 = new byte[paramArrayOfByte1.length - 4];
      System.arraycopy(paramArrayOfByte1, 4, paramArrayOfByte2, 0, paramArrayOfByte2.length);
      return;
    }
    paramInt = 0;
    while (paramInt < paramArrayOfByte1.length)
    {
      n = paramArrayOfByte1[paramInt];
      m = n;
      if (n < 0) {
        m = n + 255 + 1;
      }
      paramArrayOfByte1[paramInt] = ((byte)(m ^ 0x0));
      paramInt += 1;
    }
    paramArrayOfByte2 = new byte[paramArrayOfByte1.length];
    System.arraycopy(paramArrayOfByte1, 0, paramArrayOfByte2, 0, paramArrayOfByte2.length);
  }
  
  public static void a(QQAppInterface paramQQAppInterface, long paramLong, String paramString, int paramInt)
  {
    ToServiceMsg localToServiceMsg = new ToServiceMsg("mobileqq.service", String.valueOf(paramLong), "MCardSvc.ReqFaceInfo");
    localToServiceMsg.extraData.putLong("uin", Long.parseLong(paramString));
    localToServiceMsg.extraData.putInt("timestamp", paramInt);
    paramQQAppInterface.a(localToServiceMsg);
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\com\tencent\mobileqq\service\lbs\LbsPortraitUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */