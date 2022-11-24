package util;

public abstract class Sequences {

    public static Integer SEQ_FOOD = 1000;

    public static Integer SEQ_CATEGORY = 600;

    public static Integer SEQ_UNIT = 500;

    public static Integer SEQ_KITCHENWARE = 800;

    public static Integer SEQ_RECIPES = 1;
    
    public static Integer SEQ_USER = 900;

    public static Integer getNextSEQ_FOOD() {
        return SEQ_FOOD++;
    }

    public static Integer getNextSEQ_CATEGORY() {
        return SEQ_CATEGORY++;
    }

    public static Integer getNextSEQ_UNIT() {
        return SEQ_UNIT++;
    }

    public static Integer getNextSEQ_KITCHENWARE() {
        return SEQ_KITCHENWARE++;
    }

    public static Integer getNextSEQ_RECIPES() {
        return SEQ_RECIPES++;
    }

    public static Integer getNextSEQ_USER() {
        return SEQ_USER++;
    }

    

}
