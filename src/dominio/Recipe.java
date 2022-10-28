package dominio;

import java.sql.Time;
import java.util.List;

public class Recipe {
    
    private String titulo;

    private Time preparation;

    private int serve;

    private int difficulty;

    private List<Ingredient> ingredients;

    private List<Category> categories;

}
