package Ficha05;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Escreva um programa que lê um array de tamanho 10 e encontra o
        //menor elemento.

        //Declaração do array
        int[] numero = new int[10];

        //Entrada nas gavetas
        for (int i = 0; i < 10; i++){
            System.out.print("Número: ");
            numero[i] = input.nextInt();
        }

        //Declaração após a inserção dos números. Não pode inicializar antes
        //de colocar os números.
        int aux = numero[0];

        //Descobrir o menor elemento
        for (int i = 0; i < 10; i++){
            if (aux > numero[i]){
                aux = numero[i];
            }
        }

        //Mostrar o menor
        System.out.println("Menor: " + aux);
    }
}
