package controller;

import data.DB;
import views.IngredientsView;

public class IngredientsController {
    
    private IngredientsView ingredientsView;

    public IngredientsController() {
        ingredientsView = new IngredientsView(DB.alimentos);
    }

    public void mainMenu() {
        IngredientsView.IngredientsScreenOptions op;
        do {
            op = ingredientsView.mainMenu();
            switch (op) {
                case LIST:
                    this.list();
                    break;
                default:
                    break;
            }
        } while (op != IngredientsView.IngredientsScreenOptions.VAZIO);
    }

    private void list() {
        ingredientsView = new IngredientsView(DB.alimentos);
        ingredientsView.printIngredients();
    }

    

}
