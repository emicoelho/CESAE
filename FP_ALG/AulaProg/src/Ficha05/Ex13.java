package Ficha05;
import java.util.Scanner;

public class Ex13 {
    static void main() {
        Scanner input = new Scanner(System.in);

        //13. Escreva um programa que lê uma matriz de tamanho 4x4 e encontra a soma dos
        //elementos da diagonal principal.

        //Declaração de matriz
        int matriz[][] = new int[4][4];
        int somatorio = 0;

        //Entrada de valores na matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int a = 0; a < matriz[i].length; a++) {
                System.out.println("Número: ");
                matriz[i][a] = input.nextInt();
            }
        }

        //Percorrer as linhas e colunas e printar
        for (int i = 0; i < matriz.length; i++) { //Percorre as LINHAS
            for (int a = 0; a < matriz[i].length; a++) { //Percorre as COLUNAS
                System.out.print(matriz[i][a] + " "); //Acessa o elemento na LINHA e COLUNA
            }
            System.out.println(); // Pula pra próxima linha
        }

        //Fazer a soma da diagonal principal
        for (int i = 0; i < matriz.length; i++) {
            somatorio += matriz[i][i]; //Acedido: matriz[0][0] - matriz[1][1] etc
        }
        System.out.println(somatorio);
    }
}