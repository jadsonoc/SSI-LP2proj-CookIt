package views;

import java.util.Map;
import models.Food;
import util.InputKeyboardStream;
import util.Sequences;

public class IngredientsView {
    
    public static enum IngredientsScreenOptions {
        VAZIO, LIST, SUGGEST, ADD, EDIT, DELETE
    };
    
    private Map<Integer, Food> ingredients;

    public IngredientsView(Map<Integer, Food> ingredients) {
        this.ingredients = ingredients;
    }

    public IngredientsScreenOptions mainMenu() { 
        IngredientsScreenOptions op = IngredientsScreenOptions.VAZIO;
        System.out.println("0 - Votar");
        System.out.println("1 - Listar todos os Ingredientes");
        System.out.println("2 - Receber Sugestão de Receitas");
        int i = InputKeyboardStream.readInt("Escolha uma opção acima: ");
        op = IngredientsScreenOptions.values()[i];
        return op;
    }

    public void printIngredients() {
        System.out.println("******************* Ingredients *********************");
        for (Food ing : ingredients.values()) {
            IngredientView ingredientScreen = new IngredientView(ing);
            ingredientScreen.printIngredient();
        }
    }
    
    public Food chooseIngredientMenu() {
        Food ing = null;
        this.printIngredients();
        int i = InputKeyboardStream.readInt("Informe o número do Ingrediente: ");
        if ((i >= Sequences.INIT_FOOD) && (i <= (Sequences.INIT_FOOD + this.ingredients.size()))) {
            ing = this.ingredients.get(i);
        }
        return ing;
    }

}
