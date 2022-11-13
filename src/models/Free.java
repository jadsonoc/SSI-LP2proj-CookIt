package models;

import java.util.List;

public class Free {
    
    public static final int LACTOSE = 1;

    public static final int GLUTEN = 2;

    private int valueFree;

    private List<Food> foods;

    public Free(int valueFree) {
        this.valueFree = valueFree;
    }

    public Free(int valueFree, List<Food> foods) {
        this.valueFree = valueFree;
        this.foods = foods;
    }

    public int getValueFree() {
        return valueFree;
    }

    public void setValueFree(int valueFree) {
        this.valueFree = valueFree;
    }

    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }

}