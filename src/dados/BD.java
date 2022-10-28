package dados;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dominio.Category;
import dominio.Food;
import dominio.Free;
import dominio.Ingredient;
import dominio.Kitchenware;
import dominio.Recipe;
import dominio.Unit;
import dominio.User;

public class BD {

    public static User usuario = new User("Jadson Costa", "jadsonoc@gmail.com", "jadsonoc", "123456");
    public static List<Free> semLacGluten = new ArrayList<Free>(
            Arrays.asList(new Free(Free.GLUTEN), new Free(Free.LACTOSE)));


    public static Map<Integer, Unit> unidades = new HashMap<Integer, Unit>();
    public static Map<Integer, Category> categorias = new HashMap<Integer, Category>();
    public static Map<Integer, Food> alimentos = new HashMap<Integer, Food>();
    public static Map<Integer, Recipe> receitas = new HashMap<Integer, Recipe>();

    public static Map<Integer, Kitchenware> utensilios = new HashMap<Integer, Kitchenware>();


    public static void criaCategorias() {
        Category cat;
        cat = new Category("Café da Manhã");           
        categorias.put(cat.getId(), cat);
        cat = new Category("Lanche da Tarde");
        categorias.put(cat.getId(), cat);
        cat = new Category("Almoço");
        categorias.put(cat.getId(), cat);
        cat = new Category("Jantar");
        categorias.put(cat.getId(), cat);
        cat = new Category("Almoço em Família");
        categorias.put(cat.getId(), cat);
        cat = new Category("Sobremesa");
        categorias.put(cat.getId(), cat);
        cat = new Category("Saudável");
        categorias.put(cat.getId(), cat);
    }

    public static void criaUnidades() {
        Unit uni;
        uni = new Unit("quilograma", "kg");
        unidades.put(uni.getId(), uni);
        uni = new Unit("grama", "g");
        unidades.put(uni.getId(), uni);
        uni = new Unit("litro", "l");
        unidades.put(uni.getId(), uni);
        uni = new Unit("mililitro", "ml");
        unidades.put(uni.getId(), uni);
        uni = new Unit("unidade", "un");
        unidades.put(uni.getId(), uni);
        uni = new Unit("colher de sopa", "C");
        unidades.put(uni.getId(), uni);
        uni = new Unit("colher de chá", "c");
        unidades.put(uni.getId(), uni);
        uni = new Unit("xícara", "xíc");
        unidades.put(uni.getId(), uni);
        uni = new Unit("o quanto baste", "q.b.");
        unidades.put(uni.getId(), uni);
        uni = new Unit("fatias", "fat");
        unidades.put(uni.getId(), uni);
    }

    public static void criaAlimentos() {
        Food foo;
        foo = new Food("Filé mingnon", unidades.get(2));
        alimentos.put(foo.getId(), foo);
        foo = new Food("Manteiga", unidades.get(2));
        alimentos.put(foo.getId(), foo);
        foo = new Food("Carne moída", unidades.get(2));
        alimentos.put(foo.getId(), foo);
        foo = new Food("Presunto fatiado", unidades.get(2));
        alimentos.put(foo.getId(), foo);
        foo = new Food("Tomate", unidades.get(2));
        alimentos.put(foo.getId(), foo);
        foo = new Food("Orégano", unidades.get(9));
        alimentos.put(foo.getId(), foo);
        foo = new Food("Couve-flor", unidades.get(5));
        alimentos.put(foo.getId(), foo);
        foo = new Food("Azeite", unidades.get(4));
        alimentos.put(foo.getId(), foo);
        foo = new Food("Cebola", unidades.get(2));
        alimentos.put(foo.getId(), foo);
        foo = new Food("Tomate cereja", unidades.get(8));
        alimentos.put(foo.getId(), foo);
        foo = new Food("Pimenta do reino", unidades.get(9));
        alimentos.put(foo.getId(), foo);
        foo = new Food("Sal", unidades.get(9));
        alimentos.put(foo.getId(), foo);
        foo = new Food("Tempero Verde", unidades.get(6));
        alimentos.put(foo.getId(), foo);
        foo = new Food("Ovo", unidades.get(5));
        alimentos.put(foo.getId(), foo);
        foo = new Food("Leite", unidades.get(4));
        alimentos.put(foo.getId(), foo);
        foo = new Food("Pão de forma", unidades.get(10));
        alimentos.put(foo.getId(), foo);
        foo = new Food("Tapioca", unidades.get(8));
        alimentos.put(foo.getId(), foo);
        foo = new Food("Biscoito de chocolate", unidades.get(2));
        alimentos.put(foo.getId(), foo);
        foo = new Food("Cream Cheese", unidades.get(2));
        alimentos.put(foo.getId(), foo);
        foo = new Food("Creme Gianduia (Nutella)", unidades.get(2));
        alimentos.put(foo.getId(), foo);
    }

    public static void criaReceitas() {
        List<Category> tempCat = new ArrayList<Category>(
           Arrays.asList(categorias.get(602), categorias.get(603)));
        List<Ingredient> tempIng; 
        String tempPrep = "1. Corte o filé mignon em tiras com espessura de aproximadamente 1 centímetro;2. Corte a cebola descascada ao meio e, depois em meias luas no sentido contrário aos gomos;3. Em um recipiente, tempere o filé mignon com sal e pimenta do reino o quanto baste (q.b.); 4. Reserve em geladeira por 10 minutos;5. Em uma frigideira grande aqueça a manteiga, refogue o filé e deixe dourar, sem mexer muito para não juntar líquido;6. Acrescente a cebola e refogue até dourar;7. Sirva;Sugestão de acompanhamento: Arroz branco e/ou Saladinha.";
        tempPrep.replaceAll(";",System.lineSeparator());
        Recipe rec;
        rec = new Recipe("Iscas de Filé Mignon Aceboladas", tempPrep, LocalTime.of(0, 20), 4, 1, tempCat);
        tempIng = new ArrayList<Ingredient>(
            Arrays.asList(new Ingredient(rec, alimentos.get(1000), 500),
                          new Ingredient(rec, alimentos.get(1001), 2),
                          new Ingredient(rec, alimentos.get(1002), 1))
            );
        rec.setIngredients(tempIng);
        receitas.put(rec.getId(), rec);
    }
    
    public static void criaUtensilios() {
        Kitchenware kit;
        kit = new Kitchenware("Forma de bolo");
        utensilios.put(kit.getId(), kit);
        kit = new Kitchenware("Frigideira");
        utensilios.put(kit.getId(), kit);
    }

}