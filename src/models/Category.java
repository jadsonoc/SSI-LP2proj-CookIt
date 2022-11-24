package models;

import java.util.List;

public class Category {

    private Integer id;
    
    private String name;

    private List<Recipe> recipes;

    public Category(Integer id, String name) {
        this.id = id;
        this.setName(name);
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
