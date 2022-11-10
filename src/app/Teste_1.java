package app;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class Teste_1 {

    public static void main(String[] args) {

        //         String name = "ba";

        //         String inversao = "";
        //         String resultado = "sem resposta";

        //         System.out.println(name.length());

        //         for (int i = name.length() - 1; i > 0; i--) {
        //             inversao = inversao + name.charAt(i);
        //                 System.out.println(inversao);
        //                 resultado = name.substring(0, i) + inversao;
        //                 System.out.println(resultado);
        //                 System.out.println(resultado.compareTo(name));
        //                 if (resultado.compareTo(name) > 0) {

        //                     break;
        //                 }
        //                 System.out.println("passei");
        //         }
        //         System.out.println(resultado);   

        //     }
        // }

        // List<Boolean> assinante = new ArrayList<Boolean>(Arrays.asList(true, false));
        // List<Integer> minutosAssistidos = new ArrayList<Integer>(Arrays.asList(61, 120));

        // List<Boolean> assinante = new ArrayList<Boolean>(Arrays.asList(false, false));
        // List<Integer> minutosAssistidos = new ArrayList<Integer>(Arrays.asList(0, 120));

        // List<Boolean> assinante = new ArrayList<Boolean>(Arrays.asList(true, true, true));
        // List<Integer> minutosAssistidos = new ArrayList<Integer>(Arrays.asList(1, 2, 3));

        List<Boolean> assinante = new ArrayList<Boolean>(
                Arrays.asList(true, false, false, false, true, false, true, true, false, false, false));
        List<Integer> minutosAssistidos = new ArrayList<Integer>(
                Arrays.asList(6144, 2742, 330, 30, 1500, 4032, 24036, 3288, 2076, 24540, 4716));

        List<Double> percentual = new ArrayList<Double>();
        List<Integer> resultado = new ArrayList<Integer>();
        List<Integer> horasAssistidas = new ArrayList<Integer>();
        Integer totalHorasAssistidas = 0;
        //Converter os minutos em horas e perfectibilizar o arredondamento descrito na regra de negócio
        for (Integer minutos : minutosAssistidos) {
            Integer horas = (minutos / 60);
            if (minutos % 60 != 0) {
                horas += 1;
            }
            horasAssistidas.add(horas);
            totalHorasAssistidas += horas;
        }
        System.out.println(totalHorasAssistidas);
        System.out.println(horasAssistidas);

        //Estabelece que o array de horasAssistidas equivale a 50% do total de chances e o de ser assinante, mais 50%
        for (Integer hora : horasAssistidas) {
            percentual.add((hora * 66d) / totalHorasAssistidas);
        }
        System.out.println(percentual);
        //Executa a varredura para verificar os assinantes e dobrar as chances
        for (int i = 0; i < assinante.size(); i++) {
            if (assinante.get(i))
                resultado.set(i, (int) (percentual.get(i) * 2));
        }

        System.out.println(resultado);

    }

}

// String name = ""
//       String resultado = "";
//       String inversao = "";
//       System.out.println(name);
//       for (int i = name.length() - 1; i > 0; i--) {
//         if ( name.length() > 2) {
//            inversao = inversao + name.charAt(i);
//            resultado = name.substring(0, i) + inversao;
           
//            if (resultado.compareTo(name) > 0) {
//               break;
//            } else {
//               resultado = "sem resposta";
//            }
//          } else {
//             resultado = String.valueOf(name.charAt(1)) + String.valueOf(name.charAt(0));
//          } 
