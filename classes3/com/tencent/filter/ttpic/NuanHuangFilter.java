package com.tencent.filter.ttpic;

import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.Param.FloatParam;
import com.tencent.filter.Param.FloatsParam;
import com.tencent.filter.Param.IntParam;
import com.tencent.filter.Param.TextureResParam;

public class NuanHuangFilter
  extends BaseFilter
{
  public NuanHuangFilter()
  {
    super(GLSLRender.FILTER_SHADER_NONE);
  }
  
  public void ApplyGLSLFilter(boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    BaseFilter localBaseFilter2 = new BaseFilter(GLSLRender.FILTER_SHADER_COLOR_BALANCE);
    localBaseFilter2.addParam(new Param.FloatsParam("shadowsShift", new float[] { 0.0F, 0.0F, -0.15529412F }));
    localBaseFilter2.addParam(new Param.FloatsParam("midtonesShift", new float[] { 0.039215688F, 0.0F, -0.1764706F }));
    localBaseFilter2.addParam(new Param.FloatsParam("highlightsShift", new float[] { 0.0F, 0.0F, -0.089349024F }));
    localBaseFilter2.addParam(new Param.IntParam("preserveLuminosity", 1));
    setNextFilter(localBaseFilter2, null);
    BaseFilter localBaseFilter1 = new BaseFilter(GLSLRender.FILTER_MIC_CURE_NEW_SHADER);
    localBaseFilter1.addParam(new Param.TextureResParam("inputImageTexture2", "sh/nuanhuang.png", 33986));
    localBaseFilter2.setNextFilter(localBaseFilter1, null);
    localBaseFilter2 = new BaseFilter(GLSLRender.FILTER_HSVADJUSTER_SHADER);
    localBaseFilter2.addParam(new Param.FloatParam("inputH", 1.0F));
    localBaseFilter2.addParam(new Param.FloatParam("inputS", 1.06F));
    localBaseFilter2.addParam(new Param.FloatParam("inputV", 1.04F));
    localBaseFilter1.setNextFilter(localBaseFilter2, null);
    super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\tencent\filter\ttpic\NuanHuangFilter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */