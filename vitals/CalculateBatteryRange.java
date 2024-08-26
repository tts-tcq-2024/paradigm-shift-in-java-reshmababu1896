package vitals;

import java.util.List;

public class CalculateBatteryRange {

    public static boolean checkValidValue(float value, List<RangeConditions> conditionsList){
        boolean validValue=true;
        for(RangeConditions range:conditionsList){
            validValue=verifyMinMaxRange(value,range);
             if(!validValue){
                break;
            }
        }


        return validValue;
    }

  protected static boolean verifyMinMaxRange(float value, RangeConditions range){
      boolean flag=true;
        if(value>range.getMin() && value< range.getMax()){
            flag= CheckBreach(value,range.getMessage());
        }
        return flag;
    }

     protected static boolean CheckBreach(Float param,String message){
       boolean value=true;
        if(message.contains(("BREACH")) ){
            value= false;
        } 
       printMessage(param,message, value);
        
       return value;
    }

    private static void printMessage(Float param, String message, booleam value){
        
        System.out.println("For the value "+param+" status "+value+"  "+message);
    }
}
