import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.os.Message;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.mobileqq.app.FriendListHandler;
import com.tencent.mobileqq.app.FriendListObserver;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.facetoface.Face2FaceAddFriendActivity;
import com.tencent.mobileqq.facetoface.Face2FaceAddFriendAnim;
import com.tencent.mobileqq.facetoface.Face2FaceFriendBubbleView;
import com.tencent.mobileqq.facetoface.Face2FaceUserData;
import com.tencent.mobileqq.facetoface.NearbyUser;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.utils.AntiFraudConfigFileUtil;
import com.tencent.mobileqq.utils.DialogUtil;
import com.tencent.mobileqq.utils.QQCustomDialog;
import com.tencent.mobileqq.widget.QQToast;
import com.tencent.qphone.base.util.QLog;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class rmj
  extends FriendListObserver
{
  private int jdField_a_of_type_Int;
  DialogInterface.OnClickListener jdField_a_of_type_AndroidContentDialogInterface$OnClickListener;
  DialogInterface.OnDismissListener jdField_a_of_type_AndroidContentDialogInterface$OnDismissListener;
  private QQCustomDialog jdField_a_of_type_ComTencentMobileqqUtilsQQCustomDialog;
  DialogInterface.OnClickListener b;
  
  public rmj(Face2FaceAddFriendActivity paramFace2FaceAddFriendActivity)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_AndroidContentDialogInterface$OnClickListener = new rmk(this);
    this.b = new rml(this);
    this.jdField_a_of_type_AndroidContentDialogInterface$OnDismissListener = new rmm(this);
  }
  
  private void d()
  {
    if ((this.jdField_a_of_type_ComTencentMobileqqUtilsQQCustomDialog != null) && (this.jdField_a_of_type_Int != 0))
    {
      localObject1 = (Bundle)AntiFraudConfigFileUtil.a().a("SecWarningCfg", "AlertTitle", 147, this.jdField_a_of_type_Int);
      if (localObject1 == null) {
        break label476;
      }
    }
    label202:
    label221:
    label325:
    label390:
    label403:
    label425:
    label438:
    label476:
    for (Object localObject1 = ((Bundle)localObject1).getString("AlertTitle");; localObject1 = null)
    {
      Object localObject2 = (Bundle)AntiFraudConfigFileUtil.a().a("SecWarningCfg", "AlertText", 147, this.jdField_a_of_type_Int);
      if (localObject2 != null) {}
      for (Object localObject3 = ((Bundle)localObject2).getString("AlertText");; localObject3 = null)
      {
        localObject2 = (Bundle)AntiFraudConfigFileUtil.a().a("SecWarningCfg", "AlertLeftBtnText", 147, this.jdField_a_of_type_Int);
        if (localObject2 != null) {}
        for (localObject2 = ((Bundle)localObject2).getString("AlertLeftBtnText");; localObject2 = null)
        {
          Object localObject4 = (Bundle)AntiFraudConfigFileUtil.a().a("SecWarningCfg", "AlertRightBtnText", 147, this.jdField_a_of_type_Int);
          if (localObject4 != null) {}
          for (localObject4 = ((Bundle)localObject4).getString("AlertRightBtnText");; localObject4 = null)
          {
            Object localObject5 = localObject1;
            int i;
            if (localObject1 == null)
            {
              localObject1 = this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity;
              if (this.jdField_a_of_type_Int == 1)
              {
                i = 2131367238;
                localObject5 = ((Face2FaceAddFriendActivity)localObject1).getString(i);
              }
            }
            else
            {
              localObject1 = localObject3;
              if (localObject3 == null)
              {
                if (this.jdField_a_of_type_Int != 1) {
                  break label325;
                }
                localObject1 = this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.getString(2131367240);
              }
              if (localObject2 != null) {
                break label403;
              }
              if (this.jdField_a_of_type_Int != 1) {
                break label390;
              }
              this.jdField_a_of_type_AndroidContentDialogInterface$OnClickListener = null;
              localObject3 = localObject2;
              if (localObject4 != null) {
                break label438;
              }
              if (this.jdField_a_of_type_Int != 1) {
                break label425;
              }
              localObject2 = this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.getString(2131367246);
            }
            for (;;)
            {
              this.jdField_a_of_type_ComTencentMobileqqUtilsQQCustomDialog.setTitle((String)localObject5);
              this.jdField_a_of_type_ComTencentMobileqqUtilsQQCustomDialog.setMessage((CharSequence)localObject1);
              this.jdField_a_of_type_ComTencentMobileqqUtilsQQCustomDialog.setNegativeButton((String)localObject3, this.jdField_a_of_type_AndroidContentDialogInterface$OnClickListener);
              this.jdField_a_of_type_ComTencentMobileqqUtilsQQCustomDialog.setPositiveButton((String)localObject2, this.b);
              if ((this.jdField_a_of_type_AndroidContentDialogInterface$OnClickListener == null) || (this.b == null)) {
                this.jdField_a_of_type_ComTencentMobileqqUtilsQQCustomDialog.findViewById(2131297852).setVisibility(8);
              }
              return;
              i = 2131367239;
              break;
              if (this.jdField_a_of_type_Int == 2)
              {
                localObject1 = this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.getString(2131367241);
                break label202;
              }
              if (this.jdField_a_of_type_Int == 3)
              {
                localObject1 = this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.getString(2131367242);
                break label202;
              }
              localObject1 = localObject3;
              if (this.jdField_a_of_type_Int != 4) {
                break label202;
              }
              localObject1 = this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.getString(2131367243);
              break label202;
              localObject3 = this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.getString(2131367247);
              break label221;
              localObject3 = localObject2;
              if (!TextUtils.isEmpty(((String)localObject2).trim())) {
                break label221;
              }
              this.jdField_a_of_type_AndroidContentDialogInterface$OnClickListener = null;
              localObject3 = localObject2;
              break label221;
              localObject2 = this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.getString(2131367248);
              continue;
              if (TextUtils.isEmpty(((String)localObject4).trim())) {
                this.b = null;
              }
              localObject2 = localObject4;
            }
          }
        }
      }
    }
  }
  
  protected void a(String paramString)
  {
    super.a(paramString);
    if (QLog.isColorLevel()) {
      QLog.d(Face2FaceAddFriendActivity.jdField_a_of_type_JavaLangString, 2, "onAddFriend 进入好友列表" + paramString);
    }
    Object localObject = Face2FaceAddFriendActivity.a(this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity).obtainMessage();
    ((Message)localObject).what = 2;
    ((Message)localObject).arg1 = 2;
    ((Message)localObject).obj = paramString;
    Face2FaceAddFriendActivity.a(this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity).sendMessage((Message)localObject);
    Face2FaceAddFriendActivity.a(this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity, 2, paramString);
    localObject = Face2FaceAddFriendActivity.a(this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity, paramString, 1);
    if (localObject == null) {}
    Face2FaceUserData localFace2FaceUserData;
    do
    {
      return;
      localFace2FaceUserData = ((Face2FaceFriendBubbleView)localObject).a();
      if ((localFace2FaceUserData != null) && (this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.jdField_a_of_type_JavaUtilHashMap.containsKey(paramString)))
      {
        String str = (String)this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.jdField_a_of_type_JavaUtilHashMap.get(paramString);
        if ((!TextUtils.isEmpty(str)) && (localFace2FaceUserData != null) && (localFace2FaceUserData.jdField_a_of_type_Int == 1))
        {
          ((NearbyUser)localFace2FaceUserData).jdField_a_of_type_JavaLangString = str;
          ((Face2FaceFriendBubbleView)localObject).a(str);
        }
      }
    } while (!this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.jdField_a_of_type_JavaUtilConcurrentCopyOnWriteArrayList.contains(localFace2FaceUserData));
    this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendAnim.a(paramString);
    paramString = Face2FaceAddFriendActivity.a(this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity).obtainMessage();
    paramString.what = 11;
    paramString.arg1 = 1;
    Face2FaceAddFriendActivity.a(this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity).sendMessageDelayed(paramString, this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.a());
  }
  
  protected void a(boolean paramBoolean, long paramLong, int paramInt1, int paramInt2)
  {
    if (paramInt1 == 147)
    {
      if (QLog.isColorLevel()) {
        QLog.d(Face2FaceAddFriendActivity.jdField_a_of_type_JavaLangString, 2, "onQueryUinSafetyFlag isSuccess=" + paramBoolean + "status=" + paramInt2);
      }
      if ((!paramBoolean) || (paramInt2 == 0)) {
        Face2FaceAddFriendActivity.e(this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity);
      }
    }
    else
    {
      return;
    }
    this.jdField_a_of_type_Int = paramInt2;
    AntiFraudConfigFileUtil.a().a(this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.app, "SecWarningCfg");
    try
    {
      this.jdField_a_of_type_ComTencentMobileqqUtilsQQCustomDialog = DialogUtil.a(this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity, 230, "", "", this.jdField_a_of_type_AndroidContentDialogInterface$OnClickListener, this.b);
      d();
      this.jdField_a_of_type_ComTencentMobileqqUtilsQQCustomDialog.setOnDismissListener(this.jdField_a_of_type_AndroidContentDialogInterface$OnDismissListener);
      this.jdField_a_of_type_ComTencentMobileqqUtilsQQCustomDialog.show();
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  protected void a(boolean paramBoolean, Bundle paramBundle)
  {
    String str1 = paramBundle.getString("uin");
    int i = paramBundle.getInt("friend_setting");
    if (QLog.isColorLevel()) {
      QLog.d(Face2FaceAddFriendActivity.jdField_a_of_type_JavaLangString, 2, "onUpdateAddFriendSetting请求加好友设置 isSuccess= " + paramBoolean + "friendSetting=" + i);
    }
    FriendListHandler localFriendListHandler = (FriendListHandler)this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.app.a(1);
    String str2 = this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.jdField_a_of_type_AndroidWidgetEditText.getText().toString();
    byte b1 = (byte)this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.K;
    if (TextUtils.isEmpty(this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.g)) {}
    do
    {
      return;
      localFriendListHandler.a(this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.g, null, i, b1, "", 3021, 0, true, null, true, str2, "");
      if (QLog.isColorLevel()) {
        QLog.d(Face2FaceAddFriendActivity.jdField_a_of_type_JavaLangString, 2, "请求加好友" + this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.g);
      }
    } while ((!this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.g.equals(str1)) || (!paramBoolean));
    paramBundle.getStringArrayList("user_question");
    paramBundle.getBoolean("contact_bothway");
  }
  
  protected void a(boolean paramBoolean, Object paramObject)
  {
    super.a(paramBoolean, paramObject);
    if (QLog.isColorLevel()) {
      QLog.d(Face2FaceAddFriendActivity.jdField_a_of_type_JavaLangString, 2, "onUpdateDelFriend 删除好友");
    }
    if (this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.e.contains(String.valueOf(paramObject))) {
      this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.e.remove(String.valueOf(paramObject));
    }
  }
  
  protected void a(boolean paramBoolean, String paramString)
  {
    int i = 2;
    if (QLog.isColorLevel()) {
      QLog.d(Face2FaceAddFriendActivity.jdField_a_of_type_JavaLangString, 2, "好友onUpdateCustomHead success = " + paramBoolean);
    }
    if (this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.l) {
      return;
    }
    if (this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.jdField_b_of_type_Int == 1) {}
    for (;;)
    {
      Face2FaceFriendBubbleView localFace2FaceFriendBubbleView = Face2FaceAddFriendActivity.a(this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity, paramString, i);
      if (localFace2FaceFriendBubbleView == null) {
        break;
      }
      localFace2FaceFriendBubbleView.a(this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.app, paramString, 1);
      return;
      i = 1;
    }
  }
  
  protected void a(boolean paramBoolean, String paramString1, String paramString2, int paramInt)
  {
    if (!TextUtils.equals(this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.g, paramString1)) {}
    do
    {
      for (;;)
      {
        return;
        if (paramBoolean)
        {
          if (!this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.jdField_a_of_type_JavaUtilHashMap.containsKey(paramString1)) {
            this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.jdField_a_of_type_AndroidWidgetEditText.setText(paramString2);
          }
          try
          {
            this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.jdField_a_of_type_AndroidWidgetEditText.setSelection(this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.jdField_a_of_type_AndroidWidgetEditText.getText().length());
            if (!this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.jdField_b_of_type_JavaUtilHashMap.containsKey(paramString1))
            {
              this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.K = paramInt;
              this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.jdField_b_of_type_AndroidWidgetTextView.setText(this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.a(this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.K));
              this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.jdField_b_of_type_JavaUtilHashMap.put(paramString1, Integer.valueOf(this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.K));
              return;
            }
          }
          catch (IndexOutOfBoundsException paramString2)
          {
            for (;;)
            {
              if (QLog.isColorLevel()) {
                QLog.d(Face2FaceAddFriendActivity.jdField_a_of_type_JavaLangString, 2, "onGetAutoInfo | IndexOutOfBoundsException");
              }
            }
          }
        }
      }
    } while (this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.jdField_b_of_type_JavaUtilHashMap.containsKey(paramString1));
    this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.K = 0;
    this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.jdField_b_of_type_AndroidWidgetTextView.setText(this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.a(this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.K));
    this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.jdField_b_of_type_JavaUtilHashMap.put(paramString1, Integer.valueOf(this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.K));
  }
  
  protected void a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString, Bundle paramBundle)
  {
    super.a(paramBoolean1, paramBoolean2, paramBoolean3, paramString, paramBundle);
    int i = paramBundle.getInt("friend_setting");
    if (QLog.isColorLevel()) {
      QLog.d(Face2FaceAddFriendActivity.jdField_a_of_type_JavaLangString, 2, "onUpdateAddFriend请求加好友回调 isSuccess= " + paramBoolean1 + "addSuccess=" + paramBoolean2 + "reqestUin=" + paramString + "friendSetting" + i);
    }
    if (paramBoolean2)
    {
      paramString = paramBundle.getString("remark");
      paramBundle = paramBundle.getString("uin");
      this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.jdField_a_of_type_JavaUtilHashMap.put(paramBundle, paramString);
      if (i == 0)
      {
        paramString = Face2FaceAddFriendActivity.a(this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity).obtainMessage();
        paramString.what = 2;
        paramString.arg1 = 2;
        paramString.obj = this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.g;
        Face2FaceAddFriendActivity.a(this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity).sendMessage(paramString);
        Face2FaceAddFriendActivity.a(this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity, 2, this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.g);
        return;
      }
      paramString = Face2FaceAddFriendActivity.a(this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity).obtainMessage();
      paramString.what = 2;
      paramString.arg1 = 4;
      paramString.obj = this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.g;
      Face2FaceAddFriendActivity.a(this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity).sendMessage(paramString);
      Face2FaceAddFriendActivity.a(this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity, 4, this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.g);
      return;
    }
    paramBundle = paramBundle.getString("ErrorString");
    if (QLog.isColorLevel()) {
      QLog.d(Face2FaceAddFriendActivity.jdField_a_of_type_JavaLangString, 2, "add friend response error and ErroString = " + paramBundle);
    }
    paramString = paramBundle;
    if (TextUtils.isEmpty(paramBundle)) {
      paramString = this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.getString(2131372062);
    }
    QQToast.a(this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity, 0, paramString, 0).b(this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.getTitleBarHeight());
  }
  
  protected void b(boolean paramBoolean, String paramString)
  {
    if (QLog.isColorLevel()) {
      QLog.d(Face2FaceAddFriendActivity.jdField_a_of_type_JavaLangString, 2, "群onUpdateTroopHead success = " + paramBoolean);
    }
    Face2FaceFriendBubbleView localFace2FaceFriendBubbleView = Face2FaceAddFriendActivity.a(this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity, paramString, 2);
    if (localFace2FaceFriendBubbleView != null) {
      localFace2FaceFriendBubbleView.a(this.jdField_a_of_type_ComTencentMobileqqFacetofaceFace2FaceAddFriendActivity.app, paramString, 2);
    }
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\rmj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */