import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.text.TextUtils;
import android.view.View;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.bubble.BubbleNewAIOAnim;
import com.tencent.mobileqq.bubble.BubbleNewAnimConf.PendantAnimConf;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.vas.AvatarPendantManager;

public class que
  extends AnimatorListenerAdapter
{
  public que(BubbleNewAIOAnim paramBubbleNewAIOAnim, BubbleNewAnimConf.PendantAnimConf paramPendantAnimConf)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    if ((this.jdField_a_of_type_ComTencentMobileqqBubbleBubbleNewAIOAnim.d != null) && (this.jdField_a_of_type_ComTencentMobileqqBubbleBubbleNewAIOAnim.e != null))
    {
      this.jdField_a_of_type_ComTencentMobileqqBubbleBubbleNewAIOAnim.d.setVisibility(4);
      this.jdField_a_of_type_ComTencentMobileqqBubbleBubbleNewAIOAnim.e.setVisibility(0);
      paramAnimator = (AvatarPendantManager)this.jdField_a_of_type_ComTencentMobileqqBubbleBubbleNewAIOAnim.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getManager(45);
      paramAnimator.jdField_a_of_type_Long = -1L;
      this.jdField_a_of_type_ComTencentMobileqqBubbleBubbleNewAIOAnim.a("show pendant, " + this.jdField_a_of_type_ComTencentMobileqqBubbleBubbleNewAIOAnim.jdField_a_of_type_Long);
      paramAnimator.b();
    }
    if (this.jdField_a_of_type_ComTencentMobileqqBubbleBubbleNewAIOAnim.c != null) {
      this.jdField_a_of_type_ComTencentMobileqqBubbleBubbleNewAIOAnim.c.setVisibility(0);
    }
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    if ((this.jdField_a_of_type_ComTencentMobileqqBubbleBubbleNewAIOAnim.d != null) && (this.jdField_a_of_type_ComTencentMobileqqBubbleBubbleNewAIOAnim.e != null))
    {
      this.jdField_a_of_type_ComTencentMobileqqBubbleBubbleNewAIOAnim.d.setVisibility(0);
      this.jdField_a_of_type_ComTencentMobileqqBubbleBubbleNewAIOAnim.e.setVisibility(4);
      paramAnimator = (AvatarPendantManager)this.jdField_a_of_type_ComTencentMobileqqBubbleBubbleNewAIOAnim.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getManager(45);
      this.jdField_a_of_type_ComTencentMobileqqBubbleBubbleNewAIOAnim.a("stop show pendant, " + this.jdField_a_of_type_ComTencentMobileqqBubbleBubbleNewAIOAnim.jdField_a_of_type_Long);
      paramAnimator.jdField_a_of_type_Long = this.jdField_a_of_type_ComTencentMobileqqBubbleBubbleNewAIOAnim.jdField_a_of_type_Long;
      paramAnimator.a();
    }
    if ((this.jdField_a_of_type_ComTencentMobileqqBubbleBubbleNewAIOAnim.c != null) && (TextUtils.isEmpty(this.jdField_a_of_type_ComTencentMobileqqBubbleBubbleNewAnimConf$PendantAnimConf.c))) {
      this.jdField_a_of_type_ComTencentMobileqqBubbleBubbleNewAIOAnim.c.setVisibility(4);
    }
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\que.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */