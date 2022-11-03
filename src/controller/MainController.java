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
                case PROFILE:
                    this.profileController();
                    break;
                case RECIPES:
                    this.recipesController();
                    break;
                case INGREDIENTS:
                    this.ingredientsController();
                    break;
                case SUGGEST:
                    this.suggestRecipeController();
                    break;
                default:
                    break;
            }
        } while (op != MainView.OptionsMainScreen.VAZIO);
    }

    private void profileController() {
        ProfileController profileCtrl = new ProfileController();
        profileCtrl.mainMenu();
    }

    private void recipesController() {
        RecipesController recipeCtrl = new RecipesController();
        recipeCtrl.mainMenu();
    }

    private void ingredientsController() {
        IngredientsController ingredientCtrl = new IngredientsController();
        ingredientCtrl.mainMenu();
    }

    private void suggestRecipeController() {
        SuggestRecipeController suggestRecipeCrtl = new SuggestRecipeController();
        suggestRecipeCrtl.mainMenu();
    }
}
