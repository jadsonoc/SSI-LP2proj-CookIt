package controller;

import data.DB;
import views.ProfileView;

public class ProfileController {
    
    private ProfileView profileView;

    public ProfileController() {
        profileView = new ProfileView(DB.usuario);
    }

    public void mainMenu() {
        ProfileView.ProfileScreenOptions op;
        do {
            op = profileView.mainMenu();
            switch (op) {
                case SHOW:
                    this.show();
                    break;
                default:
                    break;
            }
        } while (op != ProfileView.ProfileScreenOptions.VAZIO);
    }
    
    private void show() {
        profileView.printProfile();
    }

}
