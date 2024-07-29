package vitals;

import java.util.ArrayList;
import java.util.List;

public class GenerateWarningList {
    static List<RangeConditions> socConditions = new ArrayList<>();
    static List<RangeConditions> tempConditions = new ArrayList<>();
    static List<RangeConditions> rateOfChargeConditions = new ArrayList<>();

    public List<RangeConditions> getSocConditions() {
        return socConditions;
    }

    public void setSocConditions(List<RangeConditions> socConditions) {
        this.socConditions = socConditions;
    }

    public List<RangeConditions> getTempConditions() {
        return tempConditions;
    }

    public void setTempConditions(List<RangeConditions> tempConditions) {
        this.tempConditions = tempConditions;
    }

    public List<RangeConditions> getRateOfChargeConditions() {
        return rateOfChargeConditions;
    }

    public void setRateOfChargeConditions(List<RangeConditions> rateOfChargeConditions) {
        this.rateOfChargeConditions = rateOfChargeConditions;
    }

    protected static List<RangeConditions> generateSOCConditionList(){
        socConditions.add(new RangeConditions(0, 20, "LOW_SOC_BREACH"));
        socConditions.add(new RangeConditions(21, 24, "LOW_SOC_WARNING"));
        socConditions.add(new RangeConditions(25, 75, "NORMAL"));
        socConditions.add(new RangeConditions(76, 80, "HIGH_SOC_WARNING"));
        socConditions.add(new RangeConditions(81, 100, "HIGH_SOC_BREACH"));

        return socConditions;
    }

    protected static List<RangeConditions> generateTempConditions(){
        tempConditions.add(new RangeConditions( -2.25f, 0, "LOW_TEMP_BREACH"));
        tempConditions.add(new RangeConditions(0, 2.25f, "LOW_TEMP_WARNING"));
        tempConditions.add(new RangeConditions(2.25f, 42.75f, "NORMAL"));
        tempConditions.add(new RangeConditions(42.75f, 45, "HIGH_TEMP_WARNING"));
        tempConditions.add(new RangeConditions(45, 100, "HIGH_TEMP_BREACH"));

        return tempConditions;
    }

    protected static List<RangeConditions> generateRateOfChargeConditions(){

        rateOfChargeConditions.add(new RangeConditions(0, 0.76f, "NORMAL"));
        rateOfChargeConditions.add(new RangeConditions(0.76f, 0.8f, "HIGH_ROC_WARNING"));
        rateOfChargeConditions.add(new RangeConditions(0.8f, 100, "HIGH_ROC_BREACH"));

        return rateOfChargeConditions;
    }
}
