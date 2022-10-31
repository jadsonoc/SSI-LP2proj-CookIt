package util;

import java.util.Scanner;

public class InputKeyboardStream {

    private static Scanner keyboard = new Scanner(System.in);
    
    public static String readString(String message) {
        System.out.print(message);
        return keyboard.nextLine();
    }

    public static int readInt(String message) {
        String answer = "S";
        String aux = null;
        int i = 0;
        while (answer.equals("s") | answer.equals("S")) {
            try {
                aux = readString(message);
                i = Integer.parseInt(aux);
                answer = "n"; //para sair do la�o.
            } catch (NumberFormatException e) {
                System.out.println("Favor informar um inteiro válido!");
                answer = readString("Deseja tentar novamente (S/N)?");
            }
        }
        return i;
    }

    public static void pressEnter(){
        System.out.println("Pressione ENTER para continuar...");
        keyboard.nextLine();
    }
    
}
