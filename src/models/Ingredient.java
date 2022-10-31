package models;

public class Ingredient {
    
    private Recipe recipe;

    private Food ingredient;

    private int quantity;

    public Ingredient(Recipe recipe, Food ingredient, int quantity) {
        this.recipe = recipe;
        this.ingredient = ingredient;
        this.quantity = quantity;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public Food getIngredient() {
        return ingredient;
    }

    public void setIngredient(Food ingredient) {
        this.ingredient = ingredient;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Ingredient =" + ingredient.getName() + ", quantity=" + quantity + "]";
    }
    
    

}
