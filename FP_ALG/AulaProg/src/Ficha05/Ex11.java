package Ficha05;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Faça um programa que preencha cada posição de uma matriz
        // (3x3 elementos inteiros) com um valor introduzido pelo
        // utilizador. Deverá indicar qual o maior e qual o menor dos valores guardados na matriz,
        //e deverá imprimir todo o conteúdo da matriz de forma semelhante ao exercício 8.

        //Declaração da matriz
        int matriz[][] = new int[3][3];

        //Entrada
        for (int i=0; i < matriz.length; i++){
            for (int a=0; a < matriz[i].length;a++){
                System.out.println("Número: ");
                matriz[i][a] = input.nextInt();
            }
        }

        //Deve ser inicalizado só após a entrada dos valores da matriz
        int maior = matriz[0][0];
        int menor = matriz[0][0];

        //Percorrer as linhas e colunas e printar
        for (int i=0; i < matriz.length; i++){ //Percorre as LINHAS
            for (int a=0; a < matriz[i].length;a++){ //Percorre as COLUNAS
                System.out.print(matriz[i][a] + " "); //Acessa o elemento na LINHA e COLUNA
            }
            System.out.println(); // Pula pra próxima linha
        }

        //Menor e maior
        for (int i = 0; i < matriz.length; i++) {
            for (int a = 0; a < matriz.length; a++) {
                if (matriz[i][a] > maior) {
                    maior = matriz[i][a];

                }
            }
        }

        for (int i = 0; i < matriz.length; i++){
            for (int a = 0; a < matriz.length; a++){
                if (matriz[i][a] < menor){
                    menor = matriz[i][a];
                }
            }
        }
        System.out.println(maior);
        System.out.println(menor);
    }
}
