package com.tencent.mobileqq.nearby;

import android.database.Cursor;
import com.tencent.mobileqq.app.SQLiteOpenHelper;
import com.tencent.mobileqq.data.QQEntityManagerFactory;
import com.tencent.mobileqq.data.QQEntityManagerFactory.SQLiteOpenHelperImpl;
import com.tencent.mobileqq.freshnews.FreshNewsInfo;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.persistence.EntityManager;
import com.tencent.mobileqq.persistence.TableBuilder;
import com.tencent.mobileqq.persistence.defaultValue;
import com.tencent.mobileqq.persistence.defaultzero;
import com.tencent.mobileqq.utils.SecurityUtile;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class NearbyEntityManagerFactory
  extends QQEntityManagerFactory
{
  public static final int a = 1;
  public static final String a = "nearby_verify_entity";
  public static HashMap a;
  public static final String b = "nearby_";
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    a = new HashMap();
    a.put(FreshNewsInfo.class.getSimpleName(), FreshNewsInfo.class);
  }
  
  public NearbyEntityManagerFactory(String paramString)
  {
    super(paramString);
  }
  
  private void a(android.database.sqlite.SQLiteDatabase paramSQLiteDatabase)
  {
    Object localObject1 = paramSQLiteDatabase.rawQuery("select distinct tbl_name from Sqlite_master", null);
    ArrayList localArrayList = new ArrayList();
    String str1;
    Cursor localCursor;
    Object localObject3;
    Object localObject4;
    if (localObject1 != null) {
      if (((Cursor)localObject1).moveToNext())
      {
        str1 = SecurityUtile.a(((Cursor)localObject1).getString(0));
        localCursor = paramSQLiteDatabase.rawQuery("select sql from sqlite_master where type=? and name=?", new String[] { "table", str1 });
        localObject3 = (Class)a.get(str1.trim());
        if ((localCursor != null) && (localObject3 != null))
        {
          localObject4 = TableBuilder.a((Class)localObject3);
          if (localCursor.moveToFirst())
          {
            localObject3 = SecurityUtile.a(localCursor.getString(0)).split(",");
            localObject4 = ((List)localObject4).iterator();
          }
        }
      }
    }
    label133:
    label158:
    label393:
    label397:
    for (;;)
    {
      Field localField;
      if (((Iterator)localObject4).hasNext())
      {
        localField = (Field)((Iterator)localObject4).next();
        i = 1;
        if (i >= localObject3.length) {
          break label393;
        }
        String str2 = localObject3[i].trim().split(" ")[0];
        if (!localField.getName().equals(str2)) {}
      }
      for (int i = 1;; i = 0)
      {
        if (i != 0) {
          break label397;
        }
        boolean bool;
        if (localField.isAnnotationPresent(defaultzero.class))
        {
          i = 0;
          bool = true;
        }
        for (;;)
        {
          localArrayList.add(TableBuilder.a(str1, localField.getName(), (String)TableBuilder.a.get(localField.getType()), bool, i));
          break label133;
          i += 1;
          break label158;
          if (localField.isAnnotationPresent(defaultValue.class))
          {
            i = ((defaultValue)localField.getAnnotation(defaultValue.class)).a();
            bool = true;
            continue;
            if (localCursor == null) {
              break;
            }
            localCursor.close();
            break;
            ((Cursor)localObject1).close();
            com.tencent.mobileqq.app.SQLiteDatabase.g();
            paramSQLiteDatabase.beginTransaction();
            try
            {
              localObject1 = localArrayList.iterator();
              while (((Iterator)localObject1).hasNext()) {
                paramSQLiteDatabase.execSQL((String)((Iterator)localObject1).next());
              }
              paramSQLiteDatabase.setTransactionSuccessful();
            }
            finally
            {
              paramSQLiteDatabase.endTransaction();
              com.tencent.mobileqq.app.SQLiteDatabase.h();
            }
            paramSQLiteDatabase.endTransaction();
            com.tencent.mobileqq.app.SQLiteDatabase.h();
            return;
          }
          i = 0;
          bool = false;
        }
      }
    }
  }
  
  public SQLiteOpenHelper build(String paramString)
  {
    if (this.dbHelper == null)
    {
      this.mInnerDbHelper = new QQEntityManagerFactory.SQLiteOpenHelperImpl(this, "nearby_" + paramString + ".db", null, 1);
      this.dbHelper = new SQLiteOpenHelper(this.mInnerDbHelper);
      this.name = ("nearby_" + paramString);
    }
    return this.dbHelper;
  }
  
  protected void createDatabase(android.database.sqlite.SQLiteDatabase paramSQLiteDatabase) {}
  
  protected void upgradeDatabase(android.database.sqlite.SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    a(paramSQLiteDatabase);
  }
  
  public boolean verifyAuthentication()
  {
    if (this.name.matches("^nearby_[0-9]*$"))
    {
      EntityManager localEntityManager = createEntityManager();
      NearbyEntityManagerFactory.VerifyEntity localVerifyEntity = (NearbyEntityManagerFactory.VerifyEntity)localEntityManager.a(NearbyEntityManagerFactory.VerifyEntity.class, "flags=?", new String[] { "nearby_verify_entity" });
      if (localVerifyEntity == null)
      {
        localVerifyEntity = new NearbyEntityManagerFactory.VerifyEntity();
        localVerifyEntity.name = this.name;
        localVerifyEntity.flags = "nearby_verify_entity";
        localEntityManager.b(localVerifyEntity);
        return true;
      }
      if ((!localVerifyEntity.flags.equals("nearby_verify_entity")) || (!localVerifyEntity.name.equals(this.name)))
      {
        this.mInnerDbHelper.dropAllTable();
        localVerifyEntity = new NearbyEntityManagerFactory.VerifyEntity();
        localVerifyEntity.name = this.name;
        localEntityManager.b(localVerifyEntity);
        return false;
      }
    }
    return true;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\com\tencent\mobileqq\nearby\NearbyEntityManagerFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */