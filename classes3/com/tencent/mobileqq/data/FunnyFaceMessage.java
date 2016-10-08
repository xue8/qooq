package com.tencent.mobileqq.data;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.qphone.base.util.QLog;
import java.io.ByteArrayOutputStream;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

public class FunnyFaceMessage
  implements Externalizable
{
  public static final int FACE_ID_BOMB = 2;
  public static final int FACE_ID_TURNTABLE = 1;
  private static final String TAG = FunnyFaceMessage.class.getSimpleName();
  private static int VERSION;
  public FunnyFaceMessage.Bomb bomb;
  public int faceId;
  public boolean playAnimation = true;
  public FunnyFaceMessage.Turntable turntable;
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    VERSION = 1;
  }
  
  public FunnyFaceMessage() {}
  
  public FunnyFaceMessage(FunnyFaceMessage paramFunnyFaceMessage)
  {
    this.playAnimation = paramFunnyFaceMessage.playAnimation;
    this.faceId = paramFunnyFaceMessage.faceId;
    this.turntable = paramFunnyFaceMessage.turntable;
    this.bomb = paramFunnyFaceMessage.bomb;
  }
  
  public byte[] getBytes()
  {
    Object localObject = new ByteArrayOutputStream();
    try
    {
      ObjectOutputStream localObjectOutputStream = new ObjectOutputStream((OutputStream)localObject);
      writeExternal(localObjectOutputStream);
      localObjectOutputStream.close();
      localObject = ((ByteArrayOutputStream)localObject).toByteArray();
      return (byte[])localObject;
    }
    catch (IOException localIOException)
    {
      if (QLog.isColorLevel()) {
        QLog.d("FunnyFaceMessage", 2, localIOException.getMessage(), localIOException);
      }
    }
    return null;
  }
  
  public boolean msgEquals(Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    boolean bool3 = false;
    if (paramObject == null)
    {
      bool2 = bool3;
      if (QLog.isColorLevel())
      {
        QLog.d(TAG, 2, "msgEquals, obj == null");
        bool2 = bool3;
      }
    }
    do
    {
      do
      {
        return bool2;
        if (paramObject == this)
        {
          if (QLog.isColorLevel()) {
            QLog.d(TAG, 2, "msgEquals, obj == this");
          }
          return true;
        }
        if ((paramObject instanceof FunnyFaceMessage)) {
          break;
        }
        bool2 = bool3;
      } while (!QLog.isColorLevel());
      QLog.d(TAG, 2, "msgEquals, obj not FunnyFaceMessage");
      return false;
      paramObject = (FunnyFaceMessage)paramObject;
      if (this.faceId == ((FunnyFaceMessage)paramObject).faceId) {
        break;
      }
      bool2 = bool3;
    } while (!QLog.isColorLevel());
    QLog.d(TAG, 2, "msgEquals, this.faceId == " + this.faceId + ", rhs.faceId == " + ((FunnyFaceMessage)paramObject).faceId);
    return false;
    for (;;)
    {
      try
      {
        switch (this.faceId)
        {
        case 1: 
          if (!this.turntable.hitUin.equals(((FunnyFaceMessage)paramObject).turntable.hitUin)) {
            continue;
          }
          bool3 = this.turntable.uinList.equals(((FunnyFaceMessage)paramObject).turntable.uinList);
          if (!bool3) {
            continue;
          }
        }
      }
      catch (Exception paramObject)
      {
        boolean bool4;
        bool1 = bool2;
        if (!QLog.isColorLevel()) {
          continue;
        }
        QLog.d(TAG, 2, ((Exception)paramObject).toString());
        bool1 = bool2;
        continue;
      }
      bool2 = bool1;
      if (!QLog.isColorLevel()) {
        break;
      }
      QLog.d(TAG, 2, "msgEquals, ret == " + bool1);
      return bool1;
      bool1 = false;
      continue;
      bool3 = this.bomb.isBurst;
      bool4 = ((FunnyFaceMessage)paramObject).bomb.isBurst;
      if (bool3 != bool4) {
        bool1 = false;
      }
    }
    return false;
  }
  
  public void readExternal(ObjectInput paramObjectInput)
  {
    if (paramObjectInput.readInt() == 1)
    {
      this.faceId = paramObjectInput.readInt();
      this.playAnimation = paramObjectInput.readBoolean();
      if (this.faceId != 1) {
        break label58;
      }
      this.turntable = new FunnyFaceMessage.Turntable();
      this.turntable.readExternal(paramObjectInput);
    }
    label58:
    while (this.faceId != 2) {
      return;
    }
    this.bomb = new FunnyFaceMessage.Bomb();
    this.bomb.readExternal(paramObjectInput);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("faceId:").append(this.faceId);
    if (this.faceId == 1)
    {
      localStringBuilder.append(",hituin:").append(this.turntable.hitUin).append(",uinList[");
      Iterator localIterator = this.turntable.uinList.iterator();
      while (localIterator.hasNext()) {
        localStringBuilder.append((String)localIterator.next()).append(",");
      }
      localStringBuilder.append("]").append(",nickNane:").append(this.turntable.hitNickName);
    }
    for (;;)
    {
      return localStringBuilder.toString();
      if (this.faceId == 2) {
        localStringBuilder.append(",isBurst:").append(this.bomb.isBurst);
      }
    }
  }
  
  public void writeExternal(ObjectOutput paramObjectOutput)
  {
    paramObjectOutput.writeInt(VERSION);
    paramObjectOutput.writeInt(this.faceId);
    paramObjectOutput.writeBoolean(this.playAnimation);
    if (this.faceId == 1) {
      this.turntable.writeExternal(paramObjectOutput);
    }
    while (this.faceId != 2) {
      return;
    }
    this.bomb.writeExternal(paramObjectOutput);
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\tencent\mobileqq\data\FunnyFaceMessage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */