package models;

public class Free {
    
    public static final int LACTOSE = 1;

    public static final int GLUTEN = 2;

    private int valueFree;

    public Free(int valueFree) {
        this.valueFree = valueFree;
    }

    public int getValueFree() {
        return valueFree;
    }

    public void setValueFree(int valueFree) {
        this.valueFree = valueFree;
    }
    
}