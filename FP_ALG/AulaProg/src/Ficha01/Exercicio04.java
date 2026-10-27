package Ficha01;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Criar variáveis
        double raio, area;
        final double PI = 3.1415926;

        // Ler o valor do utilizador
        System.out.println("Cálculo da área de uma circunferência ");

        System.out.print("Insira o raio da circunferência: ");
        raio = input.nextDouble();

        // Calcular a área
        area = raio * raio  * PI;

        // Apresentar o resultado
        System.out.println("A área da circunferência é: " + area);
    }
}
