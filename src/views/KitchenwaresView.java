package views;

import java.util.List;

import models.Kitchenware;

public class KitchenwaresView {

    private List<Kitchenware> kitchenwares;

    public KitchenwaresView(List<Kitchenware> kitchenwares) {
        this.kitchenwares = kitchenwares;
    }

    public void printKitchenwares() {
        System.out.println("-------- Utensílios necessários: ----------");
        for (Kitchenware kit : this.kitchenwares) {
            if (kit.hasRepleacements()) {
                System.out.println(kit.getName());
                System.out.println("Você pode substituir por: ");
                System.out.println(kit.getRepleacements());
                for (Kitchenware rep : kit.getRepleacements()) {
                    System.out.println(rep.getName());
                }
            } else
                System.out.println(kit.getName());
        }
    }
        
}
