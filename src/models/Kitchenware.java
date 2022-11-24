package models;

import java.util.ArrayList;
import java.util.List;

import util.Sequences;

public class Kitchenware {

    private Integer id;
    
    private String name;
    
    private List<Kitchenware> repleacements;

    private List<Recipe> recipes;

    public Kitchenware(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Kitchenware(Integer id, String name, List<Kitchenware> repleacements) {
        this.id = id;
        this.name = name;
        if (repleacements != null) {
            this.repleacements = new ArrayList<Kitchenware>();
            this.repleacements.addAll(repleacements);
        }
    }

    public Kitchenware(String name, List<Kitchenware> repleacements, List<Recipe> recipes) {
        this.id = Sequences.SEQ_KITCHENWARE++;
        this.name = name;
        if (repleacements != null) {
            this.repleacements = new ArrayList<Kitchenware>();
            this.repleacements.addAll(repleacements);
        }
        this.recipes = recipes;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Recipe> getRecipes() {
        return this.recipes;
    }

    public void setRecipes(List<Recipe> recipes) {
        this.recipes = recipes;
    }

    public List<Kitchenware> getRepleacements() {
        return this.repleacements;
    }

    public void setRepleacements(List<Kitchenware> repleacements) {
        this.repleacements = repleacements;
    }

    public boolean hasRepleacements() {
        return (this.getRepleacements() != null);
    }

    @Override
    public String toString() {
        return "Kitchenware [id=" + id + ", name=" + name + ", repleacements=" + repleacements + "]";
    }

}
