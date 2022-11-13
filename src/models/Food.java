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
        this.frees = frees;
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
        if ( this.frees == null || frees == null ) {
            return false;
        } else if (frees.size() > 1) {
            return this.frees.containsAll(frees);
        } else {
            return this.frees.contains(frees);
        }
            //Maneira que achava coerente, até corrigir a falta da associação na classe Free
            //Aqui, o retorno foi construído com base nos frees atrelados a este Food utilizando a API Stream
            //Primeiro, cria-se o stream, logo após, com a função AllMatch, verifica se todos os itens retornados
            //pela função f1, a seguir, estão contidos neste list
            //A f1, por sua vez, usa API stream novamente e transforma em um MAP dos valores int correspondentes ao
            //objeto Free (itilizando o operador :: para fazer referência ao métodos de getValueFree da classe Free)
            //e, por fim, comparando os valores ao invés dos objetos e retornando true se houver match
            // return this.frees.stream()
            //                  .anyMatch(f1 -> { 
            //                     return frees.stream()
            //                                 .map(Free::getValueFree)
            //                                 .anyMatch(f2 -> f2.equals(f1.getValueFree()));
            //                  });

    }

    @Override
    public String toString() {
        return "Food [id=" + id + ", name=" + name + ", unit=" + unit + ", frees=" + frees + ", ingredients="
                + ingredients + "]";
    }
    
    

}