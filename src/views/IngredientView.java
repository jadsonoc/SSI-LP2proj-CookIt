package views;

import java.util.Arrays;

import models.Food;
import models.Free;

public class IngredientView {
    
    private Food ingredient;

    public IngredientView(Food ingredient) {
        this.ingredient = ingredient;
    }

    public void printIngredient() {
        if (this.ingredient.isFree(Arrays.asList(new Free(Free.GLUTEN), new Free(Free.LACTOSE)))) {
            System.out.printf("%d %-50s %s\n", this.ingredient.getId(), this.ingredient.getName(), "*Free");
        } else {
            System.out.printf("%d %-50s\n", this.ingredient.getId(), this.ingredient.getName());
        }
    }
}
