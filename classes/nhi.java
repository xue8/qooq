import android.view.ViewGroup;
import com.tencent.mobileqq.activity.BaseChatPie;
import com.tencent.mobileqq.activity.aio.audiopanel.AudioPanel;
import com.tencent.mobileqq.activity.aio.audiopanel.ListenPanel;
import com.tencent.mobileqq.activity.aio.audiopanel.RecordSoundPanel;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.utils.QQRecorder.RecorderParam;

public class nhi
  implements Runnable
{
  public nhi(RecordSoundPanel paramRecordSoundPanel, String paramString, QQRecorder.RecorderParam paramRecorderParam)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void run()
  {
    this.jdField_a_of_type_ComTencentMobileqqActivityAioAudiopanelRecordSoundPanel.jdField_a_of_type_ComTencentMobileqqActivityBaseChatPie.a(this.jdField_a_of_type_JavaLangString, this.jdField_a_of_type_ComTencentMobileqqUtilsQQRecorder$RecorderParam);
    ListenPanel localListenPanel = (ListenPanel)this.jdField_a_of_type_ComTencentMobileqqActivityAioAudiopanelRecordSoundPanel.f.findViewById(2131299550);
    localListenPanel.setVisibility(0);
    localListenPanel.setAudioPath(this.jdField_a_of_type_JavaLangString, this.jdField_a_of_type_ComTencentMobileqqActivityAioAudiopanelRecordSoundPanel.jdField_a_of_type_Double, this.jdField_a_of_type_ComTencentMobileqqUtilsQQRecorder$RecorderParam);
    localListenPanel.setJumpSource(ListenPanel.d);
    this.jdField_a_of_type_ComTencentMobileqqActivityAioAudiopanelRecordSoundPanel.jdField_a_of_type_ComTencentMobileqqActivityAioAudiopanelAudioPanel.setStatus(4);
    this.jdField_a_of_type_ComTencentMobileqqActivityAioAudiopanelRecordSoundPanel.setVisibility(8);
    this.jdField_a_of_type_ComTencentMobileqqActivityAioAudiopanelRecordSoundPanel.setClickable(true);
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\nhi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */