package views;

import models.User;
import util.InputKeyboardStream;

public class ProfileView {
    
    public static enum ProfileScreenOptions {
        VAZIO, SHOW, ADD, EDIT, DELETE
    };

    private User user;

    public ProfileView(User user) {
        this.user = user;
    }

    public ProfileScreenOptions mainMenu() {
        ProfileScreenOptions op = ProfileScreenOptions.VAZIO;
        System.out.println("0 - Voltar");
        System.out.println("1 - Mostrar Perfil");
        int i = InputKeyboardStream.readInt("Selecione uma opção acima: ");
        op = ProfileScreenOptions.values()[i];
        return op;
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
