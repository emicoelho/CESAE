package Ficha02;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int lugar;

        //Entrada do usuário
        System.out.print("Introduza o seu lugar na corrida: ");
        lugar = input.nextInt();

        //Condicionais
        if (lugar == 1) {
            System.out.println("Parabéns! Ganhou 10 pontos.");
        } else if (lugar == 2) {
            System.out.println("Parabéns! Ganhou 8 pontos.");
        } else if (lugar == 3) {
            System.out.println("Parabéns! Ganhou 6 pontos.");
        } else if (lugar == 4) {
            System.out.println("Parabéns! Ganhou 5 pontos.");
        } else if (lugar == 5) {
            System.out.println("Parabéns! Ganhou 4 pontos.");
        } else if (lugar == 6) {
            System.out.println("Parabéns! Ganhou 3 pontos.");
        } else if (lugar == 7) {
            System.out.println("Parabéns! Ganhou 2 pontos.");
        } else if (lugar == 8) {
            System.out.println("Parabéns! Ganhou 1 pontos.");
        } else {
            System.out.println("Que pena, não ganhou pontos.");
        }
    }
}