import com.tencent.biz.troop.file.TroopFileProtocol.GetOneFileInfoObserver;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.troop.data.TroopFileInfo;
import com.tencent.mobileqq.troop.utils.TroopFileManager;
import com.tencent.mobileqq.troop.utils.TroopFileTransferManager;
import tencent.im.cs.group_file_common.group_file_common.FileInfo;

public class vqi
  extends TroopFileProtocol.GetOneFileInfoObserver
{
  public vqi(TroopFileTransferManager paramTroopFileTransferManager)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  protected void a(boolean paramBoolean, int paramInt, group_file_common.FileInfo paramFileInfo)
  {
    if ((paramBoolean) && (paramFileInfo != null))
    {
      String str = paramFileInfo.str_file_id.get();
      Object localObject = str;
      if (!str.startsWith("/")) {
        localObject = "/" + str;
      }
      localObject = this.a.a().a((String)localObject);
      if (localObject != null)
      {
        ((TroopFileInfo)localObject).a = paramFileInfo.uint32_bus_id.get();
        ((TroopFileInfo)localObject).c = paramFileInfo.uint32_dead_time.get();
      }
      this.a.a().d((TroopFileInfo)localObject);
    }
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\vqi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */