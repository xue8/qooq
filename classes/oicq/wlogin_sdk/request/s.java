package oicq.wlogin_sdk.request;

import oicq.wlogin_sdk.b.a;
import oicq.wlogin_sdk.b.ab;
import oicq.wlogin_sdk.b.af;
import oicq.wlogin_sdk.b.av;
import oicq.wlogin_sdk.b.bz;
import oicq.wlogin_sdk.b.c;
import oicq.wlogin_sdk.b.cq;
import oicq.wlogin_sdk.b.i;
import oicq.wlogin_sdk.b.j;
import oicq.wlogin_sdk.b.q;
import oicq.wlogin_sdk.tools.util;

public class s
  extends oicq_request
{
  public s(t paramt)
  {
    this.t = 2064;
    this.u = 4;
    this.v = "wtlogin.name2uin";
    this.x = paramt;
    this.x.m = 0;
  }
  
  public int a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, byte[] paramArrayOfByte, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, long[] paramArrayOfLong, WUserSigInfo paramWUserSigInfo)
  {
    int i = t.u;
    this.x.g = new String(paramArrayOfByte);
    paramInt1 = 0;
    for (;;)
    {
      Object localObject = a(paramLong1, paramLong2, i, paramInt2, paramArrayOfByte, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramArrayOfLong, t.Y, t.y);
      a(this.h, this.t, this.i, 0L, this.l, this.m, i, this.o, (byte[])localObject);
      localObject = String.valueOf(this.x.f);
      int j = a((String)localObject, false, paramWUserSigInfo);
      if (j != 0) {
        return j;
      }
      j = b();
      util.LOGI("retry num:" + paramInt1 + " ret:" + j + " uin: " + (String)localObject, this.x.g);
      if (j != 180) {
        return j;
      }
      if (paramInt1 >= 1) {
        return j;
      }
      paramInt1 += 1;
    }
  }
  
  public byte[] a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, byte[] paramArrayOfByte1, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, long[] paramArrayOfLong, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3)
  {
    Object localObject1 = new c();
    Object localObject10 = new q();
    Object localObject4 = new i();
    Object localObject5 = new j();
    Object localObject3 = new ab();
    Object localObject2 = new af();
    Object localObject9 = new oicq.wlogin_sdk.b.t();
    Object localObject7 = new av();
    Object localObject8 = new cq();
    paramArrayOfByte3 = new a(283);
    Object localObject6 = new bz();
    localObject1 = ((c)localObject1).a(paramLong1, paramLong2, paramInt1, paramInt2);
    paramArrayOfByte1 = ((q)localObject10).a(paramArrayOfByte1);
    localObject4 = ((i)localObject4).a(paramInt3, paramInt4, paramInt5, paramInt6);
    localObject5 = ((j)localObject5).a(paramArrayOfByte2);
    paramArrayOfLong = ((oicq.wlogin_sdk.b.t)localObject9).a(paramInt7, paramInt8, paramArrayOfLong);
    localObject7 = ((av)localObject7).b(this.x.i);
    localObject8 = ((cq)localObject8).a(0, t.s, 0);
    localObject6 = ((bz)localObject6).a(k.E);
    paramArrayOfByte3.a(new byte[] { 2 }, 1);
    localObject9 = util.get_os_type();
    localObject10 = util.get_os_version();
    paramInt1 = t.B;
    byte[] arrayOfByte1 = t.A;
    byte[] arrayOfByte2 = t.D;
    localObject3 = ((ab)localObject3).a((byte[])localObject9, (byte[])localObject10, paramInt1, arrayOfByte1, new byte[0], arrayOfByte2);
    localObject2 = ((af)localObject2).a(t.R, t.S, t.T, t.W, t.G, t.y, t.N);
    localObject9 = new byte[localObject1.length + paramArrayOfByte1.length + localObject4.length + localObject5.length + localObject3.length + localObject2.length + paramArrayOfLong.length + localObject7.length + localObject8.length + localObject6.length + paramArrayOfByte3.a().length];
    System.arraycopy(localObject1, 0, localObject9, 0, localObject1.length);
    paramInt1 = 0 + localObject1.length;
    System.arraycopy(paramArrayOfByte1, 0, localObject9, paramInt1, paramArrayOfByte1.length);
    paramInt1 += paramArrayOfByte1.length;
    System.arraycopy(localObject4, 0, localObject9, paramInt1, localObject4.length);
    paramInt1 += localObject4.length;
    System.arraycopy(localObject7, 0, localObject9, paramInt1, localObject7.length);
    paramInt1 += localObject7.length;
    System.arraycopy(localObject8, 0, localObject9, paramInt1, localObject8.length);
    paramInt3 = paramInt1 + localObject8.length;
    paramInt4 = 5;
    paramInt2 = paramInt3;
    paramInt1 = paramInt4;
    if (paramArrayOfByte2 != null)
    {
      paramInt2 = paramInt3;
      paramInt1 = paramInt4;
      if (paramArrayOfByte2.length > 0)
      {
        System.arraycopy(localObject5, 0, localObject9, paramInt3, localObject5.length);
        paramInt2 = paramInt3 + localObject5.length;
        paramInt1 = 6;
      }
    }
    System.arraycopy(localObject3, 0, localObject9, paramInt2, localObject3.length);
    paramInt2 += localObject3.length;
    System.arraycopy(localObject2, 0, localObject9, paramInt2, localObject2.length);
    paramInt2 += localObject2.length;
    System.arraycopy(paramArrayOfLong, 0, localObject9, paramInt2, paramArrayOfLong.length);
    paramInt2 += paramArrayOfLong.length;
    System.arraycopy(localObject6, 0, localObject9, paramInt2, localObject6.length);
    paramInt2 += localObject6.length;
    System.arraycopy(paramArrayOfByte3.a(), 0, localObject9, paramInt2, paramArrayOfByte3.a().length);
    paramInt2 = paramArrayOfByte3.a().length;
    return a((byte[])localObject9, this.u, paramInt1 + 3 + 1 + 1);
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\oicq\wlogin_sdk\request\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */