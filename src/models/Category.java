package models;

import java.util.List;

import util.Sequences;

public class Category {

    private Integer id;
    
    private String name;

    private List<Recipe> recipes;

    public Category(String name) {
        this.setId();
        this.setName(name);
    }

    private void setId() {
        this.id = Sequences.SEQ_CATEGORY++;
    }

    public Integer getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Recipe> getAssociatedRecipes() {
        return recipes;
    }

    public void setRecipes(List<Recipe> recipes) {
        this.recipes = recipes;
    }

    @Override
    public String toString() {
        return "Category [id=" + id + ", name=" + name + "]";
    }
   
    
}
