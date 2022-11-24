package util;

import java.io.Console;
import java.util.Scanner;

public class InputKeyboardStream {

    private static Scanner keyboard = new Scanner(System.in);
    private static Console keyboardConsole = System.console();
    
    public static String readString(String message) {
        System.out.print(message);
        return keyboard.nextLine();
    }

    public static String readPassword(String message) {
        System.out.print(message);
        return String.valueOf(keyboardConsole.readPassword());
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
