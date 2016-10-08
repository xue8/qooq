package com.tencent.mobileqq.service.message;

import PushNotifyPack.DisMsgReadedNotify;
import PushNotifyPack.GroupMsgReadedNotify;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.util.Pair;
import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.mobileqq.app.FriendsManager;
import com.tencent.mobileqq.app.HotChatManager;
import com.tencent.mobileqq.app.MessageHandler;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.message.MsgPool;
import com.tencent.mobileqq.app.message.MsgProxyUtils;
import com.tencent.mobileqq.app.message.QQMessageFacade;
import com.tencent.mobileqq.app.proxy.ProxyManager;
import com.tencent.mobileqq.app.proxy.RecentUserProxy;
import com.tencent.mobileqq.data.AppShareID;
import com.tencent.mobileqq.data.HotChatInfo;
import com.tencent.mobileqq.data.MessageForLongMsg;
import com.tencent.mobileqq.data.MessageRecord;
import com.tencent.mobileqq.data.OpenID;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.msf.core.NetConnInfoCenter;
import com.tencent.mobileqq.persistence.EntityManager;
import com.tencent.mobileqq.persistence.EntityManagerFactory;
import com.tencent.mobileqq.revokemsg.RevokeMsgInfo;
import com.tencent.mobileqq.statistics.StatisticCollector;
import com.tencent.mobileqq.utils.AppShareIDUtil;
import com.tencent.mobileqq.utils.DeviceInfoUtil;
import com.tencent.mobileqq.utils.HexUtil;
import com.tencent.mobileqq.utils.StartupTracker;
import com.tencent.mobileqq.utils.httputils.PkgTools;
import com.tencent.qphone.base.util.BaseApplication;
import com.tencent.qphone.base.util.MD5;
import com.tencent.qphone.base.util.QLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MessageCache
{
  public static final int a = 0;
  public static MessageCache.MsgCacheStrategyParam a;
  public static MessageCache.RegPrxyCache a;
  private static String jdField_a_of_type_JavaLangString = "Q.msg.MessageCache";
  public static final int b = 1;
  public static final int c = 2;
  private ConcurrentHashMap A = new ConcurrentHashMap();
  private ConcurrentHashMap B = new ConcurrentHashMap();
  private ConcurrentHashMap C = new ConcurrentHashMap();
  private ConcurrentHashMap D = new ConcurrentHashMap();
  private ConcurrentHashMap E = new ConcurrentHashMap();
  private ConcurrentHashMap F = new ConcurrentHashMap();
  private ConcurrentHashMap G = new ConcurrentHashMap();
  private ConcurrentHashMap H = new ConcurrentHashMap();
  private ConcurrentHashMap I = new ConcurrentHashMap();
  private ConcurrentHashMap J = new ConcurrentHashMap();
  private ConcurrentHashMap K = new ConcurrentHashMap();
  private ConcurrentHashMap L = new ConcurrentHashMap();
  private ConcurrentHashMap M = new ConcurrentHashMap();
  private ConcurrentHashMap N = new ConcurrentHashMap();
  private ConcurrentHashMap O = new ConcurrentHashMap();
  private ConcurrentHashMap P = new ConcurrentHashMap();
  private ConcurrentHashMap Q = new ConcurrentHashMap();
  private ConcurrentHashMap R = new ConcurrentHashMap();
  private ConcurrentHashMap S = new ConcurrentHashMap();
  private ConcurrentHashMap T = new ConcurrentHashMap();
  private ConcurrentHashMap U = new ConcurrentHashMap();
  private ConcurrentHashMap V = new ConcurrentHashMap();
  private ConcurrentHashMap W = new ConcurrentHashMap();
  private ConcurrentHashMap X = new ConcurrentHashMap();
  private ConcurrentHashMap Y = new ConcurrentHashMap();
  private ConcurrentHashMap Z = new ConcurrentHashMap();
  private long jdField_a_of_type_Long = -1L;
  private SharedPreferences jdField_a_of_type_AndroidContentSharedPreferences;
  private QQAppInterface jdField_a_of_type_ComTencentMobileqqAppQQAppInterface;
  private MessageRecord jdField_a_of_type_ComTencentMobileqqDataMessageRecord;
  private MessageCache.AsyncEditor jdField_a_of_type_ComTencentMobileqqServiceMessageMessageCache$AsyncEditor;
  public MessageCacheItem a;
  ArrayList jdField_a_of_type_JavaUtilArrayList = new ArrayList();
  public HashMap a;
  private Set jdField_a_of_type_JavaUtilSet = Collections.synchronizedSet(new HashSet());
  public ConcurrentHashMap a;
  public AtomicInteger a;
  private boolean jdField_a_of_type_Boolean;
  private byte[] jdField_a_of_type_ArrayOfByte;
  private ConcurrentHashMap aa = new ConcurrentHashMap();
  private long jdField_b_of_type_Long;
  private MessageRecord jdField_b_of_type_ComTencentMobileqqDataMessageRecord;
  private ArrayList jdField_b_of_type_JavaUtilArrayList = new ArrayList();
  private HashMap jdField_b_of_type_JavaUtilHashMap = new HashMap();
  public ConcurrentHashMap b;
  private boolean jdField_b_of_type_Boolean;
  private byte[] jdField_b_of_type_ArrayOfByte;
  private ArrayList c;
  public ConcurrentHashMap c;
  private int d;
  public ConcurrentHashMap d;
  private int jdField_e_of_type_Int = -1;
  private ConcurrentHashMap jdField_e_of_type_JavaUtilConcurrentConcurrentHashMap = new ConcurrentHashMap();
  private int jdField_f_of_type_Int = -1;
  private ConcurrentHashMap jdField_f_of_type_JavaUtilConcurrentConcurrentHashMap = new ConcurrentHashMap();
  private ConcurrentHashMap g = new ConcurrentHashMap();
  private ConcurrentHashMap h = new ConcurrentHashMap();
  private ConcurrentHashMap i = new ConcurrentHashMap();
  private ConcurrentHashMap j = new ConcurrentHashMap();
  private ConcurrentHashMap k = new ConcurrentHashMap();
  private ConcurrentHashMap l = new ConcurrentHashMap();
  private ConcurrentHashMap m = new ConcurrentHashMap();
  private ConcurrentHashMap n = new ConcurrentHashMap();
  private ConcurrentHashMap o = new ConcurrentHashMap();
  private ConcurrentHashMap p = new ConcurrentHashMap();
  private ConcurrentHashMap q = new ConcurrentHashMap();
  private ConcurrentHashMap r = new ConcurrentHashMap();
  private ConcurrentHashMap s = new ConcurrentHashMap();
  private ConcurrentHashMap t = new ConcurrentHashMap();
  private ConcurrentHashMap u = new ConcurrentHashMap();
  private ConcurrentHashMap v = new ConcurrentHashMap();
  private ConcurrentHashMap w = new ConcurrentHashMap();
  private ConcurrentHashMap x = new ConcurrentHashMap();
  private ConcurrentHashMap y = new ConcurrentHashMap();
  private ConcurrentHashMap z = new ConcurrentHashMap();
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public MessageCache(QQAppInterface paramQQAppInterface)
  {
    this.jdField_a_of_type_JavaUtilConcurrentConcurrentHashMap = new ConcurrentHashMap();
    this.jdField_a_of_type_JavaUtilConcurrentAtomicAtomicInteger = new AtomicInteger(0);
    this.jdField_c_of_type_JavaUtilArrayList = new ArrayList();
    this.jdField_b_of_type_JavaUtilConcurrentConcurrentHashMap = new ConcurrentHashMap();
    this.jdField_c_of_type_JavaUtilConcurrentConcurrentHashMap = new ConcurrentHashMap();
    this.jdField_d_of_type_JavaUtilConcurrentConcurrentHashMap = new ConcurrentHashMap();
    this.jdField_a_of_type_JavaUtilHashMap = new HashMap();
    this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface = paramQQAppInterface;
    this.jdField_a_of_type_AndroidContentSharedPreferences = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().getSharedPreferences(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a(), 0);
    this.jdField_a_of_type_ComTencentMobileqqServiceMessageMessageCache$AsyncEditor = new MessageCache.AsyncEditor(this);
  }
  
  public static long a()
  {
    return NetConnInfoCenter.getServerTime();
  }
  
  private String a(List paramList)
  {
    if ((paramList == null) || (paramList.isEmpty())) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    int i1 = 0;
    if (i1 < paramList.size())
    {
      if (i1 != paramList.size() - 1) {
        localStringBuilder.append(paramList.get(i1) + "|");
      }
      for (;;)
      {
        i1 += 1;
        break;
        localStringBuilder.append(paramList.get(i1));
      }
    }
    return localStringBuilder.toString();
  }
  
  private List a(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    if ((paramString == null) || (paramString.length() == 0)) {
      return localArrayList;
    }
    paramString = paramString.split("\\|");
    int i2 = paramString.length;
    int i1 = 0;
    while (i1 < i2)
    {
      String str = paramString[i1];
      try
      {
        localArrayList.add(Integer.valueOf(str));
        i1 += 1;
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
    }
  }
  
  public static void i()
  {
    Object localObject1 = BaseApplicationImpl.a().a();
    if ((localObject1 != null) && ((localObject1 instanceof QQAppInterface)))
    {
      localObject1 = (QQAppInterface)localObject1;
      Object localObject2 = ((QQAppInterface)localObject1).a().getSharedPreferences(((QQAppInterface)localObject1).a(), 0);
      localObject1 = ((SharedPreferences)localObject2).edit();
      ((SharedPreferences.Editor)localObject1).remove("getMsgV4_vSyncCookie");
      ((SharedPreferences.Editor)localObject1).remove("getlastMessageTime");
      ((SharedPreferences.Editor)localObject1).remove("getMsgV4_vPubAccountCookie");
      ((SharedPreferences.Editor)localObject1).remove("getTroopDiscMsgLastTime");
      localObject2 = ((SharedPreferences)localObject2).getAll().entrySet().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        String str = (String)((Map.Entry)((Iterator)localObject2).next()).getKey();
        if ((!TextUtils.isEmpty(str)) && ((str.startsWith("getTroopLastMessageTime")) || (str.startsWith("getDiscussionLastMessageTime")))) {
          ((SharedPreferences.Editor)localObject1).remove(str);
        }
      }
      ((SharedPreferences.Editor)localObject1).commit();
      QLog.e(jdField_a_of_type_JavaLangString, 1, "clearAllMsgSyncFlags");
    }
  }
  
  public int a()
  {
    if (this.jdField_e_of_type_Int == -1) {
      this.jdField_e_of_type_Int = this.jdField_a_of_type_AndroidContentSharedPreferences.getInt("DS_SEND_KEY", 0);
    }
    this.jdField_e_of_type_Int += 1;
    this.jdField_a_of_type_ComTencentMobileqqServiceMessageMessageCache$AsyncEditor.putInt("DS_SEND_KEY", this.jdField_e_of_type_Int);
    return this.jdField_e_of_type_Int;
  }
  
  public int a(String paramString)
  {
    if (!this.Q.containsKey(paramString)) {
      this.Q.put(paramString, Integer.valueOf(2));
    }
    return ((Integer)this.Q.get(paramString)).intValue();
  }
  
  public int a(String paramString, int paramInt)
  {
    paramString = a(paramString, paramInt).iterator();
    for (paramInt = 0; paramString.hasNext(); paramInt = Math.max(((Integer)paramString.next()).intValue(), paramInt)) {}
    return paramInt + 1;
  }
  
  public long a(String paramString)
  {
    if (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() == null) {
      return 0L;
    }
    if (!this.jdField_e_of_type_JavaUtilConcurrentConcurrentHashMap.containsKey(paramString))
    {
      long l1 = this.jdField_a_of_type_AndroidContentSharedPreferences.getLong("getTroopLastMessageTime" + paramString, 0L);
      this.jdField_e_of_type_JavaUtilConcurrentConcurrentHashMap.put(paramString, Long.valueOf(l1));
    }
    return ((Long)this.jdField_e_of_type_JavaUtilConcurrentConcurrentHashMap.get(paramString)).longValue();
  }
  
  public long a(String paramString, int paramInt)
  {
    String str = MsgProxyUtils.a(paramString, paramInt);
    if (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() == null)
    {
      if (QLog.isColorLevel()) {
        QLog.d(jdField_a_of_type_JavaLangString, 2, "getMsgDelLastSeq uin = " + paramString + ",type = " + paramInt + " , lastSeqId = " + 0);
      }
      return 0L;
    }
    if (!this.G.containsKey(str))
    {
      long l1 = this.jdField_a_of_type_AndroidContentSharedPreferences.getLong("getDelMsgLastSeq" + str, 0L);
      this.G.put(str, Long.valueOf(l1));
      if (QLog.isColorLevel()) {
        QLog.d(jdField_a_of_type_JavaLangString, 2, "getMsgDelLastSeq uin = " + paramString + ",type = " + paramInt + " , lastSeqId = " + l1);
      }
    }
    return ((Long)this.G.get(str)).longValue();
  }
  
  public DisMsgReadedNotify a(String paramString)
  {
    return (DisMsgReadedNotify)this.W.remove(paramString);
  }
  
  public GroupMsgReadedNotify a(String paramString)
  {
    return (GroupMsgReadedNotify)this.X.remove(paramString);
  }
  
  public Pair a(String paramString)
  {
    if (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() == null) {
      localObject = null;
    }
    Pair localPair;
    do
    {
      return (Pair)localObject;
      localPair = (Pair)this.n.get(paramString);
      localObject = localPair;
    } while (localPair != null);
    Object localObject = new Pair(Long.valueOf(this.jdField_a_of_type_AndroidContentSharedPreferences.getLong("getDisscussionInfoSeq" + paramString, 0L)), Long.valueOf(this.jdField_a_of_type_AndroidContentSharedPreferences.getLong("getDisscussionInfoLastTime" + paramString, 0L)));
    this.n.put(paramString, localObject);
    return (Pair)localObject;
  }
  
  public AppShareID a(String paramString)
  {
    if (!this.Y.containsKey(paramString))
    {
      EntityManager localEntityManager = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().createEntityManager();
      AppShareID localAppShareID = (AppShareID)localEntityManager.a(AppShareID.class, "strPkgName=?", new String[] { paramString });
      if (localAppShareID != null)
      {
        a(paramString, localAppShareID);
        if (QLog.isColorLevel()) {
          QLog.d("share_appid", 2, "Add cache from db appid = " + paramString);
        }
        localEntityManager.a();
      }
    }
    for (;;)
    {
      if (this.Y.get(paramString) != AppShareIDUtil.a) {
        break label187;
      }
      return null;
      if (QLog.isColorLevel()) {
        QLog.d("share_appid", 2, "Not exist in db appid = " + paramString);
      }
      a(paramString, AppShareIDUtil.a);
      break;
      if (QLog.isColorLevel()) {
        QLog.d("share_appid", 2, "Already in cache appid = " + paramString);
      }
    }
    label187:
    return (AppShareID)this.Y.get(paramString);
  }
  
  public MessageRecord a(int paramInt, String paramString, long paramLong)
  {
    paramString = String.valueOf(paramInt) + "_" + paramString + "_" + paramLong;
    MessageRecord localMessageRecord = (MessageRecord)this.N.get(paramString);
    this.N.remove(paramString);
    return localMessageRecord;
  }
  
  public OpenID a(String paramString)
  {
    if (!this.Z.containsKey(paramString))
    {
      EntityManager localEntityManager = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().createEntityManager();
      OpenID localOpenID = (OpenID)localEntityManager.a(OpenID.class, paramString);
      if (localOpenID != null)
      {
        a(paramString, localOpenID);
        if (QLog.isColorLevel()) {
          QLog.d("openid", 2, "Add cache from db appid = " + paramString);
        }
      }
      localEntityManager.a();
    }
    for (;;)
    {
      return (OpenID)this.Z.get(paramString);
      if (QLog.isColorLevel()) {
        QLog.d("openid", 2, "Already in cache appid = " + paramString + ",openid=" + ((OpenID)this.Z.get(paramString)).openID);
      }
    }
  }
  
  public MessageCacheItem a()
  {
    if (this.jdField_a_of_type_ComTencentMobileqqServiceMessageMessageCacheItem == null) {
      this.jdField_a_of_type_ComTencentMobileqqServiceMessageMessageCacheItem = new MessageCacheItem(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, 1026, "hctopic", this.jdField_a_of_type_AndroidContentSharedPreferences, this.jdField_a_of_type_ComTencentMobileqqServiceMessageMessageCache$AsyncEditor);
    }
    return this.jdField_a_of_type_ComTencentMobileqqServiceMessageMessageCacheItem;
  }
  
  public String a()
  {
    StringBuilder localStringBuilder = new StringBuilder("dumpUnFinishGrpMsgJob : ");
    if (this.h.isEmpty()) {
      localStringBuilder.append("AllFinish.");
    }
    for (;;)
    {
      return localStringBuilder.toString();
      Iterator localIterator = this.h.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localStringBuilder.append("grpUin:").append(str).append(";");
      }
    }
  }
  
  public String a(String paramString)
  {
    if ((this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() == null) || (TextUtils.isEmpty(paramString))) {
      return "";
    }
    if (!this.jdField_c_of_type_JavaUtilConcurrentConcurrentHashMap.containsKey(paramString))
    {
      String str = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().getSharedPreferences(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() + "crm", 0).getString(paramString + "ext", null);
      if (str == null) {
        return "";
      }
      this.jdField_c_of_type_JavaUtilConcurrentConcurrentHashMap.put(paramString, str);
    }
    return (String)this.jdField_c_of_type_JavaUtilConcurrentConcurrentHashMap.get(paramString);
  }
  
  public ArrayList a()
  {
    return this.jdField_c_of_type_JavaUtilArrayList;
  }
  
  public ArrayList a(long paramLong)
  {
    return (ArrayList)this.S.get(Long.valueOf(paramLong));
  }
  
  public ArrayList a(String paramString)
  {
    return (ArrayList)this.R.get(paramString);
  }
  
  public List a(String paramString, int paramInt)
  {
    String str = MsgProxyUtils.a(paramString, paramInt);
    if (!this.s.containsKey(str))
    {
      paramString = this.jdField_a_of_type_AndroidContentSharedPreferences.getString("getLongMsgIdArray" + MsgProxyUtils.a(paramString, paramInt), "");
      this.s.put(str, a(paramString));
    }
    return (List)this.s.get(str);
  }
  
  public Map a(String paramString, int paramInt)
  {
    synchronized (this.L)
    {
      paramString = MsgProxyUtils.a(paramString, paramInt);
      if ((this.L.containsKey(paramString)) && (this.L.get(paramString) != null))
      {
        Map localMap = (Map)this.L.get(paramString);
        if ((localMap != null) && (localMap.isEmpty()))
        {
          this.L.remove(paramString);
          return null;
        }
        return localMap;
      }
    }
    return null;
  }
  
  public ConcurrentHashMap a()
  {
    return this.Q;
  }
  
  public void a()
  {
    try
    {
      if (QLog.isColorLevel()) {
        QLog.d(jdField_a_of_type_JavaLangString, 2, "clearDiscNumInfoCache");
      }
      this.jdField_b_of_type_JavaUtilArrayList.clear();
      return;
    }
    finally {}
  }
  
  public void a(int paramInt)
  {
    this.jdField_d_of_type_Int = paramInt;
    if (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() != null)
    {
      this.jdField_a_of_type_ComTencentMobileqqServiceMessageMessageCache$AsyncEditor.putInt("getlastMessageTime", paramInt);
      if (QLog.isColorLevel()) {
        QLog.d(jdField_a_of_type_JavaLangString, 2, "--->>setBuddyMsgLastSeq lastseq = " + paramInt);
      }
    }
  }
  
  public void a(long paramLong)
  {
    this.S.remove(Long.valueOf(paramLong));
  }
  
  public void a(long paramLong1, String paramString, long paramLong2)
  {
    Object localObject2 = (ArrayList)this.jdField_b_of_type_JavaUtilHashMap.get(Long.valueOf(paramLong1));
    Object localObject1 = localObject2;
    long l1;
    long l2;
    long l3;
    if (localObject2 == null) {
      if (this.jdField_b_of_type_JavaUtilHashMap.size() >= 20)
      {
        localObject1 = this.jdField_b_of_type_JavaUtilHashMap.keySet().iterator();
        l1 = 0L;
        if (!((Iterator)localObject1).hasNext()) {
          break label232;
        }
        l2 = ((Long)((Iterator)localObject1).next()).longValue();
        l3 = Long.parseLong((String)((ArrayList)this.jdField_b_of_type_JavaUtilHashMap.get(Long.valueOf(l2))).get(0));
        if (paramLong2 - l3 <= 300L) {
          break label202;
        }
      }
    }
    for (;;)
    {
      this.jdField_b_of_type_JavaUtilHashMap.remove(Long.valueOf(l2));
      localObject1 = new ArrayList();
      if (((ArrayList)localObject1).size() >= 20) {
        ((ArrayList)localObject1).remove(0);
      }
      localObject2 = Long.toString(paramLong2);
      if (((ArrayList)localObject1).size() == 0)
      {
        ((ArrayList)localObject1).add(localObject2);
        label180:
        ((ArrayList)localObject1).add(paramString);
        this.jdField_b_of_type_JavaUtilHashMap.put(Long.valueOf(paramLong1), localObject1);
        return;
        label202:
        if (l3 >= paramLong2) {
          break label229;
        }
        l1 = l2;
      }
      label229:
      for (;;)
      {
        break;
        ((ArrayList)localObject1).set(0, localObject2);
        break label180;
      }
      label232:
      l2 = l1;
    }
  }
  
  public void a(long paramLong, List paramList)
  {
    ArrayList localArrayList2 = (ArrayList)this.S.get(Long.valueOf(paramLong));
    ArrayList localArrayList1;
    if (localArrayList2 != null)
    {
      localArrayList1 = localArrayList2;
      if (localArrayList2.size() != 0) {}
    }
    else
    {
      localArrayList1 = new ArrayList();
    }
    localArrayList1.addAll(paramList);
    this.S.put(Long.valueOf(paramLong), localArrayList1);
  }
  
  public void a(MessageRecord paramMessageRecord)
  {
    for (;;)
    {
      String str;
      synchronized (this.L)
      {
        if (!paramMessageRecord.isLongMsg()) {
          return;
        }
        if (QLog.isColorLevel()) {
          QLog.d(jdField_a_of_type_JavaLangString, 2, "addOnlineLongMsgFragment longid=" + paramMessageRecord.getLongMsgInfoString());
        }
        localObject = MsgProxyUtils.a(paramMessageRecord.frienduin, paramMessageRecord.istroop);
        str = MsgProxyUtils.a(paramMessageRecord);
        if ((this.L.containsKey(localObject)) && (this.L.get(localObject) != null))
        {
          localConcurrentHashMap1 = (ConcurrentHashMap)this.L.get(localObject);
          if (!localConcurrentHashMap1.containsKey(str)) {
            break label195;
          }
          localObject = (Set)localConcurrentHashMap1.get(str);
          ((Set)localObject).add(Integer.valueOf(paramMessageRecord.longMsgIndex));
          if (paramMessageRecord.longMsgCount <= ((Set)localObject).size()) {
            localConcurrentHashMap1.remove(str);
          }
          return;
        }
      }
      ConcurrentHashMap localConcurrentHashMap1 = new ConcurrentHashMap();
      this.L.put(localObject, localConcurrentHashMap1);
      continue;
      label195:
      Object localObject = new HashSet();
      ((Set)localObject).add(Integer.valueOf(paramMessageRecord.longMsgIndex));
      localConcurrentHashMap1.put(str, localObject);
    }
  }
  
  public void a(String paramString)
  {
    this.jdField_c_of_type_JavaUtilArrayList.add(paramString);
  }
  
  public void a(String paramString, int paramInt)
  {
    this.Q.put(paramString, Integer.valueOf(paramInt));
    if (paramInt != 0)
    {
      if (QLog.isColorLevel()) {
        QLog.d(jdField_a_of_type_JavaLangString, 2, "setTroopMsgResponseState state: " + paramString + " state: " + paramInt);
      }
      if (paramInt == 2) {
        f(paramString);
      }
    }
  }
  
  public void a(String paramString, int paramInt1, int paramInt2)
  {
    a(paramString, paramInt1).add(Integer.valueOf(paramInt2));
    if (a(paramString, paramInt1).size() > 50)
    {
      paramInt2 = 0;
      while (paramInt2 < 10)
      {
        a(paramString, paramInt1).remove(0);
        paramInt2 += 1;
      }
    }
    this.jdField_a_of_type_ComTencentMobileqqServiceMessageMessageCache$AsyncEditor.putString("getLongMsgIdArray" + MsgProxyUtils.a(paramString, paramInt1), a(a(paramString, paramInt1))).commit();
  }
  
  public void a(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    label774:
    label777:
    label783:
    label789:
    for (;;)
    {
      long l2;
      HashMap localHashMap;
      int i4;
      Object localObject1;
      Object localObject2;
      int i2;
      try
      {
        l2 = System.nanoTime();
        localHashMap = new HashMap();
        localHashMap.put("isFirstOpen", String.valueOf(paramInt3));
        if ((jdField_a_of_type_ComTencentMobileqqServiceMessageMessageCache$MsgCacheStrategyParam != null) && (jdField_a_of_type_ComTencentMobileqqServiceMessageMessageCache$MsgCacheStrategyParam.jdField_a_of_type_JavaLangString.equals(paramString)))
        {
          localHashMap.put("isInited", String.valueOf(jdField_a_of_type_ComTencentMobileqqServiceMessageMessageCache$MsgCacheStrategyParam.jdField_a_of_type_Boolean));
          localHashMap.put("isMsgExisted", String.valueOf(jdField_a_of_type_ComTencentMobileqqServiceMessageMessageCache$MsgCacheStrategyParam.jdField_b_of_type_Boolean));
          localHashMap.put("msgCostTime", String.valueOf(jdField_a_of_type_ComTencentMobileqqServiceMessageMessageCache$MsgCacheStrategyParam.jdField_a_of_type_Long));
          if (paramInt1 != 1) {
            break label783;
          }
          i1 = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.b(paramString);
          i4 = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().a().a(paramString, paramInt1);
          localObject1 = MsgPool.a(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getAccount()).a();
          localObject2 = (List)((ConcurrentHashMap)localObject1).get(MsgProxyUtils.a(paramString, paramInt1));
          if ((localObject2 == null) || (((List)localObject2).isEmpty())) {
            break label777;
          }
          l1 = System.currentTimeMillis() - ((MessageRecord)((List)localObject2).get(((List)localObject2).size() - 1)).time;
          i3 = 0;
          paramInt3 = 0;
          localObject2 = ((ConcurrentHashMap)localObject1).keySet();
          i2 = i3;
          if (localObject2 != null)
          {
            i2 = i3;
            if (((Set)localObject2).size() > 0)
            {
              localObject2 = ((Set)localObject2).iterator();
              i2 = paramInt3;
              if (((Iterator)localObject2).hasNext())
              {
                String str = (String)((Iterator)localObject2).next();
                if (((ConcurrentHashMap)localObject1).get(str) == null) {
                  break label774;
                }
                paramInt3 = ((List)((ConcurrentHashMap)localObject1).get(str)).size() + paramInt3;
                break label789;
              }
            }
          }
        }
        else
        {
          localHashMap.put("isInited", "true");
          localHashMap.put("isMsgExisted", "true");
          localHashMap.put("msgCostTime", "0");
          continue;
        }
        paramInt3 = 0;
      }
      catch (Exception paramString)
      {
        paramString.printStackTrace();
        return;
      }
      int i3 = 0;
      if (paramInt1 == 0)
      {
        localObject1 = (FriendsManager)this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getManager(50);
        paramInt3 = i3;
        if (((FriendsManager)localObject1).a(paramString) != null) {
          paramInt3 = 1;
        }
        if (((FriendsManager)localObject1).e(paramString)) {
          paramInt3 = 2;
        }
      }
      for (;;)
      {
        localHashMap.put("uintype", String.valueOf(paramInt1));
        localHashMap.put("recentLoc", String.valueOf(i4));
        localHashMap.put("msgFrom", String.valueOf(paramInt2));
        localHashMap.put("friendSpeType", String.valueOf(paramInt3));
        localHashMap.put("troopSpeType", String.valueOf(i1));
        localHashMap.put("differToNewestMsg", String.valueOf(l1));
        localHashMap.put("msgCacheSize", String.valueOf(i2));
        localHashMap.put("osVer", String.valueOf(DeviceInfoUtil.a()));
        localHashMap.put("totalRomMem", String.valueOf(DeviceInfoUtil.a()[0]));
        localHashMap.put("avaRomMem", String.valueOf(DeviceInfoUtil.a()[1]));
        localHashMap.put("cpuNum", String.valueOf(DeviceInfoUtil.b()));
        localHashMap.put("cpuFreq", String.valueOf(DeviceInfoUtil.a()));
        StatisticCollector.a(BaseApplication.getContext()).a(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a(), "msg_cache_strategy_tag", true, StartupTracker.jdField_a_of_type_Long, 0L, localHashMap, "");
        if (!QLog.isColorLevel()) {
          break;
        }
        localObject1 = localHashMap.keySet();
        paramString = new StringBuffer(64);
        localObject1 = ((Set)localObject1).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (String)((Iterator)localObject1).next();
          paramString.append((String)localObject2);
          paramString.append(" : ");
          paramString.append((String)localHashMap.get(localObject2));
          paramString.append(", ");
        }
        QLog.d(jdField_a_of_type_JavaLangString, 2, "reportMsgCacheStrategy, " + paramString);
        l1 = System.nanoTime();
        QLog.d(jdField_a_of_type_JavaLangString, 2, String.format("AIOTime reportMsgCacheStrategy cost:%d ", new Object[] { Long.valueOf((l1 - l2) / 1000000L) }));
        return;
      }
      break label789;
      long l1 = 0L;
      continue;
      int i1 = 1;
    }
  }
  
  public void a(String paramString, int paramInt, long paramLong)
  {
    long l1;
    if (paramInt == 1) {
      l1 = Math.max(paramLong, a(paramString));
    }
    for (;;)
    {
      if (QLog.isColorLevel()) {
        QLog.d(jdField_a_of_type_JavaLangString, 2, "addMsgDelLastSeq uin = " + paramString + ",type = " + paramInt + " , lastSeqId = " + l1);
      }
      this.G.put(MsgProxyUtils.a(paramString, paramInt), Long.valueOf(Math.max(l1, a(paramString, paramInt))));
      if (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() != null) {
        this.jdField_a_of_type_ComTencentMobileqqServiceMessageMessageCache$AsyncEditor.putLong("getDelMsgLastSeq" + MsgProxyUtils.a(paramString, paramInt), l1).commit();
      }
      return;
      if (paramInt == 3000)
      {
        l1 = Math.max(paramLong, g(paramString));
      }
      else
      {
        List localList = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().b(paramString, paramInt);
        l1 = paramLong;
        if (localList != null)
        {
          l1 = paramLong;
          if (!localList.isEmpty()) {
            l1 = Math.max(paramLong, ((MessageRecord)localList.get(localList.size() - 1)).time);
          }
        }
        b(paramString, 0L, 0L);
      }
    }
  }
  
  public void a(String paramString1, int paramInt, String paramString2)
  {
    synchronized (this.L)
    {
      paramString1 = a(paramString1, paramInt);
      if (paramString1 == null) {
        return;
      }
      if (paramString1.containsKey(paramString2)) {
        paramString1.remove(paramString2);
      }
      return;
    }
  }
  
  public void a(String paramString, long paramLong)
  {
    paramLong = Math.max(paramLong, a(paramString));
    if (QLog.isColorLevel()) {
      QLog.d(jdField_a_of_type_JavaLangString, 2, "addGroupMsgLastSeq " + paramLong);
    }
    this.jdField_e_of_type_JavaUtilConcurrentConcurrentHashMap.put(paramString, Long.valueOf(paramLong));
    if (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() != null) {
      this.jdField_a_of_type_ComTencentMobileqqServiceMessageMessageCache$AsyncEditor.putLong("getTroopLastMessageTime" + paramString, paramLong);
    }
  }
  
  public void a(String paramString, long paramLong1, long paramLong2)
  {
    this.n.put(paramString, new Pair(Long.valueOf(paramLong1), Long.valueOf(paramLong2)));
    if (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() != null)
    {
      this.jdField_a_of_type_ComTencentMobileqqServiceMessageMessageCache$AsyncEditor.putLong("getDisscussionInfoSeq" + paramString, paramLong1);
      this.jdField_a_of_type_ComTencentMobileqqServiceMessageMessageCache$AsyncEditor.putLong("getDisscussionInfoLastTime" + paramString, paramLong2);
    }
  }
  
  public void a(String paramString, DisMsgReadedNotify paramDisMsgReadedNotify)
  {
    this.W.put(paramString, paramDisMsgReadedNotify);
  }
  
  public void a(String paramString, GroupMsgReadedNotify paramGroupMsgReadedNotify)
  {
    this.X.put(paramString, paramGroupMsgReadedNotify);
  }
  
  public void a(String paramString, AppShareID paramAppShareID)
  {
    this.Y.put(paramString, paramAppShareID);
    if (QLog.isColorLevel()) {
      QLog.d("share_appid", 2, "add share appid to cache = " + paramString);
    }
  }
  
  public void a(String paramString, OpenID paramOpenID)
  {
    this.Z.put(paramString, paramOpenID);
    if (QLog.isColorLevel()) {
      QLog.d("openid", 2, "add openid to cache = " + paramOpenID);
    }
  }
  
  public void a(String paramString1, String paramString2)
  {
    if ((!TextUtils.isEmpty(paramString1)) && (!TextUtils.isEmpty(paramString2)))
    {
      this.jdField_c_of_type_JavaUtilConcurrentConcurrentHashMap.put(paramString1, paramString2);
      if (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() != null)
      {
        SharedPreferences.Editor localEditor = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().getSharedPreferences(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() + "crm", 0).edit();
        localEditor.putString(paramString1 + "ext", paramString2);
        localEditor.commit();
      }
    }
  }
  
  public void a(String paramString, byte[] paramArrayOfByte)
  {
    if (QLog.isColorLevel()) {
      QLog.d(jdField_a_of_type_JavaLangString, 2, "addWpaMsgKey uin:" + this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() + "peerUin:" + paramString + " key:" + HexUtil.a(paramArrayOfByte));
    }
    byte[] arrayOfByte = (byte[])this.t.get(paramString);
    if ((arrayOfByte == null) || (!Arrays.equals(arrayOfByte, paramArrayOfByte)))
    {
      this.t.put(paramString, paramArrayOfByte);
      if (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() != null)
      {
        paramArrayOfByte = HexUtil.a(paramArrayOfByte);
        this.jdField_a_of_type_ComTencentMobileqqServiceMessageMessageCache$AsyncEditor.putString(paramString, paramArrayOfByte);
      }
    }
  }
  
  public void a(String paramString, Object[] paramArrayOfObject)
  {
    ArrayList localArrayList2 = (ArrayList)this.R.get(paramString);
    ArrayList localArrayList1;
    if (localArrayList2 != null)
    {
      localArrayList1 = localArrayList2;
      if (localArrayList2.size() != 0) {}
    }
    else
    {
      localArrayList1 = new ArrayList();
    }
    localArrayList1.add(paramArrayOfObject);
    this.R.put(paramString, localArrayList1);
  }
  
  public void a(ArrayList paramArrayList)
  {
    Object localObject1 = (RevokeMsgInfo)paramArrayList.get(0);
    if (QLog.isColorLevel()) {
      QLog.d("revokeMsg", 2, "RevokeNotifyCache, add cache, " + ((RevokeMsgInfo)localObject1).toString());
    }
    int i2 = ((RevokeMsgInfo)localObject1).jdField_a_of_type_Int;
    Object localObject2 = ((RevokeMsgInfo)localObject1).jdField_a_of_type_JavaLangString;
    int i1;
    if (((RevokeMsgInfo)localObject1).c > 1)
    {
      i1 = 1;
      if (i1 == 0) {
        break label243;
      }
      localObject1 = String.format("%s&%d&%d&%d", new Object[] { localObject2, Integer.valueOf(i2), Integer.valueOf(((RevokeMsgInfo)localObject1).jdField_b_of_type_Int), Integer.valueOf(((RevokeMsgInfo)localObject1).c) });
    }
    for (;;)
    {
      label115:
      if (this.r.containsKey(localObject1))
      {
        localObject1 = (ArrayList)this.r.get(localObject1);
        localObject2 = new ArrayList();
        paramArrayList = paramArrayList.iterator();
        for (;;)
        {
          if (paramArrayList.hasNext())
          {
            RevokeMsgInfo localRevokeMsgInfo1 = (RevokeMsgInfo)paramArrayList.next();
            Iterator localIterator = ((ArrayList)localObject1).iterator();
            RevokeMsgInfo localRevokeMsgInfo2;
            do
            {
              if (!localIterator.hasNext()) {
                break;
              }
              localRevokeMsgInfo2 = (RevokeMsgInfo)localIterator.next();
            } while ((localRevokeMsgInfo1.jdField_a_of_type_Long != localRevokeMsgInfo2.jdField_a_of_type_Long) || (localRevokeMsgInfo1.jdField_b_of_type_Long != localRevokeMsgInfo2.jdField_b_of_type_Long));
            ((ArrayList)localObject2).add(localRevokeMsgInfo1);
            continue;
            i1 = 0;
            break;
            label243:
            localObject1 = String.format("%s&%d&%d", new Object[] { localObject2, Integer.valueOf(i2), Long.valueOf(((RevokeMsgInfo)localObject1).jdField_a_of_type_Long) });
            break label115;
          }
        }
        ((ArrayList)localObject1).addAll((Collection)localObject2);
        return;
      }
    }
    this.r.put(localObject1, paramArrayList);
  }
  
  /* Error */
  public void a(List paramList)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic 470	com/tencent/qphone/base/util/QLog:isColorLevel	()Z
    //   5: ifeq +42 -> 47
    //   8: getstatic 85	com/tencent/mobileqq/service/message/MessageCache:jdField_a_of_type_JavaLangString	Ljava/lang/String;
    //   11: astore_2
    //   12: new 284	java/lang/StringBuilder
    //   15: dup
    //   16: invokespecial 285	java/lang/StringBuilder:<init>	()V
    //   19: ldc_w 925
    //   22: invokevirtual 302	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   25: astore_3
    //   26: aload_1
    //   27: ifnonnull +32 -> 59
    //   30: iconst_0
    //   31: istore 4
    //   33: aload_2
    //   34: iconst_2
    //   35: aload_3
    //   36: iload 4
    //   38: invokevirtual 477	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   41: invokevirtual 305	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   44: invokestatic 481	com/tencent/qphone/base/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   47: aload_0
    //   48: getfield 114	com/tencent/mobileqq/service/message/MessageCache:jdField_b_of_type_JavaUtilArrayList	Ljava/util/ArrayList;
    //   51: aload_1
    //   52: invokevirtual 647	java/util/ArrayList:addAll	(Ljava/util/Collection;)Z
    //   55: pop
    //   56: aload_0
    //   57: monitorexit
    //   58: return
    //   59: aload_1
    //   60: invokeinterface 289 1 0
    //   65: istore 4
    //   67: goto -34 -> 33
    //   70: astore_1
    //   71: aload_0
    //   72: monitorexit
    //   73: aload_1
    //   74: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	75	0	this	MessageCache
    //   0	75	1	paramList	List
    //   11	23	2	str	String
    //   25	11	3	localStringBuilder	StringBuilder
    //   31	35	4	i1	int
    // Exception table:
    //   from	to	target	type
    //   2	26	70	finally
    //   33	47	70	finally
    //   47	56	70	finally
    //   59	67	70	finally
  }
  
  public void a(boolean paramBoolean)
  {
    this.jdField_b_of_type_Boolean = paramBoolean;
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    this.jdField_a_of_type_ArrayOfByte = paramArrayOfByte;
    if (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() != null)
    {
      String str = HexUtil.a(paramArrayOfByte);
      if (QLog.isColorLevel()) {
        QLog.d(jdField_a_of_type_JavaLangString, 2, "--->>setLastSyncCookie lastSyncCookie:" + str);
      }
      if (QLog.isColorLevel()) {
        QLog.d(jdField_a_of_type_JavaLangString, 2, "--->>setBuddyMsgLastSeq cookie = " + HexUtil.a(paramArrayOfByte));
      }
      this.jdField_a_of_type_ComTencentMobileqqServiceMessageMessageCache$AsyncEditor.putString("getMsgV4_vSyncCookie", str);
    }
  }
  
  public void a(String[] paramArrayOfString)
  {
    if (paramArrayOfString == null) {}
    StringBuilder localStringBuilder;
    do
    {
      return;
      localStringBuilder = new StringBuilder(256);
      localStringBuilder.append("removeDiscPullSeqCache, uinArray: ");
      int i2 = paramArrayOfString.length;
      int i1 = 0;
      while (i1 < i2)
      {
        String str = paramArrayOfString[i1];
        localStringBuilder.append(str).append(",");
        if (this.l.containsKey(str)) {
          this.l.remove(str);
        }
        i1 += 1;
      }
    } while (!QLog.isColorLevel());
    QLog.d(jdField_a_of_type_JavaLangString, 2, localStringBuilder.toString());
  }
  
  public boolean a()
  {
    return this.jdField_b_of_type_Boolean;
  }
  
  public boolean a(int paramInt, String paramString, long paramLong)
  {
    paramString = String.valueOf(paramInt) + "_" + paramString + "_" + paramLong;
    return this.N.containsKey(paramString);
  }
  
  public boolean a(long paramLong, String paramString)
  {
    Object localObject = (ArrayList)this.jdField_b_of_type_JavaUtilHashMap.get(Long.valueOf(paramLong));
    if ((localObject == null) || (((ArrayList)localObject).size() == 0)) {
      return false;
    }
    localObject = ((ArrayList)localObject).iterator();
    ((Iterator)localObject).next();
    while (((Iterator)localObject).hasNext()) {
      if (paramString.equals((String)((Iterator)localObject).next())) {
        return true;
      }
    }
    return false;
  }
  
  public boolean a(MessageRecord paramMessageRecord)
  {
    return a(paramMessageRecord.frienduin, paramMessageRecord.istroop, MsgProxyUtils.a(paramMessageRecord));
  }
  
  public boolean a(String paramString, int paramInt1, int paramInt2)
  {
    Iterator localIterator = a(paramString, paramInt1).iterator();
    while (localIterator.hasNext()) {
      if (((Integer)localIterator.next()).intValue() == paramInt2)
      {
        if (QLog.isColorLevel()) {
          QLog.d(jdField_a_of_type_JavaLangString, 2, "long msg id is exist! uin=" + paramString + ",istroop=" + paramInt1 + ",longMsgID=" + paramInt2);
        }
        return true;
      }
    }
    return false;
  }
  
  public boolean a(String paramString, int paramInt, long paramLong)
  {
    if (QLog.isColorLevel()) {
      QLog.d("MsgSend", 2, String.format("removeSendingCache key = %d %s %d", new Object[] { Long.valueOf(paramLong), paramString, Integer.valueOf(paramInt) }));
    }
    paramString = MsgProxyUtils.a(paramString, paramInt);
    Object localObject1;
    Object localObject2;
    boolean bool1;
    if (this.p.containsKey(paramString))
    {
      localObject1 = (ConcurrentHashMap)this.p.get(paramString);
      if (localObject1 != null)
      {
        localObject2 = (MessageCache.MsgSendingInfo)((ConcurrentHashMap)localObject1).remove(Long.valueOf(paramLong));
        if ((localObject2 != null) && (((MessageCache.MsgSendingInfo)localObject2).jdField_b_of_type_Long > 0L))
        {
          long l1 = System.currentTimeMillis() - ((MessageCache.MsgSendingInfo)localObject2).jdField_b_of_type_Long;
          if ((l1 < MessageHandler.ci) && (l1 > 0L))
          {
            bool1 = false;
            bool2 = bool1;
            if (localObject1 != null)
            {
              bool2 = bool1;
              if (((ConcurrentHashMap)localObject1).isEmpty()) {
                this.p.remove(paramString);
              }
            }
          }
        }
      }
    }
    for (boolean bool2 = bool1;; bool2 = true)
    {
      if ((!e()) && (this.q.containsKey(paramString)))
      {
        localObject1 = (ConcurrentHashMap)this.q.get(paramString);
        if (localObject1 != null) {
          ((ConcurrentHashMap)localObject1).remove(Long.valueOf(paramLong));
        }
        if ((localObject1 != null) && (((ConcurrentHashMap)localObject1).isEmpty())) {
          this.q.remove(paramString);
        }
        if (QLog.isColorLevel()) {
          QLog.d(jdField_a_of_type_JavaLangString, 2, "msgSending:delete result in messageSendingTemp " + this.q);
        }
      }
      int i1;
      if (this.M.containsKey(paramString))
      {
        int i2 = 0;
        localObject1 = ((ConcurrentHashMap)this.M.get(paramString)).keySet().iterator();
        do
        {
          paramInt = i2;
          if (!((Iterator)localObject1).hasNext()) {
            break;
          }
          i1 = ((Integer)((Iterator)localObject1).next()).intValue();
          localObject2 = (Set)((ConcurrentHashMap)this.M.get(paramString)).get(Integer.valueOf(i1));
          if (QLog.isColorLevel()) {
            QLog.d(jdField_a_of_type_JavaLangString, 2, String.format("removeSendingCache  longMsgFragmentSet = %s", new Object[] { localObject2 }));
          }
        } while (!((Set)localObject2).contains(Long.valueOf(paramLong)));
        ((Set)localObject2).remove(Long.valueOf(paramLong));
        if (!((Set)localObject2).isEmpty()) {
          break label501;
        }
      }
      label501:
      for (paramInt = i1;; paramInt = 0)
      {
        if (QLog.isColorLevel()) {
          QLog.d(jdField_a_of_type_JavaLangString, 2, "removeSendingCache uniseq=" + paramLong + "longid=" + i1);
        }
        for (;;)
        {
          if (paramInt != 0) {
            ((ConcurrentHashMap)this.M.get(paramString)).remove(Integer.valueOf(paramInt));
          }
          return bool2;
        }
      }
      bool1 = true;
      break;
    }
  }
  
  public boolean a(String paramString1, int paramInt, String paramString2)
  {
    synchronized (this.L)
    {
      paramString1 = a(paramString1, paramInt);
      if (paramString1 == null) {
        return false;
      }
      if (paramString1.containsKey(paramString2))
      {
        if (((Set)paramString1.get(paramString2)).isEmpty())
        {
          paramString1.remove(paramString2);
          return false;
        }
        return true;
      }
    }
    return false;
  }
  
  public boolean a(String paramString, long paramLong1, long paramLong2)
  {
    if (this.jdField_a_of_type_JavaUtilSet.size() == 0) {
      return false;
    }
    paramString = paramString + "_" + paramLong1 + "_" + paramLong2;
    return this.jdField_a_of_type_JavaUtilSet.contains(paramString);
  }
  
  public byte[] a()
  {
    String str;
    if (((this.jdField_a_of_type_ArrayOfByte == null) || (this.jdField_a_of_type_ArrayOfByte.length == 0)) && (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() != null))
    {
      str = this.jdField_a_of_type_AndroidContentSharedPreferences.getString("getMsgV4_vSyncCookie", "");
      if (str.length() != 0) {
        break label97;
      }
    }
    label97:
    for (this.jdField_a_of_type_ArrayOfByte = null;; this.jdField_a_of_type_ArrayOfByte = HexUtil.a(str))
    {
      if (QLog.isColorLevel()) {
        QLog.d(jdField_a_of_type_JavaLangString, 2, "--->>getLastSyncCookie lastSyncCookie:" + HexUtil.a(this.jdField_a_of_type_ArrayOfByte));
      }
      return this.jdField_a_of_type_ArrayOfByte;
    }
  }
  
  public byte[] a(String paramString)
  {
    if (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() == null) {}
    do
    {
      return null;
      if (this.y.containsKey(paramString)) {
        break;
      }
      localObject = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().getSharedPreferences(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() + "pub", 0).getString(paramString, null);
    } while (localObject == null);
    Object localObject = PkgTools.a((String)localObject);
    this.y.put(paramString, localObject);
    return (byte[])this.y.get(paramString);
  }
  
  public Object[] a(String paramString)
  {
    if (this.g.containsKey(paramString)) {
      return (Object[])this.g.get(paramString);
    }
    if (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() != null)
    {
      long l1 = this.jdField_a_of_type_AndroidContentSharedPreferences.getLong("getDiscussionMemberSeq" + paramString, -1L);
      long l2 = this.jdField_a_of_type_AndroidContentSharedPreferences.getLong("getDiscussionConfigSeq" + paramString, -1L);
      if (l1 != 0L) {
        return new Object[] { Long.valueOf(l1), Long.valueOf(l2) };
      }
    }
    return null;
  }
  
  public int b()
  {
    if ((this.jdField_d_of_type_Int <= 0) && (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() != null)) {
      this.jdField_d_of_type_Int = this.jdField_a_of_type_AndroidContentSharedPreferences.getInt("getlastMessageTime", 1);
    }
    if (QLog.isColorLevel()) {
      QLog.d(jdField_a_of_type_JavaLangString, 2, "--->>getBuddyMsgLastSeq: " + this.jdField_d_of_type_Int);
    }
    return this.jdField_d_of_type_Int;
  }
  
  public int b(String paramString)
  {
    if (!this.U.containsKey(paramString)) {
      this.U.put(paramString, Integer.valueOf(2));
    }
    return ((Integer)this.U.get(paramString)).intValue();
  }
  
  public long b()
  {
    if ((this.jdField_a_of_type_Long == -1L) && (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() != null)) {
      this.jdField_a_of_type_Long = this.jdField_a_of_type_AndroidContentSharedPreferences.getLong("getTroopDiscMsgLastTime", 0L);
    }
    if (QLog.isColorLevel()) {
      QLog.d(jdField_a_of_type_JavaLangString, 2, "--->>getTroopAndDiscMsgLastTime lastTime: " + this.jdField_a_of_type_Long);
    }
    return this.jdField_a_of_type_Long;
  }
  
  public long b(String paramString)
  {
    if (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() == null) {
      return 0L;
    }
    if (!this.j.containsKey(paramString))
    {
      long l1 = this.jdField_a_of_type_AndroidContentSharedPreferences.getLong("getTroopExpiredSeq" + paramString, 0L);
      this.j.put(paramString, Long.valueOf(l1));
    }
    return ((Long)this.j.get(paramString)).longValue();
  }
  
  public long b(String paramString, int paramInt)
  {
    Pair localPair = new Pair(paramString, Integer.valueOf(paramInt));
    if (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() == null)
    {
      if (QLog.isColorLevel()) {
        QLog.d(jdField_a_of_type_JavaLangString, 2, "getBreakPointSeq uin = " + paramString + ",type = " + paramInt + " , lastSeqId = " + 0);
      }
      return 0L;
    }
    if (!this.J.containsKey(localPair))
    {
      long l1 = this.jdField_a_of_type_AndroidContentSharedPreferences.getLong("getBreakPointSeq" + paramString + "_" + paramInt, 0L);
      this.J.put(localPair, Long.valueOf(l1));
      if (QLog.isColorLevel()) {
        QLog.d(jdField_a_of_type_JavaLangString, 2, "getBreakPointSeq uin = " + paramString + ",type = " + paramInt + " , lastSeqId = " + l1);
      }
    }
    return ((Long)this.J.get(localPair)).longValue();
  }
  
  public Pair b(String paramString)
  {
    paramString = MD5.toMD5(paramString);
    if (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() == null) {
      return null;
    }
    if (!this.o.containsKey(paramString))
    {
      long l1 = this.jdField_a_of_type_AndroidContentSharedPreferences.getLong("getC2CLastMessageTime" + paramString, 0L);
      long l2 = this.jdField_a_of_type_AndroidContentSharedPreferences.getLong("getC2CLastMessageTimeRand" + paramString, 0L);
      this.o.put(paramString, new Pair(Long.valueOf(l1), Long.valueOf(l2)));
    }
    return (Pair)this.o.get(paramString);
  }
  
  public OpenID b(String paramString)
  {
    return (OpenID)this.Z.get(paramString);
  }
  
  public String b()
  {
    StringBuilder localStringBuilder = new StringBuilder("dumpUnFinishDisMsgJob : ");
    if (this.i.isEmpty()) {
      localStringBuilder.append("AllFinish.");
    }
    for (;;)
    {
      return localStringBuilder.toString();
      Iterator localIterator = this.i.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localStringBuilder.append("disUin:").append(str).append(";");
      }
    }
  }
  
  public ArrayList b()
  {
    try
    {
      if (QLog.isColorLevel()) {
        QLog.d(jdField_a_of_type_JavaLangString, 2, "cloneDiscNumInfoCache size = " + this.jdField_b_of_type_JavaUtilArrayList.size());
      }
      ArrayList localArrayList = (ArrayList)this.jdField_b_of_type_JavaUtilArrayList.clone();
      return localArrayList;
    }
    finally {}
  }
  
  public ArrayList b(long paramLong)
  {
    return (ArrayList)this.T.get(Long.valueOf(paramLong));
  }
  
  public ArrayList b(String paramString)
  {
    return (ArrayList)this.V.get(paramString);
  }
  
  public ConcurrentHashMap b()
  {
    return this.R;
  }
  
  public void b()
  {
    if (QLog.isColorLevel()) {
      QLog.d(jdField_a_of_type_JavaLangString, 2, "clearDiscPullSeqCache");
    }
    this.l.clear();
  }
  
  public void b(int paramInt)
  {
    if (c() != paramInt)
    {
      this.jdField_f_of_type_Int = paramInt;
      this.jdField_a_of_type_ComTencentMobileqqServiceMessageMessageCache$AsyncEditor.putInt("msgsignal_switch", paramInt);
      if (QLog.isColorLevel()) {
        QLog.d(jdField_a_of_type_JavaLangString, 2, "--->>setMsgSignalSwitch = " + paramInt);
      }
    }
  }
  
  public void b(long paramLong)
  {
    this.T.remove(Long.valueOf(paramLong));
  }
  
  public void b(long paramLong, List paramList)
  {
    ArrayList localArrayList2 = (ArrayList)this.T.get(Long.valueOf(paramLong));
    ArrayList localArrayList1;
    if (localArrayList2 != null)
    {
      localArrayList1 = localArrayList2;
      if (localArrayList2.size() != 0) {}
    }
    else
    {
      localArrayList1 = new ArrayList();
    }
    localArrayList1.addAll(paramList);
    this.T.put(Long.valueOf(paramLong), localArrayList1);
  }
  
  public void b(MessageRecord paramMessageRecord)
  {
    String str = String.valueOf(paramMessageRecord.istroop) + "_" + paramMessageRecord.frienduin + "_" + paramMessageRecord.uniseq;
    this.N.put(str, paramMessageRecord);
  }
  
  public void b(String paramString)
  {
    this.R.remove(paramString);
  }
  
  public void b(String paramString, int paramInt)
  {
    this.U.put(paramString, Integer.valueOf(paramInt));
    if (paramInt != 0)
    {
      if (QLog.isColorLevel())
      {
        StringBuilder localStringBuilder = new StringBuilder(128);
        localStringBuilder.append("setDiscussionMsgState discussionUin: ").append(paramString).append(" state: ").append(paramInt);
        QLog.d(jdField_a_of_type_JavaLangString, 2, localStringBuilder.toString());
      }
      if (paramInt == 2) {
        h(paramString);
      }
    }
  }
  
  public void b(String paramString, int paramInt, long paramLong)
  {
    this.K.put(new Pair(paramString, Integer.valueOf(paramInt)), Long.valueOf(paramLong));
    if (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() != null) {
      this.jdField_a_of_type_ComTencentMobileqqServiceMessageMessageCache$AsyncEditor.putLong("getAIOLastSeq" + paramString + "_" + paramInt, paramLong);
    }
  }
  
  public void b(String paramString, long paramLong)
  {
    paramLong = Math.max(paramLong, b(paramString));
    if (QLog.isColorLevel()) {
      QLog.d(jdField_a_of_type_JavaLangString, 2, "addGroupExpiredSeq " + paramLong);
    }
    this.j.put(paramString, Long.valueOf(paramLong));
    if (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() != null) {
      this.jdField_a_of_type_ComTencentMobileqqServiceMessageMessageCache$AsyncEditor.putLong("getTroopExpiredSeq" + paramString, paramLong);
    }
  }
  
  public void b(String paramString, long paramLong1, long paramLong2)
  {
    paramString = MD5.toMD5(paramString);
    this.o.put(paramString, new Pair(Long.valueOf(paramLong1), Long.valueOf(paramLong2)));
    if (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() != null)
    {
      this.jdField_a_of_type_ComTencentMobileqqServiceMessageMessageCache$AsyncEditor.putLong("getC2CLastMessageTime" + paramString, paramLong1);
      this.jdField_a_of_type_ComTencentMobileqqServiceMessageMessageCache$AsyncEditor.putLong("getC2CLastMessageTimeRand" + paramString, paramLong2);
    }
  }
  
  public void b(String paramString, byte[] paramArrayOfByte)
  {
    if (QLog.isColorLevel()) {
      QLog.d(jdField_a_of_type_JavaLangString, 2, "addPCQQSearchMsgKey uin:" + this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() + "peerUin:" + paramString + " key:" + HexUtil.a(paramArrayOfByte));
    }
    byte[] arrayOfByte = (byte[])this.u.get(paramString);
    if ((arrayOfByte == null) || (!Arrays.equals(arrayOfByte, paramArrayOfByte)))
    {
      this.u.put(paramString, paramArrayOfByte);
      if (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() != null)
      {
        paramArrayOfByte = HexUtil.a(paramArrayOfByte);
        this.jdField_a_of_type_ComTencentMobileqqServiceMessageMessageCache$AsyncEditor.putString(paramString, paramArrayOfByte);
      }
    }
  }
  
  public void b(String paramString, Object[] paramArrayOfObject)
  {
    if (paramString != null)
    {
      this.g.put(paramString, paramArrayOfObject);
      if (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() != null)
      {
        this.jdField_a_of_type_ComTencentMobileqqServiceMessageMessageCache$AsyncEditor.putLong("getDiscussionMemberSeq" + paramString, ((Long)paramArrayOfObject[0]).longValue());
        this.jdField_a_of_type_ComTencentMobileqqServiceMessageMessageCache$AsyncEditor.putLong("getDiscussionConfigSeq" + paramString, ((Long)paramArrayOfObject[1]).longValue());
      }
    }
  }
  
  public void b(List paramList)
  {
    if ((paramList != null) && (!paramList.isEmpty()))
    {
      paramList = paramList.iterator();
      while (paramList.hasNext()) {
        a((MessageRecord)paramList.next());
      }
    }
  }
  
  public void b(boolean paramBoolean)
  {
    this.jdField_a_of_type_Boolean = paramBoolean;
  }
  
  public void b(byte[] paramArrayOfByte)
  {
    this.jdField_b_of_type_ArrayOfByte = paramArrayOfByte;
    if (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() != null)
    {
      paramArrayOfByte = HexUtil.a(paramArrayOfByte);
      if (QLog.isColorLevel()) {
        QLog.d(jdField_a_of_type_JavaLangString, 2, "--->>setLastPubAccountCookie lastPACookie:" + paramArrayOfByte);
      }
      this.jdField_a_of_type_ComTencentMobileqqServiceMessageMessageCache$AsyncEditor.putString("getMsgV4_vPubAccountCookie", paramArrayOfByte);
    }
  }
  
  public boolean b()
  {
    if (QLog.isColorLevel()) {
      QLog.d(jdField_a_of_type_JavaLangString, 2, "isDiscPullSeqFinish size = " + this.l.size());
    }
    return this.l.isEmpty();
  }
  
  public boolean b(MessageRecord paramMessageRecord)
  {
    if (paramMessageRecord == null) {}
    Object localObject;
    do
    {
      do
      {
        return false;
        localObject = MsgProxyUtils.a(paramMessageRecord.frienduin, paramMessageRecord.istroop);
        if (paramMessageRecord.isLongMsg())
        {
          if ((this.M.containsKey(localObject)) && (((ConcurrentHashMap)this.M.get(localObject)).containsKey(Integer.valueOf(paramMessageRecord.longMsgId)))) {}
          for (boolean bool = true;; bool = false) {
            return bool;
          }
        }
      } while (!this.p.containsKey(localObject));
      localObject = (ConcurrentHashMap)this.p.get(localObject);
    } while ((localObject == null) || (!((ConcurrentHashMap)localObject).containsKey(Long.valueOf(paramMessageRecord.uniseq))));
    return true;
  }
  
  public boolean b(String paramString, int paramInt, long paramLong)
  {
    if (this.jdField_b_of_type_ComTencentMobileqqDataMessageRecord == null) {}
    while ((!this.jdField_b_of_type_ComTencentMobileqqDataMessageRecord.frienduin.equals(paramString)) || (this.jdField_b_of_type_ComTencentMobileqqDataMessageRecord.istroop != paramInt) || (this.jdField_b_of_type_ComTencentMobileqqDataMessageRecord.uniseq != paramLong)) {
      return false;
    }
    return true;
  }
  
  public byte[] b()
  {
    if ((this.jdField_b_of_type_ArrayOfByte == null) && (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() != null)) {
      this.jdField_b_of_type_ArrayOfByte = HexUtil.a(this.jdField_a_of_type_AndroidContentSharedPreferences.getString("getMsgV4_vPubAccountCookie", ""));
    }
    if (QLog.isColorLevel()) {
      QLog.d(jdField_a_of_type_JavaLangString, 2, "--->>getLastPubAccountCookie lastPACookie:" + HexUtil.a(this.jdField_b_of_type_ArrayOfByte));
    }
    return this.jdField_b_of_type_ArrayOfByte;
  }
  
  public byte[] b(String paramString)
  {
    if (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() == null) {
      if (QLog.isColorLevel()) {
        QLog.d(jdField_a_of_type_JavaLangString, 2, "getWpaMsgKey uin:null peerUin:" + paramString + " key:null");
      }
    }
    do
    {
      return null;
      if (this.t.containsKey(paramString)) {
        break label150;
      }
      localObject = this.jdField_a_of_type_AndroidContentSharedPreferences.getString(paramString, null);
      if (localObject != null) {
        break;
      }
    } while (!QLog.isColorLevel());
    QLog.d(jdField_a_of_type_JavaLangString, 2, "getWpaMsgKey uin:" + this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() + "peerUin:" + paramString + " key:null");
    return null;
    Object localObject = HexUtil.a((String)localObject);
    this.t.put(paramString, localObject);
    label150:
    if (QLog.isColorLevel()) {
      QLog.d(jdField_a_of_type_JavaLangString, 2, "getWpaMsgKey uin:" + this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() + "peerUin:" + paramString + " key:" + HexUtil.a((byte[])this.t.get(paramString)));
    }
    return (byte[])this.t.get(paramString);
  }
  
  public Object[] b(String paramString)
  {
    if (this.jdField_f_of_type_JavaUtilConcurrentConcurrentHashMap.containsKey(paramString)) {
      return (Object[])this.jdField_f_of_type_JavaUtilConcurrentConcurrentHashMap.get(paramString);
    }
    if (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() != null)
    {
      long l1 = this.jdField_a_of_type_AndroidContentSharedPreferences.getLong("getTroopMemberSeq" + paramString, -1L);
      long l2 = this.jdField_a_of_type_AndroidContentSharedPreferences.getLong("getTroopConfigSeq" + paramString, -1L);
      if (l1 != 0L) {
        return new Object[] { Long.valueOf(l1), Long.valueOf(l2) };
      }
    }
    return null;
  }
  
  public int c()
  {
    if (this.jdField_f_of_type_Int < 0) {
      if (!this.jdField_a_of_type_AndroidContentSharedPreferences.contains("msgsignal_switch")) {
        break label44;
      }
    }
    label44:
    for (this.jdField_f_of_type_Int = this.jdField_a_of_type_AndroidContentSharedPreferences.getInt("msgsignal_switch", 0);; this.jdField_f_of_type_Int = 0) {
      return this.jdField_f_of_type_Int;
    }
  }
  
  public long c()
  {
    return this.jdField_b_of_type_Long;
  }
  
  public long c(String paramString)
  {
    if (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() == null) {
      return 0L;
    }
    if (!this.k.containsKey(paramString))
    {
      long l1 = this.jdField_a_of_type_AndroidContentSharedPreferences.getLong("getDiscussionExpiredSeq" + paramString, 0L);
      this.k.put(paramString, Long.valueOf(l1));
    }
    return ((Long)this.k.get(paramString)).longValue();
  }
  
  public long c(String paramString, int paramInt)
  {
    Pair localPair = new Pair(paramString, Integer.valueOf(paramInt));
    if (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() == null) {
      return 0L;
    }
    if (!this.K.containsKey(localPair))
    {
      long l1 = this.jdField_a_of_type_AndroidContentSharedPreferences.getLong("getAIOLastSeq" + paramString + "_" + paramInt, 0L);
      this.K.put(localPair, Long.valueOf(l1));
    }
    return ((Long)this.K.get(localPair)).longValue();
  }
  
  public ConcurrentHashMap c()
  {
    return this.U;
  }
  
  public void c()
  {
    this.O.clear();
  }
  
  public void c(long paramLong)
  {
    if (this.jdField_a_of_type_Long < paramLong)
    {
      this.jdField_a_of_type_Long = paramLong;
      if (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() != null)
      {
        if (QLog.isColorLevel()) {
          QLog.d(jdField_a_of_type_JavaLangString, 2, "--->>setTroopAndDiscMsgLastTime lastTime: " + paramLong);
        }
        this.jdField_a_of_type_ComTencentMobileqqServiceMessageMessageCache$AsyncEditor.putLong("getTroopDiscMsgLastTime", this.jdField_a_of_type_Long);
      }
    }
  }
  
  public void c(MessageRecord paramMessageRecord)
  {
    paramMessageRecord = paramMessageRecord.frienduin + "_" + paramMessageRecord.msgUid + "_" + paramMessageRecord.shmsgseq;
    this.jdField_a_of_type_JavaUtilSet.add(paramMessageRecord);
  }
  
  public void c(String paramString)
  {
    if (paramString != null) {
      this.l.put(paramString, Boolean.valueOf(true));
    }
  }
  
  public void c(String paramString, int paramInt, long paramLong)
  {
    this.J.put(new Pair(paramString, Integer.valueOf(paramInt)), Long.valueOf(paramLong));
    if (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() != null) {
      this.jdField_a_of_type_ComTencentMobileqqServiceMessageMessageCache$AsyncEditor.putLong("getBreakPointSeq" + paramString + "_" + paramInt, paramLong);
    }
  }
  
  public void c(String paramString, long paramLong)
  {
    paramLong = Math.max(paramLong, c(paramString));
    if (QLog.isColorLevel()) {
      QLog.d(jdField_a_of_type_JavaLangString, 2, "addDiscExpiredSeq " + paramLong);
    }
    this.k.put(paramString, Long.valueOf(paramLong));
    if (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() != null) {
      this.jdField_a_of_type_ComTencentMobileqqServiceMessageMessageCache$AsyncEditor.putLong("getDiscussionExpiredSeq" + paramString, paramLong);
    }
  }
  
  public void c(String paramString, byte[] paramArrayOfByte)
  {
    if (QLog.isColorLevel()) {
      QLog.d(jdField_a_of_type_JavaLangString, 2, "addBusinessCrmMsgKey----> sig:" + HexUtil.a(paramArrayOfByte) + ",length:" + paramArrayOfByte.length);
    }
    byte[] arrayOfByte = (byte[])this.v.get(paramString);
    if ((arrayOfByte == null) || (!Arrays.equals(arrayOfByte, paramArrayOfByte)))
    {
      this.v.put(paramString, paramArrayOfByte);
      if (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() != null)
      {
        paramArrayOfByte = HexUtil.a(paramArrayOfByte);
        this.jdField_a_of_type_ComTencentMobileqqServiceMessageMessageCache$AsyncEditor.putString(paramString, paramArrayOfByte);
      }
    }
  }
  
  public void c(String paramString, Object[] paramArrayOfObject)
  {
    if (paramString != null)
    {
      this.jdField_f_of_type_JavaUtilConcurrentConcurrentHashMap.put(paramString, paramArrayOfObject);
      if (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() != null)
      {
        this.jdField_a_of_type_ComTencentMobileqqServiceMessageMessageCache$AsyncEditor.putLong("getTroopMemberSeq" + paramString, ((Long)paramArrayOfObject[0]).longValue());
        this.jdField_a_of_type_ComTencentMobileqqServiceMessageMessageCache$AsyncEditor.putLong("getTroopConfigSeq" + paramString, ((Long)paramArrayOfObject[1]).longValue());
      }
    }
  }
  
  public boolean c()
  {
    return this.h.isEmpty();
  }
  
  public boolean c(MessageRecord paramMessageRecord)
  {
    boolean bool = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().b(paramMessageRecord);
    if ((paramMessageRecord.msgtype == 64485) || (paramMessageRecord.msgtype == 64501)) {}
    do
    {
      return bool;
      if ((!bool) || (paramMessageRecord.isLongMsg()) || ((paramMessageRecord.istroop != 0) && (paramMessageRecord.istroop != 1) && (paramMessageRecord.istroop != 3000))) {
        break;
      }
      Object localObject = MsgProxyUtils.a(paramMessageRecord.frienduin, paramMessageRecord.istroop);
      localObject = (ConcurrentHashMap)this.p.get(localObject);
      if (localObject == null) {
        break;
      }
      paramMessageRecord = (MessageCache.MsgSendingInfo)((ConcurrentHashMap)localObject).get(Long.valueOf(paramMessageRecord.uniseq));
      if (paramMessageRecord == null) {
        break;
      }
      long l1 = System.currentTimeMillis() - paramMessageRecord.jdField_b_of_type_Long;
      if ((l1 >= MessageHandler.ci) || (l1 <= 0L)) {
        break;
      }
      bool = false;
    } while (!QLog.isDevelopLevel());
    QLog.d("MsgSend", 4, "isStartSendingUI, " + false);
    return false;
    return bool;
  }
  
  public byte[] c(String paramString)
  {
    if (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() == null) {
      if (QLog.isColorLevel()) {
        QLog.d(jdField_a_of_type_JavaLangString, 2, "pcQQSearchKey uin:null peerUin:" + paramString + " key:null");
      }
    }
    do
    {
      return null;
      if (this.u.containsKey(paramString)) {
        break label150;
      }
      localObject = this.jdField_a_of_type_AndroidContentSharedPreferences.getString(paramString, null);
      if (localObject != null) {
        break;
      }
    } while (!QLog.isColorLevel());
    QLog.d(jdField_a_of_type_JavaLangString, 2, "pcQQSearchKey uin:" + this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() + "peerUin:" + paramString + " key:null");
    return null;
    Object localObject = HexUtil.a((String)localObject);
    this.u.put(paramString, localObject);
    label150:
    if (QLog.isColorLevel()) {
      QLog.d(jdField_a_of_type_JavaLangString, 2, "pcQQSearchKey uin:" + this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() + "peerUin:" + paramString + " key:" + HexUtil.a((byte[])this.u.get(paramString)));
    }
    return (byte[])this.u.get(paramString);
  }
  
  public long d(String paramString)
  {
    String str = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a();
    if (str == null) {
      return 0L;
    }
    if (!this.I.containsKey(paramString))
    {
      long l1 = this.jdField_a_of_type_AndroidContentSharedPreferences.getLong(paramString + str, 0L);
      this.I.put(paramString, Long.valueOf(l1));
    }
    return ((Long)this.I.get(paramString)).longValue();
  }
  
  public ConcurrentHashMap d()
  {
    return this.V;
  }
  
  public void d()
  {
    if (!this.p.isEmpty())
    {
      JSONArray localJSONArray = new JSONArray();
      Iterator localIterator = this.p.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (Map.Entry)localIterator.next();
        if ((((Map.Entry)localObject).getValue() != null) && (!((ConcurrentHashMap)((Map.Entry)localObject).getValue()).isEmpty()))
        {
          localObject = ((ConcurrentHashMap)((Map.Entry)localObject).getValue()).entrySet().iterator();
          while (((Iterator)localObject).hasNext())
          {
            Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
            JSONObject localJSONObject = new JSONObject();
            try
            {
              localJSONObject.put("uin", ((MessageCache.MsgSendingInfo)localEntry.getValue()).jdField_a_of_type_JavaLangString);
              localJSONObject.put("type", ((MessageCache.MsgSendingInfo)localEntry.getValue()).jdField_a_of_type_Int);
              localJSONObject.put("uniseq", ((MessageCache.MsgSendingInfo)localEntry.getValue()).jdField_a_of_type_Long);
              localJSONArray.put(localJSONObject);
            }
            catch (JSONException localJSONException)
            {
              localJSONException.printStackTrace();
            }
          }
        }
      }
      if (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() != null)
      {
        this.jdField_a_of_type_ComTencentMobileqqServiceMessageMessageCache$AsyncEditor.putString("msgSending", localJSONArray.toString());
        if (QLog.isColorLevel()) {
          QLog.d(jdField_a_of_type_JavaLangString, 2, "msgSending:write msgSending file before exit," + localJSONArray.toString());
        }
      }
    }
    e();
    this.jdField_d_of_type_Int = -1;
    this.jdField_e_of_type_JavaUtilConcurrentConcurrentHashMap.clear();
    this.R.clear();
    this.m.clear();
    this.V.clear();
    this.W.clear();
    this.X.clear();
    this.o.clear();
    this.jdField_b_of_type_Long = 0L;
    this.Y.clear();
    this.Z.clear();
    this.jdField_c_of_type_JavaUtilArrayList.clear();
    this.p.clear();
    this.q.clear();
    this.jdField_f_of_type_JavaUtilConcurrentConcurrentHashMap.clear();
    this.g.clear();
    this.i.clear();
    this.h.clear();
    this.H.clear();
    if (this.jdField_a_of_type_ComTencentMobileqqServiceMessageMessageCacheItem != null) {
      this.jdField_a_of_type_ComTencentMobileqqServiceMessageMessageCacheItem.a();
    }
  }
  
  public void d(long paramLong)
  {
    this.jdField_b_of_type_Long = paramLong;
  }
  
  public void d(MessageRecord paramMessageRecord)
  {
    String str = MsgProxyUtils.a(paramMessageRecord.frienduin, paramMessageRecord.istroop);
    Object localObject1 = new MessageCache.MsgSendingInfo(this, paramMessageRecord.frienduin, paramMessageRecord.istroop, paramMessageRecord.uniseq, System.currentTimeMillis());
    if (this.p.containsKey(str))
    {
      localObject2 = (ConcurrentHashMap)this.p.get(str);
      if (localObject2 != null) {
        ((ConcurrentHashMap)localObject2).put(Long.valueOf(paramMessageRecord.uniseq), localObject1);
      }
    }
    for (;;)
    {
      if (paramMessageRecord.isLongMsg())
      {
        if (!this.M.containsKey(str)) {
          break label275;
        }
        if (!((ConcurrentHashMap)this.M.get(str)).containsKey(Integer.valueOf(paramMessageRecord.longMsgId))) {
          break;
        }
        ((HashSet)((ConcurrentHashMap)this.M.get(str)).get(Integer.valueOf(paramMessageRecord.longMsgId))).add(Long.valueOf(paramMessageRecord.uniseq));
      }
      return;
      localObject2 = new ConcurrentHashMap();
      ((ConcurrentHashMap)localObject2).put(Long.valueOf(paramMessageRecord.uniseq), localObject1);
      this.p.put(str, localObject2);
      continue;
      localObject2 = new ConcurrentHashMap();
      ((ConcurrentHashMap)localObject2).put(Long.valueOf(paramMessageRecord.uniseq), localObject1);
      this.p.put(str, localObject2);
    }
    localObject1 = new HashSet();
    ((HashSet)localObject1).add(Long.valueOf(paramMessageRecord.uniseq));
    ((ConcurrentHashMap)this.M.get(str)).put(Integer.valueOf(paramMessageRecord.longMsgId), localObject1);
    return;
    label275:
    localObject1 = new ConcurrentHashMap();
    Object localObject2 = new HashSet();
    ((HashSet)localObject2).add(Long.valueOf(paramMessageRecord.uniseq));
    ((ConcurrentHashMap)localObject1).put(Integer.valueOf(paramMessageRecord.longMsgId), localObject2);
    this.M.put(str, localObject1);
  }
  
  public void d(String paramString)
  {
    this.V.remove(paramString);
  }
  
  public void d(String paramString, int paramInt, long paramLong)
  {
    String str = MsgProxyUtils.a(paramString, paramInt);
    paramString = new MessageCache.MsgSendingInfo(this, paramString, paramInt, paramLong, 0L);
    ConcurrentHashMap localConcurrentHashMap;
    if (this.q.containsKey(str))
    {
      localConcurrentHashMap = (ConcurrentHashMap)this.q.get(str);
      if (localConcurrentHashMap != null) {
        localConcurrentHashMap.put(Long.valueOf(paramLong), paramString);
      }
    }
    for (;;)
    {
      if (QLog.isColorLevel()) {
        QLog.d(jdField_a_of_type_JavaLangString, 2, "msgSending:addSendingCacheTemp,msgSendingTemp:" + this.q + " msgCache:" + hashCode());
      }
      return;
      localConcurrentHashMap = new ConcurrentHashMap();
      localConcurrentHashMap.put(Long.valueOf(paramLong), paramString);
      this.q.put(str, localConcurrentHashMap);
      continue;
      localConcurrentHashMap = new ConcurrentHashMap();
      localConcurrentHashMap.put(Long.valueOf(paramLong), paramString);
      this.q.put(str, localConcurrentHashMap);
    }
  }
  
  public void d(String paramString, long paramLong)
  {
    this.I.put(paramString, Long.valueOf(paramLong));
    String str = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a();
    if (str != null) {
      this.jdField_a_of_type_ComTencentMobileqqServiceMessageMessageCache$AsyncEditor.putLong(paramString + str, paramLong).commit();
    }
  }
  
  public void d(String paramString, byte[] paramArrayOfByte)
  {
    if (QLog.isColorLevel()) {
      QLog.d(jdField_a_of_type_JavaLangString, 2, "addBusinessCrmSigt uin:" + this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() + "peerUin:" + paramString + " key:" + HexUtil.a(paramArrayOfByte));
    }
    byte[] arrayOfByte = (byte[])this.w.get(paramString);
    if ((arrayOfByte == null) || (!Arrays.equals(arrayOfByte, paramArrayOfByte))) {
      this.w.put(paramString, paramArrayOfByte);
    }
  }
  
  public void d(String paramString, Object[] paramArrayOfObject)
  {
    ArrayList localArrayList2 = (ArrayList)this.V.get(paramString);
    ArrayList localArrayList1;
    if (localArrayList2 != null)
    {
      localArrayList1 = localArrayList2;
      if (localArrayList2.size() != 0) {}
    }
    else
    {
      localArrayList1 = new ArrayList();
    }
    localArrayList1.add(paramArrayOfObject);
    this.V.put(paramString, localArrayList1);
  }
  
  public boolean d()
  {
    return this.i.isEmpty();
  }
  
  public boolean d(MessageRecord paramMessageRecord)
  {
    if ((paramMessageRecord.isLongMsg()) && ((paramMessageRecord instanceof MessageForLongMsg))) {
      paramMessageRecord = ((MessageForLongMsg)paramMessageRecord).longMsgFragmentList.iterator();
    }
    while (paramMessageRecord.hasNext()) {
      if (((MessageRecord)paramMessageRecord.next()).extraflag != 0)
      {
        return true;
        if (paramMessageRecord.extraflag != 0) {
          return true;
        }
      }
    }
    return false;
  }
  
  public byte[] d(String paramString)
  {
    if (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() == null) {
      if (QLog.isColorLevel()) {
        QLog.d(jdField_a_of_type_JavaLangString, 2, "getBusinessCrmKey uin:null peerUin:" + paramString + " key:null");
      }
    }
    do
    {
      return null;
      if (this.v.containsKey(paramString)) {
        break label150;
      }
      localObject = this.jdField_a_of_type_AndroidContentSharedPreferences.getString(paramString, null);
      if (localObject != null) {
        break;
      }
    } while (!QLog.isColorLevel());
    QLog.d(jdField_a_of_type_JavaLangString, 2, "businessCrmKey uin:" + this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() + "peerUin:" + paramString + " key:null");
    return null;
    Object localObject = HexUtil.a((String)localObject);
    this.v.put(paramString, localObject);
    label150:
    if (QLog.isColorLevel()) {
      QLog.d(jdField_a_of_type_JavaLangString, 2, "businessCrmKey uin:" + this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() + "peerUin:" + paramString + " key:" + HexUtil.a((byte[])this.v.get(paramString)));
    }
    return (byte[])this.v.get(paramString);
  }
  
  public long e(String paramString)
  {
    if (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() == null) {
      return 0L;
    }
    if (!this.H.containsKey(paramString))
    {
      long l1 = this.jdField_a_of_type_AndroidContentSharedPreferences.getLong("getFriendFeedLastTime" + paramString, -1L);
      this.H.put(paramString, Long.valueOf(l1));
    }
    return ((Long)this.H.get(paramString)).longValue();
  }
  
  public ConcurrentHashMap e()
  {
    return this.q;
  }
  
  public void e()
  {
    if (this.jdField_a_of_type_ComTencentMobileqqServiceMessageMessageCache$AsyncEditor != null)
    {
      if (QLog.isColorLevel()) {
        QLog.d(jdField_a_of_type_JavaLangString, 2, "msgCache commit.");
      }
      this.jdField_a_of_type_ComTencentMobileqqServiceMessageMessageCache$AsyncEditor.commit();
    }
  }
  
  public void e(MessageRecord paramMessageRecord)
  {
    this.jdField_a_of_type_ComTencentMobileqqDataMessageRecord = paramMessageRecord;
  }
  
  public void e(String paramString)
  {
    this.h.put(paramString, Boolean.valueOf(true));
  }
  
  public void e(String paramString, long paramLong)
  {
    this.H.put(paramString, Long.valueOf(paramLong));
    if (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() != null) {
      this.jdField_a_of_type_ComTencentMobileqqServiceMessageMessageCache$AsyncEditor.putLong("getFriendFeedLastTime" + paramString, paramLong);
    }
  }
  
  public void e(String paramString, byte[] paramArrayOfByte) {}
  
  public boolean e()
  {
    return (this.q == null) || (this.q.isEmpty());
  }
  
  public boolean e(MessageRecord paramMessageRecord)
  {
    if (this.jdField_a_of_type_ComTencentMobileqqDataMessageRecord == null) {}
    boolean bool;
    label45:
    MessageRecord localMessageRecord;
    do
    {
      return false;
      if ((!paramMessageRecord.isLongMsg()) || (!(this.jdField_a_of_type_ComTencentMobileqqDataMessageRecord instanceof MessageForLongMsg))) {
        break label117;
      }
      Iterator localIterator = ((MessageForLongMsg)this.jdField_a_of_type_ComTencentMobileqqDataMessageRecord).longMsgFragmentList.iterator();
      bool = false;
      if (!localIterator.hasNext()) {
        break;
      }
      localMessageRecord = (MessageRecord)localIterator.next();
    } while (localMessageRecord.extraflag != 0);
    if ((localMessageRecord.frienduin.equals(paramMessageRecord.frienduin)) && (localMessageRecord.istroop == paramMessageRecord.istroop) && (localMessageRecord.uniseq == paramMessageRecord.uniseq)) {
      bool = true;
    }
    for (;;)
    {
      break label45;
      return bool;
      label117:
      if ((this.jdField_a_of_type_ComTencentMobileqqDataMessageRecord != paramMessageRecord) || (this.jdField_a_of_type_ComTencentMobileqqDataMessageRecord.extraflag != 0)) {
        break;
      }
      return true;
    }
  }
  
  public byte[] e(String paramString)
  {
    if (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() == null) {
      if (QLog.isColorLevel()) {
        QLog.d(jdField_a_of_type_JavaLangString, 2, "businessCrmSigt uin:null peerUin:" + paramString + " key:null");
      }
    }
    while (!this.w.containsKey(paramString)) {
      return null;
    }
    if (QLog.isColorLevel()) {
      QLog.d(jdField_a_of_type_JavaLangString, 2, "businessCrmSigt uin:" + this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() + "peerUin:" + paramString + " key:" + HexUtil.a((byte[])this.w.get(paramString)));
    }
    return (byte[])this.w.get(paramString);
  }
  
  public long f(String paramString)
  {
    paramString = (Long)this.O.get(paramString);
    if (paramString == null) {
      return 0L;
    }
    return paramString.longValue();
  }
  
  public ConcurrentHashMap f()
  {
    return this.r;
  }
  
  public void f()
  {
    if (QLog.isColorLevel()) {
      QLog.d(jdField_a_of_type_JavaLangString, 2, "dumpGroupMsgJob size = " + this.h.size());
    }
  }
  
  public void f(MessageRecord paramMessageRecord)
  {
    this.jdField_b_of_type_ComTencentMobileqqDataMessageRecord = paramMessageRecord;
  }
  
  public void f(String paramString)
  {
    if (this.h.containsKey(paramString)) {
      this.h.remove(paramString);
    }
  }
  
  public void f(String paramString, long paramLong)
  {
    this.O.put(paramString, Long.valueOf(paramLong));
  }
  
  public void f(String paramString, byte[] paramArrayOfByte)
  {
    Object localObject = (byte[])this.y.get(paramString);
    if ((localObject == null) || (!localObject.equals(paramArrayOfByte)))
    {
      this.y.put(paramString, paramArrayOfByte);
      if (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() != null)
      {
        localObject = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().getSharedPreferences(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() + "pub", 0);
        paramArrayOfByte = PkgTools.b(paramArrayOfByte);
        localObject = ((SharedPreferences)localObject).edit();
        ((SharedPreferences.Editor)localObject).putString(paramString, paramArrayOfByte);
        ((SharedPreferences.Editor)localObject).commit();
      }
    }
  }
  
  public boolean f()
  {
    return this.jdField_a_of_type_Boolean;
  }
  
  public boolean f(MessageRecord paramMessageRecord)
  {
    if (this.r.isEmpty()) {
      return false;
    }
    if (paramMessageRecord.isLongMsg()) {}
    for (String str = String.format("%s&%d&%d&%d", new Object[] { paramMessageRecord.frienduin, Integer.valueOf(paramMessageRecord.istroop), Integer.valueOf(paramMessageRecord.longMsgId), Integer.valueOf(paramMessageRecord.longMsgCount) }); this.r.containsKey(str); str = String.format("%s&%d&%d", new Object[] { paramMessageRecord.frienduin, Integer.valueOf(paramMessageRecord.istroop), Long.valueOf(paramMessageRecord.shmsgseq) }))
    {
      if (QLog.isColorLevel()) {
        QLog.d("revokeMsg", 2, "RevokeNotifyCache, msgFilter true, " + paramMessageRecord.toString());
      }
      return true;
    }
    return false;
  }
  
  public byte[] f(String paramString)
  {
    return null;
  }
  
  public long g(String paramString)
  {
    if (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() == null) {
      return 0L;
    }
    if (!this.m.containsKey(paramString))
    {
      long l1 = this.jdField_a_of_type_AndroidContentSharedPreferences.getLong("getDiscussionLastMessageTime" + paramString, 0L);
      this.m.put(paramString, Long.valueOf(l1));
    }
    return ((Long)this.m.get(paramString)).longValue();
  }
  
  public void g()
  {
    if (QLog.isColorLevel()) {
      QLog.d(jdField_a_of_type_JavaLangString, 2, "dumpDiscMsgJob size = " + this.i.size());
    }
  }
  
  public void g(String paramString)
  {
    this.i.put(paramString, Boolean.valueOf(true));
  }
  
  public void g(String paramString, long paramLong)
  {
    paramLong = Math.max(paramLong, g(paramString));
    if (QLog.isColorLevel()) {
      QLog.d(jdField_a_of_type_JavaLangString, 2, "addDiscussionMsgLastSeq " + paramLong);
    }
    this.m.put(paramString, Long.valueOf(paramLong));
    if (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() != null) {
      this.jdField_a_of_type_ComTencentMobileqqServiceMessageMessageCache$AsyncEditor.putLong("getDiscussionLastMessageTime" + paramString, paramLong);
    }
  }
  
  public void g(String paramString, byte[] paramArrayOfByte)
  {
    Object localObject = (byte[])this.z.get(paramString);
    if ((localObject == null) || (!Arrays.equals((byte[])localObject, paramArrayOfByte)))
    {
      this.z.put(paramString, paramArrayOfByte);
      if (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() != null)
      {
        localObject = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().getSharedPreferences(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() + "same_state", 0);
        paramArrayOfByte = PkgTools.b(paramArrayOfByte);
        localObject = ((SharedPreferences)localObject).edit();
        ((SharedPreferences.Editor)localObject).putString(paramString, paramArrayOfByte);
        ((SharedPreferences.Editor)localObject).commit();
      }
    }
  }
  
  public byte[] g(String paramString)
  {
    if (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() == null) {}
    do
    {
      return null;
      if (this.D.containsKey(paramString)) {
        break;
      }
      localObject = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().getSharedPreferences(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() + "circle_group", 0).getString(paramString, null);
    } while (localObject == null);
    Object localObject = PkgTools.a((String)localObject);
    this.D.put(paramString, localObject);
    return (byte[])this.D.get(paramString);
  }
  
  public long h(String paramString)
  {
    long l1 = g(paramString);
    long l2 = c(paramString);
    long l3 = a(paramString, 3000);
    return Math.max(Math.max(l1, l2), l3);
  }
  
  public void h()
  {
    this.jdField_a_of_type_JavaUtilSet.clear();
  }
  
  public void h(String paramString)
  {
    if (this.i.containsKey(paramString)) {
      this.i.remove(paramString);
    }
  }
  
  public void h(String paramString, byte[] paramArrayOfByte)
  {
    if (TextUtils.isEmpty(paramString)) {}
    for (;;)
    {
      return;
      try
      {
        Object localObject = (byte[])this.A.get(paramString);
        if (((localObject != null) && (Arrays.equals((byte[])localObject, paramArrayOfByte))) || (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() == null)) {
          continue;
        }
        localObject = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().getSharedPreferences(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() + "accost", 0).edit();
        if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
        {
          this.A.remove(paramString);
          ((SharedPreferences.Editor)localObject).remove(paramString);
        }
        for (;;)
        {
          ((SharedPreferences.Editor)localObject).commit();
          return;
          this.A.put(paramString, paramArrayOfByte);
          ((SharedPreferences.Editor)localObject).putString(paramString, PkgTools.b(paramArrayOfByte));
        }
        return;
      }
      catch (Exception paramString) {}
    }
  }
  
  public byte[] h(String paramString)
  {
    if (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() == null) {}
    do
    {
      return null;
      if (this.E.containsKey(paramString)) {
        break;
      }
      localObject = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().getSharedPreferences(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() + "circle_group_av", 0).getString(paramString, null);
    } while (localObject == null);
    Object localObject = PkgTools.a((String)localObject);
    this.E.put(paramString, localObject);
    return (byte[])this.E.get(paramString);
  }
  
  public long i(String paramString)
  {
    long l1 = a(paramString, 1);
    long l2 = a(paramString);
    long l3 = b(paramString);
    return Math.max(Math.max(l2, l1), l3);
  }
  
  public void i(String paramString)
  {
    if (QLog.isColorLevel()) {
      QLog.d(jdField_a_of_type_JavaLangString, 2, "removeHotChatSeq groupUin:" + paramString);
    }
    this.jdField_e_of_type_JavaUtilConcurrentConcurrentHashMap.put(paramString, Long.valueOf(0L));
    this.jdField_f_of_type_JavaUtilConcurrentConcurrentHashMap.put(paramString, new Object[] { Long.valueOf(0L), Long.valueOf(0L) });
    this.j.put(paramString, Long.valueOf(0L));
    if (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() != null)
    {
      this.jdField_a_of_type_ComTencentMobileqqServiceMessageMessageCache$AsyncEditor.remove("getTroopLastMessageTime" + paramString);
      this.jdField_a_of_type_ComTencentMobileqqServiceMessageMessageCache$AsyncEditor.remove("getTroopMemberSeq" + paramString);
      this.jdField_a_of_type_ComTencentMobileqqServiceMessageMessageCache$AsyncEditor.remove("getTroopConfigSeq" + paramString);
      this.jdField_a_of_type_ComTencentMobileqqServiceMessageMessageCache$AsyncEditor.remove("getTroopExpiredSeq" + paramString);
    }
    HotChatInfo localHotChatInfo = ((HotChatManager)this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.getManager(59)).a(paramString);
    if ((localHotChatInfo != null) && (localHotChatInfo.isPttShowRoom())) {}
    for (int i1 = 1;; i1 = 0)
    {
      if (i1 != 0) {
        a().b(paramString);
      }
      return;
    }
  }
  
  public void i(String paramString, byte[] paramArrayOfByte)
  {
    if (TextUtils.isEmpty(paramString)) {}
    for (;;)
    {
      return;
      try
      {
        Object localObject = (byte[])this.P.get(paramString);
        if (((localObject != null) && (Arrays.equals((byte[])localObject, paramArrayOfByte))) || (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() == null)) {
          continue;
        }
        localObject = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().getSharedPreferences(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() + "approval_assistant", 0).edit();
        if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
        {
          this.P.remove(paramString);
          ((SharedPreferences.Editor)localObject).remove(paramString);
        }
        for (;;)
        {
          ((SharedPreferences.Editor)localObject).commit();
          return;
          this.P.put(paramString, paramArrayOfByte);
          ((SharedPreferences.Editor)localObject).putString(paramString, PkgTools.b(paramArrayOfByte));
        }
        return;
      }
      catch (Exception paramString) {}
    }
  }
  
  public byte[] i(String paramString)
  {
    if (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() == null) {}
    do
    {
      return null;
      if (this.F.containsKey(paramString)) {
        break;
      }
      localObject = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().getSharedPreferences(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() + "friend_validation", 0).getString(paramString, null);
    } while (localObject == null);
    Object localObject = PkgTools.a((String)localObject);
    this.F.put(paramString, localObject);
    return (byte[])this.F.get(paramString);
  }
  
  public void j(String paramString, byte[] paramArrayOfByte)
  {
    if (TextUtils.isEmpty(paramString)) {}
    for (;;)
    {
      return;
      try
      {
        Object localObject = (byte[])this.B.get(paramString);
        if (((localObject != null) && (Arrays.equals((byte[])localObject, paramArrayOfByte))) || (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() == null)) {
          continue;
        }
        localObject = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().getSharedPreferences(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() + "nearby_assistant", 0).edit();
        if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
        {
          this.B.remove(paramString);
          ((SharedPreferences.Editor)localObject).remove(paramString);
        }
        for (;;)
        {
          ((SharedPreferences.Editor)localObject).commit();
          return;
          this.B.put(paramString, paramArrayOfByte);
          ((SharedPreferences.Editor)localObject).putString(paramString, PkgTools.b(paramArrayOfByte));
        }
        return;
      }
      catch (Exception paramString) {}
    }
  }
  
  public byte[] j(String paramString)
  {
    if (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() == null) {}
    do
    {
      return null;
      if (this.z.containsKey(paramString)) {
        break;
      }
      localObject = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().getSharedPreferences(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() + "same_state", 0).getString(paramString, null);
    } while (localObject == null);
    Object localObject = PkgTools.a((String)localObject);
    this.z.put(paramString, localObject);
    return (byte[])this.z.get(paramString);
  }
  
  public void k(String paramString, byte[] paramArrayOfByte)
  {
    if (TextUtils.isEmpty(paramString)) {}
    for (;;)
    {
      return;
      try
      {
        Object localObject = (byte[])this.C.get(paramString);
        if (((localObject != null) && (Arrays.equals((byte[])localObject, paramArrayOfByte))) || (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() == null)) {
          continue;
        }
        localObject = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().getSharedPreferences(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() + "dating", 0).edit();
        if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
        {
          this.C.remove(paramString);
          ((SharedPreferences.Editor)localObject).remove(paramString);
        }
        for (;;)
        {
          ((SharedPreferences.Editor)localObject).commit();
          return;
          this.C.put(paramString, paramArrayOfByte);
          ((SharedPreferences.Editor)localObject).putString(paramString, PkgTools.b(paramArrayOfByte));
        }
        return;
      }
      catch (Exception paramString) {}
    }
  }
  
  public byte[] k(String paramString)
  {
    if ((TextUtils.isEmpty(paramString)) || (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() == null)) {
      return null;
    }
    if (!this.A.containsKey(paramString))
    {
      Object localObject = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().getSharedPreferences(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() + "accost", 0).getString(paramString, null);
      if (!TextUtils.isEmpty((CharSequence)localObject))
      {
        localObject = PkgTools.a((String)localObject);
        if ((localObject != null) && (localObject.length > 0))
        {
          this.A.put(paramString, localObject);
          return (byte[])localObject;
        }
      }
    }
    else
    {
      return (byte[])this.A.get(paramString);
    }
    return null;
  }
  
  public void l(String paramString, byte[] paramArrayOfByte)
  {
    Object localObject = (byte[])this.D.get(paramString);
    if ((localObject == null) || (!Arrays.equals((byte[])localObject, paramArrayOfByte)))
    {
      this.D.put(paramString, paramArrayOfByte);
      if (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() != null)
      {
        localObject = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().getSharedPreferences(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() + "circle_group", 0);
        paramArrayOfByte = PkgTools.b(paramArrayOfByte);
        localObject = ((SharedPreferences)localObject).edit();
        ((SharedPreferences.Editor)localObject).putString(paramString, paramArrayOfByte);
        ((SharedPreferences.Editor)localObject).commit();
      }
    }
  }
  
  public byte[] l(String paramString)
  {
    if ((TextUtils.isEmpty(paramString)) || (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() == null)) {
      return null;
    }
    if (!this.P.containsKey(paramString))
    {
      Object localObject = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().getSharedPreferences(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() + "approval_assistant", 0).getString(paramString, null);
      if (!TextUtils.isEmpty((CharSequence)localObject))
      {
        localObject = PkgTools.a((String)localObject);
        if ((localObject != null) && (localObject.length > 0))
        {
          this.P.put(paramString, localObject);
          return (byte[])localObject;
        }
      }
    }
    else
    {
      return (byte[])this.P.get(paramString);
    }
    return null;
  }
  
  public void m(String paramString, byte[] paramArrayOfByte)
  {
    Object localObject = (byte[])this.E.get(paramString);
    if ((localObject == null) || (!Arrays.equals((byte[])localObject, paramArrayOfByte)))
    {
      this.E.put(paramString, paramArrayOfByte);
      if (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() != null)
      {
        localObject = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().getSharedPreferences(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() + "circle_group_av", 0);
        paramArrayOfByte = PkgTools.b(paramArrayOfByte);
        localObject = ((SharedPreferences)localObject).edit();
        ((SharedPreferences.Editor)localObject).putString(paramString, paramArrayOfByte);
        ((SharedPreferences.Editor)localObject).commit();
      }
    }
  }
  
  public byte[] m(String paramString)
  {
    if ((TextUtils.isEmpty(paramString)) || (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() == null)) {
      return null;
    }
    if (!this.B.containsKey(paramString))
    {
      Object localObject = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().getSharedPreferences(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() + "nearby_assistant", 0).getString(paramString, null);
      if (!TextUtils.isEmpty((CharSequence)localObject))
      {
        localObject = PkgTools.a((String)localObject);
        if ((localObject != null) && (localObject.length > 0))
        {
          this.B.put(paramString, localObject);
          return (byte[])localObject;
        }
      }
    }
    else
    {
      return (byte[])this.B.get(paramString);
    }
    return null;
  }
  
  public void n(String paramString, byte[] paramArrayOfByte)
  {
    Object localObject = (byte[])this.F.get(paramString);
    if ((localObject == null) || (!Arrays.equals((byte[])localObject, paramArrayOfByte)))
    {
      this.F.put(paramString, paramArrayOfByte);
      if (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() != null)
      {
        localObject = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().getSharedPreferences(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() + "friend_validation", 0);
        paramArrayOfByte = PkgTools.b(paramArrayOfByte);
        localObject = ((SharedPreferences)localObject).edit();
        ((SharedPreferences.Editor)localObject).putString(paramString, paramArrayOfByte);
        ((SharedPreferences.Editor)localObject).commit();
      }
    }
  }
  
  public byte[] n(String paramString)
  {
    if ((TextUtils.isEmpty(paramString)) || (this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() == null)) {
      return null;
    }
    if (!this.C.containsKey(paramString))
    {
      Object localObject = this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().getSharedPreferences(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a() + "dating", 0).getString(paramString, null);
      if (!TextUtils.isEmpty((CharSequence)localObject))
      {
        localObject = PkgTools.a((String)localObject);
        if ((localObject != null) && (localObject.length > 0))
        {
          this.C.put(paramString, localObject);
          return (byte[])localObject;
        }
      }
    }
    else
    {
      return (byte[])this.C.get(paramString);
    }
    return null;
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\com\tencent\mobileqq\service\message\MessageCache.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */