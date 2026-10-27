package Ficha02;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declaração de variáveis
        int num1, num2;

        // Entrada do usuário
        System.out.print("Digite um número: ");
        num1 = input.nextInt();

        System.out.print("Digite outro número: ");
        num2 = input.nextInt();

        // Comparação
        if (num1 > num2) {
            System.out.println("Maior: " + num1);
        } else
            System.out.println("Maior: " + num2);
        }

    }