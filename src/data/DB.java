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

public class DB {

        public static User usuario = new User("Jadson Costa", "jadsonoc@gmail.com", "jadsonoc", "123456", 5, false,
                        false);
        public static List<Food> alimentosLivresDeIntolerancias = new ArrayList<Food>();
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
                cat = new Category("Almoço"); // 602
                categorias.put(cat.getId(), cat);
                cat = new Category("Jantar"); // 603
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
                uni = new Unit("quilograma", "kg"); // 500
                unidades.put(uni.getId(), uni);
                uni = new Unit("grama", "g");
                unidades.put(uni.getId(), uni);
                uni = new Unit("litro", "l");
                unidades.put(uni.getId(), uni);
                uni = new Unit("mililitro", "ml"); // 503
                unidades.put(uni.getId(), uni);
                uni = new Unit("unidade", "un");
                unidades.put(uni.getId(), uni);
                uni = new Unit("colher de sopa", "csp");
                unidades.put(uni.getId(), uni);
                uni = new Unit("colher de chá", "cc");
                unidades.put(uni.getId(), uni);
                uni = new Unit("xícara", "xíc");
                unidades.put(uni.getId(), uni);
                uni = new Unit("o quanto baste", "q.b."); // 508
                unidades.put(uni.getId(), uni);
                uni = new Unit("fatias", "fat");
                unidades.put(uni.getId(), uni);
                uni = new Unit("dentes", "dts");
                unidades.put(uni.getId(), uni);
        }

        public static void criaAlimentos() {
                Food foo;
                Free semG, semL;
                semG = new Free(Free.GLUTEN);
                semL = new Free(Free.LACTOSE);
                foo = new Food("Filé mingnon", unidades.get(501), Arrays.asList(semG, semL)); // 1000
                alimentos.put(foo.getId(), foo);
                alimentosLivresDeIntolerancias.add(foo);
                foo = new Food("Manteiga", unidades.get(501), Arrays.asList(semG));
                alimentos.put(foo.getId(), foo);
                alimentosLivresDeIntolerancias.add(foo);
                foo = new Food("Carne moída", unidades.get(501), Arrays.asList(semG, semL));
                alimentos.put(foo.getId(), foo);
                alimentosLivresDeIntolerancias.add(foo);
                foo = new Food("Presunto fatiado", unidades.get(501), Arrays.asList(semG, semL));
                alimentos.put(foo.getId(), foo);
                alimentosLivresDeIntolerancias.add(foo);
                foo = new Food("Tomate", unidades.get(501), Arrays.asList(semG, semL));
                alimentos.put(foo.getId(), foo);
                alimentosLivresDeIntolerancias.add(foo);
                foo = new Food("Orégano", unidades.get(508), Arrays.asList(semG, semL));
                alimentos.put(foo.getId(), foo);
                alimentosLivresDeIntolerancias.add(foo);
                foo = new Food("Couve-flor", unidades.get(504), Arrays.asList(semG, semL));
                alimentos.put(foo.getId(), foo);
                alimentosLivresDeIntolerancias.add(foo);
                foo = new Food("Azeite", unidades.get(503), Arrays.asList(semG, semL));
                alimentos.put(foo.getId(), foo);
                alimentosLivresDeIntolerancias.add(foo);
                foo = new Food("Cebola", unidades.get(504), Arrays.asList(semG, semL)); // 1008
                alimentos.put(foo.getId(), foo);
                alimentosLivresDeIntolerancias.add(foo);
                foo = new Food("Tomate cereja", unidades.get(507), Arrays.asList(semG, semL));
                alimentos.put(foo.getId(), foo);
                alimentosLivresDeIntolerancias.add(foo);
                foo = new Food("Pimenta do reino", unidades.get(508), Arrays.asList(semG, semL));
                alimentos.put(foo.getId(), foo);
                alimentosLivresDeIntolerancias.add(foo);
                foo = new Food("Sal", unidades.get(508), Arrays.asList(semG, semL));
                alimentos.put(foo.getId(), foo);
                alimentosLivresDeIntolerancias.add(foo);
                foo = new Food("Tempero Verde", unidades.get(505), Arrays.asList(semG, semL));
                alimentos.put(foo.getId(), foo);
                alimentosLivresDeIntolerancias.add(foo);
                foo = new Food("Ovo", unidades.get(504), Arrays.asList(semG, semL)); // 1013
                alimentos.put(foo.getId(), foo);
                alimentosLivresDeIntolerancias.add(foo);
                foo = new Food("Leite", unidades.get(503), Arrays.asList(semG));
                alimentos.put(foo.getId(), foo);
                alimentosLivresDeIntolerancias.add(foo);
                foo = new Food("Pão de forma", unidades.get(509));
                alimentos.put(foo.getId(), foo);
                foo = new Food("Tapioca", unidades.get(507), Arrays.asList(semG, semL));
                alimentos.put(foo.getId(), foo);
                alimentosLivresDeIntolerancias.add(foo);
                foo = new Food("Biscoito de chocolate", unidades.get(501)); // 1017
                alimentos.put(foo.getId(), foo);
                foo = new Food("Cream Cheese", unidades.get(501), Arrays.asList(semG));
                alimentos.put(foo.getId(), foo);
                alimentosLivresDeIntolerancias.add(foo);
                foo = new Food("Creme Gianduia (Nutella)", unidades.get(501), Arrays.asList(semG));
                alimentos.put(foo.getId(), foo);
                alimentosLivresDeIntolerancias.add(foo);
                foo = new Food("Alho", unidades.get(510), Arrays.asList(semG, semL));
                alimentos.put(foo.getId(), foo);
                alimentosLivresDeIntolerancias.add(foo);
        }

        public static void criaUtensilios() {
                Kitchenware kit;
                List<Kitchenware> rep = new ArrayList<Kitchenware>();
                kit = new Kitchenware("Forma de bolo", null); // 800
                utensilios.put(kit.getId(), kit);
                kit = new Kitchenware("Frigideira antiaderente", null);
                utensilios.put(kit.getId(), kit);
                kit = new Kitchenware("Amassador de batatas", null);
                utensilios.put(kit.getId(), kit);
                rep.add(kit);
                kit = new Kitchenware("Garfo grande resistente", null);
                utensilios.put(kit.getId(), kit);
                rep.add(kit);
                kit = new Kitchenware("Espremedor de Batatas", rep);
                utensilios.put(kit.getId(), kit);
                rep.clear();
                kit = new Kitchenware("Liquidificador", null);
                utensilios.put(kit.getId(), kit);
                rep.add(kit);
                kit = new Kitchenware("Multiprocessador", rep);
                utensilios.put(kit.getId(), kit);
                rep.clear();
                kit = new Kitchenware("Forma de fundo removível", null); // 807
                utensilios.put(kit.getId(), kit);
                kit = new Kitchenware("Batedeira", null);
                utensilios.put(kit.getId(), kit);
        }

        public static void criaReceitas() {
                List<Category> tempCat;
                List<Kitchenware> tempKit;
                List<Ingredient> tempIng;
                String tempPrep;
                Recipe rec;

                // Receita 1
                tempCat = new ArrayList<Category>(
                                Arrays.asList(categorias.get(602), categorias.get(603)));
                tempKit = new ArrayList<Kitchenware>(
                                Arrays.asList(utensilios.get(801)));
                tempPrep = "1. Corte o filé mignon em tiras com espessura de aproximadamente 1 centímetro;2. Corte a cebola descascada ao meio e, depois em meias luas no sentido contrário aos gomos;3. Em um recipiente, tempere o filé mignon com sal e pimenta do reino o quanto baste (q.b.);4. Reserve em geladeira por 10 minutos;5. Em uma frigideira grande aqueça a manteiga, refogue o filé e deixe dourar, sem mexer muito para não juntar líquido;6. Acrescente a cebola e refogue até dourar;7. Sirva em seguida.;Sugestão de acompanhamento: Arroz branco e/ou Saladinha.";
                rec = new Recipe("Iscas de Filé Mignon Aceboladas", tempPrep.replaceAll(";", System.lineSeparator()),
                                LocalTime.of(0, 20), 4, 1, tempCat, tempKit);
                tempIng = new ArrayList<Ingredient>(
                                Arrays.asList(new Ingredient(rec, alimentos.get(1000), 500, true),
                                                new Ingredient(rec, alimentos.get(1001), 50, true),
                                                new Ingredient(rec, alimentos.get(1008), 1),
                                                new Ingredient(rec, alimentos.get(1010), 1),
                                                new Ingredient(rec, alimentos.get(1011), 1)));
                // Associa com Food
                for (Ingredient ingredient : tempIng) {
                        ingredient.getIngredient().setIngredients(tempIng);
                }
                // Associa com Kitchenware
                for (Kitchenware kitchenware : tempKit) {
                        kitchenware.setRecipes(Arrays.asList(rec));
                }
                // Associa com Category
                for (Category category : tempCat) {
                        category.setRecipes(Arrays.asList(rec));
                }
                rec.setIngredients(tempIng);
                receitas.put(rec.getId(), rec);

                // Receita 2
                tempCat = new ArrayList<Category>(
                                Arrays.asList(categorias.get(605)));
                tempKit = new ArrayList<Kitchenware>(
                                Arrays.asList(utensilios.get(806), utensilios.get(807), utensilios.get(808)));
                tempPrep = "1. Comece triturando o biscoito até virar uma farofinha;2. Misture a manteiga e forre uma forma de fundo removível de, aproximadamente, 18 cm com essa mistura;3. Leve ao forno em temperatura média por 10 min;4. Na batedeira, misture bem o cream cheese, a Nutella e os ovos até formar um creme uniforme;5. Despeje o creme por cima da camada de biscoito e leve ao forno em temperatura média por 30 minutos ou até que fique bem firme;6. Espere esfriar um pouco, desenforme e deixe na geladeira por, no mínimo, 1h.";
                rec = new Recipe("Cheesecake de Nutella", tempPrep.replaceAll(";", System.lineSeparator()),
                                LocalTime.of(1, 00), 8, 3, tempCat, tempKit);
                tempIng = new ArrayList<Ingredient>(
                                Arrays.asList(
                                                new Ingredient(rec, alimentos.get(1017), 100, true),
                                                new Ingredient(rec, alimentos.get(1001), 50),
                                                new Ingredient(rec, alimentos.get(1018), 300, true),
                                                new Ingredient(rec, alimentos.get(1019), 200, true)));
                // Associa com Food
                for (Ingredient ingredient : tempIng) {
                        ingredient.getIngredient().setIngredients(tempIng);
                }
                // Associa com Kitchenware
                for (Kitchenware kitchenware : tempKit) {
                        kitchenware.setRecipes(Arrays.asList(rec));
                }
                // Associa com Category
                for (Category category : tempCat) {
                        category.setRecipes(Arrays.asList(rec));
                }
                rec.setIngredients(tempIng);
                receitas.put(rec.getId(), rec);

                // Receita 3
                tempCat = new ArrayList<Category>(
                                Arrays.asList(categorias.get(602), categorias.get(603)));
                tempKit = new ArrayList<Kitchenware>(
                                Arrays.asList());
                tempPrep = "1. Em uma panela, cozinhe a couve-flor em água fervente até que esteja macia, sem amolecer demais;2. Escorra, passe na água gelada, para interromper o cozimento, e pique a couve-flor em pedaços bem pequenos, como se fossem grãos de arroz;3. Em uma panela, aqueça o azeite e refogue a cebola e o alho;4. Acrescente os tomates e deixe refogar até murchar;5. Junte a pimenta-do-reino, o sal e a couve-flor e cozinhe em fogo baixo, com a panela tampada, por aproximadamente 5 minutos;6. Coloque o cheiro-verde e misture bem.";
                rec = new Recipe("Arroz de Couve-flor", tempPrep.replaceAll(";", System.lineSeparator()),
                                LocalTime.of(0, 20), 4, 2, tempCat, tempKit);
                tempIng = new ArrayList<Ingredient>(
                                Arrays.asList(
                                                new Ingredient(rec, alimentos.get(1006), 1, true),
                                                new Ingredient(rec, alimentos.get(1007), 20),
                                                new Ingredient(rec, alimentos.get(1008), 1),
                                                new Ingredient(rec, alimentos.get(1020), 2),
                                                new Ingredient(rec, alimentos.get(1009), 0.5f),
                                                new Ingredient(rec, alimentos.get(1010), 1),
                                                new Ingredient(rec, alimentos.get(1011), 1),
                                                new Ingredient(rec, alimentos.get(1012), 1)));
                // Associa com Food
                for (Ingredient ingredient : tempIng) {
                        ingredient.getIngredient().setIngredients(tempIng);
                }
                // Associa com Kitchenware
                for (Kitchenware kitchenware : tempKit) {
                        kitchenware.setRecipes(Arrays.asList(rec));
                }
                // Associa com Category
                for (Category category : tempCat) {
                        category.setRecipes(Arrays.asList(rec));
                }
                rec.setIngredients(tempIng);
                receitas.put(rec.getId(), rec);

                // Receita 4
                tempCat = new ArrayList<Category>(
                                Arrays.asList(categorias.get(600), categorias.get(601)));
                tempKit = new ArrayList<Kitchenware>(
                                Arrays.asList(utensilios.get(801)));
                tempPrep = "1. Primeiramente, hidrate a tapioca de acordo com as instruções do fabricante;2. Em um recipiente, misture bem todos os ingredientes.;3. Em uma frigideira antiaderente, coloque uma porção da massa e deixe dourar levemente dos dois lados.;4. Repita a operação até terminar a massa.;5. Sirva com o recheio de sua preferência.";
                rec = new Recipe("Crepioca Rápida", tempPrep.replaceAll(";", System.lineSeparator()),
                                LocalTime.of(0, 10), 4, 2, tempCat, tempKit);
                tempIng = new ArrayList<Ingredient>(
                                Arrays.asList(
                                                new Ingredient(rec, alimentos.get(1013), 4, true),
                                                new Ingredient(rec, alimentos.get(1016), 1, true),
                                                new Ingredient(rec, alimentos.get(1011), 4)));
                // Associa com Food
                for (Ingredient ingredient : tempIng) {
                        ingredient.getIngredient().setIngredients(tempIng);
                }
                // Associa com Kitchenware
                for (Kitchenware kitchenware : tempKit) {
                        kitchenware.setRecipes(Arrays.asList(rec));
                }
                // Associa com Category
                for (Category category : tempCat) {
                        category.setRecipes(Arrays.asList(rec));
                }
                rec.setIngredients(tempIng);
                receitas.put(rec.getId(), rec);
        }

}