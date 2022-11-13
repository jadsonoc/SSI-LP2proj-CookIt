package controller;

import java.util.Arrays;

import data.DB;
import models.Free;
import views.FreeRecipesView;

public class FreeRecipesController {

    private FreeRecipesView freeRecipesView;

    public FreeRecipesController() {
        freeRecipesView = new FreeRecipesView();
    }

    public void mainMenu() {
        FreeRecipesView.FreeRecipesScreenOptions op;
        do {
            op = freeRecipesView.mainMenu();
            switch (op) {
                case LIST_FREE_LAC:
                    this.listFreeLactose();
                    break;
                case LIST_FREE_GLU:
                    this.listFreeGluten();
                    break;
                case LIST_FREE:
                    this.listFreeLactoseAndGluten();
                    break;
                default:
                    break;
            }
        } while (op != FreeRecipesView.FreeRecipesScreenOptions.VAZIO);
    }

    private void listFreeLactose() {
        FreeRecipesView freeRecipesView = new FreeRecipesView(Arrays.asList(new Free(Free.LACTOSE)));
        freeRecipesView.printFreeRecipes();
    }

    private void listFreeGluten() {
        FreeRecipesView freeRecipesView = new FreeRecipesView(Arrays.asList(new Free(Free.GLUTEN)));
        freeRecipesView.printFreeRecipes();
    }

    private void listFreeLactoseAndGluten() {
        FreeRecipesView freeRecipesView = new FreeRecipesView(Arrays.asList(new Free(Free.LACTOSE), new Free(Free.GLUTEN)));
        freeRecipesView.printFreeRecipes();
    }
    
}
