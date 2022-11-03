package controller;

import data.DB;
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
                default:
                    break;
            }
        } while ( op != RecipesView.RecipesScreenOptions.VAZIO);
    }

    private void list() {
        recipesView.printRecipes();
    }

}
