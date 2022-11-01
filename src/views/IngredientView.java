package views;

import models.Food;

public class IngredientView {
    
    private Food ingredient;

    public IngredientView(Food ingredient) {
        this.ingredient = ingredient;
    }

    public void printIngredient() {
        if ( this.ingredient.isFree() ) {
            System.out.printf("%5d %-20s");
        } else {
            System.out.printf("%5d %-20s\n", this.ingredient.getId(), this.ingredient.getName());
        }
    }
}
