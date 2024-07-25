package vitals;

public class RangeConditions {


    private float min;
    private float max;
    private String message;

    public RangeConditions(float min, float max, String condition) {
        this.min = min;
        this.max = max;
        this.message = condition;
    }

    public float getMin() {
        return min;
    }

    public void setMin(float min) {
        this.min = min;
    }

    public float getMax() {
        return max;
    }

    public void setMax(float max) {
        this.max = max;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
