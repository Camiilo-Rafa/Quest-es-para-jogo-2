/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão_para_jogo_2;

import java.util.Scanner;

/**
 *
 * @author rafac
 */
public class Questão_para_jogo_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        boolean acertou = false;
        int contador = 0;
        String alternativa;
        do {
            System.out.println("Resolva a expressões (A.B).(A+C):");
            System.out.println("a) 00000011"); // resposta correta
            System.out.println("b) 1010101");
            System.out.println("c) 11101110");
            System.out.println("d) 10111010");
            System.out.println("e) 10111011");
            System.out.print("Escolha uma alternativa: ");
            alternativa = entrada.next();
            switch (alternativa) {
                case "a":
                case "A":
                    System.out.println("Resposta correta!");
                    acertou = true;
                    contador = contador + 1;
                    break;
                case "b":
                case "B":
                case "c":
                case "C":
                case "d":
                case "D":
                case "e":
                case "E":
                    System.out.println("Resposta incorreta!");
                    contador = contador + 1;
                    break;
                default:
                    System.out.println("Escolha inválida!");
                    contador = contador + 1;
            }
        } while (!acertou && contador < 3);
        if (acertou) {
            System.out.println("Você acertou na " + contador + "atentativa!");
        } else {
            System.out.println("Resposta incorreta nas 3 tentativas!");
        }
    }
}
