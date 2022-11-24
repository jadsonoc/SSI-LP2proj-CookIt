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
                case SHOW_PROFILE:
                    this.show();
                    break;
                case SHOW_FAVOURITES:
                    this.showFavouriteRecipes();
                    break;
                case SHOW_PREPARED:
                    this.showPreparedRecipes();
                    break;
                default:
                    break;
            }
        } while (op != ProfileView.ProfileScreenOptions.VAZIO);
    }
    
    private void show() {
        profileView.printProfile();
    }

    private void showFavouriteRecipes() {
        profileView.printFavouriteRecipes();
    }
    
    private void showPreparedRecipes() {
        profileView.printPreparedRecipes();
    }

}
