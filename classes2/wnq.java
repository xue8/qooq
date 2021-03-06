import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.image.URLDrawable;
import com.tencent.image.URLDrawable.URLDrawableOptions;
import com.tencent.mobileqq.activity.ProfileActivity.AllInOne;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.profile.DataTag;
import com.tencent.mobileqq.profile.ProfileCardInfo;
import com.tencent.mobileqq.profile.ProfileCardTemplate;
import com.tencent.mobileqq.profile.ProfileShoppingPhotoInfo;
import com.tencent.mobileqq.profile.ShoppingPhotoItemInfo;
import com.tencent.mobileqq.widget.ProfileCardMoreInfoView;
import com.tencent.qphone.base.util.QLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class wnq
  implements Runnable
{
  wnq(wnp paramwnp, ProfileShoppingPhotoInfo paramProfileShoppingPhotoInfo)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void run()
  {
    if ((this.jdField_a_of_type_ComTencentMobileqqProfileProfileShoppingPhotoInfo == null) || (ProfileCardMoreInfoView.a(this.jdField_a_of_type_Wnp.a) == null) || (this.jdField_a_of_type_Wnp.a.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface == null) || (ProfileCardMoreInfoView.a(this.jdField_a_of_type_Wnp.a) == null) || (this.jdField_a_of_type_Wnp.a.jdField_a_of_type_ComTencentMobileqqProfileProfileCardInfo == null) || (this.jdField_a_of_type_Wnp.a.jdField_a_of_type_ComTencentMobileqqProfileProfileCardInfo.jdField_a_of_type_ComTencentMobileqqActivityProfileActivity$AllInOne == null)) {
      return;
    }
    Object localObject1 = new ArrayList();
    Object localObject3 = (View)ProfileCardMoreInfoView.a(this.jdField_a_of_type_Wnp.a).get("map_key_shopping_photo");
    Object localObject2 = localObject3;
    if (localObject3 == null)
    {
      localObject2 = ProfileCardMoreInfoView.a(this.jdField_a_of_type_Wnp.a).inflate(2130904308, null);
      ProfileCardMoreInfoView.a(this.jdField_a_of_type_Wnp.a).put("map_key_shopping_photo", localObject2);
    }
    localObject3 = (TextView)((View)localObject2).findViewById(2131302262);
    if ((this.jdField_a_of_type_Wnp.a.jdField_a_of_type_ComTencentMobileqqProfileProfileCardInfo.jdField_a_of_type_ComTencentMobileqqActivityProfileActivity$AllInOne.jdField_a_of_type_Int == 0) || (this.jdField_a_of_type_Wnp.a.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().equals(this.jdField_a_of_type_Wnp.a.jdField_a_of_type_ComTencentMobileqqProfileProfileCardInfo.jdField_a_of_type_ComTencentMobileqqActivityProfileActivity$AllInOne.jdField_a_of_type_JavaLangString)))
    {
      localObject3 = (TextView)((View)localObject2).findViewById(2131302262);
      ((TextView)localObject3).setText(this.jdField_a_of_type_Wnp.a.a(2131369960));
    }
    Object localObject4;
    Object localObject5;
    int j;
    int i;
    label403:
    Object localObject6;
    if (this.jdField_a_of_type_ComTencentMobileqqProfileProfileShoppingPhotoInfo != null)
    {
      localObject1 = this.jdField_a_of_type_ComTencentMobileqqProfileProfileShoppingPhotoInfo.getPhotoFromRawData();
      if (localObject1 == null) {
        break label491;
      }
      localObject4 = (LinearLayout)((View)localObject2).findViewById(2131302264);
      localObject5 = (LinearLayout)((View)localObject2).findViewById(2131302266);
      if (((List)localObject1).size() <= 0)
      {
        ((LinearLayout)localObject4).setVisibility(0);
        ((LinearLayout)localObject5).setVisibility(8);
        localObject4 = (TextView)((View)localObject2).findViewById(2131302265);
        ((TextView)localObject4).setText(this.jdField_a_of_type_ComTencentMobileqqProfileProfileShoppingPhotoInfo.shopName);
        ProfileCardTemplate.a((View)localObject4, "color", this.jdField_a_of_type_Wnp.a.jdField_a_of_type_ComTencentMobileqqProfileProfileCardTemplate, "commonItemContentColor");
      }
    }
    else
    {
      j = this.jdField_a_of_type_Wnp.a.getResources().getDimensionPixelSize(2131493548);
      localObject5 = new ImageView[3];
      localObject5[0] = ((ImageView)((View)localObject2).findViewById(2131302267));
      localObject5[1] = ((ImageView)((View)localObject2).findViewById(2131302268));
      localObject5[2] = ((ImageView)((View)localObject2).findViewById(2131302269));
      i = 0;
      if (i >= localObject5.length) {
        break label654;
      }
      localObject6 = localObject5[i];
      if ((localObject1 == null) || (((List)localObject1).size() <= i)) {
        break label494;
      }
      localObject4 = ((ShoppingPhotoItemInfo)((List)localObject1).get(i)).jdField_a_of_type_JavaLangString;
      label449:
      if ((!TextUtils.isEmpty((CharSequence)localObject4)) || (localObject6 == null)) {
        break label500;
      }
      ((ImageView)localObject6).setVisibility(8);
    }
    for (;;)
    {
      i += 1;
      break label403;
      ((LinearLayout)localObject4).setVisibility(8);
      ((LinearLayout)localObject5).setVisibility(0);
      label491:
      break;
      label494:
      localObject4 = null;
      break label449;
      label500:
      if (localObject6 != null)
      {
        if (ProfileCardMoreInfoView.a(this.jdField_a_of_type_Wnp.a) == null) {
          ProfileCardMoreInfoView.a(this.jdField_a_of_type_Wnp.a, new ColorDrawable(this.jdField_a_of_type_Wnp.a.getResources().getColor(2131427454)));
        }
        try
        {
          URLDrawable.URLDrawableOptions localURLDrawableOptions = URLDrawable.URLDrawableOptions.obtain();
          localURLDrawableOptions.mLoadingDrawable = ProfileCardMoreInfoView.a(this.jdField_a_of_type_Wnp.a);
          localURLDrawableOptions.mFailedDrawable = ProfileCardMoreInfoView.a(this.jdField_a_of_type_Wnp.a);
          localURLDrawableOptions.mRequestHeight = j;
          localURLDrawableOptions.mRequestWidth = j;
          localObject4 = URLDrawable.getDrawable((String)localObject4, localURLDrawableOptions);
          ((ImageView)localObject6).setVisibility(0);
          ((ImageView)localObject6).setImageDrawable((Drawable)localObject4);
        }
        catch (Exception localException)
        {
          ((ImageView)localObject6).setVisibility(8);
        }
        if (QLog.isColorLevel()) {
          QLog.e("Q.profilecard.FrdProfileCard", 2, localException.toString());
        }
      }
    }
    label654:
    ((View)localObject2).setTag(new DataTag(41, null));
    ((View)localObject2).setOnClickListener(this.jdField_a_of_type_Wnp.a.jdField_a_of_type_ComTencentMobileqqProfileProfileCardInfo.jdField_a_of_type_AndroidViewView$OnClickListener);
    ((View)localObject2).setContentDescription(this.jdField_a_of_type_Wnp.a.a(2131362014));
    localObject1 = (ImageView)((View)localObject2).findViewById(2131302263);
    ProfileCardMoreInfoView.a(this.jdField_a_of_type_Wnp.a, "map_key_shopping_photo", (TextView)localObject3, null, (ImageView)localObject1);
    this.jdField_a_of_type_Wnp.a.requestLayout();
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\wnq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */