package vitals;
import java.util.logging.Logger;

public class VerifyBatteryRange {
     
     static boolean verifyBatteryIsOk(float temperature, float soc, float chargeRate) {
        return validateTemperatureIsOk(temperature) && validateStateIsOk(soc) && validateChargeIsOk(chargeRate);
    }

    static boolean validateTemperatureIsOk(float temperature) {
        boolean validValue=true;
        if(temperature < 0 || temperature > 45){
            printMessageOnConsole("Temperature out of range");
            validValue=false;
        }
        return validValue;
    }

    static boolean validateStateIsOk(float soc) {
        boolean validValue=true;
        if(soc < 20 || soc > 80){
            printMessageOnConsole("State of charge is out of range");
            validValue=false;
        }
        return validValue;
    }

    static boolean validateChargeIsOk(float chargeRate) {
        boolean validValue=true;
        if(chargeRate>0.8f){
           printMessageOnConsole("Charge of rate is out of range");
            validValue=false;
        }
        return validValue;
    }
     
     static void printMessageOnConsole(String message){
          System.out.println(message);
     }
  
    public static void main(String[] args) {
        assert (verifyBatteryIsOk(25, 70, 0.7f));
        assert (verifyBatteryIsOk(0, 20, 0.0f));
        assert (verifyBatteryIsOk(45, 80, 0.8f));
      
        assert (!verifyBatteryIsOk(25, 10, 0.7f));
        assert (!verifyBatteryIsOk(25, 70, 0.9f));
    }
}
