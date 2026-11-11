package Ficha05;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //2. Escreva um programa que lê dois arrays de tamanho 10 e gera uma matriz 10x2 com
        // os elementos da primeira junto aos elementos da segunda.

        //Declaração de array
        int[] numeros1 = new int[10]; //Array 0 a 9
        int[] numeros2 = new int[10]; //Array 0 a 9

        //Declaração de matriz
        int matriz [][] = new int[10][2];

        //Entrada dos valores dos arrays
        for (int i = 0; i < 10; i++) { //Vai passar por todas as gavetas
            System.out.print("Digite um número: ");
            numeros1 [i] = input.nextInt(); // Vai colocar os números dentro de cada gaveta
        }

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            numeros2 [i] = input.nextInt();
        }

        //Colocar os valores dos arrays na matriz
        for (int i = 0; i < matriz.length; i++) {
            matriz[i][0] = numeros1[i];
            matriz[i][1] = numeros2[i];
        }

        //Printa os valores
        for (int i = 0; i < matriz.length; i++){
            for (int a = 0; a < matriz[i].length; a++){
                System.out.print(matriz[i][a] + " ");
            }
            System.out.println();
        }
    }
}




