package Ficha05;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Escreva um programa que lê um array de tamanho 10 e encontra o maior
        // elemento.

        //Declaração array
        int[] numero = new int[10]; //Array de 0 a 9


        //Entrada
        for (int i = 0; i < 10; i++) {
            System.out.print("Numero: ");
            numero[i] = input.nextInt();
        }

        //Declaração após a inserção dos números. Não pode inicializar antes
        //de colocar os números.
        int aux = numero[0];

        //Descobrir maior elemento
        for (int i = 0; i < 10; i++) {
            if (aux < numero[i]) {
                aux = numero[i];
            }
        }

        //Mostrar o maior
        System.out.println("Maior número: " + aux);
    }
}