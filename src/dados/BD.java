package dados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dominio.Category;
import dominio.Food;
import dominio.Free;
import dominio.Unit;
import dominio.User;

public class BD {

    public static User usuario = new User("Jadson Costa", "jadsonoc@gmail.com", "jadsonoc", "123456");
    public static List<Free> semLacGluten = new ArrayList<Free>(Arrays.asList(new Free(Free.GLUTEN), new Free(Free.LACTOSE)));

    public static Map<Integer, Category> categorias = new HashMap<Integer, Category>();
    public static Map<Integer, Unit> unidades = new HashMap<Integer, Unit>();
    public static Map<Integer, Food> alimentos = new HashMap<Integer, Food>();

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
    
}