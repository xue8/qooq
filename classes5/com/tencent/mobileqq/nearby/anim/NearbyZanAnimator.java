package com.tencent.mobileqq.nearby.anim;

import android.graphics.Path;
import android.view.View;
import com.tencent.mobileqq.hotchat.anim.HeartAnimator;
import com.tencent.mobileqq.hotchat.anim.HeartAnimator.Config;
import com.tencent.mobileqq.hotchat.anim.HeartLayout;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class NearbyZanAnimator
  extends HeartAnimator
{
  public NearbyZanAnimator(HeartLayout paramHeartLayout)
  {
    super(paramHeartLayout);
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public Path a(int paramInt1, int paramInt2, AtomicInteger paramAtomicInteger, View paramView)
  {
    Random localRandom = this.jdField_a_of_type_JavaUtilRandom;
    Path localPath = new Path();
    label95:
    label107:
    int i;
    int j;
    int k;
    int m;
    if (!this.jdField_a_of_type_ComTencentMobileqqHotchatAnimHeartAnimator$Config.jdField_a_of_type_Boolean) {
      if ((paramInt1 < 0) || (paramInt1 > paramView.getWidth()))
      {
        this.jdField_a_of_type_ComTencentMobileqqHotchatAnimHeartAnimator$Config.jdField_a_of_type_Int = ((paramView.getWidth() - (int)(20.0F * this.jdField_a_of_type_ComTencentMobileqqHotchatAnimHeartAnimator$Config.jdField_a_of_type_Float)) / 2);
        if ((paramInt2 >= 0) && (paramInt2 <= paramView.getHeight())) {
          break label415;
        }
        this.jdField_a_of_type_ComTencentMobileqqHotchatAnimHeartAnimator$Config.b = ((int)(20.0F * this.jdField_a_of_type_ComTencentMobileqqHotchatAnimHeartAnimator$Config.jdField_a_of_type_Float));
        if (!this.jdField_a_of_type_JavaUtilRandom.nextBoolean()) {
          break label447;
        }
        paramInt1 = 1;
        i = paramInt1 * (localRandom.nextInt(this.jdField_a_of_type_ComTencentMobileqqHotchatAnimHeartAnimator$Config.c) + this.jdField_a_of_type_ComTencentMobileqqHotchatAnimHeartAnimator$Config.d);
        j = paramInt1 * (localRandom.nextInt(this.jdField_a_of_type_ComTencentMobileqqHotchatAnimHeartAnimator$Config.c) + this.jdField_a_of_type_ComTencentMobileqqHotchatAnimHeartAnimator$Config.d);
        k = paramView.getHeight() - this.jdField_a_of_type_ComTencentMobileqqHotchatAnimHeartAnimator$Config.b;
        paramInt1 = (int)(paramAtomicInteger.intValue() * 4 * this.jdField_a_of_type_ComTencentMobileqqHotchatAnimHeartAnimator$Config.jdField_a_of_type_Float);
        paramInt2 = this.jdField_a_of_type_ComTencentMobileqqHotchatAnimHeartAnimator$Config.g;
        paramInt2 = localRandom.nextInt(this.jdField_a_of_type_ComTencentMobileqqHotchatAnimHeartAnimator$Config.f) + (paramInt1 + paramInt2);
        m = paramInt2 / this.jdField_a_of_type_ComTencentMobileqqHotchatAnimHeartAnimator$Config.e;
        paramInt1 = k - paramInt2;
        if (paramInt1 >= 0) {
          break label666;
        }
        paramInt1 = 0;
      }
    }
    label415:
    label447:
    label653:
    label666:
    for (;;)
    {
      paramInt2 = k - paramInt2 / 2;
      if (paramInt2 < 0) {
        paramInt2 = 0;
      }
      for (;;)
      {
        localPath.moveTo(this.jdField_a_of_type_ComTencentMobileqqHotchatAnimHeartAnimator$Config.jdField_a_of_type_Int, k);
        localPath.cubicTo(this.jdField_a_of_type_ComTencentMobileqqHotchatAnimHeartAnimator$Config.jdField_a_of_type_Int, k - m, this.jdField_a_of_type_ComTencentMobileqqHotchatAnimHeartAnimator$Config.jdField_a_of_type_Int + i, paramInt2 + m, this.jdField_a_of_type_ComTencentMobileqqHotchatAnimHeartAnimator$Config.jdField_a_of_type_Int + i, paramInt2);
        localPath.moveTo(this.jdField_a_of_type_ComTencentMobileqqHotchatAnimHeartAnimator$Config.jdField_a_of_type_Int + i, paramInt2);
        if (paramInt2 - m >= 0) {
          localPath.cubicTo(this.jdField_a_of_type_ComTencentMobileqqHotchatAnimHeartAnimator$Config.jdField_a_of_type_Int + i, paramInt2 - m, this.jdField_a_of_type_ComTencentMobileqqHotchatAnimHeartAnimator$Config.jdField_a_of_type_Int + j, paramInt1 + m, this.jdField_a_of_type_ComTencentMobileqqHotchatAnimHeartAnimator$Config.jdField_a_of_type_Int + j, paramInt1);
        }
        return localPath;
        this.jdField_a_of_type_ComTencentMobileqqHotchatAnimHeartAnimator$Config.jdField_a_of_type_Int = (paramInt1 - (int)(20.0F * this.jdField_a_of_type_ComTencentMobileqqHotchatAnimHeartAnimator$Config.jdField_a_of_type_Float / 3.0F));
        break;
        this.jdField_a_of_type_ComTencentMobileqqHotchatAnimHeartAnimator$Config.b = (paramView.getHeight() - paramInt2 + (int)(20.0F * this.jdField_a_of_type_ComTencentMobileqqHotchatAnimHeartAnimator$Config.jdField_a_of_type_Float / 3.0F));
        break label95;
        paramInt1 = -1;
        break label107;
        k = this.jdField_a_of_type_ComTencentMobileqqHotchatAnimHeartAnimator$Config.n;
        m = this.jdField_a_of_type_ComTencentMobileqqHotchatAnimHeartAnimator$Config.m;
        int n = this.jdField_a_of_type_ComTencentMobileqqHotchatAnimHeartAnimator$Config.h / 2;
        int i1;
        int i2;
        int i3;
        int i4;
        if (this.jdField_a_of_type_JavaUtilRandom.nextBoolean())
        {
          i = 1;
          i1 = localRandom.nextInt(this.jdField_a_of_type_ComTencentMobileqqHotchatAnimHeartAnimator$Config.c);
          i2 = this.jdField_a_of_type_ComTencentMobileqqHotchatAnimHeartAnimator$Config.d;
          i3 = localRandom.nextInt(this.jdField_a_of_type_ComTencentMobileqqHotchatAnimHeartAnimator$Config.c);
          i4 = this.jdField_a_of_type_ComTencentMobileqqHotchatAnimHeartAnimator$Config.d;
          j = Math.abs(k - paramInt2) / (this.jdField_a_of_type_JavaUtilRandom.nextInt(3) + 2);
          if (k <= paramInt2) {
            break label653;
          }
          j = k - j;
        }
        for (;;)
        {
          localPath.moveTo(paramInt1 - this.jdField_a_of_type_ComTencentMobileqqHotchatAnimHeartAnimator$Config.h / 2, paramInt2 - this.jdField_a_of_type_ComTencentMobileqqHotchatAnimHeartAnimator$Config.j / 2);
          localPath.cubicTo(i * (i1 + i2) + paramInt1, j, paramInt1 - i * (i3 + i4), j, m - n, k);
          return localPath;
          i = -1;
          break;
          j += k;
        }
      }
    }
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\com\tencent\mobileqq\nearby\anim\NearbyZanAnimator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */