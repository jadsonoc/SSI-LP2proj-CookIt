package app;

import data.BD;

public class Teste_1 {
    
    public static void main(String[] args) {
        
        BD.criaUnidades();
        BD.criaCategorias();
        BD.criaAlimentos();
        BD.criaReceitas();
        BD.criaUtensilios();

        System.out.println(BD.receitas);

    }
}
