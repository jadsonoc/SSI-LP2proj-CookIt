package views;

import util.InputKeyboardStream;

public class MainView {

    public static enum OptionsMainScreen {
        VAZIO, PERFIL, RECEITAS, INGREDIENTES, COOKIT
    };

    public OptionsMainScreen mainMenu() {
        OptionsMainScreen op = OptionsMainScreen.VAZIO;
        System.out.println("0 - Sair");
        System.out.println("1 - Perfil");
        System.out.println("2 - Receitas");
        System.out.println("3 - Ingredientes");
        System.out.println("4 - CookIt!");
        int i = InputKeyboardStream.readInt("Escolha uma opção: ");
        op = OptionsMainScreen.values()[i];
        return op;
    }
    
}
