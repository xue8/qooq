package com.tencent.mobileqq.transfile;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import java.util.HashMap;

public class NetResp
{
  public static final int a = 0;
  public static final int b = 1;
  public static final String b = "param_rspHeader";
  public static final int c = 2;
  public static final String c = "param_reqHeader";
  public static final int d = 3;
  public static final String d = "firstserverip";
  public static final String e = "serverip";
  public static final String f = "param_url";
  public static final String g = "netresp_param_reason";
  public static final String h = "qzone_desc";
  public static final String i = "qzone_detail_download_info";
  public long a;
  public NetReq a;
  public String a;
  public HashMap a;
  public byte[] a;
  public long b;
  public long c;
  public long d;
  public int e;
  long e;
  public int f;
  long f;
  public int g;
  public long g;
  public int h;
  public long h;
  int i;
  public long i;
  public int j;
  public long j;
  
  public NetResp(NetReq paramNetReq)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_e_of_type_Int = 2;
    this.jdField_e_of_type_Long = 0L;
    this.jdField_a_of_type_JavaUtilHashMap = new HashMap();
    this.jdField_a_of_type_ComTencentMobileqqTransfileNetReq = paramNetReq;
    this.jdField_f_of_type_Long = System.currentTimeMillis();
  }
  
  public void a()
  {
    this.jdField_e_of_type_Int = 2;
    this.jdField_f_of_type_Int = 0;
    this.jdField_a_of_type_JavaLangString = "";
    this.g = 0;
    this.jdField_a_of_type_Long = 0L;
    this.b = 0L;
    this.c = 0L;
    this.d = 0L;
    this.h = 0;
    this.jdField_a_of_type_ArrayOfByte = null;
    this.jdField_a_of_type_JavaUtilHashMap.clear();
  }
  
  public void a(int paramInt1, int paramInt2, String paramString, HashMap paramHashMap)
  {
    this.jdField_e_of_type_Int = paramInt1;
    this.jdField_f_of_type_Int = paramInt2;
    this.jdField_a_of_type_JavaLangString = paramString;
    if (paramHashMap != null) {
      this.jdField_a_of_type_JavaUtilHashMap.putAll(paramHashMap);
    }
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\com\tencent\mobileqq\transfile\NetResp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */