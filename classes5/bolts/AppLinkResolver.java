package bolts;

import android.net.Uri;

public abstract interface AppLinkResolver
{
  public abstract Task<AppLink> getAppLinkFromUrlInBackground(Uri paramUri);
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\bolts\AppLinkResolver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */