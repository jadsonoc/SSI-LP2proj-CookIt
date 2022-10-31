package views;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import models.Food;
import models.Recipe;
import util.InputKeyboardStream;

public class SuggestRecipeView {

    private Map<Integer, Recipe> recipes;

    private Map<Integer, Food> ingredients;

    public SuggestRecipeView(Map<Integer, Recipe> recipes, Map<Integer, Food> ingredients) {
        this.recipes = recipes;
        this.ingredients = ingredients;
    }

    public List<Food> chooseIngredientsMenu() {
        List<Food> chosenIngredients = new ArrayList<Food>();
        System.out.println("Escolha os ingredientes: ");
        String answer = "s";
        while (answer.equals("s") | (answer.equals("S"))) {
            IngredientsView ingredientsScreen = new IngredientsView(this.ingredients);
            Food ing = ingredientsScreen.chooseIngredientMenu();
            chosenIngredients.add(ing);
            answer = InputKeyboardStream.readString("Deseja adicionar outro ingrediente? (s/n): ");
        }
        return chosenIngredients; 
    }
    
}
