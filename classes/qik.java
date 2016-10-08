import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mobileqq.app.AppConstants;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.SQLiteDatabase;
import com.tencent.mobileqq.app.asyncdb.cache.RecentUserCache;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.qphone.base.util.QLog;
import java.util.concurrent.ConcurrentHashMap;

public class qik
  implements Runnable
{
  public qik(RecentUserCache paramRecentUserCache, SharedPreferences paramSharedPreferences)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void run()
  {
    if (QLog.isColorLevel()) {
      QLog.d("Q.db.Cache.RecentUserCache", 2, "checkNewFriendUpgradeV2 | start");
    }
    try
    {
      SQLiteDatabase localSQLiteDatabase = RecentUserCache.c(this.jdField_a_of_type_ComTencentMobileqqAppAsyncdbCacheRecentUserCache).a();
      String str = RecentUserCache.a(this.jdField_a_of_type_ComTencentMobileqqAppAsyncdbCacheRecentUserCache, AppConstants.an, 4000);
      if (RecentUserCache.e(this.jdField_a_of_type_ComTencentMobileqqAppAsyncdbCacheRecentUserCache).containsKey(str)) {
        RecentUserCache.f(this.jdField_a_of_type_ComTencentMobileqqAppAsyncdbCacheRecentUserCache).remove(str);
      }
      int i = localSQLiteDatabase.a("recent", "uin=?", new String[] { AppConstants.an });
      if (QLog.isColorLevel()) {
        QLog.d("Q.db.Cache.RecentUserCache", 2, "checkNewFriendUpgradeV2 | RecentUser delCount = " + i);
      }
      return;
    }
    catch (Exception localException)
    {
      do
      {
        localException.printStackTrace();
      } while (!QLog.isColorLevel());
      QLog.d("Q.db.Cache.RecentUserCache", 2, "checkNewFriendUpgradeV2 | delete recommend error~");
      return;
    }
    finally
    {
      this.jdField_a_of_type_AndroidContentSharedPreferences.edit().putBoolean("check_newfriend_when_upgrade_V2", false).commit();
    }
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\qik.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */