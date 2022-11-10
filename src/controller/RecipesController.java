package controller;

import java.util.Arrays;
import java.util.List;

import data.DB;
import models.Free;
import models.Recipe;
import views.RecipesView;

public class RecipesController {
    
    private RecipesView recipesView;

    public RecipesController() {
        recipesView = new RecipesView(DB.receitas);
    }

    public void mainMenu() {
        RecipesView.RecipesScreenOptions op;
        do {
            op = recipesView.mainMenu();
            switch (op) {
                case LIST:
                    this.list();
                    break;
                case LIST_FREE_LAC:
                    this.listFree(Arrays.asList(new Free(Free.LACTOSE)));
                    break;
                case LIST_FREE_GLU:
                    this.listFree(Arrays.asList(new Free(Free.GLUTEN)));
                    break;
                case LIST_FREE:
                    this.listFree(Arrays.asList(new Free(Free.GLUTEN), new Free(Free.LACTOSE)));
                default:
                    break;
            }
        } while ( op != RecipesView.RecipesScreenOptions.VAZIO);
    }

    private void list() {
        recipesView.printRecipes();
    }

    private void listFree(List<Free> frees) {
        recipesView = new RecipesView(Recipe.getRecipesFree(frees));
        recipesView.printFreeRecipes();
    }

}
