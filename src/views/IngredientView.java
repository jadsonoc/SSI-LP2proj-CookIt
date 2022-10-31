package views;

import models.Food;

public class IngredientView {
    
    private Food ingredient;

    public IngredientView(Food ingredient) {
        this.ingredient = ingredient;
    }

    public void printIngredient() {
        System.out.println(this.ingredient.toString());
    }
}
