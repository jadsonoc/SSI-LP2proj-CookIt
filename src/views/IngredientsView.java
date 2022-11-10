package views;

import java.util.List;
import java.util.Map;
import models.Food;
import models.Ingredient;
import util.InputKeyboardStream;

public class IngredientsView {
    
    public static enum IngredientsScreenOptions {
        VAZIO, LIST, ADD, EDIT, DELETE
    };
    
    private Map<Integer, Food> ingredients;

    private List<Ingredient> ingredientsRecipe;

    public IngredientsView(Map<Integer, Food> ingredients) {
        this.ingredients = ingredients;
    }

    public IngredientsView(List<Ingredient> ingredients) {
        this.ingredientsRecipe = ingredients;
    }

    public IngredientsScreenOptions mainMenu() { 
        IngredientsScreenOptions op = IngredientsScreenOptions.VAZIO;
        System.out.println("0 - Votar");
        System.out.println("1 - Listar todos os Ingredientes");
        int i = InputKeyboardStream.readInt("Escolha uma opção acima: ");
        op = IngredientsScreenOptions.values()[i];
        return op;
    }

    public void printIngredients() {
        if (this.ingredients != null) {
            System.out.println("******************* Ingredientes *********************");
            for (Food ing : ingredients.values()) {
                IngredientView ingredientScreen = new IngredientView(ing);
                ingredientScreen.printIngredient();
            }
        } else if (this.ingredientsRecipe != null) {
            System.out.println("------- Ingredientes necessários: ");
            for (Ingredient ing : this.ingredientsRecipe) {
                if (ing.getIngredient().getUnit().getAbbreviation() == "q.b.")
                    System.out.printf("%s %s\n", ing.getIngredient().getName(), ing.getIngredient().getUnit().getAbbreviation());
                else
                    System.out.printf("%.0f %s %s\n", ing.getQuantity(), ing.getIngredient().getUnit().getAbbreviation(), ing.getIngredient().getName() );
            }
        } else {
            System.out.println("Nenhum ingrediente cadastrado!");
        }
    }
    
    public Food chooseIngredientMenu() {
        Food ing = null;
        int i = 0;
        this.printIngredients();
        do {
            i = InputKeyboardStream.readInt("Informe o número do Ingrediente: ");
        } while (!this.ingredients.containsKey(i));
        System.out.println("Ingrediente escolhido: " + this.ingredients.get(i).getName());
        ing = this.ingredients.get(i);
        return ing;
    }

}
