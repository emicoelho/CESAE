package Ficha05;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Implemente um programa que permita adicionar 9 números inteiros (ler input do utilizador) a uma matriz 3x3
        //e que os imprima com o seguinte aspeto gráfico:
        // 3 8 1
        // 7 4 2
        // 5 1 9

        //Declaração
        int[][] matriz = new int[3][3];

        //Entrada
        for (int i=0; i < matriz.length; i++){
            for (int a=0; a < matriz[i].length;a++){
                System.out.println("Número: ");
                matriz[i][a] = input.nextInt();
            }
        }

        //Percorrer as linhas e colunas e printar
        for (int i=0; i < matriz.length; i++){ //Percorre as LINHAS
            for (int a=0; a < matriz[i].length;a++){ //Percorre as COLUNAS
                System.out.print(matriz[i][a] + " "); //Acessa o elemento na LINHA e COLUNA
            }
            System.out.println(); // Pula pra próxima linha
        }


    }
}
