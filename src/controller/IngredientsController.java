package controller;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;

import data.BD;
import models.Food;
import models.Recipe;
import views.IngredientsView;
import views.RecipeView;
import views.RecipesView;
import views.SuggestRecipeView;

public class IngredientsController {
    
    private IngredientsView ingredientsView;

    public IngredientsController() {
        ingredientsView = new IngredientsView(BD.alimentos);
    }

    public void mainMenu() {
        IngredientsView.IngredientsScreenOptions op;
        do {
            op = ingredientsView.mainMenu();
            switch (op) {
                case LIST:
                    this.list();
                    break;
                case SUGGEST:
                    this.suggestRecipe();
                    break;
                default:
                    break;
            }
        } while (op != IngredientsView.IngredientsScreenOptions.VAZIO);
    }

    private void list() {
        ingredientsView = new IngredientsView(BD.alimentos);
        ingredientsView.printIngredients();
    }

    private void suggestRecipe() {
        SuggestRecipeView suggestRecipeView = new SuggestRecipeView(BD.receitas, BD.alimentos);
        
        List<Food> ings = suggestRecipeView.chooseIngredientsMenu();

        // BD.receitas.entrySet()
        //         .stream()
        //         .filter(map -> map.getValue().isElegible(ings))
        //         .forEach(map -> new RecipeView(map.getValue()).printRecipe());
        // BD.receitas.entrySet()
        // .stream()
        // .filter(map -> map.getValue().isElegible(ings))
        // .forEach(map -> new RecipesView(map).chooseRecipeMenu());


        for (Recipe rec : BD.receitas.values()) {
            RecipeView recView;
            if (rec.isElegible(ings)) {
                recView = new RecipeView(rec);
                recView.printRecipe();
            }
        }




        //List<Recipe> recs = suggestRecipeView.chooseRecipesMenu();

       
    }

}
