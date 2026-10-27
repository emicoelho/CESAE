package Ficha01;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Criar variáveis

        double nota1, nota2, nota3, mediaAritmetica, mediaPonderada;

        // Ler notas
        System.out.println("Introduza as notas a seguir: ");

        System.out.println("Nota 1: ");
        nota1 = input.nextDouble();

        System.out.println("Nota 2: ");
        nota2 = input.nextDouble();

        System.out.println("Nota 3: ");
        nota3 = input.nextDouble();

        //Calculo da media Aritmética
        mediaAritmetica = (nota1 + nota2 + nota3) / 3;

        //Calcúlo da media Ponderada

        mediaPonderada = (nota1 * 0.2 + nota2 * 0.3 + nota3 * 0.5);

        // Mostrar resultados
        System.out.println("Média aritmética: " + mediaAritmetica);
        System.out.println("mediaPonderada: " + mediaPonderada);


    }
}
