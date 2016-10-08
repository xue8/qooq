package com.facebook.stetho.inspector.helper;

import android.annotation.TargetApi;
import android.view.ViewDebug.ExportedProperty;
import javax.annotation.Nullable;

public class IntegerFormatter
{
  private static IntegerFormatter cachedFormatter;
  
  /* Error */
  public static IntegerFormatter getInstance()
  {
    // Byte code:
    //   0: getstatic 20	com/facebook/stetho/inspector/helper/IntegerFormatter:cachedFormatter	Lcom/facebook/stetho/inspector/helper/IntegerFormatter;
    //   3: ifnonnull +34 -> 37
    //   6: ldc 2
    //   8: monitorenter
    //   9: getstatic 20	com/facebook/stetho/inspector/helper/IntegerFormatter:cachedFormatter	Lcom/facebook/stetho/inspector/helper/IntegerFormatter;
    //   12: ifnonnull +22 -> 34
    //   15: getstatic 26	android/os/Build$VERSION:SDK_INT	I
    //   18: bipush 21
    //   20: if_icmplt +21 -> 41
    //   23: new 6	com/facebook/stetho/inspector/helper/IntegerFormatter$IntegerFormatterWithHex
    //   26: dup
    //   27: aconst_null
    //   28: invokespecial 29	com/facebook/stetho/inspector/helper/IntegerFormatter$IntegerFormatterWithHex:<init>	(Lcom/facebook/stetho/inspector/helper/IntegerFormatter$IntegerFormatterWithHex;)V
    //   31: putstatic 20	com/facebook/stetho/inspector/helper/IntegerFormatter:cachedFormatter	Lcom/facebook/stetho/inspector/helper/IntegerFormatter;
    //   34: ldc 2
    //   36: monitorexit
    //   37: getstatic 20	com/facebook/stetho/inspector/helper/IntegerFormatter:cachedFormatter	Lcom/facebook/stetho/inspector/helper/IntegerFormatter;
    //   40: areturn
    //   41: new 2	com/facebook/stetho/inspector/helper/IntegerFormatter
    //   44: dup
    //   45: invokespecial 16	com/facebook/stetho/inspector/helper/IntegerFormatter:<init>	()V
    //   48: putstatic 20	com/facebook/stetho/inspector/helper/IntegerFormatter:cachedFormatter	Lcom/facebook/stetho/inspector/helper/IntegerFormatter;
    //   51: goto -17 -> 34
    //   54: astore_0
    //   55: ldc 2
    //   57: monitorexit
    //   58: aload_0
    //   59: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   54	5	0	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   9	34	54	finally
    //   34	37	54	finally
    //   41	51	54	finally
    //   55	58	54	finally
  }
  
  public String format(Integer paramInteger, @Nullable ViewDebug.ExportedProperty paramExportedProperty)
  {
    return String.valueOf(paramInteger);
  }
  
  private static class IntegerFormatterWithHex
    extends IntegerFormatter
  {
    private IntegerFormatterWithHex()
    {
      super();
    }
    
    @TargetApi(21)
    public String format(Integer paramInteger, @Nullable ViewDebug.ExportedProperty paramExportedProperty)
    {
      return super.format(paramInteger, paramExportedProperty);
    }
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\com\facebook\stetho\inspector\helper\IntegerFormatter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */