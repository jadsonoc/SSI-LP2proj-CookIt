package models;

import java.util.ArrayList;
import java.util.List;
import util.Sequences;

public class Food {

    private Integer id;
    
    private String name;

    private Unit unit;
    
    private List<Free> frees;

    private List<Ingredient> ingredients;

    public Food(String name, Unit unit) {
        this.setId();
        this.name = name;
        this.unit = unit;
    }

    public Food(String name, Unit unit, List<Free> frees) {
        this.setId();
        this.name = name;
        this.unit = unit;
        this.frees.addAll(frees);
    }

    private void setId() {
        this.id = Sequences.SEQ_FOOD++;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public void setFree(int free) {
        this.frees.add(new Free(free));
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<Recipe> getRecipes() {
        List<Recipe> tempRec = new ArrayList<>();
        for (Ingredient ing : this.ingredients) {
            tempRec.add(ing.getRecipe());
        }
        return tempRec;
    }

    public boolean isFree(List<Free> frees) {
        return (this.frees.equals(frees));
    }

    @Override
    public String toString() {
        return "Food [id=" + id + ", name=" + name + ", unit=" + unit + ", frees=" + frees + ", ingredients="
                + ingredients + "]";
    }
    
    

}