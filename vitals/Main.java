package vitals;

public class Main {
  
     static boolean batteryIsOk(float temperature, float soc, float chargeRate) {
      if (!temperatureIsOk(temperature) && !stateIsOk(soc)) {
            System.out.println("Value is out of range temperature : "+temperature+" SOC: "+soc);
           return false;
        }
        // if (!stateIsOk(soc)) {
        //     System.out.println("State of charge is out of range");
        //     return false;
        // }
        if (chargeRate > 0.8f) {
            System.out.println("Charge  rate is out of range");
           return false;
        }
       return true;

    }

    static boolean temperatureIsOk(float temperature) {
        return temperature >= 0 && temperature <= 45;
    }

    static boolean stateIsOk(float soc) {
        return soc >= 20 && soc <= 80;
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
