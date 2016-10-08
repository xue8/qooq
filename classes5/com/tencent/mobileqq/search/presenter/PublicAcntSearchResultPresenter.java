package com.tencent.mobileqq.search.presenter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import com.tencent.mobileqq.data.PublicAccountInfo;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.search.model.GroupNetSearchModelPublicAcntItem;
import com.tencent.mobileqq.search.model.ISearchResultModel;
import com.tencent.mobileqq.search.model.PublicAccountSearchResultModel;
import com.tencent.mobileqq.search.view.ISearchResultView;
import com.tencent.mobileqq.util.FaceDecoder;
import com.tencent.widget.immersive.ImmersiveUtils;

public class PublicAcntSearchResultPresenter
  extends SearchResultPresenter
{
  private Drawable a;
  
  public PublicAcntSearchResultPresenter(FaceDecoder paramFaceDecoder)
  {
    super(paramFaceDecoder);
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  private void a(ISearchResultView paramISearchResultView, TextView paramTextView, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (this.a == null)
      {
        this.a = paramISearchResultView.e().getContext().getResources().getDrawable(2130838906);
        ImmersiveUtils.a(paramISearchResultView.e().getContext());
        this.a.setBounds(0, 0, ImmersiveUtils.a(15.0F), ImmersiveUtils.a(15.0F));
      }
      paramTextView.setCompoundDrawables(null, null, this.a, null);
      return;
    }
    paramTextView.setCompoundDrawables(null, null, null, null);
  }
  
  private void b(ISearchResultView paramISearchResultView, ISearchResultModel paramISearchResultModel)
  {
    TextView localTextView = paramISearchResultView.e();
    Context localContext;
    boolean bool;
    if ((localTextView != null) && (paramISearchResultModel != null))
    {
      localContext = localTextView.getContext();
      if (!(paramISearchResultModel instanceof PublicAccountSearchResultModel)) {
        break label72;
      }
      paramISearchResultModel = ((PublicAccountSearchResultModel)paramISearchResultModel).a();
      if ((paramISearchResultModel != null) && (localContext != null))
      {
        if (paramISearchResultModel.certifiedGrade <= 0L) {
          break label66;
        }
        bool = true;
        a(paramISearchResultView, localTextView, bool);
      }
    }
    label66:
    label72:
    do
    {
      do
      {
        return;
        bool = false;
        break;
      } while (!(paramISearchResultModel instanceof GroupNetSearchModelPublicAcntItem));
      paramISearchResultModel = (GroupNetSearchModelPublicAcntItem)paramISearchResultModel;
    } while ((paramISearchResultModel == null) || (localContext == null));
    a(paramISearchResultView, localTextView, paramISearchResultModel.b());
  }
  
  protected void a(ISearchResultView paramISearchResultView, ISearchResultModel paramISearchResultModel)
  {
    super.a(paramISearchResultView, paramISearchResultModel);
    if ((paramISearchResultModel instanceof PublicAccountSearchResultModel))
    {
      Object localObject = (PublicAccountSearchResultModel)paramISearchResultModel;
      PublicAccountInfo localPublicAccountInfo = ((PublicAccountSearchResultModel)localObject).a();
      if ((localPublicAccountInfo != null) && (localPublicAccountInfo.displayNumber != null) && (localPublicAccountInfo.displayNumber.equalsIgnoreCase(((PublicAccountSearchResultModel)localObject).b())))
      {
        localObject = new SpannableString(localPublicAccountInfo.name);
        ((SpannableString)localObject).setSpan(new ForegroundColorSpan(-16734752), 0, localPublicAccountInfo.name.length(), 33);
        paramISearchResultView.e().setText((CharSequence)localObject);
      }
    }
    b(paramISearchResultView, paramISearchResultModel);
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\com\tencent\mobileqq\search\presenter\PublicAcntSearchResultPresenter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */