package vitals;

public class VerifyBatteryRangeTest {
    VerifyBatteryRange verifyBatteryRange=new VerifyBatteryRange();

    public void testBatteryIsOk(){
        assert (verifyBatteryRange.verifyBatteryIsOk(25, 70, 0.7f));
        assert (verifyBatteryRange.verifyBatteryIsOk(0, 20, 0.0f));
        assert (verifyBatteryRange.verifyBatteryIsOk(45, 80, 0.8f));
    }

    public void testBatteryIsNotOk(){
        assert (!verifyBatteryRange.verifyBatteryIsOk(25, 10, 0.7f));
        assert (!verifyBatteryRange.verifyBatteryIsOk(25, 70, 0.9f));
    }
}
