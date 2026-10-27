package Ficha01;

import java.util.Scanner;

public class Exercicio08_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declaração de variavéis
        int minutosLidos, segundosLidos, totalSegundos = 0;

        // Entrada de dados pelo usuário
        System.out.println("Introduza os minutos da música 1: ");
        minutosLidos = input.nextInt();

        System.out.print("Introduza os segundos da música 1: ");
        segundosLidos = input.nextInt();

        totalSegundos = totalSegundos + (minutosLidos * 60) + segundosLidos;

        System.out.println("Introduza os minutos da música 2: ");
        minutosLidos = input.nextInt();

        System.out.print("Introduza os segundos da música 2: ");
        segundosLidos = input.nextInt();

        totalSegundos = totalSegundos + (minutosLidos * 60) + segundosLidos;

        System.out.println("Introduza os minutos da música 3: ");
        minutosLidos = input.nextInt();

        System.out.print("Introduza os segundos da música 3: ");
        segundosLidos = input.nextInt();

        totalSegundos = totalSegundos + (minutosLidos * 60) + segundosLidos;

        System.out.println("Introduza os minutos da música 4: ");
        minutosLidos = input.nextInt();

        System.out.print("Introduza os segundos da música 4: ");
        segundosLidos = input.nextInt();

        totalSegundos = totalSegundos + (minutosLidos * 60) + segundosLidos;

        System.out.println("Introduza os minutos da música 5: ");
        minutosLidos = input.nextInt();

        System.out.print("Introduza os segundos da música 5: ");
        segundosLidos = input.nextInt();

        totalSegundos = totalSegundos + (minutosLidos * 60) + segundosLidos;

        // Calculos de horas, minutos e segundos

        int horas, minutos, segundos;

        horas = totalSegundos / 3600;

        totalSegundos = totalSegundos % 3600;

        minutos = totalSegundos / 60;

        totalSegundos = totalSegundos % 60;

        segundos = totalSegundos;

        // Saida

        System.out.println("Duração total do álbum: " + horas + "h " + minutos + "min e " + segundos);

    }
}
