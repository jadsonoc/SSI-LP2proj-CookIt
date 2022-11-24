package views;

import java.util.Map;

import models.Recipe;
import models.User;

public class UnderSkillsRecipesView {
    
    private Map<Integer, Recipe> recipes;
    
    private User user;
    
    public UnderSkillsRecipesView(Map<Integer, Recipe> recipes, User user) {
        this.recipes = recipes;
        this.user = user;
    }

    public void printUnderSkilssRecipes() {
        if (this.user.getSkillsLevel() > 0) {
            System.out.println("*********** Receitas que combinam com suas Habilidades atuais: " + this.user.getSkillsLevel() + " ***********");
            for (Recipe rec : Recipe.getRecipesUnderSkills(recipes, user.getSkillsLevel())) {
                RecipeView recipeView = new RecipeView(rec);
                recipeView.printRecipe();
            }
        } else {
            System.out.println("************ Você não informou suas habilidades. *************");
            System.out.println("**TIP: Vá até seu perfil e dê uma nota para seu Master Chef interior!");
        }
    }


}
