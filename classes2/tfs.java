import android.media.AudioManager.OnAudioFocusChangeListener;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.music.QQPlayerService;

public class tfs
  implements AudioManager.OnAudioFocusChangeListener
{
  public tfs(QQPlayerService paramQQPlayerService)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  /* Error */
  public void onAudioFocusChange(int paramInt)
  {
    // Byte code:
    //   0: invokestatic 32	com/tencent/qphone/base/util/QLog:isColorLevel	()Z
    //   3: ifeq +28 -> 31
    //   6: ldc 34
    //   8: iconst_2
    //   9: new 36	java/lang/StringBuilder
    //   12: dup
    //   13: invokespecial 37	java/lang/StringBuilder:<init>	()V
    //   16: ldc 39
    //   18: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   21: iload_1
    //   22: invokevirtual 46	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   25: invokevirtual 50	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   28: invokestatic 54	com/tencent/qphone/base/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   31: aload_0
    //   32: getfield 12	tfs:a	Lcom/tencent/mobileqq/music/QQPlayerService;
    //   35: astore_2
    //   36: aload_2
    //   37: monitorenter
    //   38: iload_1
    //   39: tableswitch	default:+33->72, -3:+132->171, -2:+36->75, -1:+36->75, 0:+33->72, 1:+174->213
    //   72: aload_2
    //   73: monitorexit
    //   74: return
    //   75: invokestatic 59	com/tencent/mobileqq/music/QQPlayerService:a	()Landroid/media/MediaPlayer;
    //   78: ifnull +26 -> 104
    //   81: invokestatic 59	com/tencent/mobileqq/music/QQPlayerService:a	()Landroid/media/MediaPlayer;
    //   84: invokevirtual 64	android/media/MediaPlayer:isPlaying	()Z
    //   87: ifeq +17 -> 104
    //   90: invokestatic 59	com/tencent/mobileqq/music/QQPlayerService:a	()Landroid/media/MediaPlayer;
    //   93: invokevirtual 67	android/media/MediaPlayer:pause	()V
    //   96: aload_0
    //   97: getfield 12	tfs:a	Lcom/tencent/mobileqq/music/QQPlayerService;
    //   100: iconst_3
    //   101: invokestatic 70	com/tencent/mobileqq/music/QQPlayerService:a	(Lcom/tencent/mobileqq/music/QQPlayerService;I)V
    //   104: invokestatic 32	com/tencent/qphone/base/util/QLog:isColorLevel	()Z
    //   107: ifeq +11 -> 118
    //   110: ldc 34
    //   112: iconst_2
    //   113: ldc 72
    //   115: invokestatic 54	com/tencent/qphone/base/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   118: aload_0
    //   119: getfield 12	tfs:a	Lcom/tencent/mobileqq/music/QQPlayerService;
    //   122: iconst_0
    //   123: putfield 74	com/tencent/mobileqq/music/QQPlayerService:a	Z
    //   126: goto -54 -> 72
    //   129: astore_3
    //   130: aload_2
    //   131: monitorexit
    //   132: aload_3
    //   133: athrow
    //   134: astore_2
    //   135: invokestatic 32	com/tencent/qphone/base/util/QLog:isColorLevel	()Z
    //   138: ifeq +174 -> 312
    //   141: ldc 34
    //   143: iconst_2
    //   144: new 36	java/lang/StringBuilder
    //   147: dup
    //   148: invokespecial 37	java/lang/StringBuilder:<init>	()V
    //   151: ldc 76
    //   153: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   156: aload_2
    //   157: invokevirtual 79	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   160: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   163: invokevirtual 50	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   166: aload_2
    //   167: invokestatic 82	com/tencent/qphone/base/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V
    //   170: return
    //   171: invokestatic 59	com/tencent/mobileqq/music/QQPlayerService:a	()Landroid/media/MediaPlayer;
    //   174: ifnull +22 -> 196
    //   177: invokestatic 59	com/tencent/mobileqq/music/QQPlayerService:a	()Landroid/media/MediaPlayer;
    //   180: invokevirtual 64	android/media/MediaPlayer:isPlaying	()Z
    //   183: ifeq +13 -> 196
    //   186: invokestatic 59	com/tencent/mobileqq/music/QQPlayerService:a	()Landroid/media/MediaPlayer;
    //   189: ldc 83
    //   191: ldc 83
    //   193: invokevirtual 87	android/media/MediaPlayer:setVolume	(FF)V
    //   196: invokestatic 32	com/tencent/qphone/base/util/QLog:isColorLevel	()Z
    //   199: ifeq -127 -> 72
    //   202: ldc 34
    //   204: iconst_2
    //   205: ldc 89
    //   207: invokestatic 54	com/tencent/qphone/base/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   210: goto -138 -> 72
    //   213: invokestatic 93	com/tencent/mobileqq/music/QQPlayerService:h	()I
    //   216: iconst_3
    //   217: if_icmpne +43 -> 260
    //   220: invokestatic 59	com/tencent/mobileqq/music/QQPlayerService:a	()Landroid/media/MediaPlayer;
    //   223: ifnull +37 -> 260
    //   226: invokestatic 59	com/tencent/mobileqq/music/QQPlayerService:a	()Landroid/media/MediaPlayer;
    //   229: invokevirtual 64	android/media/MediaPlayer:isPlaying	()Z
    //   232: ifne +28 -> 260
    //   235: invokestatic 59	com/tencent/mobileqq/music/QQPlayerService:a	()Landroid/media/MediaPlayer;
    //   238: fconst_1
    //   239: fconst_1
    //   240: invokevirtual 87	android/media/MediaPlayer:setVolume	(FF)V
    //   243: aload_0
    //   244: getfield 12	tfs:a	Lcom/tencent/mobileqq/music/QQPlayerService;
    //   247: invokestatic 96	com/tencent/mobileqq/music/QQPlayerService:a	(Lcom/tencent/mobileqq/music/QQPlayerService;)Z
    //   250: ifeq +35 -> 285
    //   253: aload_0
    //   254: getfield 12	tfs:a	Lcom/tencent/mobileqq/music/QQPlayerService;
    //   257: invokevirtual 98	com/tencent/mobileqq/music/QQPlayerService:a	()V
    //   260: invokestatic 32	com/tencent/qphone/base/util/QLog:isColorLevel	()Z
    //   263: ifeq +11 -> 274
    //   266: ldc 34
    //   268: iconst_2
    //   269: ldc 100
    //   271: invokestatic 54	com/tencent/qphone/base/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   274: aload_0
    //   275: getfield 12	tfs:a	Lcom/tencent/mobileqq/music/QQPlayerService;
    //   278: iconst_1
    //   279: putfield 74	com/tencent/mobileqq/music/QQPlayerService:a	Z
    //   282: goto -210 -> 72
    //   285: aload_0
    //   286: getfield 12	tfs:a	Lcom/tencent/mobileqq/music/QQPlayerService;
    //   289: invokestatic 103	com/tencent/mobileqq/music/QQPlayerService:b	(Lcom/tencent/mobileqq/music/QQPlayerService;)Z
    //   292: ifne -32 -> 260
    //   295: invokestatic 59	com/tencent/mobileqq/music/QQPlayerService:a	()Landroid/media/MediaPlayer;
    //   298: invokevirtual 106	android/media/MediaPlayer:start	()V
    //   301: aload_0
    //   302: getfield 12	tfs:a	Lcom/tencent/mobileqq/music/QQPlayerService;
    //   305: iconst_2
    //   306: invokestatic 70	com/tencent/mobileqq/music/QQPlayerService:a	(Lcom/tencent/mobileqq/music/QQPlayerService;I)V
    //   309: goto -49 -> 260
    //   312: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	313	0	this	tfs
    //   0	313	1	paramInt	int
    //   35	96	2	localQQPlayerService	QQPlayerService
    //   134	33	2	localException	Exception
    //   129	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   72	74	129	finally
    //   75	104	129	finally
    //   104	118	129	finally
    //   118	126	129	finally
    //   130	132	129	finally
    //   171	196	129	finally
    //   196	210	129	finally
    //   213	260	129	finally
    //   260	274	129	finally
    //   274	282	129	finally
    //   285	309	129	finally
    //   31	38	134	java/lang/Exception
    //   132	134	134	java/lang/Exception
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\tfs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */