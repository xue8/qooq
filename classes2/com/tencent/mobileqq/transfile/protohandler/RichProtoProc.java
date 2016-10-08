package com.tencent.mobileqq.transfile.protohandler;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.transfile.ProtoReqManager;
import java.util.List;

public class RichProtoProc
{
  public static final String a = "c2c_pic_up";
  public static final String b = "grp_pic_up";
  public static final String c = "c2c_pic_dw";
  public static final String d = "grp_pic_dw";
  public static final String e = "c2c_ptt_up";
  public static final String f = "grp_ptt_up";
  public static final String g = "c2c_ptt_dw";
  public static final String h = "grp_ptt_dw";
  public static final String i = "multi_msg_dw";
  public static final String j = "multi_msg_up";
  public static final String k = "short_video_dw";
  public static final String l = "short_video_up";
  public static final String m = "nearby_people_pic_up";
  public static final String n = "friend_avatar_up";
  public static final String o = "short_video_fw";
  public static final String p = "snap_pic_up";
  public static final String q = "bdh_common_up";
  public static final String r = "pa_long_message";
  
  public RichProtoProc()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public static RichProtoProc.RichProtoHandler a(RichProto.RichProtoReq paramRichProtoReq)
  {
    if ((paramRichProtoReq != null) && (paramRichProtoReq.jdField_a_of_type_ComTencentMobileqqTransfileProtoReqManager != null) && (paramRichProtoReq.jdField_a_of_type_ComTencentMobileqqTransfileProtohandlerRichProtoProc$RichProtoCallback != null) && (paramRichProtoReq.jdField_a_of_type_JavaUtilList.size() != 0))
    {
      if ("c2c_pic_up".equals(paramRichProtoReq.jdField_a_of_type_JavaLangString)) {
        return new C2CPicUpHandler();
      }
      if ("grp_pic_up".equals(paramRichProtoReq.jdField_a_of_type_JavaLangString)) {
        return new GroupPicUpHandler();
      }
      if ("grp_ptt_up".equals(paramRichProtoReq.jdField_a_of_type_JavaLangString)) {
        return new GroupPttUpHandler();
      }
      if ("c2c_pic_dw".equals(paramRichProtoReq.jdField_a_of_type_JavaLangString)) {
        return new C2CPicDownHandler();
      }
      if ("grp_pic_dw".equals(paramRichProtoReq.jdField_a_of_type_JavaLangString)) {
        return new GroupPicDownHandler();
      }
      if ("c2c_ptt_up".equals(paramRichProtoReq.jdField_a_of_type_JavaLangString)) {
        return new C2CPttUpHandler();
      }
      if ("c2c_ptt_dw".equals(paramRichProtoReq.jdField_a_of_type_JavaLangString)) {
        return new C2CPttDownHandler();
      }
      if ("grp_ptt_dw".equals(paramRichProtoReq.jdField_a_of_type_JavaLangString)) {
        return new GroupPttDownHandler();
      }
      if ("short_video_dw".equals(paramRichProtoReq.jdField_a_of_type_JavaLangString)) {
        return new ShortVideoDownHandler();
      }
      if ("short_video_up".equals(paramRichProtoReq.jdField_a_of_type_JavaLangString)) {
        return new ShortVideoUpHandler();
      }
      if ("multi_msg_dw".equals(paramRichProtoReq.jdField_a_of_type_JavaLangString)) {
        return new MultiMsgDownHandler();
      }
      if ("multi_msg_up".equals(paramRichProtoReq.jdField_a_of_type_JavaLangString)) {
        return new MultiMsgUpHandler();
      }
      if (("nearby_people_pic_up".equals(paramRichProtoReq.jdField_a_of_type_JavaLangString)) || ("friend_avatar_up".equals(paramRichProtoReq.jdField_a_of_type_JavaLangString))) {
        return new NearbyPeoplePicUpHandler();
      }
      if ("short_video_fw".equals(paramRichProtoReq.jdField_a_of_type_JavaLangString)) {
        return new ShortVideoForwardHandler();
      }
      if ("snap_pic_up".equals(paramRichProtoReq.jdField_a_of_type_JavaLangString)) {
        return new SnapPicUpHandler();
      }
      if ("bdh_common_up".equals(paramRichProtoReq.jdField_a_of_type_JavaLangString)) {
        return new BDHCommonUpHandler();
      }
      if ("pa_long_message".equals(paramRichProtoReq.jdField_a_of_type_JavaLangString)) {
        return new PALongMessageHandler();
      }
    }
    return null;
  }
  
  public static void a(RichProto.RichProtoReq paramRichProtoReq)
  {
    RichProtoProc.RichProtoHandler localRichProtoHandler = a(paramRichProtoReq);
    if (localRichProtoHandler != null) {
      localRichProtoHandler.a(paramRichProtoReq);
    }
  }
  
  public static void a(RichProto.RichProtoReq paramRichProtoReq, RichProto.RichProtoResp paramRichProtoResp)
  {
    if ((paramRichProtoReq != null) && (paramRichProtoReq.jdField_a_of_type_ComTencentMobileqqTransfileProtohandlerRichProtoProc$RichProtoCallback != null))
    {
      paramRichProtoReq.jdField_a_of_type_ComTencentMobileqqTransfileProtoReqManager$ProtoReq = null;
      paramRichProtoReq.jdField_a_of_type_ComTencentMobileqqTransfileProtohandlerRichProtoProc$RichProtoCallback.a(paramRichProtoReq, paramRichProtoResp);
      paramRichProtoReq.jdField_a_of_type_ComTencentMobileqqTransfileProtohandlerRichProtoProc$RichProtoCallback = null;
      paramRichProtoReq.jdField_a_of_type_ComTencentMobileqqTransfileProtoReqManager = null;
    }
  }
  
  public static void b(RichProto.RichProtoReq paramRichProtoReq)
  {
    if ((paramRichProtoReq != null) && (paramRichProtoReq.jdField_a_of_type_ComTencentMobileqqTransfileProtoReqManager != null))
    {
      paramRichProtoReq.jdField_a_of_type_ComTencentMobileqqTransfileProtoReqManager.b(paramRichProtoReq.jdField_a_of_type_ComTencentMobileqqTransfileProtoReqManager$ProtoReq);
      paramRichProtoReq.jdField_a_of_type_ComTencentMobileqqTransfileProtohandlerRichProtoProc$RichProtoCallback = null;
      paramRichProtoReq.jdField_a_of_type_ComTencentMobileqqTransfileProtoReqManager$ProtoReq = null;
      paramRichProtoReq.jdField_a_of_type_ComTencentMobileqqTransfileProtoReqManager = null;
    }
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\mobileqq\transfile\protohandler\RichProtoProc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */