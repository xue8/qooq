package com.tencent.mobileqq.vaswebviewplugin;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import org.json.JSONObject;

class ThemeAndBubbleCommonJsPlugin$2
  implements DialogInterface.OnClickListener
{
  ThemeAndBubbleCommonJsPlugin$2(ThemeAndBubbleCommonJsPlugin paramThemeAndBubbleCommonJsPlugin, String paramString)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = new JSONObject();
    try
    {
      paramDialogInterface.put("result", 1);
      paramDialogInterface.put("message", "btn1 press");
      this.this$0.callJs(this.val$callbackId + "(" + paramDialogInterface.toString() + ");");
      return;
    }
    catch (Exception paramDialogInterface)
    {
      this.this$0.callJsOnError(this.val$callbackId, paramDialogInterface.getMessage());
    }
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\mobileqq\vaswebviewplugin\ThemeAndBubbleCommonJsPlugin$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */