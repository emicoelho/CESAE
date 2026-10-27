package Ficha01;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declaração de variáveis
        int valor1, valor2, permuta;

        // Entrada do usuário
        System.out.println("Digite o primeiro valor: ");
        valor1 = input.nextInt();

        System.out.println("Digite o segundo valor:");
        valor2 = input.nextInt();

        // Permuta dos valores
        System.out.println("\nPermuta dos valores: " );

         permuta = valor2;
        System.out.println("Valor 1 att: " + permuta);

         permuta = valor1;
        System.out.println("Valor 2 att: " + permuta);


    }
}
