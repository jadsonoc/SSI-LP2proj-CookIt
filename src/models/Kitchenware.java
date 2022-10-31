package models;

import java.util.List;

import util.Sequences;

public class Kitchenware {

    private Integer id;
    
    private String name;

    private List<Recipe> recipes;
    
    private List<Kitchenware> repleacements;

    public Kitchenware(String name) {
        this.id = Sequences.SEQ_KITCHENWARE++;
        this.name = name;
    }

    public Kitchenware(String name, List<Kitchenware> repleacements) {
        this.id = Sequences.SEQ_KITCHENWARE++;
        this.name = name;
        this.repleacements = repleacements;
    }

    public Kitchenware(String name, List<Recipe> recipes, List<Kitchenware> repleacements) {
        this.id = Sequences.SEQ_KITCHENWARE++;
        this.name = name;
        this.recipes = recipes;
        this.repleacements = repleacements;
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

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<Recipe> recipes) {
        this.recipes = recipes;
    }

    public List<Kitchenware> getRepleacements() {
        return repleacements;
    }

    public void setRepleacements(List<Kitchenware> repleacements) {
        this.repleacements = repleacements;
    }

    @Override
    public String toString() {
        return "Kitchenware [id=" + id + ", name=" + name + "]";
    }

}
