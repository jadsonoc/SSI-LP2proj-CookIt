package controller;

import java.util.List;

import data.BD;
import models.Food;
import models.Recipe;
import views.IngredientsView;
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

        for (Recipe rec : BD.receitas.values()) {
            if (rec.isElegible(ings))
                System.out.println(rec);
        }
    }

}
