package views;

import models.Recipe;

public class RecipeView {

    private Recipe recipe;

    public RecipeView(Recipe recipe) {
        this.recipe = recipe;
    }
    
    public void printRecipe() {
        System.out.println(this.recipe.toString());
    }
}
