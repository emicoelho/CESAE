package Ficha06;

import java.util.Scanner;

public class Ex07 {

    public static void imprimirMoldura(String letra, int numeroLinhas, int numeroColunas) {
        Scanner input = new Scanner(System.in);


        //Entrada de valores na matriz
        for (int linhas = 0; linhas < numeroLinhas; linhas++) {
            for (int colunas = 0; colunas < numeroColunas; colunas++) {

                if (linhas == 0 || linhas == numeroLinhas - 1) { // primeira e última linha
                    System.out.print(letra + " ");
                } else { // linhas do meio

                    if (colunas == 0 || colunas == numeroColunas - 1) {
                        System.out.print(letra + " ");
                    } else {
                        System.out.print(" " + " ");
                    }

                }

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int linhas, colunas;
        String letra;

        System.out.print("Número de linhas: ");
        linhas = input.nextInt();

        System.out.print("Numero de colunas: ");
        colunas = input.nextInt();

        System.out.print("Caracter: ");
        letra = input.next();

        imprimirMoldura(letra, linhas, colunas);
    }
}
