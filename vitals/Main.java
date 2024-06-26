package vitals;
import java.util.logging.Logger;

public class Main {
     static boolean batteryIsOk(float temperature, float soc, float chargeRate) {
        return temperatureIsOk(temperature) && stateIsOk(soc) && chargeIsOk(chargeRate);
    }

    static boolean temperatureIsOk(float temperature) {
        boolean validValue=true;
        if(temperature < 0 || temperature > 45){
            System.out.println("Temperature out of range");
            validValue=false;
        }
        return validValue;
    }

    static boolean stateIsOk(float soc) {
        boolean validValue=true;
        if(soc < 20 || soc > 80){
            System.out.println("State of charge is out of range");
            validValue=false;
        }
        return validValue;
    }

    static boolean chargeIsOk(float chargeRate) {
        boolean validValue=true;
        if(chargeRate>0.8f){
            System.out.println("Charge of rate is out of range");
            validValue=false;
        }
        return validValue;
    }
  
    public static void main(String[] args) {
        assert (batteryIsOk(25, 70, 0.7f));
        assert (batteryIsOk(0, 20, 0.0f));
        assert (batteryIsOk(45, 80, 0.8f));
      
        assert (!batteryIsOk(25, 10, 0.7f));
        assert (!batteryIsOk(25, 70, 0.9f));
    }
}
