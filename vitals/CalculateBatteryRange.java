package vitals;

import java.util.List;

public class CalculateBatteryRange {

    public static boolean checkValidValue(float value, List<RangeConditions> conditionsList){
        boolean validValue=true;
        for(RangeConditions range:conditionsList){
            validValue=verifyMinMaxRange(value,range);
        }


        return validValue;
    }

    protected static boolean verifyMinMaxRange(float value, RangeConditions range){
        if(value>range.getMin() && value< range.getMax()){
//            System.out.println(range.getMessage());
            return printMessage(range.getMessage());
        }
        return true;
    }

    protected static boolean printMessage(String message){
       boolean value=true;
        if(message.equals("NORMAL")){
            value= true;
        } else{
            value=false;
        }
        System.out.println(message);
       return value;
    }
}
