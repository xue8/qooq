import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.message.QQMessageFacade;
import com.tencent.mobileqq.data.MessageRecord;
import com.tencent.mobileqq.filemanager.core.FileManagerDataCenter;
import com.tencent.mobileqq.filemanager.util.FileManagerReporter;
import com.tencent.mobileqq.filemanager.util.FileManagerUtil;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.qphone.base.util.BaseApplication;
import com.tencent.qphone.base.util.QLog;
import java.util.List;
import mqq.app.MobileQQ;

public final class sjb
  implements Runnable
{
  public sjb(String paramString1, QQAppInterface paramQQAppInterface, int paramInt, String paramString2)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void run()
  {
    if (TextUtils.isEmpty(this.jdField_a_of_type_JavaLangString)) {}
    String str1;
    long l1;
    long l2;
    int i;
    String str2;
    int j;
    label256:
    MessageRecord localMessageRecord;
    do
    {
      List localList;
      for (;;)
      {
        return;
        try
        {
          Thread.sleep(500L);
          Object localObject = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() + "BatProcessTips";
          localObject = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getApplication().getSharedPreferences((String)localObject, 0);
          str1 = this.jdField_a_of_type_JavaLangString + "_" + this.jdField_a_of_type_Int + "_LastShowTime";
          l1 = ((SharedPreferences)localObject).getLong(str1, 0L);
          l2 = System.currentTimeMillis();
          if (l2 - l1 < 86400000L)
          {
            if (!QLog.isColorLevel()) {
              continue;
            }
            QLog.i("updateBatProcessTips<FileAssistant>", 4, "lastShowTime[" + l1 + "],today has notify user!return!");
          }
        }
        catch (InterruptedException localInterruptedException)
        {
          for (;;)
          {
            localInterruptedException.printStackTrace();
          }
          localList = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().b(this.jdField_a_of_type_JavaLangString, this.jdField_a_of_type_Int);
          if ((localList == null) || (localList.size() == 0))
          {
            if (QLog.isColorLevel()) {
              QLog.i("updateBatProcessTips<FileAssistant>", 4, "lastShowTime[" + l1 + "],msgRecd null,return");
            }
          }
          else
          {
            i = 1;
            str2 = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a();
            j = localList.size() - 1;
          }
        }
      }
      if (j < 0) {
        break;
      }
      localMessageRecord = (MessageRecord)localList.get(j);
    } while ((localMessageRecord.msgtype != 63531) || (localMessageRecord.isSend()) || (localMessageRecord.senderuin.equalsIgnoreCase(str2) == true));
    if (QLog.isDevelopLevel()) {
      QLog.d("FileManagerUtil<FileAssistant>", 4, "updateBatProcessTips count[" + i + "]");
    }
    if (i >= 4)
    {
      this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().a(this.jdField_a_of_type_JavaLangString, this.b, this.jdField_a_of_type_Int, 62523, BaseApplicationImpl.getContext().getString(2131362943));
      localInterruptedException.edit().putLong(str1, l2);
      if (QLog.isColorLevel()) {
        QLog.i("updateBatProcessTips<FileAssistant>", 4, "lastShowTime[" + l1 + "],[" + FileManagerUtil.e(this.jdField_a_of_type_JavaLangString) + "]add new grayTips!");
      }
      FileManagerReporter.a("0X800506B");
      return;
    }
    long l3 = localMessageRecord.time * 1000L;
    if (QLog.isColorLevel()) {
      QLog.i("updateBatProcessTips<FileAssistant>", 4, "lastShowTime[" + l1 + "],time[" + l3 + "]");
    }
    if (l3 > l1) {
      i += 1;
    }
    for (;;)
    {
      j -= 1;
      break label256;
      break;
    }
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\sjb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */