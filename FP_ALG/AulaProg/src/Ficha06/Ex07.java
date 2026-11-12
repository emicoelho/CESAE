package Ficha06;

import java.util.Scanner;

public class Ex07 {

    public static void imprimirMoldura(String letra, int numeroLinhas, int numeroColunas){
        Scanner input = new Scanner(System.in);

        int matriz [][] = new int[numeroLinhas][numeroColunas];

        //Entrada de valores na matriz
        for (int linhas = 0; linhas < matriz.length; linhas++){
            for (int colunas = 0; colunas < matriz[linhas].length; colunas++){
                if (matriz[numeroLinhas][numeroColunas]){
                    System.out.print(letra + " ");
                }

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int linhas, colunas;
        String letra ;

        System.out.println("Número de linhas: ");
        linhas = input.nextInt();

        System.out.println("Numero de colunas: ");
        colunas = input.nextInt();

        System.out.println("Caracter: ");
        letra = input.next();

        imprimirMoldura(letra, linhas, colunas);
    }
}
