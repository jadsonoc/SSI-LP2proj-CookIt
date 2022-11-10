package models;

public class Ingredient {
    
    private Recipe recipe;

    private Food ingredient;

    private float quantity;

    private boolean required;

    public Ingredient(Recipe recipe, Food ingredient, float quantity) {
        this.recipe = recipe;
        this.ingredient = ingredient;
        this.quantity = quantity;
        this.required = false;
    }

    public Ingredient(Recipe recipe, Food ingredient, float quantity, boolean required) {
        this.recipe = recipe;
        this.ingredient = ingredient;
        this.quantity = quantity;
        this.required = required;
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

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public boolean isRequired() {
        return this.required;
    }

    @Override
    public String toString() {
        return "Ingredient =" + ingredient.getName() + ", quantity=" + quantity + "]";
    }
    
    

}
