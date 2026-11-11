package Ficha05;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Implemente um programa que permita adicionar 10
        // números inteiros a um array e que os imprima pela
        // ordem de inserção.

        //Declaração de variáveis (ARRAY)
        int[] numeros = new int[10]; //Array de 0 a 9

        //Adicionar os números
        for (int i = 0; i < 10; i++){ //Vai passar por todas as "gavetas"
            System.out.print("Digite um número: "); // Vai pedir os números 10x
            numeros [i] = input.nextInt(); // Vai colocar os números dentro de cada gaveta
        }

        //Mostrar os números pela ordem
        for (int i = 0; i < 10; i++){
            System.out.println("Número (" + i +"):" + numeros[i]);
        }
    }
}
