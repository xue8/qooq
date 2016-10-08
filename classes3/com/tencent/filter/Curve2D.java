package com.tencent.filter;

public class Curve2D
  extends BaseFilter
{
  float[] trans_mat = { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };
  
  public Curve2D()
  {
    super(GLSLRender.FILTER_2D_CURVE);
    addParam(new Param.FloatsParam("colorMat", this.trans_mat));
    addParam(new Param.FloatsParam("transMat", new float[] { 1.0F, 1.0F, 0.0F, 0.0F }));
  }
  
  public Curve2D(int paramInt, String paramString)
  {
    super(paramInt);
    addParam(new Param.FloatsParam("colorMat", this.trans_mat));
    addParam(new Param.TextureResParam("inputImageTexture2", paramString, 33986));
  }
  
  public Curve2D(String paramString)
  {
    this();
    addParam(new Param.TextureResParam("inputImageTexture2", paramString, 33986));
  }
  
  public void setMatrix(float[] paramArrayOfFloat)
  {
    addParam(new Param.FloatsParam("colorMat", paramArrayOfFloat));
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\tencent\filter\Curve2D.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */