import android.bluetooth.BluetoothDevice;
import com.tencent.device.qfind.BlePeerInfo;
import com.tencent.device.qfind.QFindBLEScanMgr;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.qphone.base.util.QLog;
import java.util.ArrayList;
import java.util.List;
import mqq.os.MqqHandler;

class kcd
  implements Runnable
{
  kcd(kcc paramkcc, BluetoothDevice paramBluetoothDevice, byte[] paramArrayOfByte)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void run()
  {
    BlePeerInfo localBlePeerInfo = new BlePeerInfo();
    localBlePeerInfo.b = this.jdField_a_of_type_AndroidBluetoothBluetoothDevice.getName();
    localBlePeerInfo.jdField_c_of_type_JavaLangString = this.jdField_a_of_type_AndroidBluetoothBluetoothDevice.getAddress();
    localBlePeerInfo.jdField_a_of_type_Boolean = false;
    BlePeerInfo.a(this.jdField_a_of_type_ArrayOfByte, localBlePeerInfo);
    if ((localBlePeerInfo.jdField_a_of_type_JavaUtilList != null) && (localBlePeerInfo.jdField_a_of_type_JavaUtilList.contains("0000feba-0000-1000-8000-00805f9b34fb")))
    {
      if (QLog.isColorLevel()) {
        QLog.i("QFindBLE_ex", 2, "onLeScan name=" + localBlePeerInfo.b + " pid:" + localBlePeerInfo.jdField_a_of_type_Int + " address:" + localBlePeerInfo.jdField_c_of_type_JavaLangString + " ; blePeerInfo.ble_id = " + localBlePeerInfo.jdField_c_of_type_Int);
      }
      if ((localBlePeerInfo.jdField_a_of_type_Int == 0) || (localBlePeerInfo.jdField_a_of_type_ArrayOfByte == null) || (!this.jdField_a_of_type_Kcc.a.b.contains(new Long(localBlePeerInfo.jdField_a_of_type_Int)))) {}
    }
    for (;;)
    {
      try
      {
        QFindBLEScanMgr.b(this.jdField_a_of_type_Kcc.a);
        boolean bool1 = QFindBLEScanMgr.a(this.jdField_a_of_type_Kcc.a, localBlePeerInfo);
        bool2 = QFindBLEScanMgr.a(this.jdField_a_of_type_Kcc.a, localBlePeerInfo, bool1);
        if (QLog.isColorLevel()) {
          QLog.i("QFindBLE_ex", 2, "onLeScan blePeerInfo.ble_id = " + localBlePeerInfo.jdField_c_of_type_Int + " ; needReportLoc = " + bool1 + " ; needReport = " + bool2);
        }
        if ((!bool2) || (!bool1)) {
          continue;
        }
        QFindBLEScanMgr.a(this.jdField_a_of_type_Kcc.a, localBlePeerInfo.jdField_a_of_type_Int, localBlePeerInfo.a());
      }
      catch (Exception localException)
      {
        boolean bool2;
        continue;
      }
      this.jdField_a_of_type_Kcc.a.a.postDelayed(new kce(this), this.jdField_a_of_type_Kcc.a.i);
      return;
      if (bool2) {
        QFindBLEScanMgr.a(this.jdField_a_of_type_Kcc.a, localBlePeerInfo, null, false);
      }
    }
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\kcd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */