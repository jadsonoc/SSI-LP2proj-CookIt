package dominio;

import java.time.LocalTime;
import java.util.List;

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

    public Recipe(String titulo, String preparation, LocalTime time, int serve, int difficulty, List<Category> categories) {
        this.id = Sequences.SEQ_RECIPES++;
        this.titulo = titulo;
        this.preparation = preparation;
        this.time = time;
        this.serve = serve;
        this.difficulty = difficulty;
        this.categories = categories;
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

}
