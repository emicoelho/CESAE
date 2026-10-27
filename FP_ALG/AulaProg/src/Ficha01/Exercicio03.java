package Ficha01;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Criar variáveis
        int base, altura, area, perimetro;

        // Ler valores
        System.out.println("Cálculo da àrea e perímetro de um retângulo" );

        System.out.print("Insira o valor da base: ");
        base = input.nextInt();

        System.out.print("Insira o valor da altura: ");
        altura = input.nextInt();

        // Calcular a área do retângulo
        area = base * altura;

        // Calcular o perímetro do retângulo
        perimetro = base + base + altura + altura;

        // Apresentar os resultados
        System.out.println("Resultados: ");

        System.out.println("Área do retângulo: " + area);

        System.out.println("Perímetro do retângulo: " + perimetro);
    }
}
