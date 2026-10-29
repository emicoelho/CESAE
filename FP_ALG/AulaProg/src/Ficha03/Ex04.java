package Ficha03;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declaração de variável
        int cont = 0, numero;

        //Entrada
        System.out.println("Insira um número: ");
        numero = input.nextInt();

        //Ciclo
        while (cont <= numero){
            System.out.println(cont);
            cont = cont + 1;
        }
    }
}
