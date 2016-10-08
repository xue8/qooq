package com.tencent.image;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.util.DisplayMetrics;
import android.view.Gravity;

public class QQLiveDrawable
  extends Drawable
{
  private static final String TAG = QQLiveDrawable.class.getSimpleName();
  private boolean mApplyGravity;
  private final Rect mDstRect = new Rect();
  private QQLiveState mQQLiveState;
  private int mTargetDensity = 160;
  private int mVideoHeight;
  private int mVideoWidth;
  
  public QQLiveDrawable(QQLiveState paramQQLiveState, Resources paramResources)
  {
    this.mQQLiveState = paramQQLiveState;
    this.mQQLiveState.mVideo.attachDrawable(this);
    if (paramResources != null) {}
    for (this.mTargetDensity = paramResources.getDisplayMetrics().densityDpi;; this.mTargetDensity = paramQQLiveState.mTargetDensity)
    {
      computeImageSize();
      return;
    }
  }
  
  public QQLiveDrawable(QQLiveImage paramQQLiveImage, Resources paramResources)
  {
    this(new QQLiveState(paramQQLiveImage), paramResources);
    this.mQQLiveState.mTargetDensity = this.mTargetDensity;
  }
  
  public QQLiveDrawable(String paramString, Resources paramResources)
  {
    this(new QQLiveImage(paramString, null), paramResources);
  }
  
  private void computeImageSize()
  {
    this.mVideoWidth = this.mQQLiveState.mVideo.getScaledWidth(this.mTargetDensity);
    this.mVideoHeight = this.mQQLiveState.mVideo.getScaledHeight(this.mTargetDensity);
  }
  
  public void draw(Canvas paramCanvas)
  {
    if (this.mApplyGravity)
    {
      Gravity.apply(this.mQQLiveState.mGravity, this.mVideoWidth, this.mVideoHeight, getBounds(), this.mDstRect);
      this.mApplyGravity = false;
    }
    copyBounds(this.mDstRect);
    this.mQQLiveState.mVideo.draw(paramCanvas, this.mDstRect, this.mQQLiveState.mPaint);
  }
  
  public Drawable.ConstantState getConstantState()
  {
    return this.mQQLiveState;
  }
  
  public long getCurrentPosition()
  {
    if ((this.mQQLiveState != null) && (this.mQQLiveState.mVideo != null)) {
      return this.mQQLiveState.mVideo.getCurrentPosition();
    }
    return 0L;
  }
  
  public int getIntrinsicHeight()
  {
    return this.mVideoHeight;
  }
  
  public int getIntrinsicWidth()
  {
    return this.mVideoWidth;
  }
  
  public int getOpacity()
  {
    return -2;
  }
  
  public boolean isPaused()
  {
    if ((this.mQQLiveState != null) && (this.mQQLiveState.mVideo != null)) {
      return this.mQQLiveState.mVideo.isPaused();
    }
    return true;
  }
  
  protected void onBoundsChange(Rect paramRect)
  {
    super.onBoundsChange(paramRect);
    this.mApplyGravity = true;
  }
  
  public void pause()
  {
    if ((this.mQQLiveState != null) && (this.mQQLiveState.mVideo != null)) {
      this.mQQLiveState.mVideo.pause();
    }
  }
  
  public void recyleAndKeepPostion()
  {
    if ((this.mQQLiveState != null) && (this.mQQLiveState.mVideo != null)) {
      this.mQQLiveState.mVideo.recyleAndKeepPostion();
    }
  }
  
  public void resume()
  {
    if ((this.mQQLiveState != null) && (this.mQQLiveState.mVideo != null)) {
      this.mQQLiveState.mVideo.resume();
    }
  }
  
  public void resumeFromPosi(int paramInt)
  {
    if ((this.mQQLiveState != null) && (this.mQQLiveState.mVideo != null)) {
      this.mQQLiveState.mVideo.resumeFromPosi(paramInt);
    }
  }
  
  public void setAlpha(int paramInt)
  {
    this.mQQLiveState.mPaint.setAlpha(paramInt);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.mQQLiveState.mPaint.setColorFilter(paramColorFilter);
  }
  
  public void setGravity(int paramInt)
  {
    this.mQQLiveState.mGravity = paramInt;
    this.mApplyGravity = true;
  }
  
  public void setOnStateListener(OnStateListener paramOnStateListener)
  {
    if ((this.mQQLiveState != null) && (this.mQQLiveState.mVideo != null)) {
      this.mQQLiveState.mVideo.setOnStateListener(paramOnStateListener);
    }
  }
  
  public void setParams(QQLiveDrawableParams paramQQLiveDrawableParams)
  {
    if ((this.mQQLiveState != null) && (this.mQQLiveState.mVideo != null)) {
      this.mQQLiveState.mVideo.mParams = paramQQLiveDrawableParams;
    }
  }
  
  public void setTargetDensity(int paramInt)
  {
    if (paramInt != this.mTargetDensity)
    {
      int i = paramInt;
      if (paramInt == 0) {
        i = 160;
      }
      this.mTargetDensity = i;
      computeImageSize();
      invalidateSelf();
    }
  }
  
  public static class ErrorInfo
  {
    public String detailInfo;
    public int extra;
    public Object info;
    public int model;
    public int what;
    
    public String toString()
    {
      String str;
      switch (this.model)
      {
      default: 
        str = " MODEL_UNKNOW ";
      }
      for (;;)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(" ErrorInfo : [ model =").append(this.model);
        localStringBuilder.append("\n modelDesc = ").append(str);
        localStringBuilder.append("\n what = ").append(this.what);
        localStringBuilder.append("\n extra = ").append(this.extra);
        localStringBuilder.append("\n detainInfo = ").append(this.detailInfo);
        localStringBuilder.append("\n info = ").append(this.info);
        localStringBuilder.append("]");
        return localStringBuilder.toString();
        str = " MODEL_JAVA_LOGIC_ERR ";
        continue;
        str = " MODEL_PLAYER_CORE_ERR ";
        continue;
        str = " MODEL_CGI_GETVINFO_ERR ";
        continue;
        str = " MODEL_CGI_GETKEY_ERR ";
        continue;
        str = " MODEL_CGI_GETPROGINFO_ERR ";
        continue;
        str = " MODEL_DOWNLOAD_ERR ";
      }
    }
  }
  
  public static abstract interface OnStateListener
  {
    public static final int STATE_BUFFERING = 3;
    public static final int STATE_ERROR = 5;
    public static final int STATE_IDLE = 0;
    public static final int STATE_PAUSE = 4;
    public static final int STATE_PLAYING = 2;
    public static final int STATE_PREPARED = 1;
    
    public abstract void onStateChange(int paramInt, Object paramObject);
  }
  
  public static class QQLiveDrawableParams
  {
    public static final int DATA_SOURCE_TYPE_THIRD = 2;
    public static final int DATA_SOURCE_TYPE_URL = 1;
    public static final int DATA_SOURCE_TYPE_VID = 0;
    public static final ColorDrawable DEFAULT_LOADING_DRAWABLE = new ColorDrawable(-2236446);
    public static final boolean DEFAULT_MUTE_VALUE = true;
    public static final int PLAY_TYPE_ONLINE_LIVE = 1;
    public static final int PLAY_TYPE_ONLINE_VOD = 0;
    public ColorDrawable mCoverLoadingDrawable = DEFAULT_LOADING_DRAWABLE;
    public String mCoverUrl;
    public String mDataSource;
    public AbsThirdDataSourceAdapter mDataSourceAdapter;
    public int mDataSourceType;
    public QQLiveDrawable.OnStateListener mListener;
    public long mLoopTimeMs = 0L;
    public boolean mMute = true;
    public boolean mPlayPause;
    public int mPlayType = 0;
    public int mPreviewHeight;
    public int mPreviewWidth;
    public String mRequestFormat = "sd";
    public int mStartPosi = -1;
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(" QQLiveDrawableParams [");
      localStringBuilder.append("\n mMute: ").append(this.mMute);
      localStringBuilder.append("\n mRequestFormat: ").append(this.mRequestFormat);
      localStringBuilder.append("\n mLoopTimeMs: ").append(this.mLoopTimeMs);
      localStringBuilder.append("\n mPreviewWidth: ").append(this.mPreviewWidth);
      localStringBuilder.append("\n mPreviewHeight: ").append(this.mPreviewHeight);
      localStringBuilder.append("\n mStartPosi: ").append(this.mStartPosi);
      localStringBuilder.append("\n mPlayPause: ").append(this.mPlayPause);
      localStringBuilder.append("\n mListener: ").append(this.mListener);
      localStringBuilder.append("\n mDataSourceType: ").append(this.mDataSourceType);
      localStringBuilder.append("\n mDataSource: ").append(this.mDataSource);
      localStringBuilder.append("\n mCoverUrl: ").append(this.mCoverUrl);
      localStringBuilder.append("] ");
      return localStringBuilder.toString();
    }
  }
  
  static class QQLiveState
    extends Drawable.ConstantState
  {
    int mChangingConfigurations;
    int mGravity = 119;
    Paint mPaint = new Paint();
    int mTargetDensity = 160;
    QQLiveImage mVideo;
    
    public QQLiveState(QQLiveImage paramQQLiveImage)
    {
      this.mVideo = paramQQLiveImage;
    }
    
    public int getChangingConfigurations()
    {
      return this.mChangingConfigurations;
    }
    
    public Drawable newDrawable()
    {
      return new QQLiveDrawable(this, null);
    }
    
    public Drawable newDrawable(Resources paramResources)
    {
      return new QQLiveDrawable(this, paramResources);
    }
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\com\tencent\image\QQLiveDrawable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */