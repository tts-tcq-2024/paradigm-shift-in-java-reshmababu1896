package vitals;

import java.util.ArrayList;
import java.util.List;

public class VerifyBatteryRange {
     static List<RangeConditions> socConditionList = new ArrayList<>();
    static List<RangeConditions> tempConditionList = new ArrayList<>();
    static List<RangeConditions> rocConditionList = new ArrayList<>();
     
     static boolean verifyBatteryIsOk(float temperature, float soc, float chargeRate) {
        return validateTemperatureIsOk(temperature) && validateStateIsOk(soc) && validateChargeIsOk(chargeRate);
    }

    static boolean validateTemperatureIsOk(float temperature) {
        return CalculateBatteryRange.checkValidValue(temperature,tempConditionList);
    }

    static boolean validateStateIsOk(float soc) {
        return CalculateBatteryRange.checkValidValue(soc,socConditionList);
    }

    static boolean validateChargeIsOk(float chargeRate) {
        return CalculateBatteryRange.checkValidValue(chargeRate,rocConditionList);
    }
     

  
    public static void main(String[] args) {
       tempConditionList=GenerateWarningList.generateTempConditions();
       socConditionList=GenerateWarningList.generateSOCConditionList();
       rocConditionList=GenerateWarningList.generateRateOfChargeConditions();
       
        
    }
}
