package controller;

import data.DB;
import views.RecipesView;
import views.UnderSkillsRecipesView;

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
                case LIST_FREES:
                    this.freeRecipesController();
                    break;
                case LIST_UNDER_SKILLS:
                    this.listUnderSkills();
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

    private void listUnderSkills() {
        UnderSkillsRecipesView underSkillsRecipesView = new UnderSkillsRecipesView(DB.receitas, DB.usuario);
        underSkillsRecipesView.printUnderSkilssRecipes();
    }

}
