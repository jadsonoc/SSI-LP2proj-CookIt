package controller;

import java.util.Arrays;
import java.util.List;

import data.DB;
import models.Free;
import models.Recipe;
import views.FreeRecipesView;
import views.RecipesView;

public class RecipesController {
    
    private RecipesView recipesView;
    private FreeRecipesView freeRecipesView;

    public RecipesController() {
        recipesView = new RecipesView(DB.receitas);
        freeRecipesView = new FreeRecipesView();
    }

    public void mainMenu() {
        RecipesView.RecipesScreenOptions op;
        do {
            op = recipesView.mainMenu();
            switch (op) {
                case LIST:
                    this.list();
                    break;
                case LIST_FREES:
                    this.freeRecipesController();
                    break;
                default:
                    break;
            }
        } while ( op != RecipesView.RecipesScreenOptions.VAZIO);
    }

    private void list() {
        recipesView.printRecipes();
    }

    private void freeRecipesController() {
        FreeRecipesController freeRecipesCtrl = new FreeRecipesController();
        freeRecipesCtrl.mainMenu();
    }

}
