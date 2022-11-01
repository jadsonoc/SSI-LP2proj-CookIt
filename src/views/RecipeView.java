package views;

import models.Recipe;

public class RecipeView {

    private Recipe recipe;

    public RecipeView(Recipe recipe) {
        this.recipe = recipe;
    }
    
    public void printRecipe() {
        System.out.println("-------- Receita n.º " + this.recipe.getId() + " --------");
        System.out.println("Tílulo: " + this.recipe.getTitulo());
        System.out.println("Tempo de Preparo: " + this.recipe.getTime());
        System.out.println("Rendimento: " + this.recipe.getServe() + " porções.");
        IngredientsView ingredientsView = new IngredientsView(this.recipe.getIngredients());
        ingredientsView.printIngredients();
        System.out.println("------- Modo de Preparo: -------- ");
        System.out.println(this.recipe.getPreparation());
    }
    
}
