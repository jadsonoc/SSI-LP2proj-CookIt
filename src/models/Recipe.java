package models;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Recipe {

    private Integer id;
    
    private String titulo;

    private String preparation;

    private LocalTime time;

    private int serve;

    private int difficulty;

    private List<Ingredient> ingredients;

    private List<Category> categories;

    private List<Kitchenware> kitchenwares;

    public Recipe(Integer id, String titulo, String preparation, LocalTime time, int serve, int difficulty) {
        this.id = id;
        this.titulo = titulo;
        this.preparation = preparation;
        this.time = time;
        this.serve = serve;
        this.difficulty = difficulty;
    }

    public Recipe(Integer id, String titulo, String preparation, LocalTime time, int serve, int difficulty,
        List<Category> categories, List<Kitchenware> kitchenwares) {
        this.id = id;
        this.titulo = titulo;
        this.preparation = preparation;
        this.time = time;
        this.serve = serve;
        this.difficulty = difficulty;
        this.categories = categories;
        this.kitchenwares = kitchenwares;
    }

    public static List<Recipe> getRecipesFree(Map<Integer, Recipe> recipes, List<Free> frees) {
        List<Recipe> freeRecipes = new ArrayList<Recipe>();
        recipes.entrySet()
                .stream()
                .filter(map -> map.getValue().isFree(frees))
                .forEach(map -> freeRecipes.add(map.getValue()));
        return freeRecipes;
    }

    public static List<Recipe> getRecipesUnderSkills(Map<Integer, Recipe> recipes, int skills) {
        List<Recipe> skillsRecipes = new ArrayList<Recipe>();
        recipes.entrySet()
                .stream()
                .filter(map -> map.getValue().getDifficulty() <= skills)
                .forEach(map -> skillsRecipes.add(map.getValue()));
        return skillsRecipes;
    }

    public Integer getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public int getServe() {
        return serve;
    }

    public void setServe(int serve) {
        this.serve = serve;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<Kitchenware> getKitchenwares() {
        return kitchenwares;
    }

    public void setKitchenwares(List<Kitchenware> kitchenwares) {
        this.kitchenwares = kitchenwares;
    }

    public void addIngredient(Food food, float quantity) {
        if (food != null && quantity > 0) {
            this.ingredients.add(new Ingredient(this, food, quantity));
        }
    }

    public void addCategory(Category category) {
        if (category != null) {
            this.categories.add(category);
        }
    }

    public void addKitchenware(Kitchenware kitchenware) {
        if (kitchenware != null) {
            this.kitchenwares.add(kitchenware);
        }
    }

    public boolean isFree(List<Free> frees) {
        return this.ingredients.stream()
                .allMatch(i -> i.getIngredient().isFree(frees));
    }

    public boolean isElegible(List<Food> foods) {
        int required = 0;

        for (Food food : foods) {
            for (Ingredient ingredient : this.ingredients) {
                if (ingredient.getIngredient().equals(food)) {
                    if (ingredient.isRequired())
                        required++;
                }
            }
        }
        //(counter > ((this.ingredients.size() / 2) - 1)) && (
        return (required == this.getRequiredIngredientsTotal());
    }

    private int getRequiredIngredientsTotal() {
        int requiredIngredients = 0;
        for (Ingredient ingredient : this.ingredients) {
            if (ingredient.isRequired())
                requiredIngredients++;
        }
        return requiredIngredients;
    } 

    @Override
    public String toString() {
        return "Recipe [id=" + id + ", titulo=" + titulo + ", preparation=" + preparation + ", time=" + time
                + ", serve=" + serve + ", difficulty=" + difficulty + ", ingredients=" + ingredients + ", categories="
                + categories + ", kitchenwares=" + kitchenwares + "]";
    }

}
