package controller;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import data.DB;
import models.Food;
import models.Recipe;
import views.RecipeView;
import views.RecipesView;
import views.SuggestRecipeView;

public class SuggestRecipeController {
    
    private SuggestRecipeView suggestRecipeView;

    private Map<Integer, Recipe> recipes;
    private Map<Integer, Food> foods;

    public SuggestRecipeController() {
        this.recipes = DB.receitas;
        this.foods = DB.alimentos;
        this.suggestRecipeView = new SuggestRecipeView(this.recipes, this.foods);
    }

    public void mainMenu() {
        SuggestRecipeView.SuggestRecipesScreenOptions op;
        do {
            op = suggestRecipeView.mainMenu();
            switch (op) {
                case SUGGEST:
                    this.suggestRecipe();
                    break;
                default:
                    break;
            }
        } while ( op != SuggestRecipeView.SuggestRecipesScreenOptions.VAZIO);
    }

    private void suggestRecipe() {
        
        List<Food> chosenIngs = suggestRecipeView.chooseIngredientsMenu();

        // BD.receitas.entrySet()
        //         .stream()
        //         .filter(map -> map.getValue().isElegible(ings))
        //         .forEach(map -> new RecipeView(map.getValue()).printRecipe());
        // BD.receitas.entrySet()
        // .stream()
        // .filter(map -> map.getValue().isElegible(ings))
        // .forEach(map -> new RecipesView(map).chooseRecipeMenu());
        Map<Integer, Recipe> elegibleRecipes = this.recipes.entrySet()
                .stream()
                .filter(map -> map.getValue().isElegible(chosenIngs))
                .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));
        
        // SuggestRecipeView suggestedRecipeView = new SuggestRecipeView(elegibleRecipes, null);
        
        // List<Recipe> chosenRecs = suggestedRecipeView.chooseRecipesMenu();
        // RecipesView chosenRecipesView = new RecipesView()
        
        RecipesView elegibleRecipesView = new RecipesView(elegibleRecipes);
        Recipe chosenRec = elegibleRecipesView.chooseRecipeMenu();
        RecipeView recView = new RecipeView(chosenRec);
        recView.printRecipe();
               
    }


}
