package models;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import data.DB;
import util.Sequences;

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

    public Recipe(String titulo, String preparation, LocalTime time, int serve, int difficulty,
        List<Category> categories, List<Kitchenware> kitchenwares) {
        this.id = Sequences.SEQ_RECIPES++;
        this.titulo = titulo;
        this.preparation = preparation;
        this.time = time;
        this.serve = serve;
        this.difficulty = difficulty;
        this.categories = categories;
        this.kitchenwares = kitchenwares;
    }

    public static Map<Integer, Recipe> getRecipesFree( List<Free> frees ) {
        Map<Integer, Recipe> freeRecipes = DB.receitas.entrySet()
        .stream()
        .filter(map -> map.getValue().isFree(frees))
                .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));
        return freeRecipes;
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

    public int getRequiredIngredientsTotal() {
        int requiredIngredients = 0;
        for (Ingredient ingredient : this.ingredients) {
            if (ingredient.isRequired())
                requiredIngredients++;
        }
        return requiredIngredients;
    } 
    
    public boolean isFree(List<Free> frees) {
        return this.ingredients.stream()
                               .allMatch(i -> i.getIngredient().isFree(frees));
    }


    @Override
    public String toString() {
        return "Recipe [id=" + id + ", titulo=" + titulo + ", preparation=" + preparation + ", time=" + time
                + ", serve=" + serve + ", difficulty=" + difficulty + ", ingredients=" + ingredients + ", categories="
                + categories + ", kitchenwares=" + kitchenwares + "]";
    }

}
