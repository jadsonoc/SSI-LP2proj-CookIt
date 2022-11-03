package app;

import controller.MainController;
import data.DB;

public class CookItApp {
    public static void main(String[] args) throws Exception {
        DB.criaUnidades();
        DB.criaCategorias();
        DB.criaUtensilios();
        DB.criaAlimentos();
        DB.criaReceitas();
        
        MainController mainController = new MainController();
        mainController.mainMenu();
        
    }
}