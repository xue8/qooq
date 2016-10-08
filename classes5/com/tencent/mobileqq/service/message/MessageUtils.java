package com.tencent.mobileqq.service.message;

import com.tencent.mobileqq.app.AppConstants;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.message.MsgProxyUtils;
import com.tencent.mobileqq.app.message.QQMessageFacade;
import com.tencent.mobileqq.data.MessageForText.AtTroopMemberInfo;
import com.tencent.mobileqq.data.MessageRecord;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.utils.VipUtils;
import com.tencent.qphone.base.util.QLog;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageUtils
{
  public static final int a = 20;
  private static final String a = "MessageUtils";
  public static final short a = 65;
  public static final short[] a = { 13, 12, 27, 20, 39, 38, 97, 46, 63, 5, 9, 33, 16, 18, 106, 59, 55, 112, 21, 2, 6, 4, 19, 14, 11, 10, 26, 96, 66, 116, 22, 23, 15, 0, 32, 8, 109, 28, 42, 36, 1, 108, 30, 3, 103, 49, 101, 85, 105, 34, 29, 111, 76, 77, 78, 79, 118, 64, 61, 53, 89, 113, 117, 119, 124, 122, 60, 50, 75, 81, 56, 41, 121, 120, 67, 74, 69, 57, 37, 129, 54, 24, 25, 31, 35, 98, 99, 100, 102, 104, 107, 110, 114, 115, 123, 43, 86, 125, 126, 127, 128, 130, 131, 132, 133, 134, 7, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9 };
  public static final short[] b = { 33, 40, 19, 43, 21, 9, 20, 106, 35, 250, 25, 24, 1, 0, 23, 32, 12, -1, 13, 22, 3, 18, 30, 31, 81, 82, 26, 2, 37, 50, 42, 83, 34, 11, 49, 84, 39, 78, 5, 4, -1, 71, 38, 95, -1, -1, 7, -1, -1, 45, 67, -1, -1, 59, 80, 16, 70, 77, -1, 15, 66, 58, -1, 8, 57, -1, 28, 74, -1, 76, -1, -1, -1, -1, 75, 68, 52, 53, 54, 55, -1, 69, -1, -1, -1, 47, 96, -1, -1, 60, -1, -1, -1, -1, -1, -1, 27, 6, 85, 86, 87, 46, 88, 44, 89, 48, 14, 90, 41, 36, 91, 51, 17, 61, 92, 93, 29, 62, 56, 63, 73, 72, 65, 94, 64, 97, 98, 99, 100, 79, 101, 102, 103, 104, 105, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142 };
  @Deprecated
  public static final short[] c = { 13, 12, 56, 73, 88, 87, 97, 59, 33, 5, 9, 82, 51, 53, 106, 72, 92, 112, 74, 2, 6, 4, 54, 14, 11, 10, 55, 96, 36, 116, 75, 76, 50, 0, 81, 8, 109, 57, 27, 85, 1, 108, 79, 3, 103, 62, 101, 21, 105, 83, 58, 111, 46, 47, 71, 95, 118, 34, 64, 38, 32, 113, 117, 119, 124, 122, 63, 89, 45, 16, 93, 25, 121, 120, 37, 42, 39, 29, 86, 129, 91, 77, 78, 80, 84, 98, 99, 100, 102, 104, 107, 110, 114, 115, 123, 23, 26, 125, 126, 127, 128, 130, 131, 132, 133, 134, 7, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9 };
  @Deprecated
  public static final short[] d = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 34, 41, 20, 44, 22, 10, 21, 107, 36, 251, 26, 25, 2, 1, 24, 0, 70, 0, 0, 0, 0, 48, 0, 96, 0, 72, 97, 39, 0, 78, 0, 0, 61, 9, 58, 0, 29, 75, 60, 77, 0, 0, 76, 0, 0, 69, 53, 54, 0, 0, 33, 13, 0, 14, 23, 27, 3, 38, 51, 8, 0, 0, 46, 67, 59, 0, 0, 0, 0, 0, 0, 55, 16, 4, 19, 31, 32, 82, 83, 43, 84, 35, 12, 50, 85, 40, 79, 6, 5, 68, 0, 81, 17, 71, 0, 56, 28, 7, 86, 87, 88, 47, 89, 45, 90, 49, 15, 91, 42, 37, 92, 52, 18, 62, 93, 94, 30, 63, 57, 64, 74, 73, 66, 95, 65, 98, 99, 100, 101, 80, 102, 103, 104, 105, 106, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public static int a()
  {
    return Math.abs(new Random().nextInt());
  }
  
  static int a(char paramChar, byte[] paramArrayOfByte, int paramInt)
  {
    if (paramChar < '')
    {
      paramArrayOfByte[(0 + paramInt)] = ((byte)paramChar);
      return 1;
    }
    if (paramChar < 'ࠀ')
    {
      paramArrayOfByte[(paramInt + 0)] = ((byte)(paramChar >> '\006' & 0x1F | 0xC0));
      paramArrayOfByte[(paramInt + 1)] = ((byte)(paramChar & 0x3F | 0x80));
      return 2;
    }
    if (paramChar < 65536)
    {
      paramArrayOfByte[(paramInt + 0)] = ((byte)(paramChar >> '\f' & 0xF | 0xE0));
      paramArrayOfByte[(paramInt + 1)] = ((byte)(paramChar >> '\006' & 0x3F | 0x80));
      paramArrayOfByte[(paramInt + 2)] = ((byte)(paramChar & 0x3F | 0x80));
      return 3;
    }
    if (paramChar < 2097152)
    {
      paramArrayOfByte[(paramInt + 0)] = ((byte)(paramChar >> '\022' & 0x7 | 0xF0));
      paramArrayOfByte[(paramInt + 1)] = ((byte)(paramChar >> '\f' & 0x3F | 0x80));
      paramArrayOfByte[(paramInt + 2)] = ((byte)(paramChar >> '\006' & 0x3F | 0x80));
      paramArrayOfByte[(paramInt + 3)] = ((byte)(paramChar & 0x3F | 0x80));
      return 4;
    }
    return 0;
  }
  
  public static int a(long paramLong)
  {
    return (int)(0xFFFFFFFFFFFFFFFF & paramLong);
  }
  
  public static int a(QQAppInterface paramQQAppInterface, String paramString)
  {
    int i = 0;
    int j = VipUtils.a(paramQQAppInterface, paramString);
    if ((j & 0x4) != 0) {
      i = 2;
    }
    while ((j & 0x2) == 0) {
      return i;
    }
    return 1;
  }
  
  public static long a(int paramInt)
  {
    return 0x100000000000000 | paramInt;
  }
  
  public static long a(long paramLong)
  {
    return 0x200000000000000 | paramLong << 16 | 0xA6;
  }
  
  public static long a(long paramLong, int paramInt)
  {
    if (MsgProxyUtils.c(paramInt)) {
      return (short)(int)paramLong;
    }
    return 0L;
  }
  
  public static String a(int paramInt)
  {
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (MsgProxyUtils.s(paramInt))
    {
      if (MsgProxyUtils.a(paramInt) != 1001) {
        break label27;
      }
      localObject1 = AppConstants.ar;
    }
    label27:
    do
    {
      return (String)localObject1;
      if (MsgProxyUtils.a(paramInt) == 1009) {
        return AppConstants.ag;
      }
      localObject1 = localObject2;
    } while (MsgProxyUtils.a(paramInt) != 1010);
    return AppConstants.aH;
  }
  
  public static String a(String paramString, boolean paramBoolean)
  {
    return a(paramString, paramBoolean, null);
  }
  
  public static String a(String paramString, boolean paramBoolean, ArrayList paramArrayList)
  {
    if (paramString == null) {
      return "";
    }
    char[] arrayOfChar = paramString.toCharArray();
    int i2 = 0;
    int j = 0;
    int i3 = 0;
    int k = 0;
    int i1 = 0;
    int i;
    if (i1 < arrayOfChar.length)
    {
      paramString = null;
      i = j;
      if (paramArrayList != null)
      {
        i = j;
        label49:
        if (i >= paramArrayList.size()) {
          break label399;
        }
        paramString = (MessageForText.AtTroopMemberInfo)paramArrayList.get(i);
        if ((paramString == null) || (!paramString.isValid())) {
          break label219;
        }
      }
    }
    for (;;)
    {
      int m = i;
      j = k;
      int n = i3;
      if (paramString != null)
      {
        m = i;
        j = k;
        n = i3;
        if (paramString.startPos <= i1)
        {
          if (paramString.startPos == i1) {
            k = i2;
          }
          if (i1 < paramString.startPos + paramString.textLen)
          {
            m = i;
            j = k;
            n = i3;
            if (arrayOfChar[i1] != '\024') {
              break label264;
            }
            i2 -= 2;
            m = k;
            j = i3 - 2;
            n = i1 + 1;
            k = i;
            i = m;
            m = n;
          }
        }
      }
      for (;;)
      {
        i3 = j;
        i1 = m + 1;
        j = k;
        k = i;
        break;
        label219:
        i += 1;
        break label49;
        paramString.startPos = ((short)(k + paramString.startPos));
        j = 0;
        paramString.textLen = ((short)(i3 + paramString.textLen));
        n = 0;
        m = i + 1;
        label264:
        if ((arrayOfChar[i1] == '\r') && ((!paramBoolean) || (i1 <= 0) || (arrayOfChar[(i1 - 1)] != '\024')))
        {
          arrayOfChar[(i1 + i2)] = '\n';
          if ((i1 + 1 < arrayOfChar.length) && (arrayOfChar[(i1 + 1)] == '\n'))
          {
            i2 -= 1;
            i = j;
            j = n;
            k = m;
            m = i1 + 1;
          }
        }
        else if (i2 != 0)
        {
          arrayOfChar[(i1 + i2)] = arrayOfChar[i1];
        }
        i = j;
        j = n;
        k = m;
        m = i1;
      }
      return new String(arrayOfChar, 0, arrayOfChar.length + i2);
      label399:
      paramString = null;
    }
  }
  
  public static void a(QQAppInterface paramQQAppInterface, String paramString)
  {
    int j = 0;
    String str = paramQQAppInterface.a();
    long l = MessageCache.a();
    MessageRecord localMessageRecord = MessageRecordFactory.a(63524);
    localMessageRecord.init(str, paramString, str, "你已屏蔽%s的会话", l, 0, 0, l);
    localMessageRecord.msgtype = 63524;
    localMessageRecord.isread = true;
    paramString = paramQQAppInterface.a().b(paramString, 0);
    int i = j;
    if (paramString != null)
    {
      i = j;
      if (paramString.size() > 0)
      {
        i = j;
        if (MsgProxyUtils.a((MessageRecord)paramString.get(paramString.size() - 1), localMessageRecord, false))
        {
          if (QLog.isColorLevel()) {
            QLog.w("MessageUtils", 2, "inserShieldTipsForFriends filtered!");
          }
          i = 1;
        }
      }
    }
    if (i == 0) {
      paramQQAppInterface.a().a(localMessageRecord, str);
    }
  }
  
  public static boolean a(int paramInt)
  {
    return (paramInt == 64534) || (paramInt == 64535) || (paramInt == 64532) || (paramInt == 64489) || (paramInt == 64523) || (paramInt == 63506) || (paramInt == 64517) || (paramInt == 64518) || (paramInt == 61536) || (paramInt == 61535) || (paramInt == 62529) || (paramInt == 64524) || (paramInt == 63524) || (paramInt == 63523) || (paramInt == 62528) || (paramInt == 62527) || (paramInt == 61516) || (paramInt == 62526) || (paramInt == 62523) || (paramInt == 62525) || (paramInt == 63521) || (paramInt == 61528) || (paramInt == 61534) || (paramInt == 61533) || (paramInt == 61532) || (paramInt == 61531) || (paramInt == 64522) || (paramInt == 64520) || (paramInt == 64519) || (paramInt == 64486) || (paramInt == 61532) || (paramInt == 63517) || (paramInt == 64495) || (paramInt == 64493) || (paramInt == 64492) || (paramInt == 64491) || (paramInt == 60536) || (paramInt == 60535) || (paramInt == 1018) || (paramInt == 61526) || (paramInt == 64512) || (paramInt == 64508) || (paramInt == 60534) || (paramInt == 2024) || (paramInt == 63494) || (paramInt == 64510) || (paramInt == 64509) || (paramInt == 60531) || (paramInt == 64490) || (paramInt == 63509) || (paramInt == 63499) || (paramInt == 61031) || (paramInt == 61030) || (paramInt == 61029) || (paramInt == 63508) || (paramInt == 61525) || (paramInt == 60530) || (paramInt == 60529) || (paramInt == 63507) || (paramInt == 63505) || (paramInt == 63503) || (paramInt == 63502) || (paramInt == 64488) || (paramInt == 63495) || (paramInt == 63493) || (paramInt == 61515) || (paramInt == 61514) || (paramInt == 60525) || (paramInt == 63487);
  }
  
  public static boolean a(MessageRecord paramMessageRecord)
  {
    if (paramMessageRecord.msgtype == 64536)
    {
      if ((paramMessageRecord.msg == null) || (paramMessageRecord.msg.length() == 0)) {}
      while ((paramMessageRecord.msg.trim().length() == 0) && (paramMessageRecord.msg.charAt(0) != '\024')) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean a(String paramString, int paramInt)
  {
    paramString = paramString.toLowerCase();
    return (paramInt != 0) && ((paramString.endsWith(".gif")) || (paramString.endsWith(".png")) || (paramString.endsWith(".jpg")) || (paramString.endsWith(".jpeg")) || (paramString.endsWith(".bmp")));
  }
  
  public static byte[] a(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    int m = paramString.length();
    byte[] arrayOfByte = new byte[m << 2];
    int k = 0;
    int j = 0;
    if (k < m)
    {
      int i = paramString.charAt(k);
      if (i != 20) {
        j += a(i, arrayOfByte, j);
      }
      for (;;)
      {
        k += 1;
        break;
        int n = j + 1;
        arrayOfByte[j] = ((byte)i);
        i = paramString.charAt(k + 1);
        if (i >= c.length)
        {
          j = a(i, arrayOfByte, n) + n;
        }
        else
        {
          int i1 = (char)(c[i] + 65);
          j = n + 1;
          arrayOfByte[n] = ((byte)i1);
          k += 1;
        }
      }
    }
    paramString = new byte[j];
    System.arraycopy(arrayOfByte, 0, paramString, 0, j);
    return paramString;
  }
  
  public static byte[] a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(paramArrayOfByte.length * 2);
    int i = 0;
    if (i < paramArrayOfByte.length)
    {
      if (paramArrayOfByte[i] != 20) {
        if (paramArrayOfByte[i] == 13) {
          if ((i > 0) && (paramArrayOfByte[(i - 1)] == 20)) {
            localByteBuffer.put(paramArrayOfByte[i]);
          }
        }
      }
      for (;;)
      {
        i += 1;
        break;
        if (i + 1 < paramArrayOfByte.length)
        {
          if (paramArrayOfByte[(i + 1)] != 10) {
            localByteBuffer.put((byte)10);
          }
        }
        else
        {
          localByteBuffer.put((byte)10);
          continue;
          localByteBuffer.put(paramArrayOfByte[i]);
          continue;
          localByteBuffer.put(paramArrayOfByte[i]);
        }
      }
    }
    paramArrayOfByte = new byte[localByteBuffer.position()];
    localByteBuffer.flip();
    localByteBuffer.get(paramArrayOfByte);
    return paramArrayOfByte;
  }
  
  public static String[] a(String paramString)
  {
    String[] arrayOfString = new String[3];
    int i = paramString.indexOf("http://maps.google.com/maps?q=");
    Object localObject;
    int j;
    if (i >= 0)
    {
      paramString = paramString.substring(i);
      localObject = Pattern.compile("\\s*(loc:)?-?\\d+(.\\d+)?\\s*,\\s*-?\\d+(.\\d+)?").matcher(paramString);
      if (((Matcher)localObject).find())
      {
        localObject = ((Matcher)localObject).group();
        if ((localObject != null) && (((String)localObject).length() > 0))
        {
          j = ((String)localObject).indexOf(',');
          i = ((String)localObject).indexOf("loc:");
          if (j >= 0)
          {
            if (i < 0) {
              break label174;
            }
            i += 4;
          }
        }
      }
    }
    for (;;)
    {
      arrayOfString[0] = ((String)localObject).substring(i, j);
      arrayOfString[1] = ((String)localObject).substring(j + 1, ((String)localObject).length());
      paramString = Pattern.compile("\\(.+\\)").matcher(paramString);
      if (paramString.find())
      {
        paramString = paramString.group();
        if ((paramString != null) && (paramString.length() > 2)) {
          arrayOfString[2] = paramString.substring(1, paramString.length() - 1);
        }
      }
      if (arrayOfString[2] == null) {
        arrayOfString[2] = "";
      }
      return arrayOfString;
      label174:
      i = 0;
    }
  }
  
  public static int b(long paramLong)
  {
    return (int)(0xFFFFFFFFFFFFFFFF & paramLong);
  }
  
  public static boolean b(int paramInt)
  {
    return (paramInt != 64534) && (paramInt != 64535) && (paramInt != 64532) && (paramInt != 61536) && (paramInt != 61535) && (paramInt != 62529) && (paramInt != 64524) && (paramInt != 63524) && (paramInt != 63523) && (paramInt != 62528) && (paramInt != 63521) && (paramInt != 61534) && (paramInt != 61533) && (paramInt != 61532) && (paramInt != 61527) && (paramInt != 63515) && (paramInt != 60536) && (paramInt != 60535) && (paramInt != 63508) && (paramInt != 63502) && (paramInt != 63503) && (paramInt != 64520) && (paramInt != 63487);
  }
  
  public static boolean b(String paramString, int paramInt)
  {
    paramString = paramString.toLowerCase();
    return (paramInt != 0) && (paramString.endsWith(".amr"));
  }
  
  public static byte[] b(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(paramArrayOfByte.length * 2);
    int i = 0;
    if (i < paramArrayOfByte.length)
    {
      if (paramArrayOfByte[i] != 20) {
        if (paramArrayOfByte[i] == 13) {
          if ((i > 0) && (paramArrayOfByte[(i - 1)] == 20))
          {
            localByteBuffer.put(paramArrayOfByte[i]);
            j = i;
          }
        }
      }
      int k;
      do
      {
        for (;;)
        {
          i = j + 1;
          break;
          if (i + 1 < paramArrayOfByte.length)
          {
            j = i;
            if (paramArrayOfByte[(i + 1)] != 10)
            {
              localByteBuffer.put((byte)10);
              j = i;
            }
          }
          else
          {
            localByteBuffer.put((byte)10);
            j = i;
            continue;
            localByteBuffer.put(paramArrayOfByte[i]);
            j = i;
          }
        }
        k = (short)(paramArrayOfByte[(i + 1)] & 0xFF);
        localByteBuffer.put(paramArrayOfByte[i]);
        j = i;
      } while (d[k] <= 0);
      int j = d[k] - 1;
      if (j < 128) {
        localByteBuffer.put((byte)j);
      }
      for (;;)
      {
        j = i + 1;
        break;
        localByteBuffer.put((byte)(j >> 6 & 0x1F | 0xC0));
        localByteBuffer.put((byte)(j >> 0 & 0x3F | 0x80));
      }
    }
    paramArrayOfByte = new byte[localByteBuffer.position()];
    localByteBuffer.flip();
    localByteBuffer.get(paramArrayOfByte);
    return paramArrayOfByte;
  }
  
  public static boolean c(int paramInt)
  {
    return (paramInt == 9) || (paramInt == 10) || (paramInt == 31) || (paramInt == 79) || (paramInt == 97) || (paramInt == 120) || (paramInt == 132) || (paramInt == 133) || (paramInt == 166) || (paramInt == 167);
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\com\tencent\mobileqq\service\message\MessageUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */