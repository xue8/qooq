package com.tencent.mobileqq.persistence;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mobileqq.data.ResourcePluginInfo;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public class ResourcePluginInfoDao
  extends OGAbstractDao
{
  private OGEntityInfo a;
  
  public ResourcePluginInfoDao()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.a = 22;
  }
  
  public Entity a(Entity paramEntity, Cursor paramCursor, boolean paramBoolean, NoColumnErrorHandler paramNoColumnErrorHandler)
  {
    paramEntity = (ResourcePluginInfo)paramEntity;
    if (paramNoColumnErrorHandler == null)
    {
      paramEntity.strPkgName = paramCursor.getString(paramCursor.getColumnIndex("strPkgName"));
      paramEntity.strResName = paramCursor.getString(paramCursor.getColumnIndex("strResName"));
      paramEntity.strResURL = paramCursor.getString(paramCursor.getColumnIndex("strResURL"));
      paramEntity.uiCurVer = paramCursor.getLong(paramCursor.getColumnIndex("uiCurVer"));
      paramEntity.sLanType = paramCursor.getShort(paramCursor.getColumnIndex("sLanType"));
      paramEntity.strGotoUrl = paramCursor.getString(paramCursor.getColumnIndex("strGotoUrl"));
      paramEntity.sResSubType = paramCursor.getShort(paramCursor.getColumnIndex("sResSubType"));
      paramEntity.sPriority = paramCursor.getShort(paramCursor.getColumnIndex("sPriority"));
      paramEntity.strResDesc = paramCursor.getString(paramCursor.getColumnIndex("strResDesc"));
      paramEntity.uiResId = paramCursor.getLong(paramCursor.getColumnIndex("uiResId"));
      paramEntity.cDefaultState = ((byte)paramCursor.getShort(paramCursor.getColumnIndex("cDefaultState")));
      paramEntity.cCanChangeState = ((byte)paramCursor.getShort(paramCursor.getColumnIndex("cCanChangeState")));
      paramEntity.isNew = ((byte)paramCursor.getShort(paramCursor.getColumnIndex("isNew")));
      paramEntity.cDataType = ((byte)paramCursor.getShort(paramCursor.getColumnIndex("cDataType")));
      paramEntity.cLocalState = ((byte)paramCursor.getShort(paramCursor.getColumnIndex("cLocalState")));
      paramEntity.iPluginType = paramCursor.getInt(paramCursor.getColumnIndex("iPluginType"));
      paramEntity.timeStamp = paramCursor.getLong(paramCursor.getColumnIndex("timeStamp"));
      paramEntity.strNewPluginDesc = paramCursor.getString(paramCursor.getColumnIndex("strNewPluginDesc"));
      paramEntity.strNewPluginURL = paramCursor.getString(paramCursor.getColumnIndex("strNewPluginURL"));
      paramEntity.lebaSearchResultType = paramCursor.getInt(paramCursor.getColumnIndex("lebaSearchResultType"));
      paramEntity.pluginSetTips = paramCursor.getString(paramCursor.getColumnIndex("pluginSetTips"));
      paramEntity.pluginBg = paramCursor.getString(paramCursor.getColumnIndex("pluginBg"));
      return paramEntity;
    }
    int i = paramCursor.getColumnIndex("strPkgName");
    if (i == -1)
    {
      paramNoColumnErrorHandler.a(new NoColumnError("strPkgName", String.class));
      i = paramCursor.getColumnIndex("strResName");
      if (i != -1) {
        break label1191;
      }
      paramNoColumnErrorHandler.a(new NoColumnError("strResName", String.class));
      label481:
      i = paramCursor.getColumnIndex("strResURL");
      if (i != -1) {
        break label1206;
      }
      paramNoColumnErrorHandler.a(new NoColumnError("strResURL", String.class));
      label515:
      i = paramCursor.getColumnIndex("uiCurVer");
      if (i != -1) {
        break label1221;
      }
      paramNoColumnErrorHandler.a(new NoColumnError("uiCurVer", Long.TYPE));
      label550:
      i = paramCursor.getColumnIndex("sLanType");
      if (i != -1) {
        break label1236;
      }
      paramNoColumnErrorHandler.a(new NoColumnError("sLanType", Short.TYPE));
      label585:
      i = paramCursor.getColumnIndex("strGotoUrl");
      if (i != -1) {
        break label1251;
      }
      paramNoColumnErrorHandler.a(new NoColumnError("strGotoUrl", String.class));
      label619:
      i = paramCursor.getColumnIndex("sResSubType");
      if (i != -1) {
        break label1266;
      }
      paramNoColumnErrorHandler.a(new NoColumnError("sResSubType", Short.TYPE));
      label654:
      i = paramCursor.getColumnIndex("sPriority");
      if (i != -1) {
        break label1281;
      }
      paramNoColumnErrorHandler.a(new NoColumnError("sPriority", Short.TYPE));
      label689:
      i = paramCursor.getColumnIndex("strResDesc");
      if (i != -1) {
        break label1296;
      }
      paramNoColumnErrorHandler.a(new NoColumnError("strResDesc", String.class));
      label723:
      i = paramCursor.getColumnIndex("uiResId");
      if (i != -1) {
        break label1311;
      }
      paramNoColumnErrorHandler.a(new NoColumnError("uiResId", Long.TYPE));
      label758:
      i = paramCursor.getColumnIndex("cDefaultState");
      if (i != -1) {
        break label1326;
      }
      paramNoColumnErrorHandler.a(new NoColumnError("cDefaultState", Byte.TYPE));
      label793:
      i = paramCursor.getColumnIndex("cCanChangeState");
      if (i != -1) {
        break label1342;
      }
      paramNoColumnErrorHandler.a(new NoColumnError("cCanChangeState", Byte.TYPE));
      label828:
      i = paramCursor.getColumnIndex("isNew");
      if (i != -1) {
        break label1358;
      }
      paramNoColumnErrorHandler.a(new NoColumnError("isNew", Byte.TYPE));
      label863:
      i = paramCursor.getColumnIndex("cDataType");
      if (i != -1) {
        break label1374;
      }
      paramNoColumnErrorHandler.a(new NoColumnError("cDataType", Byte.TYPE));
      label898:
      i = paramCursor.getColumnIndex("cLocalState");
      if (i != -1) {
        break label1390;
      }
      paramNoColumnErrorHandler.a(new NoColumnError("cLocalState", Byte.TYPE));
      label933:
      i = paramCursor.getColumnIndex("iPluginType");
      if (i != -1) {
        break label1406;
      }
      paramNoColumnErrorHandler.a(new NoColumnError("iPluginType", Integer.TYPE));
      label968:
      i = paramCursor.getColumnIndex("timeStamp");
      if (i != -1) {
        break label1421;
      }
      paramNoColumnErrorHandler.a(new NoColumnError("timeStamp", Long.TYPE));
      label1003:
      i = paramCursor.getColumnIndex("strNewPluginDesc");
      if (i != -1) {
        break label1436;
      }
      paramNoColumnErrorHandler.a(new NoColumnError("strNewPluginDesc", String.class));
      label1037:
      i = paramCursor.getColumnIndex("strNewPluginURL");
      if (i != -1) {
        break label1451;
      }
      paramNoColumnErrorHandler.a(new NoColumnError("strNewPluginURL", String.class));
      label1071:
      i = paramCursor.getColumnIndex("lebaSearchResultType");
      if (i != -1) {
        break label1466;
      }
      paramNoColumnErrorHandler.a(new NoColumnError("lebaSearchResultType", Integer.TYPE));
      label1106:
      i = paramCursor.getColumnIndex("pluginSetTips");
      if (i != -1) {
        break label1481;
      }
      paramNoColumnErrorHandler.a(new NoColumnError("pluginSetTips", String.class));
    }
    for (;;)
    {
      i = paramCursor.getColumnIndex("pluginBg");
      if (i != -1) {
        break label1496;
      }
      paramNoColumnErrorHandler.a(new NoColumnError("pluginBg", String.class));
      return paramEntity;
      paramEntity.strPkgName = paramCursor.getString(i);
      break;
      label1191:
      paramEntity.strResName = paramCursor.getString(i);
      break label481;
      label1206:
      paramEntity.strResURL = paramCursor.getString(i);
      break label515;
      label1221:
      paramEntity.uiCurVer = paramCursor.getLong(i);
      break label550;
      label1236:
      paramEntity.sLanType = paramCursor.getShort(i);
      break label585;
      label1251:
      paramEntity.strGotoUrl = paramCursor.getString(i);
      break label619;
      label1266:
      paramEntity.sResSubType = paramCursor.getShort(i);
      break label654;
      label1281:
      paramEntity.sPriority = paramCursor.getShort(i);
      break label689;
      label1296:
      paramEntity.strResDesc = paramCursor.getString(i);
      break label723;
      label1311:
      paramEntity.uiResId = paramCursor.getLong(i);
      break label758;
      label1326:
      paramEntity.cDefaultState = ((byte)paramCursor.getShort(i));
      break label793;
      label1342:
      paramEntity.cCanChangeState = ((byte)paramCursor.getShort(i));
      break label828;
      label1358:
      paramEntity.isNew = ((byte)paramCursor.getShort(i));
      break label863;
      label1374:
      paramEntity.cDataType = ((byte)paramCursor.getShort(i));
      break label898;
      label1390:
      paramEntity.cLocalState = ((byte)paramCursor.getShort(i));
      break label933;
      label1406:
      paramEntity.iPluginType = paramCursor.getInt(i);
      break label968;
      label1421:
      paramEntity.timeStamp = paramCursor.getLong(i);
      break label1003;
      label1436:
      paramEntity.strNewPluginDesc = paramCursor.getString(i);
      break label1037;
      label1451:
      paramEntity.strNewPluginURL = paramCursor.getString(i);
      break label1071;
      label1466:
      paramEntity.lebaSearchResultType = paramCursor.getInt(i);
      break label1106;
      label1481:
      paramEntity.pluginSetTips = paramCursor.getString(i);
    }
    label1496:
    paramEntity.pluginBg = paramCursor.getString(i);
    return paramEntity;
  }
  
  public String a(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder("CREATE TABLE IF NOT EXISTS ");
    localStringBuilder.append(paramString);
    localStringBuilder.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT ,strPkgName TEXT UNIQUE ,strResName TEXT ,strResURL TEXT ,uiCurVer INTEGER ,sLanType INTEGER ,strGotoUrl TEXT ,sResSubType INTEGER ,sPriority INTEGER ,strResDesc TEXT ,uiResId INTEGER ,cDefaultState INTEGER ,cCanChangeState INTEGER ,isNew INTEGER ,cDataType INTEGER ,cLocalState INTEGER ,iPluginType INTEGER ,timeStamp INTEGER ,strNewPluginDesc TEXT ,strNewPluginURL TEXT ,lebaSearchResultType INTEGER ,pluginSetTips TEXT ,pluginBg TEXT)");
    return localStringBuilder.toString();
  }
  
  public void a(Entity paramEntity, ContentValues paramContentValues)
  {
    paramEntity = (ResourcePluginInfo)paramEntity;
    paramContentValues.put("strPkgName", paramEntity.strPkgName);
    paramContentValues.put("strResName", paramEntity.strResName);
    paramContentValues.put("strResURL", paramEntity.strResURL);
    paramContentValues.put("uiCurVer", Long.valueOf(paramEntity.uiCurVer));
    paramContentValues.put("sLanType", Short.valueOf(paramEntity.sLanType));
    paramContentValues.put("strGotoUrl", paramEntity.strGotoUrl);
    paramContentValues.put("sResSubType", Short.valueOf(paramEntity.sResSubType));
    paramContentValues.put("sPriority", Short.valueOf(paramEntity.sPriority));
    paramContentValues.put("strResDesc", paramEntity.strResDesc);
    paramContentValues.put("uiResId", Long.valueOf(paramEntity.uiResId));
    paramContentValues.put("cDefaultState", Byte.valueOf(paramEntity.cDefaultState));
    paramContentValues.put("cCanChangeState", Byte.valueOf(paramEntity.cCanChangeState));
    paramContentValues.put("isNew", Byte.valueOf(paramEntity.isNew));
    paramContentValues.put("cDataType", Byte.valueOf(paramEntity.cDataType));
    paramContentValues.put("cLocalState", Byte.valueOf(paramEntity.cLocalState));
    paramContentValues.put("iPluginType", Integer.valueOf(paramEntity.iPluginType));
    paramContentValues.put("timeStamp", Long.valueOf(paramEntity.timeStamp));
    paramContentValues.put("strNewPluginDesc", paramEntity.strNewPluginDesc);
    paramContentValues.put("strNewPluginURL", paramEntity.strNewPluginURL);
    paramContentValues.put("lebaSearchResultType", Integer.valueOf(paramEntity.lebaSearchResultType));
    paramContentValues.put("pluginSetTips", paramEntity.pluginSetTips);
    paramContentValues.put("pluginBg", paramEntity.pluginBg);
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\com\tencent\mobileqq\persistence\ResourcePluginInfoDao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */