package com.tencent.mobileqq.search.ftsentity;

import android.content.Context;
import android.os.Bundle;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.data.fts.FTSMessage;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.persistence.fts.FTSEntity;
import com.tencent.mobileqq.search.ftsmsg.FTSMessageSearchEngine;
import com.tencent.mobileqq.search.ftsmsg.FTSMessageSearchResultDetailModel;
import com.tencent.mobileqq.search.searchengine.SearchRequest;
import java.util.ArrayList;

public class FTSEntitySearchUtils
{
  public static final int a = 0;
  public static final String a = "extra_key_fts_type";
  public static final int b = 1;
  
  public FTSEntitySearchUtils()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public static FTSEntitySearchEngine a(QQAppInterface paramQQAppInterface, int paramInt)
  {
    return new FTSMessageSearchEngine(paramQQAppInterface);
  }
  
  public static FTSEntitySearchResultDetailModel a(QQAppInterface paramQQAppInterface, int paramInt, String paramString, ArrayList paramArrayList, FTSEntity paramFTSEntity)
  {
    return new FTSMessageSearchResultDetailModel(paramQQAppInterface, paramString, paramArrayList, paramFTSEntity);
  }
  
  public static SearchRequest a(int paramInt, String paramString, FTSEntity paramFTSEntity)
  {
    paramString = new SearchRequest(paramString);
    paramFTSEntity = (FTSMessage)paramFTSEntity;
    paramString.a = new Bundle();
    paramString.a.putLong("uin", paramFTSEntity.uin);
    paramString.a.putInt("uinType", paramFTSEntity.istroop);
    return paramString;
  }
  
  public static String a(Context paramContext, int paramInt)
  {
    return paramContext.getString(2131372277);
  }
  
  public static String a(Context paramContext, int paramInt1, String paramString, int paramInt2)
  {
    String str = paramString;
    if (paramString.length() > 13) {
      str = paramString.substring(0, 10) + "…";
    }
    return paramContext.getString(2131372276, new Object[] { Integer.valueOf(paramInt1), str });
  }
  
  public static String b(Context paramContext, int paramInt)
  {
    return "搜索聊天记录";
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\com\tencent\mobileqq\search\ftsentity\FTSEntitySearchUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */