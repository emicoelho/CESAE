package Ficha03;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero = 0, soma = 1, cont= -1, media;

        while(numero != -1){
            System.out.println("Digite um número: ");
            numero = input.nextInt();
            System.out.println(numero);

            soma = soma + numero;

            cont++;

        }

        media = soma  / cont;

        System.out.println(media);

    }
}
