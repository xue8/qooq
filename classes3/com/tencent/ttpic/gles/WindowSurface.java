package com.tencent.ttpic.gles;

import android.graphics.SurfaceTexture;
import android.view.Surface;

public class WindowSurface
  extends EglSurfaceBase
{
  private boolean mReleaseSurface;
  private Surface mSurface;
  
  public WindowSurface(EglCore paramEglCore, SurfaceTexture paramSurfaceTexture)
  {
    super(paramEglCore);
    createWindowSurface(paramSurfaceTexture);
  }
  
  public WindowSurface(EglCore paramEglCore, Surface paramSurface, boolean paramBoolean)
  {
    super(paramEglCore);
    createWindowSurface(paramSurface);
    this.mSurface = paramSurface;
    this.mReleaseSurface = paramBoolean;
  }
  
  public void recreate(EglCore paramEglCore)
  {
    if (this.mSurface == null) {
      throw new RuntimeException("not yet implemented for SurfaceTexture");
    }
    this.mEglCore = paramEglCore;
    createWindowSurface(this.mSurface);
  }
  
  public void release()
  {
    releaseEglSurface();
    if (this.mSurface != null)
    {
      if (this.mReleaseSurface) {
        this.mSurface.release();
      }
      this.mSurface = null;
    }
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\tencent\ttpic\gles\WindowSurface.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */