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
            IngredientsView ingredientsView = new IngredientsView(this.ingredients);
            Food ing = ingredientsView.chooseIngredientMenu();
            chosenIngredients.add(ing);
            answer = InputKeyboardStream.readString("Deseja adicionar outro ingrediente? (s/n): ");
        }
        return chosenIngredients;
    }
    
    public List<Recipe> chooseRecipesMenu() {
        List<Recipe> chosenRecipes = new ArrayList<Recipe>();
        System.out.println("Escolha a receita que deseja visualizar: ");
        String answer = "s";
        while (answer.equals("s") | (answer.equals("S"))) {
            RecipesView recipesView = new RecipesView(this.recipes);
            Recipe rec = recipesView.chooseRecipeMenu();
            chosenRecipes.add(rec);
            answer = InputKeyboardStream.readString("Deseja adicionar outra receita? (s/n): ");
        }
        return chosenRecipes; 
    }
    
}
