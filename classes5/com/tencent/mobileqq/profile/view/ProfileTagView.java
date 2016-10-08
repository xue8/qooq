package com.tencent.mobileqq.profile.view;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mobileqq.activity.FriendProfileCardActivity;
import com.tencent.mobileqq.activity.ProfileActivity.AllInOne;
import com.tencent.mobileqq.app.BaseActivity;
import com.tencent.mobileqq.app.CardHandler;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.ThreadManager;
import com.tencent.mobileqq.data.Card;
import com.tencent.mobileqq.hotchat.anim.HeartLayout;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.profile.DataTag;
import com.tencent.mobileqq.profile.ProfileCardInfo;
import com.tencent.mobileqq.profile.view.helper.HeartRiseLayerDrawable;
import com.tencent.mobileqq.statistics.ReportController;
import com.tencent.mobileqq.utils.ValueAnimation;
import com.tencent.mobileqq.utils.drag_n_drop.DragAndDropDetector;
import com.tencent.mobileqq.utils.drag_n_drop.DragAndDropDetector.DragSource;
import com.tencent.mobileqq.utils.drag_n_drop.DragAndDropDetector.Draggable;
import com.tencent.mobileqq.utils.drag_n_drop.DragAndDropDetector.DropTarget;
import com.tencent.mobileqq.widget.MusicPendantView;
import com.tencent.mobileqq.widget.RatioLayout;
import com.tencent.mobileqq.widget.RatioLayout.LayoutParams;
import com.tencent.mobileqq.widget.VoteView;
import com.tencent.qphone.base.util.QLog;
import java.util.HashMap;
import twv;
import tww;
import twx;
import twy;
import twz;
import txb;
import txc;
import txd;
import txe;
import txf;
import txg;
import txh;

