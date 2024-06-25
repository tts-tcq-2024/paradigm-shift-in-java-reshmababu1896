package vitals;

public class Main {
  
     static boolean batteryIsOk(float temperature, float soc, float chargeRate) {
       if (!temperatureIsOk(temperature) || !stateIsOk(soc) || chargeRate > 0.8f) {
            System.out.println("Temperature limit is betwwen 0 to 45 the value received is"+temperature+" SOC limit is between 20 and 80 the value received is "+soc+" charged rate  value should be less than 0.8 the value received is "+chargeRate);
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
