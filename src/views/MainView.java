package views;

import data.DB;
import util.InputKeyboardStream;

public class MainView {

    public static enum OptionsMainScreen {
        VAZIO, PROFILE, RECIPES, INGREDIENTS, SUGGEST
    };

    public OptionsMainScreen mainMenu() {
        OptionsMainScreen selectedOption = OptionsMainScreen.VAZIO;
        int input = 0;
        if (DB.LOGADO) {
            do {
                System.out.println("****************** Menu Principal :: CookIt! *****************");
                System.out.println();
                System.out.println("0 - Sair");
                System.out.println("1 - Perfil");
                System.out.println("2 - Receitas");
                System.out.println("3 - Ingredientes");
                System.out.println("4 - Receber sugestão de receitas");
                input = InputKeyboardStream.readInt("Escolha uma das opções acima: ");
            } while (input < 0 || (input > OptionsMainScreen.values().length - 1));
        } else {
            do {
                System.out.println("Olá, seja bem-vindo ao CookIt!");
                System.out.println();
                System.out.println("0 - Sair");
                System.out.println("1 - Realizar Login");
                input = InputKeyboardStream.readInt("Escolha uma das opções acima: ");
            } while (input < 0 || (input > OptionsMainScreen.values().length - 1));
        }
        InputKeyboardStream.clearScreen();
        selectedOption = OptionsMainScreen.values()[input];
        return selectedOption;
    }
    
}
