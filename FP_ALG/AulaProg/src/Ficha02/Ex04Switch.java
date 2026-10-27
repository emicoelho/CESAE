package Ficha02;

import java.util.Scanner;

public class Ex04Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int lugar;

        //Entrada do usuário
        System.out.print("Introduza o seu lugar na corrida: ");
        lugar = input.nextInt();

        //Condicional Switch
        switch (lugar){
            case 1:
                System.out.println("Parabéns! Ganhou 10 pontos.");
                break;
            case 2:
                System.out.println("Parabéns! Ganhou 8 pontos.");
                break;
            case 3:
                System.out.println("Parabéns! Ganhou 6 pontos.");
                break;
            case 4:
                System.out.println("Parabéns! Ganhou 5 pontos.");
                break;
            case 5:
                System.out.println("Parabéns! Ganhou 4 pontos.");
                break;
            case 6:
                System.out.println("Parabéns! Ganhou 3 pontos.");
                break;
            case 7:
                System.out.println("Parabéns! Ganhou 2 pontos.");
                break;
            case 8:
                System.out.println("Parabéns! Ganhou 1 pontos.");
                break;
        }
    }
}

