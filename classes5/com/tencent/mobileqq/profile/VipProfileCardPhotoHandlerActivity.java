package com.tencent.mobileqq.profile;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.mobileqq.activity.ProfileActivity;
import com.tencent.mobileqq.activity.photo.PhotoUtils;
import com.tencent.mobileqq.app.BaseActivity;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.util.ProfileCardUtil;
import com.tencent.mobileqq.utils.ImageUtil;

public class VipProfileCardPhotoHandlerActivity
  extends BaseActivity
{
  public static final String a = "select_photo";
  public static final String b = "take_photo";
  public static final String c = "action";
  private Uri jdField_a_of_type_AndroidNetUri;
  private boolean jdField_a_of_type_Boolean;
  private boolean b;
  
  public VipProfileCardPhotoHandlerActivity()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  private void a()
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("PhotoConst.PHOTO_LIST_SHOW_PREVIEW", true);
    localIntent.putExtra("Business_Origin", 101);
    localIntent.putExtra("PhotoConst.COMPRESS_QUALITY", 80);
    PhotoUtils.a(localIntent, this, VipProfileCardPhotoHandlerActivity.class.getName(), ProfileCardUtil.b(this), ProfileCardUtil.a(this), ProfileCardUtil.b(this), ProfileCardUtil.a(this), ProfileCardUtil.c());
  }
  
  private void b()
  {
    this.jdField_a_of_type_AndroidNetUri = ProfileActivity.a(this, 5);
  }
  
  protected void a(Uri paramUri)
  {
    paramUri = ImageUtil.c(this, paramUri);
    Intent localIntent = new Intent();
    localIntent.putExtra("Business_Origin", 101);
    localIntent.putExtra("PhotoConst.COMPRESS_QUALITY", 80);
    PhotoUtils.a(localIntent, this, VipProfileCardPhotoHandlerActivity.class.getName(), ProfileCardUtil.b(this), ProfileCardUtil.a(this), ProfileCardUtil.b(this), ProfileCardUtil.a(this), paramUri, ProfileCardUtil.c());
  }
  
  protected void a(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      Intent localIntent = new Intent(this, VipProfileCardPreviewActivity.class);
      localIntent.putExtra("custom_card_background", paramString);
      startActivity(localIntent);
    }
  }
  
  public void doOnActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.doOnActivityResult(paramInt1, paramInt2, paramIntent);
    if ((paramInt1 == 5) && (paramInt2 == -1))
    {
      this.b = true;
      a(this.jdField_a_of_type_AndroidNetUri);
    }
  }
  
  public boolean doOnCreate(Bundle paramBundle)
  {
    super.doOnCreate(paramBundle);
    paramBundle = getIntent();
    if ((paramBundle != null) && (!TextUtils.isEmpty(paramBundle.getStringExtra("action"))))
    {
      if (!paramBundle.getStringExtra("action").equals("select_photo")) {
        break label47;
      }
      a();
    }
    for (;;)
    {
      return true;
      label47:
      if (paramBundle.getStringExtra("action").equals("take_photo")) {
        b();
      }
    }
  }
  
  public void doOnNewIntent(Intent paramIntent)
  {
    super.doOnNewIntent(paramIntent);
    a(paramIntent.getStringExtra("PhotoConst.SINGLE_PHOTO_PATH"));
    finish();
  }
  
  public void doOnPause()
  {
    super.doOnPause();
    this.jdField_a_of_type_Boolean = true;
  }
  
  public void doOnResume()
  {
    super.doOnResume();
    if (this.jdField_a_of_type_Boolean)
    {
      if (!this.b) {
        finish();
      }
    }
    else {
      return;
    }
    this.b = false;
  }
  
  public void doOnStop()
  {
    super.doOnStop();
    this.jdField_a_of_type_Boolean = true;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\com\tencent\mobileqq\profile\VipProfileCardPhotoHandlerActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */