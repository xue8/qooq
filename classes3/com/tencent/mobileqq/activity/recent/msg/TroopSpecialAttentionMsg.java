package com.tencent.mobileqq.activity.recent.msg;

import android.content.Context;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.troop.data.MessageNavInfo;
import com.tencent.qphone.base.util.QLog;
import org.json.JSONException;
import org.json.JSONObject;

public class TroopSpecialAttentionMsg
  extends AbstructRecentUserMsg
  implements Cloneable
{
  public static final String d = "TroopSpecialAttentionMsg";
  
  public TroopSpecialAttentionMsg(Context paramContext)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_JavaLangString = paramContext.getString(2131367404);
    this.jdField_b_of_type_JavaLangString = this.jdField_a_of_type_JavaLangString;
  }
  
  public Object a()
  {
    try
    {
      super.clone();
      Object localObject = super.clone();
      return localObject;
    }
    catch (Exception localException) {}
    return null;
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    QLog.d("TroopSpecialAttentionMsg", 2, "deSerialize");
    paramArrayOfByte = new String(paramArrayOfByte);
    try
    {
      paramArrayOfByte = new JSONObject(paramArrayOfByte);
      this.jdField_a_of_type_JavaLangString = paramArrayOfByte.getString("content");
      this.jdField_a_of_type_Int = paramArrayOfByte.getInt("time");
      this.jdField_b_of_type_Int = paramArrayOfByte.getInt("color");
      this.c = paramArrayOfByte.getString("messageNavInfo");
      if ((this.c != null) && (this.c.length() != 0) && (this.jdField_a_of_type_ComTencentMobileqqTroopDataMessageNavInfo == null))
      {
        this.jdField_a_of_type_ComTencentMobileqqTroopDataMessageNavInfo = new MessageNavInfo();
        this.jdField_a_of_type_ComTencentMobileqqTroopDataMessageNavInfo.a(this.c);
      }
      return;
    }
    catch (JSONException paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
    }
  }
  
  public byte[] a()
  {
    return b();
  }
  
  public byte[] b()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("content", this.jdField_a_of_type_JavaLangString);
      localJSONObject.put("time", this.jdField_a_of_type_Int);
      localJSONObject.put("color", this.jdField_b_of_type_Int);
      if (this.jdField_a_of_type_ComTencentMobileqqTroopDataMessageNavInfo != null) {
        this.c = this.jdField_a_of_type_ComTencentMobileqqTroopDataMessageNavInfo.a();
      }
      localJSONObject.put("messageNavInfo", this.c);
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        localJSONException.printStackTrace();
      }
    }
    return localJSONObject.toString().getBytes();
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\tencent\mobileqq\activity\recent\msg\TroopSpecialAttentionMsg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */