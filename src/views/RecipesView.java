package views;

import java.util.Map;
import models.Recipe;
import util.InputKeyboardStream;

public class RecipesView {
    public static enum RecipesScreenOptions {
        VAZIO, LIST, LIST_FREES, LIST_UNDER_SKILLS
    };

    private Map<Integer, Recipe> recipes;

    public RecipesView(Map<Integer, Recipe> receitas) {
        this.recipes = receitas;
    }

    public RecipesScreenOptions mainMenu() {
        RecipesScreenOptions selectedOption = RecipesScreenOptions.VAZIO;
        int input = 0;
        do {
            System.out.println("****************** Receitas :: CookIt! *****************");
            System.out.println();
            System.out.println("0 - Voltar");
            System.out.println("1 - Listar todas as Receitas");
            System.out.println("2 - Listar receitas especiais para intolerâncias alimentares");
            System.out.println("3 - Mostrar receitas de acordo com as minhas habilidades");
            input = InputKeyboardStream.readInt("Selecione uma opção acima: ");
        } while (input < 0 || input > (RecipesScreenOptions.values().length - 1));
        InputKeyboardStream.clearScreen();
        selectedOption = RecipesScreenOptions.values()[input];
        return selectedOption;
    }

    public void printRecipes() {
        if (this.recipes.size() > 0) {
            System.out.println("******************* Receitas *********************");
            for (Recipe rec : recipes.values()) {
                RecipeView recipeView = new RecipeView(rec);
                recipeView.printRecipe();
            }
        } else {
            System.out.println("************ Nenhuma receita cadastrada *************");
        }
    }

    public void printElegibleRecipes() {
        if (this.recipes.size() > 0) {
            System.out.println("*** Receitas que contêm os ingredientes escolhidos: ***");
            for (Recipe rec : recipes.values()) {
                RecipeView recipeView = new RecipeView(rec);
                recipeView.printRecipeShort();
            }
        } else {
            System.out.println("*** Nenhuma receita encontrada para esses ingredients ***");
        }
    }

    public Recipe chooseRecipeMenu() {
        Recipe rec = null;
        int i = 0;
        this.printElegibleRecipes();
        do {
            i = InputKeyboardStream.readInt("Informe o número da receita que deseja visualizar: ");
        } while (!this.recipes.containsKey(i));
        rec = this.recipes.get(i);
        return rec;
    }
    
}
