package data;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.Category;
import models.Food;
import models.Free;
import models.Ingredient;
import models.Kitchenware;
import models.Recipe;
import models.Unit;
import models.User;

public class BD {

    public static User usuario = new User("Jadson Costa", "jadsonoc@gmail.com", "jadsonoc", "123456");
    public static List<Free> semLacGluten = new ArrayList<Free>(
            Arrays.asList(new Free(Free.GLUTEN), new Free(Free.LACTOSE)));


    public static Map<Integer, Unit> unidades = new HashMap<Integer, Unit>();
    public static Map<Integer, Category> categorias = new HashMap<Integer, Category>();
    public static Map<Integer, Food> alimentos = new HashMap<Integer, Food>();
    public static Map<Integer, Kitchenware> utensilios = new HashMap<Integer, Kitchenware>();
    public static Map<Integer, Recipe> receitas = new HashMap<Integer, Recipe>();


    public static void criaCategorias() {
        Category cat;
        cat = new Category("Café da Manhã");           
        categorias.put(cat.getId(), cat);
        cat = new Category("Lanche da Tarde");
        categorias.put(cat.getId(), cat);
        cat = new Category("Almoço"); //602
        categorias.put(cat.getId(), cat);
        cat = new Category("Jantar"); //603
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
        foo = new Food("Filé mingnon", unidades.get(2)); //1000
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
        foo = new Food("Biscoito de chocolate", unidades.get(2)); //1017
        alimentos.put(foo.getId(), foo);
        foo = new Food("Cream Cheese", unidades.get(2));
        alimentos.put(foo.getId(), foo);
        foo = new Food("Creme Gianduia (Nutella)", unidades.get(2));
        alimentos.put(foo.getId(), foo);
    }

    public static void criaUtensilios() {
        Kitchenware kit;
        List<Kitchenware> rep = new ArrayList<Kitchenware>();
        kit = new Kitchenware("Forma de bolo"); //801
        utensilios.put(kit.getId(), kit);
        kit = new Kitchenware("Frigideira");
        utensilios.put(kit.getId(), kit);
        kit = new Kitchenware("Amassador de batatas");
        utensilios.put(kit.getId(), kit);
        rep.add(kit);
        kit = new Kitchenware("Garfo grande resistente");
        utensilios.put(kit.getId(), kit);
        rep.add(kit);
        kit = new Kitchenware("Espremedor de Batatas", rep);
        rep.clear();
        utensilios.put(kit.getId(), kit);
        kit = new Kitchenware("Liquidificador");
        utensilios.put(kit.getId(), kit);
        rep.add(kit);
        kit = new Kitchenware("Multiprocessador", rep);
        utensilios.put(kit.getId(), kit);
        rep.clear();
        kit = new Kitchenware("Forma de fundo removível"); //808
        utensilios.put(kit.getId(), kit);
        kit = new Kitchenware("Batedeira");
        utensilios.put(kit.getId(), kit);
    }

    public static void criaReceitas() {
        List<Category> tempCat;
        List<Kitchenware> tempKit;
        List<Ingredient> tempIng;
        String tempPrep;
        Recipe rec;

        //Receita 1
        tempCat = new ArrayList<Category>(
                Arrays.asList(categorias.get(602), categorias.get(603)));
        tempKit = new ArrayList<Kitchenware>(
                Arrays.asList(utensilios.get(801)));
        tempPrep = "1. Corte o filé mignon em tiras com espessura de aproximadamente 1 centímetro;2. Corte a cebola descascada ao meio e, depois em meias luas no sentido contrário aos gomos;3. Em um recipiente, tempere o filé mignon com sal e pimenta do reino o quanto baste (q.b.); 4. Reserve em geladeira por 10 minutos;5. Em uma frigideira grande aqueça a manteiga, refogue o filé e deixe dourar, sem mexer muito para não juntar líquido;6. Acrescente a cebola e refogue até dourar;7. Sirva em seguida.;Sugestão de acompanhamento: Arroz branco e/ou Saladinha.";
        tempPrep.replaceAll(";", System.lineSeparator());
        rec = new Recipe("Iscas de Filé Mignon Aceboladas", tempPrep, LocalTime.of(0, 20), 4, 1, tempCat, tempKit);
        tempIng = new ArrayList<Ingredient>(
                Arrays.asList(new Ingredient(rec, alimentos.get(1000), 500),
                        new Ingredient(rec, alimentos.get(1001), 2),
                        new Ingredient(rec, alimentos.get(1002), 1)));
        alimentos.get(1000).setIngredients(tempIng);
        alimentos.get(1001).setIngredients(tempIng);
        alimentos.get(1002).setIngredients(tempIng);
        rec.setIngredients(tempIng);
        receitas.put(rec.getId(), rec);

        //Receita 2
        tempCat = new ArrayList<Category>(
                Arrays.asList(categorias.get(605)));
        tempKit = new ArrayList<Kitchenware>(
                Arrays.asList(utensilios.get(807), utensilios.get(808), utensilios.get(809)));
        tempPrep = "1. Comece triturando o biscoito até virar uma farofinha;2. Misture a manteiga e forre uma forma de fundo removível de, aproximadamente, 18 cm com essa mistura;3.Leve ao forno em temperatura média por 10 min;4.Na batedeira, misture bem o cream cheese, a Nutella e os ovos até formar um creme uniforme;5.Despeje o creme por cima da camada de biscoito e leve ao forno em temperatura média por 30 minutos ou até que fique bem firme;6.Espere esfriar um pouco, desenforme e deixe na geladeira por, no mínimo, 1h.";
        tempPrep.replaceAll(";", System.lineSeparator());
        rec = new Recipe("Cheesecake de Nutella", tempPrep, LocalTime.of(1, 00), 8, 3, tempCat, tempKit);
        tempIng = new ArrayList<Ingredient>(
                Arrays.asList(new Ingredient(rec, alimentos.get(1017), 100),
                        new Ingredient(rec, alimentos.get(1001), 2),
                        new Ingredient(rec, alimentos.get(1018), 300),
                        new Ingredient(rec, alimentos.get(1019), 200)));
        alimentos.get(1017).setIngredients(tempIng);
        alimentos.get(1001).setIngredients(tempIng);
        alimentos.get(1018).setIngredients(tempIng);
        alimentos.get(1019).setIngredients(tempIng);
        rec.setIngredients(tempIng);
        receitas.put(rec.getId(), rec);
    }

}