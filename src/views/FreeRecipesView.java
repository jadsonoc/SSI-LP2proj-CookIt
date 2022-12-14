package views;

import java.util.List;
import java.util.Map;
import models.Free;
import models.Recipe;
import util.InputKeyboardStream;

public class FreeRecipesView {

    public static enum FreeRecipesScreenOptions {
        VAZIO, LIST_FREE_LAC, LIST_FREE_GLU, LIST_FREE
    };

    private Map<Integer, Recipe> recipes;
    
    private List<Free> frees;

    public FreeRecipesView() {
    }
    
    public FreeRecipesView(Map<Integer, Recipe> recipes, List<Free> frees) {
        this.recipes = recipes;
        this.frees = frees;
    }

    public FreeRecipesScreenOptions mainMenu() {
        FreeRecipesScreenOptions selectedOption = FreeRecipesScreenOptions.VAZIO;
        int input = 0;
        do {
            System.out.println("****************** Receitas Especiais :: CookIt! *****************");
            System.out.println();
            System.out.println("0 - Voltar");
            System.out.println("1 - Listar receitas Sem Lactose");
            System.out.println("2 - Listar receitas Sem Glúten");
            System.out.println("3 - Listar receitas Sem Glúten e Sem Lactose");
            input = InputKeyboardStream.readInt("Selecione uma opção acima: ");
        } while (input < 0 || input > (FreeRecipesScreenOptions.values().length - 1));
        InputKeyboardStream.clearScreen();
        selectedOption = FreeRecipesScreenOptions.values()[input];
        return selectedOption;
    }

    public void printFreeRecipes() {
        if (this.frees.size() > 1) {
            //Isso, futuramente, terá de ser mudado, pois, poderão surgir novos itens para Free
            System.out.println("*********** Receitas Livres de Glúten e Lactose ***********");
            for (Recipe rec : Recipe.getRecipesFree(recipes, frees)) {
                RecipeView recipeView = new RecipeView(rec);
                recipeView.printRecipe();
            }
        } else if (this.frees.size() > 0) {
            String title = (this.frees.get(0).getValueFree() == Free.GLUTEN) ? "Glúten" : "Lactose";
            System.out.println("*********** Receitas Livres de " + title + " ***********");
            for (Recipe rec : Recipe.getRecipesFree(recipes, frees)) {
                RecipeView recipeView = new RecipeView(rec);
                recipeView.printRecipe();
            }
        } else {
            System.out.println("************ Nenhuma receita cadastrada *************");
        }
    }

}
