package Ficha05;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Escreva um programa que lê um array de tamanho 10 e verifica se os elementos
        //estão em ordem crescente.

        //Declaração de array
        int[] numero = new int[10];
        boolean crescente = true;

        //Entrada nas "gavetas"
        for (int i = 0; i < numero.length; i++){
            System.out.print("Número: ");
            numero[i] = input.nextInt();
        }

        //Verificar se estão em ordem crescente
        for (int i = 1; i < numero.length; i++) { //i inicia em 1 pra poder diminuir o 1 do numero[i - 1]
            if (numero[i] <= numero[i - 1]){
                crescente = false;
            }
        }

        if (crescente){
            System.out.println("Crescente");
        }else {
            System.out.println("Decrescente");
        }
    }
}
