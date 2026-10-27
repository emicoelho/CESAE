package Ficha01;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declaração de variáveis
        double prod1, prod2, prod3, soma;

        // Entrada dos valores
        System.out.print("Valor do primeiro produto: ");
        prod1 = input.nextDouble();

        System.out.print("Valor do segundo produto: ");
        prod2 = input.nextDouble();

        System.out.print("Valor do terceiro produto: ");
        prod3 = input.nextDouble();

        // Soma dos valores
        soma = prod1 + prod2 + prod3;
        soma = soma - soma * 0.1;

        // Apresentação do valor a pagar
        System.out.println("Valor total a pagar: " + soma);


    }
}
