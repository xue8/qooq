package com.tencent.mobileqq.nearby.picbrowser;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import com.tencent.common.galleryactivity.GalleryImage;
import com.tencent.image.URLDrawable;
import com.tencent.image.URLDrawable.URLDrawableOptions;
import com.tencent.image.URLImageView;
import com.tencent.mobileqq.app.ThreadManager;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.nearby.ImgDownloadListener;
import com.tencent.mobileqq.transfile.AbsDownloader;
import com.tencent.mobileqq.transfile.NearbyImgDownloader;
import com.tencent.mobileqq.transfile.URLDrawableHelper;
import com.tencent.qphone.base.util.QLog;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import tla;
import tlb;
import tlc;

public class PicBrowserImage
  extends GalleryImage
{
  public static final String b = "PicBrowser";
  protected Context a;
  public PicInfo a;
  int h;
  
  public PicBrowserImage(Context paramContext, PicInfo paramPicInfo)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_AndroidContentContext = paramContext;
    this.jdField_a_of_type_ComTencentMobileqqNearbyPicbrowserPicInfo = paramPicInfo;
  }
  
  public int a()
  {
    return this.h;
  }
  
  public View a(int paramInt, Handler paramHandler, PicBrowserImage.OnLoadListener paramOnLoadListener)
  {
    File localFile = null;
    URL localURL = null;
    URLDrawable localURLDrawable = null;
    boolean bool2 = true;
    URLImageView localURLImageView = new URLImageView(this.jdField_a_of_type_AndroidContentContext);
    if (this.jdField_a_of_type_ComTencentMobileqqNearbyPicbrowserPicInfo == null) {
      return localURLImageView;
    }
    Object localObject1;
    Object localObject3;
    label243:
    long l;
    if (!TextUtils.isEmpty(this.jdField_a_of_type_ComTencentMobileqqNearbyPicbrowserPicInfo.c))
    {
      localObject1 = URLDrawable.getDrawable(new File(this.jdField_a_of_type_ComTencentMobileqqNearbyPicbrowserPicInfo.c), null);
      localObject3 = URLDrawable.URLDrawableOptions.obtain();
      ((URLDrawable.URLDrawableOptions)localObject3).mFailedDrawable = ((Drawable)localObject1);
      ((URLDrawable.URLDrawableOptions)localObject3).mLoadingDrawable = ((Drawable)localObject1);
      ((URLDrawable.URLDrawableOptions)localObject3).mRequestWidth = this.jdField_a_of_type_AndroidContentContext.getResources().getDisplayMetrics().widthPixels;
      ((URLDrawable.URLDrawableOptions)localObject3).mRequestHeight = this.jdField_a_of_type_AndroidContentContext.getResources().getDisplayMetrics().heightPixels;
      if (!TextUtils.isEmpty(this.jdField_a_of_type_ComTencentMobileqqNearbyPicbrowserPicInfo.c)) {
        localObject1 = localURLDrawable;
      }
    }
    else
    {
      try
      {
        localFile = new File(this.jdField_a_of_type_ComTencentMobileqqNearbyPicbrowserPicInfo.c);
        localObject1 = localURLDrawable;
        localURL = localFile.toURL();
        localObject1 = localURLDrawable;
        localURLDrawable = URLDrawable.getDrawable(new URL("nearbylocalimage", localURL.getAuthority(), localURL.getFile()), (URLDrawable.URLDrawableOptions)localObject3);
        localObject1 = localURLDrawable;
        localURLImageView.setImageDrawable(localURLDrawable);
        localObject1 = localURLDrawable;
        if (!localFile.exists()) {
          break label405;
        }
        localObject1 = localURLDrawable;
        bool1 = localFile.isFile();
        if (!bool1) {
          break label405;
        }
        bool1 = true;
        localObject1 = localURLDrawable;
      }
      catch (MalformedURLException localMalformedURLException1)
      {
        for (;;)
        {
          label300:
          if (QLog.isDevelopLevel()) {
            localMalformedURLException1.printStackTrace();
          }
          bool1 = false;
        }
      }
      if ((localObject1 == null) || (((URLDrawable)localObject1).getStatus() == 1) || (((URLDrawable)localObject1).getStatus() == 2) || (((URLDrawable)localObject1).getStatus() == 4)) {
        break label591;
      }
      localURLImageView.setURLDrawableDownListener(new tlb(this, paramOnLoadListener, paramInt));
      if (!bool1) {
        break label583;
      }
      l = 1000L;
      paramHandler.postDelayed(new tlc(this, (URLDrawable)localObject1, paramOnLoadListener, paramInt), l);
    }
    for (;;)
    {
      return localURLImageView;
      String str = this.jdField_a_of_type_ComTencentMobileqqNearbyPicbrowserPicInfo.b.replaceFirst("http", "nearbyimage");
      if (AbsDownloader.a(str))
      {
        localObject3 = URLDrawable.getDrawable(str, null);
        localObject1 = localObject3;
        if (!QLog.isColorLevel()) {
          break;
        }
        QLog.i("PicBrowser", 2, "PicBrowserGalleryAdapter getView loadingDrawble is: " + str);
        localObject1 = localObject3;
        break;
      }
      localObject1 = URLDrawableHelper.e;
      break;
      label405:
      bool1 = false;
      localObject1 = localURLDrawable;
      break label243;
      Object localObject2 = localURL;
      if (!TextUtils.isEmpty(this.jdField_a_of_type_ComTencentMobileqqNearbyPicbrowserPicInfo.a))
      {
        localObject1 = localFile;
        try
        {
          localObject2 = NearbyImgDownloader.a(this.jdField_a_of_type_ComTencentMobileqqNearbyPicbrowserPicInfo.a);
          localObject1 = localFile;
          this.jdField_a_of_type_ComTencentMobileqqNearbyPicbrowserPicInfo.a = ((URL)localObject2).toString();
          localObject1 = localFile;
          localObject2 = URLDrawable.getDrawable((URL)localObject2, (URLDrawable.URLDrawableOptions)localObject3);
          localObject1 = localObject2;
          ((URLDrawable)localObject2).setDownloadListener(new ImgDownloadListener(this.jdField_a_of_type_AndroidContentContext, "actNearbyPicBrowser"));
          localObject1 = localObject2;
          localURLImageView.setImageDrawable((Drawable)localObject2);
          localObject1 = localObject2;
          bool1 = AbsDownloader.a(this.jdField_a_of_type_ComTencentMobileqqNearbyPicbrowserPicInfo.a);
          localObject1 = localObject2;
        }
        catch (MalformedURLException localMalformedURLException2)
        {
          localObject2 = localObject1;
          if (QLog.isDevelopLevel())
          {
            localMalformedURLException2.printStackTrace();
            localObject2 = localObject1;
          }
        }
      }
      bool1 = false;
      localObject1 = localObject2;
      break label243;
      label583:
      l = 300L;
      break label300;
      label591:
      if (localObject1 != null) {
        break label607;
      }
      paramOnLoadListener.a(paramInt, false);
    }
    label607:
    if (((URLDrawable)localObject1).getStatus() == 1) {}
    for (boolean bool1 = bool2;; bool1 = false)
    {
      paramOnLoadListener.a(paramInt, bool1);
      break;
    }
  }
  
  public void a()
  {
    Object localObject;
    if (this.jdField_a_of_type_ComTencentMobileqqNearbyPicbrowserPicInfo != null) {
      localObject = this.jdField_a_of_type_ComTencentMobileqqNearbyPicbrowserPicInfo.a;
    }
    try
    {
      localObject = NearbyImgDownloader.a((String)localObject);
      if (localObject != null)
      {
        localObject = URLDrawable.getDrawable((URL)localObject, null);
        ((URLDrawable)localObject).setDownloadListener(new ImgDownloadListener(this.jdField_a_of_type_AndroidContentContext));
        ThreadManager.a(new tla(this, (URLDrawable)localObject), null, true);
      }
      return;
    }
    catch (Exception localException) {}
  }
  
  public void a(View paramView, int paramInt, PicBrowserImage.OnLoadListener paramOnLoadListener)
  {
    paramView = (URLImageView)paramView;
    URLDrawable localURLDrawable = (URLDrawable)paramView.getDrawable();
    if (localURLDrawable == null) {
      return;
    }
    if ((localURLDrawable.getStatus() != 1) && (localURLDrawable.getStatus() != 2))
    {
      int i = localURLDrawable.getProgress();
      if (i > 0) {
        paramOnLoadListener.b(paramInt, i / 100);
      }
      paramView.setMinimumHeight(10);
      paramView.setMinimumWidth(10);
      return;
    }
    if (localURLDrawable.getStatus() == 1) {}
    for (boolean bool = true;; bool = false)
    {
      paramOnLoadListener.a(paramInt, bool);
      break;
    }
  }
  
  public void a(boolean paramBoolean) {}
  
  public Drawable c()
  {
    if (this.jdField_a_of_type_ComTencentMobileqqNearbyPicbrowserPicInfo == null) {
      return null;
    }
    Object localObject1 = URLDrawable.URLDrawableOptions.obtain();
    ((URLDrawable.URLDrawableOptions)localObject1).mFailedDrawable = URLDrawableHelper.e;
    ((URLDrawable.URLDrawableOptions)localObject1).mLoadingDrawable = URLDrawableHelper.e;
    if (!TextUtils.isEmpty(this.jdField_a_of_type_ComTencentMobileqqNearbyPicbrowserPicInfo.c)) {}
    for (;;)
    {
      Object localObject4;
      Object localObject2;
      try
      {
        localObject1 = URLDrawable.getDrawable(new File(this.jdField_a_of_type_ComTencentMobileqqNearbyPicbrowserPicInfo.c).toURL(), (URLDrawable.URLDrawableOptions)localObject1);
        localObject4 = b();
        if ((localObject1 == null) || (localObject4 == null)) {
          break;
        }
        this.h = a((Rect)localObject4, (Drawable)localObject1);
        if (QLog.isColorLevel()) {
          QLog.d("PicBrowser", 2, "getAnimationDrawable ,cutValue = " + this.h);
        }
        return (Drawable)localObject1;
      }
      catch (MalformedURLException localMalformedURLException1)
      {
        if (QLog.isDevelopLevel()) {
          localMalformedURLException1.printStackTrace();
        }
        localObject2 = null;
        continue;
      }
      if (!TextUtils.isEmpty(this.jdField_a_of_type_ComTencentMobileqqNearbyPicbrowserPicInfo.b)) {
        try
        {
          localObject4 = new URL(this.jdField_a_of_type_ComTencentMobileqqNearbyPicbrowserPicInfo.b);
          localObject4 = new URL("nearbyimage", ((URL)localObject4).getAuthority(), ((URL)localObject4).getFile());
          if (AbsDownloader.a(((URL)localObject4).toString()))
          {
            localObject2 = URLDrawable.getDrawable((URL)localObject4, (URLDrawable.URLDrawableOptions)localObject2);
            continue;
          }
          localObject4 = new URL(this.jdField_a_of_type_ComTencentMobileqqNearbyPicbrowserPicInfo.a);
          localObject2 = URLDrawable.getDrawable(new URL("nearbyimage", ((URL)localObject4).getAuthority(), ((URL)localObject4).getFile()), (URLDrawable.URLDrawableOptions)localObject2);
        }
        catch (MalformedURLException localMalformedURLException2)
        {
          if (QLog.isDevelopLevel()) {
            localMalformedURLException2.printStackTrace();
          }
        }
      } else {
        Object localObject3 = null;
      }
    }
  }
  
  public void c() {}
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\com\tencent\mobileqq\nearby\picbrowser\PicBrowserImage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */