import android.content.Context;
import android.content.Intent;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.webkit.URLUtil;
import com.tencent.mobileqq.activity.QQBrowserActivity;
import com.tencent.mobileqq.app.NearbyGrayTipsManager;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.ThreadManager;
import com.tencent.mobileqq.data.MessageForNearbyMarketGrayTips;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.nearby.NearbyRelevantHandler;
import com.tencent.mobileqq.nearby.NearbyURLSafeUtil;
import com.tencent.mobileqq.service.message.MessageCache;
import com.tencent.mobileqq.statistics.ReportController;
import com.tencent.mobileqq.util.Utils;
import com.tencent.mobileqq.utils.JumpAction;
import com.tencent.mobileqq.utils.JumpParser;
import com.tencent.qphone.base.util.QLog;
import java.lang.ref.WeakReference;

public class rbs
  extends ClickableSpan
{
  private static final long jdField_a_of_type_Long = 5000L;
  private int jdField_a_of_type_Int;
  private MessageForNearbyMarketGrayTips jdField_a_of_type_ComTencentMobileqqDataMessageForNearbyMarketGrayTips;
  private String jdField_a_of_type_JavaLangString;
  private WeakReference jdField_a_of_type_JavaLangRefWeakReference;
  private int jdField_b_of_type_Int;
  private long jdField_b_of_type_Long;
  private WeakReference jdField_b_of_type_JavaLangRefWeakReference;
  private int c;
  private int d;
  
  public rbs(QQAppInterface paramQQAppInterface, Context paramContext, int paramInt1, int paramInt2, int paramInt3, String paramString, int paramInt4, MessageForNearbyMarketGrayTips paramMessageForNearbyMarketGrayTips)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_JavaLangRefWeakReference = new WeakReference(paramQQAppInterface);
    this.jdField_b_of_type_JavaLangRefWeakReference = new WeakReference(paramContext);
    this.c = paramInt1;
    this.jdField_a_of_type_Int = paramInt2;
    this.jdField_b_of_type_Int = paramInt3;
    this.jdField_a_of_type_JavaLangString = paramString;
    this.d = paramInt4;
    this.jdField_a_of_type_ComTencentMobileqqDataMessageForNearbyMarketGrayTips = paramMessageForNearbyMarketGrayTips;
  }
  
  public String a(boolean paramBoolean)
  {
    Object localObject = (QQAppInterface)this.jdField_a_of_type_JavaLangRefWeakReference.get();
    if (localObject == null) {
      return null;
    }
    localObject = (NearbyGrayTipsManager)((QQAppInterface)localObject).getManager(92);
    if (localObject != null) {
      return ((NearbyGrayTipsManager)localObject).a(this.c, paramBoolean);
    }
    return "";
  }
  
  public void a(String paramString)
  {
    if (QLog.isDevelopLevel()) {
      QLog.i(MessageForNearbyMarketGrayTips.TAG, 4, "clickJumpWeb, url = " + paramString);
    }
    if (TextUtils.isEmpty(paramString)) {}
    Context localContext;
    do
    {
      return;
      localContext = (Context)this.jdField_b_of_type_JavaLangRefWeakReference.get();
    } while (localContext == null);
    Object localObject = paramString;
    if (paramString.contains("strangerUin=xxx")) {
      localObject = paramString.replace("strangerUin=xxx", "strangerUin=" + this.jdField_a_of_type_ComTencentMobileqqDataMessageForNearbyMarketGrayTips.frienduin);
    }
    QQAppInterface localQQAppInterface = (QQAppInterface)this.jdField_a_of_type_JavaLangRefWeakReference.get();
    paramString = (String)localObject;
    if (localQQAppInterface != null)
    {
      paramString = (String)localObject;
      if (((String)localObject).contains("sign=xxx"))
      {
        if (1001 != this.jdField_a_of_type_ComTencentMobileqqDataMessageForNearbyMarketGrayTips.istroop) {
          break label354;
        }
        paramString = ((String)localObject).replace("sign=xxx", "sign=" + Utils.a(localQQAppInterface.a().k(this.jdField_a_of_type_ComTencentMobileqqDataMessageForNearbyMarketGrayTips.frienduin)));
      }
      localObject = paramString;
      if (paramString.contains("sourceType=xxx"))
      {
        if (1001 != this.jdField_a_of_type_ComTencentMobileqqDataMessageForNearbyMarketGrayTips.istroop) {
          break label415;
        }
        localObject = paramString.replace("sourceType=xxx", "sourceType=1");
      }
    }
    for (;;)
    {
      paramString = (String)localObject;
      if (((String)localObject).equals("http://imgcache.qq.com/club/client/flower/release/html/index.html"))
      {
        paramString = this.jdField_a_of_type_ComTencentMobileqqDataMessageForNearbyMarketGrayTips.frienduin;
        localObject = Utils.a(localQQAppInterface.a().k(paramString));
        localObject = String.format("http://imgcache.qq.com/club/client/flower/release/html/index.html?strangerUin=%s&sign=%s&sourceType=%d&ADTAG=%s&groupCode=%s&_wv=2147347&_bid=2050", new Object[] { NearbyURLSafeUtil.a(paramString), ((String)localObject).toLowerCase(), Integer.valueOf(1), "aio.plus.s", "" });
        paramString = (String)localObject;
        if (QLog.isColorLevel())
        {
          QLog.i(MessageForNearbyMarketGrayTips.TAG, 2, "jump flow store, " + (String)localObject);
          paramString = (String)localObject;
        }
      }
      localObject = new Intent(localContext, QQBrowserActivity.class);
      ((Intent)localObject).putExtra("url", URLUtil.guessUrl(paramString));
      localContext.startActivity((Intent)localObject);
      return;
      label354:
      paramString = (String)localObject;
      if (1010 != this.jdField_a_of_type_ComTencentMobileqqDataMessageForNearbyMarketGrayTips.istroop) {
        break;
      }
      paramString = ((String)localObject).replace("sign=xxx", "sign=" + Utils.a(localQQAppInterface.a().n(this.jdField_a_of_type_ComTencentMobileqqDataMessageForNearbyMarketGrayTips.frienduin)));
      break;
      label415:
      localObject = paramString;
      if (1010 == this.jdField_a_of_type_ComTencentMobileqqDataMessageForNearbyMarketGrayTips.istroop) {
        localObject = paramString.replace("sourceType=xxx", "sourceType=2");
      }
    }
  }
  
  public void b(String paramString)
  {
    if (QLog.isDevelopLevel()) {
      QLog.i(MessageForNearbyMarketGrayTips.TAG, 4, "clickJumpNative, schema = " + paramString);
    }
    if (TextUtils.isEmpty(paramString)) {}
    Context localContext;
    do
    {
      return;
      localObject = (QQAppInterface)this.jdField_a_of_type_JavaLangRefWeakReference.get();
      localContext = (Context)this.jdField_b_of_type_JavaLangRefWeakReference.get();
    } while ((localObject == null) || (localContext == null));
    Object localObject = JumpParser.a((QQAppInterface)localObject, localContext, paramString);
    if (localObject != null)
    {
      ((JumpAction)localObject).b();
      return;
    }
    a(paramString);
  }
  
  public void c(String paramString)
  {
    if (QLog.isDevelopLevel()) {
      QLog.i(MessageForNearbyMarketGrayTips.TAG, 4, "clickAutoInput, content = " + paramString);
    }
    QQAppInterface localQQAppInterface = (QQAppInterface)this.jdField_a_of_type_JavaLangRefWeakReference.get();
    if (localQQAppInterface == null) {}
    long l;
    do
    {
      return;
      l = Math.abs(System.currentTimeMillis() - this.jdField_b_of_type_Long);
      if (l <= 5000L) {
        break;
      }
    } while (!QLog.isColorLevel());
    QLog.i(MessageForNearbyMarketGrayTips.TAG, 2, "clickAutoInput, time = " + l);
    return;
    ((NearbyRelevantHandler)localQQAppInterface.a(66)).a("tag_nearby_chat", paramString, null);
    ThreadManager.a(new rbu(this, localQQAppInterface), 2, null, false);
  }
  
  public void onClick(View paramView)
  {
    paramView = (QQAppInterface)this.jdField_a_of_type_JavaLangRefWeakReference.get();
    if (paramView != null) {
      ReportController.b(paramView, "CliOper", "", "", "0X800524C", "0X800524C", 0, 0, String.valueOf(this.c), "", "", "");
    }
    switch (this.jdField_b_of_type_Int)
    {
    case 0: 
    default: 
      return;
    case 1: 
      a(this.jdField_a_of_type_JavaLangString);
      return;
    case 2: 
      b(this.jdField_a_of_type_JavaLangString);
      return;
    }
    this.jdField_b_of_type_Long = System.currentTimeMillis();
    paramView = a(false);
    if (TextUtils.isEmpty(paramView))
    {
      ThreadManager.a(new rbt(this), 5, null, true);
      return;
    }
    c(paramView);
  }
  
  public void updateDrawState(TextPaint paramTextPaint)
  {
    if (this.jdField_a_of_type_Int == -1) {
      paramTextPaint.setColor(paramTextPaint.linkColor);
    }
    for (;;)
    {
      paramTextPaint.setUnderlineText(false);
      return;
      paramTextPaint.setColor(this.jdField_a_of_type_Int);
    }
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\rbs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */