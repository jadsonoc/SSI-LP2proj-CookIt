package views;

import java.util.List;
import java.util.Map;

import models.Free;
import models.Recipe;
import util.InputKeyboardStream;

public class RecipesView {
    public static enum RecipesScreenOptions {
        VAZIO, LIST, LIST_FREE_LAC, LIST_FREE_GLU, LIST_FREE
    };

    private Map<Integer, Recipe> recipes;

    public RecipesView(Map<Integer, Recipe> receitas) {
        this.recipes = receitas;
    }

    public RecipesScreenOptions mainMenu() {
        //Aqui necessita uma verificação do tamanho do array
        RecipesScreenOptions op = RecipesScreenOptions.VAZIO;
        System.out.println("0 - Voltar");
        System.out.println("1 - Listar todas as Receitas");
        System.out.println("2 - Listar receitas Sem Lactose");
        System.out.println("3 - Listar receitas Sem Glúten");
        System.out.println("4 - Listar receitas Sem Glúten e Sem Lactose");
        int i = InputKeyboardStream.readInt("Selecione uma opção acima: ");
        op = RecipesScreenOptions.values()[i];
        return op;
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

    public void printFreeRecipes() {
        if (this.recipes.size() > 0) {
            System.out.print("******************* Free *********************");
            for (Recipe rec : recipes.values()) {
                RecipeView recipeView = new RecipeView(rec);
                recipeView.printRecipe();
            }
        } else {
            System.out.println("************ Nenhuma receita cadastrada *************");
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
