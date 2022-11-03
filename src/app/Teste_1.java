package app;

import data.DB;

public class Teste_1 {
    
    public static void main(String[] args) {
        
        DB.criaUnidades();
        DB.criaCategorias();
        DB.criaAlimentos();
        DB.criaReceitas();
        DB.criaUtensilios();

        System.out.println(DB.receitas);

    }
}
