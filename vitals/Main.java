package vitals;
import java.util.logging.Logger;

public class Main {
  
    static boolean batteryIsOk(float temperature, float soc, float chargeRate) {
        Logger.getAnonymousLogger().info(temperatureIsOk(temperature) ? "Temperature out of range" : stateIsOk(soc) ? "State of charge out of range" : chargeRate > 0.8f ? "Charge of rate is out of range" : "Values are valid");
        return (temperatureIsOk(temperature) || stateIsOk(soc) || chargeRate > 0.8f) ? false : true;
    }

    static boolean temperatureIsOk(float temperature) {
        return temperature < 0 || temperature > 45;
    }
  
    static boolean stateIsOk(float soc) {
        return soc < 20 || soc > 80;
    }
  
    public static void main(String[] args) {
        assert (batteryIsOk(25, 70, 0.7f));
        assert (batteryIsOk(0, 20, 0.0f));
        assert (batteryIsOk(45, 80, 0.8f));
        assert (!batteryIsOk(50, 85, 0.0f));
        assert (!batteryIsOk(-2, 70, 0.7f));
        assert (!batteryIsOk(25, 10, 0.7f));
        assert (!batteryIsOk(25, 70, 0.9f));
    }
}
