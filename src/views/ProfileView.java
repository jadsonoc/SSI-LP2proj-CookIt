package views;

import models.User;
import util.InputKeyboardStream;

public class ProfileView {
    
    public static enum ProfileScreenOptions {
        VAZIO, SHOW //, ADD, EDIT, DELETE
    };

    private User user;

    public ProfileView(User user) {
        this.user = user;
    }

    public ProfileScreenOptions mainMenu() {
        ProfileScreenOptions selectedOption = ProfileScreenOptions.VAZIO;
        int input = 0;
        do {
            System.out.println("");
            System.out.println("0 - Voltar");
            System.out.println("1 - Mostrar Perfil");
            input = InputKeyboardStream.readInt("Selecione uma opção acima: ");
        } while (input < 0 || input > (ProfileScreenOptions.values().length - 1));
        selectedOption = ProfileScreenOptions.values()[input];
        return selectedOption;
    }

    public void printProfile() {
        System.out.println("******************* USUÁRIO *********************");
        System.out.printf("Nome: %s\n", this.user.getName());
        System.out.printf("E-mail: %s\n", this.user.getEmail());
        System.out.printf("Habilidade na Cozinha: %d\n", this.user.getSkillsLevel());
        System.out.println("--- Intolerâncias alimentares: ");
        System.out.println("À glúten: " + (this.user.isCeliac() ? "Sim" : "Não"));
        System.out.println("À lactose: " + (this.user.isLactoseIntolerant() ? "Sim" : "Não"));
    }
}
