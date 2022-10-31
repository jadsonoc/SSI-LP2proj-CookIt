package app;

import controller.MainController;
import data.BD;

public class CookItApp {
    public static void main(String[] args) throws Exception {
        BD.criaUnidades();
        BD.criaCategorias();
        BD.criaAlimentos();
        BD.criaUtensilios();
        BD.criaReceitas();
        
        MainController mainController = new MainController();
        mainController.mainMenu();
        
    }
}