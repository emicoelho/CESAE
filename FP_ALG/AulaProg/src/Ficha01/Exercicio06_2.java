package Ficha01;

import java.util.Scanner;

public class Exercicio06_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declaração de variáveis
        int valor1, valor2;

        // Entrada do usuário
        System.out.println("Digite o primeiro valor: ");
        valor1 = input.nextInt();

        System.out.println("Digite o segundo valor:");
        valor2 = input.nextInt();

        // Permuta dos valores
        valor1 = valor1 + valor2;
        valor2 = valor1 - valor2;
        valor1 = valor1 - valor2;

        // Apresentar os valores
        System.out.println("Troca de valores: ");
        System.out.println(valor1);
        System.out.println(valor2);
    }
}
