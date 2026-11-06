package Ficha05;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Escreva um programa que lê um array de tamanho 10 e calcula a média dos
        //elementos.

        //Declaração de array
        int[] numero = new int[10];
        int soma = 0, media;

        //Entrada nas "gavetas"
        for (int i = 0; i < numero.length; i++){
            System.out.print("Numero: ");
            numero[i] = input.nextInt();
        }

        //Soma dos numeros
        for (int i = 0; i < numero.length; i++){
            soma = soma + numero[i];
        }

        //Media
        media = soma/ numero.length;

        // Mostrar a média
        System.out.println("Média: " + media);

    }
}
