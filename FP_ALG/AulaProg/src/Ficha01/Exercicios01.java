package Ficha01;

import java.util.Scanner;

public class Exercicios01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Criar variaveis
        int num1, num2, soma;

        // Ler valores do utilizador
        System.out.print("Insira um número: ");
        num1 = input.nextInt();

        System.out.print("Insira um número: ");
        num2 = input.nextInt();

        // Calcular a soma
        soma = num1 + num2;

        // Apresentar o resultado
        System.out.println("O resultado é: " + soma);


    }
}

