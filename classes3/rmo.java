import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.mobileqq.facetoface.Face2FaceAddFriendActivity;
import com.tencent.mobileqq.facetoface.Face2FaceAddFriendAnim;
import com.tencent.mobileqq.facetoface.Face2FaceFriendBubbleView;
import com.tencent.mobileqq.facetoface.Face2FaceUserData;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.qphone.base.util.QLog;

public class rmo
  implements Animation.AnimationListener
{
  public rmo(Face2FaceAddFriendAnim paramFace2FaceAddFriendAnim, Face2FaceUserData paramFace2FaceUserData1, int paramInt1, double paramDouble, boolean paramBoolean1, boolean paramBoolean2, Face2FaceUserData paramFace2FaceUserData2, boolean paramBoolean3, boolean paramBoolean4, Face2FaceFriendBubbleView paramFace2FaceFriendBubbleView, int paramInt2)
  {
    paramBoolean1 = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    ((Face2FaceAddFriendActivity)this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendAnim.a).b(this.jdField_b_of_type_ComTencentMobileqqFacetofaceFace2FaceUserData, this.c, this.d);
    this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceFriendBubbleView.setStatusWithAnimation(this.jdField_b_of_type_Int);
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation)
  {
    if (QLog.isColorLevel()) {
      QLog.d(Face2FaceAddFriendActivity.a, 2, "startFriendInAnimation currentUin ( " + this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceUserData.e.substring(0, 4) + ", " + this.jdField_a_of_type_Int + " )" + " Animation Start  ");
    }
    double d2 = Math.atan(this.jdField_a_of_type_Double) * 180.0D / 3.141592653589793D * this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendAnim.l;
    double d1 = d2;
    if (this.jdField_a_of_type_Boolean) {
      d1 = 180.0D - d2;
    }
    this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendAnim.b = ((float)d1);
    if (QLog.isColorLevel()) {
      QLog.d(Face2FaceAddFriendActivity.a, 2, "startFriendInAnimation uinToHoleIndex add( " + this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceUserData.e.substring(0, 4) + ", " + this.jdField_a_of_type_Int + " )");
    }
    this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendAnim.a(2, this.jdField_b_of_type_Boolean);
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\rmo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */