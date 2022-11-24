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
import models.Login;
import models.Recipe;
import models.Unit;
import models.User;
import util.InputKeyboardStream;

public class DB {
        public static final boolean TESTMODE = true;
        public static boolean LOGADO = false;

        public static User usuario;
       
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

        public static void criaUsuario() {
            try {
                usuario = new User("Jane Doe", "janedoe@test.com", "janedoe", "123456", 2, false,
                                    false);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
        
        public static void realizaLogin() {
            Login loginSession = DB.usuario.getLoginUser();
            boolean retorno = false;
            if (DB.TESTMODE) {
                System.out.println();
                System.out.println("Obs.: Login para testes -> usuário: janedoe | senha: 123456");
                System.out.println();
            }
            do {
                    String usuario = InputKeyboardStream.readString("Informe o seu usuário: ");
                    String senha = InputKeyboardStream.readPassword("Informe sua senha: ");
                    try {
                        retorno = loginSession.validateLogin(usuario, senha);
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
            } while (!retorno);
            DB.LOGADO = retorno;
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
                uni = new Unit("envelope", "env"); //511
                unidades.put(uni.getId(), uni);
        }

        public static void criaAlimentos() {
                Food foo;
                Free semL, semG;
                semL = new Free(Free.LACTOSE);
                semG = new Free(Free.GLUTEN);
                foo = new Food("Filé mingnon", unidades.get(501), Arrays.asList(semL, semG)); // 1000
                alimentos.put(foo.getId(), foo);
                semL.addFood(foo);
                semG.addFood(foo);
                foo = new Food("Manteiga", unidades.get(501), Arrays.asList(semG));
                alimentos.put(foo.getId(), foo);
                semG.addFood(foo);
                foo = new Food("Carne moída", unidades.get(501), Arrays.asList(semL, semG));
                alimentos.put(foo.getId(), foo);
                semL.addFood(foo);
                semG.addFood(foo);
                foo = new Food("Presunto fatiado", unidades.get(501), Arrays.asList(semL, semG));
                alimentos.put(foo.getId(), foo);
                semL.addFood(foo);
                semG.addFood(foo);
                foo = new Food("Tomate", unidades.get(501), Arrays.asList(semL, semG));
                alimentos.put(foo.getId(), foo);
                semL.addFood(foo);
                semG.addFood(foo);
                foo = new Food("Orégano", unidades.get(508), Arrays.asList(semL, semG)); //1005
                alimentos.put(foo.getId(), foo);
                semL.addFood(foo);
                semG.addFood(foo);
                foo = new Food("Couve-flor", unidades.get(504), Arrays.asList(semL, semG));
                alimentos.put(foo.getId(), foo);
                semL.addFood(foo);
                semG.addFood(foo);
                foo = new Food("Azeite", unidades.get(503), Arrays.asList(semL, semG));
                alimentos.put(foo.getId(), foo);
                semL.addFood(foo);
                semG.addFood(foo);
                foo = new Food("Cebola", unidades.get(504), Arrays.asList(semL, semG)); // 1008
                alimentos.put(foo.getId(), foo);
                semL.addFood(foo);
                semG.addFood(foo);
                foo = new Food("Tomate cereja", unidades.get(507), Arrays.asList(semL, semG));
                alimentos.put(foo.getId(), foo);
                semL.addFood(foo);
                semG.addFood(foo);
                foo = new Food("Pimenta do reino", unidades.get(508), Arrays.asList(semL, semG));
                alimentos.put(foo.getId(), foo);
                semL.addFood(foo);
                semG.addFood(foo);
                foo = new Food("Sal", unidades.get(508), Arrays.asList(semL, semG));
                alimentos.put(foo.getId(), foo);
                semL.addFood(foo);
                semG.addFood(foo);
                foo = new Food("Tempero Verde", unidades.get(505), Arrays.asList(semL, semG));
                alimentos.put(foo.getId(), foo);
                semL.addFood(foo);
                semG.addFood(foo);
                foo = new Food("Ovo", unidades.get(504), Arrays.asList(semL, semG)); // 1013
                alimentos.put(foo.getId(), foo);
                semL.addFood(foo);
                semG.addFood(foo);
                foo = new Food("Leite", unidades.get(503), Arrays.asList(semG));
                alimentos.put(foo.getId(), foo);
                semG.addFood(foo);
                foo = new Food("Pão de forma", unidades.get(509));
                alimentos.put(foo.getId(), foo);
                foo = new Food("Tapioca", unidades.get(507), Arrays.asList(semL, semG));
                alimentos.put(foo.getId(), foo);
                semL.addFood(foo);
                semG.addFood(foo);
                foo = new Food("Biscoito de chocolate", unidades.get(501)); // 1017
                alimentos.put(foo.getId(), foo);
                foo = new Food("Cream Cheese", unidades.get(501), Arrays.asList(semG));
                alimentos.put(foo.getId(), foo);
                semG.addFood(foo);
                foo = new Food("Creme Gianduia (Nutella)", unidades.get(501), Arrays.asList(semG));
                alimentos.put(foo.getId(), foo);
                semG.addFood(foo);
                foo = new Food("Alho", unidades.get(510), Arrays.asList(semL, semG)); //1020
                alimentos.put(foo.getId(), foo);
                semL.addFood(foo);
                semG.addFood(foo);
                foo = new Food("Queijo muçarela fatiado", unidades.get(501), Arrays.asList(semG)); 
                alimentos.put(foo.getId(), foo);
                semG.addFood(foo);
                foo = new Food("Creme de Cebola", unidades.get(511), Arrays.asList(semG)); 
                alimentos.put(foo.getId(), foo);
                semG.addFood(foo);

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
                kit = new Kitchenware("Refratário de vidro retangular", null);
                utensilios.put(kit.getId(), kit);
                rep.add(kit);
                kit = new Kitchenware("Assadeira retangular", rep);
                utensilios.put(kit.getId(), kit);
                rep.clear();
                kit = new Kitchenware("Faca", null);
                utensilios.put(kit.getId(), kit);
                rep.add(kit);
                kit = new Kitchenware("Cortador de biscoito", rep); //812
                utensilios.put(kit.getId(), kit);
                rep.clear();
                kit = new Kitchenware("Espátula ou escumadeira", null);
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
                                LocalTime.of(0, 20), 4, 2, tempCat, tempKit);
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
                                Arrays.asList(utensilios.get(807)));
                tempPrep = "1. Em um recipiente bata levemente o ovo com o leite e o sal e reserve;2. Com um cortador de biscoitos ou uma faca abra uma cavidade nas fatias de pão (importante que a cavidade não seja muito grande, para que ainda sobrem bordas no pão);3. Aqueça uma frigideira grande untada com manteiga e coloque as fatias de pão;4. Com cuidado despeje a mistura de ovo e leite na cavidade, segurando as fatias de pão para que não se movam;5. Deixe aquecer até que os ovos comecem a cozinhar;6. Vire cada fatia de pão com uma espátula e deixe dourar do outro lado;7. Sirva a seguir.";
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
                                Arrays.asList(categorias.get(600), categorias.get(601), categorias.get(606)));
                tempKit = new ArrayList<Kitchenware>(
                                Arrays.asList(utensilios.get(801)));
                tempPrep = "1. Primeiramente, hidrate a tapioca de acordo com as instruções do fabricante;2. Em um recipiente, misture bem todos os ingredientes.;3. Em uma frigideira antiaderente, coloque uma porção da massa e deixe dourar levemente dos dois lados.;4. Repita a operação até terminar a massa.;5. Sirva com o recheio de sua preferência.";
                rec = new Recipe("Crepioca Rápida", tempPrep.replaceAll(";", System.lineSeparator()),
                                LocalTime.of(0, 10), 4, 1, tempCat, tempKit);
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


                // Receita 5
                tempCat = new ArrayList<Category>(
                                Arrays.asList(categorias.get(602), categorias.get(603)));
                tempKit = new ArrayList<Kitchenware>(
                                Arrays.asList(utensilios.get(810)));
                tempPrep = "1. Em um recipiente, misture bem a carne moída com o creme de cebola, até ficar homogêneo;2. Abra a mistura de carne moída sobre um plástico-filme;3. Disponha as fatias de queijo mozarela por cima e depois as fatias de presunto, deixando uma borda;4. Espalhe o tomate e o orégano;5. Enrole como rocambole, com a ajuda do plástico e coloque-o em uma assadeira grande untada com manteiga;6. Espalhe os pedaços de manteiga por cima e leve ao forno médio-alto (200°C), preaquecido, por cerca de 45 minutos, ou até que o rocambole esteja dourado;7. Sirva em seguida.;Sugestão de acompanhamento: Arroz branco e/ou Saladinha";
                rec = new Recipe("Rocambole de Carne", tempPrep.replaceAll(";", System.lineSeparator()),
                                LocalTime.of(1, 10), 5, 3, tempCat, tempKit);
                tempIng = new ArrayList<Ingredient>(
                                Arrays.asList(
                                                new Ingredient(rec, alimentos.get(1002), 1000, true),
                                                new Ingredient(rec, alimentos.get(1003), 100),
                                                new Ingredient(rec, alimentos.get(1021), 100),
                                                new Ingredient(rec, alimentos.get(1022), 1),
                                                new Ingredient(rec, alimentos.get(1004), 1),
                                                new Ingredient(rec, alimentos.get(1005), 1),
                                                new Ingredient(rec, alimentos.get(1001), 20),
                                                new Ingredient(rec, alimentos.get(1011), 1),
                                                new Ingredient(rec, alimentos.get(1010), 1)
                                                ));
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

                // Receita 6
                tempCat = new ArrayList<Category>(
                                Arrays.asList(categorias.get(600), categorias.get(601)));
                tempKit = new ArrayList<Kitchenware>(
                                Arrays.asList(utensilios.get(812), utensilios.get(813)));
                tempPrep = "1. Primeiramente, hidrate a tapioca de acordo com as instruções do fabricante;2. Em um recipiente, misture bem todos os ingredientes.;3. Em uma frigideira antiaderente, coloque uma porção da massa e deixe dourar levemente dos dois lados.;4. Repita a operação até terminar a massa.;5. Sirva com o recheio de sua preferência.";
                rec = new Recipe("Pão Integral com Omelete", tempPrep.replaceAll(";", System.lineSeparator()),
                                LocalTime.of(0, 15), 1, 1, tempCat, tempKit);
                tempIng = new ArrayList<Ingredient>(
                                Arrays.asList(
                                                new Ingredient(rec, alimentos.get(1013), 1, true),
                                                new Ingredient(rec, alimentos.get(1015), 2, true),
                                                new Ingredient(rec, alimentos.get(1014), 20),
                                                new Ingredient(rec, alimentos.get(1011), 1)
                                        ));
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

        public static void adicionaReceitasFavoritas() {
                usuario.setFavouriteRecipes(Arrays.asList(receitas.get(1), receitas.get(3)));
        }

        public static void adicionaReceitasPreparadas() {
                usuario.setPreparedRecipes(Arrays.asList(receitas.get(2)));
        }
        

        
}