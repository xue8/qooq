import com.dataline.activities.LiteActivity;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.filemanager.app.FMObserver;
import com.tencent.mobileqq.filemanager.core.FileManagerDataCenter;
import com.tencent.mobileqq.filemanager.data.FileManagerEntity;
import com.tencent.mobileqq.filemanager.util.FileManagerUtil;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.qphone.base.util.QLog;

public class aw
  extends FMObserver
{
  public aw(LiteActivity paramLiteActivity)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  protected void a(boolean paramBoolean, long paramLong1, long paramLong2, String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    if (QLog.isColorLevel()) {
      QLog.d(LiteActivity.a, 2, "OnFileTransferEnd : isSuccess[" + paramBoolean + "], uniseq[" + paramLong1 + "], nSessionId[" + paramLong2 + paramString1 + "], peerType[" + paramInt1 + "]");
    }
    paramString1 = this.a.app.a().a(paramLong2);
    if (paramString1 == null) {
      if (QLog.isColorLevel()) {
        QLog.e(LiteActivity.a, 2, "OnFileTransferEnd faild, get entity is faild, sessionId[" + String.valueOf(paramLong2) + "]");
      }
    }
    do
    {
      return;
      if (paramBoolean)
      {
        FileManagerUtil.a(paramLong2);
        return;
      }
    } while ((paramString1.nOpType != 4) && (paramString1.nOpType != 6));
    FileManagerUtil.a(paramLong2, paramInt2, paramString2);
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */