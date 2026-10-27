package Ficha02;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declaração de variáveis
        int num;

        //Entrada do usuário
        System.out.print("Digite um número: ");
        num = input.nextInt();

        //Condicionais
        if (num % 2 == 0){
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
    }
}
