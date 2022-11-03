package views;

import java.util.Map;

import models.Recipe;
import util.InputKeyboardStream;

public class RecipesView {
    public static enum RecipesScreenOptions {
        VAZIO, LIST, ADD, EDIT, DELETE, SUGEST
    };

    private Map<Integer, Recipe> recipes;

    public RecipesView(Map<Integer, Recipe> receitas) {
        this.recipes = receitas;
    }

    public RecipesScreenOptions mainMenu() {
        RecipesScreenOptions op = RecipesScreenOptions.VAZIO;
        System.out.println("0 - Voltar");
        System.out.println("1 - Listar todas as Receitas");
        int i = InputKeyboardStream.readInt("Selecione uma opção acima: ");
        op = RecipesScreenOptions.values()[i];
        return op;
    }

    public void printRecipes() {
        System.out.println("******************* Receitas *********************");
        for (Recipe rec : recipes.values()) {
            RecipeView recipeView = new RecipeView(rec);
            recipeView.printRecipe();
        }
    }

    public void printElegibleRecipes() {
        System.out.println("*** Receitas que contém os ingredientes escolhidos: ***");
        for (Recipe rec : recipes.values()) {
            RecipeView recipeView = new RecipeView(rec);
            recipeView.printRecipeShort();
        }
    }

    public Recipe chooseRecipeMenu() {
        Recipe rec = null;
        this.printElegibleRecipes();
        int i = InputKeyboardStream.readInt("Informe o número da receita que deseja visualizar: ");
        // if ((i >= Sequences.INIT_FOOD) && (i <= (Sequences.INIT_FOOD + this.ingredients.size()))) {
        //     ing = this.ingredients.get(i);
        // }
        rec = this.recipes.get(i);
        return rec;
    }

}
