package views;

import java.util.List;

import models.Kitchenware;

public class KitchenwaresView {

    private List<Kitchenware> kitchenwares;

    public KitchenwaresView(List<Kitchenware> kitchenwares) {
        this.kitchenwares = kitchenwares;
    }

    public void printKitchenwares() {
        if (this.kitchenwares.size() > 0) {
            System.out.println("-------- Utensílios necessários: ");
            for (Kitchenware kit : this.kitchenwares) {
                if (kit.hasRepleacements()) {
                    System.out.print(kit.getName());
                    System.out.print(" -> Você pode substituir por: ");
                    for (Kitchenware rep : kit.getRepleacements()) {
                        System.out.print(rep.getName() + " ");
                    }
                    System.out.println();
                } else
                    System.out.println(kit.getName());
            }
        }
    }
        
}