public class ProfileTagView
  extends ProfileHeaderView
  implements Animation.AnimationListener, DragAndDropDetector.DragSource
{
  private static final String C = "%s-%d";
  private static final int[] jdField_a_of_type_ArrayOfInt = { 3, 1, 0, 5, 4, 2, 6 };
  private static PointF[] jdField_a_of_type_ArrayOfAndroidGraphicsPointF;
  private static String jdField_c_of_type_JavaLangString;
  public static final float d = 120.0F;
  public static final int l = 300;
  private SharedPreferences jdField_a_of_type_AndroidContentSharedPreferences;
  private PointF jdField_a_of_type_AndroidGraphicsPointF;
  private Drawable jdField_a_of_type_AndroidGraphicsDrawableDrawable;
  private GestureDetector jdField_a_of_type_AndroidViewGestureDetector;
  private View jdField_a_of_type_AndroidViewView;
  public ImageView a;
  public TextView a;
  private BreatheEffectView jdField_a_of_type_ComTencentMobileqqProfileViewBreatheEffectView;
  private HeartRiseLayerDrawable jdField_a_of_type_ComTencentMobileqqProfileViewHelperHeartRiseLayerDrawable;
  private ValueAnimation jdField_a_of_type_ComTencentMobileqqUtilsValueAnimation;
  private DragAndDropDetector jdField_a_of_type_ComTencentMobileqqUtilsDrag_n_dropDragAndDropDetector;
  private RatioLayout jdField_a_of_type_ComTencentMobileqqWidgetRatioLayout;
  private View[] jdField_a_of_type_ArrayOfAndroidViewView = new View[jdField_a_of_type_ArrayOfAndroidGraphicsPointF.length];
  private ValueAnimation[] jdField_a_of_type_ArrayOfComTencentMobileqqUtilsValueAnimation = new ValueAnimation[jdField_a_of_type_ArrayOfAndroidGraphicsPointF.length];
  private PointF jdField_b_of_type_AndroidGraphicsPointF;
  private Drawable jdField_b_of_type_AndroidGraphicsDrawableDrawable;
  private ImageView jdField_b_of_type_AndroidWidgetImageView;
  public TextView b;
  private ValueAnimation jdField_b_of_type_ComTencentMobileqqUtilsValueAnimation;
  public boolean b;
  private int[] jdField_b_of_type_ArrayOfInt = new int[2];
  private ValueAnimation[] jdField_b_of_type_ArrayOfComTencentMobileqqUtilsValueAnimation = new ValueAnimation[jdField_a_of_type_ArrayOfAndroidGraphicsPointF.length];
  private TextView jdField_c_of_type_AndroidWidgetTextView;
  private boolean jdField_c_of_type_Boolean;
  private int[] jdField_c_of_type_ArrayOfInt = new int[2];
  private TextView jdField_d_of_type_AndroidWidgetTextView;
  private boolean jdField_d_of_type_Boolean;
  private TextView jdField_e_of_type_AndroidWidgetTextView;
  private boolean jdField_e_of_type_Boolean;
  private boolean f;
  private int m;
  private int n;
  private int o;
  private final int p;
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    jdField_c_of_type_JavaLangString = "ProfileTagView";
    jdField_a_of_type_ArrayOfAndroidGraphicsPointF = new PointF[] { new PointF(0.126562F, 0.478873F), new PointF(0.220312F, 0.242077F), new PointF(0.559375F, 0.206866F), new PointF(0.85F, 0.279049F), new PointF(0.889062F, 0.440141F), new PointF(0.815625F, 0.61F), new PointF(0.521875F, 0.75F), new PointF(0.18125F, 0.705F) };
  }
  
  public ProfileTagView(BaseActivity paramBaseActivity, ProfileCardInfo paramProfileCardInfo)
  {
    super(paramBaseActivity, paramProfileCardInfo);
    this.jdField_b_of_type_Boolean = true;
    this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity = paramBaseActivity;
    this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface = paramBaseActivity.app;
    this.jdField_a_of_type_ComTencentMobileqqProfileProfileCardInfo = paramProfileCardInfo;
    this.p = paramBaseActivity.getResources().getDimensionPixelSize(2131493389);
    a(paramProfileCardInfo);
    b(paramProfileCardInfo);
  }
  
  private void a(int paramInt)
  {
    int j = -1;
    this.m = paramInt;
    TextView localTextView = this.jdField_c_of_type_AndroidWidgetTextView;
    int i;
    if (2 == paramInt)
    {
      i = -1;
      localTextView.setTextColor(i);
      localTextView = this.jdField_d_of_type_AndroidWidgetTextView;
      if (2 != paramInt) {
        break label67;
      }
      i = -1;
      label37:
      localTextView.setTextColor(i);
      localTextView = this.jdField_e_of_type_AndroidWidgetTextView;
      if (2 != paramInt) {
        break label73;
      }
    }
    label67:
    label73:
    for (paramInt = j;; paramInt = -16777216)
    {
      localTextView.setTextColor(paramInt);
      return;
      i = -16777216;
      break;
      i = -16777216;
      break label37;
    }
  }
  
  private void a(VipTagView paramVipTagView)
  {
    ScaleAnimation localScaleAnimation = new ScaleAnimation(1.0F, 0.2F, 1.0F, 0.2F, 1, 0.5F, 1, 0.5F);
    localScaleAnimation.setDuration(150L);
    localScaleAnimation.setRepeatMode(2);
    localScaleAnimation.setRepeatCount(1);
    localScaleAnimation.setAnimationListener(new txe(this, paramVipTagView));
    paramVipTagView.startAnimation(localScaleAnimation);
  }
  
  private void a(VipTagView paramVipTagView, long paramLong)
  {
    Object localObject = String.format("%s-%d", new Object[] { this.jdField_a_of_type_ComTencentMobileqqProfileProfileCardInfo.jdField_a_of_type_ComTencentMobileqqDataCard.uin, Long.valueOf(paramLong) });
    if (!this.jdField_a_of_type_AndroidContentSharedPreferences.getBoolean((String)localObject, false))
    {
      ReportController.b(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, "CliOper", "", "", "card_mall", "0X80047EF", 0, 0, Long.toString(paramLong), "", "", "");
      if (QLog.isColorLevel()) {
        QLog.d(jdField_c_of_type_JavaLangString, 2, "appreciate the label");
      }
      this.jdField_a_of_type_AndroidContentSharedPreferences.edit().putBoolean((String)localObject, true).commit();
      localObject = (CardHandler)this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a(2);
      if (localObject == null) {
        return;
      }
      ((CardHandler)localObject).a(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a(), this.jdField_a_of_type_ComTencentMobileqqProfileProfileCardInfo.jdField_a_of_type_ComTencentMobileqqDataCard.uin, Long.valueOf(paramLong));
      if (QLog.isColorLevel()) {
        QLog.d(jdField_c_of_type_JavaLangString, 2, "submit the network params ：srcUin = " + this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() + "destUin  = " + this.jdField_a_of_type_ComTencentMobileqqProfileProfileCardInfo.jdField_a_of_type_ComTencentMobileqqDataCard.uin + " labelId  = " + paramLong);
      }
      paramVipTagView.a();
      return;
    }
    if (QLog.isColorLevel()) {
      QLog.d(jdField_c_of_type_JavaLangString, 2, "the label has appreciated");
    }
    paramVipTagView.setShakingState(true);
  }
  
  private void a(VipTagView paramVipTagView, boolean paramBoolean)
  {
    Object localObject1 = (RatioLayout.LayoutParams)paramVipTagView.getLayoutParams();
    if (localObject1 == null) {}
    Object localObject2;
    do
    {
      return;
      localObject2 = paramVipTagView.getTag(2131296456);
    } while (localObject2 == null);
    int i = ((Integer)localObject2).intValue();
    float f1 = jdField_a_of_type_ArrayOfAndroidGraphicsPointF[i].x;
    float f2 = jdField_a_of_type_ArrayOfAndroidGraphicsPointF[i].y;
    float f3 = (paramVipTagView.getLeft() + paramVipTagView.getWidth() * ((RatioLayout.LayoutParams)localObject1).c) / this.jdField_a_of_type_ComTencentMobileqqWidgetRatioLayout.getWidth();
    float f4 = paramVipTagView.getTop();
    float f5 = paramVipTagView.getHeight();
    localObject1 = new ValueAnimation(new PointF(f3, (((RatioLayout.LayoutParams)localObject1).d * f5 + f4) / this.jdField_a_of_type_ComTencentMobileqqWidgetRatioLayout.getHeight()), new PointF(f1, f2), new txf(this, paramVipTagView));
    ((ValueAnimation)localObject1).setDuration(400L);
    ((ValueAnimation)localObject1).setAnimationListener(new txg(this, paramBoolean, paramVipTagView));
    paramVipTagView.startAnimation((Animation)localObject1);
  }
  
  private boolean a()
  {
    if (this.jdField_d_of_type_Boolean) {
      return false;
    }
    this.jdField_d_of_type_Boolean = true;
    Object localObject;
    if (this.jdField_c_of_type_Boolean) {
      if (this.jdField_a_of_type_ComTencentMobileqqUtilsValueAnimation == null)
      {
        this.jdField_a_of_type_ComTencentMobileqqUtilsValueAnimation = new ValueAnimation(Integer.valueOf(this.jdField_a_of_type_ComTencentMobileqqWidgetRatioLayout.getHeight()), Integer.valueOf(getResources().getDimensionPixelSize(2131493373)), null);
        localObject = this.jdField_a_of_type_ComTencentMobileqqUtilsValueAnimation;
        label68:
        if (this.jdField_c_of_type_Boolean) {
          break label293;
        }
      }
    }
    label293:
    for (boolean bool = true;; bool = false)
    {
      this.jdField_c_of_type_Boolean = bool;
      if (localObject != null)
      {
        ((ValueAnimation)localObject).setDuration(500L);
        ((ValueAnimation)localObject).setInterpolator(new AccelerateDecelerateInterpolator());
        ((ValueAnimation)localObject).setAnimationListener(this);
        ((ValueAnimation)localObject).a(new txc(this));
        this.jdField_a_of_type_ComTencentMobileqqWidgetRatioLayout.startAnimation((Animation)localObject);
      }
      return true;
      this.jdField_a_of_type_ComTencentMobileqqWidgetRatioLayout.startAnimation(this.jdField_a_of_type_ComTencentMobileqqUtilsValueAnimation);
      localObject = null;
      break label68;
      ((FriendProfileCardActivity)this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity).s();
      if (this.n == 0)
      {
        localObject = this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity.findViewById(16908290);
        if (localObject == null) {
          break;
        }
        this.n = ((View)localObject).getHeight();
        localObject = this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity.findViewById(2131301066);
        if (localObject != null) {
          this.n -= ((View)localObject).getHeight();
        }
      }
      if (Build.VERSION.SDK_INT < 11) {
        ((FriendProfileCardActivity)this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity).q();
      }
      if (this.jdField_b_of_type_ComTencentMobileqqUtilsValueAnimation == null)
      {
        this.jdField_b_of_type_ComTencentMobileqqUtilsValueAnimation = new ValueAnimation(Integer.valueOf(this.jdField_a_of_type_ComTencentMobileqqWidgetRatioLayout.getHeight()), Integer.valueOf(this.n), null);
        localObject = this.jdField_b_of_type_ComTencentMobileqqUtilsValueAnimation;
        break label68;
      }
      this.jdField_a_of_type_ComTencentMobileqqWidgetRatioLayout.startAnimation(this.jdField_b_of_type_ComTencentMobileqqUtilsValueAnimation);
      localObject = null;
      break label68;
    }
  }
  
  private boolean a(VipTagView paramVipTagView)
  {
    if (paramVipTagView.getTag(2131296459) == null) {
      return false;
    }
    long l1 = ((Long)paramVipTagView.getTag(2131296459)).longValue();
    if ((this.jdField_a_of_type_ComTencentMobileqqProfileProfileCardInfo != null) && (this.jdField_a_of_type_ComTencentMobileqqProfileProfileCardInfo.jdField_a_of_type_ComTencentMobileqqDataCard != null) && (!TextUtils.isEmpty(this.jdField_a_of_type_ComTencentMobileqqProfileProfileCardInfo.jdField_a_of_type_ComTencentMobileqqDataCard.uin)))
    {
      paramVipTagView = String.format("%s-%d", new Object[] { this.jdField_a_of_type_ComTencentMobileqqProfileProfileCardInfo.jdField_a_of_type_ComTencentMobileqqDataCard.uin, Long.valueOf(l1) });
      return this.jdField_a_of_type_AndroidContentSharedPreferences.getBoolean(paramVipTagView, false);
    }
    return false;
  }
  
  private boolean b()
  {
    boolean bool = false;
    if (this.jdField_e_of_type_Boolean)
    {
      this.jdField_e_of_type_Boolean = false;
      p(this.jdField_a_of_type_ComTencentMobileqqProfileProfileCardInfo);
      bool = true;
    }
    return bool;
  }
  
  private void g()
  {
    this.jdField_a_of_type_ComTencentMobileqqProfileViewBreatheEffectView = ((BreatheEffectView)findViewById(2131303319));
    Object localObject1 = (ImageView)findViewById(2131303353);
    this.jdField_a_of_type_ComTencentMobileqqProfileViewHelperHeartRiseLayerDrawable = new HeartRiseLayerDrawable(5, getResources());
    ((ImageView)localObject1).setImageDrawable(this.jdField_a_of_type_ComTencentMobileqqProfileViewHelperHeartRiseLayerDrawable);
    this.jdField_c_of_type_AndroidWidgetTextView = ((TextView)findViewById(2131303354));
    localObject1 = findViewById(2131303352);
    Object localObject2 = (RatioLayout.LayoutParams)((View)localObject1).getLayoutParams();
    ((RatioLayout.LayoutParams)localObject2).a = 0.5F;
    ((RatioLayout.LayoutParams)localObject2).b = 0.5F;
    ((RatioLayout.LayoutParams)localObject2).c = 0.5F;
    ((RatioLayout.LayoutParams)localObject2).d = 0.5F;
    ((View)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
    localObject1 = (RatioLayout.LayoutParams)this.jdField_c_of_type_AndroidWidgetTextView.getLayoutParams();
    localObject2 = jdField_a_of_type_ArrayOfAndroidGraphicsPointF[(jdField_a_of_type_ArrayOfAndroidGraphicsPointF.length - 1)];
    ((RatioLayout.LayoutParams)localObject1).a = (((PointF)localObject2).x + 0.07F);
    ((RatioLayout.LayoutParams)localObject1).b = ((PointF)localObject2).y;
    ((RatioLayout.LayoutParams)localObject1).c = 0.0F;
    ((RatioLayout.LayoutParams)localObject1).d = 0.5F;
    this.jdField_c_of_type_AndroidWidgetTextView.setLayoutParams((ViewGroup.LayoutParams)localObject1);
    this.jdField_a_of_type_ComTencentMobileqqUtilsDrag_n_dropDragAndDropDetector = new DragAndDropDetector(this, this.jdField_a_of_type_ComTencentMobileqqProfileViewBreatheEffectView, true);
    this.jdField_a_of_type_AndroidViewGestureDetector = new GestureDetector(getContext(), new twv(this));
  }
  
  public DragAndDropDetector.Draggable a(float paramFloat1, float paramFloat2)
  {
    int[] arrayOfInt = new int[2];
    View[] arrayOfView = this.jdField_a_of_type_ArrayOfAndroidViewView;
    int j = arrayOfView.length;
    int i = 0;
    while (i < j)
    {
      View localView = arrayOfView[i];
      if (((localView instanceof DragAndDropDetector.Draggable)) && (localView.getVisibility() == 0))
      {
        localView.getLocationOnScreen(arrayOfInt);
        int k = arrayOfInt[0];
        int i1 = localView.getWidth();
        int i2 = arrayOfInt[1];
        int i3 = localView.getHeight();
        if ((paramFloat1 >= arrayOfInt[0]) && (paramFloat1 <= k + i1) && (paramFloat2 >= arrayOfInt[1]) && (paramFloat2 <= i2 + i3)) {
          return (DragAndDropDetector.Draggable)localView;
        }
      }
      i += 1;
    }
    return null;
  }
  
  public void a()
  {
    super.a();
    if (this.jdField_a_of_type_ComTencentMobileqqProfileProfileCardInfo != null)
    {
      super.q(this.jdField_a_of_type_ComTencentMobileqqProfileProfileCardInfo);
      if ((this.jdField_a_of_type_ComTencentMobileqqProfileProfileCardInfo.jdField_a_of_type_ComTencentMobileqqActivityProfileActivity$AllInOne.a == 0) && (this.jdField_a_of_type_ComTencentMobileqqProfileProfileCardInfo.jdField_a_of_type_ComTencentMobileqqDataCard != null) && (this.m != (int)this.jdField_a_of_type_ComTencentMobileqqProfileProfileCardInfo.jdField_a_of_type_ComTencentMobileqqDataCard.backgroundColor)) {
        a((int)this.jdField_a_of_type_ComTencentMobileqqProfileProfileCardInfo.jdField_a_of_type_ComTencentMobileqqDataCard.backgroundColor);
      }
    }
  }
  
  public void a(ProfileCardInfo paramProfileCardInfo)
  {
    if (QLog.isColorLevel()) {
      QLog.d("Q.profilecard.FrdProfileCard", 2, "checkTemplateValid");
    }
    super.a(paramProfileCardInfo, new HashMap());
  }
  
  public void a(ProfileCardInfo paramProfileCardInfo, boolean paramBoolean)
  {
    super.a(paramProfileCardInfo.jdField_a_of_type_ComTencentMobileqqActivityProfileActivity$AllInOne);
    super.d(paramProfileCardInfo);
    super.i(paramProfileCardInfo);
    super.j(paramProfileCardInfo);
    super.m(paramProfileCardInfo);
    if (this.jdField_d_of_type_Boolean) {
      this.jdField_e_of_type_Boolean = true;
    }
    for (;;)
    {
      super.q(paramProfileCardInfo);
      return;
      p(paramProfileCardInfo);
    }
  }
  
  public void a(DragAndDropDetector.Draggable paramDraggable, float paramFloat1, float paramFloat2)
  {
    paramDraggable = (View)paramDraggable;
    this.jdField_a_of_type_ComTencentMobileqqWidgetRatioLayout.a(paramDraggable, (int)paramFloat1 - this.jdField_b_of_type_ArrayOfInt[0], (int)paramFloat2 - this.jdField_b_of_type_ArrayOfInt[1]);
  }
  
  public void a(DragAndDropDetector.DropTarget paramDropTarget, DragAndDropDetector.Draggable paramDraggable, float paramFloat1, float paramFloat2)
  {
    this.jdField_a_of_type_ComTencentMobileqqProfileViewBreatheEffectView.a(null);
    if (paramDropTarget != null)
    {
      ((VipTagView)paramDraggable).setTag(2131296458, Boolean.valueOf(true));
      a((VipTagView)paramDraggable);
      if ((!a((VipTagView)paramDraggable)) && (this.jdField_a_of_type_ComTencentMobileqqProfileProfileCardInfo.jdField_a_of_type_ComTencentMobileqqActivityProfileActivity$AllInOne.a != 0))
      {
        int i = getResources().getDimensionPixelSize(2131493386);
        this.jdField_a_of_type_ComTencentMobileqqProfileViewHelperHeartRiseLayerDrawable.a(getHandler(), 900, i);
      }
      return;
    }
    a((VipTagView)paramDraggable, false);
  }
  
  public boolean a(View paramView, MotionEvent paramMotionEvent)
  {
    if (this.jdField_c_of_type_Boolean)
    {
      if (((this.jdField_a_of_type_ComTencentMobileqqUtilsDrag_n_dropDragAndDropDetector == null) || (!this.jdField_a_of_type_ComTencentMobileqqUtilsDrag_n_dropDragAndDropDetector.a(paramMotionEvent))) && (this.jdField_a_of_type_AndroidViewGestureDetector != null) && (!this.jdField_a_of_type_AndroidViewGestureDetector.onTouchEvent(paramMotionEvent))) {
        dispatchTouchEvent(paramMotionEvent);
      }
      return true;
    }
    if (this.jdField_a_of_type_AndroidViewGestureDetector != null)
    {
      this.jdField_a_of_type_ComTencentMobileqqWidgetRatioLayout.getLocationInWindow(this.jdField_c_of_type_ArrayOfInt);
      if (this.jdField_c_of_type_ArrayOfInt[1] - this.jdField_b_of_type_ArrayOfInt[1] == 0) {
        return this.jdField_a_of_type_AndroidViewGestureDetector.onTouchEvent(paramMotionEvent);
      }
    }
    return super.a(paramView, paramMotionEvent);
  }
  
  public boolean a(DragAndDropDetector.Draggable paramDraggable, float paramFloat1, float paramFloat2)
  {
    if (((VipTagView)paramDraggable).a())
    {
      a(paramDraggable, paramFloat1, paramFloat2);
      this.jdField_a_of_type_ComTencentMobileqqProfileViewBreatheEffectView.a();
      return true;
    }
    return false;
  }
  
  public void b()
  {
    this.o = 0;
    View[] arrayOfView = this.jdField_a_of_type_ArrayOfAndroidViewView;
    int k = arrayOfView.length;
    int j = 0;
    int i = 0;
    if (j < k)
    {
      View localView = arrayOfView[j];
      Object localObject1;
      if ((localView != null) && (localView.getVisibility() != 8))
      {
        localObject1 = (Integer)localView.getTag(2131296456);
        if (localObject1 != null) {}
      }
      for (;;)
      {
        j += 1;
        break;
        PointF localPointF = jdField_a_of_type_ArrayOfAndroidGraphicsPointF[localObject1.intValue()];
        this.o += 1;
        Object localObject2 = this.jdField_a_of_type_ArrayOfComTencentMobileqqUtilsValueAnimation[i];
        localObject1 = localObject2;
        if (localObject2 == null)
        {
          localObject2 = this.jdField_a_of_type_ArrayOfComTencentMobileqqUtilsValueAnimation;
          localObject1 = new ValueAnimation(Float.valueOf(0.0F), Float.valueOf(1.0F), new txh(this, localView, localPointF), true, true);
          localObject2[i] = localObject1;
          ((ValueAnimation)localObject1).setInterpolator(new DecelerateInterpolator());
          ((ValueAnimation)localObject1).setAnimationListener(new tww(this, localView, localPointF));
          ((ValueAnimation)localObject1).setDuration(600L);
        }
        localView.startAnimation((Animation)localObject1);
        localView.setVisibility(0);
        i += 1;
      }
    }
    if (this.o == 0)
    {
      this.jdField_d_of_type_Boolean = false;
      if (this.jdField_b_of_type_Boolean)
      {
        h(this.jdField_a_of_type_ComTencentMobileqqProfileProfileCardInfo);
        this.jdField_b_of_type_Boolean = false;
      }
    }
  }
  
  public void b(ProfileCardInfo paramProfileCardInfo)
  {
    Object localObject = getContext();
    this.jdField_a_of_type_AndroidContentSharedPreferences = this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity.getSharedPreferences(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a(), 0);
    LayoutInflater.from((Context)localObject).inflate(2130904613, this, true);
    this.jdField_b_of_type_AndroidWidgetImageView = ((ImageView)findViewById(2131302629));
    this.jdField_a_of_type_JavaUtilHashMap.put("map_key_face", this.jdField_b_of_type_AndroidWidgetImageView);
    super.a(paramProfileCardInfo.jdField_a_of_type_ComTencentMobileqqActivityProfileActivity$AllInOne);
    localObject = new DataTag(1, null);
    this.jdField_b_of_type_AndroidWidgetImageView.setTag(localObject);
    this.jdField_b_of_type_AndroidWidgetImageView.setOnClickListener(paramProfileCardInfo.jdField_a_of_type_AndroidViewView$OnClickListener);
    this.jdField_a_of_type_AndroidWidgetImageView = ((ImageView)findViewById(2131298362));
    this.jdField_a_of_type_AndroidWidgetImageView.setVisibility(4);
    this.jdField_a_of_type_AndroidWidgetImageView.setOnClickListener(paramProfileCardInfo.jdField_a_of_type_AndroidViewView$OnClickListener);
    this.jdField_a_of_type_AndroidWidgetImageView.setTag(localObject);
    this.jdField_a_of_type_JavaUtilHashMap.put("map_key_avatar_pendant", this.jdField_a_of_type_AndroidWidgetImageView);
    super.q(paramProfileCardInfo);
    this.jdField_b_of_type_AndroidWidgetTextView = ((TextView)findViewById(2131303053));
    this.jdField_a_of_type_JavaUtilHashMap.put("map_key_dynamic_avatar_tips", this.jdField_b_of_type_AndroidWidgetTextView);
    this.jdField_d_of_type_AndroidWidgetTextView = ((TextView)findViewById(2131302630));
    this.jdField_a_of_type_JavaUtilHashMap.put("map_key_profile_nick_name", this.jdField_d_of_type_AndroidWidgetTextView);
    super.i(paramProfileCardInfo);
    this.jdField_e_of_type_AndroidWidgetTextView = ((TextView)findViewById(2131303314));
    this.jdField_a_of_type_JavaUtilHashMap.put("map_key_sex_age_area", this.jdField_e_of_type_AndroidWidgetTextView);
    super.d(paramProfileCardInfo);
    this.jdField_a_of_type_AndroidViewView = findViewById(2131303311);
    this.jdField_a_of_type_JavaUtilHashMap.put("map_key_olympic_torch", this.jdField_a_of_type_AndroidViewView);
    super.j(paramProfileCardInfo);
    localObject = (VoteView)findViewById(2131301942);
    HeartLayout localHeartLayout = (HeartLayout)findViewById(2131301977);
    localHeartLayout.setEnabled(false);
    ((VoteView)localObject).setHeartLayout(localHeartLayout);
    this.jdField_a_of_type_JavaUtilHashMap.put("map_key_like", localObject);
    super.m(paramProfileCardInfo);
    this.jdField_a_of_type_AndroidWidgetTextView = ((TextView)findViewById(2131303322));
    this.jdField_a_of_type_JavaUtilHashMap.put("map_key_tag_jueban", this.jdField_a_of_type_AndroidWidgetTextView);
    this.jdField_a_of_type_ComTencentMobileqqWidgetRatioLayout = ((RatioLayout)findViewById(2131300571));
    this.jdField_a_of_type_JavaUtilHashMap.put("map_key_tag_cloud", this.jdField_a_of_type_ComTencentMobileqqWidgetRatioLayout);
    localObject = (LinearLayout)findViewById(2131303318);
    this.jdField_a_of_type_JavaUtilHashMap.put("map_key_tips", localObject);
    localObject = (MusicPendantView)findViewById(2131303308);
    this.jdField_a_of_type_JavaUtilHashMap.put("map_key_music_pendant", localObject);
    super.b(paramProfileCardInfo);
    g();
    p(paramProfileCardInfo);
  }
  
  public void f()
  {
    this.o = 0;
    View[] arrayOfView = this.jdField_a_of_type_ArrayOfAndroidViewView;
    int k = arrayOfView.length;
    int j = 0;
    int i = 0;
    if (j < k)
    {
      View localView = arrayOfView[j];
      Object localObject1;
      if ((localView != null) && (localView.getVisibility() == 0))
      {
        if ((localView instanceof VipTagView)) {
          ((VipTagView)localView).setShakingState(false);
        }
        localObject1 = (Integer)localView.getTag(2131296456);
        if (localObject1 != null) {}
      }
      for (;;)
      {
        j += 1;
        break;
        PointF localPointF = jdField_a_of_type_ArrayOfAndroidGraphicsPointF[localObject1.intValue()];
        localObject1 = (RatioLayout.LayoutParams)localView.getLayoutParams();
        if (localObject1 != null)
        {
          ((RatioLayout.LayoutParams)localObject1).a = this.jdField_a_of_type_AndroidGraphicsPointF.x;
          ((RatioLayout.LayoutParams)localObject1).b = this.jdField_a_of_type_AndroidGraphicsPointF.y;
          localView.setLayoutParams((ViewGroup.LayoutParams)localObject1);
        }
        this.o += 1;
        Object localObject2 = this.jdField_b_of_type_ArrayOfComTencentMobileqqUtilsValueAnimation[i];
        localObject1 = localObject2;
        if (localObject2 == null)
        {
          localObject2 = this.jdField_b_of_type_ArrayOfComTencentMobileqqUtilsValueAnimation;
          localObject1 = new ValueAnimation(Float.valueOf(1.0F), Float.valueOf(0.0F), new twx(this, localView, localPointF), false, true);
          localObject2[i] = localObject1;
          ((ValueAnimation)localObject1).setInterpolator(new AccelerateInterpolator());
          ((ValueAnimation)localObject1).setAnimationListener(new twy(this, localView));
          ((ValueAnimation)localObject1).setDuration(600L);
        }
        localView.startAnimation((Animation)localObject1);
        this.jdField_c_of_type_AndroidWidgetTextView.setVisibility(4);
        i += 1;
      }
    }
    if (this.o == 0) {
      this.jdField_d_of_type_Boolean = false;
    }
  }
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    if ((paramAnimation instanceof ValueAnimation))
    {
      ValueAnimation localValueAnimation = (ValueAnimation)paramAnimation;
      if (paramAnimation != this.jdField_b_of_type_ComTencentMobileqqUtilsValueAnimation) {
        break label51;
      }
      if (!localValueAnimation.a()) {
        this.jdField_a_of_type_ComTencentMobileqqProfileViewBreatheEffectView.a(new txd(this));
      }
    }
    for (;;)
    {
      this.jdField_a_of_type_ComTencentMobileqqWidgetRatioLayout.setSkipMeasure(false);
      return;
      label51:
      if (Build.VERSION.SDK_INT < 11)
      {
        ((FriendProfileCardActivity)this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity).r();
      }
      else
      {
        paramAnimation = (FrameLayout)this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity.findViewById(16908290);
        if ((paramAnimation != null) && (paramAnimation.getChildCount() > 0))
        {
          paramAnimation = paramAnimation.getChildAt(0);
          if (paramAnimation != null)
          {
            this.jdField_a_of_type_AndroidGraphicsDrawableDrawable = paramAnimation.getBackground();
            paramAnimation.setBackgroundDrawable(null);
          }
        }
      }
    }
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation)
  {
    this.jdField_a_of_type_ComTencentMobileqqWidgetRatioLayout.setSkipMeasure(true);
    paramAnimation = (FrameLayout)this.jdField_a_of_type_ComTencentMobileqqAppBaseActivity.findViewById(16908290);
    if (paramAnimation != null)
    {
      if ((paramAnimation.getBackground() == null) && (this.jdField_b_of_type_AndroidGraphicsDrawableDrawable != null)) {
        paramAnimation.setBackgroundDrawable(this.jdField_b_of_type_AndroidGraphicsDrawableDrawable);
      }
      if (paramAnimation.getChildCount() > 0)
      {
        paramAnimation = paramAnimation.getChildAt(0);
        if ((paramAnimation != null) && (paramAnimation.getBackground() == null) && (this.jdField_a_of_type_AndroidGraphicsDrawableDrawable != null)) {
          paramAnimation.setBackgroundDrawable(this.jdField_a_of_type_AndroidGraphicsDrawableDrawable);
        }
      }
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    Object localObject;
    float f1;
    if (this.jdField_a_of_type_AndroidGraphicsPointF == null)
    {
      getLocationOnScreen(this.jdField_b_of_type_ArrayOfInt);
      this.jdField_a_of_type_ComTencentMobileqqUtilsDrag_n_dropDragAndDropDetector.a(this.jdField_b_of_type_ArrayOfInt[0], this.jdField_b_of_type_ArrayOfInt[1]);
      paramInt3 = this.jdField_b_of_type_AndroidWidgetImageView.getWidth();
      paramInt1 = this.jdField_b_of_type_AndroidWidgetImageView.getHeight();
      localObject = new int[2];
      this.jdField_b_of_type_AndroidWidgetImageView.getLocationOnScreen((int[])localObject);
      int i = localObject[0];
      int j = this.jdField_b_of_type_ArrayOfInt[0];
      f1 = (paramInt3 / 2 + (i - j)) / getWidth();
      paramInt3 = localObject[1];
      i = this.jdField_b_of_type_ArrayOfInt[1];
      this.jdField_a_of_type_AndroidGraphicsPointF = new PointF(f1, (paramInt1 / 2 + (paramInt3 - i)) / getHeight());
      postDelayed(new txb(this), 300L);
    }
    if ((this.n > 0) && (paramInt4 - paramInt2 == this.n) && (this.jdField_b_of_type_AndroidGraphicsPointF == null))
    {
      paramInt2 = this.jdField_b_of_type_AndroidWidgetImageView.getWidth();
      paramInt1 = this.jdField_b_of_type_AndroidWidgetImageView.getHeight();
      localObject = new int[2];
      this.jdField_b_of_type_AndroidWidgetImageView.getLocationOnScreen((int[])localObject);
      this.jdField_a_of_type_ComTencentMobileqqProfileViewBreatheEffectView.setHoverHotArea(new Rect(localObject[0], localObject[1], localObject[0] + paramInt2, localObject[1] + paramInt1));
      paramInt3 = localObject[0];
      paramInt4 = this.jdField_b_of_type_ArrayOfInt[0];
      f1 = (paramInt2 / 2 + (paramInt3 - paramInt4)) / getWidth();
      paramInt2 = localObject[1];
      paramInt3 = this.jdField_b_of_type_ArrayOfInt[1];
      this.jdField_b_of_type_AndroidGraphicsPointF = new PointF(f1, (paramInt1 / 2 + (paramInt2 - paramInt3)) / getHeight());
      paramInt2 = this.jdField_e_of_type_AndroidWidgetTextView.getHeight();
      this.jdField_e_of_type_AndroidWidgetTextView.getLocationOnScreen((int[])localObject);
      paramInt3 = jdField_a_of_type_ArrayOfAndroidGraphicsPointF.length - 1;
      if (this.jdField_a_of_type_ArrayOfAndroidViewView[paramInt3] == null) {
        break label465;
      }
    }
    label465:
    for (paramInt1 = this.jdField_a_of_type_ArrayOfAndroidViewView[paramInt3].getHeight() / 2;; paramInt1 = 0)
    {
      f1 = (paramInt1 + (paramInt2 + (localObject[1] - this.jdField_b_of_type_ArrayOfInt[1]))) / getHeight();
      localObject = jdField_a_of_type_ArrayOfAndroidGraphicsPointF[paramInt3];
      ((PointF)localObject).set(((PointF)localObject).x, f1);
      if (this.jdField_c_of_type_AndroidWidgetTextView != null)
      {
        localObject = (RatioLayout.LayoutParams)this.jdField_c_of_type_AndroidWidgetTextView.getLayoutParams();
        if (localObject != null)
        {
          ((RatioLayout.LayoutParams)localObject).b = f1;
          this.jdField_c_of_type_AndroidWidgetTextView.setLayoutParams((ViewGroup.LayoutParams)localObject);
        }
      }
      return;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction())
    {
    }
    for (;;)
    {
      return super.onTouchEvent(paramMotionEvent);
      if ((!this.f) && (this.jdField_a_of_type_ComTencentMobileqqProfileProfileCardInfo.jdField_a_of_type_AndroidViewView$OnClickListener != null))
      {
        this.jdField_a_of_type_ComTencentMobileqqWidgetRatioLayout.setTag(new DataTag(29, null));
        this.jdField_a_of_type_ComTencentMobileqqProfileProfileCardInfo.jdField_a_of_type_AndroidViewView$OnClickListener.onClick(this.jdField_a_of_type_ComTencentMobileqqWidgetRatioLayout);
        return true;
      }
      this.f = false;
    }
  }
  
  public void p(ProfileCardInfo paramProfileCardInfo)
  {
    if (QLog.isColorLevel()) {
      QLog.d(jdField_c_of_type_JavaLangString, 2, "updateTagCloud");
    }
    ThreadManager.a(new twz(this, paramProfileCardInfo), 8, null, true);
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\com\tencent\mobileqq\profile\view\ProfileTagView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */