package Ficha01;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Criar variáveis
        int num1, num2, soma, sub, mult, div;

        // Ler valores
        System.out.print("Insira um número: ");
        num1 = input.nextInt();

        System.out.print("Insira outro número: ");
        num2 = input.nextInt();

        // Operações
        soma = num1 + num2;

        sub = num1 - num2;

        mult = num1 * num2;

        div = num1 / num2;

        // Apresentar os resultados
        System.out.println("O resultado da soma é: " + soma);
        System.out.println("O resultado da subtração é: " + sub);
        System.out.println("O resultado da multiplicação é: " + mult);
        System.out.println("O resultado da divisão é: " + div);


    }
}
