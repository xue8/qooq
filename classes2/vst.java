import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.tencent.mobileqq.app.BaseActivity;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.troop.widget.MediaControllerX;

public class vst
  implements SensorEventListener
{
  public vst(MediaControllerX paramMediaControllerX)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onAccuracyChanged(Sensor paramSensor, int paramInt) {}
  
  public void onSensorChanged(SensorEvent paramSensorEvent)
  {
    if (this.a.c) {}
    int i;
    do
    {
      do
      {
        return;
      } while ((paramSensorEvent.sensor.getType() != 1) || (paramSensorEvent.sensor.getType() != 1));
      float f2 = Math.abs(paramSensorEvent.values[1]);
      float f1 = 7.8F;
      if (this.a.e == 1) {
        f1 = 2.2F;
      }
      if (f2 > f1) {}
      for (i = 0; this.a.d == -1; i = 1)
      {
        this.a.d = i;
        return;
      }
    } while (this.a.d == i);
    this.a.c = true;
    MediaControllerX.a(this.a).setRequestedOrientation(4);
    ((SensorManager)MediaControllerX.a(this.a).getSystemService("sensor")).unregisterListener(this.a.a);
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\vst.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */