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
        //Transforma o atributo receitas local em um entrySet
        //Que possibilita a filtragem por "isElegible"
        //E retorna outro Map para uso nas views
        Map<Integer, Recipe> elegibleRecipes = this.recipes.entrySet()
                .stream()
                .filter(map -> map.getValue().isElegible(chosenIngs))
                .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

        RecipesView elegibleRecipesView = new RecipesView(elegibleRecipes);
        //Somente dá seguimento se tiver havido receita elegível
        if (elegibleRecipes.size() > 0) {
            Recipe chosenRec = elegibleRecipesView.chooseRecipeMenu();
            RecipeView recView = new RecipeView(chosenRec);
            recView.printRecipe();
        } else {
            elegibleRecipesView.printMessageToUser("Infelizmente, nenhuma receita contendo seus ingredientes foi encontrada em nossa base.");
        }
    }
}
