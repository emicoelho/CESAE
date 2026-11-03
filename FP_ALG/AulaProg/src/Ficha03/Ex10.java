package Ficha03;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declaração
        int numero, cont = 2;

        //Entrada
        System.out.println("Digite um número: ");
        numero = input.nextInt(); //10

        while(cont <= numero){
            System.out.println(cont);
            cont+=2;
        }
    }
}
