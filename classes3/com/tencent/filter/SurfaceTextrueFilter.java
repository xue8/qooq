package com.tencent.filter;

public class SurfaceTextrueFilter
  extends BaseFilter
{
  public SurfaceTextrueFilter()
  {
    super(0, GLSLRender.FILTER_EGL_IMAGE);
  }
  
  public void ApplyGLSLFilter()
  {
    ApplyGLSLFilter(1);
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\tencent\filter\SurfaceTextrueFilter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */