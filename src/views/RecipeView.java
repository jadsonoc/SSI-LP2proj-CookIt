package views;

import models.Recipe;

public class RecipeView {

    private Recipe recipe;

    public RecipeView(Recipe recipe) {
        this.recipe = recipe;
    }
    
    public void printRecipe() {
        System.out.println("");
        System.out.println("");
        System.out.println("-------- Receita n.º " + this.recipe.getId() + " --------");
        System.out.println("Tílulo: " + this.recipe.getTitulo());
        System.out.println("Tempo de Preparo: " + this.recipe.getTime());
        System.out.println("Rendimento: " + this.recipe.getServe() + " porções.");
        System.out.println("Grau de dificuldade: " + this.recipe.getDifficulty());
        IngredientsView ingredientsView = new IngredientsView(this.recipe.getIngredients());
        ingredientsView.printIngredients();
        System.out.println("------- Modo de Preparo:  ");
        System.out.println(this.recipe.getPreparation());
        KitchenwaresView kitchenwaresView = new KitchenwaresView(this.recipe.getKitchenwares());
        kitchenwaresView.printKitchenwares();
        CategoriesView categoriesView = new CategoriesView(this.recipe.getCategories());
        categoriesView.printCategories();
    }

    public void printRecipeShort() {
        System.out.printf("%d %s  --  ", this.recipe.getId(), this.recipe.getTitulo());
        System.out.println(
                "Tempo de Preparo: " + this.recipe.getTime() + " Rendimento: " + this.recipe.getServe() + " porções.");
    }
    
}
