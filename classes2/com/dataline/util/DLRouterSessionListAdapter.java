package com.dataline.util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dataline.activities.DLRouterSessionInfoActivity;
import com.dataline.util.widget.AsyncImageView;
import com.tencent.litetransfersdk.ProgressInfo;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.filemanager.util.FileManagerUtil;
import com.tencent.mobileqq.filemanager.util.FileUtil;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;
import com.tencent.mobileqq.utils.BubbleContextMenu;
import com.tencent.mobileqq.utils.dialogutils.QQCustomMenu;
import com.tencent.qphone.base.util.QLog;
import com.tencent.widget.BubblePopupWindow;
import cx;
import cy;
import cz;
import da;
import db;
import dc;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import tencent.im.s2c.msgtype0x211.submsgtype0x7.SubMsgType0x7.MsgBody.ProgressRsp.ProgressInfo;

public class DLRouterSessionListAdapter
  extends BaseAdapter
{
  static final int jdField_a_of_type_Int = 10;
  public static final String a = "dataline.DLRouterSessionListAdapter";
  static final int jdField_b_of_type_Int = 11;
  static final int jdField_c_of_type_Int = 12;
  static final int jdField_d_of_type_Int = 0;
  static final int jdField_e_of_type_Int = 1;
  static final int f = 2;
  private long jdField_a_of_type_Long;
  LayoutInflater jdField_a_of_type_AndroidViewLayoutInflater;
  private View.OnClickListener jdField_a_of_type_AndroidViewView$OnClickListener;
  public View.OnLongClickListener a;
  public DLRouterSessionInfoRequestTask a;
  private QQAppInterface jdField_a_of_type_ComTencentMobileqqAppQQAppInterface;
  public BubblePopupWindow a;
  WeakReference jdField_a_of_type_JavaLangRefWeakReference;
  private ArrayList jdField_a_of_type_JavaUtilArrayList;
  private HashMap jdField_a_of_type_JavaUtilHashMap;
  private long jdField_b_of_type_Long;
  private final long jdField_c_of_type_Long;
  private final long jdField_d_of_type_Long;
  private final long jdField_e_of_type_Long;
  private int g;
  
  public DLRouterSessionListAdapter(QQAppInterface paramQQAppInterface, LayoutInflater paramLayoutInflater, long paramLong1, long paramLong2, DLRouterSessionInfoActivity paramDLRouterSessionInfoActivity)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_JavaUtilHashMap = new HashMap();
    this.jdField_a_of_type_JavaUtilArrayList = new ArrayList();
    this.jdField_a_of_type_ComDatalineUtilDLRouterSessionInfoRequestTask = null;
    this.g = 2131362397;
    this.c = 1024L;
    this.d = 1048576L;
    this.e = 1073741824L;
    this.jdField_a_of_type_AndroidViewLayoutInflater = null;
    this.jdField_a_of_type_AndroidViewView$OnClickListener = new da(this);
    this.jdField_a_of_type_AndroidViewView$OnLongClickListener = new db(this);
    this.jdField_a_of_type_ComTencentWidgetBubblePopupWindow = null;
    this.jdField_a_of_type_Long = paramLong1;
    this.b = paramLong2;
    this.jdField_a_of_type_AndroidViewLayoutInflater = paramLayoutInflater;
    this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface = paramQQAppInterface;
    this.jdField_a_of_type_JavaLangRefWeakReference = new WeakReference(paramDLRouterSessionInfoActivity);
    this.jdField_a_of_type_ComDatalineUtilDLRouterSessionInfoRequestTask = new DLRouterSessionInfoRequestTask();
  }
  
  private void a(int paramInt)
  {
    this.jdField_a_of_type_ComDatalineUtilDLRouterSessionInfoRequestTask.a(0, paramInt);
  }
  
  private void a(View paramView)
  {
    ((TextView)paramView.findViewById(2131297967)).setText(this.g);
    paramView = (Button)paramView.findViewById(2131297968);
    if (this.g == 2131362406)
    {
      paramView.setVisibility(0);
      return;
    }
    paramView.setVisibility(8);
  }
  
  private void e()
  {
    Collections.sort(this.jdField_a_of_type_JavaUtilArrayList, new cx(this));
  }
  
  public void a()
  {
    this.jdField_a_of_type_ComDatalineUtilDLRouterSessionInfoRequestTask.a(this, this.jdField_a_of_type_Long, this.b);
    this.jdField_a_of_type_ComDatalineUtilDLRouterSessionInfoRequestTask.i = 0;
    a(65535);
  }
  
  void a(DLRouterSessionInfoRequestTask paramDLRouterSessionInfoRequestTask, boolean paramBoolean)
  {
    if (paramDLRouterSessionInfoRequestTask.a())
    {
      this.g = 2131362406;
      notifyDataSetChanged();
    }
    if ((paramBoolean) && (paramDLRouterSessionInfoRequestTask.i == 1))
    {
      paramDLRouterSessionInfoRequestTask = paramDLRouterSessionInfoRequestTask.a.iterator();
      while (paramDLRouterSessionInfoRequestTask.hasNext())
      {
        long l = ((Long)paramDLRouterSessionInfoRequestTask.next()).longValue();
        if (this.jdField_a_of_type_JavaUtilHashMap.containsKey(Long.valueOf(l))) {
          ((ProgressInfo)this.jdField_a_of_type_JavaUtilHashMap.get(Long.valueOf(l))).SetTimeout();
        }
      }
    }
  }
  
  public void a(List paramList)
  {
    if ((paramList == null) || (paramList.size() == 0))
    {
      if (QLog.isDevelopLevel()) {
        QLog.d("dataline.DLRouterSessionListAdapter", 4, "OnSessionInfoResponse : 没返回数据");
      }
      this.g = 2131362396;
      notifyDataSetChanged();
    }
    label185:
    label325:
    label389:
    label577:
    label608:
    label639:
    do
    {
      int k;
      do
      {
        return;
        int j = paramList.size();
        k = this.jdField_a_of_type_JavaUtilHashMap.size();
        Object localObject = "OnSessionInfoResponse : 收到数据[" + j;
        int i = 0;
        if (i < j)
        {
          SubMsgType0x7.MsgBody.ProgressRsp.ProgressInfo localProgressInfo = (SubMsgType0x7.MsgBody.ProgressRsp.ProgressInfo)paramList.get(i);
          long l = localProgressInfo.uint64_sessionid.get();
          String str = (String)localObject + "\r\nsessionid[" + l;
          if (this.jdField_a_of_type_JavaUtilHashMap.containsKey(Long.valueOf(l)))
          {
            localObject = (ProgressInfo)this.jdField_a_of_type_JavaUtilHashMap.get(Long.valueOf(l));
            str = str + "], 更新数据, nstatus[";
            int m = localProgressInfo.uint32_status.get();
            ((ProgressInfo)localObject).SetStatus(m);
            str = str + m;
            ((ProgressInfo)localObject).uint64_progress = localProgressInfo.uint64_progress.get();
            str = str + "], progress[" + ((ProgressInfo)localObject).uint64_progress;
            if ((!localProgressInfo.uint64_filesize.has()) || (localProgressInfo.uint64_filesize.get() <= 0L)) {
              break label577;
            }
            ((ProgressInfo)localObject).uint64_fileSize = localProgressInfo.uint64_filesize.get();
            str = str + "], 新fileSize[" + ((ProgressInfo)localObject).uint64_fileSize;
            if ((!localProgressInfo.uint64_time.has()) || (localProgressInfo.uint64_time.get() <= 0L)) {
              break label608;
            }
            ((ProgressInfo)localObject).SetTime(localProgressInfo.uint64_time.get());
            str = str + "], 新time[" + ((ProgressInfo)localObject).GetTime();
            if ((!localProgressInfo.str_filename.has()) || (localProgressInfo.str_filename.get() == null) || (localProgressInfo.str_filename.get().length() <= 0)) {
              break label639;
            }
            ((ProgressInfo)localObject).filename = localProgressInfo.str_filename.get();
          }
          for (str = str + "], 新filename[" + ((ProgressInfo)localObject).filename;; str = str + "], 原来filename[" + ((ProgressInfo)localObject).filename)
          {
            localObject = str + "], 原来filepath[" + ((ProgressInfo)localObject).filepath;
            i += 1;
            break;
            str = str + "], 新数据, status[";
            localObject = new ProgressInfo();
            ((ProgressInfo)localObject).uint64_sessionid = l;
            ((ProgressInfo)localObject).GetFilePath(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, this.jdField_a_of_type_Long);
            this.jdField_a_of_type_JavaUtilHashMap.put(Long.valueOf(((ProgressInfo)localObject).uint64_sessionid), localObject);
            this.jdField_a_of_type_JavaUtilArrayList.add(localObject);
            break label185;
            str = str + "], 原来fileSize[" + ((ProgressInfo)localObject).uint64_fileSize;
            break label325;
            str = str + "], 原来time[" + ((ProgressInfo)localObject).GetTime();
            break label389;
          }
        }
        if (QLog.isDevelopLevel()) {
          QLog.d("dataline.DLRouterSessionListAdapter", 4, (String)localObject + "], \r\nnOldSize[" + k + "], newSize[" + this.jdField_a_of_type_JavaUtilHashMap.size());
        }
        e();
        notifyDataSetChanged();
      } while (this.jdField_a_of_type_JavaUtilHashMap.size() <= k);
      paramList = (DLRouterSessionInfoActivity)this.jdField_a_of_type_JavaLangRefWeakReference.get();
    } while (paramList == null);
    paramList.a();
  }
  
  public boolean a()
  {
    Iterator localIterator = this.jdField_a_of_type_JavaUtilHashMap.entrySet().iterator();
    do
    {
      if (!localIterator.hasNext()) {
        break;
      }
    } while (((ProgressInfo)((Map.Entry)localIterator.next()).getValue()).IsComplete());
    for (boolean bool = true;; bool = false)
    {
      if (QLog.isDevelopLevel()) {
        QLog.d("dataline.DLRouterSessionListAdapter", 4, "request : 没返回数据，  size[" + this.jdField_a_of_type_JavaUtilHashMap.size() + "], 是否需要重新全量查询bRequest[" + bool);
      }
      return bool;
    }
  }
  
  public boolean a(View paramView)
  {
    paramView.setSelected(true);
    if ((this.jdField_a_of_type_ComTencentWidgetBubblePopupWindow != null) && (this.jdField_a_of_type_ComTencentWidgetBubblePopupWindow.g())) {
      return true;
    }
    Object localObject = (ProgressInfo)paramView.getTag();
    if (localObject == null) {
      return false;
    }
    Context localContext = paramView.getContext();
    long l = ((ProgressInfo)localObject).uint64_sessionid;
    localObject = new QQCustomMenu();
    ((QQCustomMenu)localObject).a(2131305401, localContext.getString(2131362407));
    ((QQCustomMenu)localObject).a(2131305420, localContext.getString(2131362408));
    this.jdField_a_of_type_ComTencentWidgetBubblePopupWindow = BubbleContextMenu.a(paramView, (QQCustomMenu)localObject, new dc(this, l, localContext));
    this.jdField_a_of_type_ComTencentWidgetBubblePopupWindow.a(new cy(this, paramView));
    return true;
  }
  
  public void b()
  {
    this.jdField_a_of_type_ComDatalineUtilDLRouterSessionInfoRequestTask.a();
  }
  
  public void c()
  {
    this.jdField_a_of_type_ComDatalineUtilDLRouterSessionInfoRequestTask.a(false);
    this.g = 2131362397;
    notifyDataSetChanged();
    a(23);
  }
  
  protected void d()
  {
    if (QLog.isDevelopLevel())
    {
      QLog.d("dataline.DLRouterSessionListAdapter", 4, "打印当前状态，  缓存大小[" + this.jdField_a_of_type_JavaUtilHashMap.size() + "], 显示大小[" + this.jdField_a_of_type_JavaUtilArrayList.size());
      Iterator localIterator = this.jdField_a_of_type_JavaUtilArrayList.iterator();
      while (localIterator.hasNext())
      {
        ProgressInfo localProgressInfo = (ProgressInfo)localIterator.next();
        QLog.d("dataline.DLRouterSessionListAdapter", 4, "打印当前状态，  sessionid[" + localProgressInfo.uint64_sessionid + "], filename[" + localProgressInfo.filename + "], Status[" + localProgressInfo.GetStatus() + "], progress[" + localProgressInfo.uint64_progress);
      }
    }
  }
  
  public int getCount()
  {
    return Math.max(this.jdField_a_of_type_JavaUtilArrayList.size(), 1);
  }
  
  public Object getItem(int paramInt)
  {
    if (paramInt < this.jdField_a_of_type_JavaUtilArrayList.size()) {
      return this.jdField_a_of_type_JavaUtilArrayList.get(paramInt);
    }
    return null;
  }
  
  public long getItemId(int paramInt)
  {
    if (paramInt < this.jdField_a_of_type_JavaUtilArrayList.size()) {
      return ((ProgressInfo)this.jdField_a_of_type_JavaUtilArrayList.get(paramInt)).uint64_sessionid;
    }
    return 0L;
  }
  
  public int getItemViewType(int paramInt)
  {
    if ((this.jdField_a_of_type_JavaUtilArrayList.size() > 0) && (paramInt < this.jdField_a_of_type_JavaUtilArrayList.size())) {
      return 0;
    }
    return 1;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    ProgressInfo localProgressInfo = (ProgressInfo)getItem(paramInt);
    View localView;
    AsyncImageView localAsyncImageView;
    TextView localTextView1;
    ProgressBar localProgressBar;
    TextView localTextView2;
    String str;
    if (paramView == null)
    {
      paramInt = getItemViewType(paramInt);
      if (paramInt == 0)
      {
        paramViewGroup = this.jdField_a_of_type_AndroidViewLayoutInflater.inflate(2130903270, null);
        paramViewGroup.setTag(Integer.valueOf(0));
        paramView = (RelativeLayout)paramViewGroup.findViewById(2131297922);
        paramView.setLongClickable(true);
        paramView.setOnLongClickListener(this.jdField_a_of_type_AndroidViewView$OnLongClickListener);
        paramView = paramViewGroup.findViewById(2131297946);
        paramView.setClickable(true);
        paramView.setOnClickListener(this.jdField_a_of_type_AndroidViewView$OnClickListener);
        if ((paramInt == 0) && (localProgressInfo != null))
        {
          localView = paramViewGroup.findViewById(2131297946);
          localView.setVisibility(8);
          localView.setTag(localProgressInfo);
          ((RelativeLayout)paramViewGroup.findViewById(2131297922)).setTag(localProgressInfo);
          localAsyncImageView = (AsyncImageView)paramViewGroup.findViewById(2131297880);
          localAsyncImageView.setDefaultImage(2130843492);
          localAsyncImageView.setIsDrawRound(false);
          localTextView1 = (TextView)paramViewGroup.findViewById(2131297881);
          localProgressBar = (ProgressBar)paramViewGroup.findViewById(2131297885);
          localProgressBar.setVisibility(8);
          localTextView2 = (TextView)paramViewGroup.findViewById(2131297923);
          str = localProgressInfo.filepath;
          if (str != null)
          {
            paramView = str;
            if (str.length() != 0) {}
          }
          else
          {
            paramView = localProgressInfo.filename;
          }
          str = FileUtil.a(paramView);
          if (str != null) {
            break label509;
          }
          localAsyncImageView.setImageResource(2130840398);
          paramView = localProgressInfo.filename;
          if (paramView == null) {
            break label609;
          }
          paramInt = localProgressInfo.filename.lastIndexOf("/");
          if (paramInt < 0) {}
        }
      }
    }
    label509:
    label609:
    for (paramView = FileManagerUtil.d(localProgressInfo.filename.substring(paramInt + 1));; paramView = "")
    {
      paramView = paramView + localProgressInfo.timeDes;
      localTextView1.setText(paramView + " [" + FileUtil.a(localProgressInfo.uint64_fileSize) + "]");
      if (!localProgressInfo.IsPersistentTimeout()) {
        break label616;
      }
      localTextView2.setText(2131362406);
      return paramViewGroup;
      paramViewGroup = this.jdField_a_of_type_AndroidViewLayoutInflater.inflate(2130903281, null);
      paramViewGroup.setTag(Integer.valueOf(1));
      paramViewGroup.findViewById(2131297966).setVisibility(8);
      paramView = (TextView)paramViewGroup.findViewById(2131297967);
      paramView.setTextSize(19.0F);
      paramView.setTextColor(-16777216);
      ((Button)paramViewGroup.findViewById(2131297968)).setOnClickListener(new cz(this));
      a(paramViewGroup);
      break;
      int i = ((Integer)paramView.getTag()).intValue();
      paramInt = i;
      paramViewGroup = paramView;
      if (i == 0) {
        break;
      }
      paramInt = i;
      paramViewGroup = paramView;
      if (i != 1) {
        break;
      }
      a(paramView);
      paramInt = i;
      paramViewGroup = paramView;
      break;
      localAsyncImageView.setDefaultImage(FileManagerUtil.b(str));
      switch (FileManagerUtil.a(str))
      {
      default: 
        paramInt = FileManagerUtil.b(str);
        if (paramInt == 0) {
          break;
        }
        localAsyncImageView.setImageResource(paramInt);
        break;
      case 0: 
        if ((paramView != null) && (FileManagerUtil.a(paramView) > 0L))
        {
          localAsyncImageView.setAsyncClipSize(128, 128);
          localAsyncImageView.setAsyncImage(paramView);
          break;
        }
        localAsyncImageView.setImageResource(FileManagerUtil.b(str));
        break;
      }
    }
    label616:
    switch (localProgressInfo.GetStatus())
    {
    default: 
      return paramViewGroup;
    case 0: 
      localTextView2.setText(2131362405);
      return paramViewGroup;
    case 1: 
      localTextView2.setText(2131362398);
      return paramViewGroup;
    case 2: 
      localTextView2.setText(2131362399);
      localProgressBar.setVisibility(0);
      if (localProgressInfo.uint64_progress >= localProgressInfo.uint64_fileSize) {
        paramInt = 100;
      }
      break;
    }
    for (;;)
    {
      localProgressBar.setProgress(paramInt);
      return paramViewGroup;
      if (localProgressInfo.uint64_fileSize != 0L)
      {
        paramInt = (int)(localProgressInfo.uint64_progress * 100.0D / localProgressInfo.uint64_fileSize);
        continue;
        localTextView2.setText(2131362402);
        return paramViewGroup;
        localTextView2.setText(2131362404);
        localView.setVisibility(0);
        return paramViewGroup;
      }
      else
      {
        paramInt = 0;
      }
    }
  }
  
  public int getViewTypeCount()
  {
    return 2;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\dataline\util\DLRouterSessionListAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */