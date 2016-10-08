package com.tencent.mobileqq.jsbridge;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.qphone.base.util.QLog;
import com.tencent.smtt.sdk.WebView;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public class JsBridge$JsBridgeListener
{
  long jdField_a_of_type_Long;
  String jdField_a_of_type_JavaLangString;
  WeakReference jdField_a_of_type_JavaLangRefWeakReference;
  
  public JsBridge$JsBridgeListener(WebView paramWebView, long paramLong, String paramString)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_JavaLangRefWeakReference = new WeakReference(paramWebView);
    this.jdField_a_of_type_Long = paramLong;
    this.jdField_a_of_type_JavaLangString = paramString;
  }
  
  public long a()
  {
    return this.jdField_a_of_type_Long;
  }
  
  public void a()
  {
    if (QLog.isDevelopLevel()) {
      QLog.d("JB", 4, "onNoMatchMethod");
    }
    WebView localWebView = (WebView)this.jdField_a_of_type_JavaLangRefWeakReference.get();
    if (localWebView == null) {
      return;
    }
    localWebView.loadUrl("javascript:window.JsBridge&&JsBridge.callback(" + this.jdField_a_of_type_Long + ",{'r':1,'result':'no such method'})");
  }
  
  public void a(Object paramObject)
  {
    WebView localWebView = (WebView)this.jdField_a_of_type_JavaLangRefWeakReference.get();
    if (localWebView == null) {
      return;
    }
    if (paramObject == null)
    {
      localWebView.loadUrl("javascript:window.JsBridge&&JsBridge.callback(" + this.jdField_a_of_type_Long + ",{'r':0});");
      return;
    }
    if (((paramObject instanceof Number)) || ((paramObject instanceof Boolean)) || ((paramObject instanceof JSONObject))) {}
    for (paramObject = paramObject.toString();; paramObject = "'" + paramObject.toString().replace("\\", "\\\\").replace("'", "\\'") + "'")
    {
      localWebView.loadUrl("javascript:window.JsBridge&&JsBridge.callback(" + this.jdField_a_of_type_Long + ",{'r':0,'result':" + (String)paramObject + "});");
      return;
    }
  }
  
  public void a(String paramString)
  {
    if (QLog.isColorLevel()) {
      QLog.i("JB", 2, paramString);
    }
    paramString = "'" + paramString.replace("\\", "\\\\").replace("'", "\\'") + "'";
    WebView localWebView = (WebView)this.jdField_a_of_type_JavaLangRefWeakReference.get();
    if (localWebView != null) {
      localWebView.loadUrl("javascript:window.JsBridge&&JsBridge.callback(" + this.jdField_a_of_type_Long + ",{'r':3,'result':" + paramString + "});");
    }
  }
  
  public void b()
  {
    if (QLog.isDevelopLevel()) {
      QLog.d("JB", 4, "onPermissionDenied");
    }
    WebView localWebView = (WebView)this.jdField_a_of_type_JavaLangRefWeakReference.get();
    if (localWebView != null) {
      localWebView.loadUrl("javascript:window.JsBridge&&JsBridge.callback(" + this.jdField_a_of_type_Long + ",{'r':2,'result':'Permission denied'})");
    }
  }
  
  public void b(String paramString)
  {
    WebView localWebView = (WebView)this.jdField_a_of_type_JavaLangRefWeakReference.get();
    if (localWebView != null) {
      localWebView.loadUrl("javascript:" + paramString);
    }
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\mobileqq\jsbridge\JsBridge$JsBridgeListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */