package FichaExtraVetorMatriz;
import java.util.Scanner;

public class Ex01 {
    static void main() {
        Scanner input = new Scanner(System.in);

        // Escreva um programa que permita adicionar 14 números inteiros a um array e
        // que os imprima pela ordem de inserção.

        //Declaração de array
        int[] numeros = new int[14];

        //Entrada
        for (int i = 0; i < 14; i++ ){
            System.out.print("Digite o número: ");
            numeros[i] = input.nextInt();
        }

        //Mostrar os valores
        for (int i = 0; i < 14; i++){
            System.out.println("Número (" + i + "): " + numeros[i]);
        }
    }
}
