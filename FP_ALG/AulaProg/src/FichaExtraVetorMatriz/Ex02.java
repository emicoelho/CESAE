package FichaExtraVetorMatriz;
import java.util.Scanner;

public class Ex02 {
    static void main() {
        Scanner input = new Scanner(System.in);

        //Escreva um programa que permita adicionar 10 números inteiros a um array
        // e que os imprima pela ordem inversa de inserção.

        //Declaração do array
        int[] numeros = new int[10];


        //Entrada
        for (int i = 0; i < 10; i++){
            System.out.print("Digite o número: ");
            numeros[i] = input.nextInt();
        }

        //Mostrar os valores na ordem invertida de inserção
        for (int i = 9; i >= 0; i--){ //Tem que inverter a ordem do for
            System.out.println(numeros[i]);
        }
    }
}
