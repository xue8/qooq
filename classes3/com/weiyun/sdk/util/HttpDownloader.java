package com.weiyun.sdk.util;

import android.os.SystemClock;
import android.util.Log;
import com.weiyun.sdk.Global;
import com.weiyun.sdk.job.transfer.Transfer.ProcessInfo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpDownloader
{
  private static final String TAG = "HttpDownloader";
  protected final File mFile;
  private IoPipe.ProgressListener mProgressListener;
  protected final HttpReader mReader;
  
  public HttpDownloader(HttpReader paramHttpReader, File paramFile)
  {
    this.mReader = paramHttpReader;
    this.mFile = paramFile;
  }
  
  public HttpDownloader(String paramString, File paramFile)
    throws MalformedURLException
  {
    this(new HttpReader(paramString, null), paramFile);
  }
  
  public HttpDownloader(String paramString1, String paramString2)
    throws MalformedURLException
  {
    this(paramString1, new File(paramString2));
  }
  
  public int download(Transfer.ProcessInfo paramProcessInfo)
  {
    return download(this.mFile, paramProcessInfo);
  }
  
  public int download(File paramFile, Transfer.ProcessInfo paramProcessInfo)
  {
    try
    {
      int i = injection();
      if (i != 0) {
        return i;
      }
      if (paramProcessInfo != null)
      {
        HttpURLConnection localHttpURLConnection = this.mReader.getHttpUrlConnection();
        paramProcessInfo.hostIp = localHttpURLConnection.getURL().getHost();
        paramProcessInfo.hostPort = Integer.toString(localHttpURLConnection.getURL().getPort());
        if (Global.isInit()) {
          paramProcessInfo.dns = NetworkUtils.getDns(Global.getContext());
        }
      }
      paramFile = new JobIoPipe(this.mReader.getStream(), paramFile);
      paramFile.setProgressListener(this.mProgressListener);
      long l = SystemClock.uptimeMillis();
      boolean bool = paramFile.pipe(this.mReader.getContentLength());
      if (paramProcessInfo != null)
      {
        paramProcessInfo.transferDataTimeCost = (SystemClock.uptimeMillis() - l);
        paramProcessInfo.transferDataSize = this.mReader.getContentLength();
      }
      if (bool) {}
      for (i = 0;; i = 55534) {
        return i;
      }
      return 55522;
    }
    catch (IOException paramFile)
    {
      Log.w("HttpDownloader", "download file " + this.mReader.getUrl(), paramFile);
      if (paramProcessInfo != null) {
        paramProcessInfo.failException = paramFile;
      }
      return ErrCodeUtil.getErrCodeFromIOException(paramFile);
    }
    catch (Exception paramFile)
    {
      Log.w("HttpDownloader", "download file " + this.mReader.getUrl(), paramFile);
      if (paramProcessInfo != null) {
        paramProcessInfo.failException = paramFile;
      }
    }
  }
  
  protected int injection()
    throws IOException
  {
    String str = this.mReader.getHttpUrlConnection().getHeaderField("X-ErrNo");
    if (str != null)
    {
      Log.w("HttpDownloader", "X-ErrNo:" + str);
      return 36532;
    }
    return 0;
  }
  
  public void setProgressListener(IoPipe.ProgressListener paramProgressListener)
  {
    this.mProgressListener = paramProgressListener;
  }
  
  private static class JobIoPipe
    extends IoPipe
  {
    public JobIoPipe(InputStream paramInputStream, File paramFile)
      throws FileNotFoundException
    {
      super(paramFile);
    }
    
    public boolean isCanceled()
    {
      return Thread.interrupted();
    }
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\weiyun\sdk\util\HttpDownloader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */