package com.tencent.biz.qqstory.network.pb;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class qqstory_struct$Address
  extends MessageMicro
{
  public static final int BUILDING_FIELD_NUMBER = 5;
  public static final int CITY_FIELD_NUMBER = 3;
  public static final int COORDINATE_FIELD_NUMBER = 8;
  public static final int COUNTRY_FIELD_NUMBER = 4;
  public static final int LATITUDE_FIELD_NUMBER = 7;
  public static final int LONGITUDE_FIELD_NUMBER = 6;
  public static final int PROVINCE_FIELD_NUMBER = 2;
  public static final int STREET_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField building = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField city = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBUInt32Field coordinate = PBField.initUInt32(0);
  public final PBBytesField country = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBUInt32Field latitude = PBField.initUInt32(0);
  public final PBUInt32Field longitude = PBField.initUInt32(0);
  public final PBBytesField province = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField street = PBField.initBytes(ByteStringMicro.EMPTY);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    ByteStringMicro localByteStringMicro1 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro2 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro3 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro4 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro5 = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18, 26, 34, 42, 48, 56, 64 }, new String[] { "street", "province", "city", "country", "building", "longitude", "latitude", "coordinate" }, new Object[] { localByteStringMicro1, localByteStringMicro2, localByteStringMicro3, localByteStringMicro4, localByteStringMicro5, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) }, Address.class);
  }
}


/* Location:              E:\apk\QQ_91\classes6-dex2jar.jar!\com\tencent\biz\qqstory\network\pb\qqstory_struct$Address.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */