package controller;

import views.MainView;

public class MainController {
    
    private MainView mainView;

    public MainController() {
        mainView = new MainView();
    }

    public void mainMenu() {
        MainView.OptionsMainScreen op;
        do {
            op = mainView.mainMenu();
            switch (op) {
                case RECEITAS:
                    this.recipesController();
                    break;
                case INGREDIENTES:
                    this.ingredientsController();
                    break;
                default:
                    break;
            }
        } while (op != MainView.OptionsMainScreen.VAZIO);
    }

    private void recipesController() {
        RecipesController recipeCtrl = new RecipesController();
        recipeCtrl.mainMenu();
    }

    private void ingredientsController() {
        IngredientsController ingredientCtrl = new IngredientsController();
        ingredientCtrl.mainMenu();
    }
}
