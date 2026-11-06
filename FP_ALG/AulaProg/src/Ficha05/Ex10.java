package Ficha05;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Faça um programa que preencha cada posição de uma matriz 3x5 com valores
        //inteiros introduzidos pelo utilizador. Deverá depois ler um outro valor do
        //utilizador e indicar quantos vezes existe na matriz.

        //Declaração da matriz
        int [][] matriz = new int[3][5];

        //Entrada
        for (int i = 0; i < matriz.length; i++){
            for (int a = 0; a <matriz[i].length; a++){
                System.out.print("Número: ");
                matriz[i][a] = input.nextInt();
            }
        }

        //Print da matriz
        for (int i = 0; i < matriz.length; i++){
            for (int a = 0; a < matriz[i].length; a++){
                System.out.println(matriz[i][a] + " ");
            }
            System.out.println();
        }

        //Pedir o valor que o usuário quer pesquisar
        System.out.println("Número para pe");
    }
}
