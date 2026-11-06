package Ficha05;
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Escreva um programa que lê uma matriz de tamanho 5x5 e imprima a soma de todos os
        // elementos.

        //Declaração da matriz
        int[][] matriz = new int[5][5];

        //Entrada
        for (int i = 0; i < matriz.length; i++){
            for (int a = 0; a < matriz[i].length; a++){
                System.out.print("Número: ");
                matriz[i][a] = input.nextInt();
            }
        }

        //Printar
        for (int i = 0; i < matriz.length; i++){
            for (int a = 0; a < matriz[i].length; a++){
                System.out.print(matriz[i][a] + " ");
            }
            System.out.println();
        }
    }
}
