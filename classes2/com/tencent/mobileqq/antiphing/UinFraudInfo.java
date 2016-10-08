package com.tencent.mobileqq.antiphing;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.qphone.base.util.QLog;
import java.util.HashMap;
import java.util.Map;
import ppt;

public class UinFraudInfo
{
  public static final int a = 0;
  private static UinFraudInfo jdField_a_of_type_ComTencentMobileqqAntiphingUinFraudInfo;
  private static final String jdField_a_of_type_JavaLangString = "AntiFraud";
  public static final int b = 1;
  public static final int c = 2;
  private Map jdField_a_of_type_JavaUtilMap;
  private Map b;
  
  private UinFraudInfo()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_JavaUtilMap = new HashMap();
    this.b = new HashMap();
  }
  
  public static UinFraudInfo a()
  {
    if (jdField_a_of_type_ComTencentMobileqqAntiphingUinFraudInfo == null) {
      jdField_a_of_type_ComTencentMobileqqAntiphingUinFraudInfo = new UinFraudInfo();
    }
    return jdField_a_of_type_ComTencentMobileqqAntiphingUinFraudInfo;
  }
  
  public int a(long paramLong)
  {
    long l = System.currentTimeMillis();
    if (this.jdField_a_of_type_JavaUtilMap.containsKey(Long.valueOf(paramLong)))
    {
      ppt localppt = (ppt)this.jdField_a_of_type_JavaUtilMap.get(Long.valueOf(paramLong));
      if (l - localppt.jdField_a_of_type_Long < 3600000L)
      {
        if (QLog.isDevelopLevel()) {
          QLog.d("AntiFraud", 4, "Found from local cache, the fraud flag is true");
        }
        return localppt.jdField_a_of_type_Int;
      }
      if (QLog.isDevelopLevel()) {
        QLog.d("AntiFraud", 4, "Found from local cache, timestamp is out of data");
      }
      this.jdField_a_of_type_JavaUtilMap.remove(Long.valueOf(paramLong));
      return 0;
    }
    if (this.b.containsKey(Long.valueOf(paramLong)))
    {
      if (l - ((Long)this.b.get(Long.valueOf(paramLong))).longValue() < 43200000L)
      {
        if (QLog.isDevelopLevel()) {
          QLog.d("AntiFraud", 4, "Found from local cache, the fraud flag is false");
        }
        return 0;
      }
      if (QLog.isDevelopLevel()) {
        QLog.d("AntiFraud", 4, "Found from local cache, timestamp is out of data");
      }
      this.b.remove(Long.valueOf(paramLong));
      return 0;
    }
    if (QLog.isDevelopLevel()) {
      QLog.d("AntiFraud", 4, "use default value, false");
    }
    return 0;
  }
  
  public void a(long paramLong)
  {
    long l = System.currentTimeMillis();
    if (this.b.size() > 500) {
      this.b.clear();
    }
    this.b.put(Long.valueOf(paramLong), Long.valueOf(l));
    if (this.jdField_a_of_type_JavaUtilMap.containsKey(Long.valueOf(paramLong))) {
      this.jdField_a_of_type_JavaUtilMap.remove(Long.valueOf(paramLong));
    }
  }
  
  public void a(long paramLong, int paramInt)
  {
    long l = System.currentTimeMillis();
    ppt localppt = new ppt(this);
    localppt.jdField_a_of_type_Int = paramInt;
    localppt.jdField_a_of_type_Long = l;
    if (this.jdField_a_of_type_JavaUtilMap.size() > 500) {
      this.jdField_a_of_type_JavaUtilMap.clear();
    }
    this.jdField_a_of_type_JavaUtilMap.put(Long.valueOf(paramLong), localppt);
    if (this.b.containsKey(Long.valueOf(paramLong))) {
      this.b.remove(Long.valueOf(paramLong));
    }
  }
  
  public boolean a(long paramLong)
  {
    long l = System.currentTimeMillis();
    if (this.jdField_a_of_type_JavaUtilMap.containsKey(Long.valueOf(paramLong)))
    {
      if (l - ((ppt)this.jdField_a_of_type_JavaUtilMap.get(Long.valueOf(paramLong))).jdField_a_of_type_Long > 3600000L)
      {
        if (QLog.isDevelopLevel()) {
          QLog.d("AntiFraud", 4, "FraudUin, Found from local cache, timestamp is out of data");
        }
        this.jdField_a_of_type_JavaUtilMap.remove(Long.valueOf(paramLong));
        return true;
      }
      return false;
    }
    if (this.b.containsKey(Long.valueOf(paramLong)))
    {
      if (l - ((Long)this.b.get(Long.valueOf(paramLong))).longValue() > 43200000L)
      {
        if (QLog.isDevelopLevel()) {
          QLog.d("AntiFraud", 4, "NonFraudUin, Found from local cache, timestamp is out of data");
        }
        this.b.remove(Long.valueOf(paramLong));
        return true;
      }
      return false;
    }
    if (QLog.isDevelopLevel()) {
      QLog.d("AntiFraud", 4, "Out of date, use default value, true!");
    }
    return true;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\mobileqq\antiphing\UinFraudInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */