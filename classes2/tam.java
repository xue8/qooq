import com.tencent.mobileqq.activity.aio.item.MarketFaceItemBuilder.Holder;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.data.Emoticon;
import com.tencent.mobileqq.data.EmoticonPackage;
import com.tencent.mobileqq.emoticonview.EmoticonUtils;
import com.tencent.mobileqq.emoticonview.PicEmoticonInfo;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.magicface.drawable.PngFrameManager;
import com.tencent.mobileqq.magicface.drawable.PngFrameManager.RandomDrawableParam;
import com.tencent.mobileqq.model.EmoticonManager;
import com.tencent.mobileqq.vip.DownloadTask;
import com.tencent.mobileqq.vip.DownloaderInterface;
import com.tencent.qphone.base.util.QLog;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class tam
  implements Runnable
{
  public tam(PngFrameManager paramPngFrameManager, PngFrameManager.RandomDrawableParam paramRandomDrawableParam)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void run()
  {
    if (QLog.isColorLevel()) {
      QLog.d(PngFrameManager.a(), 2, "func showPngFrame, zip NOT exist, download from Server.");
    }
    Object localObject3 = (EmoticonManager)PngFrameManager.a(this.jdField_a_of_type_ComTencentMobileqqMagicfaceDrawablePngFrameManager).getManager(13);
    Object localObject2 = ((EmoticonManager)localObject3).a(this.jdField_a_of_type_ComTencentMobileqqMagicfaceDrawablePngFrameManager$RandomDrawableParam.jdField_a_of_type_JavaLangString);
    Object localObject1 = localObject2;
    if (localObject2 == null)
    {
      localObject1 = new EmoticonPackage();
      ((EmoticonPackage)localObject1).epId = this.jdField_a_of_type_ComTencentMobileqqMagicfaceDrawablePngFrameManager$RandomDrawableParam.jdField_a_of_type_JavaLangString;
    }
    ((EmoticonPackage)localObject1).rscType = 1;
    ((EmoticonManager)localObject3).a((EmoticonPackage)localObject1);
    String str = this.jdField_a_of_type_ComTencentMobileqqMagicfaceDrawablePngFrameManager$RandomDrawableParam.jdField_a_of_type_ComTencentMobileqqActivityAioItemMarketFaceItemBuilder$Holder.a.a.eId;
    localObject2 = EmoticonUtils.e.replace("[eIdSub]", str.substring(0, 2)).replace("[eId]", str);
    localObject1 = EmoticonUtils.o.replace("[epId]", this.jdField_a_of_type_ComTencentMobileqqMagicfaceDrawablePngFrameManager$RandomDrawableParam.jdField_a_of_type_JavaLangString).replace("[eId]", str);
    localObject3 = EmoticonUtils.h.replace("[eIdSub]", str.substring(0, 2)).replace("[eId]", str).replace("[width]", "200").replace("[height]", "200");
    str = EmoticonUtils.m.replace("[epId]", this.jdField_a_of_type_ComTencentMobileqqMagicfaceDrawablePngFrameManager$RandomDrawableParam.jdField_a_of_type_JavaLangString).replace("[eId]", str);
    ArrayList localArrayList = new ArrayList();
    HashMap localHashMap = new HashMap();
    localArrayList.add(localObject2);
    localHashMap.put(localObject2, new File((String)localObject1));
    localArrayList.add(localObject3);
    localHashMap.put(localObject3, new File(str));
    localObject2 = new DownloadTask(localArrayList, localHashMap, "random_magicface_" + this.jdField_a_of_type_ComTencentMobileqqMagicfaceDrawablePngFrameManager$RandomDrawableParam.jdField_a_of_type_JavaLangString);
    ((DownloadTask)localObject2).l = true;
    PngFrameManager.a(this.jdField_a_of_type_ComTencentMobileqqMagicfaceDrawablePngFrameManager).a((DownloadTask)localObject2, new tan(this, (String)localObject1), null);
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\tam.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */