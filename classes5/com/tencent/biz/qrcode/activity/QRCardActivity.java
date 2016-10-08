package com.tencent.biz.qrcode.activity;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.biz.qrcode.util.QRCard;
import com.tencent.mobileqq.app.IphoneTitleBarActivity;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.msf.sdk.AppNetConnInfo;
import com.tencent.mobileqq.utils.DialogUtil;
import com.tencent.mobileqq.utils.QQCustomDialog;
import com.tencent.qphone.base.util.QLog;
import com.tencent.widget.ActionSheet;
import com.tencent.widget.ActionSheetHelper;
import jas;
import jat;
import jau;
import jav;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jaw;
import jax;
import jay;
import jaz;

public class QRCardActivity
  extends IphoneTitleBarActivity
  implements View.OnClickListener
{
  protected static final int a = 0;
  protected static final String a = "QrcodeScannerCard";
  protected static final int b = 1;
  protected static final String b = "http://w.mail.qq.com/cgi-bin/login?target=mobileqqwrite&fwd=mq&fun=from3g";
  protected static final int c = 75;
  protected static final int e = 0;
  protected static final int f = 1;
  protected static final int g = 2;
  protected static final int h = 0;
  protected static final int i = 1;
  protected static final int j = 2;
  protected static final int k = 3;
  protected static final int l = 4;
  protected static final int m = 0;
  public static final String r = "QRCARDSTR";
  public static final String s = "CARDMODE";
  protected static String t = "((?:(?i)https?://|www\\.|[a-zA-Z0-9]+\\.)[a-zA-Z0-9\\-.]+(?::(\\d+))?(?:(?:/[a-zA-Z0-9\\-._?,'+\\\\&%$=~*!;#():@\\\\]*)+)?)";
  public float a;
  protected Resources a;
  public Handler a;
  private View.OnLongClickListener a;
  protected Button a;
  public ImageView a;
  protected LinearLayout a;
  protected TextView a;
  public QRCard a;
  public ActionSheet a;
  protected Thread a;
  public boolean a;
  protected TextView b;
  protected boolean b;
  protected TextView c;
  protected String c;
  public boolean c;
  protected int d;
  protected String d;
  protected String e;
  protected String f;
  protected String g;
  protected String h;
  protected String i;
  public String j;
  protected String k;
  protected String l;
  public String m;
  public String n;
  protected String o;
  protected String p;
  protected String q;
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public QRCardActivity()
  {
    this.jdField_a_of_type_AndroidOsHandler = new jas(this);
    this.jdField_a_of_type_AndroidViewView$OnLongClickListener = new jaz(this);
  }
  
  private ViewGroup a()
  {
    LinearLayout localLinearLayout = new LinearLayout(this);
    localLinearLayout.setOrientation(1);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -2);
    int i1 = (int)(this.jdField_a_of_type_Float * 5.0F);
    localLayoutParams.setMargins(0, i1, 0, i1 << 1);
    localLinearLayout.setLayoutParams(localLayoutParams);
    return localLinearLayout;
  }
  
  private void a(Context paramContext, int paramInt, String paramString1, String paramString2)
  {
    this.jdField_a_of_type_ComTencentWidgetActionSheet = ((ActionSheet)ActionSheetHelper.a(this, null));
    boolean[] arrayOfBoolean = new boolean[4];
    boolean[] tmp19_17 = arrayOfBoolean;
    tmp19_17[0] = 0;
    boolean[] tmp24_19 = tmp19_17;
    tmp24_19[1] = 0;
    boolean[] tmp29_24 = tmp24_19;
    tmp29_24[2] = 0;
    boolean[] tmp34_29 = tmp29_24;
    tmp34_29[3] = 0;
    tmp34_29;
    if (paramInt == 2)
    {
      arrayOfBoolean[0] = true;
      String str = this.jdField_a_of_type_AndroidContentResResources.getString(2131364403);
      this.jdField_a_of_type_ComTencentWidgetActionSheet.a(str, 0);
      str = this.jdField_a_of_type_AndroidContentResResources.getString(2131364404);
      this.jdField_a_of_type_ComTencentWidgetActionSheet.a(str, 0);
    }
    if (paramInt == 0)
    {
      arrayOfBoolean[1] = true;
      this.jdField_a_of_type_ComTencentWidgetActionSheet.a(this.jdField_a_of_type_AndroidContentResResources.getString(2131369290), 1);
    }
    if (paramInt == 4)
    {
      arrayOfBoolean[2] = true;
      this.jdField_a_of_type_ComTencentWidgetActionSheet.a(this.jdField_a_of_type_AndroidContentResResources.getString(2131364406), 1);
      this.jdField_a_of_type_ComTencentWidgetActionSheet.a(this.jdField_a_of_type_AndroidContentResResources.getString(2131364407), 1);
    }
    if (paramInt == 3)
    {
      arrayOfBoolean[3] = true;
      this.jdField_a_of_type_ComTencentWidgetActionSheet.a(2131369290, 1);
      this.jdField_a_of_type_ComTencentWidgetActionSheet.a(2131369291, 1);
      this.jdField_a_of_type_ComTencentWidgetActionSheet.a(2131367277, 1);
      this.jdField_a_of_type_ComTencentWidgetActionSheet.a(2131367291, 1);
      this.jdField_a_of_type_ComTencentWidgetActionSheet.a(String.format(paramContext.getString(2131369306), new Object[] { paramString1 }));
    }
    this.jdField_a_of_type_ComTencentWidgetActionSheet.a(new jau(this, arrayOfBoolean, paramString2, paramContext, paramString1));
    this.jdField_a_of_type_ComTencentWidgetActionSheet.d(2131367262);
    this.jdField_a_of_type_ComTencentWidgetActionSheet.setOnDismissListener(new jav(this));
    if (!this.jdField_a_of_type_ComTencentWidgetActionSheet.isShowing())
    {
      this.jdField_c_of_type_Boolean = false;
      this.jdField_a_of_type_ComTencentWidgetActionSheet.show();
    }
  }
  
  private void a(ViewGroup paramViewGroup, int paramInt)
  {
    Object localObject1 = super.getLayoutInflater();
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i1 = 0;
    Object localObject2;
    Object localObject3;
    Object localObject5;
    Object localObject4;
    int i5;
    Object localObject6;
    TextView localTextView;
    if (paramInt == 0)
    {
      i1 = this.jdField_a_of_type_ComTencentBizQrcodeUtilQRCard.c.size();
      i1 = this.jdField_a_of_type_ComTencentBizQrcodeUtilQRCard.b.size() + i1;
      if (paramInt != 0) {
        break label701;
      }
      i3 = i1;
      if (!this.jdField_a_of_type_ComTencentBizQrcodeUtilQRCard.c.isEmpty())
      {
        localObject2 = this.jdField_a_of_type_ComTencentBizQrcodeUtilQRCard.c.keySet().iterator();
        paramInt = i4;
      }
    }
    else
    {
      for (;;)
      {
        i2 = paramInt;
        i3 = i1;
        if (!((Iterator)localObject2).hasNext()) {
          break label424;
        }
        localObject3 = (String)((Iterator)localObject2).next();
        localObject5 = (String)this.jdField_a_of_type_ComTencentBizQrcodeUtilQRCard.c.get(localObject3);
        localObject4 = ((String)localObject5).split(";");
        if ((localObject4 != null) && (localObject4.length > 0))
        {
          i4 = i1 + (localObject4.length - 1);
          if (localObject4.length > 1)
          {
            i5 = localObject4.length;
            i3 = 0;
            i2 = paramInt;
            for (;;)
            {
              paramInt = i2;
              i1 = i4;
              if (i3 >= i5) {
                break;
              }
              localObject5 = localObject4[i3];
              localObject6 = ((LayoutInflater)localObject1).inflate(2130903780, null);
              ((View)localObject6).setTag(Integer.valueOf(0));
              localTextView = (TextView)((View)localObject6).findViewById(2131297013);
              ((TextView)((View)localObject6).findViewById(2131297123)).setText((CharSequence)localObject3);
              localTextView.setText((CharSequence)localObject5);
              a(i2, i4, (View)localObject6, paramViewGroup, 1);
              i2 += 1;
              i3 += 1;
            }
            if (paramInt != 1) {
              break;
            }
            i1 = this.jdField_a_of_type_ComTencentBizQrcodeUtilQRCard.e.size();
            i5 = this.jdField_a_of_type_ComTencentBizQrcodeUtilQRCard.f.size();
            int i6 = this.jdField_a_of_type_ComTencentBizQrcodeUtilQRCard.d.size();
            i1 = this.jdField_a_of_type_ComTencentBizQrcodeUtilQRCard.a.size() + (i1 + i5 + i6);
            break;
          }
          localObject4 = ((LayoutInflater)localObject1).inflate(2130903780, null);
          ((View)localObject4).setTag(Integer.valueOf(0));
          localObject6 = (TextView)((View)localObject4).findViewById(2131297013);
          ((TextView)((View)localObject4).findViewById(2131297123)).setText((CharSequence)localObject3);
          ((TextView)localObject6).setText((CharSequence)localObject5);
          a(paramInt, i4, (View)localObject4, paramViewGroup, 1);
          paramInt += 1;
          i1 = i4;
        }
      }
    }
    label424:
    if (!this.jdField_a_of_type_ComTencentBizQrcodeUtilQRCard.b.isEmpty())
    {
      localObject2 = this.jdField_a_of_type_ComTencentBizQrcodeUtilQRCard.b.keySet().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (String)((Iterator)localObject2).next();
        localObject5 = (String)this.jdField_a_of_type_ComTencentBizQrcodeUtilQRCard.b.get(localObject3);
        localObject4 = ((String)localObject5).split(";");
        if ((localObject4 != null) && (localObject4.length > 0))
        {
          i4 = i3 + (localObject4.length - 1);
          if (localObject4.length > 1)
          {
            i5 = localObject4.length;
            i1 = 0;
            paramInt = i2;
            for (;;)
            {
              i2 = paramInt;
              i3 = i4;
              if (i1 >= i5) {
                break;
              }
              localObject5 = localObject4[i1];
              localObject6 = ((LayoutInflater)localObject1).inflate(2130903778, null);
              localTextView = (TextView)((View)localObject6).findViewById(2131297013);
              ((TextView)((View)localObject6).findViewById(2131297123)).setText((CharSequence)localObject3);
              localTextView.setText((CharSequence)localObject5);
              a(paramInt, i4, (View)localObject6, paramViewGroup, 0);
              paramInt += 1;
              i1 += 1;
            }
          }
          localObject4 = ((LayoutInflater)localObject1).inflate(2130903778, null);
          localObject6 = (TextView)((View)localObject4).findViewById(2131297013);
          ((TextView)((View)localObject4).findViewById(2131297123)).setText((CharSequence)localObject3);
          ((TextView)localObject6).setText((CharSequence)localObject5);
          a(i2, i4, (View)localObject4, paramViewGroup, 0);
          i2 += 1;
          i3 = i4;
        }
      }
      label701:
      if (paramInt == 1)
      {
        paramInt = i3;
        if (!this.jdField_a_of_type_ComTencentBizQrcodeUtilQRCard.f.isEmpty())
        {
          localObject2 = this.m;
          localObject3 = (String)this.jdField_a_of_type_ComTencentBizQrcodeUtilQRCard.f.get(this.m);
          localObject4 = ((LayoutInflater)localObject1).inflate(2130903780, null);
          ((View)localObject4).setTag(Integer.valueOf(2));
          localObject5 = (TextView)((View)localObject4).findViewById(2131297013);
          ((TextView)((View)localObject4).findViewById(2131297123)).setText((CharSequence)localObject2);
          ((TextView)localObject5).setText((CharSequence)localObject3);
          a(0, i1, (View)localObject4, paramViewGroup, 1);
          paramInt = 1;
        }
        i2 = paramInt;
        if (!this.jdField_a_of_type_ComTencentBizQrcodeUtilQRCard.e.isEmpty())
        {
          localObject2 = this.l;
          localObject3 = (String)this.jdField_a_of_type_ComTencentBizQrcodeUtilQRCard.e.get(this.l);
          localObject4 = ((LayoutInflater)localObject1).inflate(2130903778, null);
          localObject5 = (TextView)((View)localObject4).findViewById(2131297013);
          ((TextView)((View)localObject4).findViewById(2131297123)).setText((CharSequence)localObject2);
          ((TextView)localObject5).setText((CharSequence)localObject3);
          a(paramInt, i1, (View)localObject4, paramViewGroup, 0);
          i2 = paramInt + 1;
        }
        if (!this.jdField_a_of_type_ComTencentBizQrcodeUtilQRCard.d.isEmpty())
        {
          localObject2 = this.j;
          localObject3 = (String)this.jdField_a_of_type_ComTencentBizQrcodeUtilQRCard.d.get(this.j);
          if (!Pattern.compile(t).matcher((CharSequence)localObject3).matches()) {
            break label1202;
          }
          localObject4 = ((LayoutInflater)localObject1).inflate(2130903780, null);
          ((View)localObject4).setTag(Integer.valueOf(1));
          localObject5 = (TextView)((View)localObject4).findViewById(2131297013);
          ((TextView)((View)localObject4).findViewById(2131297123)).setText((CharSequence)localObject2);
          ((TextView)localObject5).setText((CharSequence)localObject3);
          a(i2, i1, (View)localObject4, paramViewGroup, 1);
        }
        while (!this.jdField_a_of_type_ComTencentBizQrcodeUtilQRCard.a.isEmpty())
        {
          localObject1 = ((LayoutInflater)localObject1).inflate(2130903778, null);
          localObject2 = (TextView)((View)localObject1).findViewById(2131297013);
          localObject3 = (TextView)((View)localObject1).findViewById(2131297123);
          ((TextView)localObject2).setMovementMethod(LinkMovementMethod.getInstance());
          ((TextView)localObject3).setText(this.k);
          localObject3 = (String)this.jdField_a_of_type_ComTencentBizQrcodeUtilQRCard.a.get(this.k);
          localObject4 = new SpannableString((CharSequence)localObject3);
          localObject5 = Pattern.compile("\\d{5,}").matcher((CharSequence)localObject3);
          for (;;)
          {
            if (((Matcher)localObject5).find())
            {
              paramInt = ((Matcher)localObject5).start();
              i2 = ((Matcher)localObject5).end();
              if (i2 - paramInt <= 16)
              {
                ((SpannableString)localObject4).setSpan(new QRCardActivity.NumberSpan(this, ((String)localObject3).toString().substring(paramInt, i2)), paramInt, i2, 33);
                continue;
                label1202:
                localObject4 = ((LayoutInflater)localObject1).inflate(2130903778, null);
                localObject5 = (TextView)((View)localObject4).findViewById(2131297013);
                ((TextView)((View)localObject4).findViewById(2131297123)).setText((CharSequence)localObject2);
                ((TextView)localObject5).setText((CharSequence)localObject3);
                a(i2, i1, (View)localObject4, paramViewGroup, 0);
                break;
              }
            }
          }
          localObject5 = Pattern.compile(t).matcher((CharSequence)localObject3);
          while (((Matcher)localObject5).find())
          {
            paramInt = ((Matcher)localObject5).start();
            i2 = ((Matcher)localObject5).end();
            ((SpannableString)localObject4).setSpan(new QRCardActivity.NumberSpan(this, ((String)localObject3).toString().substring(paramInt, i2)), paramInt, i2, 33);
          }
          ((TextView)localObject2).setText((CharSequence)localObject4);
          if (i1 != 1) {
            break label1354;
          }
          ((View)localObject1).setBackgroundResource(2130838349);
        }
      }
    }
    for (;;)
    {
      paramViewGroup.addView((View)localObject1);
      return;
      label1354:
      ((View)localObject1).setBackgroundResource(2130838352);
    }
  }
  
  private void b()
  {
    super.setTitle(2131364474);
    this.jdField_a_of_type_AndroidWidgetImageView = ((ImageView)super.findViewById(2131296790));
    this.jdField_a_of_type_AndroidWidgetTextView = ((TextView)super.findViewById(2131296792));
    this.jdField_b_of_type_AndroidWidgetTextView = ((TextView)super.findViewById(2131297000));
    this.jdField_a_of_type_AndroidWidgetButton = ((Button)super.findViewById(2131300058));
    this.jdField_c_of_type_AndroidWidgetTextView = ((TextView)super.findViewById(2131296932));
    this.jdField_a_of_type_AndroidWidgetButton.setOnClickListener(this);
    this.jdField_a_of_type_AndroidWidgetLinearLayout = ((LinearLayout)super.findViewById(2131300057));
    if (!TextUtils.isEmpty(this.o)) {
      this.jdField_a_of_type_AndroidWidgetTextView.setText(this.o);
    }
    if (TextUtils.isEmpty(this.jdField_c_of_type_JavaLangString)) {
      if (!TextUtils.isEmpty(this.p)) {
        this.jdField_c_of_type_AndroidWidgetTextView.setText(this.jdField_a_of_type_AndroidContentResResources.getString(2131364420) + ": " + this.p);
      }
    }
    for (;;)
    {
      boolean bool = AppNetConnInfo.isWifiConn();
      if ((this.jdField_b_of_type_Boolean) && (bool))
      {
        this.jdField_a_of_type_JavaLangThread = new Thread(new jat(this));
        this.jdField_a_of_type_JavaLangThread.start();
      }
      c();
      return;
      this.jdField_c_of_type_AndroidWidgetTextView.setText(this.jdField_a_of_type_AndroidContentResResources.getString(2131364419) + ": " + this.jdField_c_of_type_JavaLangString);
      if (!TextUtils.isEmpty(this.p)) {
        this.jdField_b_of_type_AndroidWidgetTextView.setText(this.jdField_a_of_type_AndroidContentResResources.getString(2131364420) + ": " + this.p);
      }
    }
  }
  
  private void c()
  {
    this.jdField_a_of_type_AndroidWidgetLinearLayout.removeAllViewsInLayout();
    ViewGroup localViewGroup1 = a();
    a(localViewGroup1, 0);
    ViewGroup localViewGroup2 = a();
    a(localViewGroup2, 1);
    this.jdField_a_of_type_AndroidWidgetLinearLayout.addView(localViewGroup1);
    this.jdField_a_of_type_AndroidWidgetLinearLayout.addView(localViewGroup2);
    this.jdField_a_of_type_AndroidWidgetLinearLayout.requestLayout();
    this.jdField_a_of_type_AndroidWidgetLinearLayout.invalidate();
  }
  
  public void a()
  {
    this.jdField_a_of_type_AndroidContentResResources = super.getResources();
    this.jdField_a_of_type_Float = this.jdField_a_of_type_AndroidContentResResources.getDisplayMetrics().density;
    this.jdField_d_of_type_JavaLangString = this.jdField_a_of_type_AndroidContentResResources.getString(2131364409);
    this.e = this.jdField_a_of_type_AndroidContentResResources.getString(2131364408);
    this.f = this.jdField_a_of_type_AndroidContentResResources.getString(2131364410);
    this.g = this.jdField_a_of_type_AndroidContentResResources.getString(2131364413);
    this.h = this.jdField_a_of_type_AndroidContentResResources.getString(2131364412);
    this.i = this.jdField_a_of_type_AndroidContentResResources.getString(2131364411);
    this.j = this.jdField_a_of_type_AndroidContentResResources.getString(2131364415);
    this.k = this.jdField_a_of_type_AndroidContentResResources.getString(2131364414);
    this.l = this.jdField_a_of_type_AndroidContentResResources.getString(2131364418);
    this.m = this.jdField_a_of_type_AndroidContentResResources.getString(2131364416);
    this.jdField_d_of_type_Int = super.getResources().getColor(2131427450);
    this.jdField_a_of_type_ComTencentBizQrcodeUtilQRCard = new QRCard();
  }
  
  public void a(int paramInt1, int paramInt2, View paramView, ViewGroup paramViewGroup, int paramInt3)
  {
    if (paramInt1 == 0) {
      paramView.setBackgroundResource(2130838357);
    }
    for (;;)
    {
      if (paramInt2 == 1) {
        paramView.setBackgroundResource(2130838349);
      }
      if (paramInt3 == 1)
      {
        paramView.setOnClickListener(new jay(this));
        paramView.setOnLongClickListener(this.jdField_a_of_type_AndroidViewView$OnLongClickListener);
      }
      paramViewGroup.addView(paramView);
      return;
      if (paramInt1 == paramInt2 - 1) {
        paramView.setBackgroundResource(2130838352);
      } else {
        paramView.setBackgroundResource(2130838355);
      }
    }
  }
  
  protected void a(int paramInt, String paramString)
  {
    Object localObject1 = null;
    Object localObject2;
    label53:
    label73:
    label80:
    Object localObject3;
    label175:
    int i1;
    if (paramInt == 0)
    {
      if (paramString.length() <= "MECARD:".length()) {}
      do
      {
        do
        {
          return;
          paramString = paramString.substring("MECARD:".length());
        } while (TextUtils.isEmpty(paramString));
        localObject2 = paramString.split(";");
      } while (localObject2 == null);
      paramInt = 0;
      if (paramInt < localObject2.length) {
        if (localObject2[paramInt].contains(":")) {
          break label80;
        }
      }
      for (;;)
      {
        paramInt += 1;
        break label53;
        break;
        localObject1 = localObject2[paramInt].split(":");
        if ((localObject1 != null) && (localObject1.length > 1) && (!TextUtils.isEmpty(localObject1[0])) && (!TextUtils.isEmpty(localObject1[1])))
        {
          localObject3 = localObject1[0].toLowerCase().trim();
          paramString = localObject1[1].trim();
          if (((String)localObject3).equalsIgnoreCase("n"))
          {
            this.o = paramString;
          }
          else
          {
            if (!((String)localObject3).equalsIgnoreCase("til")) {
              break label175;
            }
            this.p = paramString;
          }
        }
      }
      if (((String)localObject3).startsWith("photo"))
      {
        if (localObject1.length <= 2) {
          break label2417;
        }
        paramString = new StringBuilder();
        i1 = 1;
        while (i1 < localObject1.length)
        {
          paramString.append(localObject1[i1]);
          if (i1 != localObject1.length - 1) {
            paramString.append(":");
          }
          i1 += 1;
        }
        paramString = paramString.toString();
      }
    }
    label740:
    label783:
    label803:
    label844:
    label1175:
    label1203:
    label2414:
    label2417:
    for (;;)
    {
      this.n = paramString;
      this.jdField_b_of_type_Boolean = true;
      break label73;
      if (((String)localObject3).equals("tel"))
      {
        localObject1 = paramString;
        if (this.jdField_a_of_type_ComTencentBizQrcodeUtilQRCard.c.containsKey(this.jdField_d_of_type_JavaLangString)) {
          localObject1 = (String)this.jdField_a_of_type_ComTencentBizQrcodeUtilQRCard.c.get(this.jdField_d_of_type_JavaLangString) + ";" + paramString;
        }
        this.jdField_a_of_type_ComTencentBizQrcodeUtilQRCard.c.put(this.jdField_d_of_type_JavaLangString, localObject1);
        break label73;
      }
      if (((String)localObject3).equals("adr"))
      {
        localObject1 = paramString;
        if (this.jdField_a_of_type_ComTencentBizQrcodeUtilQRCard.b.containsKey(this.g)) {
          localObject1 = (String)this.jdField_a_of_type_ComTencentBizQrcodeUtilQRCard.b.get(this.g) + ";" + paramString;
        }
        this.jdField_a_of_type_ComTencentBizQrcodeUtilQRCard.b.put(this.g, localObject1);
        break label73;
      }
      if (((String)localObject3).equals("email"))
      {
        this.jdField_a_of_type_ComTencentBizQrcodeUtilQRCard.f.put(this.m, paramString);
        break label73;
      }
      if (((String)localObject3).equals("org"))
      {
        this.jdField_a_of_type_ComTencentBizQrcodeUtilQRCard.e.put(this.l, paramString);
        break label73;
      }
      if (((String)localObject3).equals("url"))
      {
        if (localObject1.length > 2)
        {
          paramString = new StringBuilder();
          i1 = 1;
          while (i1 < localObject1.length)
          {
            paramString.append(localObject1[i1]);
            if (i1 != localObject1.length - 1) {
              paramString.append(":");
            }
            i1 += 1;
          }
          paramString = paramString.toString();
        }
        this.jdField_a_of_type_ComTencentBizQrcodeUtilQRCard.d.put(this.j, paramString);
        break label73;
      }
      if (((String)localObject3).equals("note"))
      {
        if (localObject1.length > 2)
        {
          paramString = new StringBuilder();
          i1 = 1;
          while (i1 < localObject1.length)
          {
            paramString.append(localObject1[i1]);
            if (i1 != localObject1.length - 1) {
              paramString.append(":");
            }
            i1 += 1;
          }
          paramString = paramString.toString();
        }
        this.jdField_a_of_type_ComTencentBizQrcodeUtilQRCard.a.put(this.k, paramString);
        break label73;
      }
      if (!((String)localObject3).equals("nickname")) {
        break label73;
      }
      this.jdField_c_of_type_JavaLangString = paramString;
      break label73;
      String[] arrayOfString;
      if (paramInt == 1)
      {
        if (paramString.length() <= "BEGIN:VCARD\nEND:VCARD".length()) {
          break;
        }
        if (paramString.contains("\n"))
        {
          localObject1 = "\n";
          paramString = paramString.substring("BEGIN:VCARD".length(), paramString.length() - "END:VCARD".length());
          if (TextUtils.isEmpty(paramString)) {
            break;
          }
          arrayOfString = paramString.split((String)localObject1);
          if (arrayOfString == null) {
            break;
          }
          paramInt = 0;
          if (paramInt < arrayOfString.length) {
            if (arrayOfString[paramInt].contains(":")) {
              break label844;
            }
          }
        }
        for (;;)
        {
          paramInt += 1;
          break label783;
          break;
          if (paramString.contains("\r"))
          {
            localObject1 = "\r";
            break label740;
          }
          if (!paramString.contains("\r\n")) {
            break;
          }
          localObject1 = "\r\n";
          break label740;
          localObject3 = arrayOfString[paramInt].split(":");
          if ((localObject3 != null) && (localObject3.length > 1) && (!TextUtils.isEmpty(localObject3[0])) && (!TextUtils.isEmpty(localObject3[1])))
          {
            localObject2 = localObject3[0].toLowerCase().trim();
            paramString = localObject3[1].trim();
            if (((((String)localObject2).equals("n")) || (((String)localObject2).equals("fn"))) && (TextUtils.isEmpty(this.o)))
            {
              localObject2 = paramString;
              if (paramString.contains(";"))
              {
                localObject3 = paramString.split(";");
                if ((localObject3 != null) && (localObject3.length > 0))
                {
                  int i2 = localObject3.length;
                  i1 = 0;
                  for (;;)
                  {
                    localObject2 = paramString;
                    if (i1 >= i2) {
                      break;
                    }
                    localObject2 = localObject3[i1];
                    paramString = paramString + " " + (String)localObject2;
                    i1 += 1;
                  }
                }
                localObject2 = "";
              }
              this.o = ((String)localObject2);
            }
            else if (((String)localObject2).equals("title"))
            {
              this.p = paramString;
            }
            else if (((String)localObject2).startsWith("photo"))
            {
              if (localObject3.length > 2)
              {
                paramString = new StringBuilder();
                i1 = 1;
                while (i1 < localObject3.length)
                {
                  paramString.append(localObject3[i1]);
                  if (i1 != localObject3.length - 1) {
                    paramString.append(":");
                  }
                  i1 += 1;
                }
                paramString = paramString.toString();
              }
              this.n = paramString;
              this.jdField_b_of_type_Boolean = true;
            }
            else
            {
              if (!((String)localObject2).equals("nickname")) {
                break label1175;
              }
              this.jdField_c_of_type_JavaLangString = paramString;
            }
          }
        }
        if (((String)localObject2).startsWith("tel")) {
          if (((String)localObject2).contains("home"))
          {
            localObject2 = this.e;
            if ((!"tel".equals(paramString)) || (localObject3.length <= 2)) {
              break label2414;
            }
            paramString = localObject3[2];
          }
        }
      }
      for (;;)
      {
        localObject3 = paramString;
        if (this.jdField_a_of_type_ComTencentBizQrcodeUtilQRCard.c.containsKey(localObject2)) {
          localObject3 = (String)this.jdField_a_of_type_ComTencentBizQrcodeUtilQRCard.c.get(localObject2) + ";" + paramString;
        }
        this.jdField_a_of_type_ComTencentBizQrcodeUtilQRCard.c.put(localObject2, localObject3);
        break label803;
        if (((String)localObject2).contains("work"))
        {
          localObject2 = this.f;
          break label1203;
        }
        localObject2 = this.jdField_d_of_type_JavaLangString;
        break label1203;
        if (((String)localObject2).contains("adr"))
        {
          if (((String)localObject2).contains("home")) {
            localObject2 = this.h;
          }
          for (;;)
          {
            if (paramString.contains(";;"))
            {
              localObject3 = new StringBuilder();
              paramString = paramString.substring(2);
              if (TextUtils.isEmpty(paramString)) {
                break;
              }
              paramString = paramString.split(";");
              if (paramString == null) {
                break;
              }
              i1 = 0;
              for (;;)
              {
                if (i1 < paramString.length)
                {
                  if (!TextUtils.isEmpty(paramString[i1]))
                  {
                    ((StringBuilder)localObject3).append(paramString[i1]);
                    if (i1 != paramString.length - 1) {
                      ((StringBuilder)localObject3).append((String)localObject1);
                    }
                  }
                  i1 += 1;
                  continue;
                  if (((String)localObject2).contains("work"))
                  {
                    localObject2 = this.i;
                    break;
                  }
                  localObject2 = this.g;
                  break;
                }
              }
              paramString = ((StringBuilder)localObject3).toString();
            }
          }
        }
        for (;;)
        {
          localObject3 = paramString;
          if (this.jdField_a_of_type_ComTencentBizQrcodeUtilQRCard.b.containsKey(localObject2)) {
            localObject3 = (String)this.jdField_a_of_type_ComTencentBizQrcodeUtilQRCard.b.get(localObject2) + ";" + paramString;
          }
          this.jdField_a_of_type_ComTencentBizQrcodeUtilQRCard.b.put(localObject2, localObject3);
          break label803;
          if (((String)localObject2).equals("email"))
          {
            this.jdField_a_of_type_ComTencentBizQrcodeUtilQRCard.f.put(this.m, paramString);
            break label803;
          }
          if (((String)localObject2).equals("org"))
          {
            this.jdField_a_of_type_ComTencentBizQrcodeUtilQRCard.e.put(this.l, paramString);
            break label803;
          }
          if (((String)localObject2).equals("url"))
          {
            if (localObject3.length > 2)
            {
              paramString = new StringBuilder();
              i1 = 1;
              while (i1 < localObject3.length)
              {
                paramString.append(localObject3[i1]);
                if (i1 != localObject3.length - 1) {
                  paramString.append(":");
                }
                i1 += 1;
              }
              paramString = paramString.toString();
            }
            this.jdField_a_of_type_ComTencentBizQrcodeUtilQRCard.d.put(this.j, paramString);
            break label803;
          }
          if (!((String)localObject2).equals("note")) {
            break label803;
          }
          if (localObject3.length > 2)
          {
            paramString = new StringBuilder();
            i1 = 1;
            while (i1 < localObject3.length)
            {
              paramString.append(localObject3[i1]);
              if (i1 != localObject3.length - 1) {
                paramString.append(":");
              }
              i1 += 1;
            }
            paramString = paramString.toString();
          }
          this.jdField_a_of_type_ComTencentBizQrcodeUtilQRCard.a.put(this.k, paramString);
          break label803;
          if (paramString.length() <= "BIZCARD:;;".length()) {
            break;
          }
          localObject2 = paramString.substring("BIZCARD:".length(), paramString.length() - ";;".length());
          if (TextUtils.isEmpty(paramString)) {
            break;
          }
          arrayOfString = ((String)localObject2).split(";");
          if (arrayOfString == null) {
            break;
          }
          paramInt = 0;
          paramString = null;
          if (paramInt < arrayOfString.length)
          {
            if (!arrayOfString[paramInt].contains(":"))
            {
              localObject2 = localObject1;
              localObject1 = paramString;
              paramString = (String)localObject2;
            }
            for (;;)
            {
              paramInt += 1;
              localObject2 = localObject1;
              localObject1 = paramString;
              paramString = (String)localObject2;
              break;
              localObject2 = arrayOfString[paramInt].split(":");
              if ((localObject2 != null) && (localObject2.length > 1) && (!TextUtils.isEmpty(localObject2[0])))
              {
                if (TextUtils.isEmpty(localObject2[1]))
                {
                  localObject2 = paramString;
                  paramString = (String)localObject1;
                  localObject1 = localObject2;
                  continue;
                }
                localObject3 = localObject2[0].toLowerCase().trim();
                localObject2 = localObject2[1].trim();
                if (((String)localObject3).equals("x"))
                {
                  paramString = (String)localObject1;
                  localObject1 = localObject2;
                  continue;
                }
                if (((String)localObject3).equals("n"))
                {
                  localObject1 = paramString;
                  paramString = (String)localObject2;
                  continue;
                }
                if (((String)localObject3).equals("t"))
                {
                  this.p = ((String)localObject2);
                  localObject2 = paramString;
                  paramString = (String)localObject1;
                  localObject1 = localObject2;
                  continue;
                }
                if (((String)localObject3).equals("b"))
                {
                  localObject3 = localObject2;
                  if (this.jdField_a_of_type_ComTencentBizQrcodeUtilQRCard.c.containsKey(this.jdField_d_of_type_JavaLangString)) {
                    localObject3 = (String)this.jdField_a_of_type_ComTencentBizQrcodeUtilQRCard.c.get(this.jdField_d_of_type_JavaLangString) + ";" + (String)localObject2;
                  }
                  this.jdField_a_of_type_ComTencentBizQrcodeUtilQRCard.c.put(this.jdField_d_of_type_JavaLangString, localObject3);
                  localObject2 = paramString;
                  paramString = (String)localObject1;
                  localObject1 = localObject2;
                  continue;
                }
                if (((String)localObject3).equals("a"))
                {
                  localObject3 = localObject2;
                  if (this.jdField_a_of_type_ComTencentBizQrcodeUtilQRCard.b.containsKey(this.g)) {
                    localObject3 = (String)this.jdField_a_of_type_ComTencentBizQrcodeUtilQRCard.b.get(this.g) + ";" + (String)localObject2;
                  }
                  this.jdField_a_of_type_ComTencentBizQrcodeUtilQRCard.b.put(this.g, localObject3);
                  localObject2 = paramString;
                  paramString = (String)localObject1;
                  localObject1 = localObject2;
                  continue;
                }
                if (((String)localObject3).equals("e"))
                {
                  this.jdField_a_of_type_ComTencentBizQrcodeUtilQRCard.f.put(this.m, localObject2);
                  localObject2 = paramString;
                  paramString = (String)localObject1;
                  localObject1 = localObject2;
                  continue;
                }
                if (((String)localObject3).equals("c")) {
                  this.jdField_a_of_type_ComTencentBizQrcodeUtilQRCard.e.put(this.l, localObject2);
                }
              }
              localObject2 = paramString;
              paramString = (String)localObject1;
              localObject1 = localObject2;
            }
          }
          if (!TextUtils.isEmpty(paramString))
          {
            if (!TextUtils.isEmpty((CharSequence)localObject1))
            {
              this.o = (paramString + " " + (String)localObject1);
              return;
            }
            this.o = paramString;
            return;
          }
          if (TextUtils.isEmpty((CharSequence)localObject1)) {
            break;
          }
          this.o = ((String)localObject1);
          return;
        }
      }
    }
  }
  
  public void a(Intent paramIntent, HashMap paramHashMap)
  {
    paramIntent.putExtra("job_title", this.p);
    paramIntent.putExtra("name", this.jdField_a_of_type_AndroidWidgetTextView.getText().toString());
    Iterator localIterator = paramHashMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str1 = (String)localIterator.next();
      String str2 = (String)paramHashMap.get(str1);
      String[] arrayOfString = str2.split(";");
      if ((arrayOfString != null) && (arrayOfString.length > 0)) {
        if (str1.equals(this.l))
        {
          paramIntent.putExtra("company", str2);
        }
        else if (str1.equals(this.m))
        {
          paramIntent.putExtra("email", str2);
        }
        else if (str1.contains(this.jdField_d_of_type_JavaLangString))
        {
          paramIntent.putExtra("phone", arrayOfString[0]);
          if (str1.contains(this.e)) {
            paramIntent.putExtra("phone_type", 1);
          }
          for (;;)
          {
            if (arrayOfString.length <= 1) {
              break label266;
            }
            paramIntent.putExtra("secondary_phone", arrayOfString[1]);
            if (!str1.contains(this.e)) {
              break label268;
            }
            paramIntent.putExtra("phone_type", 1);
            break;
            if (str1.contains(this.f)) {
              paramIntent.putExtra("phone_type", 3);
            } else {
              paramIntent.putExtra("phone_type", 7);
            }
          }
          label266:
          continue;
          label268:
          if (str1.contains(this.f)) {
            paramIntent.putExtra("phone_type", 3);
          } else {
            paramIntent.putExtra("phone_type", 7);
          }
        }
      }
    }
    try
    {
      startActivity(paramIntent);
      return;
    }
    catch (ActivityNotFoundException paramIntent)
    {
      while (!QLog.isColorLevel()) {}
      QLog.d("QrcodeScannerCard", 2, "Intent.ACTION_INSERT or ACTION_INSERT_OR_EDIT do not exist");
    }
  }
  
  public void a(String paramString)
  {
    QQCustomDialog localQQCustomDialog = DialogUtil.a(this, 230);
    localQQCustomDialog.setTitle(2131364468);
    localQQCustomDialog.setMessage(paramString);
    jaw localjaw = new jaw(this);
    localQQCustomDialog.setPositiveButton(2131367263, new jax(this, paramString));
    localQQCustomDialog.setNegativeButton(2131367262, localjaw);
    localQQCustomDialog.show();
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    }
    a(null, 4, null, null);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    super.setContentView(2130903783);
    paramBundle = super.getIntent();
    a();
    String str = paramBundle.getStringExtra("QRCARDSTR");
    a(paramBundle.getIntExtra("CARDMODE", 3), str);
    b();
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if (this.jdField_a_of_type_JavaLangThread != null)
    {
      this.jdField_a_of_type_Boolean = true;
      this.jdField_a_of_type_AndroidOsHandler.removeMessages(0);
    }
    if (this.jdField_a_of_type_ComTencentWidgetActionSheet != null) {
      this.jdField_a_of_type_ComTencentWidgetActionSheet.dismiss();
    }
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\com\tencent\biz\qrcode\activity\QRCardActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */