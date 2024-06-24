package vitals;

public class Main {
  
    static boolean batteryIsOk(float temperature, float soc, float chargeRate) {
        if (temperatureIsOk(temperature) && stateIsOk(soc) && chargeRateIsOk(chargeRate)) {
            return true;
        }
        return false;
    }

    static boolean temperatureIsOk(float temperature) {
        if (temperature < 0 || temperature > 45) {
            System.out.println("Temperature is out of range!");
            return false;
        }
        return true;
    }

    static boolean stateIsOk(float soc) {
        if (soc < 20 || soc > 80) {
            System.out.println("State of Charge is out of range!");
            return false;
        }
        return true;
    }

    static boolean chargeRateIsOk(float chargeRate) {
        if (chargeRate > 0.8) {
            System.out.println("Charge Rate is out of range!");
            return false;
        }
        return true;
    }


    public static void main(String[] args) {
        assert (batteryIsOk(25, 70, 0.7f));
        assert (!batteryIsOk(50, 85, 0.0f));
        assert (!batteryIsOk(46, 81, 0.05f));
        assert (!batteryIsOk(-1, 19, 0.7f));
        assert (batteryIsOk(30, 21, 0.9f));

    }
}
