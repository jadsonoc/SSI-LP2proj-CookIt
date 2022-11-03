package views;

import java.util.List;
import models.Category;

public class CategoriesView {
    
    private List<Category> categories;

    public CategoriesView(List<Category> categories) {
        this.categories = categories;
    }

    public void printCategories() {
        System.out.println("-------- Esta receita pode ser servida como: ----------");
        for (Category cat : this.categories)
            System.out.println(cat.getName());
    }
}
