package vitals;

public class VerifyBatteryRangeTest {
    VerifyBatteryRange verifyBatteryRange=new VerifyBatteryRange();

    public void testBatteryIsOk(){
        assert (verifyBatteryRange.verifyBatteryIsOk(25, 50, 0.7f));
    }

    public void testLowTempWarning(){
        assert (verifyBatteryRange.verifyBatteryIsOk(0, 20, 0.0f));
    }

    public void testHighTempWarning(){
         assert (verifyBatteryRange.verifyBatteryIsOk(45, 80, 0.8f));
    }

    public void testLowSOCWarning(){
        assert (verifyBatteryRange.verifyBatteryIsOk(10, 20, 0.5f));
    }
     public void testHighSOCWarning(){
        assert (verifyBatteryRange.verifyBatteryIsOk(10, 77, 0.5f));
    }

   
     public void testHighROCWarning(){
        assert (verifyBatteryRange.verifyBatteryIsOk(10, 45, 0.77f));
    }
     public void testTempBreach(){
        assert (!verifyBatteryRange.verifyBatteryIsOk(48, 30, 0.6f));
    }

    public void testRateOfChargeBreach(){
        assert (!verifyBatteryRange.verifyBatteryIsOk(25, 70, 0.9f));
    }
    public void testSOCBreach(){
         assert (!verifyBatteryRange.verifyBatteryIsOk(25, 10, 0.7f));
    }
}
