package com.tencent.mobileqq.troop.data;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.utils.DisplayUtils;
import com.tencent.qphone.base.util.QLog;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public class AudioInfo
  extends MediaInfo
  implements Serializable, Cloneable
{
  protected static final String AUDIO_DURATION = "duration";
  protected static final String AUDIO_SIZE = "size";
  protected static final String AUDIO_TITLE = "title";
  protected static final String AUDIO_URL = "url";
  private static final int a = 84;
  private static final int b = 226;
  private static final int c = 41;
  private static final int d = 12;
  private static final int e = 3;
  private static final long serialVersionUID = 1L;
  public int duration;
  public ImageView mAudioIcon;
  private int mAudioType;
  protected int mMaxLayoutLength;
  protected int mMinLayoutLength;
  public String path;
  public long size;
  public String title;
  public String url;
  
  public AudioInfo(AudioInfo paramAudioInfo)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.mMinLayoutLength = 84;
    this.mMaxLayoutLength = 226;
    this.path = paramAudioInfo.path;
    this.title = paramAudioInfo.title;
    this.duration = paramAudioInfo.duration;
    this.url = paramAudioInfo.url;
    this.size = paramAudioInfo.size;
    a(this.path);
  }
  
  public AudioInfo(String paramString, int paramInt, long paramLong)
  {
    this.mMinLayoutLength = 84;
    this.mMaxLayoutLength = 226;
    this.path = paramString;
    this.duration = paramInt;
    this.size = paramLong;
    a(paramString);
  }
  
  private void a(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      paramString = paramString.toLowerCase();
      if (!paramString.endsWith(".slk")) {
        break label27;
      }
      this.mAudioType = 1;
    }
    label27:
    while (!paramString.endsWith(".amr")) {
      return;
    }
    this.mAudioType = 0;
  }
  
  protected static final String getAudioTime(double paramDouble)
  {
    int i = parseTimeToSeconds(paramDouble);
    int j = i / 60;
    if (j > 0) {
      return String.format("%1$d'%2$d\"", new Object[] { Integer.valueOf(j), Integer.valueOf(i % 60) });
    }
    return String.format("%d\"", new Object[] { Integer.valueOf(i) });
  }
  
  protected static final int parseTimeToSeconds(double paramDouble)
  {
    int i = 0;
    if (paramDouble >= 1000.0D) {
      i = (int)(paramDouble / 1000.0D + 0.5D);
    }
    return i;
  }
  
  public Object clone()
  {
    return new AudioInfo(this);
  }
  
  public int getAudioType()
  {
    return this.mAudioType;
  }
  
  public String getJsonText()
  {
    JSONObject localJSONObject = new JSONObject();
    if (!TextUtils.isEmpty(this.url)) {}
    try
    {
      localJSONObject.put("duration", parseTimeToSeconds(this.duration));
      localJSONObject.put("url", this.url);
      localJSONObject.put("size", this.size);
      if (QLog.isColorLevel()) {
        QLog.d("publish_mediaInfo", 2, "AudioInfo getJsonText: " + localJSONObject);
      }
      return localJSONObject.toString();
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
  }
  
  public View getView(Context paramContext, View.OnClickListener paramOnClickListener)
  {
    if (this.duration < 0) {
      return null;
    }
    View localView = LayoutInflater.from(paramContext).inflate(2130903698, null);
    RelativeLayout localRelativeLayout = (RelativeLayout)localView.findViewById(2131299755);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(localRelativeLayout.getLayoutParams());
    int i = (int)((this.mMaxLayoutLength - this.mMinLayoutLength) / 60000.0F * this.duration + this.mMinLayoutLength);
    if (this.duration < 60000) {}
    for (localLayoutParams.width = ((int)DisplayUtils.a(paramContext, i));; localLayoutParams.width = ((int)DisplayUtils.a(paramContext, this.mMaxLayoutLength)))
    {
      localLayoutParams.height = ((int)DisplayUtils.a(paramContext, 41.0F));
      localLayoutParams.topMargin = ((int)DisplayUtils.a(paramContext, 12.0F));
      localLayoutParams.leftMargin = ((int)DisplayUtils.a(paramContext, 3.0F));
      localRelativeLayout.setLayoutParams(localLayoutParams);
      i = (int)DisplayUtils.a(paramContext, 5.0F);
      localRelativeLayout.setPadding(i, i, i, i);
      localView.findViewById(2131299758).setOnClickListener(paramOnClickListener);
      this.mAudioIcon = ((ImageView)localView.findViewById(2131299756));
      this.mAudioIcon.setOnClickListener(paramOnClickListener);
      paramContext = (TextView)localView.findViewById(2131299757);
      paramContext.setOnClickListener(paramOnClickListener);
      paramContext.setText(getAudioTime(this.duration));
      return localView;
    }
  }
  
  public void setMaxLayout(int paramInt)
  {
    this.mMaxLayoutLength = paramInt;
  }
  
  public void setMinLayout(int paramInt)
  {
    this.mMinLayoutLength = paramInt;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\mobileqq\troop\data\AudioInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */